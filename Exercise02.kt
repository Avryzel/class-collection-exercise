/*
    Exercise 2

    Task:

    - Create a data class called Note with a title and content.
    - Add an extension property to Note called preview that returns the first 10 characters of the content plus "..." if the content is longer than 10 characters.
    - Create a list of at least 3 Note objects with different content lengths.
    - Loop through the list and print each note’s title and its preview.
*/

data class Note(
    val title: String,
    val content: String
)

val Note.preview: String
    get() = if (content.length > 10) {
        content.substring(0, 10) + "..."
    } else {
        content
    }

fun main() {
    val noteList = mutableListOf(
        Note(
            title = "Shopping List",
            content = "Eggs, chicken, bread, butter, milk, beef"
        ),
        Note(
            title = "Reminder",
            content = "Easy run"
        ),
        Note(
            title = "Learning Tips",
            content = "Don't rush it, take it slow."
        )
    )

    noteList.forEach {
        println("${it.title}: ${it.preview}")
    }
}