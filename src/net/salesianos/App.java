package net.salesianos;

import net.salesianos.EmpresaReparacion.Reparacion;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class App {
    public static void main(String[] args) {

        Queue<Reparacion> cola = new LinkedList<>();

        cola.add(new Reparacion(1, "Ana", "Cambio de pantalla", false));
        cola.add(new Reparacion(2, "Luis", "Bateria dañada", false));
        cola.add(new Reparacion(3, "Marta", "Teclado roto", true));
        cola.add(new Reparacion(4, "Pedro", "Puerto de carga", false));
        cola.add(new Reparacion(5, "Sergio", "Añadir disco duro", true));

        System.out.println("EJERCICIO DE REPARACIO");

        System.out.println("________________________________________________________");

        System.out.println(cola);

        System.out.println("________________________________________________________");

        System.out.println(cola.peek());

        System.out.println("________________________________________________________");

        Stack<Reparacion> pila = new Stack<>();

        pila.push(cola.poll());
        pila.push(cola.poll());

        System.out.println(pila.peek());

        System.out.println("________________________________________________________");

        pila.pop();

        System.out.println(cola.size());

        System.out.println("________________________________________________________");

        System.out.println(cola.isEmpty());

        System.out.println("--------------------------------------------------------");

        System.out.println("EJERCICIO DE CENTRO EDUCATIVO");

        System.out.println("--------------------------------------------------------");

        System.out.println("EJERCICIO DE VIDEOJUEGOS");

    }
}