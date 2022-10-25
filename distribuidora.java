package nota_fiscal;
import java.util.Random;

public class distribuidora extends consumidor {
    Random random = new Random();
    private String distribuidora = "1***** ************* */*";
    private String endereco = "1*. ******** ******** *******, */*";
    private String cnpj = "1-.---.---/-------";
    private String telefone = "(1*) **** ****";
    private int loja;
    private int pdv;
    private int seq;
    private String data = "07/10/2022";
    private String horario = "15:18";
    private int extrato;
    private cupom_fiscal cupom_fiscal;

    public distribuidora(){
        this.extrato = random.nextInt(999999);
        this.loja = random.nextInt(999);
        this.seq = random.nextInt(99999);
        this.pdv = random.nextInt(99);
        
    }
    
    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getLoja() {
        return loja;
    }

    public void setLoja(int loja) {
        this.loja = loja;
    }

    public int getPdv() {
        return pdv;
    }

    public void setPdv(int pdv) {
        this.pdv = pdv;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    public int getExtrato() {
        return extrato;
    }

    public void setExtrato(int extrato) {
        this.extrato = extrato;
    }
    
    //EXIBIR INFORMAÇÕES SOBRE O ESTABELECIMENTO NA NOTA FISCAL
    @Override
    public String toString(){
        return "-------------------------------------------------------\n\t\t"+ this.distribuidora + "\n\t  " +this.endereco + "\n\t\t  " +this.cnpj + 
                "\n\t\t" +"Telefone: "+this.telefone + "\nLOJA=0" + this.loja + "\t\tPDV=0"
                + this.pdv + "\t\t    Seq=0"+ this.seq + "\n" + this.data + " - " + this.horario + "\tVENDA"+ "\n-------------------------------------------------------";
    }
    
    public void Extrato(){
        System.out.println("\t\t   Extrato No."+this.extrato);
        System.out.println("\t\tCUPOM FISCAL ELETRONICO - SAT");
        System.out.println("-------------------------------------------------------");
    }
    
    public cupom_fiscal getCupom_fiscal() {
        return cupom_fiscal;
    }

    public void setCupom_fiscal(cupom_fiscal  cupom_fiscal) {
        this.cupom_fiscal = cupom_fiscal;
    }
    
   
    }

