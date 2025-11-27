# 🌱 Spring Core Projects – Complete Collection

This repository contains a collection of **Spring Core** examples built using **Java** and **Spring Framework**.  
Each project focuses on one concept, making it easy for beginners to understand Spring fundamentals.

---

## 📁 Projects Included

| S.No | Project Name | Description |
|------|--------------|-------------|
| 1 | **1_DependencyInjection** | Demonstrates Constructor & Setter Dependency Injection |
| 2 | **2_IOC_1** | Basics of IoC container and bean management |
| 3 | **2_IOC2** | More examples of Spring IoC |
| 4 | **3_SingleTon** | Shows default Singleton scope in Spring |
| 5 | **4_springBeanScopes** | Demonstrates bean scopes like singleton & prototype |
| 6 | **5_Autowiring_XML** | Autowiring using XML (`byName`, `byType`, `constructor`) |
| 7 | **6_Annotations_1** | Introduction to annotation-based configuration |
| 8 | **6_Annotations_2_DI** | Dependency Injection using annotations |
| 9 | **6_Annotations_3** | More advanced annotation usage |
| 10 | **7_SpringBeanLifecycle** | Bean initialization & destruction methods |
| 11 | **8_Lombok** | Using Lombok with Spring to reduce boilerplate code |

---

## 🛠 Technologies Used

- Java  
- Spring Core / Spring Framework  
- XML Configuration  
- Annotation-Based Configuration  
- Lombok  
- STS (Spring Tool Suite)

---
## Spring Notes 

## 1\. Spring Framework Overview

## 

The Spring Framework is an open source Java Framework that simplifies enterprise application development. It provides a *layered architecture* , making it easy to develop and manage Java applications efficiently.

*   Developed by: "Rod Johnson".
    
*   Developed in: The year 2003.
    
*   First Version Introduced: 2004 (1.x)].
    

Key Features of Spring 

| Feature | Description |
| --- | --- |
| Lightweight and Modular | The code will be reduced, based on requirement. |
| Supports Dependency Injection  |
| Enables AOP | Aspect-Oriented Programming. |
| Built-in Transaction Management | Provides built-in support for transaction management. |
| Easy Integration | Can integrate easily with other frameworks like Hibernate (JPA and JDBC). |
| Supports Microservices | Supports microservices architecture (Spring Boot). |

* * *

## 2\. Coupling and Dependency Injection (DI)

## 

Coupling 

| Type | Description |
| --- | --- |
| Tightly Coupled | Two components depend on each other very closely. If one changes, the other usually has to change as well. This strong dependency makes the parts harder to modify, test, or reuse independently. |
| Loose Coupling | Achieved using Abstraction. Spring Core uses Dependency Injection. |

*Dependency Injection (DI)* 

DI is the process of injecting a dependent object into a target object using the Target class.

3 Ways of Dependency Injection 

| Method | Description |
| --- | --- |
| 1. Field Injection | (variable)  |
| 2. Setter Injection | (Setter Method)  |
| 3. Constructor Injection | (Constructor) |

Constructor vs. Setter Injection Priority:

*   Constructor injection will happen first.
    
*   Setter injection will override the injected object.
    
*   Finally, the setter injection will get settled.
    

* * *

## 3\. Inversion of Control (IoC) and Spring Beans

## 

*Inversion of Control (IoC)* 

IoC is a principle which is used to manage and collaborate dependencies among the objects in the application.

| IoC Function | Definition |
| --- | --- |
| Managing | Creating the object and maintaining it. |
| Collaborate | Injecting the objects. |

  
                +----------------------+
                |   Configuration      |
                | (XML / Annotations)  |
                +----------+-----------+
                           |
                           v
+----------------+     +-----------+     +----------------+
|  Java Classes  | --> |    IoC    | --> | Spring Beans   |
+----------------+     +-----------+     +----------------+


Spring IoC is responsible for Dependency Injection. It uses Java classes and Configuration (XML/annotations).

*Spring Beans* 

The class which is managed by IoC is called a Spring Bean.

*Starting the IoC Container* 

There are 2 different ways:

| Method | Characteristics |
| --- | --- |
| Bean Factory (Interface) | Very outdated. Objects are created at runtime. Performance of the application will be reduced. |
| Application Context (Interface) | The performance can be improved by using this. Objects (if singleton) are created when the IoC Container gets started. |

