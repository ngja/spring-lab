package com.hansol.springlab.jpa.repository

import com.hansol.springlab.jpa.constants.EatingHabits
import com.hansol.springlab.jpa.entity.Animal
import io.github.oshai.kotlinlogging.KotlinLogging
import io.kotest.core.spec.style.StringSpec
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.transaction.annotation.Transactional

private val logger = KotlinLogging.logger {}

@Transactional
@SpringBootTest
class AnimalRepositoryTest(
    val animalRepository: AnimalRepository,
) : StringSpec({

    "insert elephant" {
        val elephant = Animal(
            name = "elephant",
            scientificName = "elephantidae",
            family = "elephantidae",
            eatingHabits = EatingHabits.HERBIVORE,
            lifespan = 65,
        )
        val results = animalRepository.save(elephant)
        logger.info { results }
    }

    "select" {
        val results = animalRepository.findAll()
        logger.info { results }
    }
})