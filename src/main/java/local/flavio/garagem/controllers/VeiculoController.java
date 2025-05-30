/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.flavio.garagem.controllers;

import java.util.List;
import local.flavio.garagem.entities.Veiculo;
import local.flavio.garagem.services.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ppjata
 */
@RestController

public class VeiculoController {
    
    @Autowired
    private VeiculoService veiculoService;
    
    @GetMapping("/garagem")
    public List<Veiculo> findAll() {
        List<Veiculo> result = veiculoService.findAll();
        return result;
    }
}
