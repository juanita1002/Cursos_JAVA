public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        String nombre1 = "Ivan";
        String nombre2 = "Ana";
        String nombre3 = "Manuel";
        String punto = ".";
        String rayaPiso = "_";
        
        int lnombre1= nombre1.length();
        int lnombre2= nombre2.length();
        int lnombre3= nombre3.length();



        String segundaLetraNombre1 = nombre1.substring(1, 2).toUpperCase() + punto + nombre1.substring(lnombre1-2) + rayaPiso
                + nombre2.substring(1, 2).toUpperCase() + punto + nombre2.substring(lnombre2-2) + rayaPiso
                + nombre3.substring(1, 2).toUpperCase() +   nombre3.substring(lnombre3-2);


        System.out.println("segundaLetraNombre1 = " + segundaLetraNombre1);

    }
}
