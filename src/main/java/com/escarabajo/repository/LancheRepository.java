/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escarabajo.repository;

import com.escarabajo.model.Lanche;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author erichmantai
 */
public interface LancheRepository extends JpaRepository<Lanche, Long> {

}
