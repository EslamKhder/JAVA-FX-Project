/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import model.User;

/**
 *
 * @author MBR
 */
public interface UserService {
    public int login(User use);
    public int signUp(User user);
    public int getUserByFirstDigts(User user);
    public int getUserByLastDigts(User user);
    public int editUserPassword(User user);
}
