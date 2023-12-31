package Semana_08;

import java.util.Scanner;

public class ExerciciosWhile {

    // Modelo padrão disponibilizado pelo professor
    public static void main(String[] args) {
        final double RATE = 5;
        final double INITIAL_BALANCE = 10000;
        double balance = INITIAL_BALANCE;

        System.out.print("Enter number of years: ");
        Scanner in = new Scanner(System.in);
        int nyears = in.nextInt();

        // Print the table of balances for each year

        for (int year = 1; year <= nyears; year++) {
            double interest = balance * RATE / 100;
            balance = balance + interest;
            System.out.printf("%4d %10.2f\n", year, balance);
        }
    }

    // Quantos anos são necessários para que o investimento triplique o valor
    // inicial?
    public static void Ex1() {
        final double RATE = 5;
        final double INITIAL_BALANCE = 10000;
        double balance = INITIAL_BALANCE;
        final double META = 3 * INITIAL_BALANCE;
        int nyears = 0, i = 1;

        while (balance <= META) {
            double interest = balance * RATE / 100;
            balance += interest;
            nyears = i;
            i++;
        }

        System.out.printf("São necessários %d anos para triplicar o investimento.%n", nyears);
    }

    // Se o rendimento for 10% ao ano, quantos anos serão necessários para que o
    // balanço duplique? O que é necessário mudar no programa? 
    public static void Ex2() {
        final double RATE = 10;
        final double INITIAL_BALANCE = 10000;
        double balance = INITIAL_BALANCE;
        final double META = 2 * INITIAL_BALANCE;
        int nyears = 0, i = 1;

        while (balance <= META) {
            double interest = balance * RATE / 100;
            balance += interest;
            nyears = i;
            i++;
        }

        System.out.printf("São necessários %d anos para duplicar o investimento.%n", nyears);
    }

    // Modifique o programa para que o mesmo imprima o balanço ao final de cada ano.
    // O que você precisou alterar? 
    public static void Ex3() {
        final double RATE = 5;
        final double INITIAL_BALANCE = 10000;
        double balance = INITIAL_BALANCE;
        int year = 1;

        System.out.print("Enter number of years: ");
        Scanner in = new Scanner(System.in);
        int nyears = in.nextInt();

        while (year <= nyears) {
            double interest = balance * RATE / 100;
            balance = balance + interest;
            System.out.printf("Balanço no ano %4d: R$%10.2f\n", year, balance);
            year++;
        }
    }

    // Suponha que a condição de parada do laço while seja  diferente
    // Tive que mudar a variável de balance para balanco, e todas suas menções, e
    // criar uma variável META
    public static void Ex4() {
        int year = 1;
        final double RATE = 5;
        final double INITIAL_BALANCE = 10000;
        double balanco = INITIAL_BALANCE;
        final double META = 3 * INITIAL_BALANCE;

        System.out.print("Enter number of years: ");
        Scanner in = new Scanner(System.in);
        int nyears = in.nextInt();

        while (balanco <= META) {
            double interest = balanco * RATE / 100;
            balanco = balanco + interest;
            System.out.printf("%4d %10.2f\n", year, balanco);
            year++;
        }
    }

    // 5. O que imprime
    public static void Ex5() {
        int n = 1;
        while (n < 100) {
            n = 2 * n;
            System.out.print(n + " ");
        }
    }

    /*
     * Escreva um laço que imprime:
     * a. Todos os quadrados menores que n.
     * b. Todos inteiros positivos que sejam divisíveis por 10 e menores que n.
     * c. Todas as potências de 2 menores que n.
     */
    public static void Ex6() {
        int n;
        System.out.print("Escreva um valor: ");
        try (Scanner input = new Scanner(System.in)) {
            n = input.nextInt();

            System.out.println();
            quadrados(n);

            System.out.println();
            multiplosDeDez(n);

            System.out.println();
            potenciasDeDois(n);
        } catch (Exception e) {
            System.out.println("Apenas números inteiros. Favor reiniciar o programa.");
            System.out.println("Erro: " + e);
        }
    }

    private static void quadrados(int n) {
        int i = 0;
        while (i < Math.sqrt(n)) {
            int resultado = (int) Math.pow(i, 2);
            System.out.print(resultado + " ");
            i++;
        }
    }

    private static void multiplosDeDez(int n) {
        int i = 10;
        while (i < n) {
            System.out.print(i + " ");
            i += 10;
        }
    }

    private static void potenciasDeDois(int n) {
        int i = 1,
                resultado = 1;
        while (resultado < n) {
            System.out.print(resultado + " ");
            resultado = (int) Math.pow(2, i);
            i++;
        }
    }

    // 7. O que é um laço infinito? Como você pode encerrar em seu programa um
    // programa que entrou em laço infinito? 
    public static void Ex7() {
        // Exemplo de laço infinito.
        while (true) {
        }
        // Para encerrá-lo, podemos por um break dentro do laço caso uma condição se
        // prove verdadeira ou ainda
    }

    /*
     * Escreva um programa que lê do teclado um número inteiro e faz uma contagem
     * regressiva deste número simulando o lançamento de um foguete.
     */
    public static void Ex8() {
        int n;
        System.out.print("Escreva um valor: ");
        try (Scanner input = new Scanner(System.in)) {
            n = input.nextInt();
            contagemRegressiva(n);
        } catch (Exception e) {
            System.out.println("Apenas números inteiros. Favor reiniciar o programa.");
            System.out.println("Erro: " + e);
        }
    }

    private static void contagemRegressiva(int n) {
        String frase, inicio, fim;
        while (n > 0) {
            if (n > 1) {
                inicio = "Faltam";
                fim = "segundos.";
            } else {
                inicio = "Falta";
                fim = "segundo.";
            }
            frase = montaFraseContagem(inicio, n, fim);
            System.out.println(frase);
            n--;
        }
    }

    private static String montaFraseContagem(String inicio, int meio, String fim) {
        return (inicio + " " + meio + " " + fim);
    }

    // 9. Adapte o programa DuplicaInvestimento para que ele solicite ao usuário o
    // valor do saldo inicial, o rendimento anual e o saldo final desejado. 
    public static void Ex9() {
        double rate,
                balance,
                interest,
                desiredBalance;
        int year = 0, nyears = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        balance = in.nextDouble();

        System.out.print("Enter anual rate: ");
        rate = in.nextDouble();

        System.out.print("Enter desired balance: ");
        desiredBalance = in.nextDouble();

        while (balance <= desiredBalance) {
            interest = balance * rate / 100;
            balance = balance + interest;
            nyears = year;
            year++;
        }

        System.out.printf("São necessários %d anos para duplicar o investimento.%n", nyears);
    }
}
