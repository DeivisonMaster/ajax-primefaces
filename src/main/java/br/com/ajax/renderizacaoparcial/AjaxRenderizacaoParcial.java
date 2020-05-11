package br.com.ajax.renderizacaoparcial;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class AjaxRenderizacaoParcial implements Serializable {
	
	private String nome;
	private String nomeInvertido;
	private int quantidadePalavras;
	
	
	public void inverter() {
		this.nomeInvertido = "";
		
		for(int i = this.nome.length() - 1; i >= 0; i--) {
			char letra = this.nome.charAt(i);
			
		 	this.nomeInvertido += letra;
		 	
		 	if(letra == ' ') {
		 		this.quantidadePalavras++;
		 	}
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeInvertido() {
		return nomeInvertido;
	}
	public int getQuantidadePalavras() {
		return quantidadePalavras;
	}
	
}	
