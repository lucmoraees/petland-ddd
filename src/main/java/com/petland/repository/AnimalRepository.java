package com.petland.repository;

import com.petland.domain.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository  extends JpaRepository<Animal, Integer> {
}
