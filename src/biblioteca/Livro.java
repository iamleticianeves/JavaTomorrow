package biblioteca;

class Livro extends Publicacao {
    private int edicao;
    private String isbn;

    public Livro(String titulo, String autor, int anoDePublicacao, String genero, String editora, int quantidadeDisponivel, int edicao, String isbn) {
        super(titulo, autor, anoDePublicacao, genero, editora, quantidadeDisponivel);
        this.edicao = edicao;
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getEdicao() {
        return edicao;
    }

    @Override
    public void imprimeDados() {
        System.out.println("DADOS DO LIVRO");
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano de publicação: " + getAnoDePublicacao());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Editora: " + getEditora());
        System.out.println("Quantidade disponível: " + getQuantidadeDisponivel());
        System.out.println("Edição: " + edicao);
        System.out.println("ISBN: " + isbn);
    }
}
