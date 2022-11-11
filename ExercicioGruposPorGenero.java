package br.com.charles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioGruposPorGenero {
	
	private List<Pessoa> listaFeminino;
	
	private List<Pessoa> listaMasculino;
	
	public ExercicioGruposPorGenero() {
		this.listaFeminino = new ArrayList<Pessoa>();
		this.listaMasculino = new ArrayList<Pessoa>();
	}

	public void separaPorGenero(String entrada) {
		final String mensagemErro = "Entrada inválida. Informe: <primeiro nome> <genero como F ou M>";
		
		if (entrada != null) {
			String[] dados = entrada.split(" ");
			if (dados != null && dados.length == 2) {
				String nome = dados[0];
				Character genero = dados[1].charAt(0);
				Pessoa pessoa = new Pessoa(nome, genero);
				switch (genero) {
				case 'F': {
					this.listaFeminino.add(pessoa);
					break;
				}
				case 'M': {
					this.listaMasculino.add(pessoa);
					break;
				}
				default:
					throw new IllegalArgumentException(mensagemErro);
				}

			} else {
				throw new IllegalArgumentException(mensagemErro);
			}
		} else {
			throw new IllegalArgumentException(mensagemErro);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String entrada = "";
		ExercicioGruposPorGenero exercicio = new ExercicioGruposPorGenero();

        try {
			System.out.println("Informe: <primeiro nome> <genero como F ou M>");
			entrada = in.nextLine();
			while (!"exit".equals(entrada)) {
				try {
					exercicio.separaPorGenero(entrada);
					System.out.println("Lista Feminino: " + exercicio.listaFeminino);
					System.out.println("Lista Masculino: " + exercicio.listaMasculino);

				} catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}

				System.out.println("Informe: <primeiro nome> <genero como F ou M>");
				entrada = in.nextLine();
			}

		} finally {
			in.close();
		}
	}

}