Application Context Syntax:

 ApplicationContext context = new ClassPathXmlApplicationContext(String xmlFileLocation) 


*Retrieving a Bean Object* 

 Method Syntax:
 
Context.getBean(class); 

*Maven Project* 

We need to create a Maven Project because it:

*   Automates the building process and gives a standardizing structure for the project.
    
*   Helps in the complete application process.
    
*   Maven is a tool used for application development.
    
*   The configuration is done in the *pom.xml file*.
    

* * *

## 4\. XML Configuration Syntaxes

## 

Setter Injection (Property) 

Used to inject a dependent object using the ref attribute.

> XML Syntax:
> 
> XML
> 
>     <bean id = "TargetId" class = "Target Class">
>        <property name = "ref" ref = "dependentBeanId"/>
>     </bean>
>      

### Constructor Injection

## 

Used to inject a dependent object into the constructor.

> *XML Syntax:*
> 
> XML
> 
>     <bean id = "TargetId" class = "Target-class">
>        <constructor-arg name="refId" ref  ="dependentBeanId" />
>     </bean>
>      

* * *

## 5\. Singleton and Spring Bean Scopes

## Singleton Classes 

A class that is *allowed to create only one object.

*Advantages of Singleton Pattern:*

1.  Instead of creating a separate object, we can create a single object.
    
2.  We can reuse the same object (objects are costly resources).
    
3.  Improves the memory utilization and performance of the system.
    
    *   Example: In a backend application with 1 lakh requests, if 4 objects are created per request (4 lakh objects total), using singleton for shared resources like Ticket Counter and Token Generator reduces the number of objects drastically.
        

## Spring Bean Scopes 

Bean Scope will decide how many objects should be created for the spring bean classes.

*Types of Scopes* 

| Scope Type | Creation Behavior | Creation Time | Use Case/Note |
| --- | --- | --- | --- |
| 1. singleton (default) | Creates only one object. Objects are similar. | When the IoC Container (Application Context) gets started. | Default for Spring Beans. Good for shared, costly resources. |
| 2. prototype  | Creates multiple objects. Objects are not similar. | According to the programmer's request (when we call getBean() method). Won't create any object when the IoC container starts. | Good for non-shared, unique objects (e.g., Ticket, Tokens). |
| 3. request  | A new object is created for each and every HTTP request. | For each HTTP request. | Useful for web applications to store request-specific data. |
| 4. session | A new object is created for each and every HTTP Session. | Until the session is destroyed. | Useful for session-specific data. |

> Prototype Scope XML Syntax:
> 
> XML
> 
>     <bean id="employee" class "FQCN" scope = "prototype">
>        > </bean>
>      

* * *

## 6\. Autowiring

## 

*Autowiring* is used to identify dependent objects and inject them into the target object automaticall. When using the ref attribute, we are defining dependencies manually.

Autowiring works based on 4 *modes*:

| Mode | Identification Basis | Injection Type | Notes |
| --- | --- | --- | --- |
| 1. byName  | The reference variable should match with the ID of the dependent bean. | Internally uses Setter Injection. | The autowire attribute is set to "byName" in the target bean. |
| 2. byType  | Identifies the dependent object based on its Type. |  | Chance of getting ambiguity error (expected single matching bean but found 2). |
| 3. constructor  | Uses byName and byType to identify the dependent object. | Uses Constructor Injection. | Must mark this attribute in the target bean definition. |
| 4. no  | Injection is prevented. |  | If autowire is marked as no, the injection won't take place, leading to a Null Pointer Exception. |

Resolving Ambiguity in byType 

| Method | Description | Attribute Location |
| --- | --- | --- |
| 1. autowire-candidate="false"  | Marks a bean to be excluded from autowiring consideration. | In the dependent bean definition that should not be injected. |
| 2. primary="true" | Marks a bean as the preferred choice for injection. | In the dependent bean definition that should be injected. |

* * *

## 7\. Spring Annotations

## 

Annotations are used to reduce XML configuration and manage objects.

