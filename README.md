\# Programación III - UTN - Backend en Java



Repositorio del Trabajo Práctico N°7 de la asignatura Programación III

de la Tecnicatura Universitaria en Programación (UTN), enfocado en el

uso de Streams, expresiones lambda y operaciones funcionales en Java.



\##

\* \*\*TP7 - Programación Funcional:\*\*

\* Uso de `Stream` para procesar colecciones de forma declarativa.

\* Operaciones intermedias (`filter`, `map`, `mapToInt`, `mapToDouble`) y terminales (`sum`, `forEach`, `findFirst`).

\* Uso de referencias a métodos (`::`) como alternativa a expresiones lambda.

\* Implementación de la interfaz `Calculable` con el método `calcularTotal()` usando streams.



\## Objetivo

Practicar operaciones intermedias y terminales de los \*\*Streams en Java\*\*

para procesar colecciones de forma declarativa, aplicando \*\*programación funcional\*\*

con lambdas, referencias a métodos y collectors.



\## Contenido del TP



\- \*\*Punto 1:\*\* Método `calcularTotal()` en clase `Pedido` usando `mapToDouble` + `sum()`

\- \*\*Punto 2:\*\* Filtrado por consola de productos disponibles usando `filter` + referencia a método

\- \*\*Punto 3:\*\* Conteo total de ítems de un pedido usando `mapToInt` + `sum()`

\- \*\*Punto 4:\*\* Detección de productos con stock menor a 5 usando `filter` con lambda



\## Estructura del Proyecto



El proyecto sigue el paradigma de \*\*POO + Programación Funcional\*\*, con herencia desde una clase abstracta `Base`.



\- `entities/` — Clases del modelo (`Base`, `Usuario`, `Pedido`, `Producto`, `Categoria`, `DetallePedido`)

\- `entities/Calculable` — Interface con método `calcularTotal()`

\- `enums/` — `Estado`, `FormaPago`, `Rol`



\## Tecnologías Utilizadas



\- \*\*Java\*\* (JDK 17)

\- \*\*Gradle\*\* (gestión de dependencias y build)

\- \*\*Apache NetBeans IDE\*\*

\- \*\*Git \& GitHub\*\*



\## Autor



\*\*Nicolás A. Pannunzio\*\* – Full Stack Developer \& QA Specialist  

🔗 \[Perfil de LinkedIn](#)

