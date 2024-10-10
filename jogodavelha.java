package jogodavelha;

import java.util.Random;

import javax.swing.*;

public class jogodavelha {
	
	public static void main(String args[]) {
		menu();
	}
	
	public static void menu(){
	String tabela [][] = new String [3][3];
		tabela [0][0]="X";
		tabela [0][1]="X";
		tabela [0][2]="X";
		tabela [1][0]="X";
		tabela [1][1]="X";
		tabela [1][2]="X";
		tabela [2][0]="X";
		tabela [2][1]="X";
		tabela [2][2]="X";
	int jogada,situacao,nJog=1;
	
	
	do{
		jogada = Integer.parseInt(3OptionPane.showInputDiaLog(
					"											Jogo da Velha\n\n\n"+
					"Você Jogca como 'O' \n" +
					"O computador sempre faz o primeiro movimento \n"+
					"Digite o nº da casa na qual deseja jogar e aperte Enter para confirmar \n"+
					"para sair do jogo, digite 999 e aperte Enter\n"+
					"Para resetar a partida, digite 123 e aperte Enter\n\n"+
					("| "+tabela[0][0]+" | "+tabela[0][1]+" | "+tabela[0][2]+" |\n")+
					("| "+tabela[1][0]+" | "+tabela[1][1]+" | "+tabela[1][2]+" |\n")+
					("| "+tabela[2][0]+" | "+tabela[2][1]+" | "+tabela[2][2]+" |\n\n")+
					"Números de jogadas: "+nJog));
		
		
		
		switch (jogada) {
		
		case 1:
			situacao=verifJogo(tabela,0,0);
			situacoes(tabela,situacao,0,0,nJog);
			if (situacao==1) {
				nJog=nJog+1;
			}
			venceu(tabela,0,nJog);
			turnoPC(tabela,1,Njog);
			nJog=nJog+1;
			venceu(tabela,1,nJog);
			break;
			
		case 2:
			situacao=verifJogo(tabela,0,1);
			situacoes(tabela,situacao,0,1,nJog);
			if (situacao==1) {
				nJog=nJog+1;
			}
			venceu(tabela,0,nJog);
			turnoPC(tabela,1,Njog);
			nJog=nJog+1;
			venceu(tabela,1,nJog);
			break;
			
		case 3:
			situacao=verifJogo(tabela,0,2);
			situacoes(tabela,situacao,0,2,nJog);
			if (situacao==1) {
				nJog=nJog+1;
			}
			venceu(tabela,0,nJog);
			turnoPC(tabela,1,Njog);
			nJog=nJog+1;
			venceu(tabela,1,nJog);
			break;
			
		case 4:
			situacao=verifJogo(tabela,1,0);
			situacoes(tabela,situacao,1,0,nJog);
			if (situacao==1) {
				nJog=nJog+1;
			}
			venceu(tabela,0,nJog);
			turnoPC(tabela,1,Njog);
			nJog=nJog+1;
			venceu(tabela,1,nJog);
			break;
			
		case 5:
			situacao=verifJogo(tabela,1,1);
			situacoes(tabela,situacao,1,1,nJog);
			if (situacao==1) {
				nJog=nJog+1;
			}
			venceu(tabela,0,nJog);
			turnoPC(tabela,1,Njog);
			nJog=nJog+1;
			venceu(tabela,1,nJog);
			break;
			
		case 6:
			situacao=verifJogo(tabela,1,2);
			situacoes(tabela,situacao,1,2,nJog);
			if (situacao==1) {
				nJog=nJog+1;
			}
			venceu(tabela,0,nJog);
			turnoPC(tabela,1,Njog);
			nJog=nJog+1;
			venceu(tabela,1,nJog);
			break;
			
		case 7:
			situacao=verifJogo(tabela,2,0);
			situacoes(tabela,situacao,2,0,nJog);
			if (situacao==1) {
				nJog=nJog+1;
			}
			venceu(tabela,0,nJog);
			turnoPC(tabela,1,Njog);
			nJog=nJog+1;
			venceu(tabela,1,nJog);
			break;
			
		case 8:
			situacao=verifJogo(tabela,2,1);
			situacoes(tabela,situacao,2,1,nJog);
			if (situacao==1) {
				nJog=nJog+1;
			}
			venceu(tabela,0,nJog);
			turnoPC(tabela,1,Njog);
			nJog=nJog+1;
			venceu(tabela,1,nJog);
			break;
			
		case 9:
			situacao=verifJogo(tabela,2,2);
			situacoes(tabela,situacao,2,2,nJog);
			if (situacao==1) {
				nJog=nJog+1;
			}
			venceu(tabela,0,nJog);
			turnoPC(tabela,1,Njog);
			nJog=nJog+1;
			venceu(tabela,1,nJog);
			break;
			
		case 999:
			JOptionPane.showMessageDiaLog(null, "Finalizando o jogo...");
			break;
			
		case 123:
			JOptionPane.showMessageDiaLog(null, "Reiniciando o jogo...");
			tabela [0][0]="X";
			tabela [0][1]="2";
			tabela [0][2]="3";
			tabela [1][0]="4";
			tabela [1][1]="5";
			tabela [1][2]="6";
			tabela [2][0]="7";
			tabela [2][1]="8";
			tabela [2][2]="9";
			nJog=1;
			break;
			
		default:
			JOptionPane.showMessageDiaLog(null, "Jogada inválida");
			break;
		}
	}while(jogada!=999);
}
	
	
	public static int verifJogo(String tabela[][], int posL, int posC){
		
		if (tabela[posL][posC].equals("X")){
			return -1;
			
		}else{
			if (tabela[posL][posC].equals("X")){
				return 0;
			}else{
				return 1;
			}
	}
}
	
	
	public static void situacoes (String tabela[][], int sit, int posL, int posC, int nJog){
			if (sit == -1){
				JOptionPane.showMessageDiaLog(null, "Esta casa já foi marcada com X!!! Escolha outra casa para jogar");
			}else{
				if (sit == 0){
				JOptionPane.showMessageDiaLog(null, "Você já jogou nesta casa!!! Escolha outra casa para jogar");
				}else{
					marcarJogo(tabela,posL,posC,nJog);
				}
		}
	}
	
