package biblioteca;

public class ProgramaBiblioteca {
    public static void main(String[] args) {
        Livro livro = new Livro("Me Before You", "Jojo Moyes", 2012, "Romance", "Intríseca", 235, 1, "123456789");
        Filme filme = new Filme("Poseidon", "Wolfgang Petersen", 2006, "Drama", "Virtual Studios", 100, "Wolfgang Petersen", "Josh Lucas", "Um transatlântico é engolido por uma onda colossal.", 139);

        Publicacao[] publicacoes = new Publicacao[2];
        publicacoes[0] = livro;
        publicacoes[1] = filme;

        for (Publicacao publicacao : publicacoes) {
            publicacao.imprimeDados();
            System.out.println();
        }
    }
}
