package br.com.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_cliente")
public class Cliente implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_cliente")
	private Long id;
	
	@Column(name="nome_cliente",nullable=false,length=100)
	private String nome;
	
	@Column(name="email_cliente",nullable=false,length=100)
	private String emial;
	
	@Column(name="login_cliente",nullable=false, length=50)
	private String login;
	
	@Column(name="senha_cliente",nullable=false,length=30)
	private String senha;
	
	public Cliente(){}

	public Cliente(String nome, String emial, String login, String senha) {
		super();
		this.nome = nome;
		this.emial = emial;
		this.login = login;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmial() {
		return emial;
	}

	public void setEmial(String emial) {
		this.emial = emial;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Long getId() {
		return id;
	}

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
		Cliente other = (Cliente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
}
