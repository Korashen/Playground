Example Code for a Spring Boot OAuth 2 authentification.

It consists of a simple web client "oauth-client" and a simple OAuth server "oauth-server".  
These two modules have the spring-boot-starter as parent, not the "container" maven parent pom.

First, start the oauth-server.
It will run on port 8081.

Second, start the oauth-client.
It will run on port 8082.

Third, open a browser and go to http://localhost:8082/ui  
There you find a link "LOGIN" which will redirect you to the "securedPage".  
If you are not logged in, you will be redirected to the 8081 auth server to authenticate.  
Use the credentials "john" with password "123" (without the ").  
After the login, you get redirected to the "securedPage".  
From now on, clicking "LOGIN" on the index page will bring you directly to the "securedPage", as you are now authenticated.  
Clear the cookies to the remove the auth token.

A logout feature might come in the future.  
Login possibilities with facebook or google might come in the futur.