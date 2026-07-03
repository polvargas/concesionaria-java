package ar.com.centro8.java.curso.test;

import ar.com.centro8.java.curso.entidades.Vehiculo;
import ar.com.centro8.java.curso.service.Concesionaria;
 /**
 * Clase principal que ejecuta la aplicación.
 * Muestra la salida requerida por consola.
 */

public class TestConcesionaria {

    public static void main(String[] args) {
         // Se instancia la concesionaria con los datos cargados
        Concesionaria concesionaria = new Concesionaria();

        System.out.println();
         // Muestra todos los vehículos cargados
        concesionaria.obtenerVehiculos().forEach(System.out::println);

        System.out.println();
        System.out.println("=".repeat(29));
        System.out.println();

        Vehiculo vehiculoMasCaro = concesionaria.obtenerVehiculoMasCaro().orElseThrow();
        Vehiculo vehiculoMasBarato = concesionaria.obtenerVehiculoMasBarato().orElseThrow();
        Vehiculo vehiculoConLetraY = concesionaria.buscarPrimerVehiculoPorModelo("Y").orElseThrow();
        // Mostrar resultados principales

        System.out.println("Vehículo más caro: " + vehiculoMasCaro.obtenerDescripcionCorta());
        System.out.println("Vehículo más barato: " + vehiculoMasBarato.obtenerDescripcionCorta());
        System.out.println("Vehículo que contiene en el modelo la letra 'Y': "
                + vehiculoConLetraY.obtenerDescripcionCorta()
                + " "
                + vehiculoConLetraY.obtenerPrecioFormateado());

        System.out.println();
        System.out.println("=".repeat(29));
        System.out.println();
        // Ordenamiento por precio (de mayor a menor)
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        concesionaria.ordenarPorPrecioMayorAMenor()
                .forEach(vehiculo -> System.out.println(vehiculo.obtenerDescripcionCorta()));

        System.out.println();
        System.out.println("=".repeat(29));
        System.out.println();
         // Orden natural definido por Comparable (marca, modelo, precio)
        System.out.println("Vehículos ordenados por orden natural (marca, modelo, precio):");
        concesionaria.ordenarPorOrdenNatural().forEach(System.out::println);
        System.out.println();
    }
}
