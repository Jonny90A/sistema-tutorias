# Sistema de Tutorías

Proyecto académico para la implementación de patrones de diseño en un sistema de gestión de tutorías.

## Descripción

El proyecto permite representar algunas funcionalidades de un sistema de tutorías académicas, aplicando los patrones de diseño **Factory Method** y **Builder**.

El objetivo es mantener el código organizado, facilitar la creación de objetos y permitir futuras modificaciones de manera más sencilla.

## Patrones implementados

### Factory Method

Se utiliza para manejar la creación de diferentes tipos de notificaciones.

Los tipos implementados son:

- Email
- SMS
- WhatsApp
- Push

Este patrón permite separar la creación de las notificaciones de la lógica que las utiliza y facilita agregar nuevos tipos de notificación.

### Builder

Se utiliza para construir objetos de tipo `Reserva` de manera ordenada.

La reserva permite establecer:

- ID
- Fecha de reserva
- Estado

Además, se realizan validaciones antes de crear la reserva. Si no se establece un estado, se utiliza `CONFIRMADA` como valor predeterminado.

## Estructura del proyecto

```text
sistema-tutorias
├── src
│   └── main
│       └── java
│           └── ec.edu.uees.tutorias
│               ├── App.java
│               ├── domain
│               ├── factory
│               └── builder
├── uml
│   ├── factory-method.puml
│   └── builder.puml
├── pom.xml
├── .gitignore
└── README.md