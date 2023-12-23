package com.api3wings.apirest3wings.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api3wings.apirest3wings.Entidade.Item;

public interface RepositorioItem extends JpaRepository<Item, Long> {
    
}
