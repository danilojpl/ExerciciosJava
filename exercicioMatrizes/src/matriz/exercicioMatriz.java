/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Scanner;

/**
 *
 * @author Nilo
 */
public class exercicioMatriz {
static Scanner input = new Scanner (System.in);
    static int [] tamanhomatriz (){
        int [] tamanho = new int [2];
        System.out.println("digite o tamanho da matriz, que sera a quantidade de linhas e colunas: ");
        int n = input.nextInt();
        tamanho[0]=n;
        tamanho [1]=n;
        return tamanho;
    }
    static int [][] criarMatriz(int vetor[]){
        int matriz [][]= new int [vetor[0]] [vetor[1]];
        return matriz;
    }
    static int [][] popularMatriz (int matriz [][]){
        for (int i=0; i<matriz.length;i++){
            for (int j =0;j<matriz [i].length;j++){
                System.out.println("popule a matriz linha: "+i+" coluna: "+j);
                matriz[i][j]= input.nextInt();
            }
        }
        return matriz;
    }
    static void Slinhas (int matriz [][]){
        int soma=0;
        for (int i=0;i<=matriz.length;i++){
            if(soma!=0){
            System.out.println("soma da linha"+i+"= "+soma);
            soma=0;
            }
            if(i!=matriz.length){
            for (int j=0;j<matriz.length;j++){
                soma=soma+matriz[i][j];
            }
            }
        }
    }
    static void sColunas (int matriz[][]){
        int soma =0, soma2=0;
        for(int j=0;j<=matriz[0].length;j++){
            if(j!=0){
            System.out.println("a soma dos elementos da coluna"+j+" = "+soma);
            soma =0;
            }
            if(j!=matriz.length){
            for (int i =0;i<matriz.length;i++){
               soma=soma+matriz[i][j]; 
            }
            }
        }
    }
    static void quadradoM (int matriz[][]){
        
        boolean magico= true;
        int soma=0,soma2=0,he=matriz.length-1;
        for(int i=0;i<matriz.length;i++){
            soma=soma+matriz[0][i];
        
    }
    for (int i=1;i<matriz.length;i++){
        soma2=0;
        for(int j=0;j<matriz[i].length;j++){
            soma2=soma2+matriz[i][j];
        }
        if (soma2!=soma){
            magico=false;
        break;
        }
    }
    if(magico==true){
    for(int j=0;j<matriz[0].length;j++){
        soma2=0;
        for (int i=0;i<matriz.length;i++){
        soma2=soma2+matriz[i][j]; 
        }
        if(soma2!=soma){
            magico=false;
        break;
        }
    }
    }
    if(magico==true){
        soma2=0;
    for(int i=0;i<matriz.length;i++){
       soma2=soma2+matriz[i][i];   
        }
        if(soma2!=soma){
            magico=false;
        
    }
    }
    if(magico==true){
        soma2=0;
        int j=0;
    for(int i=matriz.length-1;i>=0;i--){
     soma2=soma2+matriz[i][j];
     j++;
           
    }
        if(soma2!=soma){
            magico=false;
        }
       
     }
        System.out.println(magico);
    
    }   

    static int [][] inverter  (int matriz [][]){
        int [][]matriz2=new int [matriz.length][matriz[0].length];
        for (int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz2 [i][j]=matriz [j][i];
            }
        }
        return matriz2;
    }
        static void imprimir (int matriz[][]){
    for(int i = 0; i< matriz.length; i++){
        for(int j = 0; j<matriz[i].length;j++){
                System.out.printf("matriz linha:[%d]coluna:[%d]= %d \n", i,j,matriz[i][j]);
    }
        }
    }
        static void MaiorV (int [][]matriz){
            int maior =0;
            for(int i=0;i<matriz.length;i++){
                for(int j=0;j<matriz[i].length;j++){
                    if(maior<matriz[i][j]){
                        maior=matriz[i][j];
                    }
                }
            }
            System.out.println("o maior numero da matriz é: "+maior);
        }
        static void MenorNum (int [][]matriz){
            int menor=matriz[0][0];
            for(int i =0;i<matriz.length;i++){
                for (int j=0;j<matriz[i].length;j++){
                    if (menor>matriz[i][j]){
                        menor=matriz[i][j];
                    }
                }
            }
            System.out.println("o menor numero da matriz é: "+menor);
        }
    static void menu (int[][]matriz){
        System.out.println("digite oque deseja fazer:\n"
                + "1-somar as linhas\n"
                + "2-somar as colunas\n"
                + "3-quadrado magico\n"
                + "4-inverter\n"
                + "5-maior numero\n"
                + "6-menor numero");
        char teste = input.next().charAt(0);
        switch (teste){
            case '1':
                Slinhas(matriz);
                break;
            case '2':
                sColunas(matriz);
                break;
            case '3':
                quadradoM(matriz);
                break;
            case'4':
            inverter(matriz);
                imprimir(matriz);
                break;
            case '5':
                MaiorV(matriz);
                break;
            case '6':
                MenorNum(matriz);
                break;
                
                
        }
    }
    public static void main(String[] args) {
        int matriz [][] =criarMatriz(tamanhomatriz());
        matriz=popularMatriz(matriz);
        int i=1;
        do{
        menu(matriz);
            System.out.println("digite 1 para o menu\n"
                    + "2 para encerrar");
            i=input.nextInt();
        }
        while(i==1);
    }
    
}
   