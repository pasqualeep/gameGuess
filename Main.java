import java.util.Random;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Random aleatorio = new Random();
    int numeAleat = random.nextInt(100) + 1;
    int tent = 0;
    boolean vit = false;

    System.out.println("Bem-vindo ao jogo de adivinhação"); 
    System.out.println("Tente adivinhar o número de 1 a 100");

    Scanner entrada = new Scanner(System.in);

    while (tentativas < 5) {
      System.out.println("Tentativa " + (tentativas + 1) + ": "); 
      int advinhar = scanner.nextInt(); 

      if (math.abs(advinhar - numeAleat) == 1){
        System.out.println("TA QUENTEEEEEE");
      } else if (advinhar < numeAleat) {
        System.out.println("O valor digitado é menor do que o número");
      } else if (advinhar > numeAleat) {
        System.out.println("O valor digitado é maior que o número"); 
      } else {
        boolean vit = true;
        break; 
      }
      
      tentativas++;
      
    }
    
    if (vit) {
      System.out.println("Você ganhou!!!!!!!!!!!! Parabéééééns");
    } else {
      System.out.println("Game Over!");
      System.out.println("O número correto era: " + numeAleat);
    }
    scanner.close();
  }
}