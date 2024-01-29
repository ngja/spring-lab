package com.hansol.springlab.ddd.dip.infra.notifier

import com.hansol.springlab.common.GlobalLogger.Companion.logger
import com.hansol.springlab.ddd.dip.application.post.Notifier
import org.springframework.stereotype.Component

@Component
class EmailNotifier : Notifier {
    override fun notify() {
        // email 의존성 코드
        logger.info { "notify email" }
    }
}