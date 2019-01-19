package org.inframincer.spring03.domain

import lombok.Getter
import lombok.Setter
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "department")
@Getter
@Setter
class Department {
    @Id
    var deptno: Int? = null
        set(deptno) {
            field = this.deptno
        }

    @Column(length = 14)
    var name: String? = null
        set(name) {
            field = this.name
        }

    @Column(length = 13)
    var location: String? = null
        set(location) {
            field = this.location
        }
}
