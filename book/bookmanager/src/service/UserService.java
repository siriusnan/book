package service;

import vo.User;

public interface UserService {
    boolean login(User user);
    boolean register(User user);

}
