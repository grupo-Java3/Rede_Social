package redesocial.classes;

import java.util.Scanner;

public class Pessoa extends Usuario {

    public String nome;
    public String descr;
    private Scanner entrada;
    //costrutor
    public Pessoa() {
        this.entrada = new Scanner(System.in);
        super.tipoConta = 1;
    }

    public Pessoa(String nome, String descr) {
        this.entrada = new Scanner(System.in);
        super.tipoConta = 1;
        
        this.nome = nome;
        this.descr = descr;
    }
    
    public Pessoa(String nome, String descr, String nomeUsuario, String email, String senha) {
        super(nomeUsuario, email, senha);
        
        this.entrada = new Scanner(System.in);
        super.tipoConta = 1;
        
        this.nome = nome;
        this.descr = descr;
    }
    //

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", descr=" + descr + ", email="+ super.email
                + ", nome usuario=" + super.nomeUsuario + ", senha=" + super.senha + '}';

    }

    
}
