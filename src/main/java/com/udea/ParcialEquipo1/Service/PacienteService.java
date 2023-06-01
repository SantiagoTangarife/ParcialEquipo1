package com.udea.ParcialEquipo1.Service;

import com.udea.ParcialEquipo1.Entity.Paciente;
import com.udea.ParcialEquipo1.Repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    PacienteRepository pacienteRepository;


    public Paciente save(Paciente p) {return pacienteRepository.save(p);}

    public void delete(Paciente p) {
        pacienteRepository.delete(p);}
    public Iterable<Paciente> list(){return pacienteRepository.findAll();}
    public Optional<Paciente> listId(long id){return pacienteRepository.findById(id);}

    public ResponseEntity<Paciente> findById(@PathVariable Long id){
        //usamos siempre un optional para no tratar con excepciones de alcance por id, debido a un id incorrecto
        Optional<Paciente> optionalPaciente=pacienteRepository.findById(id);
        if(optionalPaciente.isPresent())
            //si existe lo devuelvo
            return  ResponseEntity.ok(optionalPaciente.get());
        else
            //si no existe debolvemos un 404 con un response entity
            return ResponseEntity.notFound().build();
    }



}
