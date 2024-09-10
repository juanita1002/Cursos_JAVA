public class AutoboxingInteger {
    public static void main(String[] args) {
        
        // Autoboxing es la conversión automática de un tipo primitivo a su objeto envolvente (wrapper class) 
        // en este caso de int a Integer
        Integer[] intArray = {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int suma = 0;
        for (Integer i : intArray) {
            suma += i;
            //suma = suma + i.intValue(); // suma es un int, i es un Integer
        }
        System.out.println("suma = " + suma);
        
        // Unboxing es la conversión automática de un objeto envolvente (wrapper class) a su tipo primitivo
        // en este caso de Integer a int
        
        Integer i = new Integer(10);
        int j = i;
        System.out.println("j = " + j);
    }
}
