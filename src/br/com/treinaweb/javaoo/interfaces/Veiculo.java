package br.com.treinaweb.javaoo.interfaces;

import br.com.treinaweb.javaoo.excecoes.AbastecimentoVeiculoLigadoException;
import br.com.treinaweb.javaoo.excecoes.AceleracaoVeiculoLigadoException;
import br.com.treinaweb.javaoo.excecoes.FrenagemVeiculoDesligadoException;

public interface Veiculo{

 void abastacer() throws AbastecimentoVeiculoLigadoException;
 void preparar();
}
