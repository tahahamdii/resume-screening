package starter.pack.service;


public interface UserService {
    public String addUser(UserDTO userDTO);
    public UserDTO login(String email, String password);
}