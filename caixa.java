package nota_fiscal;
import java.util.Scanner;
import java.util.Random;

public class caixa {
    private String ID;
    private String senha= "0000";
    private String nome;
    
    Scanner scan = new Scanner(System.in);
    Random random = new Random();
    
    public caixa(){
        
    }
    
    public String getID() {
        return ID;
    }

    
    public void setID(String ID) {
        this.ID = ID;
    }

    
    public String getSenha() {
        return senha;
    }

    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getNome() {
        if("01102".equals(this.ID)){
            return this.nome = "1**** ********** *******";
        }else{
            return nome = "ID [" + this.getID() + "]";
        }
    }

    
    public void setNome(String nome) {
        this.nome = nome;
        
    }
    
    public void informar_senha(){
        System.out.println("CODIGO: ");
        String Id = scan.nextLine();
        while(Id.length()!=5){
            System.out.println("CODIGO INVALIDO!");
            System.out.println("CODIGO: ");
            Id = scan.nextLine();
            if(Id.length()==5){
                break;
            }
        }
        this.setID(Id);
        System.out.println("SENHA: ");
        String password = scan.nextLine();
        while(!this.senha.equals(password)){
            for(int i=0;i<3;i++){
                System.out.println("SENHA INVALIDA");
                System.out.println("SENHA: ");
                password = scan.nextLine();
                if(password.equals(this.senha)){
                    break;
                }
                
            }if(password.equals(this.senha)){
                break;
            }else{
                for(int j=0;j<500;j++){
                    System.out.println("ACESSO BLOQUEADO!!!");
                }
                System.exit(0);
            }
        }
        System.out.println("VERIFICANDO ID E SENHA...\n");
        System.out.println("BEM-VINDO | "+ this.getNome()+"\n");
        
    }
}
