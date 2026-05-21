public class App {
    public static void main(String[] args) {
        System.out.println("POO - Java");

        Usuario usuarioWesley = new Usuario("Wesley Oliveira", "Emailteste@email.com","123456");
        System.out.println(usuarioWesley);

        Usuario usuariomaria = new Usuario("Maria", "Maria@email.com", "147852");
        System.out.println(usuariomaria.getNomeComEmail());



        usuariomaria.setEmail("maria123@gmail.com");
        System.out.println(usuariomaria.getNomeComEmail());
        System.out.println(usuariomaria.getNome());


        /*
        meuUsuario.nome = "Wesley Oliveira";
        meuUsuario.email = "Emailteste@email.com";
        meuUsuario.senha = "123456";

        System.out.println("nome: " + meuUsuario.nome);
        System.out.println("email: " + meuUsuario.email);
        System.out.println("Senha: "+ meuUsuario.senha);

        System.out.println(meuUsuario.toString());
        */
    }
}
