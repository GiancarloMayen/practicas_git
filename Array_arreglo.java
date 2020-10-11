package array_arreglo;

public class Array_arreglo {


    public static void main(String[] args) {
        
        int[][]numeros=new int [5][4];
     
        for(int relleno=0;relleno<5;relleno++){
            for(int notas=0;notas<4;notas++){
            numeros[relleno][notas]=(int)(Math.random()*100);
            }
          }
      
      for(int conteo=0;conteo<5;conteo ++){
      for(int con=0;con<4;con++){
          System.out.println("numero "+(conteo+1)+"="+numeros[conteo][con]);
          System.out.println("todo terminado");
      }}

    } 
}
