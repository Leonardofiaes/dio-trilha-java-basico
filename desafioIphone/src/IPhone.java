public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Método executável
    public static void main(String[] args) {
        IPhone meuIPhone = new IPhone();

        System.out.println(" Testando Reprodutor Musical:");
        meuIPhone.selecionarMusica("Imagine - John Lennon");
        meuIPhone.tocar();
        meuIPhone.pausar();

        System.out.println("\n Testando Aparelho Telefônico:");
        meuIPhone.ligar("1199999-8888");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        System.out.println("\n Testando Navegador na Internet:");
        meuIPhone.exibirPagina("https://www.apple.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }

    // ReprodutorMusical
    public void tocar() {
        System.out.println("Tocando música...");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    // AparelhoTelefonico
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // NavegadorInternet
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}
