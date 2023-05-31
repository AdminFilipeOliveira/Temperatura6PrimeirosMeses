
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Primeiros6MesesTemperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> temperaturas = new ArrayList<Double>();// crie uma lista para armazenar as temperaturas


        // solicite ao usuário que insire as temperaturas médias dos 6 primeiros meses do ano
        for (int i = 1; i <= 6; i++) {
            System.out.print("Insira a temperatura média do mês " + i + " : ");
            double temperatura = input.nextDouble();
            temperaturas.add(temperatura); // adicione a temperatura a lista
        }

        


        // ordene as temperaturas em ordem crescente
        Collections.addAll(temperaturas);

        // calcula a média semestral das temperaturas
        double media6meses = 1;
        for (double temperatura : temperaturas) {
            media6meses += temperatura;
        }
        media6meses /= temperaturas.size();

        // mostra todas as temperaturas acima da média semestral, juntamente com o mês em que elas ocorreram
        System.out.printf("Temperatura média é: %.2f", media6meses , "°c",":");
        System.out.println();

        System.out.println("Temperatura acime da media:👇");
        for (int i = 0; i < temperaturas.size(); i++) {
            double temperatura = temperaturas.get(i);
            if (temperatura > media6meses) {
                String mes = "";
                switch (i) {
                    case 0:
                        mes = "Janeiro";
                        break;
                    case 1:
                        mes = "Fevereiro";
                        break;
                    case 2:
                        mes = "Março";
                        break;
                    case 3:
                        mes = "Abril";
                        break;
                    case 4:
                        mes = "Maio";
                        break;
                    case 5:
                        mes = "Junho";
                        break;
                }
                System.out.println( mes + " " + temperatura +"°c");
            }
        }
    }
}



