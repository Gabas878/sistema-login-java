package app;


import service.SistemaLogin;

public class SistemaTeste {

    public static void main(String[] args) {
        SistemaLogin sistema = new SistemaLogin();
        //Login ates de ter cadastrado Usuario: Usuario não Encontrado
        sistema.login("gabrielp@gmail.com", "123456");

        //Cadastro de Usuarios!!
        sistema.cadastrarUsuario("Gabriel Passos", "gabrielp@gmail.com", "123456");
        sistema.cadastrarUsuario("Clara", "clarav@gmail.com", "123456");
        // Cadastro de Usuario já Existente: "Usuario já Cadastrado"
        sistema.cadastrarUsuario("Gabriel Passos", "gabrielp@gmail.com", "123456");

        // Login!!
        sistema.login("gabrielp@gmail.com", "123456");

        // Login com senha errado: "Senha incorreta"
        sistema.login("gabrielp@gmail.com", "123457");

        // Login com email inexistente: "Usuario não Encontrado"
        sistema.login("ga@gmail.com", "123457");
    }
}
