package Lesson_1.Homework;

public class User {
    private  String login;
    private  String password;
    private  Busket busket;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.busket = new Busket();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Busket getBusket() {
        return busket;
    }

    public void setBusket(Busket busket) {
        this.busket = busket;
    }
}