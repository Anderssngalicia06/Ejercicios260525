package JuegoDePreguntas;

public class MainPreguntas {

    public static void main(String[] args) {
        Nivel2Preguntas obj = new Nivel2Preguntas();
        obj.imprimePreguntas();

        System.out.println("*************MARCADOR*************");
        System.out.println("Nivel 2");
        System.out.println("Tu puntaje es:" + obj.puntaje);
    }

}
