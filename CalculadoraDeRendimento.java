import java.util.Scanner;

public class CalculadoraDeRendimento {

    private double investimentoInicial;
    private double taxaMensal;
    private int numeroDeMeses;

    public CalculadoraDeRendimento(double investimentoInicial, double taxaMensal, int numeroDeMeses) {
        this.investimentoInicial = investimentoInicial;
        this.taxaMensal = taxaMensal;
        this.numeroDeMeses = numeroDeMeses;
    }

    public double calcularRendimento() {
        double rendimento = investimentoInicial;
        for (int i = 0; i < numeroDeMeses; i++) {
            rendimento += rendimento * taxaMensal;
        }
        return rendimento - investimentoInicial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o investimento inicial: ");
        double investimentoInicial = scanner.nextDouble();

        System.out.print("Informe a taxa mensal (em decimal): ");
        double taxaMensal = scanner.nextDouble();

        System.out.print("Informe o número de meses: ");
        int numeroDeMeses = scanner.nextInt();

        CalculadoraDeRendimento calculadora = new CalculadoraDeRendimento(investimentoInicial, taxaMensal, numeroDeMeses);

        double rendimento = calculadora.calcularRendimento();

        System.out.println("O rendimento após " + numeroDeMeses + " meses será de: " + rendimento);
    }
}

