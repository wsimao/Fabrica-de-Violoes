public class ViolaoDuploZero extends ViolaoPrototype {

    public ViolaoDuploZero() {
    }

    protected ViolaoDuploZero(ViolaoDuploZero vDuploZero){
        this.nome = vDuploZero.getNome();
        this.descricao = vDuploZero.getDescricao();
        this.cor = vDuploZero.getCor();
        this.qtdCordas = vDuploZero.getQtdCordas();
        this.valor = vDuploZero.getValor();
    }

    @Override
    public String exibirInfo() {
        System.out.println("");
        System.out.println("");
        System.out.println("INFORMAÇÕES DO VIOLÃO");
        return ("Nome: "+getNome()+ "\nDescrição: "+getDescricao()+ "\nCor: "+getCor()+ "\nQuantidade de Cordas: "+getQtdCordas()+ "\nValor: "+getValor()+"\n\n");
    }

    @Override
    public ViolaoPrototype clonar() {
        return (new ViolaoDuploZero(this));
    }
    
}
