package com.udea.ParcialEquipo1.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Registro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="codigo")
    private Integer codigo;

    @ManyToOne
    @JoinColumn(name="cedula_paciente", referencedColumnName = "cc")
    private Paciente cedulaPaciente;

    @Column(name="nombre_doctor", nullable = false, length = 80)
    private @NonNull String nombreDoctor;

    @Column(name="fecha_creacion", nullable = false, length = 80)
    private @NonNull Date fechaCreacion;

    @Column(name="diagnostico", nullable = false, length = 300)
    private @NonNull String diagnostico;
}
