package model;

public class JavaBeans {
	
	private String id;
	private String nome;
	private String email;
	private Integer fone_ddd;
	private String fone_numero;
	private String fone_tipo;
	private String senha;

	public JavaBeans(String id, String nome, String email, Integer fone_ddd, String fone_numero, String fone_tipo, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.fone_ddd = fone_ddd;
		this.fone_numero = fone_numero;
		this.fone_tipo = fone_tipo;
		this.senha = senha;
	}

	public JavaBeans() {
		super();
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Integer getFone_ddd() {
		return fone_ddd;
	}
	
	public void setFone_ddd(Integer fone_ddd) {
		this.fone_ddd = fone_ddd;
	}
	
	public String getFone_numero() {
		return fone_numero;
	}
	
	public void setFone_numero(String fone_numero) {
		this.fone_numero = fone_numero;
	}
	
	public String getFone_tipo() {
		return fone_tipo;
	}
	
	public void setFone_tipo(String fone_tipo) {
		this.fone_tipo = fone_tipo;
	}
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	

}
