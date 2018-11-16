package com.example.userbase;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    private List<User> users = new ArrayList<>();

    public UserRepository() {
        users.add(new User("Jan", "Kowalski"));
        users.add(new User("Ola", "Skalska"));
    }

    public List<User> getUsers() {
        return users;
    }

    public void add(User user) {
        users.add(user);
    }

    public User findByLastName(String lastName) {
        for (User user : users) {
            if (user.getLastName().equalsIgnoreCase(lastName))
                return user;
        } return null;
    }
}
