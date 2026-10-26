/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aprendiendoapi;

/**
 *
 * @author Titoelgato
 */

import Modelo.Post;
import Servicio.ApiService;
import java.io.IOException;

public class AprendiendoAPI {

    public static void main(String[] args) {
        System.out.println("Consumiendo apis de fake api");
        ApiService apiservice = new ApiService();
        
        try {
            Post post = apiservice.getpost(100);
            
            if (post != null) {
                System.out.println("recibiendo post");
                System.out.println("ID: " + post.getId());
                System.out.println("titulo: " + post.getTitle());
                System.out.println("cuerpo o contenido: " + post.getBody());
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("error:");
            e.printStackTrace();
        }
    }
}