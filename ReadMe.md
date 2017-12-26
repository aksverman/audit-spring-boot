#Simple Audit 4j with Spring Boot
To run the application:
    1. Run the AuditMainApp as Java Application
    2. Send a rest call to http://localhost:8088/test/{uuid}/{username}    - replace uuid & username with proper values
    3. Observe the logs in log file at root folder for audit events;

    
#Spring xml configuration :

http://audit4j.org/documentation/#spring_integration_configurations
https://github.com/audit4j/audit4j-demo
https://github.com/audit4j/audit4j-demo/blob/master/audit4j-demo-springboot/src/main/java/hello/AuditConfig.java


--> This example contains default behavior for appenders & layout for simplicity.
--> Next will cover more detailed configuration with custom logging and layout. 