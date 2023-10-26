package br.com.fiap.disneyapi.service;

import java.util.List;

import br.com.fiap.disneyapi.data.DisneyDao;
import br.com.fiap.disneyapi.model.Disney;

public class DisneyService {
	
	DisneyDao dao = new DisneyDao();

	public List<Disney> findAll() {
		return dao.findAll();
	}

	public Disney findById(Long id) {
		return dao.findById(id);
	}

	public boolean create(Disney disney) {
		if (!validar(disney)) return false;
		
		dao.create(disney);		
		return true;
	}

	private boolean validar(Disney disney) {
		if (disney.titulo().isEmpty()) return false;
		if (disney.nota() < 0 || disney.nota() > 5) return false;
		if (disney.sinopse().length() < 10) return false;
		if (!disney.poster().startsWith("http")) return false;
		
		return true;
	}

	public boolean update(Disney disney) {
		if (!validar(disney)) return false;
		
		dao.update(disney);
		return true;
		
	}
	
	
	
	
	
	
	
	
	
	
	

}