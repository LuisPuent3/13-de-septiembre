//metodo de forma ancesdente en forma recursiva

public class Recursividad{

    //metodo que me imprima un numero de forma progresiva con recursividad
    public static void imprimirProgresivo(int n){
        if(n==0){
            System.out.println(n);
        }else{
            imprimirProgresivo(n-1);
            System.out.println(n);
        }
    }


    public void repetir(int numero){
        if(numero>0){
            System.out.println(numero);
            repetir(numero-1);
        }
    }
    //metodo main para mmabdar a llamar la funcion
    public static void main(String[] args){
        Recursividad r = new Recursividad();
        r.repetir(10);
        System.out.println("----------------");
        Recursividad.imprimirProgresivo(10);

    }
}