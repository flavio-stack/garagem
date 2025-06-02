/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.flavio.garagem.controllers;

import java.util.List;
import local.flavio.garagem.DTO.VeiculoMinDTO;
import local.flavio.garagem.entities.Veiculo;
import local.flavio.garagem.services.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ppjata
 */
@RestController

public class VeiculoController {
    
    @Autowired
    private VeiculoService garagemService;
    
    @GetMapping("/garagem")
    public List<Veiculo> findAll() {
        List<Veiculo> result = garagemService.findAll();
        return result;
    }
    
    @GetMapping("/forsale")
    public List<VeiculoMinDTO> findALL() {
        List<Veiculo> resultVeiculo = garagemService.findAll();
        
        List<VeiculoMinDTO> resultDTO = resultVeiculo.stream()
                .map(x -> new VeiculoMinDTO(x)).toList();
        return resultDTO;
    }
    
    @GetMapping("/forsale/{id}")
     public List<Veiculo> findById(@PathVariable long id) {
        List<Veiculo> result = garagemService.findById(id);
        return result;
     }
     
     @GetMapping("/cor/{cor}")
     public List<VeiculoMinDTO> findByCor(@PathVariable String cor) {
        List<VeiculoMinDTO> result = garagemService.findByCor(cor);
        return result;
     }
     
     @GetMapping("/ano/{ano}")
     public List<VeiculoMinDTO> findByAno(@PathVariable int ano) {
        List<VeiculoMinDTO> result = garagemService.findByAno(ano);
        return result;
     }
}
