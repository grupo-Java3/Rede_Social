
package redesocial.clases;

public class Empresa extends Usuario{
    public String NomeComercial;
    public String[] produtos ={};
    //

    public Empresa(String NomeComercial, String[] Produtos) {
        this.NomeComercial = NomeComercial;
        this.produtos = Produtos;
    }
    
    //
    @Override
    public String toString() {
        return "Empresa{" + "NomeComercial=" + NomeComercial + ", produtos=" + produtos + '}';
    }
    
}
