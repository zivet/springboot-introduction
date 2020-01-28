# Logging
Spring Boot supports: 
* SLF4J ,provides a standardized API 
```org.slf4j.Logger``` 
```org.slf4j.LoggerFactory```
* Java Util Logging: ```java.util.logging.Logger```
* Log4j2: ```org.apache.logging.log4j.Logger``` and 
* Logback **(by default)**: [Log messages via the SLF4J](https://stackify.com/compare-java-logging-frameworks/) (API SLF4J implementation).
[which use?](https://stackify.com/compare-java-logging-frameworks/)

### Levels:
*more-level*-->**TRACE(DEBUG(INFO(WARN(ERROR(OFF)))))**

### Information in output(console/file logging):
* Date and Time in Millisecond.
* Log Level.
* Process ID.
* Thread name.
* Logger name.
* Log message.

### Configuration:
```debug=true```
Defines the [**level of the internal logs**](https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#boot-features-logging) *(by default spring boot uses [```org.apache.commons.logging```](https://commons.apache.org/proper/commons-logging/))*, but it can also be defined with the configuration of ```Java Util Logging```, ```Log4J2``` and ```Logback```.

By default, all logs will be print on console, to configure add the following to your ```application.properties```:
```
logging.level.root=debug
logging.path=logs
logging.file=${logging.path}/log.log
logging.pattern.file=%d{dd-MM-yyyy HH:mm:ss.SSS} [%thread] %-5level %logger{36}.%M - %msg%n
logging.pattern.console=%d{dd-MM-yyyy HH:mm:ss.SSS} %magenta([%thread]) %highlight(%-5level) %logger.%M - %msg%n
```
