package com.revature.dao;

import java.util.ArrayList;
//import java.util.List;
import java.util.List;

import com.revature.model.User;

//import com.revature.model.User;

public abstract class UserDao {
   static List<User>UserInfo= new ArrayList<>();
  // public User getUserInput();
  abstract void getUser(String username , String password);
}
