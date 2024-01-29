package com.hansol.springlab.ddd.dip.infra.repository

import com.hansol.springlab.ddd.dip.domain.repository.PostRepository
import com.hansol.springlab.ddd.dip.infra.entity.PostEntity
import org.springframework.data.jpa.repository.JpaRepository

interface JpaPostRepository : JpaRepository<PostEntity, Long>, PostRepository