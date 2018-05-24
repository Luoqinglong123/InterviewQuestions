package com.lql.排序.Comparable;

public class User  implements Comparable<User>{
    private String name;
    private String password;
    @Override
    public int compareTo(User o) {
        return password.compareTo(o.password);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
