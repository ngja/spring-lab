package com.hansol.springlab.jpa.repository

import com.hansol.springlab.jpa.constants.EatingHabits
import com.hansol.springlab.jpa.entity.Animal
import io.github.oshai.kotlinlogging.KotlinLogging
import io.kotest.core.spec.style.StringSpec
import org.springframework.boot.test.context.SpringBootTest

private val logger = KotlinLogging.logger {}

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

    "select after update" {
        // 1,elephant,elephantidae,elephantidae,HERBIVORE,65
        val firstQuery = animalRepository.findById(1L) // Hibernate: select a1_0.animal_id,a1_0.eating_habits,a1_0.family,a1_0.lifespan,a1_0.name,a1_0.scientific_name from animals a1_0 where a1_0.animal_id=?
        logger.info { "before sleep $firstQuery" } // 결과: lifespan=65
        logger.info { "start sleep 10 seconds" }
        Thread.sleep(10_000)
        logger.info { "finish sleep 10 seconds" }
        // update animals set lifespan=70 where animal_id=1;
        logger.info { "after sleep $firstQuery" } // 결과: lifespan=65
        val secondQuery = animalRepository.findById(1L) // Hibernate: select a1_0.animal_id,a1_0.eating_habits,a1_0.family,a1_0.lifespan,a1_0.name,a1_0.scientific_name from animals a1_0 where a1_0.animal_id=?
        logger.info { secondQuery } // 결과: lifespan=65
    }
})