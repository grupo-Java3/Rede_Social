
package redesocial.classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa extends Usuario{
    public String nomeComercial;
    public ArrayList<String> produtos = new ArrayList();//!!reformular vai ser produtos mesmo ou só strings!!
    //construtor
    public Empresa(){
    }

    public Empresa(String nomeComercial, ArrayList<String> produtos){
        this.nomeComercial = nomeComercial;
        this.produtos = produtos;
    }
    
    public Empresa(String nomeComercial,String nomeUsuario, String email, String senha) {
        super(nomeUsuario, email, senha);
        this.nomeComercial = nomeComercial;
        
    }
    //metodos
    public void adicionar(String prod){
        produtos.add(prod);
    }
    //

    public String getNomeComercial() {
        return nomeComercial;
    }

    public void setNomeComercial(String nomeComercial) {
        this.nomeComercial = nomeComercial;
    }

    public ArrayList<String> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<String> produtos) {
        this.produtos = produtos;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }
    
    @Override
    public String toString() {
        return "Empresa{" + "NomeComercial=" + nomeComercial + ", produtos=" + produtos + ", email="+ super.email
                + ", nome usuario=" + super.nomeUsuario + ", senha=" + super.senha + '}';
    }
    
}
