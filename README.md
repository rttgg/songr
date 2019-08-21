
#Songr Application
## Challenge Summary
* Run the Spring app
* Create hello world route /hello
* Create a route that turns words into UPPER CASE
* Create a route that reverse the order
* Write a helper method for reverse the order test

## Challenge Description
* Set up html inside templates for router
* Set up Homecontrol.java to add your router functionality

## Approach & Efficiency
* all tests are passing



#songr
* This repo holds a "RESTful" spring server with multiple get routes.


## Main Files
### controllers
* HomeController.java
* AlbumController.java

### templates
*hello.html
*helloworld.html
*capitalize.html
*allAlbums.html


### Usage
* git clone repo

* Open terminal, and run this command: ./gradlew bootRun
Routes
* /: will return Home Stub Route
* /hello: will return Hello World
* /capitalize/{hello world} output: HELLO WORLD
* /getreverse: will reverse Hello world! >>> world! hello

* /albums: will take to albums

* /albums: will display all albums in database
* includes POST route to add new albums to the database and redirects to /albums to display
