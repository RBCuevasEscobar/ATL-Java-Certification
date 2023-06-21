package Clase6;

import java.util.Scanner;

public class DynamicStory {
    public static void main(String[] args) {
        String _storyIntroduction = "Historia: El viaje mágico\n" +
                "\n" +
                "Había una vez un joven llamado Lucas, quien vivía en un pequeño pueblo rodeado de montañas. Un día, mientras exploraba el bosque cerca de su casa, encontró una misteriosa cueva oculta detrás de un árbol gigante. Sin pensarlo dos veces, decidió entrar en ella.\n" +
                "\n" +
                "Al entrar a la cueva, Lucas descubrió un antiguo libro mágico sobre una mesa. Con curiosidad, comenzó a hojear sus páginas y se encontró con un hechizo que prometía un viaje extraordinario. ";
        String _storyMainDecision = "Había tres opciones:\n" +
                "\n" +
                "1. Hechizo del tiempo: Si Lucas decidía lanzar este hechizo, podría viajar al pasado y presenciar eventos históricos importantes.\n" +
                "2. Hechizo de la transformación: Si Lucas lanzaba este hechizo, podría convertirse en cualquier animal y explorar el mundo desde una nueva perspectiva.\n" +
                "3. Hechizo de la aventura: Si Lucas optaba por este hechizo, se embarcaría en una emocionante expedición a una tierra desconocida llena de criaturas mágicas.\n";
        String _storyBranchOne = "Lucas eligió el hechizo del tiempo.\n" +
                "Al recitar el hechizo del tiempo, Lucas fue envuelto en una brillante luz y se encontró en el corazón de un gran acontecimiento histórico: la firma de la Declaración de Independencia. Fascinado, observó cómo los fundadores del país redactaban el documento que cambiaría la historia. Al regresar al presente, Lucas estaba lleno de inspiración y conocimiento sobre el pasado.";
        String _storyBranchTwo = "Lucas eligió el hechizo de la transformación.\n" +
                "Recitando el hechizo de la transformación, Lucas sintió cómo su cuerpo se transformaba en un majestuoso águila. Alzó el vuelo y sobrevoló el pueblo, admirando la belleza del paisaje desde las alturas. Durante su aventura, descubrió una colonia de animales en peligro de extinción y pudo alertar a las autoridades para proteger su hábitat. Al regresar a su forma humana, Lucas se sintió comprometido con la conservación del medio ambiente.";
        String _storyBranchThree = "Lucas eligió el hechizo de la aventura.\n" +
                "Al lanzar el hechizo de la aventura, Lucas se encontró en un mundo de fantasía, lleno de criaturas mágicas y paisajes impresionantes. Hizo amistad con un unicornio y juntos emprendieron un viaje para liberar a una princesa encantada. Superaron desafíos y resolvieron enigmas hasta que finalmente lograron deshacer el hechizo y liberar a la princesa. Al regresar a casa, Lucas había ganado un amigo leal y aprendió el valor del coraje y la amistad.";
        String _storyEnd = "¡Y así termina la historia del viaje mágico de Lucas! Cada elección ofreció una experiencia única y dejó una marca en su vida. Recuerda que siempre puedes volver a leer y elegir otra opción para vivir diferentes aventuras.";

        System.out.println("Uso de Operadores Logicos Ejemplo 4 - ELige tu propia aventura.");
        System.out.println(" ");
        System.out.println(_storyIntroduction);
        System.out.println(" ");
        System.out.println(_storyMainDecision);
        Scanner _keyboard = new Scanner(System.in);
        System.out.print("Cual opcion eliges para continuar la historia?: ");
        Integer _selectionNumber = _keyboard.nextInt();
        System.out.println(" ");

        if (_selectionNumber == 1) System.out.println(_storyBranchOne);
        if (_selectionNumber == 2) System.out.println(_storyBranchTwo);
        if (_selectionNumber == 3) System.out.println(_storyBranchThree);

        System.out.println(" ");
        System.out.println(_storyEnd);
    }
}
