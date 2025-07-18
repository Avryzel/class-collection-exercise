/*
    Exercise 6

    Task:

    - Reuse your Product data class (from Exercise 4).
    - Create a list of at least 5 Product objects.
    - Sort the list by price (from lowest to highest).
    - Print each product name and its price.
*/

data class Products(
    val name: String,
    val price: Double,
)

fun main() {
    val productList = mutableListOf(
        Products(
            name = "Laptop Lenovo",
            price = 1200.0,
        ),
        Products(
            name = "Wireless Mouse",
            price = 100.0,
        ),
        Products(
            name = "Xiaomi Monitor",
            price = 300.0,
        ),
        Products(
            name = "Moondrop IEM",
            price = 500.0,
        ),
        Products(
            name = "Mechanical Keyboard",
            price = 250.0,
        )
    )

    val sortedList = productList.sortedBy { it.price }

    println("Product list:")
    sortedList.forEach {
        println("${it.name} - ${it.price}")
    }
}