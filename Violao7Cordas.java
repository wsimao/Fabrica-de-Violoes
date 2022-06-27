public class Violao7Cordas extends ViolaoPrototype{

    public Violao7Cordas() {
    }



    protected Violao7Cordas(Violao7Cordas v7Cordas){
        this.nome = v7Cordas.getNome();
        this.descricao = v7Cordas.getDescricao();
        this.cor = v7Cordas.getCor();
        this.qtdCordas = v7Cordas.getQtdCordas();
        this.valor = v7Cordas.getValor();
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
        return (new Violao7Cordas(this));
    }
    
}
