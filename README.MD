<a id="up"></a>

<h1>Ticket shop application</h1>   

___This app is a simplified version of a ticket store where the user can send http requests to buy movie tickets and more. You can find out more about this below.___





<h2>Contents</h2>

- [Features](#features)
- [Technologies used](#technologies)
- [How Start](#howStart)




<a id="features"></a>

<h2>Features</h2>



The application uses user authorization, 
after which you will get access to certain "end points":

__ADMIN__
  * _POST_ 
    * /cinema-halls — ```{"capacity":50, "description":"Big hall"}```
    * /movies — ```{"title":"Forrest gump", "description":"Run Forrest!"}```  
    * /movie-sessions — ```{"movieId":1, "cinemaHallId":1, "showTime":"15.08.2021 21:30"}```
    
  * _GET_
    * /users/by-email ```?email=user@i.ua```
  * _PUT_  
    * /movie-sessions/{id} — ```{"movieId":1, "cinemaHallId":1, "showTime":"15.08.2021 19:00"}```
  * _DELETE_  
    * /movie-sessions/{id}  
  

__USER__
  * _POST_
    * /orders/complete
  * _GET_
    * /orders
  * _PUT_
    * /shopping-carts/movie-sessions ```?movieSessionId=1```

__ADMIN & USER__
  * _GET_
    * /cinema-halls  
    *  /movies   
    *  /movie-sessions/available   

And also anyone can register as a new user by sending a _POST_ request:
* /register — ```{"email":"yourEmail", "password":"12345678", "repeatPassword":"12345678"}```










<a id="technologies"></a>

<h2>Technologies used</h2>



* __Java 11__
* __SOLID concepts__
* __Spring__ (Spring Core, Spring Security, Spring Web)
* __Hibernate__
* __REST__
* __Maven__
* __MySQL__
* __Tomcat 9.0.50__





<a id="howStart"></a>

<h2>How Start</h2>


 1. Install __[MySQL](https://dev.mysql.com/downloads/)__  
 2. Install __[Tomcat 9.0.50](https://archive.apache.org/dist/tomcat/tomcat-9/v9.0.50/bin/)__  
 3. Fork and clone this project  
 4. Add your correct information to [db.properties](src/main/resources/db.properties) to be able to connect to your database
  
```java
    db.driver="YOUR_DRIVER"
    db.url="YOUR_DATABASE_URL"
    db.user="YOUR_USERNAME"
    db.password="YOUR_PASSWORD"
```

5.  Run this project using __Tomcat's__ local server  

__For trial use only__, you are provided with 2 accounts for authentication:  

_ADMIN_         
Login: admin@i.ua  
Password: admin1234

_USER_  
Login: user@i.ua  
Password: user1234 


6. To send _POST_, _DELETE_ and _PUT_ requests, you can use [Postman](https://www.postman.com/home)  








[UP](#up)
  
