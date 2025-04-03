package br.inatel.pcmania.computador;

import br.inatel.pcmania.hardwareBasico.HardwareBasico;
import br.inatel.pcmania.sistemaOperacional.SistemaOperacional;
import br.inatel.pcmania.memoriaUSB.MemoriaUSB;

public class Computador {
    public String marca;
    public float preco;
    public int quantidade = 0;
    public MemoriaUSB musb;
    public SistemaOperacional sistOp;
    public HardwareBasico[] HardBas;

    public Computador(String marca, float preco, HardwareBasico[] HardBas, SistemaOperacional sistOp, MemoriaUSB musb) {
        this.marca = marca;
        this.preco = preco;
        this.HardBas = HardBas;
        this.sistOp = sistOp;
        this.musb = musb;
    }

   public void mostraPCConfigs() {
        quantidade++;
        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);
        System.out.print("Hardware Básico: ");
        for (int i = 0; i < HardBas.length; i++) {
            HardBas[i].exibirInfoHard();
        }
        System.out.print("Sistema Operacional: ");
        sistOp.exibirInfoSistOp();
        System.out.print("MemóriaUSB: ");
        musb.exibirInfoMemoria();

    }


}
