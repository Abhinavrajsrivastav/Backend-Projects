package io.abhinav.Employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee {
    @Column(name = "employee_name")
    private String name;
    @Id
    private int id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cardId")
    private EmployeeIdCard employeeIdCard;

    // Getter and setter for employeeIdCard
    public EmployeeIdCard getEmployeeIdCard() {
        return employeeIdCard;
    }

    public void setEmployeeIdCard(EmployeeIdCard employeeIdCard) {
        this.employeeIdCard = employeeIdCard;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + "]";
    }
}
