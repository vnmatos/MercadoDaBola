import CodigosInternos.Jogadores;
import CodigosInternos.Usuario;

import java.util.ArrayList;

public class Principal  {
    public static void main(String[] args)  {

        Usuario user1 = new Usuario();

        user1.setNomePlayer("Vinicius Matos");
        user1.setIdadeUser(18);
        user1.setNomeTime("Bambirros");
        user1.setLigaJogada("Liga Coleguium");

        System.out.println("Bem vindo "+ user1.getNomePlayer());
        System.out.println("Sua liga é: "+ user1.getLigaJogada());
        System.out.println("Agora monte sua equipe, voce precisa de 5 jogadores (um deles precisa ser goleiro)");
        System.out.println("Seu saldo é de R$150,00");



        user1.exibeElenco();
        user1.listaParaCompra();
        System.out.println("Deseja comprar algum jogador? (sim/nao)");
        user1.comprarJogador("Matheus","Ala/fixo",40);
        user1.comprarJogador("Arthur Mendes","Fixo",20);
        user1.comprarJogador("Pedro Bonaparte","Pivô/ala",40);
        user1.comprarJogador("Eduardo","Ala", 60);
        user1.comprarJogador("Vinicius", "Ala", 30);
        user1.comprarJogador("Caio","Ala/fixo/pívo",50);
        user1.comprarJogador("Blackout","Goleiro", 10);
        user1.comprarJogador("Ferron","Goleiro",15);

        user1.exibeElenco();

        System.out.println("Deseja vender algum? (sim/nao)");

        user1.venderJogador("Matheus",40);
        user1.venderJogador("Arthur Mendes",20);
        user1.venderJogador("Pedro Bonaparte",40);
        user1.venderJogador("Eduardo", 60);
        user1.venderJogador("Vinicius",  30);
        user1.venderJogador("Caio",40);
        user1.venderJogador("Blackout", 10);
        user1.venderJogador("Ferron",15);

        user1.exibeElenco();











    }
}
