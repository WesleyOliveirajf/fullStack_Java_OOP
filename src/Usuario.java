public class Usuario {
    private String nome;
    private String email;
    private String senha;



    public Usuario(String nome, String email, String senha){
        this.nome = nome;
        this.validaEmail(email);
        this.email = email;
        this.senha = senha;
    }


    private void validaEmail(String email){
        if (!email.contains("@")){
            System.out.println("Email invalido");
            throw new RuntimeException("Email invalido: "+ email);
        }
    }

    public void setEmail(String email) {
        this.validaEmail(email);
        this.email = email;
    }

    // SENHA

    private void validaSenha (String senha){
        if (senha.length() < 6);
        throw new RuntimeException("Senha deve ter pelo menos 06 digitos");
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomeComEmail(){
        return this.nome + " <" + this.email + "> ";
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
