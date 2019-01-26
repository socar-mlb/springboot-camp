package org.inframincer.spring03.repository

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@DataJpaTest // include @Transactional
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class EmployeeRepositoryTest {

    @Autowired
    lateinit var employeeRepository: EmployeeRepository

    @Test
    fun `findAll`() {
        employeeRepository.findAll().forEach {
            println(it)
        }
    }

    @Test
    fun `getEmployee`() {
        employeeRepository.getEmployee().forEach {
            println(it)
        }
    }

    @Test
    fun `findById`() {
        val employee = employeeRepository.findById(7369)
        println(employee)
    }

    @Test
    fun `getEmployeeById`() {
        val employee = employeeRepository.getEmployeeById(7369)
        println(employee)
    }
}
