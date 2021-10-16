# JAX-RS Demo
this demo application deploys a jax-rs endpoint to a wildfly application server

# 1 Setup
* install Eclipse
* install Wildfly Server 24+
	* can be installed within Eclipse
* install JBoss Tools 4.19.1 final
	* install via Eclipse Marketplace
* in Eclipse > Servers
	* add Wildfly Server
	* right-click Wildfly server > Add and Remove > Add > jax-rs-demo
	* Servers > WildFly 24+ > jax-rs-demo > right-click > Full Publish
		* or restart

# 2 Endpoints
* http://localhost:8080/jax-rs-demo/api/hello
* http://localhost:8080/jax-rs-demo/api/hello?name=peter
* http://localhost:8080/jax-rs-demo/api/hello/error
* http://localhost:8080/jax-rs-demo/api/hello/error2
* http://localhost:8080/jax-rs-demo/api/books
	* gets all books
	* to add a book send a json to this endpoint with HTTP POST e.g. with postman
* http://localhost:8080/jax-rs-demo/api/books/1
* http://localhost:9990/console
	* before you can enter the Management Console, you have to add a user via add-user.bat
		* C:\Users\<username>\wildfly-24.0.1.Final\bin\add-user.bat
		* assign the role admin to the user

