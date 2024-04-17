package fr.unvitours.polytech.examjee.dao;

public interface UserDao {
    public boolean verifyPassword (String login, String password);

    public void addUsers();
}
