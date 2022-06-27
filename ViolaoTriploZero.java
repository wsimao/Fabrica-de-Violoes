public class ViolaoTriploZero extends ViolaoPrototype{

    public ViolaoTriploZero() {
    }

    protected ViolaoTriploZero(ViolaoTriploZero vTriploZero){
        this.nome = vTriploZero.getNome();
        this.descricao = vTriploZero.getDescricao();
        this.cor = vTriploZero.getCor();
        this.qtdCordas = vTriploZero.getQtdCordas();
        this.valor = vTriploZero.getValor();
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
        return (new ViolaoTriploZero(this));
    }
    
}
