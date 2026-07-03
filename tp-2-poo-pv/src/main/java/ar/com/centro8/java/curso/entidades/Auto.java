package ar.com.centro8.java.curso.entidades;

import lombok.Getter;
import lombok.Setter;
 /**
 * Representa un automóvil dentro del sistema de la concesionaria.
 * Hereda de Vehículo y agrega la cantidad de puertas.
 */
@Getter
@Setter
public class Auto extends Vehiculo {

    private int puertas;
      /**
      * Inicializa un auto con sus atributos principales.
      */

    public Auto(String marca, String modelo, double precio, int puertas) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

     /**
     * Devuelve la representación en texto del auto.
     */
    @Override
    public String toString() {
        return obtenerDatosBase() + " // Puertas: " + puertas + " // Precio: " + obtenerPrecioFormateado();
    }
}
