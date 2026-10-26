/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Titoelgato
 */
import org.json.JSONObject;
public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;

    public Post(JSONObject json) {
        this.userId = json.getInt("userId");
        this.id = json.getInt("id");
        this.title = json.getString("title");
        this.body = json.getString("body");
    }

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }


    
   
    
    @Override
    public String toString(){
        return "post(id) : " + id + "titlr" + title + "body"+ body;
    }
    
}
