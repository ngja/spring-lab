package com.hansol.springlab.ddd.dip.domain.service

import org.springframework.stereotype.Service

@Service
class UploadService(
    val s3Uploader: Uploader,
) {
    fun upload() {
        s3Uploader.upload()
    }
}