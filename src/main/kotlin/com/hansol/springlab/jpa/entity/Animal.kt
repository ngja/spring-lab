package com.hansol.springlab.jpa.entity

import com.hansol.springlab.jpa.constants.EatingHabits
import jakarta.persistence.*

@Entity
@Table(name = "animals")
class Animal(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val animalId: Long = 0,

    @Column
    val name: String,

    @Column
    val scientificName: String,

    @Column
    val family: String,

    @Column
    @Enumerated(EnumType.STRING)
    val eatingHabits: EatingHabits,

    @Column
    var lifespan: Int,


) {
    override fun toString(): String {
        return "Animal(animalId=$animalId, name=$name, scientificName=$scientificName, family=$family, eatingHabits=$eatingHabits, lifespan=$lifespan)"
    }
}