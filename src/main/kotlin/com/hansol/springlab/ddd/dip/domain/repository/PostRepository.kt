package com.hansol.springlab.ddd.dip.domain.repository

import com.hansol.springlab.ddd.dip.domain.model.Post
import com.hansol.springlab.ddd.dip.infra.entity.PostEntity

interface PostRepository {
    fun save(post: Post): PostEntity
}