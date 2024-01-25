package com.hansol.springlab.jpa.lab

import com.hansol.springlab.jpa.repository.AnimalRepository
import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

private val logger = KotlinLogging.logger {}

@Service
class AnimalTransactionLab(
    private val animalRepository: AnimalRepository,
) {

    fun findUpdateAndFindAgain() {
        // 1,elephant,elephantidae,elephantidae,HERBIVORE,65
        val firstQuery = animalRepository.findById(1L)
        logger.info { "before sleep $firstQuery" }
        logger.info { "start sleep 10 seconds" }
        Thread.sleep(10_000)
        logger.info { "finish sleep 10 seconds" }
        // update animals set lifespan=70 where animal_id=1;
        logger.info { "after sleep $firstQuery" }
        val secondQuery = animalRepository.findById(1L)
        logger.info { secondQuery } // 결과: lifespan=65
    }

    @Transactional
    fun findUpdateAndFindAgainWithTransactional() {
        // 1,elephant,elephantidae,elephantidae,HERBIVORE,65
        val firstQuery = animalRepository.findById(1L)
        logger.info { "before sleep $firstQuery" }
        logger.info { "start sleep 10 seconds" }
        Thread.sleep(10_000)
        logger.info { "finish sleep 10 seconds" }
        // update animals set lifespan=70 where animal_id=1;
        logger.info { "after sleep $firstQuery" }
        val secondQuery = animalRepository.findById(1L)
        logger.info { secondQuery } // 결과: lifespan=65
    }
}