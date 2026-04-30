package net.salesianos;

import net.salesianos.Aplicacion.Videojuego;
import net.salesianos.CentroEducativo.Asistente;
import net.salesianos.EmpresaReparacion.Reparacion;

import java.util.*;
import java.io.*;

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

        HashSet<Asistente> set = new HashSet<>();

        set.add(new Asistente("12345678A", "Ana", "DAM1"));
        set.add(new Asistente("87654321B", "Luis", "ASIR1"));
        set.add(new Asistente("31102301B", "Pedro", "DAM2"));
        set.add(new Asistente("11223344C", "Marta", "DAM1"));

        System.out.println(set);
        System.out.println(set.size());

        HashMap<String, Integer> mapa = new HashMap<>();

        for (Asistente a : set) {
            mapa.put(a.getGrupo(),
                    mapa.getOrDefault(a.getGrupo(), 0) + 1);
        }

        System.out.println(mapa);
        System.out.println(mapa.get("DAM1"));
        System.out.println(mapa.containsKey("ASIR1"));

        mapa.remove("ASIR1");

        System.out.println("--------------------------------------------------------");

        System.out.println("EJERCICIO DE VIDEOJUEGOS");

        ArrayList<Videojuego> lista = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("videojuegos.csv"));

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] p = linea.split(",");
                lista.add(new Videojuego(p[0], p[1], Integer.parseInt(p[2])));
            }

            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        int totalHoras = 0;
        Videojuego max = lista.get(0);

        for (Videojuego v : lista) {
            totalHoras += v.getHorasJugadas();
            if (v.getHorasJugadas() > max.getHorasJugadas())
                max = v;
        }

        int totalJuegos = lista.size();
        double media = (double) totalHoras / totalJuegos;

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("resumen_videojuegos.txt"));
            bw.write("Total juegos: " + totalJuegos);
            bw.write("Total horas: " + totalHoras);
            bw.write("Media: " + media);
            bw.write("Max: " + max);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            BufferedWriter log = new BufferedWriter(new FileWriter("log_videojuegos.txt", true));
            log.write("OK\n");
            log.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}