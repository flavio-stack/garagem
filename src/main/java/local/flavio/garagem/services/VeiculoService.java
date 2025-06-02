/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.flavio.garagem.services;

import java.util.List;
import local.flavio.garagem.DTO.VeiculoMinDTO;
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
    private VeiculoRepository garagemRepository;
    
    public List<Veiculo> findAll() {
        
        List<Veiculo> result = garagemRepository.findAll();
        return result;
        
    }
    public List<Veiculo> findById (long id) {
        List<Veiculo> result = garagemRepository.findById(id);
          return result;
    }
    
    public List<VeiculoMinDTO> findByCor(String cor) {
        List<VeiculoMinDTO> result = garagemRepository.findByCor(cor);
          return result;
    }
        
         public List<VeiculoMinDTO> findByAno(int ano) {
        List<VeiculoMinDTO> result = garagemRepository.findByAno(ano);
          return result;
    }
}
