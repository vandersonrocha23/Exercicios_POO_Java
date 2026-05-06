/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ufba.mavenproject1;

/**
 *
 * @author vande
 */
import java.util.Set;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
public class Mavenproject1 {
    public static void main(String[] args) {
        //list
        Usuario user1 = new Usuario("Vanderson", "Brasileiro", 22);
        Usuario user2 = new Usuario("Kaue", "Brasileiro", 21);
        Usuario user3 = new Usuario("Tiago", "Brasileiro", 21);
        Usuario user4 = new Usuario("Jackson", "Brasileiro", 22);
        
        //adicionei os objetosd criados anteriormente, numa lista chamada "listaDeObjetos;
        
        List<Usuario> listaDeObjetos = new ArrayList<Usuario>();
        listaDeObjetos.add(user1);
        listaDeObjetos.add(user2);
        listaDeObjetos.add(user3);
        listaDeObjetos.add(user4);
        
        
        
    }
}
