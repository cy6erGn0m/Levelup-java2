package ru.levelup.j2;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void sum1() {
        assertEquals(3, Main.sum(1, 2));
    }

    // tests for json
    @Test
    public void userToJson() {
        User user = new User(123, "user1", List.of("admin", "moderator"));
        String json = Main.userToJson(user);

        String expected = "{\"id\":123,\"login\":\"user1\",\"roles\":[\"admin\",\"moderator\"]}";
        assertEquals(expected, json);
    }

    @Test
    public void jsonToUser() {
        String json = "{\"id\":113,\"login\":\"user2\",\"roles\":[\"admin\",\"creator\"]}";
        User user = Main.jsonToUser(json);

        User expected = new User(113, "user2", List.of("admin", "creator"));
        assertEquals(expected, user);
    }
}
