/*
    Exercise 5

    Task:

    - Create a data class called Student with name and scores (List<Int>).
    - Create a list of at least 4 Student objects with different sets of scores.
    - Use map to create a list of average scores for each student.
    - Use forEach to print each student's name and their average score.
*/

data class Student(
    val name: String,
    val scores: List<Int>
)

fun main() {
    val studentList = listOf(
        Student("Jabib", listOf(45, 30, 40)),
        Student("Je", listOf(45, 75, 80)),
        Student("Wir", listOf(65, 78, 45)),
        Student("San", listOf(75, 80, 55))
    )

    val averageList = studentList.map { it.scores.average() }

    println("Student list:")
    studentList.forEachIndexed { index, student ->
        println("${student.name} - Average: ${averageList[index]}")
    }
}