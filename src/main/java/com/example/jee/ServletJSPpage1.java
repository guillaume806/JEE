package com.example.demo_jee_01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "monServletAvecJSP", value = "/monservlet-jsp")

public class MonServletAvecJSP extends HttpServlet {

    private String title;

    private List<String> titles;

    @Override
    public void init() throws ServletException {
        title = "page1";
        titles = new ArrayList<>();
        titles.add("page2");
        titles.add("page3");
        titles.add("page4");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("titre", title);
        req.setAttribute("titres", titles);


        getServletContext().getRequestDispatcher("/page1.jsp").forward(req, resp);
        getServletContext().getRequestDispatcher("/page2.jsp").forward(req, resp);
        getServletContext().getRequestDispatcher("/page3.jsp").forward(req, resp);
        getServletContext().getRequestDispatcher("/page4.jsp").forward(req, resp);
    }
}

