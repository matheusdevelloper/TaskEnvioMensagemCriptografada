package com.example.criptografiamensagem.model;

public class MensagemCriptografada {

    private String mensagem;
    
    public MensagemCriptografada() {
    }

    public MensagemCriptografada(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    
}
