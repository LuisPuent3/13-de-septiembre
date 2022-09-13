//libreria de escanner
import java.util.Scanner;

public class triangualo {

    //metodo que crear un trinagulo con asteriscosdependiendo lo que le usaurioi defina
    public static void triangulo(int n){
        if(n==0){
            System.out.println("");
        }else{
            triangulo(n-1);
            for(int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //metodo que va imprimir un triangulo con un numero defino por el usuario de asteriscos de forma recursiva
    public static void trianguloRecursivo(int numero){
        if(numero>0){
            for(int i=0;i<numero;i++){
                System.out.print("*");
            }
            System.out.println();
            trianguloRecursivo(numero-1);
        }
    }

    //metodo del triangulo con recursividad
    public static void trianguloRecursivo2(int numero){
        if(numero>0){
            trianguloRecursivo2(numero-1);
            for(int i=0;i<numero;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    //metodo main para mandar a llamar la funcion
    public static void main(String[] args) {
        // define el usuario el tamaño del triangulo
        System . out . println ( "Ingrese el tamaño del triangulo" ) ;
        Scanner sc = new Scanner ( System . in ) ;
        int n = sc . nextInt ( ) ;
        triangulo ( n ) ;
        // defino el valor del triangulo recursivo
        System . out . println ( "----------------" ) ;
        System . out . println ( "Ingrese el tamaño del triangulo recursivo" ) ;
        int numero = sc . nextInt ( ) ;
    
        trianguloRecursivo2 ( numero ) ;
        // defino el valor del triangulo
         System . out . println ( "----------------------------" ) ;
         System . out . println ( "Ingrese el tamaño del triangulo recursivo al reves" );
         Scanner sc2 = new Scanner ( System . in ) ;
         int n2 = sc2 . nextInt ( ) ;
         trianguloRecursivo ( n2 ) ;

        

    }
   

  







}
