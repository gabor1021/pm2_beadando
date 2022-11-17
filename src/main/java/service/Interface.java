package service;

import pojo.Country;

import java.util.ArrayList;

public interface Interface {
    Country searchName(String name);

    ArrayList<String> XML();
}