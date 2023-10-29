package com.nekoding;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Gson gson = new Gson();
        Person person = new Person("enggar tivandi");
        Asset asset = new Asset("Rumah");
        Person person1 = new Person("enggar tivandi", asset);
        String json = gson.toJson(person);
        String json1 = gson.toJson(person1);

        System.out.println(json);
        System.out.println(json1);
    }
}
