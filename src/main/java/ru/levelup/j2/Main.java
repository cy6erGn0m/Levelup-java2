package ru.levelup.j2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    private static Gson gson = new GsonBuilder().create();

    public static int sum(int a, int b) {
        return a + b;
    }

    public static String userToJson(User user) {
        return gson.toJson(user);
    }

    public static User jsonToUser(String message) {
        return gson.fromJson(message, User.class);
    }
}
