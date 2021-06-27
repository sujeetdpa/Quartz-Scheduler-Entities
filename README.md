# Quartz-Scheduler-Entities
Entities required for using Quartz Scheduler JDBC Job Store.
It will helps in creating the tables required by the Quartz Scheduler for JDBC Job Store.
JPA will create the entities on the startup. No need to add schema file.

# How to use
 1. Copy the models to your required projects.
 2. Add the spring quartz dependency in the project  (pom.xml file).
 3. Add the following configuration to your properties file :-<br>
    spring.datasource.username=<username><br>
    spring.datasource.password=<password><br>
    spring.datasource.url=jdbc:mysql://localhost:3306/<database name><br>
    spring.quartz.job-store-type=jdbc<br>
    spring.jpa.hibernate.ddl-auto=update<br>
    
