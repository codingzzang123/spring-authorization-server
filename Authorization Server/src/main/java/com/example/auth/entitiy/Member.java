package com.example.auth.entitiy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Entity
@NoArgsConstructor
public class Member implements Serializable {

    @Id
    @GeneratedValue
    Long id;

    String name;
    String username;
    String remark;

    public Member (String name, String username, String remark){
        this.name = name;
        this.username = username;
        this.remark = remark;
    }
}
