package ar.com.centro8.java.curso.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import ar.com.centro8.java.curso.entidades.Auto;
import ar.com.centro8.java.curso.entidades.Moto;
import ar.com.centro8.java.curso.entidades.Vehiculo;

public class Concesionaria {

    private final List<Vehiculo> vehiculos;

    public Concesionaria() {
        this.vehiculos = cargarVehiculos();
    }

    private List<Vehiculo> cargarVehiculos() {
        List<Vehiculo> lista = new ArrayList<>();

        lista.add(new Auto("Peugeot", "206", 200000, 4));
        lista.add(new Moto("Honda", "Titan", 60000, "125c"));
        lista.add(new Auto("Peugeot", "208", 250000, 5));
        lista.add(new Moto("Yamaha", "YBR", 80500.50, "160c"));

        return lista;
    }
    /**
     * Devuelve una copia de la lista de vehículos
     */

    public List<Vehiculo> obtenerVehiculos() {
        return new ArrayList<>(vehiculos);
    }
    /**
     * Obtiene el vehículo con el mayor precio
     */

    public Optional<Vehiculo> obtenerVehiculoMasCaro() {
        return vehiculos.stream()
                .max(Comparator.comparingDouble(Vehiculo::getPrecio));
    }
    /**
     * Obtiene el vehículo con el menor precio
     */

    public Optional<Vehiculo> obtenerVehiculoMasBarato() {
        return vehiculos.stream()
                .min(Comparator.comparingDouble(Vehiculo::getPrecio));
    }
    /**
     * Busca el primer vehículo  que coincida  con el modelo indicado
     */

    public Optional<Vehiculo> buscarPrimerVehiculoPorModelo(String texto) {
        return vehiculos.stream()
                .filter(vehiculo -> vehiculo.getModelo().toLowerCase().contains(texto.toLowerCase()))
                .findFirst();
    }

    /**
     * Ordena los vehículos por precio de mayor a menor
     */
    public List<Vehiculo> ordenarPorPrecioMayorAMenor() {
        return vehiculos.stream()
                .sorted(Comparator.comparingDouble(Vehiculo::getPrecio).reversed())
                .toList();
    }
    /**
     * Ordena los vehículos segun el orden natural definido por Comparable
     */

    public List<Vehiculo> ordenarPorOrdenNatural() {
        List<Vehiculo> vehiculosOrdenados = new ArrayList<>(vehiculos);
        Collections.sort(vehiculosOrdenados);
        return vehiculosOrdenados;
    }
}
