    package CodigosInternos;

    import java.util.ArrayList;
    import java.util.Scanner;

    public class Usuario {


        private String nomePlayer;
        private int IdadeUser;
        private String nomeTime;
        private double saldoBancario = 150;
        private String ligaJogada;
        ArrayList<String> elencoUser = new ArrayList<>();
        ArrayList<String> jogadoresDisponiveis = new ArrayList<>();




        public int getIdadeUser() {
            return IdadeUser;
        }

        public void setIdadeUser(int idadeUser) {
            IdadeUser = idadeUser;
        }

        public String getLigaJogada() {
            return ligaJogada;
        }

        public void setLigaJogada(String ligaJogada) {
            this.ligaJogada = ligaJogada;
        }

        public String getNomePlayer() {
            return nomePlayer;
        }

        public void setNomePlayer(String nomePlayer) {
            this.nomePlayer = nomePlayer;
        }

        public String getNomeTime() {
            return nomeTime;
        }

        public void setNomeTime(String nomeTime) {
            this.nomeTime = nomeTime;
        }

        public double getSaldoBancario() {
            return saldoBancario;
        }

        public void setSaldoBancario(double saldoBancario) {
            this.saldoBancario = saldoBancario;
        }
//================================================================================================================================================


        public void listaParaCompra(){

            System.out.println("Lista de jogadores a venda:");
            jogadoresDisponiveis.add("Arthur Mendes");
            jogadoresDisponiveis.add("Eduardo Ferry");
            jogadoresDisponiveis.add("Vinicius Matos");
            jogadoresDisponiveis.add("Matheus Mendes");
            jogadoresDisponiveis.add("Pedro Bonaparte");
            jogadoresDisponiveis.add("Lucas Blackoutz");
            jogadoresDisponiveis.add("Ferron");
            jogadoresDisponiveis.add("Caio Brandao");
            System.out.println("- Arthur (FIXO), R$20");
            System.out.println("- Eduardo (ALA),  R$40");
            System.out.println("- Vinicius (ALA),  R$30");
            System.out.println("- Matheus (ALA/FIXO),  R$40");
            System.out.println("- Pedro (ALA/PIVÔ),  R$40");
            System.out.println("- Blackout (GL),  R$10");
            System.out.println("- Ferron (GL),  R$15");
            System.out.println("- Caio (ALA/FIXO/PIVÔ),  R$40");
        }





//===============================================================================================================================================================

        public void comprarJogador(String nomeJogador,String posicao, double valor) {
            Scanner opcaoComprar = new Scanner(System.in);
            System.out.println("Deseja comprar " + nomeJogador + "?");
            String resposta = opcaoComprar.nextLine();


            if (resposta.equals("Sim") || resposta.equals("sim")) {

                if (getSaldoBancario() >= valor) {

                    System.out.println("Parabéns,compra bem sucedida");
                    elencoUser.add(nomeJogador);
                    saldoBancario-=valor;
                    System.out.println("Seu saldo agora é: R$"+saldoBancario);
                    System.out.println(nomeJogador + " agora faz parte do seu elenco!");


                } else {
                    System.out.println("Saldo Insuficiente");
                }

            } else if (resposta.equals("Não") || resposta.equals("nao")) {
                System.out.println("Você desistiu da compra");
            }
        }
 //===========================================================================================================================================

    //pedi o chatGPT pois alguns conhecimentos eu ainda nao tinha sobre oq está abaixo
        public void venderJogador(String nomeJogador,double valorVenda) {
            Scanner opcaoVender = new Scanner(System.in);
            System.out.println("Deseja vender " + nomeJogador + "?");
            String respostaVenda = opcaoVender.nextLine();
            if (respostaVenda.equals("Sim") || respostaVenda.equals("sim")) {
     if (elencoUser.isEmpty()) {
         System.out.println("Você não tem nenhum jogador no elenco para vender.");
         return;
     }

     if (elencoUser.contains(nomeJogador)) {
         elencoUser.remove(nomeJogador);
         saldoBancario += valorVenda;
         System.out.println("Você vendeu " + nomeJogador + " por R$" + valorVenda);
         System.out.println("Saldo atualizado: R$" + saldoBancario);
     } else {
         System.out.println(nomeJogador + " não está no seu elenco.");
     }
            }
 }
//===============================================================================================================================================
        public void exibeElenco(){
            System.out.println("Seu elenco agora é:"+ elencoUser);

        }

    }
