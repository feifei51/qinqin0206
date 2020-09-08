package com.qf.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "tb_user")
public class User {
    @Id
    private Integer id;
    @Column(name = "name")
    private String name;

    private String pass;

    private String email;

    private String code;

}
