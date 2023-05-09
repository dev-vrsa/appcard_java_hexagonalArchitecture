package com.mercadolivre.monitorClientApp.core.entity;

import lombok.*;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.br.CPF;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;



@Entity
@Getter
@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Consumer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column
    @NotNull
    private String name;

    @CPF
    @Column
    @NotNull
    private String cpf;

    @Email
    @Column
    @NotNull
    private String email;


    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name= "consumidor_id")
    private Set<Card> cardList;
}
