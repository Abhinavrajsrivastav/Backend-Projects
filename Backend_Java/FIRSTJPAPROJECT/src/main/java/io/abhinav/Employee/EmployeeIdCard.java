package io.abhinav.Employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class EmployeeIdCard {

    @Id
    private int cardId;
    @Column(name = "job_location")
    private String jobLocation;
    

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "Employee")
    @JoinColumn(name = "id")
    private Employee employee;



    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public Employee getEmployee() {
        return employee;
    }



    public void setCardId(int cardId) {
        this.cardId = cardId;
    }
    public int getCardId() {
        return cardId;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }
    public String getJobLocation() {
        return jobLocation;
    }

    @Override
    public String toString() {
        return "EmployeeIdCard [cardId=" + cardId + ", jobLocation=" + jobLocation + "]";
    }
}
