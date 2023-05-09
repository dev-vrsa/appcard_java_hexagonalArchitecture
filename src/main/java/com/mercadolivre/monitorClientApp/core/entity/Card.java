package com.mercadolivre.monitorClientApp.core.entity;

import lombok.*;

import javax.persistence.*;
@Entity
@Getter
@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String numeroCartao;
    private String senha;
    private Double saldo;
    private CardType cardType;





}
