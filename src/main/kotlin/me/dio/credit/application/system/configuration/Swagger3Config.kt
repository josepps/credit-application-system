package me.dio.credit.application.system.configuration

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import org.springdoc.core.models.GroupedOpenApi
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import io.swagger.v3.oas.annotations.info.Info

@Configuration
@OpenAPIDefinition(info = Info(title = "credit-application-system"))
class Swagger3Config {
  @Bean
  fun publicApi(): GroupedOpenApi? {
    return GroupedOpenApi.builder()
      .group("springcreditapplicationsystem-public")
      .pathsToMatch("/api/customers/**", "/api/credits/**")
      .build()
  }
}