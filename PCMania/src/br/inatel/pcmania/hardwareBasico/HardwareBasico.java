package br.inatel.pcmania.hardwareBasico;

public class HardwareBasico {
    String nome;
    float capacidade;



    public  HardwareBasico(String nome, int capacidade){
        this.nome = nome;
        this.capacidade = capacidade;
    }



    public void exibirInfoHard(){
        System.out.println("Modelo: " + nome + " Capacidade: " + capacidade + " Mhz");
    }


}
