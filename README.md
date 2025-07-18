# 📚 More Kotlin Fundamentals

This repo contains small, focused exercises with clear tasks, solutions, and explanations.

---

## 📘 Exercise 1 — Group Tasks by Priority

**✅ Task:**  
- Create a `Task` data class with a `Priority` enum (`LOW`, `MEDIUM`, `HIGH`).
- Add a list of tasks with different priorities and durations.
- Group tasks by priority using `groupBy` and display how many tasks are in each group.
- **Bonus:** Print the titles of each task in the group.

---

**💡 Concepts practiced:**  
- `data class` and `enum class`
- Using `groupBy` to categorize a list by a property
- Using `forEach` to iterate over grouped data
- Basic use of collections (`List`)

---

## 📘 Exercise 2 — Note Preview with Extension Property

**✅ Task:**
- Create a Note data class with title and content.
- Add an extension property called preview that shows the first 10 characters of the content plus ... if the content is longer than 10 characters.
- Create a list of at least 3 Note objects with different content lengths.
- Loop through the list and print each note’s title and its preview.

---

**💡 Concepts practiced:**  
- How to write an extension property for a data class.
- How to use substring() safely with length checks.
- Using forEach to print data cleanly.
- Simple immutable/mutable lists for storing objects.

---

## 📘 Exercise 3 — Filter Adult Users

**✅ Task:**
- Create a `User` data class with `name` and `age`.
- Add a list of at least 5 `User` objects with different ages.
- Use `filter` to keep only users who are 18 years old or older.
- Print the names of the adult users.

**💡 Concepts practiced:**
- Using `filter` to extract data based on conditions.
- Looping through a filtered list with `forEach`.
- Simple list creation with `mutableListOf`.

---

## 📘 Exercise 4 — Filter and Map In-Stock Products

**✅ Task:**
- Create a `Product` data class with `name`, `price` (Double), and `inStock` (Boolean).
- Create a list of at least 5 products with different prices and stock statuses.
- Use `filter` to create a list of products that are in stock.
- Use `map` to create a list of just the names of the in-stock products.
- Print the list of names.

**💡 Concepts practiced:**
- Filtering lists using `filter`.
- Transforming lists using `map`.
- Combining `filter` and `map` for clean, functional-style code.
- Good use of `forEach` for printing.

---

## 📘 Exercise 5 — Average Student Scores

**✅ Task:**
- Create a `Student` data class with `name` and `scores (List<Int>)`.
- Add a list of 4 students with different score sets.
- Use `map` to calculate the average score of each student.
- Use `forEach` to print each student's name and their average score.

**💡 Concepts practiced:**
- `data class`
- `List` and `List.average()`
- `map` for transforming data
- `forEachIndexed` to access both item and index

---
