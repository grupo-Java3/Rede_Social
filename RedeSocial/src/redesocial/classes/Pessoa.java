package redesocial.classes;

import java.util.Scanner;

public class Pessoa extends Usuario {

    public String nome;
    public String data;
    public String descr;
    private Scanner entrada;
    //costrutor
    public Pessoa() {
        this.entrada = new Scanner(System.in);
    }

    public Pessoa(String nome, String data, String descr, String nomeUsuario, String email, String senha, int tipoConta) {
        super(nomeUsuario, email, senha, tipoConta);
        this.nome = nome;
        this.data = data;
        this.descr = descr;
    }

    //
    public void CriarPessoa() {
        
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + data + ", descr=" + descr + '}';
    }
}
