# JavaFX Examples - ITS Steve Jobs Academy

This repository contains a collection of JavaFX examples developed during the course at the ITS Steve Jobs Academy. The examples demonstrate various aspects of JavaFX application development, from basic UI components to more complex interfaces.

## Repository Structure

The repository is organized as follows:

- **src/main/java/**
  - **com/example/**: Contains the main application structure
  - **lezione_10/**: Contains various JavaFX examples
    - Basic UI components
    - Layout management
    - Event handling
    - TableView implementation

## JavaFX Examples

### Basic Components

- **TestJavaFX**: A simple application to verify JavaFX is configured correctly
- **JavaFXExample**: Demonstrates basic button functionality with event handling
- **JavaFXLabelExample**: Shows how to use labels and update their content dynamically
- **JavaFXTextFieldExample**: Demonstrates text input handling with TextField components

### Advanced Components

- **JavaFXTableViewExample**: Demonstrates how to create and populate a TableView with data
  - Includes a custom Persona class
  - Shows how to define and configure table columns
  - Demonstrates binding data to the table

### Model Classes

- **Studente**: A model class representing a student with properties:
  - Nome (Name)
  - Cognome (Surname)
  - Voto (Grade)

## How to Run the Examples

Each example is a standalone JavaFX application. To run an example:

1. Ensure you have Java and JavaFX properly installed
2. Compile the project using Maven:
   ```bash
   mvn compile
   ```
3. Run a specific example:
   ```bash
   mvn javafx:run -Dmain.class=lezione_10.TestJavaFX
   ```
   (Replace `TestJavaFX` with the name of the example you want to run)

## Requirements

- Java 11 or higher
- JavaFX SDK
- Maven

## Project Setup

The project uses Maven for dependency management. The main configuration is in the `pom.xml` file at the root of the project.

## Educational Objectives

These examples were designed to:
- Understand the fundamental concepts of JavaFX
- Learn how to create graphical user interfaces
- Implement event-driven programming
- Work with various JavaFX components and layouts
- Apply MVC (Model-View-Controller) design pattern

---

*This repository was created as part of the educational journey at ITS Steve Jobs Academy.*