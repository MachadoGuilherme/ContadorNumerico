import java.util.Scanner;

public class Codigo {

    boolean resultado = false;
    int numeros, x=0;
    int vetor[] = new int [5];
    int repetidos[] = new int [5];

    Scanner input = new Scanner(System.in);
//=====================================================================================================================
    public void Start(){

        //System.out.println("\n\t∞∞ Programa de Numeros Repetidos ∞∞\n");

        for (int i = 0; i < 5; i++){
            System.out.print("Digite o " + (i+1) + "º Numero: ");
            numeros = input.nextInt();

            vetor[i] = numeros;
        }

        while(!resultado) {
            resultado = true;

            for(int i = 0; i < vetor.length-1; i++) {
                if(vetor[i] > vetor[i+1]) {
                    resultado = false;

                    x = vetor[i+1];
                    vetor[i +1]= vetor[i];
                    vetor[i] = x;
                }
            }
        }

        System.out.println("\n\t≠≠ Numeros Repetidos ≠≠\n");
        int cont = 1;
        int num = 0;
        for(int i = 0; i < vetor.length; i++) {
            cont = 0;
            for(int j = 0; j < vetor.length; j++) {
                if (vetor[j] == vetor[i]) {
                    cont++;
                    repetidos[i] = cont;
                }
                num = vetor[i];
            }
        }

        System.out.println("• O Numero " + vetor[0] + " Repete-se: " + repetidos[0] + " Vezes");
        for(int i = 0; i < 4; i++) {
            if (vetor[i] != vetor[i+1])
                System.out.println("• O Numero " + vetor[i+1] + " Repete-se: " + repetidos[i+1] + " Vezes");
        }
//=====================================================================================================================
    }
//=====================================================================================================================
}
