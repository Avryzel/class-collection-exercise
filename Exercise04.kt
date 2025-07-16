/*
    Exercise 4

    Task:

    - Create a data class called Product with name, price (Double), and inStock (Boolean).
    - Create a list of at least 5 Product objects with different prices and stock statuses.
    - Use filter to create a list of products that are in stock.
    - Use map to create a list of just the names of the in-stock products.
    - Print the list of names.
*/

data class Product(
    val name: String,
    val price: Double,
    val inStock: Boolean
)

fun main() {
    val productList = mutableListOf(
        Product(
            name = "Laptop Lenovo",
            price = 1200.0,
            inStock = false
        ),
        Product(
            name = "Wireless Mouse",
            price = 25.0,
            inStock = false
        ),
        Product(
            name = "Xiaomi Monitor",
            price = 300.0,
            inStock = false
        ),
        Product(
            name = "Moondrop IEM",
            price = 500.0,
            inStock = true
        ),
        Product(
            name = "Mechanical Keyboard",
            price = 250.0,
            inStock = true
        )
    )

    val inStockProduct = productList.filter { it.inStock }

    val inStockList = inStockProduct.map { it.name }

    println("Product in stock:")
    inStockList.forEach {
        println(it)
    }
}