package biblioteca;

abstract class Publicacao {
    private String titulo;
    private String autor;
    private int anoDePublicacao;
    private String genero;
    private String editora;
    private int quantidadeDisponivel;

    public Publicacao(String titulo, String autor, int anoDePublicacao, String genero, String editora, int quantidadeDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.genero = genero;
        this.editora = editora;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public String getGenero() {
        return genero;
    }

    public String getEditora() {
        return editora;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public abstract void imprimeDados();
}