	public static void marcarJogo (String tabela[][], int posL, int posC, int nJog){
		tabela[posL][posC]="0";
		nJog=(njog+1);
	}
	
	public static void venceu(String tabela[][], int posL, int posC, int nJog){
		String jogo;
		
		if (jogador == 1){
			jogo="x";
		}else{
			jogo="0";
		}
		
		if ((tabela[0][0].equals(jogo))&&(tabela[0][1].equals(jogo))&&(tabela[0][2].equals(jogo))||
		   ((tabela[0][0].equals(jogo))&&(tabela[0][1].equals(jogo))&&(tabela[0][2].equals(jogo))||
		   ((tabela[0][0].equals(jogo))&&(tabela[0][1].equals(jogo))&&(tabela[0][2].equals(jogo))||
		   ((tabela[0][0].equals(jogo))&&(tabela[0][1].equals(jogo))&&(tabela[0][2].equals(jogo))||
		   ((tabela[0][0].equals(jogo))&&(tabela[0][1].equals(jogo))&&(tabela[0][2].equals(jogo))||
		   ((tabela[0][0].equals(jogo))&&(tabela[0][1].equals(jogo))&&(tabela[0][2].equals(jogo))||
		   ((tabela[0][0].equals(jogo))&&(tabela[0][1].equals(jogo))&&(tabela[0][2].equals(jogo))||
		   ((tabela[0][0].equals(jogo))&&(tabela[0][1].equals(jogo))&&(tabela[0][2].equals(jogo)))))))))){
			
			JOptionPane.showMessageDiaLog(null,"'"+jogo=" Venceu!!!\n");
		}else{
			if (nJog==9){
				JOptionPane.showMessageDialog(null,"O jogo empatou!!!");
			}
		}
		
}
		public static void turnoPC(String tabela[][],int jogador,int nJog){
			Random jogo = new Random();
			int posL=-1,posC=-1,jogou=-1;
			
			while (jogou==-1){
				posL=jogo.nextInt(3);
				posC=jogo.nextInt(3);
				jogou=jogoPC(tabela,jogador,posL,posC,jogou);
			}
		}
		public static int jogoPC(String tabela[][],int jogador,int posL,int jogou){
			if ((tabela[posL][posC].equals("X"))||(tabela[posL][posC].equals("O"))){
				jogou=-1;
			}else{
				tabela[posL][posC]="X";
				jogou=1;
				}
			return jogou;
		}
		
	}