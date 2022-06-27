public class App{
    public static void main(String[] args) {

        ViolaoClassico VClassico = new ViolaoClassico();
        ViolaoPrototype vClassicoNovo = VClassico.clonar();

        vClassicoNovo.setNome("Violão Clássico");
        vClassicoNovo.setDescricao("O violão clássico é um modelo acústico e funciona com seis cordas (na maioria das vezes, feitas de nylon). Além da facilidade em encontrar esse modelo, ele possui um custo mais baixo quando comparado aos outros tipos, e também é indicado para iniciantes graças à sua leveza e maciez.");
        vClassicoNovo.setCor("Preto");
        vClassicoNovo.setQtdCordas("06");
        vClassicoNovo.setValor(3000);
        System.out.println(vClassicoNovo.exibirInfo());

        ViolaoFolk VFolk = new ViolaoFolk();
        ViolaoPrototype VFolkNovo = VFolk.clonar();

        System.out.println("====================================================================================================================================================================================================================================================================================================================================================");

        VFolkNovo.setNome("Violão Folk");
        VFolkNovo.setDescricao("Com o corpo maior e mais acinturado, os violões do tipo folk também são bastante populares entre os músicos. A maioria dos modelos desse tipo de violão funciona com a utilização de cordas de aço, podendo ser elétricos ou eletroacústicos. Esse tipo de violão é o mais indicado para gêneros como pop e rock, já que gera um som mais encorpado, com timbre diferenciado.");
        VFolkNovo.setCor("Marron");
        VFolkNovo.setQtdCordas("06");
        VFolkNovo.setValor(2000);
        System.out.println(VFolkNovo.exibirInfo());

        ViolaoFlet VFlet = new ViolaoFlet();
        ViolaoPrototype VFletNovo = VFlet.clonar();

        System.out.println("====================================================================================================================================================================================================================================================================================================================================================");

        VFletNovo.setNome("Violão Flet");
        VFletNovo.setDescricao("A palavra flat, do inglês, pode significar “plano” ou “liso”. É justamente essa a principal característica desse tipo de violão: sua caixa acústica é bastante fina! O violão flet é muito utilizado por músicos profissionais e na maioria dos casos é tocado com cordas de nylon. O timbre gerado por esse tipo de violão é mais suave. Vale lembrar que, por ser encontrado quase sempre em modelos elétricos, precisa de amplificação.");
        VFletNovo.setCor("Preto Fosco");
        VFletNovo.setQtdCordas("06");
        VFletNovo.setValor(1800);
        System.out.println(VFletNovo.exibirInfo());
        
        ViolaoJumbo VJumbo = new ViolaoJumbo();
        ViolaoPrototype VJumboNovo = VJumbo.clonar();

        System.out.println("====================================================================================================================================================================================================================================================================================================================================================");

        VJumboNovo.setNome("Violão Jumbo");
        VJumboNovo.setDescricao("O violão jumbo ficou famoso nas mãos de Elvis Presley, mas, apesar de ser bem parecido com o tipo clássico, a grande diferença está em seu corpo mais largo e na base mais arredondada. É mais fácil de encontrar modelos eletroacústicos e com cordas de aço. O som gerado pelo violão jumbo é mais grave e encorpado.");
        VJumboNovo.setCor("Verde escuro");
        VJumboNovo.setQtdCordas("06");
        VJumboNovo.setValor(4600);
        System.out.println(VJumboNovo.exibirInfo());

        Violao7Cordas V7Cordas = new Violao7Cordas();
        ViolaoPrototype V7CordasNovo = V7Cordas.clonar();

        System.out.println("====================================================================================================================================================================================================================================================================================================================================================");

        V7CordasNovo.setNome("Violão 7 Cordas");
        V7CordasNovo.setDescricao("Conhecido como o violão brasileiro, já que é indicado para acompanhar gêneros como o choro e o samba, esse tipo de violão não apresenta diferenças na sua estrutura quando comparado ao violão clássico. Porém seu diferencial está na sétima corda, que costuma ser afinada de maneira mais grave que as outras seis. Isso exige um conhecimento do músico que for tocá-lo.");
        V7CordasNovo.setCor("Beje");
        V7CordasNovo.setQtdCordas("07");
        V7CordasNovo.setValor(8100);
        System.out.println(V7CordasNovo.exibirInfo());

        Violao12Cordas V12Cordas = new Violao12Cordas();
        ViolaoPrototype V12CordasNovo = V12Cordas.clonar();

        System.out.println("====================================================================================================================================================================================================================================================================================================================================================");

        V12CordasNovo.setNome("Violão 12 Cordas");
        V12CordasNovo.setDescricao("Outro tipo de violão que também não apresenta diferenças na estrutura, o violão 12 cordas traz o dobro de cordas do que o clássico. Essas são agrupadas em duplas (metade delas afinadas com uma oitava acima). Esse tipo apresenta ressonância plena e exige técnica e prática para poder pressionar duas cordas simultaneamente.");
        V12CordasNovo.setCor("Branco");
        V12CordasNovo.setQtdCordas("12");
        V12CordasNovo.setValor(9200);
        System.out.println(V12CordasNovo.exibirInfo());

        ViolaoZero VZero =  new ViolaoZero();
        ViolaoPrototype VZeroNovo = VZero.clonar();

        System.out.println("====================================================================================================================================================================================================================================================================================================================================================");

        VZeroNovo.setNome("Violão Zero");
        VZeroNovo.setDescricao("Uma estrutura confortável para tocar por bastante tempo");
        VZeroNovo.setCor("Azul escuro");
        VZeroNovo.setQtdCordas("06");
        VZeroNovo.setValor(3075);
        System.out.println(VZeroNovo.exibirInfo());

        ViolaoDuploZero VDuploZero = new ViolaoDuploZero();
        ViolaoPrototype VDuploZeroNovo = VDuploZero.clonar();

        System.out.println("====================================================================================================================================================================================================================================================================================================================================================");

        VDuploZeroNovo.setNome("Violão Duplo Zero");
        VDuploZeroNovo.setDescricao("Apresenta uma boa sonoridade e sendo indicado para técnicas de fingerstyle");
        VDuploZeroNovo.setCor("Azul");
        VDuploZeroNovo.setQtdCordas("06");
        VDuploZeroNovo.setValor(2999);
        System.out.println(VDuploZeroNovo.exibirInfo());

        ViolaoTriploZero VTriploZero = new ViolaoTriploZero();
        ViolaoPrototype VTriploZeroNovo = VTriploZero.clonar();

        System.out.println("====================================================================================================================================================================================================================================================================================================================================================");

        VTriploZeroNovo.setNome("Violão Triplo Zero");
        VTriploZeroNovo.setDescricao("O triplo zero possui tamanho intermediário e gera um timbre mais peculiar");
        VTriploZeroNovo.setCor("Preto metálico");
        VTriploZeroNovo.setQtdCordas("06");
        VTriploZeroNovo.setValor(4179);
        System.out.println(VTriploZeroNovo.exibirInfo());
   
    }
}