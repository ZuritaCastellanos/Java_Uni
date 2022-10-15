import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      int miMatriz[][] = new int [5][5];

        System.out.println("Tam. Filas: "+miMatriz.length);
        System.out.println("Tam. Columnas: "+miMatriz[0].length);


      for (int i = 0; i < miMatriz.length; i++) {
        for (int j = 0; j < miMatriz.length; j++) {
            miMatriz[i][j]=j;
        }
      }
}
}
