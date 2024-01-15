package com.xproce.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Getter
@Setter

public class customer {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)

    private Long  id ;
    private String username ;
    private String authority;
    private String Email;
    private String password;
    private String role;
}
