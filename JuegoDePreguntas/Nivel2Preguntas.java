package JuegoDePreguntas;

import java.util.Scanner;

public class Nivel2Preguntas {

    public int puntaje;
    private String respuesta;
    private final String[] respuestas;
    private final String[] preguntas;
    private final Scanner ent;

    public Nivel2Preguntas() {
        this.puntaje = 0;
        this.ent = new Scanner(System.in);

        this.preguntas = new String[] {
                "El Salvador es el país más pequeño de Centroamérica.",
                "La moneda oficial de El Salvador es el córdoba.",
                "El Salvador tiene acceso tanto al Océano Atlántico como al Océano Pacífico.",
                "El café es uno de los principales productos de exportación de El Salvador."
        };

        this.respuestas = new String[] {
                "Verdadero",
                "Falso",
                "Falso",
                "Verdadero"
        };
    }

    private void puntajeVerdadero() {
        if (respuesta.equalsIgnoreCase("Verdadero")) {
            System.out.println("Correcto Brrrrravo :)");
            System.out.println("Ganaste 20 puntos, estás en tu PRIME");
            puntaje += 20;
        } else {
            System.out.println("Incorrecto, volvemos a caer en el mismo error");
            System.out.println("HAZ PERDIDO 10 PUNTOS POR ENCULADO");
            puntaje -= 10;
        }
        System.out.println();
    }

    private void puntajeFalso() {
        if (respuesta.equalsIgnoreCase("Falso")) {
            System.out.println("Correcto Brrrrravo :)");
            System.out.println("Ganaste 20 puntos, estás en tu PRIME");
            puntaje += 20;
        } else {
            System.out.println("Incorrecto, volvemos a caer en el mismo error");
            System.out.println("HAZ PERDIDO 10 PUNTOS POR ENCULADO");
            puntaje -= 10;
        }
        System.out.println();
    }

    public void imprimePreguntas() {
        for (int i = 0; i < preguntas.length; i++) {
            System.out.println("Pregunta " + (i + 1) + ": " + preguntas[i]);
            System.out.print("Responde (Verdadero/Falso): ");
            respuesta = ent.nextLine();

            if (respuestas[i].equalsIgnoreCase("Verdadero")) {
                puntajeVerdadero();
            } else {
                puntajeFalso();
            }
        }
    }



}
