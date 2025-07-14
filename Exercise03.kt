/*
    Exercise 3

    Task:

    - Create a User data class with name and age.
    - Create a list of at least 5 User objects with different ages.
    - Use filter to create a new list that contains only users who are 18 years old or older.
    - Print the names of the adult users.
*/

data class User(
    val name: String,
    val age: Int
)

fun main() {
    val userList = mutableListOf(
        User(
            name = "Mas Rusdi",
            age = 20
        ),
        User(
            name = "Si Imut",
            age = 21
        ),
        User(
            name = "Lil bro",
            age = 15
        ),
        User(
            name = "Kiddo",
            age = 17
        ),
        User(
            name = "Mas Amba",
            age = 26
        )
    )

    val adultUser = userList.filter { it.age >= 18 }

    println("Adult User:")
    adultUser.forEach {
        println(it.name)
    }
}