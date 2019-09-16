# JPMC UI Automation Test
## Please go through the below to understand the framework and how to setup and run the test.
### Feature/Test 
````
As a user, I want to validate news article from guardian news website on similar resources, so that I can confirm that the news article is not FAKE news
````

````
Framework setup
````
````
* Selenium webDriver
* Java - programming language
* Chrome webdriver browser
* POM
* Cucumber
* Java 1.8
* Maven - build management tool
* IDE - IntelliJ IDEA
````
### To run the test:
````
1. Download, install and setup Java SDK (Java 1.8) on your PC.
2. Install IntelliJ IDEA on you PC, go to File - Project Structure - Project point it to the Java 8 SDK.
3. Clone the test framework to a location of your choice on your PC.
4. Launch IntelliJ, go to File - select Open and point to the cloned test framework - This will load up the project.
5. Go to 'src\test\java\com\Jpmc\TestRunner.javaTestRunner' and right click on it - this will start to execute the test.
6. You may also wish to run the test from Terminal with 'mvn test' command - provided you have maven installed and correctly setup on your pc within the environment variables.
````