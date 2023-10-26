package br.com.fiap.disneyapi.data;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.seriesapi.model.Serie;

public class DisneyDao {
	
	List<Disney> disney = new ArrayList<>();
	
	public DisneyDao() {
		var disney1 = new Disney(
				1L, 
				"Lost", 
				"Todos morreram...", 
				"http..",
				4.0
			);
		var disney2 = new Disney(
				1L, 
				"Os outros", 
				"Todos brigam...", 
				"http..",
				5.0
			);
		disney.add(disney1);
		disney.add(disney2);
	}

	public List<Disney> findAll() {
		return disney;
	}

	public Disney findById(Long id) {
		return disney.get(0);
	}

	public void create(br.com.fiap.disneyapi.model.Disney disney2) {
		// INSERT INTO ....
		
	}

	public void update(Disney disney) {


}
}