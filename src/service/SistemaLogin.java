package service;

import model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class SistemaLogin {
    private List<Usuario> usuarios = new ArrayList<>();

    public void cadastrarUsuario(String nome, String email, String senha) {
       Usuario usuarioEncontrado = buscarUsuarioPorEmail(email);
        if (usuarioEncontrado != null){
            System.out.println("Usuário já cadastrado");
        }else {
        this.usuarios.add(new Usuario(nome, email, senha));
            System.out.println("Usuário cadastrado com sucesso");
        }

    }

    private Usuario buscarUsuarioPorEmail(String email) {
        for(Usuario usuario: this.usuarios) {
            if(usuario.getEmail().equalsIgnoreCase(email)) {
                return usuario;
            }
        }
        return null;
    }

    public Usuario login (String email, String senha) {
        Usuario usuarioEncontrado = buscarUsuarioPorEmail(email);

        if(usuarioEncontrado == null) {
            System.out.println("Usuario não encontrado");
            return null;
        }

        if(usuarioEncontrado.getSenha().equals(senha)) {
            System.out.println("Login realizado com sucesso");
            return usuarioEncontrado;
        }else {
            System.out.println("Senha incorreta");
            return null;
        }
    }

}
