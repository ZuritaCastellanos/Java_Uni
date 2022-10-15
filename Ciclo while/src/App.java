import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int res=1;
    while (res==1){
       tablaMult tabloide = new tablaMult();
       Scanner entrada = new Scanner(System.in);
       System.out.println("Inserta el numero de la tabla de multiplicar");
       int num = entrada.nextInt();
       tabloide.setNum(num);
       tabloide.mostrarTab();
       System.out.println("Quieres hacer otra operacion?  1==si   2==no");
        res = entrada.nextInt();
    }
    System.out.println("salio");

    }
}
