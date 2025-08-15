package aula_pratica;

public class Estudante {
    private String nome;
    private int notaFinal;

    public String getNome() {
        return nome;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public void setNome(String nome) {
        if(nome != null){
            this.nome = nome;
        }
    }

    public void setNotaFinal(int notaFinal) {
        if(notaFinal >= 0 && notaFinal <= 100){
            this.notaFinal = notaFinal;
        }
    }

    public void armazenar(String nome, int notaFinal) {
        setNome(nome);
        setNotaFinal(notaFinal);
    }

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Nota Final: " + this.notaFinal);
    }

}
