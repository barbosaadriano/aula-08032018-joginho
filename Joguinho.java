import java.util.Scanner;
import java.util.Random;

public class Joguinho {
	
		Scanner scan;
		int aleatorio;
		int tentativas;
				
		public Joguinho(int maxRange, int tentativas) {
			scan = new Scanner(System.in);
			Random ran = new Random();
			aleatorio = ran.nextInt(maxRange);
			this.tentativas = tentativas;
		}
		
		public void play(){
			while (true) {
				if ( (this.acertou()) ) {
					ganhar();
				}
				if ( tentativas==0) {
					perder();
					break;
				}
			}
		}
		
		public boolean acertou() {
			int t = this.tentar();
			if (t<aleatorio)
				System.out.printf("%d é menor que o número oculto!\r\n",t);
			else
				System.out.printf("%d é maior que o número oculto!\r\n",t);
			return t == aleatorio;
		}
		
		public int tentar(){
			System.out.printf("Faça sua tentativa, você tem %d chances!\r\n",tentativas);
			tentativas--;
			return scan.nextInt();
		}

		public static void main(String[] args) {
			new Joguinho(100,7).play();
		}
		
		public void ganhar(){
			System.out.println("You win!");
		}
		public void perder() {
			System.out.println("You lose!");
		}
		
	
	
}