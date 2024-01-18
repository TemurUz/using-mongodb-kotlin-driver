package uz.temur.usingmongodbkotindriver.repository

import org.springframework.data.mongodb.repository.MongoRepository
import uz.temur.usingmongodbkotindriver.model.Student

interface StudentRepository: MongoRepository<Student, String>