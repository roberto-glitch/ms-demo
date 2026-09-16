package com.demo.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDO {
    private String id;
    private String nome;
    private String cognome;
}
