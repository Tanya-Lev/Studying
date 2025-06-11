package org.example.registrationLogin.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.example.registrationLogin.entity.User;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Utils {

    static public void jsonSerialization(User user) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        List<User> users = jsonDeserialization();
        if (users == null) users = new ArrayList<>();
        users.add(user);
        try (FileWriter writer = new FileWriter("user.json")) {
            gson.toJson(users, writer);
            System.out.println("JSON write in file person.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static public List<User> jsonDeserialization() {
        Gson gson = new GsonBuilder().create();
        Type listType = new TypeToken<List<User>>() {}.getType(); // Объявляем корректный тип

        try (FileReader reader = new FileReader("user.json")) {
            return gson.fromJson(reader, listType); // Используем `listType`
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

}
