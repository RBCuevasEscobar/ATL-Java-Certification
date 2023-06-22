package Clase7;

import java.util.Scanner;

public class DynamicStoryWithArrays {
    public static void main(String[] args) {
        String[] _storyChapters = new String[6];
        _storyChapters[0] = "\"Historia: El viaje mágico\n" + "\n" +
                "Había una vez un joven llamado Lucas, quien vivía en un pequeño pueblo rodeado de montañas. Un día, mientras exploraba el bosque cerca de su casa, encontró una misteriosa cueva oculta detrás de un árbol gigante. Sin pensarlo dos veces, decidió entrar en ella.\n"
                + "Al entrar a la cueva, Lucas descubrió un antiguo libro mágico sobre una mesa. Con curiosidad, comenzó a hojear sus páginas y se encontró con un hechizo que prometía un viaje extraordinario.\n";
        _storyChapters[1] = "Había tres opciones: " + "\n" +
                "1. Hechizo del tiempo: Si Lucas decidía lanzar este hechizo, podría viajar al pasado y presenciar eventos históricos importantes.\\n\" +\n" +
                "2. Hechizo de la transformación: Si Lucas lanzaba este hechizo, podría convertirse en cualquier animal y explorar el mundo desde una nueva perspectiva.\\n\" +\n" +
                "3. Hechizo de la aventura: Si Lucas optaba por este hechizo, se embarcaría en una emocionante expedición a una tierra desconocida llena de criaturas mágicas.\\n\";\n";
        _storyChapters[2] = "Lucas eligió el hechizo del tiempo.\n" +
                "\nAl recitar el hechizo del tiempo, Lucas fue envuelto en una brillante luz y se encontró en el corazón de un gran acontecimiento histórico: la firma de la Declaración de Independencia. Fascinado, observó cómo los fundadores del país redactaban el documento que cambiaría la historia. Al regresar al presente, Lucas estaba lleno de inspiración y conocimiento sobre el pasado.\n";
        _storyChapters[3] = "Lucas eligió el hechizo de la transformación.\n" +
                "\nRecitando el hechizo de la transformación, Lucas sintió cómo su cuerpo se transformaba en una majestuosa águila. Alzó el vuelo y sobrevoló el pueblo, admirando la belleza del paisaje desde las alturas. Durante su aventura, descubrió una colonia de animales en peligro de extinción y pudo alertar a las autoridades para proteger su hábitat. Al regresar a su forma humana, Lucas se sintió comprometido con la conservación del medio ambiente.\n";
        _storyChapters[4] = "Lucas eligió el hechizo de la aventura.\n" +
                "\nAl lanzar el hechizo de la aventura, Lucas se encontró en un mundo de fantasía, lleno de criaturas mágicas y paisajes impresionantes. Hizo amistad con un unicornio y juntos emprendieron un viaje para liberar a una princesa encantada. Superaron desafíos y resolvieron enigmas hasta que finalmente lograron deshacer el hechizo y liberar a la princesa. Al regresar a casa, Lucas había ganado un amigo leal y aprendió el valor del coraje y la amistad.\n";
        _storyChapters[5] = "¡Y así termina la historia del viaje mágico de Lucas! Cada elección ofreció una experiencia única y dejó una marca en su vida. Recuerda que siempre puedes volver a leer y elegir otra opción para vivir diferentes aventuras.\n";

        System.out.println("Uso de Operadores Logicos Ejemplo 4 - ELige tu propia aventura.");
        System.out.println(" ");
        System.out.println(_storyChapters[0]);
        System.out.println(_storyChapters[1]);
        Scanner _keyboard = new Scanner(System.in);
        System.out.print("Cual opcion eliges para continuar la historia?: ");
        Integer _selectionNumber = _keyboard.nextInt();
        System.out.println(" ");

        if (_selectionNumber == 1) System.out.println(_storyChapters[_selectionNumber + 1]);
        if (_selectionNumber == 2) System.out.println(_storyChapters[_selectionNumber + 1]);
        if (_selectionNumber == 3) System.out.println(_storyChapters[_selectionNumber + 1]);

       System.out.println(_storyChapters[5]);

    }
}
