# spring-cloud config Client

Bootstrap.properties
  - spring.application.name is just the application name of the microservice that would be deployed.
  - spring.cloud.config.uri is the property to mention the config server url. Point to note that our config server is running on port 8888; verify it by opening the application.properties file of the spring config server code base and check the server.port=8888.
  - management.security.enabled=false will disable the spring security on the management endpoints like /env, /refresh etc. This is for development settings, in production security should be enabled.

To Check Config Server
  - http://localhost:8088/msg
  - http://localhost:8088/actuator/refresh Request Method : POST