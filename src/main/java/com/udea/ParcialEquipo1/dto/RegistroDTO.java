package com.udea.ParcialEquipo1.dto;

import com.udea.ParcialEquipo1.Entity.Paciente;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Data
public class RegistroDTO {
    private Long cedulaPaciente;
    private String nombreDoctor;
    private Date fechaCreacion;
    private String diagnostico;
}
