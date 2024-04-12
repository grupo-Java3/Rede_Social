
package redesocial.clases;

public class Pessoa extends Usuario{
    public String nome;
    public int idade;
    public String descr;
    //
    public Pessoa(String nome,int idade, String descr) {
        this.nome = nome;
        this.idade = idade;
        this.descr = descr;
        System.out.println(toString() + " foi criada");
    }
    //

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", descr=" + descr + '}';
    }
}
