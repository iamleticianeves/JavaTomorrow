package banking;

public class App {
    public static void main(String[] args) {
        Banco banco = new Banco("Letícia", "Alan", "Edith");

        banco.creditar("Letícia", 1450);
        banco.debitar("Alan", 300);
        banco.transferir("Letícia", "Edith", 500);

        System.out.println("Saldo de Letícia: " + banco.getSaldo("Letícia"));
        System.out.println("Saldo de Alan: " + banco.getSaldo("Alan"));
        System.out.println("Saldo de Edith: " + banco.getSaldo("Edith"));
    }
}