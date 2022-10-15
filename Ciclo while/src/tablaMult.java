
public class tablaMult {
    Scanner entrada2 = new Scanner(System.in);
    private int num;
    private int opcion;
    public tablaMult(){

    }
public tablaMult(int num, int opcion){
    this.num=num;
    this.opcion=opcion;
}
public int getNum(){
    return this.num;
}
public void setNum(int num){
    this.num = num;
}
public int getOpcion(){
    return this.opcion;
}
public void setOpcion(int opcion){
    this.opcion=opcion;
}
int i=1;
int result;
int opt;
public void mostrarTab(){
    System.out.println(this.num);
    for (i=1;i<=10;i++){
        System.out.println(num+"*"+i+"="+(num*i));
    }
}
}
