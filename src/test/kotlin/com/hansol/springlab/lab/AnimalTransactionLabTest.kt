package com.hansol.springlab.lab

import com.hansol.springlab.jpa.lab.AnimalTransactionLab
import io.github.oshai.kotlinlogging.KotlinLogging
import io.kotest.core.spec.style.StringSpec
import org.springframework.boot.test.context.SpringBootTest

private val logger = KotlinLogging.logger {}

@SpringBootTest
class AnimalTransactionLabTest(
    val animalTransactionLab: AnimalTransactionLab,
) : StringSpec({

    "find, sleep, update, find again" {
        animalTransactionLab.findUpdateAndFindAgain()
        /*
        Hibernate: select a1_0.animal_id,a1_0.eating_habits,a1_0.family,a1_0.lifespan,a1_0.name,a1_0.scientific_name from animals a1_0 where a1_0.animal_id=?
        before sleep lifespan=65
        start sleep 10 seconds
        직접 업데이트 update animals set lifespan=70 where animal_id=1;
        finish sleep 10 seconds
        after sleep lifespan=65
        Hibernate: select a1_0.animal_id,a1_0.eating_habits,a1_0.family,a1_0.lifespan,a1_0.name,a1_0.scientific_name from animals a1_0 where a1_0.animal_id=?
        lifespan=70
         */
    }

    "find, sleep, update, find again with transaction" {
        animalTransactionLab.findUpdateAndFindAgainWithTransactional()
        /*
        조회 쿼리
        before sleep lifespan=65
        start sleep 10 seconds
        직접 업데이트 update animals set lifespan=70 where animal_id=1;
        finish sleep 10 seconds
        after sleep lifespan=65
        lifespan=70 조회 쿼리가 없다 -> Transactional에 의해 영속성 컨텍스트에 들어가고 1차 캐시 사용으로 쿼리 없이 동일한 결과
         */
    }
})