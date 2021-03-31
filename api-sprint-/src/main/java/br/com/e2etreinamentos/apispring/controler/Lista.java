package br.com.e2etreinamentos.apispring.controler;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.e2etreinamentos.modelo.Funcionario;

@RestController
@RequestMapping("/lista")
public class Lista {

	@GetMapping
	public List<Funcionario> lista() {

		Funcionario funcionario0 = new Funcionario("Anderson", "Analista de Teste", 1000.0);
		Funcionario funcionario1 = new Funcionario("Stefanny", "Scrum MasTer", 1000.0);
		Funcionario funcionario2 = new Funcionario("Lorenzo", "Product Owner", 1000.0);
		Funcionario funcionario3 = new Funcionario("Isadora", "Desenvolvedor", 1000.0);

		return Arrays.asList(funcionario0, funcionario1, funcionario2, funcionario3);
	}
}
