package net.javamen.go.pro.model;


import  javax.persistence.*;

@Entity
@Table(name = "developers")
public class Developer {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "developer_name")
    private String developerName;
    @Column(name = "experience")
    private int experience;
    @Column(name = "salary")
    private int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", developerName='" + developerName + '\'' +
                ", experience=" + experience +
                ", salary=" + salary +
                '}';
    }

}
