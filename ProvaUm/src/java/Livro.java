
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Livro implements Serializable{
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id_livro;
    
    private String Nome;
    private String Autor;
    private int Ano_Lancamento;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getAno_Lancamento() {
        return Ano_Lancamento;
    }

    public void setAno_Lancamento(int Ano_Lancamento) {
        this.Ano_Lancamento = Ano_Lancamento;
    }
    
    public boolean persiste() {
        return false; 
    }
    
    public int getId_livro() {
        return id_livro;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }
    
}