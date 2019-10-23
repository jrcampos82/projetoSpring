package br.edu.ifms.projetocinema.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min = 2, message = "O título deve ter pelo menos 10 caracteres!")
    private String titulo;
    private LocalTime duracao;

    private String genero;
    private int classificacao; // 0 free e 5 adulto

}
