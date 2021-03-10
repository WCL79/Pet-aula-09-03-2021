package br.com.zup.pet.exceptions;

/**
 * @author Weslley.candido
 * @version 0.01
 * Classe responsavel pela criação de objetos de ERROS
 */
public class ObjetoDeErro {
    private String notificacao;
    private String campo;

    /**
     * Construtor com parametro vazio
     */
    public ObjetoDeErro() {
    }

    /**
     * Os geteres e seteres devem ser aplicados respeitando padrão JavaBean
     * @return
     */
    public String getNotificacao() {
        return notificacao;
    }

    public void setNotificacao(String notificacao) {
        this.notificacao = notificacao;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }
}
