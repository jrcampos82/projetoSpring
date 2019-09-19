package br.edu.ifms.projetocinema.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Sessao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalTime horario;
    private String sala;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Cliente> clientes;
    @OneToOne
    private Filme filme;

}
