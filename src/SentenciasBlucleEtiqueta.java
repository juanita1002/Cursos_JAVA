public class SentenciasBlucleEtiqueta {
    public static void main(String[] args) {

//        bucle1:
//        for (int i = 0; i < 5; i++) {
//
//            for (int j = 0; j < 5; j++) {
//                if (i == 3) {
//                    continue bucle1; // Salta a la siguiente iteración del bucle etiquetado "bucle1"
//                }
//                System.out.println("i: "+ i + " " + "j: " + j);
//            }
//        }


//        etiqueta: for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (i == 3) {
//                    break etiqueta; // Sale del bucle etiquetado "etiqueta"
//                }
//                System.out.println("i: "+ i + " " + "j: " + j);
//            }
//        }


//        int i = 0;
//        etiqueta2:
//        while (i < 5) {
//            int j = 0;
//            while (j < 5) {
//
//                if (i == 3) { // Si i es igual a 3 sale del bucle etiquetado "etiqueta2"
//                    break etiqueta2; // Sale del bucle etiquetado "etiqueta2"
//                }
//                j++;
//                System.out.println("i: " + i + " " + "j: " + j);
//            }
//            i++;
//        }


//        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
//        etiqueta3:
//        for(int i = 0; i < dias.length; i++) {
//            System.out.println("Dia: " + dias[i] );
//            for(int j=0; j <= 8; j++){
//                if (dias[i].equals("Viernes") && j >= 4) {
//                    continue etiqueta3;
//                }
//                if(dias[i].equals("Sabado") || dias[i].equals("Domingo")){
//                    System.out.println("Fin de semana, descanso merecido!");
//                    continue etiqueta3;
//                }
//                System.out.println(j + " hora" + " - A trabajar!");
//
//            }
//
//        }


//
//        String frase = "tres tristes tigres tragaban trigo en un trigal";
//        int contador = 0;
//        char letra = 'e';
//        etiqueta4:
//        for(int i=0; i<frase.length(); i++){
//            if(frase.charAt(i) != letra){
//                continue etiqueta4;
//            }
//            contador++;
//        }
//        System.out.println("Se encontro la letra t  " + contador + " veces");

//    }

        String frase = "tres tristes tigres tragaban trigo en un trigal trigo";
        String palabraBuscada = "trigo";
        int contador = 0;

        String[] palabras = frase.split(" ");
        etiqueta5:
        for (String palabra : palabras) {  // Recorre todas las palabras de la frase
            if (!(palabra.equals(palabraBuscada))) {
                continue etiqueta5;
            }
            contador++;
        }

        System.out.println("Se encontró la palabra \"" + palabraBuscada + "\" " + contador + " veces");
    }



}
