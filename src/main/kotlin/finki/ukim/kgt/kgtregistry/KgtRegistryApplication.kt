package finki.ukim.kgt.kgtregistry

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class KgtRegistryApplication

fun main(args: Array<String>) {
    runApplication<KgtRegistryApplication>(*args)
}
