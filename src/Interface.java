import java.util.Scanner;

public class Interface {

    int sequencia;
    int menuInicial;

    Scanner input = new Scanner(System.in);

    Codigo code = new Codigo();
//=====================================================================================================================
    public void Inicio(){
        System.out.println("\n\t∞∞ Programa de Numeros Repetidos ∞∞");
        MenuInicial();
    }
//=====================================================================================================================
    public void InicioUm(){
        System.out.print("\nQuantas Sequencias Quer Comparar: ");
        sequencia = input.nextInt();

        for (int i = 1; i <= sequencia; i++){
            System.out.println("\n\t≈≈≈ " + i + "º Sequencia ≈≈≈\n");
            code.Start();
        }
    }
//=====================================================================================================================
    public void MenuInicial(){
        do{
            System.out.println("\n1 - Realizar Comparação");
            System.out.println("0 - Sair");
            System.out.print("\nEscolha Uma Das Opções: ");
            menuInicial = input.nextInt();

            if (menuInicial < 0 || menuInicial > 1){
                System.out.println("\n\t≥≥≥≥≥ Opção Invalida! ≤≤≤≤≤");
            }
            else {
                if (menuInicial == 1){
                    InicioUm();
                }
            }
        }while (menuInicial != 0);
    }
//=====================================================================================================================
}
