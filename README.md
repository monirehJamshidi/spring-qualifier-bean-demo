# spring-qualifier-bean-demo


[🇮🇷  فارسی ](./README.fa.md)

## 📌 Overview
This project demonstrates Dependency Injection (DI) and Qualifier usage in Spring Framework using JavaConfig with @Bean methods.

It does not use @Component or @Service; all beans are declared manually with @Bean.

Multiple implementations of the Car interface (BMW and Kia) exist, and a Manager class uses @Qualifier to specify which implementation to inject.



## 📂 Project Structure

src/main/java/org/j2os/\
├─ Car.java\
├─ BMW.java\
├─ Kia.java\
├─ Manager.java\
├─ AppConfig.java\
└─ Main.java



## 🧩 Key Features
- Java-based Spring configuration (no XML)
- Bean definitions with @Bean methods
- Using @Qualifier to choose the specific bean to inject
- Prototype-scoped Manager class
- Constructor-based Dependency Injection (best practice)

## ▶️ How to Run
1. Import the project into IntelliJ IDEA or Eclipse
2. Ensure Spring Core & Context dependencies are on the classpath
3. Run the Main class.

Expected output:

Manager Constructor **
Manager is running...
Kia started...
Manager Constructor **
Manager is running...
Kia started...




## 🎯 Purpose
This project is ideal for learning:
- How to manage multiple beans of the same type with @Qualifier
- How to define beans manually using @Bean
- Constructor-based dependency injection
- Prototype bean scope in Spring
