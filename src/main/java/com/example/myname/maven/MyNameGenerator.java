package com.example.myname.maven;

import com.google.gson.Gson;

public class MyNameGenerator {
    public static void main(String[] args) {
        String name = "Sehiy";
        String lastName = "Shyian";

        NameInfo nameInfo = new NameInfo(name, lastName);
        Gson gson = new Gson();
        String json = gson.toJson(nameInfo);

        System.out.println(json);
    }
}
