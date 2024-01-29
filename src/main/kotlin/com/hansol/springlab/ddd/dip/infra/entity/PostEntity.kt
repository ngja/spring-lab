package com.hansol.springlab.ddd.dip.infra.entity

import jakarta.persistence.*

@Entity
@Table(name = "posts")
class PostEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val postId: Long = 0,

    @Column
    val title: String,

    @Column
    val content: String,
)
