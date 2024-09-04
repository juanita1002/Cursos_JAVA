public class FlujosDeControlBucles {

 public static void main(String[] args) {

      //While es un bucle que se ejecuta mientras la condición sea verdadera
    System.out.println("While");
    int i = 0;
    while(i<= 10)
    {
        System.out.println(i);
        i++;
    }

    //Do-While es un bucle que se ejecuta al menos una vez y luego se ejecuta mientras la condición sea verdadera
     System.out.println("Do-While");
    int j = 0;
    do
    {
        System.out.println(j);
        j++;
    } while(j< 10);


    //For es un bucle que se ejecuta un número determinado de veces
     System.out.println("For");
        for(int k = 0; k< 10;k++)
        {
        System.out.println(k);
        }


     System.out.println("For impares" );
        for(int in = 0; in <= 10;in++) {
        if (in % 2 == 0) {
            continue;
        }
        System.out.println(in);
    }
     System.out.println("For  pares y continue" );
     for(int p = 0; p <= 10;p++) {
         if (!(p % 2 == 0)) {
             continue;
         }
         System.out.println(p);
     }

        System.out.println("For break" );
        for(int b = 0; b <= 10;b++) {
            if (b == 5) {
                break;
            }
            System.out.println(b);
        }

}
}
