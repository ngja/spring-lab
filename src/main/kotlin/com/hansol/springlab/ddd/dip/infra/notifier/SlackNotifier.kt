package com.hansol.springlab.ddd.dip.infra.notifier

import com.hansol.springlab.common.GlobalLogger.Companion.logger
import com.hansol.springlab.ddd.dip.application.post.Notifier
import org.springframework.stereotype.Component

@Component
class SlackNotifier : Notifier {
    override fun notify() {
        // slack 의존성을 가진 코드
        logger.info { "notify slack" }
    }
}