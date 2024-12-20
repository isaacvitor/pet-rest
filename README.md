# PET-REST experiments

This project is a collection of studies about RESTful using Spring Boot.

## Consuming a RESTful Web Service

#### References:
- [Consuming a RESTful Web Service](https://spring.io/guides/gs/consuming-rest/)
- [RestTemplate](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/client/RestTemplate.html)
- [RestTemplateBuilder](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/web/client/RestTemplateBuilder.html)
- [Quoters API](https://github.com/spring-guides/quoters)

#### Steps:
1. Create a config class to define the RestTemplate bean.
   1. Don't forget to add the `@Configuration` annotation.
   2. Use the `RestTemplateBuilder` to create the bean. This it allows to use an error handler and interceptors.
2. Create a service class to consume the API.
   1. Use the `RestTemplate` bean to consume the API.
   2. Use the `getForObject` method to consume the API.