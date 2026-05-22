# Programación III - UTN - Backend en Java

Repositorio del Trabajo Práctico N°7 de la asignatura Programación III de la Tecnicatura Universitaria en Programación (UTN), enfocado en el uso de Streams, expresiones lambda y operaciones funcionales en Java.

## Funcionalidades Implementadas

* **TP7 - Programación Funcional:**
  * Uso de `Stream` para procesar colecciones de forma declarativa.
  * Operaciones intermedias (`filter`, `map`, `mapToInt`, `mapToDouble`) y terminales (`sum`, `forEach`, `findFirst`).
  * Uso de referencias a métodos (`::`) como alternativa a expresiones lambda.
  * Implementación de la interfaz `Calculable` con el método `calcularTotal()` usando streams.

## Objetivo

Practicar operaciones intermedias y terminales de los **Streams en Java** para procesar colecciones de forma declarativa, aplicando **programación funcional** con lambdas, referencias a métodos y collectors.

## Estructura del Proyecto

El proyecto sigue el paradigma de **POO**, con herencia desde una clase abstracta `Base`.

* `entities/` — Clases del modelo (`Base`, `Usuario`, `Pedido`, `Producto`, `Categoria`, `DetallePedido`) e interfaz `Calculable`.
* `enums/` — Enumeraciones para garantizar la integridad de los datos (`Estado`, `FormaPago`, `Rol`).
* `Main.java` — Clase principal con datos mockeados y ejecución de las operaciones funcionales requeridas.

## Tecnologías Utilizadas

* **Java** (JDK 17)
* **Gradle** (Gestión de dependencias y build)
* **Apache NetBeans IDE**
* **Git & GitHub**

## Autor

**Nicolás A. Pannunzio** – Full Stack Developer & QA Specialist
🔗 [Perfil de LinkedIn](https://www.linkedin.com/in/nicolas-a-pannunzio-/)
