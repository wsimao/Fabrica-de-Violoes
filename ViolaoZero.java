public class ViolaoZero extends ViolaoPrototype{

    public ViolaoZero() {
    }

    protected ViolaoZero(ViolaoZero vZero){
        this.nome = vZero.getNome();
        this.descricao = vZero.getDescricao();
        this.cor = vZero.getCor();
        this.qtdCordas = vZero.getQtdCordas();
        this.valor = vZero.getValor();
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
        return (new ViolaoZero(this));
    }
    
}
