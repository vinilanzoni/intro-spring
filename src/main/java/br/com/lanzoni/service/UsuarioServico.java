package br.com.lanzoni.service;

import br.com.lanzoni.domain.Mailer;
import br.com.lanzoni.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServico {

    private Usuario usuario;

    @Autowired
    private Mailer mailer;

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void lembrarSenhaPorEmail() {
        //O banco de dados poderia ser acessado aqui para recuperação da senha do usuário.
        mailer.setDestinatario(usuario.getEmail());
        mailer.setMensagem("A senha do usuário: " + usuario.getLogin() + " é " + usuario.getSenha());
        mailer.enviarEmail();
    }
}
