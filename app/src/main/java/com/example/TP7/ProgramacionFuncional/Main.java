package com.example.TP7.ProgramacionFuncional;

import com.example.TP7.ProgramacionFuncional.entities.*;
import com.example.TP7.ProgramacionFuncional.enums.Estado;
import com.example.TP7.ProgramacionFuncional.enums.FormaPago;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // --- MOCKS ---
        Categoria comida  = new Categoria("Comida",  "Alimentos y snacks");
        Categoria bebidas = new Categoria("Bebidas", "Bebidas frias y calientes");

        Producto p1 = new Producto();
        p1.setId(1L);
        p1.setNombre("Pancho");
        p1.setPrecio(1500.0);
        p1.setStock(10);
        p1.setDisponible(true);
        p1.setCategoria(comida);

        Producto p2 = new Producto();
        p2.setId(2L);
        p2.setNombre("Bebida");
        p2.setPrecio(1000.0);
        p2.setStock(3);   // bajo stock -> punto 4
        p2.setDisponible(true);
        p2.setCategoria(bebidas);

        Producto p3 = new Producto();
        p3.setId(3L);
        p3.setNombre("Hamburguesa Vegana");
        p3.setPrecio(3000.0);
        p3.setStock(0);   // sin stock
        p3.setDisponible(false);
        p3.setCategoria(comida);

        List<Producto> catalogo = new ArrayList<>();
        catalogo.add(p1);
        catalogo.add(p2);
        catalogo.add(p3);

        Pedido pedido = new Pedido();
        pedido.setFecha(LocalDate.now());
        pedido.setEstado(Estado.PENDIENTE);
        pedido.setFormaPago(FormaPago.EFECTIVO);
        pedido.addDetallePedido(2, p1);
        pedido.addDetallePedido(2, p2);

        System.out.println("=== RESULTADOS TP7: PROGRAMACION FUNCIONAL ===");

        // --- PUNTO 1 ---
        System.out.println("\n1) Total del pedido:");
        pedido.getDetalles().forEach(System.out::println);
        System.out.printf("-> TOTAL: $%.2f%n", pedido.getTotal());

        // --- PUNTO 2 ---
        System.out.println("\n2) Productos disponibles en el catalogo:");
        catalogo.stream()
                .filter(Producto::getDisponible)
                .forEach(p -> System.out.println("- " + p));

        // --- PUNTO 3 ---
        System.out.println("\n3) Cantidad total de items en el pedido:");
        int totalItems = pedido.getDetalles().stream()
                .mapToInt(DetallePedido::getCantidad)
                .sum();
        System.out.println("-> El pedido tiene " + totalItems + " items en total.");

        // --- PUNTO 4 ---
        System.out.println("\n4) Alerta: Productos con bajo stock (menos de 5 unidades):");
        catalogo.stream()
                .filter(p -> p.getStock() < 5)
                .forEach(p -> System.out.printf("- %s (Quedan: %d unidades)%n",
                        p.getNombre(), p.getStock()));

        System.out.println("\n==============================================");
    }
}