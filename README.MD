<a id="up"></a>

<h1>Ticket shop application</h1>   

___This is an app to showcase my knowledge and skills in Java, OOP, SOLID concepts, Spring and Hibernate frameworks.___






<h2>Contents</h2>

- [Features](#features)
- [Technologies used](#technologies)
- [How Start](#howStart)






<h2>Features</h2>

<a id="features"></a>

The application uses user authorization, 
after which you will get access to certain "end points":

__ADMIN__
  * _POST_ 
    * /cinema-halls
    * /movies  
    * /movie-sessions
  * _GET_
    * /users/by-email
  * _PUT_  
    * /movie-sessions/{id}
  * _DELETE_  
    * /movie-sessions/{id}  
  

__USER__
  * _POST_
    * /orders/complete
  * _GET_
    * /orders
  * _PUT_
    * /shopping-carts/movie-sessions

__ADMIN & USER__
  * _GET_
    * /cinema-halls  
    *  /movies   
    *  /movie-sessions/available   

And also anyone can register as a new user by sending a _POST_ request:
* /register

    









<h2>Technologies used</h2>

<a id="technologies"></a>

* __Java 11__
* __SOLID concepts__
* __Spring__ (Spring Core, Spring Security, Spring Web)
* __Hibernate__
* __REST__
* __JSON__  
* __Maven__
* __MySQL__
* __Tomcat 9.0.54__







<h2>How Start</h2>

<a id="howStart"></a>

 1. Install __MySQL__ or other DB  
 2. Install __Tomcat 9.0.50__  
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
  
