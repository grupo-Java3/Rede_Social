
package redesocial.clases;

import java.util.ArrayList;

public class ListaUsuario {
     private ArrayList<Pessoa> listaPessoa = new ArrayList();
     private ArrayList<Empresa> listaEmpresa = new ArrayList();
    //
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
