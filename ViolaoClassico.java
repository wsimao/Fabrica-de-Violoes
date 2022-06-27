public class ViolaoClassico extends ViolaoPrototype{

    protected ViolaoClassico(ViolaoClassico vClassico){
        this.nome = vClassico.getNome();
        this.descricao = vClassico.getDescricao();
        this.cor = vClassico.getCor();
        this.qtdCordas = vClassico.getQtdCordas();
        this.valor = vClassico.getValor();
    }

    public ViolaoClassico(){
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
        return (new ViolaoClassico(this));
    }

}