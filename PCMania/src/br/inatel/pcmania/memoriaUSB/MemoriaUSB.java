package br.inatel.pcmania.memoriaUSB;

import br.inatel.pcmania.hardwareBasico.HardwareBasico;

public class MemoriaUSB {
    String nome;
    int capacidade;
    static float addCapacidade = 0;

    public MemoriaUSB(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public void exibirInfoMemoria() {
        System.out.println("Nome: " + nome + " tipo: " + capacidade);

    }

    public void adicionaMemoria(int adicional) {
        if (adicional > 0) {
            capacidade += adicional;
            System.out.println("Memória aumentada! Nova capacidade: " + capacidade + "GB");
        } else {
            System.out.println("Erro: O valor deve ser positivo.");
        }
    }

}
