/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2_Web.repositorio;

import Reto2_Web.modelo.Cosmetics;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import Reto2_Web.interfaces.InterfaceCosmetics;

/**
 *
 * @author Linda Moreno
 */
@Repository
public class CosmeticsRepositorio {
    @Autowired
    private InterfaceCosmetics repository;

    public List<Cosmetics> getAll() {
        return repository.findAll();
    }

    public Optional<Cosmetics> getClothe(String reference) {
        return repository.findById(reference);
    }
    public Cosmetics create(Cosmetics clothe) {
        return repository.save(clothe);
    }

    public void update(Cosmetics clothe) {
        repository.save(clothe);
    }
    
    public void delete(Cosmetics clothe) {
        repository.delete(clothe);
    }
}
