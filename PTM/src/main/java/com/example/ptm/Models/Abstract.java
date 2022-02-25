package com.example.ptm.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Getter
@Setter
public class Abstract {
    @Id
    @GeneratedValue

    private Long Id;
}
