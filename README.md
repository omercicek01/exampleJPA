# exampleJPA
spring boot and hibernate first example

Mysql Configuration
 create myjpa database;
 change application.properties file for your mysql configuration
 
 
Get Cities   
method get  http://localhost:8080/api/cities

Get City

http://localhost:8080/api/cities/{id}


Add City 
method Post http://localhost:8080/api/cities/add
 {
 "name":"Diyarbakır"
 }
 
 
Update City 
method Post http://localhost:8080/api/cities/update
 {
 "name":"Diyarbakır"
 }
 
Delete City 
method Post http://localhost:8080/api/cities/delete/{id}




 
Get Users   
method get  http://localhost:8080/api/users

Get User

http://localhost:8080/api/users/{id}


Add User 
method Post http://localhost:8080/api/users/add
 {
 "username":"username",
 "password":"yourpassword",
  "role":1
 }
 Role 
 admin 1
 default 2
 
Update User 
method Post http://localhost:8080/api/users/update
 {
 "username":"username",
 "password":"yourpassword",
  "role":1
 }
 
Delete User 
method Post http://localhost:8080/api/users/delete/{id}

 
 
