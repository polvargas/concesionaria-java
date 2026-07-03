package ar.com.centro8.java.curso.entidades;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import ar.com.centro8.java.curso.interfaz.Imprimible;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Clase abstracta que representa un vehículo genérico.
 * Define atributos y comportamiento común para autos y motos.
 * Implementa Imprimible y Comparable para reutilización y ordenamiento.
 */
@Getter
@Setter
@AllArgsConstructor
public abstract class Vehiculo implements Imprimible, Comparable<Vehiculo> {

    private String marca;
    private String modelo;
    private double precio;

     /**
     * Devuelve una descripción corta del vehículo (marca + modelo).
     */
    @Override
    public String obtenerDescripcionCorta() {
        return marca + " " + modelo;
    }

     /**
     * Devuelve el precio formateado en formato moneda argentino.
     */
    public String obtenerPrecioFormateado() {
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
        simbolos.setGroupingSeparator('.');
        simbolos.setDecimalSeparator(',');

        DecimalFormat formato = new DecimalFormat("#,##0.00", simbolos);
        return "$" + formato.format(precio);
    }

     /**
     * Devuelve los datos base del vehículo (marca y modelo).
     * Método protegido para reutilización en clases hijas.
     */
    protected String obtenerDatosBase() {
        return "Marca: " + marca + " // Modelo: " + modelo;
    }
     
     /**
     * Orden natural de vehículos:
     * 1. Marca
     * 2. Modelo
     * 3. Precio
     */
    @Override
    public int compareTo(Vehiculo otro) {
        int comparacionMarca = this.marca.compareToIgnoreCase(otro.marca);

        if (comparacionMarca != 0) {
            return comparacionMarca;
        }

        int comparacionModelo = this.modelo.compareToIgnoreCase(otro.modelo);

        if (comparacionModelo != 0) {
            return comparacionModelo;
        }

        return Double.compare(this.precio, otro.precio);
    }

      /**
      * Representación en texto del vehículo (definida por las clases hijas).
      */
    @Override
    public abstract String toString();
}
