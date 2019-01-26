package org.inframincer.spring03.domain

import lombok.Getter
import lombok.Setter
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "salarygrade")
@Getter
@Setter
class SalaryGrade {
    @Id
    var grade: Int? = null
        set(grade) {
            field = this.grade
        }
    var losal: Int? = null
        set(losal) {
            field = this.losal
        }
    var hisal: Int? = null
        set(hisal) {
            field = this.hisal
        }
}
