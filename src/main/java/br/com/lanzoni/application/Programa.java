package br.com.lanzoni.application;

import br.com.lanzoni.Pessoa;
import br.com.lanzoni.domain.Usuario;
import br.com.lanzoni.service.UsuarioServico;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
@ComponentScan("br.com.lanzoni")
public class Programa {

    public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);
        Usuario usuario = new Usuario("Vinicius", "vinicius@teste.com", "vinicius");

        System.out.println("Deseja recuperar a senha? (S/N)");
        String resposta = lerDados.nextLine();
        if(resposta.equalsIgnoreCase("S")) {
            ApplicationContext context = new AnnotationConfigApplicationContext(Programa.class);
            UsuarioServico usuarioServico = context.getBean(UsuarioServico.class);

            usuarioServico.setUsuario(usuario);
            usuarioServico.lembrarSenhaPorEmail();

        }
    }

}
