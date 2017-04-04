/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escarabajo.controllers;

import com.escarabajo.model.Cardapio;
import com.escarabajo.model.Lanche;
import com.escarabajo.services.CardapioService;
import com.escarabajo.services.LancheService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author erichmantai
 */
@RestController
@RequestMapping(value = "/lanche")
public class LancheController {
    
    @Autowired 
    public LancheService service;
    
    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public Lanche save(Lanche lanche) {
        return service.save(lanche);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Lanche getCardapio(@PathVariable Long id) {
        return service.getLanche(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Lanche> getAll() {
        return service.getAll();
    }
    
}
