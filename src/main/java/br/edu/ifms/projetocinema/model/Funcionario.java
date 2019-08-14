package br.edu.ifms.projetocinema.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity


public class Funcionario extends Pessoa {
    private LocalDate dtAdmissao;
    private double salario;
    private String funcao;

}
