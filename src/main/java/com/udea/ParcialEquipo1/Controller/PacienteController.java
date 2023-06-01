package com.udea.ParcialEquipo1.Controller;

import com.udea.ParcialEquipo1.Entity.Paciente;
import com.udea.ParcialEquipo1.Exception.PacienteNotFoundException;
import com.udea.ParcialEquipo1.Service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/historiaClinica")
@CrossOrigin("*")
public class PacienteController {

@Autowired
    PacienteService pacienteServive;
    @PostMapping("/save")
    public long save(@RequestBody Paciente paciente){
        pacienteServive.save(paciente);
        return paciente.getCc();
    }


    @GetMapping("/list/{id}")
    public Paciente listPersonById(@PathVariable("id") int id){
        Optional<Paciente> person = pacienteServive.listId(id);
        if(person.isPresent()){
            return person.get();
        }



        throw new PacienteNotFoundException("Id de persona invalido");
    }






}
