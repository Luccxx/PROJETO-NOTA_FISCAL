package nota_fiscal;

public class cartoes  {
    private float limite_cartao_de_debito = 600;
    private float limite_cartao_de_credito = 600;
    private float limite_cartao_de_super = 600;
    private float limite_vale_alimentacao = 600;

    public cartoes() {
    }

    
    public float getLimite_cartao_de_debito() {
        return limite_cartao_de_debito;
    }

    
    public void setLimite_cartao_de_debito(float limite_cartao_de_debito) {
        this.limite_cartao_de_debito = limite_cartao_de_debito;
    }

    
    public float getLimite_cartao_de_credito() {
        return limite_cartao_de_credito;
    }

    
    public void setLimite_cartao_de_credito(float limite_cartao_de_credito) {
        this.limite_cartao_de_credito = limite_cartao_de_credito;
    }

    
    public float getLimite_cartao_de_super() {
        return limite_cartao_de_super;
    }

    
    public void setLimite_cartao_de_super(float limite_cartao_de_super) {
        this.limite_cartao_de_super = limite_cartao_de_super;
    }

    public float getLimite_vale_alimentacao() {
        return limite_vale_alimentacao;
    }

    public void setLimite_vale_alimentacao(float limite_vale_alimentacao) {
        this.limite_vale_alimentacao = limite_vale_alimentacao;
    }
    
    
}
