package com.vitornms45.bancoVerdinho.bancoVerdinho.domain.transaction;

import com.vitornms45.bancoVerdinho.bancoVerdinho.domain.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name = "transactions")
@Table(name = "transactions")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal amount;

    @ManyToOne
    @JoinColumn(name = "pagador_id")
    private User Pagador;

    @JoinColumn(name = "recebedor_id")
    @ManyToOne
    private User Recebedor;

    private LocalDateTime dataTransacao;
}
