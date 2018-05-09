package com.example.a17vikab.androidstudio_projekt;

/**
 * Created by a17vikab on 2018-05-08.
 */

public class Data {

    public int id;
    public String name;
    public String company;
    public String location;
    public String category;
    public int size;
    public int cost;
    public String auxdata;

    public Data(int id, String name, String company, String location, String category, int size, int cost, String auxdata){
        this.id = id;
        this.name = name;
        this.company = company;
        this.location = location;
        this.category = category;
        this.size = size;
        this.cost = cost;
        this.auxdata = auxdata;
    }

    public int getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getCompany(){
        return company;
    }

    public String getLocation(){
        return location;
    }

    public String getCategory(){
        return category;
    }

    public int getSize(){
        return size;
    }

    public int getCost(){
        return cost;
    }

    public String getAuxdata(){
        return auxdata;
    }

    public String toastText(){
        return name + "(" + size + "g) is made by " + company + " and costs " + cost +"kr at " + location + ". '" + auxdata + "'.";
    }

    @Override
    public String toString() {
        return name;
    }

}
