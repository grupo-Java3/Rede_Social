package redesocial.classes;

import java.util.ArrayList;

public class Usuario{
    public String nomeUsuario;
    protected String email;
    protected String senha;
    protected int tipoConta; // 0 usuario , 1 pessoa, 2 empresa
   //coisas de adm
    private ArrayList<Pessoa> listaPessoa = new ArrayList();
    private ArrayList<Empresa> listaEmpresa = new ArrayList();
   //construtor (precisa?? PRECISA!!)
    public Usuario(){
        this.tipoConta = 0;
    }

    public Usuario(String nomeUsuario, String email, String senha) {
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
    }
   //metodos
    public void CriarUsuario(String indetificador, String email, String senha, int tipo) {
        this.nomeUsuario = indetificador;
        this.email = email;
        this.senha = indetificador;
        this.tipoConta = tipo;
    }
    
     public void adicinar(Pessoa pessoa){
        listaPessoa.add(pessoa);
     }
     public void adicionarPessoa (String nome, String descricao, String nomeUsuario,String email, String senha){
         Pessoa pessoa = new Pessoa(nome, senha, nomeUsuario, email, senha);
         listaPessoa.add(pessoa);
     }
     public void adicionarPessoaS (){
         /*função "segura" de adicionar pessoas para que não haja pessoas com 
         com id ou indetificação como usuario iguais*/
     }
     public void removerPessoa (Pessoa pessoaRM){
         listaPessoa.remove(pessoaRM);
     }
    
     
     
     public void adicionar(Empresa empresa){
         listaEmpresa.add(empresa);
     }
      public void adicionarEmpresa (String nome_comercial, String nomeUsuario, String email, String senha){
         Empresa empresa = new Empresa(nome_comercial, nomeUsuario, email, senha);
         listaEmpresa.add(empresa);
     }
     public void adicionarEmpresaS (){
         /*função "segura" de adicionar pessoas para que não haja pessoas com 
         com id ou indetificação como usuario iguais*/
     }
     public void removerEmpresa (Pessoa pessoaRM){
         listaPessoa.remove(pessoaRM);
     }
     public void adicionarProduto (String nome_da_empresa, String[] produtos){
         for (int i = 0; i < listaEmpresa.size(); i++){
             if (nome_da_empresa.equals(listaEmpresa.get(i).nomeUsuario)){
                 
                 for (int j = 0; j < produtos.length; j++){
                     listaEmpresa.get(i).produtos.add(produtos[j]);
                 }//adiciona os produtos na empresa
             }
         }
     } 
     public void listar(){
         System.out.print("Pessoas = [\n");
         for (int i = 0; i < listaPessoa.size(); i++){
             System.out.println(i + " " + listaPessoa.get(i).toString());
         }
         System.out.println("]");
         
         System.out.print("Empresas = [");
         for (int i = 0; i < listaEmpresa.size(); i++){
             System.out.println(i + " " + listaEmpresa.get(i).toString());
         }
         System.out.println("]");
     }
     
    
    //??
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