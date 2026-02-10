# selenium-ecommerce-automation
Selenium TestNG automation framework for e-commerce testing
# Selenium E-Commerce Automation Framework

This project is a UI automation framework developed using Java, Selenium WebDriver, TestNG, and Maven.
It automates core user workflows of a sample e-commerce application and demonstrates practical implementation of automation testing concepts such as Page Object Model, synchronization handling, and assertion-based validation.

The goal of this project is to practice building a structured automation framework and gain hands-on experience with real-world testing scenarios.

---

## Project Overview

The framework automates the following application flows:

Authentication

* Valid user login verification
* Logged-in state validation

Product Search

* Searching products
* Validating search results

Cart Operations

* Adding product to cart
* Verifying cart content

Checkout Flow

* Adding item to bag
* Filling shipping details
* Submitting order
* Validating order confirmation

Additional Support Features

* Screenshot capture during execution
* Explicit wait usage for stability
* Modular and reusable page methods

---

## Technology Stack

* Java
* Selenium WebDriver
* TestNG
* Maven
* Git
* ChromeDriver

---

## Framework Design

The project follows the Page Object Model design pattern to separate test logic from UI interaction logic.

Structure:

src/main/java

* base — WebDriver setup and initialization
* pages — Page classes containing locators and actions
* utils — Utility classes such as screenshot capture

src/test/java

* tests — Test classes implementing scenarios

Root Files

* pom.xml — Dependencies and build configuration
* testng.xml — Test execution configuration

---

## How to Run Tests

Using Maven:

mvn clean test

Using TestNG from IDE:

Run the testng.xml file

---

## What I Learned From This Project

* Structuring an automation framework
* Writing reusable page objects
* Handling dynamic UI elements
* Using explicit waits
* Applying assertions for validation
* Managing dependencies using Maven
* Version controlling using Git

---

## Author

Siddheshwar Munde

This project was created for learning and demonstrating automation testing skills for entry-level QA and automation roles.
