package br.com.lanzoni.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mailer {

    private String destinatario;

    @Value("contato@teste.com")
    private String remetente;

    @Value("Lembrete de senha")
    private String titulo;

    private String mensagem;

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void enviarEmail () {
        // Simulando envio de email
        System.out.println("*** Email enviado com sucesso! ***");
        System.out.println("Titulo do email: " + titulo);
        System.out.println("Remetente: " + remetente);
        System.out.println("Destinatario: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
    }
}
