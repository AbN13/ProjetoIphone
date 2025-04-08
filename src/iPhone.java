public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        try {
            System.out.write("Tocando música...\n".getBytes("UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void pausar() {
        try {
            System.out.write("Pausando música...\n".getBytes("UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        try {
            System.out.write(("Selecionando música: " + musica + "\n").getBytes("UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void ligar(String numero) {
        try {
            System.out.write(("Ligando para: " + numero + "\n").getBytes("UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atender() {
        try {
            System.out.write("Atendendo ligação...\n".getBytes("UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        try {
            System.out.write("Iniciando correio de voz...\n".getBytes("UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exibirPagina(String url) {
        try {
            System.out.write(("Exibindo página: " + url + "\n").getBytes("UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void adicionarNovaAba() {
        try {
            System.out.write("Adicionando nova aba...\n".getBytes("UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizarPagina() {
        try {
            System.out.write("Atualizando página...\n".getBytes("UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
