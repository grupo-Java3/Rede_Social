package redesocial.classes;

public class Pessoa extends Usuario {

    public String nome;
    public String descr;
    //costrutor
    public Pessoa() {
        super.tipoConta = 1;
    }

    public Pessoa(String nome, String descr) {
        super.tipoConta = 1;
        
        this.nome = nome;
        this.descr = descr;
    }
    public Pessoa(String nome_de_usuario, String email, String senha){
        super(nome_de_usuario, email, senha);
    }
    
    public Pessoa(String nome, String descr, String nomeUsuario, String email, String senha) {
        super(nomeUsuario, email, senha);
        
        super.tipoConta = 1;
        
        this.nome = nome;
        this.descr = descr;
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
        return "Pessoa{" + "nome=" + nome + ", descr=" + descr + ", email="+ super.email
                + ", nome usuario=" + super.nomeUsuario + ", senha=" + super.senha + '}';

    }

    
}
