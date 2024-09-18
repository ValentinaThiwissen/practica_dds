INTEGRANTES DEL GRUPO:
- Alberdi, Catalina
- Rohling Insua, Nataly
- Lazzati, Camila
- Thiwissen, Valentina

JUSTIFICACIONES: Modelado de Datos (Ejercicio 3)
- No decidimos persistir las api ( Distance Api Matrix y la de UTN). 
- Decidimos hacer la entidad coordenada para normalizar .
- Decidimos que la relación entre Cliente y Presupuesto sea One to Many.
- Tenemos dos enums en nuestra solución que los decidimos persistir en VARCHAR(255).
  
JUSTIFICACIONES: Persistencia de Datos (desde el modelo de clases hacia el modelo de datos) (Ejercicio 1)
- La interfaz Motivacion decidimos mapearla utilizando un converter ya que es una interfaz stateless, así nos aseguramos que no se pierda la referencia a la interfaz desde otras clases.
- P ara Rutina y DiaDeEntrenamiento realizamos un mapeo de clases recursivas, guardando un atributo en la tabla haciendo que se autoreferencien a si mismos guardando una FK en su misma tabla.

 Practica de persistencia de datos.
*Objetivo: Persistir las clases de dominio en una base de datos relacional.

* Enunciado: https://docs.google.com/document/d/1vYvJtox8C0DDLW5PqS4pkayPHpqbo57t3ISXmHe0Qak/edit?usp=sharing

* Para más información sobre cómo agregar JPA/Hiberante a nuestro proyecto, ver [este tutorial](https://docs.google.com/document/d/1dYvrVLRbFE9qwuKj5biz9oRBaRzj-K6ujIKOXNan02s/edit?ts=57e1f2b8#)
* Para una rama base con soporte para JPA, Java 17 y Spark, ver [acá](https://github.com/dds-utn/jpa-proof-of-concept-template/tree/jpa-spark-java-17)

