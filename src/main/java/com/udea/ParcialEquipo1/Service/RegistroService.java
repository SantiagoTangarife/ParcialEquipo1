package com.udea.ParcialEquipo1.Service;

import com.udea.ParcialEquipo1.Entity.Paciente;
import com.udea.ParcialEquipo1.Exception.PacienteNotFoundException;
import com.udea.ParcialEquipo1.Repository.IRegistroRepository;
import com.udea.ParcialEquipo1.dto.RegistroDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.udea.ParcialEquipo1.Entity.Registro;
import java.util.List;

@Service
public class RegistroService {
    @Autowired
    IRegistroRepository registroRepository;
    @Autowired
    PacienteService service;
    public ResponseEntity<List<Registro>> getRegistrosByCedula(Long cedula){
        ResponseEntity<Paciente> cedulaPaciente = service.findById(cedula);
        List<Registro> registros = registroRepository.findAllByCedulaPaciente(cedulaPaciente.getBody());
        return ResponseEntity.ok(registros);
    }

    public ResponseEntity<Registro> save(RegistroDTO dto) {
        ResponseEntity<Paciente> cedulaPaciente = service.findById(dto.getCedulaPaciente());
        if(!cedulaPaciente.hasBody())
            throw new PacienteNotFoundException("El paciente no está registrado");
        Registro registro = new Registro();
        registro.setCedulaPaciente(cedulaPaciente.getBody());
        registro.setDiagnostico(dto.getDiagnostico());
        registro.setNombreDoctor(dto.getNombreDoctor());
        registro.setFechaCreacion(dto.getFechaCreacion());
        registroRepository.save(registro);
        return ResponseEntity.ok(registro);
    }
}
