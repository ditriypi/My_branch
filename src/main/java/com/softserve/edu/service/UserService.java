package com.softserve.edu.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.softserve.edu.dao.FileTools;
import com.softserve.edu.dao.UserDao;
import com.softserve.edu.entity.User;

public class UserService {
    private final String CSV_SPLIT = ";";
    //
    private UserDao userDao;
    private FileTools fileTools;

    public UserService(String dbName, FileTools fileTools) {
        this.userDao = new UserDao(dbName);
        this.fileTools = fileTools;
        //this.fileTools = new FileTools(fileName);
    }

    public List<String> getNodes(String row) {
        List<String> nodes = new ArrayList<>();
        // Split row to List<String>;
        //
        // Code
        //
        return nodes;
    }

    public User createFromRow(String row) {
        User user = null;
        // Call getNodes(...) method; create User;
        //
        // Code
        //
        return user;
    }

    public List<User> readFromFile() {
        List<User> users = new ArrayList<>();
        // Call fileTools.readRows(); createFromRow(...) methods;
        //
        // Code
        //
        return users;
    }

    public int saveToDB(List<User> users) {
        int insertSize = 0;
        // Use userDao;
        //
        // Code
        //
        return insertSize;
    }

    public List<User> readAllFromDB() {
        List<User> users = null;
        // Use userDao;
        //
        // Code
        //
        return users;
    }

    public List<User> readDevelopersFromDB() {
        List<User> users = null;
        // Use userDao;
        //
        // Code
        //
        return users;
    }

    public int removeDuplicateFromDB() {
        int removeSize = 0;
        // Call readAllFromDB(); userDao
        // Code
        //
        return removeSize;
    }

    public List<User> sortByCompanyAndFirstName(List<User> users) {
        // Use Comparator
        // Code
        //
        return users;
    }
    
}
