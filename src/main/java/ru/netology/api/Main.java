package ru.netology.api;

import ru.netology.api.Post;
import ru.netology.api.FormDate;
import ru.netology.api.Main;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 3;
        post.birthday.year = 2020;
    }
}
