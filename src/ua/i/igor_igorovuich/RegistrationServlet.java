package ua.i.igor_igorovuich;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@WebServlet(name = "RegistrationServlet", urlPatterns = "/reg")
public class RegistrationServlet extends HttpServlet {

    protected static final List<User> users = new ArrayList<>();
    protected static int count;

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String ageStr = req.getParameter("age");
        String answer1 = req.getParameter("quest1");
        String answer2 = req.getParameter("quest2");
        int age = Integer.parseInt(ageStr);

        User user = new User(login, password, age, answer1, answer2);
        try {
            users.add(user);
            resp.sendRedirect("login.jsp");
            count++;
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

    }
}

