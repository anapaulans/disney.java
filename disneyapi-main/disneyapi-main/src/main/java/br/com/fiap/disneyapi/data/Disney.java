package br.com.fiap.disneyapi.data;

public record Disney(
		Long id,
		String titulo,
		String sinopse,
		String poster, 
		Double nota
	) {

	}