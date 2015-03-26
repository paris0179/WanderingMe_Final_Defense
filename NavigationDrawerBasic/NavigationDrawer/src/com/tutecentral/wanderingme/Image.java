package com.tutecentral.wanderingme;

/**
 * Created by Aimee on 3/26/2015.
 */
import java.io.Serializable;

/**
 * Created by student on 2/14/15.
 */
public class Image implements Serializable {

    public static final String KEY = "Meme";

    protected String name;
    protected String description;
    protected int image_ref;
    //gets and sets name//
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//gets and sets description//

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//gets and sets image//

    public int getImage_ref() {
        return image_ref;
    }

    public void setImage_ref(int image_ref) {
        this.image_ref = image_ref;
    }

}
