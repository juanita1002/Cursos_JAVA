public class EjecutarProgramaSO {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process process;
        try {
            if (System.getProperty("os.name").startsWith("Linux")){
                process = rt.exec("C:\\Program Files\\Notepad++\\notepad++.exe");
            } else {
                process = rt.exec("C:\\Program Files\\Microsoft Office\\root\\Office16\\EXCEL.EXE");
                 process.waitFor();
            }
        }catch (Exception e){

            System.err.println("e = " + e);
            e.printStackTrace();
        }
        System.out.println("Se ha cerrado el programa");

    }
}
