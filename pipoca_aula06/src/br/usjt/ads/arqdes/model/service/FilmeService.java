package br.usjt.ads.arqdes.model.service;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.ads.arqdes.model.dao.FilmeDAO;
import br.usjt.ads.arqdes.model.entity.Filme;
@Service
public class FilmeService {
	@Autowired
	private FilmeDAO dao;
	
	public Filme buscarFilme(int id) throws IOException{
		return dao.buscarFilme(id);
	}
	
	@Transactional
	public Filme inserirFilme(Filme filme) throws IOException {
		int id = dao.inserirFilme(filme);
		filme.setId(id);
		return filme;
	}

	public List<Filme> listarFilmes(String chave) throws IOException{
		return dao.listarFilmes(chave);
	}

	public List<Filme> listarFilmes() throws IOException{
		return dao.listarFilmes();
	}
	
	@Transactional
	public void atualizarFilme(Filme filme) throws IOException {
		dao.atualizarFilme(filme);
	}
	
	@Transactional
	public void excluirFilme(int id) throws IOException {
		dao.excluirFilme(id);
	}

}
