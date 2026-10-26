/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

/**
 *
 * @author Titoelgato
 */

import Modelo.Post;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import static one.xingyi.core.http.JavaHttpClient.httpClient;
import org.json.JSONObject;

public class ApiService {
    // Crear nuestro cliente
    
    private static final HttpClient httpclient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();
    private static final String API_URL="https://jsonplaceholder.typicode.com/posts/";
    public Post getpost(int id) throws IOException, InterruptedException{
        HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(API_URL + id)).header("Accept", "Application/json").build();
        
        //enviar peticion
        
        HttpResponse <String> response = httpclient.send(request,HttpResponse.BodyHandlers.ofString());
        
        //Verificar respuesta
        
        if(response.statusCode()!= 200){
            
         System.out.println("Error:"+ response.statusCode());
         return null;
        }
        //mapear json
        
        String jsonString = response.body();
        
        //Crear un jsonObject
        
        JSONObject jsonObject = new JSONObject(jsonString);
        Post post = new Post(jsonObject);
        
        return post;
        }
    } 

