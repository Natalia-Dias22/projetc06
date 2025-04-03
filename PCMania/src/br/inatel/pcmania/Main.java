package br.inatel.pcmania;

import java.util.Scanner;
import br.inatel.pcmania.cliente.Cliente;
import br.inatel.pcmania.computador.Computador;
import br.inatel.pcmania.hardwareBasico.HardwareBasico;
import br.inatel.pcmania.sistemaOperacional.SistemaOperacional;
import br.inatel.pcmania.memoriaUSB.MemoriaUSB;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Cliente cliente = new Cliente("Natália", 134567321);
        System.out.println("Cliente Cadastrado com Sucesso");


        Computador computador1 = new Computador("Apple", 423, new HardwareBasico[]{
                new HardwareBasico("Pentium Core i3", 2200),
                new HardwareBasico("Memória RAM", 8),
                new HardwareBasico("HD", 500)},
                new SistemaOperacional("Linux Ubuntu", 32),
                new MemoriaUSB("Pen-drive", 16));

        Computador computador2 = new Computador("Samsung", 1657, new HardwareBasico[]{
                new HardwareBasico("Pentium Core i5", 3370),
                new HardwareBasico("Memória RAM", 16),
                new HardwareBasico("HD", 1000)},
                new SistemaOperacional("Windows 8", 64),
                new MemoriaUSB("Pen-drive", 32));

        Computador computador3 = new Computador("Dell", 6101, new HardwareBasico[]{
                new HardwareBasico("Pentium Core i7", 4500),
                new HardwareBasico("Memória RAM", 32),
                new HardwareBasico("HD", 2000)},
                new SistemaOperacional("Windows 10", 64),
                new MemoriaUSB("HD Externo", 1000));

        int op;
        int memoria;
        int vamo_comprar;
        do {
            System.out.print("Olá " + cliente.nome + ", deseja ver um computador em promoção? (1-Sim, 2-Não): ");
            op = scanner.nextInt();

            if (op == 1) {
                System.out.print("Olá " + cliente.nome + ", deseja comprar qual computador? (1, 2, 3): ");
                int promocao = scanner.nextInt();

                switch (promocao) {
                    case 1:
                        computador1.mostraPCConfigs();
                        cliente.computador[cliente.quantidadeCompras] = computador1;
                        cliente.quantidadeComputadores();

                        System.out.println("Deseja implementar memória no Computador escolhido? (1-> Sim, 2-> Não) "  );
                        int escolha = scanner.nextInt();


                        if (escolha == 1) {
                            System.out.print("Quanto de memória no computador1?   ");
                             memoria = scanner.nextInt();
                            computador1.musb.adicionaMemoria(memoria);
                            computador1.musb.exibirInfoMemoria();
                        }
                        break;
                    case 2:
                        computador2.mostraPCConfigs();
                        cliente.computador[cliente.quantidadeCompras] = computador2;
                        cliente.quantidadeComputadores();

                        System.out.println("Deseja implementar memória no Computador escolhido? (1-> Sim, 2-> Não) "  );
                         escolha = scanner.nextInt();


                        if (escolha == 1) {
                            System.out.print("Quanto de memória no computador2?   ");
                             memoria = scanner.nextInt();
                            computador2.musb.adicionaMemoria(memoria);
                            computador2.musb.exibirInfoMemoria();
                        }
                        break;
                    case 3:
                        computador3.mostraPCConfigs();
                        cliente.computador[cliente.quantidadeCompras] = computador3;
                        cliente.quantidadeComputadores();

                        System.out.println("Deseja implementar memória no Computador escolhido? (1-> Sim, 2-> Não) "  );
                        escolha = scanner.nextInt();


                        if (escolha == 1) {
                            System.out.print("Quanto de memória no computador3?   ");
                            memoria = scanner.nextInt();
                            computador3.musb.adicionaMemoria(memoria);
                            computador3.musb.exibirInfoMemoria();
                        }
                        break;
                    default:
                        System.out.println("Não escolheu uma promoção existente");
                }
            }

            System.out.print("Olá " + cliente.nome + ", deseja continuar? (1-Sim, 2-Não): ");
            vamo_comprar = scanner.nextInt();

        } while (vamo_comprar == 1);

        float total_Compras = cliente.calculaTotalCompra();
        System.out.println("Preço Total: " + total_Compras);



    }
}
