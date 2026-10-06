class Main {
    public static void main(String[] args){
        Livro livro1 = new Livro("Se não eu quem vai fazer você feliz", "Graziela", "0000000000000", 2018, true);

        System.out.println("Livro: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Ano: " + livro1.getAno());
        System.out.println("Isbn: " + livro1.getIsbn());
        System.out.println("Disponivel: " + livro1.getDisponivel());
        System.out.println("Idade do livro: " + livro1.calcularIdadeLivro());
        System.out.println("O livro antigo? " + livro1.verificarLivroAntigo());
    }
}
