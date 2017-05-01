//https://logback.qos.ch/translator/asGroovy.html

import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.classic.filter.ThresholdFilter
import ch.qos.logback.core.ConsoleAppender
import ch.qos.logback.core.rolling.RollingFileAppender
import ch.qos.logback.core.rolling.TimeBasedRollingPolicy

import java.nio.charset.Charset

import static ch.qos.logback.classic.Level.INFO
import static ch.qos.logback.classic.Level.TRACE

def USER_HOME = System.getProperty("user.home")
def APP_NAME = "lightsword"
def LOG_PATTERN = "%d{HH:mm:ss.SSS} [%thread] %-5level %logger{35} - %msg %n"
def LOG_FILE = "${USER_HOME}/logs/${APP_NAME}"
def FILE_NAME_PATTERN = "${APP_NAME}.%d{yyyy-MM-dd}.log"

scan("60 seconds")

context.name = "${APP_NAME}"
jmxConfigurator()

logger("org.springframework.web", INFO)
logger("com.springboot.in.action", TRACE)
logger("org.apache.velocity.runtime.log", INFO)

appender("CONSOLE", ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        pattern = "${LOG_PATTERN}"
        charset = Charset.forName("utf8")
    }
}

appender("dailyRollingFileAppender", RollingFileAppender) {
    file = "${LOG_FILE}"
    rollingPolicy(TimeBasedRollingPolicy) {
        fileNamePattern = "${FILE_NAME_PATTERN}"
        maxHistory = 30
    }
    filter(ThresholdFilter) {
        level = TRACE
    }
    encoder(PatternLayoutEncoder) {
        pattern = "${LOG_PATTERN}"
    }
}
root(TRACE, ["CONSOLE", "dailyRollingFileAppender"])
