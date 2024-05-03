
package redesocial.classes;

import java.util.ArrayList;

public class Empresa extends Usuario{
    public String nomeComercial;
    public ArrayList<String> produtos = new ArrayList();
    //

    public Empresa(String nomeComercial) {
        this.nomeComercial = nomeComercial;
    }
    //
    public void adicionar(String prod){
        produtos.add(prod);
    }
    //
    @Override
    public String toString() {
        return "Empresa{" + "NomeComercial=" + nomeComercial + ", produtos=" + produtos + '}';
    }
    
}
