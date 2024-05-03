package redesocial.classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario{
    public String nomeUsuario;
    protected String email;
    protected String senha;
    protected int tipoConta;
    //coisas de adm
    private ArrayList<Pessoa> listaPessoa = new ArrayList();
    private ArrayList<Empresa> listaEmpresa = new ArrayList();
    //construtor (precisa??)
    public Usuario(){
        
    }

    public Usuario(String nomeUsuario, String email, String senha, int tipoConta) {
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.tipoConta = tipoConta;
        this.entrada = new Scanner(System.in);
    }
    //metodos
    public void adicionar(Pessoa pessoa){
         listaPessoa.add(pessoa);
     }
     public void adicionar(Empresa empresa){
         listaEmpresa.add(empresa);
     }
     public void listar(){
         System.out.println("pessoas: " + getListaPessoa() + "\nempresas: " + getListaEmpresa());
     }
    //
    public ArrayList<Pessoa> getListaPessoa() {
        return listaPessoa;
    }

    public void setListaPessoa(ArrayList<Pessoa> listaPessoa) {
        this.listaPessoa = listaPessoa;
    }

    public ArrayList<Empresa> getListaEmpresa() {
        return listaEmpresa;
    }

    public void setListaEmpresa(ArrayList<Empresa> listaEmpresa) {
        this.listaEmpresa = listaEmpresa;
    }

}