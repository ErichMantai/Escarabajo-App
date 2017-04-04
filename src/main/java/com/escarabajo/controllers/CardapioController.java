/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escarabajo.controllers;

import com.escarabajo.model.Cardapio;
import com.escarabajo.repository.CardapioRepository;
import com.escarabajo.services.CardapioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author erichmantai
 */
@RestController
@RequestMapping(value = "/cardapio")
public class CardapioController {
    
    @Autowired 
    public CardapioService service;
    
    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public Cardapio save(Cardapio cardapio) {
        return service.save(cardapio);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Cardapio getCardapio(@PathVariable Long id) {
        return service.getCardapio(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Cardapio> getAll() {
        return service.getAll();
    }
    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity deletecardapio(@PathVariable Long id) {
         service.delete(id);
         return ResponseEntity.noContent().build();
    }
    
    

}
