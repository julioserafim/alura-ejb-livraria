package br.com.caelum.livraria.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.caelum.livraria.dao.LivroDao;
import br.com.caelum.livraria.modelo.Livro;

@Stateless
public class LivroService {

	@Inject
	private LivroDao livroDao;

	public void salva(Livro livro) {
		this.livroDao.salva(livro);
	}

	public List<Livro> todosLivros() {
		return this.livroDao.todosLivros();
	}

	public List<Livro> livrosPeloTitulo(String titulo) {
		return this.livroDao.livrosPeloTitulo(titulo);
	}
}
