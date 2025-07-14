package com.example.criptografiamensagem.service;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.stereotype.Service;

import com.example.criptografiamensagem.model.MensagemCriptografada;

@Service
public class MensagemCriptografadaService  {

    MensagemCriptografada msg = new MensagemCriptografada();
    private static final String CHAVE = "234567890abcdef1"; // Agora tem 16 caracteres

    public String criptografarMensagem(MensagemCriptografada mensagem) throws Exception {

        SecretKeySpec chave = new SecretKeySpec(CHAVE.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, chave);
        
        byte[] mensagemCriptografado = cipher.doFinal(mensagem.getMensagem().getBytes());
        String mensagemCodificadoCriptada = Base64.getEncoder().encodeToString(mensagemCriptografado);
        msg.setMensagem(mensagemCodificadoCriptada);
        
        return msg.getMensagem();
    }

    public Map<String, String> descriptografarMensagem() throws Exception {

        Map<String, String> resposta = new HashMap<>();

        try {
            SecretKeySpec chave = new SecretKeySpec(CHAVE.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, chave);
            
            String mensagem_criptografada_copia = msg.getMensagem();
           
            byte[] mensagemCodificada = Base64.getDecoder().decode(mensagem_criptografada_copia);
            byte[] mensagemDescriptografado = cipher.doFinal(mensagemCodificada);
            String mensagemDescodificada = new String(mensagemDescriptografado);
            resposta.put("mensagem",  mensagemDescodificada);
    
        } catch (Exception e) {
            resposta.put("mensagem", "Nenhuma mensagem válida para descriptografar.");
        }
      
        return resposta;
    }


    
}
