public abstract class ViolaoPrototype {

    protected String nome;
    protected String descricao;
    protected String cor;
    protected String qtdCordas;
    protected double valor;

    public String getQtdCordas() {
        return qtdCordas;
    }


    public void setQtdCordas(String qtdCordas) {
        this.qtdCordas = qtdCordas;
    }


    public String getCor() {
        return cor;
    }


    public void setCor(String cor) {
        this.cor = cor;
    }


    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String exibirInfo();

    public abstract ViolaoPrototype clonar();












    

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }
}
