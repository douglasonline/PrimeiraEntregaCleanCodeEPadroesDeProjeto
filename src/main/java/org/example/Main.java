package org.example;

import org.example.modelo.Cargo;
import org.example.modelo.Funcionario;
import org.example.modelo.FuncionarioTerceirizado;
import org.example.modelo.Setor;
import org.example.Servicos.ReajusteServico;

public class Main {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Alice", "Rua A", 3000.0, Setor.DESENVOLVIMENTO, Cargo.PLENO);
        func1.addTelefone("1234-5678");

        FuncionarioTerceirizado func2 = new FuncionarioTerceirizado("Bob", "Rua B", 2500.0, Setor.DEVOPS, Cargo.JUNIOR, "Empresa XYZ", 12);
        func2.addTelefone("8765-4321");

        ReajusteServico reajusteServico = new ReajusteServico();

        boolean reajusteAplicadoFunc1 = reajusteServico.reajustarSalario(func1, 10);
        boolean reajusteAplicadoFunc2 = reajusteServico.reajustarSalario(func2, 10);

        if (reajusteAplicadoFunc1) {
            System.out.println("Salário após reajuste: " + func1.getSalario());
        }
        if (reajusteAplicadoFunc2) {
            System.out.println("Salário após reajuste: " + func2.getSalario());
        }
    }
}