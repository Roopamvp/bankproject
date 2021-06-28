package com.bankapp.java;

import java.util.Map;

public interface DBAccess {
	public boolean insertUser(User user);

	public User getUser(String name);

	public boolean updateUser(User user);

	public boolean deleteUser(User user);

	 public abstract Map<String, User> getAllUsers();
}
