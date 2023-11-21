import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String []args){

        Scanner entrada=new Scanner(System.in);
        Random random=new Random();

        int numeroAleatorio=random.nextInt(10);
        String[] palabras={"loro", "pez", "oso", "gato", "lobo","perro","leon","sapo","iguana","caballo"};

        String palabraAleatoria=palabras[numeroAleatorio];
        char letra;
        int aciertos=1;
        int fallas=1;

        for (int i=0; i<8; i++){
            System.out.println("\n\tTIENES "+(7-i)+" INTENTOS ");
            System.out.print("Ingrese la letra para descubrir la palabra: ");letra=entrada.next().charAt(0);

            if (palabraAleatoria.indexOf(letra)==-1){
                if (fallas==1){
                    System.out.println("0");
                }
                else if (fallas==2) {
                    System.out.println(" 0 ");
                    System.out.println("/| ");
                }
                else if (fallas==3) {
                    System.out.println(" 0 ");
                    System.out.println("/|\\");

                }
                else if (fallas==4) {
                    System.out.println(" 0 ");
                    System.out.println("/|\\");
                    System.out.println(" | ");

                }
                else if (fallas==5) {
                    System.out.println(" 0 ");
                    System.out.println("/|\\");
                    System.out.println(" | ");
                    System.out.println(" | ");

                }
                else if (fallas==6) {
                    System.out.println(" 0 ");
                    System.out.println("/|\\");
                    System.out.println(" | ");
                    System.out.println(" | ");
                    System.out.println("/ ");

                }
                else if (fallas==7) {
                    System.out.println(" 0 ");
                    System.out.println("/|\\");
                    System.out.println(" | ");
                    System.out.println(" | ");
                    System.out.println("/ \\");
                    System.out.println("\n\tHAS PERDIDO: (");
                    System.out.println("\tLa palabra era "+palabraAleatoria);
                    break;
                }
                fallas++;

            }else{
                aciertos++;
                System.out.println("Muy bien has acertado la letra...");

                if (aciertos==5){
                    System.out.println("\n\tFELICIDADES....ACERTASTE LA PALABRA");
                    break;
                }
            }


        }

    }
}