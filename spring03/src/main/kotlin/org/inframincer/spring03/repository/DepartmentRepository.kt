package org.inframincer.spring03.repository

import org.inframincer.spring03.domain.Department
import org.springframework.data.jpa.repository.JpaRepository

interface DepartmentRepository : JpaRepository<Department, Int>
