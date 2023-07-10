import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        try{
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US); 

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt(); 

        System.out.println(parametroUm);
        System.out.println(parametroDois);

        contar(parametroUm, parametroDois);

        terminal.close();

        } catch( InputMismatchException e ){
            System.out.println("Os campos precisam ser numéricos ");
        }
            

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
            if(parametroUm >= parametroDois){
                System.out.println("Primeiro parâmetro não deve ser maior que segundo");
                throw new ParametrosInvalidosException();
  
                }else{
            int diferenca = parametroDois - parametroUm;
                    for(  int i = 1 ; i <= diferenca ; i++){
                        System.out.println("Imprimindo o número " + i);
                    }
        }
    }
}
