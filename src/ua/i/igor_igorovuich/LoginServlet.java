package ua.i.igor_igorovuich;

import java.io.IOException;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends javax.servlet.http.HttpServlet {

    private static List<User> users = RegistrationServlet.users;

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        for (User user:users
             ){
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                HttpSession session = req.getSession(true);
                session.setAttribute("user_login", login);
                String ageToString = "" + user.getAge();
                session.setAttribute("user_age", ageToString);
                session.setAttribute("user_answerOne", user.getAnswer1());
                session.setAttribute("user_answerTwo", user.getAnswer2());
                String countToString = "" + RegistrationServlet.count;
                session.setAttribute("users_count", countToString);
                resp.sendRedirect("login.jsp");
            }
        }
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String a = req.getParameter("a");
        HttpSession session = req.getSession(false);

        if ("exit".equals(a) && (session != null))
            session.removeAttribute("user_login");

        resp.sendRedirect("login.jsp");
    }
}