| Annotation | Description | Location/Type |
| --- | --- | --- |
| @Component | To represent a Java class as a Spring Bean class. The IoC container will create the object. | Class-level. Shouldn't be applied on abstract classes and interfaces. |
| @ComponentScan | Used to identify the spring beans available in the project. It starts scanning from the current package. | Used with configuration classes. |
| @Configuration  | Represents a Java class as a configuration class instead of using an XML file. The IoC container creates the object for it and includes it as a Spring Bean. | Class-level. |
| @Bean  | Used to explicitly define a bean in a Java-based config class. Tells the Spring container that the annotated method will create the object, which should be maintained by IoC. | Method-level. |
| @Autowired  | Helps with dependency injection by automatically finding the dependent object and injecting it into the target class. | Field, Constructor, or Setter Method. |
| @Qualifier  | Helps to qualify the object which needs to be injected when multiple objects are present (resolving ambiguity). | Used with @Autowired. |
| @Primary  | Used upon the class whose object has to get injected. The object will be having the priority to inject. | Class-level. |
| @Repository  | Creates an object and is typically used for classes that perform database operations. | Class-level. |

### @ComponentScan Base Packages Syntax

## 

To include multiple base packages for scanning:

> *Java Syntax:*
> 
> Java
> 
>     @ComponentScan (basePackages = {"com.shakti", "in.sravanthi"})
>      [cite: 346]

### @Autowired Injection Examples

## 

| Injection Type | Java Syntax |
| --- | --- |
| Field Injection | java @Autowired private Payment p;  |
| Constructor Injection | java @Autowired Shopping (Payment p) { // ... this.p = p; } |
| Setter Injection | java @Autowired void setP(Payment p) { // ... this.p = p; } |

### @Primary vs. @Qualifier

## 

*   @Primary: The object will have the priority to inject.
    
*   @Qualifier: If there are multiple beans with priority, you should use @Qualifier to single out the one to inject.
    

* * *

## 8\. Spring Bean Lifecycle

## 

The Spring Bean Lifecycle refers to the phases from Birth to Death for a class managed by IoC.

*   *@PostConstruct*: After creating the object. Used for initialization logic.
    
*   *@PreDestroy*: Just before destroying the object135. Used for cleanup logic.
    

Ways to Achieve Lifecycle Methods 136

| Method | Implementation |
| --- | --- |
| 1. XML | Use init-method and destroy-method attributes in the <bean> tag. |
| 2. Programmatic | Make use of 2 interfaces: InitializingBean and DisposableBean. |
| 3. Annotations | Use @PostConstruct and @PreDestroy. |

* * *

## 9\. Lombok

## 

Lombok is an External library 143 (Third party) that can be used with Spring144.

It provides:

*   Setter methods 
    
*   Getter methods 
    
*   0-parameter Constructors 
    
*   Parameterized Constructors
    
*   toString() methods
    
*   hashCode() 
    
*   equals() 
    

Lombok Annotations 

| Annotation | Description |
| --- | --- |
| @Setter | To generate setter methods for the variables. |
| @Getter | To generate getter methods for the variables. |
| @ToString | To generate the overridden toString() method. |
| @NoArgsConstructor | To generate the 0-parameter Constructor. |
| @AllArgsConstructor | To generate parameterized Constructors. |
| @EqualsAndHashCode | To generate hashCode() and equals() methods. |
| @Data | Equal to: @Setter + @Getter + @NoArgsConstructor + @ToString + @EqualsAndHashCode. |

*Notes on @Data*:

*   @Data won't provide a parameterized Constructor.
    
*   If you use @AllArgsConstructor with @Data, it won't provide the 0-parameter constructor. In this case, you need to use @NoArgsConstructor to get the 0-parameter constructor.
    

Benefits of Lombok 

*   Reduce Boilerplate code.
    
*   Improves Readability.
    
*   Increase Development Speed.
    
*   Reduce Errors.
    
*   Reduces Memory usage.
    

Summary: Less Code + Better Readability = Faster Development.

---

## 🚀 How to Run

1. Open **STS / Eclipse**  
2. Go to **File → Import → Existing Maven / Java Project**  
3. Select any project folder  
4. Run the main class  
5. Check console output  

---

## 🎯 Purpose

This repository helps beginners understand:

- What is IoC?  
- What is Dependency Injection?  
- How Spring manages beans  
- How autowiring works  
- How bean lifecycle works  
- How annotations simplify configuration  
- How Lombok reduces boilerplate  

---

