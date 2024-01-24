package data

object Model {
  case class User(id: Int, name: String, email: String, password: String)
  case class Account(id: Int, name: String, subscription: String, upstream: Option[Int])
  case class UserAccount(id: Int, user: Int, account: Int, active: Boolean, downstreamAccess: Boolean)

  val users = Seq(
    User(1, "Alice", "alice@example.com", "alice123"),
    User(2, "Bob", "bob@example.com", "bob123"),
    User(3, "Charlie", "charlie@example.com", "charlie123"),
    User(4, "Diana", "diana@example.com", "diana123"),
    User(5, "Ethan", "ethan@example.com", "ethan123"),
    User(6, "Fiona", "fiona@example.com", "fiona123"),
    User(7, "George", "george@example.com", "george123"),
    User(8, "Hannah", "hannah@example.com", "hannah123"),
    User(9, "Ian", "ian@example.com", "ian123"),
    User(10, "Julia", "julia@example.com", "julia123")
  )

  val accounts = Seq(
    Account(1, "Account1", "Premium", None),
    Account(2, "Account2", "Premium", None),
    Account(3, "Account3", "Standard", Some(1)),
    Account(4, "Account4", "Standard", Some(1)),
    Account(5, "Account5", "Standard", Some(1)),
    Account(6, "Account6", "Standard", Some(2)),
    Account(7, "Account7", "Standard", Some(2)),
    Account(8, "Account8", "Standard", Some(2)),
    Account(9, "Account9", "Standard", None),
    Account(10, "Account10", "Standard", None)
  )

  val userAccounts = Seq(
    UserAccount(1, 1, 1, true, true),
    UserAccount(2, 2, 3, true, false),
    UserAccount(3, 3, 1, true, false),
    UserAccount(4, 4, 6, true, true),
    UserAccount(5, 5, 2, true, true),
    UserAccount(6, 6, 7, false, false),
    UserAccount(7, 7, 9, true, false),
    UserAccount(8, 8, 5, true, false),
    UserAccount(9, 9, 10, true, false),
    UserAccount(10, 10, 4, true, false)
  )

  case class Environment(users: Seq[User], accounts: Seq[Account], userAccounts: Seq[UserAccount])

  val environment = Environment(users, accounts, userAccounts)
}
