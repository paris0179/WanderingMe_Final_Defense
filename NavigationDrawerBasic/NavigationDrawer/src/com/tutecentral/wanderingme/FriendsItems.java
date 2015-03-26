package com.tutecentral.wanderingme;

import java.io.Serializable;

/**
 * Created by Aimee on 3/20/2015.
 */
public class FriendsItems implements Serializable{
    protected FriendsItems f;
    protected String name;
    protected int image_ref;
    protected String description;
    protected String platform;

    //gets and sets name//
    public String getName() { return name;   }
    public String setName() { return name;   }


//gets and sets description//

    public String getDescription() {
        return description;
    }
    public String setDescription() {
        return description;
    }


//gets and sets platform//

    public String getPlatform() {
        return platform;
    }

//gets and sets image//

    public int getImage_ref() {
        return image_ref;
    }
    public int setImage_ref() {
        return image_ref;
    }



    public FriendsItems(String name, int image_ref, String description, String platform) {
        this.name=name;
        this.image_ref=image_ref;
        this.description=description;
        this.platform=platform;
    }

    public void add(FriendsItems f){
        this.f.name=name;
        this.f.image_ref=image_ref;
        this.f.description=description;
        this.f.platform=platform;
    }

}
