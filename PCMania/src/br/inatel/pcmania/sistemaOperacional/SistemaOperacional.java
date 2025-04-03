package br.inatel.pcmania.sistemaOperacional;

public class SistemaOperacional {
    String nome;
    int tipo; //32 ou 64

    public SistemaOperacional(String nome, int tipo){
        this.nome = nome;
        this.tipo = tipo;
    }

    public void exibirInfoSistOp(){
        System.out.println("Nome: " + nome + " tipo: " + tipo);

    }
}
