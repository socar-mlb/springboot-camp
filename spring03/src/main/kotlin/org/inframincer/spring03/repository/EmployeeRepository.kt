package org.inframincer.spring03.repository

import org.inframincer.spring03.domain.Employee
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param


interface EmployeeRepository : JpaRepository<Employee, Int> {

    @Query("select e from Employee e inner join fetch e.department order by e.empno")
    fun getEmployee(): List<Employee>

    @Query("select e from Employee e left join fetch e.boss inner join fetch e.department where e.empno = :id")
    fun getEmployeeById(@Param("id") id: Int?): Employee
}
