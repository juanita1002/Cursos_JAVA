import java.util.Scanner;

public class OperadoreLogicosLoguin {
    public static void main(String[] args) {
//        String[] user = new String[3];
//        String[] password = new String[3];
//        user[0] = "admin";
//        user[1] = "juana";
//        user[2] = "pedro";
//        password[0] = "123456";
//        password[1] = "123456";
//        password[2] = "123456";

        String[] user ={ "admin", "juana", "pedro"};
        String[] password= {"123456", "123456", "123456"};


        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el usuario: ");
        String userIn = sc.nextLine();

        System.out.println("Ingrese la contraseña: ");
        String passwordIn = sc.nextLine();

        boolean esUsuarioCorrecto = false;
         for(int i = 0; i < user.length; i++){
             if ((user[i].equalsIgnoreCase(userIn) && password[i].equals(passwordIn))) {
                 esUsuarioCorrecto = true;
                 break;
             }
         }

             if (esUsuarioCorrecto) {
                 System.out.println("Bienvenido " + userIn);
             }else {
                 System.out.println("Usuario o contraseña incorrectos");
             }


            }
}
