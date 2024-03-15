# Mô hình 
![image](https://github.com/chicuongdev2002/SpringCloud_EurekaNetflix/assets/124854803/c3b7d903-4424-43ff-9488-2d6c7a04c437)
## Chạy service Registry 
## Chạy service Product,User
## Chạy service Getway
### Eureka(Client)
```maven
<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
</dependency>
```
### Eureka(Server)
```maven
<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
</dependency>
```
- Service User
http://localhost:8802/api/v1/user
![image](https://github.com/chicuongdev2002/SpringCloud_EurekaNetflix/assets/124854803/600a90ba-6246-42c8-8735-81bee2342c4b)
- Service Product
http://localhost:8801/api/v2/product
![image](https://github.com/chicuongdev2002/SpringCloud_EurekaNetflix/assets/124854803/5b59ceaa-ab2c-4294-9606-aa68ba716476)
- Service APIGetway gọi User
http://localhost:8803/api/v1/user
![image](https://github.com/chicuongdev2002/SpringCloud_EurekaNetflix/assets/124854803/bf5a6ce2-3aeb-4ede-8dcc-b819f2dc2985)
- Service APIGetway gọi User
http://localhost:8803/api/v2/product
![image](https://github.com/chicuongdev2002/SpringCloud_EurekaNetflix/assets/124854803/36d1ba08-54aa-4044-b73d-23e445622e1c)
- Trang Eureka xem các service đang hoạt động (Server)
http://localhost:8761
![image](https://github.com/chicuongdev2002/SpringCloud_EurekaNetflix/assets/124854803/30e9b5cf-497d-4217-86af-67aaa395cf4b)
- Config Application.yml
```yml
spring:
  cloud:
    gateway:
      globalcors:
        cors-configurations:
          '[/**]':
            allowedOrigins: "http://localhost:3000"
            allowedHeaders: "*"
            allowedMethods:
              - GET
              - POST
              - PUT
              - DELETE
      routes:
        - id: product
          uri: http://localhost:8801
          predicates:
            - Path=/api/v2/**
        - id: user
          uri: http://localhost:8802
          predicates:
            - Path=/api/v1/**
```




