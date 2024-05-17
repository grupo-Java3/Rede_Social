package redesocial.classes;

import java.util.ArrayList;
import java.util.HashMap;

public class Pessoa extends Usuario {
    public String nome = super.nomeUsuario;
    public HashMap lista_de_amigos = super.listaAmigo;
    public String descr;
    //costrutor
    public Pessoa() {
        super.tipoConta=1;
    }
    public Pessoa(String nome_de_usuario, String email, String senha){
        super(nome_de_usuario, email, senha);
        super.tipoConta=1;
    }
    
    public Pessoa(String nome, String descr, String nomeUsuario, String email, String senha) {
        super(nomeUsuario, email, senha);
        super.tipoConta=1;
        this.nome = nome;
        this.descr = descr;
    }
    //metodos
    public void adicionarAlguem(String nome, String classe){
        lista_de_amigos.put(nome, classe);
    }
    //get e setters do hash
    
    public HashMap getLista_de_amigos() {
        return lista_de_amigos;
    }

    public void setLista_de_amigos(HashMap lista_de_amigos) {
        this.lista_de_amigos = lista_de_amigos;
    }
    
    //get e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    @Override
    public String getEmail() {
        return email;
    }
    @Override
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String getSenha() {
        return senha;
    }
    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }
    @Override
    public int getTipoConta() {
        return tipoConta;
    }
    @Override 
    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", descr=" + descr +", amigos= {"+ getLista_de_amigos() +"}" +", email="+ super.email
                + ", nome usuario=" + super.nomeUsuario + ", senha=" + super.senha + '}';

    }

    
}
