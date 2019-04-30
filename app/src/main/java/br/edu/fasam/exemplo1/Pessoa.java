package br.edu.fasam.exemplo1;

public class Pessoa {

    protected String nome;
    protected String sobrenome;
    protected String email;
    protected String telefone;

    public Pessoa(){}

    public Pessoa(final String nome,
                  final String sobrenome,
                  final String email,
                  final String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {   return email;   }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    }
