package TareaEjercicio3;

import java.util.Scanner;

public class ejercicio {

    static Scanner sc = new Scanner(System.in);
    public static void problema6(){
        int g=0;
        Object matriZ_06[][] = new Object[5][5];
    
        for (int k=0; k < matriZ_06.length; k++){
            for (int u = 0; u <= k; u++) {
                matriZ_06[k][u]=g;
                g++;
                
            }
            
        }
        System.out.println("Resolucion ejercicio 8:\n");
        imprimirMatriz(matriZ_06);   
    }

    public static void problema9(){
        Object matriZ_09 [][] =new Object[5][5];
    
        int a = 0;
    
        for (int k = 0; k < matriZ_09.length; k++) {
            for (int u = ((matriZ_09[0].length)-1)-k; u <=(matriZ_09[0].length)-1 ; u++) {
                matriZ_09[k][u]=a;
                a++;
                
            }
            
        }
        System.out.println("Resolucion ejercicio 9:\n");
        imprimirMatriz(matriZ_09);
    
    
    
    }

    public static void problema11(){
        Object matriZ_11 [][] = new Object[5][5];
        int a=0;
    
        for (int k = 0; k < matriZ_11.length; k++){
            for (int u = ((matriZ_11[0].length)-1)-k; u >=0 ; u--){
                matriZ_11[k][u]=a;
                a++;
                
            }
            
        }
        System.out.println("Resolucion ejercicio 11:\n");
        imprimirMatriz(matriZ_11);
    
    }
    public static void problema12(){
        Object matriZ_12 [][] =new Object[5][5];
    
        int a = 0;
    
        for (int k = 0; k < matriZ_12.length; k++) {
            for (int u = (matriZ_12[0].length)-1; u >= k ; u--) {
                matriZ_12[k][u]=a;
                a++;
                
            }
            
        }
        System.out.println("Resolucion ejercicio 12:\n");
        imprimirMatriz(matriZ_12);
    
    }
    public static void problema13(){
        Object matriZ_13 [][] =new Object[5][5];
        int a =0;
    
        for (int k = 0; k < matriZ_13[0].length; k++){
            for (int u = 0; u < (matriZ_13.length)-k; u++){
                matriZ_13[u][k]=a;
                a++;
                
            }
                
            
        }
        System.out.println("Resolucion ejercicio 13:\n");
        imprimirMatriz(matriZ_13);
        
    }
    public static void imprimirMatriz(Object[][] matriz) {
        for (int k = 0; k < matriz.length; k++) {
            for (int u = 0; u < matriz[0].length; u++) {
               if(matriz[k][u]!=null){
                System.out.print("|"+matriz[k][u]+"|"+"\t");
                
               }else{
                System.out.print("\t");
               }                               
            }
            System.out.println("");
        }
        
    }
    public static void tarea(){        
        int opcionZ=0;
        System.out.println("-----------------------Bienvenido a la ultima tarea--------------------");
        System.out.println("\nEliga una Opcion"+ 
        "\n1=PROBLEMA06"+
        "\n2=PROBLEMA09"+
        "\n3=PROBLEMA11"+
        "\n4=PROBLEMA12"+
        "\n5=PROBLEMA13"+
        "\n");
        opcionZ = sc.nextInt();  
        
        while(opcionZ!=0){
            switch(opcionZ) {

              case 1:problema6();break;

              case 2:problema9();;break;
              
              case 3:problema9();;break;

              case 4:problema12();;break;
              
              case 5:problema13();;break;

              default: System.out.println("La opcion ingresada no existe!");
            }   
          System.out.println("///////////////////////////////////////////////");         
          System.out.println("-----------------------Bienvenido a la ultima tarea--------------------");
          System.out.println("\nEliga una Opcion"+ 
          "\n1=PROBLEMA06"+
          "\n2=PROBLEMA09"+
          "\n3=PROBLEMA11"+
          "\n4=PROBLEMA12"+
          "\n5=PROBLEMA13"+
          "\n");
        opcionZ = sc.nextInt();    
        }        
    }
    
    public static void main(String [] args){
        tarea();
    }

    
    
}