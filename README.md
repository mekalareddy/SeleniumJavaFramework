# SeleniumJavaFramework

Software QA Agile Process : 
By breaking the product into cycles, the Agile model quickly delivers a working product and is considered a very realistic development approach. 
The model produces ongoing releases, each with small, incremental changes from the previous release. 
At each iteration, the product is tested.

This model emphasizes interaction, as the customers, developers and testers work together throughout the project. 
But since this model depends heavily on customer interaction, the project can head the wrong way if the customer is not clear on the direction he or she wants to go.



Software QA Methodologies : 
Functional vs. Non-functional Testing : 
Functional testing involves testing the application against the business requirements.
It incorporates all test types designed to guarantee each part of a piece of software behaves as expected by using uses cases provided by the design team or business analyst.
These testing methods are usually conducted in order and include: 
* Unit testing
* Integration testing
* System testing
* Acceptance testing


* Unit testing : 
Unit testing is the first level of testing and is often performed by the developers themselves. 
It is the process of ensuring individual components of a piece of software at the code level are functional and work as they were designed to.

* Integration testing
After each unit is thoroughly tested, it is integrated with other units to create modules or components that are designed to perform specific tasks or activities. 
These are then tested as group through integration testing to ensure whole segments of an application behave as expected (i.e, the interactions between units are seamless). 
These tests are often framed by user scenarios, such as logging into an application or opening files. 

* System testing
System testing is a black box testing method used to evaluate the completed and integrated system, as a whole, to ensure it meets specified requirements. 
The functionality of the software is tested from end-to-end and is typically conducted by a separate testing team than the development team before the product is pushed into production.

* Acceptance testing
Acceptance testing is the last phase of functional testing and is used to assess whether or not the final piece of software is ready for delivery. 
It involves ensuring that the product is in compliance with all of the original business criteria and that it meets the end user’s needs. 
This requires the product be tested both internally and externally, meaning you’ll need to get it into the hands of your end users for beta testing along with those of your QA team. 
Beta testing is key to getting real feedback from potential customers and can address any final usability concerns.


Non-functional testing methods incorporate all test types focused on the operational aspects of a piece of software. 
These include: 
* Performance testing
* Security testing
* Usability testing
* Compatibility testing


* Performance testing
The goal is to test its responsiveness and stability in real user situations. Performance testing can be broken down into four types: 
Load testing —> increasing amounts
Stress testing —> peak load
Endurance testing(soak testing) —> load over longer amounts of time —> to find memory leaks
Spike testing —> larger bursts of concurrent user —> load is suddenly and drastically increased

* Security testing
 To determine if the information and data in a system is protected.
The goal is to purposefully find loopholes and security risks in the system that could result in unauthorised access to or the loss of information by probing the application for weaknesses.

* Usability testing
Usability testing is a testing method that measures an application’s ease-of-use from the end-user perspective and is often performed during the system or acceptance testing stages.
The goal is to determine whether or not the visible design and aesthetics of an application meet the intended workflow for various processes, such as logging into an application.

* Compatibility testing
how an application or piece of software will work in different environments.
It is used to check that your product is compatible with multiple operating systems, platforms, browsers, or resolution configurations.



Software QA Tools : 
1. Selenium
A testing framework for web applications on platforms such as Linux, Mac, and Windows.
Selenium is also used to test browser compatibility. 
Developers can test in a number of languages, such as Java, Groovy, PHP, Ruby, C#, Python and Perl. Selenium is part of most major browsers, including Firefox and Chrome.

2. Jenkins
Jenkins is a continuous integration (CI) tool for testing codebase changes in real time. 
Jenkins lets you detect and resolve codebase problems quickly and automate build testing. 
An open-source program, it was forked from the Hudson CI tool. 
Jenkins runs on servers in a container and supports version control tools such as Perforce, Git, and Subversion.

3. GitHub
GitHub is a version control repository used by millions of developers. 
Many software testing tools can be linked to GitHub accounts, so that reported defects are automatically recorded. 
For example, you might run manual tests on another testing tool while using GitHub for bug tracking.

4. Postman
Postman is a robust toolchain that allows API developers to share, test, document, and monitor their APIs. 
With this tool, you can easily integrate the tests into your build automation. 
Postman is extremely valuable for functional testers and developers.



LOCATORS

Locating elements in Selenium WebDriver is performed with the help of
findElement() and findElements() methods provided by WebDriver and
WebElement class.
—> findElement() returns a WebElement object based on a specified search
criteria or ends up throwing an exception if it does not find any element
matching the search criteria.
—> findElements() returns a list of WebElements matching the search criteria.
If no elements are found, it returns an empty list.

Method :
Syntax :
Description :

By ID 
driver.findElement(By.id(<element ID>)) 
Locates an element using the ID attribute

By name
driver.findElement(By.name(<element name>)) 
Locates an element using the Name attribute

By class name
driver.findElement(By.className(<element class>)) 
Locates an element using the Class attribute

By tag name
driver.findElement(By.tagName(<htmltagname>)) 
Locates an element using the HTML tag

By link text
driver.findElement(By.linkText(<linktext>)) 
Locates a link using link text

By partial link text
driver.findElement(By.partialLinkText(<linktext>)) 
Locates a link using the link's partial text

By CSS 
driver.findElement(By.cssSelector(<css selector>)) 
Locates an element using the CSS selector

By XPath
driver.findElement(By.xpath(<xpath>)) 
Locates an element using XPath query


