package com.tutecentral.wanderingme;

import com.tutecentral.navigationdrawer.R;

import java.util.ArrayList;

/**
 * Created by Aimee on 3/20/2015.
 */
public class FriendsItemsGenerator {
    public static ArrayList<FriendsItems> generateItems(){

        ArrayList<FriendsItems> list = new ArrayList<FriendsItems>();

        list.add(new FriendsItems("Alona Fernandez", R.drawable.pamela,"Time is Gold", "USA"));
        list.add(new FriendsItems("Catherine Torres", R.drawable.diana,"The Key to Success is Hard Work", "AUS"));
        list.add(new FriendsItems("Shanice Yap", R.drawable.shanice,"To See is to Believe", "CHN"));
        list.add(new FriendsItems("Cody Peterson", R.drawable.cody,"Live Your Life to the Fullest", "USA"));
        list.add(new FriendsItems("Kevin Armstrong", R.drawable.kevin,"Money makes the world go round", "NZ"));
        list.add(new FriendsItems("Matt Andrews", R.drawable.matt,"Beauty is in the eye of the Beholder", "BRZ"));
        list.add(new FriendsItems("Melissa Park", R.drawable.melissa,"Try and Try 'til you Succeed", "SKR"));
        list.add(new FriendsItems("Michael Stevenson", R.drawable.mihael,"Knowledge is Power", "USA"));
        list.add(new FriendsItems("Nelson Mandela", R.drawable.nelson,"Words are sharper than Swords", "SAF"));
        list.add(new FriendsItems("Tim Duncan", R.drawable.tim,"Keep your eye on the Goal", "SAC"));

        return list;
    }
}
