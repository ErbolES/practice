package com.example.practice

fun findLongestWord(words: List<String?>): String? {
    return words.filterNotNull().maxByOrNull { it.length }
}

fun String?.formatName(): String {
    return this?.trim()?.replace(" ", "")?.lowercase()?.replaceFirstChar { it.uppercase() } ?: ""
}

fun countUniqueWords(words: List<String>): Int {
    return words.toSet().size
}

data class User(val name: String?, val age: Int?, val email: String?)
fun groupUsersByAge(users: List<User>): Map<Int, Int> {
    return users.filter { it.age != null }
        .groupingBy { it.age!! }
        .eachCount()
}

fun averageNonNullDescending(numbers: List<Int?>): Double {
    val filtered = numbers.filterNotNull().sortedDescending()
    return if (filtered.isNotEmpty()) filtered.average() else 0.0
}

fun User.isAdult(): Boolean {
    return this.age != null && this.age >= 18
}
fun filterAndFormatEmails(users: List<User>): List<String> {
    return users.filter { it.isAdult() && it.email != null }
        .map { it.email!!.uppercase() }
}

fun checkList(numbers: List<Int>): Pair<Boolean, Boolean> {
    val allPositive = numbers.all { it > 0 }
    val anyEven = numbers.any { it % 2 == 0 }
    return allPositive to anyEven
}

fun removeDuplicatesAndSort(list: List<Int>): List<Int> {
    return list.toSet().sorted()
}

fun studentsAboveAverage(grades: Map<String, Int>): List<String> {
    val average = grades.values.average()
    return grades.filter { it.value > average }.keys.toList()
}

fun mergeListsUniqueSorted(list1: List<String>, list2: List<String>): List<String> {
    return (list1 + list2).toSet().sorted()
}

fun printIfLong(s: String?) {
    s?.let {
        if (it.length > 5) println(it.uppercase())
    }
}