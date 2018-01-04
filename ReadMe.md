#Simple Audit 4j with Spring Boot
To run the application, Run the TestCase #AuditTest or follow :

    1. Run the AuditMainApp as Java Application
    
    2. Send a rest call to http://localhost:8088/test/{uuid}/{username}   
       -- replace {uuid} & {username} with proper values
    
    3. Observe the logs in log file at root folder for audit events;
    
	4. CustomAuditHandler is a handler set in audit4j.conf.yml. 
	   It will act along with other audit handler which are ConsoleHandler & FileHandler. 
	
	5. CustomAuditHandler will collect logs and will render in console only. 
	
#Note: To get customization, modify handle() of CustomAuditHandler() accordingly.

    
#Spring xml configuration :

http://audit4j.org/documentation/#spring_integration_configurations
https://github.com/audit4j/audit4j-demo
https://github.com/audit4j/audit4j-demo/blob/master/audit4j-demo-springboot/src/main/java/hello/AuditConfig.java


--> This example contains default behavior for appenders & layout for simplicity.
--> Next will cover more detailed configuration with custom logging and layout. 