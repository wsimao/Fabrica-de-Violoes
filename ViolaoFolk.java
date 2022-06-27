public class ViolaoFolk extends ViolaoPrototype {

    public ViolaoFolk() {
    }

    protected ViolaoFolk(ViolaoFolk vFolk){
        this.nome = vFolk.getNome();
        this.descricao = vFolk.getDescricao();
        this.cor = vFolk.getCor();
        this.qtdCordas = vFolk.getQtdCordas();
        this.valor = vFolk.getValor();
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
        return (new ViolaoFolk(this));
    }
    
}
