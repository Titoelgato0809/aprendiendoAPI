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
    private int userID;
    private int id;
    private String title;
    private String body;

    public Post(JSONObject json) {
        this.userID = json.getInt(body);
        this.id = json.getInt(body);
        this.title = json.getString(body);
        this.body = json.getString(body);
    }

    public int getUserID() {
        return userID;
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

    public void setUserID(int userID) {
        this.userID = userID;
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
