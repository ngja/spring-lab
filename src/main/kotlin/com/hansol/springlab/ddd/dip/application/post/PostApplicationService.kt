package com.hansol.springlab.ddd.dip.application.post

// domain 의존성만 가지고 infra 의존성은 가지면 안됨
import com.hansol.springlab.ddd.dip.domain.model.Post
import com.hansol.springlab.ddd.dip.domain.repository.PostRepository
import com.hansol.springlab.ddd.dip.domain.service.UploadService
import org.springframework.stereotype.Service

@Service
class PostApplicationService(
    val jpaPostRepository: PostRepository, // domain 의 interface 를 사용
    val slackNotifier: Notifier, // application 레벨의 interface 사용, slackNotifier, emailNotifier 중 slackNotifier 를 사용
    val uploadService: UploadService, // domain 의 service 를 사용
) {

    fun post() {
        // 글 저장
        jpaPostRepository.save(Post("제목", "내용"))

        // 업로드
        uploadService.upload()

        // 알람
        slackNotifier.notify()
    }
}