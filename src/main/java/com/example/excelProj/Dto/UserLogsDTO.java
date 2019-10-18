package com.example.excelProj.Dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class UserLogsDTO {

    private Long id;
    private String email;
    private String name;

    private String updatedBy;
    private String deletedBy;

    public UserLogsDTO(Long id, String email, String name, String updatedBy, String deletedBy) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.updatedBy = updatedBy;
        this.deletedBy = deletedBy;
    }

    public UserLogsDTO() {
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
