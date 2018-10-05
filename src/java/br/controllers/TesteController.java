/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controllers;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author romulo.douro
 */
@Named(value = "testeController")
@SessionScoped
public class TesteController implements Serializable {

 public String getMensagem() {
  return "Olá de teste";
 }

}
