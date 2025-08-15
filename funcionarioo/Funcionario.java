
public class Funcionario {
        public String nome;
        public String cargo;
        public int salario;
        public int idade;

        public void cadastro (String nome, String cargo, int salario, int idade) {
            this.nome = nome;
            this.cargo = cargo;
            this.salario = salario;
            this.idade = idade;
        }
        public void imprimir() {
            System.out.println("Nome: " + this.nome);
            System.out.println("Cargo: " + this.cargo);
            System.out.println("Salario: " + this.salario);
            System.out.println("Idade: " + this.idade);
        }
}
