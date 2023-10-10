public enum Estados {
    BAHIA ("Bahia", "BA"),
    SERGIPE ("Sergipe", "SE");

    private String nome;
    private String sigla;

    private Estados(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase(null);
    }

}


