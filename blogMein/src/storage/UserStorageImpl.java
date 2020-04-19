package storage;

import model.User;

public class UserStorageImpl implements UserStorage {
    private User[] users = new User[17];
    private int size = 0;

    @Override
    public void add(User user) {
        if (size == users.length) {
            extend();
        }
        users[size++] = user;
    }

    private void extend() {
        User[] temp = new User[users.length + 10];
        System.arraycopy(users, 0, temp, 0, users.length);
        users = temp;
    }


    public User login(String email, String passwords) {
        for (int i = 0; i < size; i++) {
            if (users[i].getEmail().equals(email) && users[i].getPassword().equals(passwords)) {
                return users[i];
            }
        }
        return null;
    }

    public boolean isEmpty() {
        return size == 0;
    }


}
