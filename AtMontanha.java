import java.util.Scanner;

public class AtMontanha{
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
         String nome;
         int regimep;
         Double salariom;
         double horast;
         Double valorcon;
         Double valorhoras;
         Double produtohorista;

         System.out.println("Digite seu nome: ");
         nome = teclado.nextLine();
         System.out.println("Selecione a opção do seu regime de pagamento \n (1)CLT \n (2)HORISTA \n (3)PJ");
         regimep = teclado.nextInt();
            
         if( regimep == 1){
            System.out.println("Digite seu salario mensal: ");
            salariom = teclado.nextDouble();
            System.out.println(nome +", O seu valor a receber é R$: " + salariom);

        } if ( regimep == 2 ){
            System.out.println("Digite o numero de horas trabalhadas: ");
            horast = teclado.nextDouble();
            System.out.println("Digite o valor da hora trabalhada: ");
            valorhoras = teclado.nextDouble();
            produtohorista =  horast * valorhoras;
            System.out.println(nome+",O seu valor a receber é R$: " + produtohorista);
            
        } if( regimep == 3){
            System.out.println("Digite o valor do contrato: ");
            valorcon = teclado.nextDouble();
            System.out.println(nome+", O seu valor a receber é R$: "+ valorcon);

        }


    }



}