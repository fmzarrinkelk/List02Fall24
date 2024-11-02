package edu.fullerton.fz.cs411.list02

import java.util.UUID

data class Person(var id: UUID = UUID.randomUUID()) {
    var name = ""
    var age = 0
    var isStudent = false
}
