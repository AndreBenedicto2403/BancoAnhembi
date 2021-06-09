
import java.util.Scanner;

public class AppConta {

    private static float valor;
    public static void main(String[] args){
        Conta minhaConta = new Conta();
        Scanner leitura = new Scanner(System.in);
    String nome, conta;
    int num, op;
    float saldo, valor, lim;
        do{
            System.out.println("Nova conta");
            System.out.println("Conta Bancaria");
            System.out.println("1- Enviar dados");
            System.out.println("2- Ver dados");
            System.out.println("3- Depósito");
            System.out.println("4- Sacar");
            System.out.println("5- Mostrar conta");
            System.out.println("0- Sair");
            leitura.nextLine();
            op = leitura.nextInt();
            switch(op){
                case 1 :  
                    System.out.println("Insira seu nome:");
                    nome = leitura.nextLine();
                    
                    System.out.println("Insira o número:");
                    num = leitura.nextInt();

                    System.out.println("Insira o saldo:");
                    saldo = leitura.nextFloat();
                    
                    System.out.println("Entre com o seu limite:");
                    lim = leitura.nextFloat();
                    
                    minhaConta.inseredados(nome, num, saldo, lim);
                    
                break;
                case 2 :
                    minhaConta.mostrardado();
                break;
                case 3 :   
                    System.out.println("Insira o valor que deseja depositar:");
                    valor = leitura.nextFloat();
                    minhaConta.deposita(valor);
                break;
                case 4:
                    minhaConta.mostrarsal();
                    System.out.println("Insira o valor que deseja sacar:");
                    valor = leitura.nextFloat();
                    minhaConta.saca(valor);
                break;
                case 5:
                    minhaConta.mostrarsal();
                break;
            }
            }while(op != 0);
        }
    }
