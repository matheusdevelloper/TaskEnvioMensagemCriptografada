package com.example.criptografiamensagem.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.criptografiamensagem.model.MensagemCriptografada;
import com.example.criptografiamensagem.service.MensagemCriptografadaService;

@RestController
@RequestMapping("/mensagem")
public class MensagemCriptografadaController {
    
    @Autowired
    private  MensagemCriptografadaService mensagemCriptografadaService;
    
    public MensagemCriptografadaController(MensagemCriptografadaService mensagemCriptografadaService) {
        this.mensagemCriptografadaService = mensagemCriptografadaService;
    }

    @PostMapping
    public String adicionarMensagemCriptografado(@RequestBody MensagemCriptografada mensagem) throws Exception{
        return mensagemCriptografadaService.criptografarMensagem(mensagem);
    }
    
    @GetMapping
    public Map<String, String> imprimirMensagemDescriptografada() throws Exception{
        return  mensagemCriptografadaService.descriptografarMensagem();
    }


}
