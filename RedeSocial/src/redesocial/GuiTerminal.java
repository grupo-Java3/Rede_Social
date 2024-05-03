package redesocial;

import redesocial.classes.Usuario;

public class GuiTerminal {
    private int pag_atual;
    private boolean sta;
    public Usuario usuario;
    
    //cosntrutor
    public GuiTerminal(){
        pag_atual = 0;
        sta = true;
    }
    public GuiTerminal(Usuario adm){
        pag_atual = 0;
        sta = true;
        this.usuario = adm;
    }
    public void printar(){
        System.out.printf("pag: %d%n", pag_atual);
        switch (pag_atual) {
            case 0:
                //não consegui fazer um array de strings
                System.out.printf("%s%n%s%n%s", "################", "##REDE##SOCIAL##", "################");
                System.out.printf("Opcoes:%n1 - login%n2 - cadastrar%n3 - sair%n4 - listar todos%n>>");
                break;
                
                
            case 1://login
                System.out.printf("%s%n%s%n%s", "################", "######LOGIN#####", "################");
                System.out.printf("--usuario--");
                
                break;
                
                
            case 2://cadastro
                System.out.println("pag2");
                break;
                
                
            case 3://sair
                this.sta = false;
                break;
                
            case -1:
                usuario.listar();
                break;
        }
    
    }

    public int getPag_atual() {
        return pag_atual;
    }

    public void setPag_atual(int pag_atual) {
        this.pag_atual = pag_atual;
    }

    public boolean isSta() {
        return sta;
    }

    public void setSta(boolean sta) {
        this.sta = sta;
    }
    
}
