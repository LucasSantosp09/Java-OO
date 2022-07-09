package br.com.treinaweb.javaoo.classes;

import br.com.treinaweb.javaoo.excecoes.AbastecimentoVeiculoLigadoException;

public final class Carro extends VeiculoBase {
	
	private int quantidadePortas;
	
	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	public Carro() {
		this.quantidadeRodas = 4;
	}
	
	public Carro(String nome, String marca) { // Carro(String, String)
		this.quantidadeRodas = 4;
		this.setNome(nome);
		this.setMarca(marca);
	}

	@Override
	public void preparar() {
		System.out.println("Colocar o cinto de segurança.");
	}

	@Override
	public void abastacer() throws AbastecimentoVeiculoLigadoException {
		// TODO Auto-generated method stub
		
	}

}
