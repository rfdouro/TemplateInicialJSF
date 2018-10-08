/*
 * https://www.mkyong.com/jsf2/how-to-update-row-in-jsf-datatable/
 */
package br.controllers;

import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.view.ViewScoped;

/**
 *
 * @author romulo.douro
 */
@Named(value = "testeController")
@ViewScoped
public class TesteController implements Serializable {
 
 private Palavra palavra = new Palavra("");
 private List<Palavra> lista = new LinkedList<>(Arrays.asList(
         new Palavra("p1"), new Palavra("p2")
 ));

 public String getMensagem() {
  return "Olá de teste";
 }

 public List<Palavra> getLista() {
  return lista;
 }

 public Palavra getPalavra() {
  return palavra;
 }

 public void setPalavra(Palavra palavra) {
  this.palavra = palavra;
 }
 
 public void insere(){
  this.lista.add(this.palavra);
  this.palavra = new Palavra("");
 }
 
 public String saveAction(Palavra p) {
   
	  
		//get all existing value but set "editable" to false 
		for (Palavra order : lista){
			//order.setEditable(false);
   if(order.equals(p)){
    order.setEditable(false);
    order.setConteudo(this.palavra.getConteudo());
   }
   
		}
		//return to current page
		return null;
		
	}
	
	public String editAction(Palavra p) {
	    
		p.setEditable(true);
  this.palavra.setConteudo(p.getConteudo());
		return null;
	}
 
 public class Palavra implements Serializable{
		
		String conteudo;
		boolean editable;

		public Palavra(String conteudo) {
			this.conteudo = conteudo;
   this.editable = false;
		}

  public String getConteudo() {
   return conteudo;
  }

  public void setConteudo(String conteudo) {
   this.conteudo = conteudo;
  }

  public boolean isEditable() {
   return editable;
  }

  public void setEditable(boolean editable) {
   this.editable = editable;
  }
  
  
		
	}

}
