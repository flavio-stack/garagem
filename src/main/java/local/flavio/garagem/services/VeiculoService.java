/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.flavio.garagem.services;

import java.util.List;
import local.flavio.garagem.entities.Veiculo;
import local.flavio.garagem.repositories.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ppjata
 */
@Service
public class VeiculoService {
    
    @Autowired
    private VeiculoRepository veiculoRepository;
    
    public List<Veiculo> findAll() {
        
        List<Veiculo> result = veiculoRepository.findAll();
        return result;
        
    }
}
