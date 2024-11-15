package br.com.fiap;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.Set;

@Entity
@Data
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;

    @Temporal(TemporalType.DATE)
    private Date dataCadastro;

    @ManyToMany(mappedBy = "alunos")
    private Set<Curso> cursos;
}
