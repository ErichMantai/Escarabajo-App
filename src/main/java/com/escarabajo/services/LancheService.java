/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escarabajo.services;

import com.escarabajo.model.Cardapio;
import com.escarabajo.model.Lanche;
import com.escarabajo.repository.CardapioRepository;
import com.escarabajo.repository.LancheRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author erichmantai
 */
@Service
public class LancheService {
    
    @Autowired 
    public LancheRepository repository;
    
    @Transactional
    public Lanche save(Lanche lanche) {
        return repository.save(lanche);
    }
    
    @Transactional(readOnly = true)
    public Lanche getLanche(Long id) {
        return repository.findOne(id);
    }
    
    @Transactional(readOnly = true)
    public List<Lanche> getAll() {
        return repository.findAll();
    }
    
    
}
