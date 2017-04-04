/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escarabajo.services;

import com.escarabajo.model.Cardapio;
import com.escarabajo.repository.CardapioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author erichmantai
 */
@Service
public class CardapioService {
    
    @Autowired 
    public CardapioRepository repository;
    
    @Transactional
    public Cardapio save(Cardapio cardapio) {
        return repository.save(cardapio);
    }
    
    @Transactional(readOnly = true)
    public Cardapio getCardapio(Long id) {
        return repository.findOne(id);
    }
    
    @Transactional(readOnly = true)
    public List<Cardapio> getAll() {
        return repository.findAll();
    }

    public void delete(Long icardad) {
         repository.delete(icardad);
    }
    
}
