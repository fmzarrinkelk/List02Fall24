package edu.fullerton.fz.cs411.list02

import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {

    val people = mutableListOf<Person>()

    init {
        for (i in 0 until 100) {
            val person = Person()
            person.name = "Frank $i"
            person.age = 18 + i
            person.isStudent = (person.age % 5 == 0)

            people += person
        }
    }
}