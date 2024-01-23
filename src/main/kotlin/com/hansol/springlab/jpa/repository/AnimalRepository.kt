package com.hansol.springlab.jpa.repository

import com.hansol.springlab.jpa.entity.Animal
import org.springframework.data.jpa.repository.JpaRepository

interface AnimalRepository : JpaRepository<Animal, Long>