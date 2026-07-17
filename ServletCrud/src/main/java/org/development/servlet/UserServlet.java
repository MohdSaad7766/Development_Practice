package org.development.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.development.model.User;

import java.io.IOException;

@WebServlet("/user")
public class UserServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User(
                Integer.parseInt(req.getParameter("id")),
                req.getParameter("name"),
                req.getParameter("email"),
                req.getParameter("mobile")
        );

        System.out.println(user);
        resp.getWriter().write("""
                {
                    "message":"User Created"
                }
                """);
    }

    @Override
    public void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    @Override
    public void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }

    @Override
    protected void doPatch(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPatch(req, resp);
    }
}
