package ua.i.igor_igorovuich;

public class User {

    private String login;
    private String password;
    private int age;
    private String answer1;
    private String answer2;

    public User(String login, String password, int age, String answer1, String answer2) {
        this.login = login;
        this.password = password;
        this.age = age;
        this.answer1 = answer1;
        this.answer2 = answer2;
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String name) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }
}
