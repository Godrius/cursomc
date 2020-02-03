package com.godrius.cursomc.domain;

import java.io.Serializable;


public class Categoria implements Serializable {

	/*
	 * A serialização em Java é o processo no qual a instância de um objeto é transformada em uma sequência de bytes 
	 * e é útil quando precisamos enviar objetos pela rede, salvar no disco, ou comunicar de uma JVM com outra. 
	 * Isso porque o estado atual do objeto é “congelado” e na outra “ponta” nós podemos “descongelar” este objeto 
	 * sem perder nenhuma informação.
	 * */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	
	public Categoria() {
		
	}

	public Categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/*
	 * A maior vantagem em sobrescrever os métodos hashCode e equals é melhorar a busca dos objetos em uma lista. 
	 *  
	 * */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
