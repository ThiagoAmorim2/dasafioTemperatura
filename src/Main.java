import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("**************************************");
        System.out.println("CONVERSOR DE TEMPERATURAS PARA CELSIUS");
        System.out.println("**************************************");

        System.out.print("Digite a temperatura em Celsius que deseja converter: ");
        Scanner sc = new Scanner(System.in);
        Double celsius = sc.nextDouble();
        System.out.println("");
        System.out.println("---------");
        System.out.println("-M-E-N-U-");
        System.out.println("---------");
        System.out.println("");
        System.out.println("1 - CELSIUS => KELVIN");
        System.out.println("2 - CELSIUS => RÉAUMUR");
        System.out.println("3 - CELSIUS => RANKINE");
        System.out.println("4 - CELSIUS => FAHRENHEIT");
        System.out.println("");

        System.out.print("Para qual opção do menu deseja a conversão: ");
        Integer opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.printf("Temperatura de " + celsius + " graus celsius, equivale a %.2f em Kelvin", celsius + 273.15);
                break;
            case 2:
                System.out.printf("Temperatura de " + celsius + " graus celsius, equivale a %.2f em Réaumur", celsius * 0.8);
                break;
            case 3:
                System.out.printf("Temperatura de " + celsius + " graus celsius, equivale a %.2f em Rankine", (celsius * 1.8) + 32 + 459.67) ;
                break;
            case 4:
                System.out.printf("Temperatura de " + celsius + " graus celsius, equivale a %.2f em Fahrenheit", (celsius * 1.8) + 32);
                break;
            default:
                System.out.println("Opção inválida");
        }

    }
}