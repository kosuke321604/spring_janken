package com.example.janken.entitity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "jankenhouses")
@Data

public class JankenHouse {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "janken_myself")
    private String jankenMyself;

    @Column(name = "janken_pc")
    private String jankenPc;

    @Column(name = "result")
    private String result;

    @Column(name = "memo")
    private String memo;

}
