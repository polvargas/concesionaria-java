Concesionaria de Vehículos - Java Spring Boot
👨‍💻 Autor
Pablo Vargas

📌 Descripción del proyecto
Este proyecto simula el funcionamiento básico de una concesionaria de vehículos utilizando Java con Spring Boot.
Se aplica programación orientada a objetos (POO), Collections y Streams para realizar operaciones sobre una lista de vehículos.

El sistema carga datos automáticamente y muestra resultados por consola sin interacción del usuario.

🧱 Tecnologías utilizadas
Java
Spring Boot (estructura del proyecto)
Maven
Lombok
API Streams
Java Collections
🏗️ Estructura del proyecto
ar.com.centro8.java.curso │ ├── entidades │ ├── Vehiculo (abstracta) │ ├── Auto │ └── Moto │ ├── interfaz │ └── Imprimible │ ├── service │ └── Concesionaria │ └── test └── TestConcesionaria

🚗 Modelo del dominio
Vehiculo (abstracta)
Clase base que contiene atributos comunes:

marca
modelo
precio
Implementa:

Comparable (orden natural por marca, modelo y precio)
Interfaz Imprimible
Auto
Extiende de Vehiculo e incorpora:

puertas
Moto
Extiende de Vehiculo e incorpora:

cilindrada
🔧 Funcionalidades del sistema
La clase Concesionaria permite:

Cargar vehículos automáticamente
Mostrar todos los vehículos
Obtener el vehículo más caro
Obtener el vehículo más barato
Buscar vehículos por modelo
Ordenar vehículos por precio (descendente)
Ordenar vehículos por orden natural
📊 Uso de Streams
Se utilizan Streams para:

max() → obtener el más caro
min() → obtener el más barato
filter() → búsqueda por modelo
sorted() → ordenamientos
▶️ Ejecución del programa
La ejecución se realiza desde:

TestConcesionaria.java

Este ejecuta todos los métodos de la concesionaria y muestra los resultados por consola.

📌 Características del diseño
Separación por capas (entidades, service, test)
Uso de herencia y polimorfismo
Aplicación de interfaz
Uso de Collections y Streams
Código sin entrada por teclado (datos cargados automáticamente)
📤 Salida
El programa imprime por consola:

Listado de vehículos
Vehículo más caro y más barato
Búsqueda por modelo
Ordenamiento por precio
Orden natural
