public class ViolaoJumbo extends ViolaoPrototype{

    public ViolaoJumbo() {
    }

    protected ViolaoJumbo(ViolaoJumbo vJumbo){
        this.nome = vJumbo.getNome();
        this.descricao = vJumbo.getDescricao();
        this.cor = vJumbo.getCor();
        this.qtdCordas = vJumbo.getQtdCordas();
        this.valor = vJumbo.getValor();
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
        return (new ViolaoJumbo(this));
    }
    
}
