package org.inframincer.spring03.domain

import lombok.Getter
import lombok.Setter
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "employee")
@Getter
@Setter
class Employee {
    @Id
    var empno: Int? = null
        set(empno) {
            field = this.empno
        }

    @Column(length = 10)
    var name: String? = null
        set(name) {
            field = this.name
        }

    @Column(length = 9)
    var job: String? = null
        set(job) {
            field = this.job
        }

    @ManyToOne
    @JoinColumn(name = "boss")
    var boss: Employee? = null
        set(boss) {
            field = this.boss
        }

    @Column(length = 12)
    var hiredate: String? = null
        set(hiredate) {
            field = this.hiredate
        }

    var salary: Double? = null
        set(salary) {
            field = this.salary
        }

    var comm: Double? = null
        set(comm) {
            field = this.comm
        }

    @ManyToOne
    @JoinColumn(name = "deptno")
    var department: Department? = null
        set(department) {
            field = this.department
        }

    override fun toString(): String {
        return "Employee(empno=$empno, " +
            "name=$name, " +
            "job=$job, " +
            "boss=$boss, " +
            "hiredate=$hiredate, " +
            "salary=$salary, " +
            "comm=$comm, " +
            "department=$department)"
    }
}
