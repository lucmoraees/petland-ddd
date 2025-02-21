package com.petland.cadastros.repository;

import com.petland.cadastros.model.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository  extends JpaRepository<Animal, Integer> {
}
