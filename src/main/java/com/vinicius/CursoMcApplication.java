package com.vinicius;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vinicius.dodmain.enums.TipoCliente;
import com.vinicius.domain.Categoria;
import com.vinicius.domain.Cidade;
import com.vinicius.domain.Cliente;
import com.vinicius.domain.Endereco;
import com.vinicius.domain.Estado;
import com.vinicius.domain.Produto;
import com.vinicius.repository.CategoriaRepository;
import com.vinicius.repository.CidadeRepository;
import com.vinicius.repository.ClienteRepository;
import com.vinicius.repository.EnderecoRepository;
import com.vinicius.repository.EstadoRepository;
import com.vinicius.repository.ProdutoRepository;

@SpringBootApplication
public class CursoMcApplication implements CommandLineRunner{
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private CidadeRepository cidadeRepository;
	@Autowired
	private EstadoRepository estadoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(CursoMcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		Categoria cat1 = new Categoria(null, "Informatica");
		Categoria cat2 = new Categoria(null, "Ecritorio");
		//987897
		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);
		
		Estado est1 = new Estado(null,"Minas Gerais");
		Estado est2 = new Estado(null,"São Paulo");
		// em um relacionamento muitos pra um podemos perceber que na parte do "um" ele fica bem nitido;
		Cidade c1 = new Cidade(null, "Uberlandia", est1);
		Cidade c2 = new Cidade(null, "São Paulo", est2);
		Cidade c3 = new Cidade(null, "Campinas", est2);
		
		Cliente cli1 = new Cliente(null, "Maria Silva", "maria@gmail.com", "125654322", TipoCliente.PESSOAFISICA);
		
		Endereco e1 = new Endereco(null,"Rua Flore", "32", "Casa", "78990-123", "Jardin São Paulo", cli1, c3);
		Endereco e2 = new Endereco(null,"Rua Nobel", "900", "Apt", "70990-123", "Jardin Paulista", cli1, c2);
		
		// quando temos uma lista devemos  usar essa metodologia para estanciar os objetos da lista usado em reacionamentos muitos pra muitos ou 
		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		est1.getCidades().addAll(Arrays.asList(c1));
		est2.getCidades().addAll(Arrays.asList(c2,c3));
		
		cli1.getTelefones().addAll(Arrays.asList("(81) 9 9889-9988", "(81) 9 3222-3322"));	
		cli1.getEnderecos().addAll(Arrays.asList(e1,e2));
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));
		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(c1, c2, c3));
		clienteRepository.saveAll(Arrays.asList(cli1));
		enderecoRepository.saveAll(Arrays.asList(e1,e2));
		
	}
	
	

}
