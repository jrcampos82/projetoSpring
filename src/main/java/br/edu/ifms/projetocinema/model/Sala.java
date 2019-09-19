package br.edu.ifms.projetocinema.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Sala {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numSala;
    private String tipoSala; // normal, 3d ou vip
    @ManyToOne(fetch = FetchType.EAGER)
    private Filme filme;
    @OneToMany
    private List<Assento> assentos;

}
