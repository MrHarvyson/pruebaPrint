package es.vedruna;

/**
 * Clase que se usa para imprimir una cadena de texto y modifica en el caso de no iniciar la cadena en mayúscula.
 */
public class PrintMayus {

    /**
     *
     * @param texto texto que deseamos que se imprima
     */
  public static void out(String texto) {
        if (texto == null || texto.isEmpty()) {
            throw new IllegalArgumentException("La cadena está vacía o es nula.");
        }

        int indexLetra = -1;

        // Buscar la posición del primer carácter alfabético
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isLetter(c)) {
                indexLetra = i;
                break;
            }
        }

        char letra = texto.charAt(indexLetra);

        // Si la letra ya está en mayúscula, imprimir el texto original
        if (Character.isUpperCase(letra)) {
            System.out.println(texto);
            return;
        }

        // Construir la cadena con la letra en mayúscula
        String textoModificado =
                texto.substring(0, indexLetra) +
                Character.toUpperCase(letra) +
                texto.substring(indexLetra + 1);

        System.out.println(textoModificado);
    }
}
