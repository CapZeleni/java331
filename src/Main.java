public class Main {
    public static void main(String[] args) {
        Credit service = new Credit();
        String payment = "Ваш ежемесячный платеж составит: ";
        System.out.println("Кредит сроком на 1 год");

        System.out.printf("Ваш ежемесячный платеж составит: %.0f", (double) service.calculate(1_000_000, 9.99, 1));
        System.out.println();
        System.out.println("Кредит сроком на 2 года");
        System.out.printf("Ваш ежемесячный платеж составит: %.0f", (double) service.calculate(1_000_000, 9.99, 2));
        System.out.println();
        System.out.println("Кредит сроком на 3 года");
        System.out.printf("Ваш ежемесячный платеж составит: %.0f", (double) service.calculate(1_000_000, 9.99, 3));
    }
}
