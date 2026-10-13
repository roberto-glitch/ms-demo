package com.demo.domain.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@Entity
public class UserDO {
    @Id
    private String id;
    private String nome;
    private String cognome;
}
