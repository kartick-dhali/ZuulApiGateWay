#microservice developer #frescoplay #zuulapigateway
MicroServices CaseStudy Tweet - ZuulApiGateway

Your task is now to create a Api Zuul Gateway for the FrescoTweet microservices project.
Please follow the instructions carefully
1. Important: Run install once from the ide menu before you start coding
2. Your application should connect to eureka server running at http://localhost:8761
3. Complete the implementation of Spring Zuul Api gateway and make it run at port 8080
4. Implement basic authentication in zuul using spring basic security
5. Load the user authentication details from mysql db, following are the credentials:
username: user1
password: MySQL123$
db: Fresco Tweet
table: user
fields in table: id, fullname, username, password
6. Zuul should also do routing for the following
paths:
http://localhost:8080/ui      ->ui(eureka connected application)

http://localhost:8080/dbrestapi     ->   dbrestapi

http://localhost:8080/recommendationengine        ->  recommendationengine

7. Zuul should implement two end points login and register

/login

Should take

two Strings username and password and authenticate the user

/register -> Should take three Strings fullname, username and password store the details in MySql db the password should be encrypted using BCrypt password encoder before storing.

8. Use the custom login page in the static folder. Any unauthenticated user should be redirected to the login page.


**Note for this question on hackerrank**: Only you should change the **service and security config part** . As well as you have to configure the **application.properties** file. To enable this ZUUL Proxy use **@EnableZuulProxy** 
on main method. Here the packages name may be differ if you direct pulling this project to run.
