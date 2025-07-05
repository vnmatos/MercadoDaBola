package CodigosInternos;

import java.util.ArrayList;
import java.util.Scanner;



public class Jogadores extends Usuario {



    private String nomeJogador;
    private int idade;
    private int overall;
    private String posicao;
    private double valor;
    private String descricao;


    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getOverall() {
        return overall;
    }

    public void setOverall(int overall) {
        this.overall = overall;
    }



    public void exibeFicha(){

            System.out.println("Ficha de Atleta:");
            System.out.println("Atleta: "+nomeJogador);
            System.out.println("Idade: "+idade+" anos");
            System.out.println("OverAll: "+overall);
            System.out.println("Posição: "+posicao);
            System.out.println("Sobre: "+descricao);

    }



}
