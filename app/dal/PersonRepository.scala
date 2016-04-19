package dal

import javax.inject.{ Inject, Singleton }
import play.api.db.slick.DatabaseConfigProvider
import slick.driver.JdbcProfile
import models.Ticket
import scala.concurrent.{ Future, ExecutionContext }
//import sun.security.krb5.internal.Ticket
import models._

/**
 * A repository for people.
 *
 * @param dbConfigProvider The Play db config provider. Play will inject this for you.
 */
@Singleton
class PersonRepository @Inject() (dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  // We want the JdbcProfile for this provider
  private val dbConfig = dbConfigProvider.get[JdbcProfile]

  // These imports are important, the first one brings db into scope, which will let you do the actual db operations.
  // The second one brings the Slick DSL into scope, which lets you define the table and other queries.
  import dbConfig._
  import driver.api._

  /**
   * Here we define the table. It will have a name of people
   */
  private class TicketTable(tag: Tag) extends Table[Ticket](tag, "tickets") {

    /** The ID column, which is the primary key, and auto incremented */
    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)

    /** The name column */
    def name = column[String]("name")

    /** The tickets column */
    def ticketsCount = column[Int]("ticketsCount")
    
    /** The title column */
    def title = column[String]("title")

    /**
     * This is the tables default "projection".
     *
     * It defines how the columns are converted to and from the Person object.
     *
     * In this case, we are simply passing the id, name and page parameters to the Person case classes
     * apply and unapply methods.
     */
    def * = (id, name, ticketsCount, title) <> ((Ticket.apply _).tupled, Ticket.unapply)
  }

  
   /**
   * Here we define the table. It will have a name of people
   */
  private class MovieTable(tag: Tag) extends Table[Movie](tag, "movies") {

    /** The ID column, which is the primary key, and auto incremented */
    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
    
        /** The name column */
    def name = column[String]("name")

    /** The totalSeats column */
    def totalSeats = column[Int]("totalSeats")
    
    
    /**
     * This is the tables default "projection".
     *
     * It defines how the columns are converted to and from the Person object.
     *
     * In this case, we are simply passing the id, name and page parameters to the Person case classes
     * apply and unapply methods.
     */
    def * = (id, name, totalSeats) <> ((Movie.apply _).tupled, Movie.unapply)
  }
  
  /**
   * The starting point for all queries on the people table.
   */
  private val movies = TableQuery[MovieTable]
  
  private val tickets = TableQuery[TicketTable]
  
 
                  

  /**
   * Create a person with the given name and age.
   *
   * This is an asynchronous operation, it will return a future of the created person, which can be used to obtain the
   * id for that person.
   */
//   def create(name: String, age: Int): Future[Person] = db.run {
//     // We create a projection of just the name and age columns, since we're not inserting a value for the id column
//     (people.map(p => (p.name, p.age))
//       // Now define it to return the id, because we want to know what id was generated for the person
//       returning people.map(_.id)
//       // And we define a transformation for the returned value, which combines our original parameters with the
//       // returned id
//       into ((nameAge, id) => Person(id, nameAge._1, nameAge._2))
//     // And finally, insert the person into the database
//     ) += (name, age)
//   }

  /**
   * List all the people in the database.
   */
//   def list(): Future[Seq[Person]] = db.run {
//     people.result
//   }
  
//   tickets
  
  def addTicket(name: String, ticketsCount: Int, title: String): Future[Ticket] = db.run {
    // We create a projection of just the name and age columns, since we're not inserting a value for the id column
    (tickets.map(p => (p.name, p.ticketsCount, p.title))
      // Now define it to return the id, because we want to know what id was generated for the person
      returning tickets.map(_.id)
      // And we define a transformation for the returned value, which combines our original parameters with the
      // returned id
      into ((nameAge, id) => Ticket(id, nameAge._1, nameAge._2, nameAge._3))
    // And finally, insert the person into the database
    ) += (name, ticketsCount, title)
  }

  /**
   * List all the people in the database.
   */
  def listTickets(): Future[Seq[Ticket]] = db.run {
    tickets.result
  }
  
  
  /**
   * List all the people in the database.
   */
  def listMovies(): Future[Seq[Movie]] = db.run {
    movies.result
  }
  
  def findTicket(id: String):Future[Seq[Ticket]] = db.run{
     val res = tickets.result.map{x => x.filter (_.id.toString() == id)}
     play.api.Logger.info(res.toString())
     res
  }
  
  def cancelTicket(id:Long) = db.run{
    val q = tickets.where { ticket => ticket.id === id}
      q.delete
    
    
  }
  
  
  def addMovie(name: String, totalSeats: Int): Future[Movie] = db.run {
    // We create a projection of just the name and age columns, since we're not inserting a value for the id column
    (movies.map(p => (p.name, p.totalSeats))
      // Now define it to return the id, because we want to know what id was generated for the person
      returning movies.map(_.id)
      // And we define a transformation for the returned value, which combines our original parameters with the
      // returned id
      into ((movie, id) => Movie(id, movie._1, movie._2))
    // And finally, insert the person into the database
    ) += (name, totalSeats)
  }
}

