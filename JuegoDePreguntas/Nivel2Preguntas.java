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
                "El cuerpo humano tiene 206 huesos.",
                "La montaña con mayor altura en el mundo es el cerro verde.",
                "El salvador ha ganado 3 mundiales de futbol.",
                "Rusia es el pais mas grande del mundo."
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
            System.out.println("Felicidades es correcto!! :)");
            System.out.println("Ganaste 20 puntos");
            puntaje += 20;
        } else {
            System.out.println("Incorrecto, vuelve a intentarlo");
            System.out.println("Perdiste 10 puntos");
            puntaje -= 10;
        }
        System.out.println();
    }

    private void puntajeFalso() {
        if (respuesta.equalsIgnoreCase("Falso")) {
            System.out.println("Felicidades es correcto!! :)");
            System.out.println("Ganaste 20 puntos");
            puntaje += 20;
        } else {
            System.out.println("Incorrecto, vuelve a intentarlo");
            System.out.println("Perdiste 10 puntos");
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
