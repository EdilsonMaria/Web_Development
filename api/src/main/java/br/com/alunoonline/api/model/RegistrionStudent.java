package br.com.alunoonline.api.model;

import br.com.alunoonline.api.enums.MatriculaAlunoStatusEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class RegistrionStudent implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double grade1;

    private Double grade2;

    @ManyToOne
    @JoinColumn(name="student_id") //trazendo o Aluno como chave estrangeira na tabela MatriculaAluno
    private Student student;

    @ManyToOne //dizendo que muitas MatriculasAluno estão para uma Disciplina
    @JoinColumn(name="subject_id") //trazendo a Disciplina como chave estrangeira na tabela MatriculaAluno
    private Subject subject;

    @Enumerated(EnumType.STRING)
    private MatriculaAlunoStatusEnum status;

}

