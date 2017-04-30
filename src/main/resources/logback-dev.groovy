//
// Built on Sun Apr 30 19:39:06 UTC 2017 by logback-translator
// For more information on configuration files in Groovy
// please see http://logback.qos.ch/manual/groovy.html

// For assistance related to this tool or configuration files
// in general, please contact the logback user mailing list at
//    http://qos.ch/mailman/listinfo/logback-user

// For professional support please see
// http://www.qos.ch/shop/products/professionalSupport

//https://logback.qos.ch/translator/asGroovy.html


import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.core.rolling.RollingFileAppender
import ch.qos.logback.core.rolling.TimeBasedRollingPolicy

import static ch.qos.logback.classic.Level.*

def APP_NAME = "lightsword"
logger("org.springframework.web", INFO)
logger("com.springboot.in.action", TRACE)
appender("dailyRollingFileAppender", RollingFileAppender) {
    file = "${user.home}/logs/${APP_NAME}"
    rollingPolicy(TimeBasedRollingPolicy) {
        fileNamePattern = "${APP_NAME}.%d{yyyy-MM-dd}.log"
        maxHistory = 30
    }
    encoder(PatternLayoutEncoder) {
        pattern = "%d{HH:mm:ss.SSS} [%thread] %-5level %logger{35} - %msg %n"
    }
}
root(DEBUG, ["CONSOLE", "dailyRollingFileAppender"])
