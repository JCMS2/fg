
package fg;
  

public class Fg {

    
    public static void main(String[] args) {
       
class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

   
    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    
    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    // Método polimórfico para calcular benefícios
    public void calcularBeneficios() {
        System.out.println("Calculando benefícios para " + nome);
        // Lógica genérica para calcular benefícios
    }
}

// Classe FuncionarioEfetivo, derivada de Funcionario
class FuncionarioEfetivo extends Funcionario {
    private boolean planoSaude;

    // Construtor
    public FuncionarioEfetivo(String nome, String cargo, double salario, boolean planoSaude) {
        super(nome, cargo, salario);
        this.planoSaude = planoSaude;
    }

    // Método polimórfico para calcular benefícios
    @Override
    public void calcularBeneficios() {
        super.calcularBeneficios();
        // Lógica específica para funcionários efetivos
        if (planoSaude) {
            System.out.println("Benefício: Plano de Saúde");
        }
    }
}

// Classe FuncionarioTemporario, derivada de Funcionario
class FuncionarioTemporario extends Funcionario {
    private int duracaoContrato;

    // Construtor
    public FuncionarioTemporario(String nome, String cargo, double salario, int duracaoContrato) {
        super(nome, cargo, salario);
        this.duracaoContrato = duracaoContrato;
    }

    // Método polimórfico para calcular benefícios
    @Override
    public void calcularBeneficios() {
        super.calcularBeneficios();
        // Lógica específica para funcionários temporários
        System.out.println("Benefício: Contrato Temporário de " + duracaoContrato + " meses");
    }
}

    }
    
}