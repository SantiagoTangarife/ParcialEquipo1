package com.udea.ParcialEquipo1.Controller;

import com.udea.ParcialEquipo1.Entity.Registro;
import com.udea.ParcialEquipo1.Service.RegistroService;
import com.udea.ParcialEquipo1.dto.RegistroDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registros")
public class RegistroController {

    @Autowired
    RegistroService registroService;

    @GetMapping("/{cedula}")
    public ResponseEntity<List<Registro>> getHistoriaPaciente(@PathVariable Long cedula){
        return registroService.getRegistrosByCedula(cedula);
    }

    @PostMapping("/save")
    public ResponseEntity<Registro> getHistoriaPaciente(@RequestBody RegistroDTO dto){
        return registroService.save(dto);
    }
}
