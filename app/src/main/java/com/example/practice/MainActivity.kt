package com.example.practice

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val longestWord = findLongestWord(listOf("cat", "dog", "elephant", "abracadabra", null))
        Log.d("Task 1", longestWord.toString())

        val testWord = "qwe rt"
        Log.d("Task 2", testWord.formatName().toString())

        val countUniq = countUniqueWords(listOf("hello  world", "hello"))
        Log.d("Task 3", countUniq.toString())

        Log.d("Task 4", groupUsersByAge(listOf(
            User("Гоги", 25, "gogi@mail.com"),
            User("Вася", 18, "vas@mail.com"),
            User("Qwert", 25, null))).toString())

        Log.d("Task 5",  averageNonNullDescending(listOf(1, 5, null, 10, 3)).toString())
        Log.d("Task 6",  filterAndFormatEmails(listOf(
            User("Aswq", 20, "aswq@mail.com"),
            User("Qwert", 17, "qwert@mail.com"),
            User("Vgfd", 30, null)
        )).toString())

        Log.d("Task 7", checkList(listOf(1, 2, 3, 4)).toString())
        Log.d("Task 7", checkList(listOf(1, -2, 3, 4)).toString())

        Log.d("Task 8", removeDuplicatesAndSort(listOf(5, 1, 2, 5, 3, 1)).toString())
        Log.d("Task 9", studentsAboveAverage(mapOf(
            "Bob" to 85,
            "Олег" to 75,
            "Ира" to 95
        )).toString())

        Log.d("Task 10", mergeListsUniqueSorted(
            listOf("яблоко", "банан", "груша"),
            listOf("банан", "киви")
        ).toString())
        
        Log.d("Task 11", printIfLong("клавиатура").toString())


    }
}