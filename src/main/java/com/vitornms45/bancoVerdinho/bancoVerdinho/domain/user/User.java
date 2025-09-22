package com.vitornms45.bancoVerdinho.bancoVerdinho.domain.user;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@Entity(name = "users")
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeCompleto;

    @Column(unique = true)
    private String cPF;

    @Column(unique = true)
    private String email;

    private String senha;
    private BigDecimal balance;

    @Enumerated(EnumType.STRING)
    private UserType usertype;

}
