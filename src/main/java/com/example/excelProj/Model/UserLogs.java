package com.example.excelProj.Model;

import javax.persistence.*;

@Entity
@Table(name = "userlogs")
public class UserLogs {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column
    private String email;
    @Column
    private String name;
    @Column
    private String updatedBy;
    @Column
    private String deletedBy;

    public UserLogs(String email, String name, String updatedBy, String deletedBy) {
        this.email = email;
        this.name = name;
        this.updatedBy = updatedBy;
        this.deletedBy = deletedBy;
    }

    public UserLogs() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }
}
