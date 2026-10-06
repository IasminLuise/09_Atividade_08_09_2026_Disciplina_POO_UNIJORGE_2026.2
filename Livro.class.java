import java.time.Year;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private int ano;
    private boolean disponivel;

    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getIsbn(){
        return this.isbn;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public int getAno(){
        return this.ano;
    }
    public void setAno(int ano){
        if (ano <= Year.now().getValue() && ano > 0){
            this.ano = ano;
        }else{
            this.ano = 0;
        }
    }

    public boolean getDisponivel(){
        return this.disponivel;
    }
    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }

    public int calcularIdadeLivro(){
        return Year.now().getValue() - ano;
    }

    public Livro(String titulo, String autor, String isbn, int ano, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        setAno(ano);
        this.disponivel = disponivel;
    }

    public boolean verificarLivroAntigo(){
      if (calcularIdadeLivro() > 50){
          return true;
      }else{
          return false;
      }
    }
}
