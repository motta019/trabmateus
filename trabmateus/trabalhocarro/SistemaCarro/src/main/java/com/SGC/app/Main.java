package main.java.com.sgc.app;

import java.util.ArrayList;
import java.util.Scanner;

import main.java.com.sgc.modelos.Carro;

public class Main {

    private static ArrayList<Carro> carros = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean executando = true;

        while (executando) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> cadastrarCarro();
                case 2 -> listarCarros();
                case 3 -> buscarCarro();
                case 0 -> executando = false;
                default -> System.out.println("Opção inválida!");
            }
        }

        scanner.close();
        System.out.println("Sistema encerrado.");
    }

    private static void exibirMenu() {
        System.out.println("\n=== SISTEMA DE CARROS ===");
        System.out.println("1 - Cadastrar Carro");
        System.out.println("2 - Listar Carros");
        System.out.println("3 - Buscar Carro por modelo");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarCarro() {
        System.out.println("\n=== CADASTRAR CARRO ===");

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        System.out.print("Ano: ");
        int ano = scanner.nextInt();

        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();

        Carro carro = new Carro(modelo, marca, ano, preco);
        carros.add(carro);

        System.out.println("Carro cadastrado com sucesso!");
    }

    private static void listarCarros() {
        System.out.println("\n=== LISTA DE CARROS ===");

        if (carros.isEmpty()) {
            System.out.println("Nenhum carro cadastrado.");
            return;
        }

        for (Carro carro : carros) {
            System.out.println(carro);
        }
    }

    private static void buscarCarro() {
        System.out.println("\n=== BUSCAR CARRO ===");

        if (carros.isEmpty()) {
            System.out.println("Nenhum carro cadastrado.");
            return;
        }

        System.out.print("Digite o modelo do carro: ");
        String modeloBusca = scanner.nextLine();

        for (Carro carro : carros) {
            if (carro.getModelo().equalsIgnoreCase(modeloBusca)) {
                System.out.println("Carro encontrado:");
                System.out.println(carro);
                return;
            }
        }

        System.out.println("Carro não encontrado.");
    }
}