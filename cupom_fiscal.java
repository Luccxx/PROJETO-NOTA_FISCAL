package nota_fiscal;

import java.util.Random;
import java.util.Scanner;

public class cupom_fiscal {
    private int num;
    private String codigo;
    private String nome;
    private int uni;
    private float preco;
    
    Scanner scan = new Scanner(System.in);
    Random random = new Random();
    
    cupom_fiscal(){
        
    }
    
    cupom_fiscal(int num, String nome, int uni, float preco){
        this.num = num;
        this.nome = nome;
        this.uni = uni;
        this.preco = preco;
    }
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getUni() {
        return uni;
    }

    public void setUni(int uni) {
        this.uni = (int) uni;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public double valor_total(){
        return this.uni * this.preco;
    }
    
    public void requisitos_finais(){
        System.out.println("-------------------------------------------------------");
        System.out.println("\t\tOBRIGADO VOLTE SEMPRE !!!\n     Junte-se a nossa rede do bem e contribua para a\n"
                + "      preservação do meio ambiente! Cadastre-se em\n\t\twww.cupomverde.com.br\n    ou baixe o aplicativo"
                + " na google PLay e App Store.");
        System.out.println("-------------------------------------------------------");
    }

    
}
