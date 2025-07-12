/*
    Exercise 1

    Task:

    - Create a data class called Task with title, priority (as an enum class with values LOW, MEDIUM, HIGH), and duration in minutes.
    - Create a list of at least 5 Task objects with different priorities and durations.
    - Use groupBy to group the tasks by priority.
    - Use forEach to print how many tasks there are for each priority.

    Bonus: Print the titles of the tasks for each group.
 */

data class Task (
    val title: String,
    val priority: Priority,
    val durationInMinutes: Int
)

enum class Priority {
    LOW,
    MEDIUM,
    HIGH
}

fun main() {
    val listTask = mutableListOf(
        Task(
            title = "Morning stretch",
            priority = Priority.LOW,
            durationInMinutes = 10
        ),
        Task(
            title = "Morning run",
            priority = Priority.LOW,
            durationInMinutes = 30
        ),
        Task(
            title = "Learn Jetpack Compose",
            priority = Priority.HIGH,
            durationInMinutes = 60
        ),
        Task(
            title = "Learn Japanese language",
            priority = Priority.MEDIUM,
            durationInMinutes = 45
        ),
        Task(
            title = "Write a journal",
            priority = Priority.MEDIUM,
            durationInMinutes = 15
        )
    )

    val groupedTask = listTask.groupBy { it.priority }

    groupedTask.forEach { (priority, listTask) ->
        println("$priority: ${listTask.size} tasks.")
    }
}