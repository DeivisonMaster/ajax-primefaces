package br.com.ajax.processamentoparcial;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class CadastroUsuario implements Serializable {

	private String login;
	private String nome;
	
	public void cadastrar() {
		System.out.println("Login: " + this.login);
		System.out.println("Nome: " + this.nome);
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cadastro efetuado!"));
	}
	
	public void verificaDisponibilidadeLogin() {
		FacesMessage msg = null;
		
		if("admin".equalsIgnoreCase(this.login)) {
			msg = new FacesMessage(null, "Login atualmente em uso, tente outro!");
			msg.setSeverity(FacesMessage.SEVERITY_WARN);
			
		} else {
			msg = new FacesMessage(null, "Login disponivel!");
			msg.setSeverity(FacesMessage.SEVERITY_INFO);
		}
		
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
