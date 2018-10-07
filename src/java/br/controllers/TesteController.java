/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controllers;

import java.io.Serializable;
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
 
 private String palavra = "";
 private List<String> lista = new LinkedList<>();

 public String getMensagem() {
  return "Olá de teste";
 }

 public List<String> getLista() {
  return lista;
 }

 public String getPalavra() {
  return palavra;
 }

 public void setPalavra(String palavra) {
  this.palavra = palavra;
 }
 
  
 public void insere(){
  this.lista.add(this.palavra);
 }

}
