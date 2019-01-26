package org.inframincer.spring03.repository

import org.inframincer.spring03.domain.Employee
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface EmployeeRepository : JpaRepository<Employee, Int> {

    @Query("select e from Employee e inner join fetch e.department order by e.empno")
    fun getEmployee(): List<Employee>
}
