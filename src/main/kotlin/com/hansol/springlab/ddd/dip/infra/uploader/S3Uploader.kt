package com.hansol.springlab.ddd.dip.infra.uploader

import com.hansol.springlab.common.GlobalLogger.Companion.logger
import com.hansol.springlab.ddd.dip.domain.service.Uploader
import org.springframework.stereotype.Component

@Component
class S3Uploader : Uploader {
    override fun upload() {
        // S3 의존성
        logger.info { "upload S3" }
    }
}