# TP 2 - Concesionaria de autos y motos

Proyecto Java creado con estructura Spring Boot y Maven para resolver la segunda actividad obligatoria entregable de POO.

## Estructura principal

```text
src/main/java/ar/com/centro8/java/curso
├── entidades
│   ├── Vehiculo.java
│   ├── Auto.java
│   └── Moto.java
├── interfaz
│   └── Imprimible.java
├── service
│   └── Concesionaria.java
├── test
│   └── TestConcesionaria.java
└── Tp2PooApplication.java
```

## Qué hace cada paquete

- `entidades`: contiene las clases del dominio: `Vehiculo`, `Auto` y `Moto`.
- `interfaz`: contiene la interfaz `Imprimible`, usada para obtener una descripción corta del vehículo.
- `service`: contiene la clase `Concesionaria`, donde se carga la lista y se resuelven las búsquedas y ordenamientos.
- `test`: contiene `TestConcesionaria`, clase encargada de mostrar la salida por consola.

## Conceptos aplicados

- Clase abstracta: `Vehiculo`.
- Herencia: `Auto` y `Moto` heredan de `Vehiculo`.
- Interfaz: `Imprimible`.
- Comparable: `Vehiculo` implementa el orden natural por marca, modelo y precio.
- Collections: se usa `List`, `ArrayList` y `Collections.sort()`.
- Stream API: se usa `max()`, `min()`, `filter()` y `sorted()`.
- Sobrescritura de `toString()` en `Auto` y `Moto`.
- Carga de vehículos en un único método.

## Ejecución

Se puede ejecutar desde:

```text
src/main/java/ar/com/centro8/java/curso/test/TestConcesionaria.java
```

También se puede ejecutar la clase principal:

```text
src/main/java/ar/com/centro8/java/curso/Tp2PooApplication.java
```

La aplicación no solicita datos por teclado. Solo imprime la salida solicitada por consola y finaliza.
