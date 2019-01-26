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
    fun `test_find_all`() {
        employeeRepository.findAll().forEach {
            println(it)
        }
    }

    @Test
    fun `test_get_employee`() {
        employeeRepository.getEmployee().forEach {
            println(it)
        }
    }
}
