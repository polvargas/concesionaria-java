package ar.com.centro8.java.curso.entidades;

import lombok.Getter;
import lombok.Setter;

/**
 * Representa una moto dentro del sistema de la concesionaria.
 * Hereda de Vehículo y agrega el atributo cilindrada.
 */
@Getter
@Setter

public class Moto extends Vehiculo {

    private String cilindrada;

    /**
     * Inicializa una moto con sus atributos principales.
     */
    public Moto(String marca, String modelo, double precio, String cilindrada) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    /**
     * Devuelve la representación en texto de la moto.
     */
    @Override
    public String toString() {
        return obtenerDatosBase() + " // Cilindrada: " + cilindrada + " // Precio: " + obtenerPrecioFormateado();
    }
}
