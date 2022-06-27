public class Violao12Cordas extends ViolaoPrototype{

    public Violao12Cordas() {
    }

    protected Violao12Cordas(Violao12Cordas v12Cordas){
        this.nome = v12Cordas.getNome();
        this.descricao = v12Cordas.getDescricao();
        this.cor = v12Cordas.getCor();
        this.qtdCordas = v12Cordas.getQtdCordas();
        this.valor = v12Cordas.getValor();
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
        return (new Violao12Cordas(this));
    }
    
}
