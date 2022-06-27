public class ViolaoFlet extends ViolaoPrototype{

    public ViolaoFlet() {
    }

    protected ViolaoFlet(ViolaoFlet vFlet){
        this.nome = vFlet.getNome();
        this.descricao = vFlet.getDescricao();
        this.cor = vFlet.getCor();
        this.qtdCordas = vFlet.getQtdCordas();
        this.valor = vFlet.getValor();
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
        return (new ViolaoFlet(this));
    }
    
}
