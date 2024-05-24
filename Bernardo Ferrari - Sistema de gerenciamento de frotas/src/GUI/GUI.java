package GUI;

import java.util.Scanner;
public class GUI{
    public static void ShowMenu(){
        System.out.print("\033[H\033[2J");
        System.out.println("Sistema de Gerenciamento de Frotas");
        System.out.print("MENU DE OPÇÕES:\n1 - Cadastrar Novo Veículo\n2 - Listar todos os Veículos\n" +
                         "3 - Pesquisar Veículo por Placa\n4 - Remover Veículo\n0 - Sair\nDigite a opção desejada: ");
    }

    public static void ShowMenuCadastro(){
        System.out.print("\033[H\033[2J");
        System.out.println("CADASTRO DE VEÍCULO");
        System.out.print("Qual o tipo de veículo\n1 - Carro\n2 - Moto\nDigite a opção desejada: ");
    }

    public static Boolean isNumber(String input){
        return input != null && input.matches("\\d+");
    }

    public static Boolean isValidYear(String input){
        if(isNumber(input)){
            Integer year = Integer.parseInt(input);
            return year > 0 && year <= 2025; // Assumi que fosse até 2025 e desconsiderei que o primeiro carro/moto veio ali por 1885
        }
        return false;
    }

    public static String getUserInput(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        return input;
    }
}
