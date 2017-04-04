/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escarabajo.repository;

import com.escarabajo.model.Cardapio;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author erichmantai
 */
@Repository
public interface CardapioRepository extends JpaRepository<Cardapio,Long>{
    
}
