public class Tiempo {

    public static void main(String[] args) {

        //Tiempo en que se demora en concatenar cadenas de texto con concat, += y StringBuilder

        long inicio = System.currentTimeMillis();

        String a = "a";
        String b = "b";
        String c = a;
        StringBuilder sb = new StringBuilder(a); //que es String builder? es una clase que permite concatenar cadenas de texto de manera eficiente

        for (int i = 0; i < 100000; i++) {
            //c= c.concat(a).concat(b); //mucho mas eficiente que c+=a+b; dura unos 10 ms menos que la otra
            //c+=a+b;
            sb.append(a).append(b); //mucho mas eficiente que concat y +=

        }
        long fin = System.currentTimeMillis();



        System.out.println("fin = " + fin);
        System.out.println("inicio = " + inicio);
        System.out.println("Cantidad = " + (fin - inicio));
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
