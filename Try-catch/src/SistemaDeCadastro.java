public class SistemaDeCadastro {
    public static void main(String[] args) {
        Pessoa cris = new Pessoa("Crislayne", "86616845524");

        cris.setEndereco("Rua Tal");
        Estados es = Estados.SERGIPE;
        cris.setEstado(es.getNome());

        System.out.println("Nome: " + cris.getNome() + "\n" + "CPF: " + cris.getCpf() + "\n" + "Endereço: " + cris.getEndereco() + "\n" + "Estado: " + cris.getEstado());
    }
}
