package main;

import competidores.Atleta;
import java.util.Scanner;

public class Principal {

    public static int indiceGanador(Atleta a[]) {
        float ganador = a[0].getTiempoAtleta();
        int indice = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i].getTiempoAtleta() < ganador) {
                ganador = a[i].getTiempoAtleta();
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        int numeroAtleta;
        String nombreAtleta;
        float tiempoAtleta;
        int numeroAtletas;
        int indiceAGanador;
        Scanner es = new Scanner(System.in);
        System.out.println("Cuantos atletas competiran?");
        numeroAtletas = es.nextInt();

        //Atletas
        Atleta a[] = new Atleta[numeroAtletas];
        for (int i = 0; i < a.length; i++) {
           
            System.out.println("Datos del atleta " + (i + 1));
            System.out.println("Ingrese el numero ");
            numeroAtleta = es.nextInt();
            es.nextLine();
            System.out.println("Ingrese el nombre ");
            nombreAtleta = es.nextLine();
            System.out.println("Ingrese el tiempo");
            tiempoAtleta = es.nextFloat();
            a[i] = new Atleta(numeroAtleta, nombreAtleta, tiempoAtleta);
        }
        indiceAGanador = indiceGanador(a);
        System.out.println("El atleta ganador es ");
        System.out.println(a[indiceAGanador].mostrarDatos());

    }
}
