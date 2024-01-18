package uz.temur.usingmongodbkotindriver.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Student (
    @Id
    val id: String?,
    val name: String,
    val age: Int,
    val course: Int,
    val direction: String
)