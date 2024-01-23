package com.hansol.springlab.jpa.entity

import jakarta.persistence.*

@Entity
@Table(name = "animal")
class Animal(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column
    val name: String,

    @Column
    val scientificName: String,

    @Column
    val order: String,

    @Column
    val family: String,
)