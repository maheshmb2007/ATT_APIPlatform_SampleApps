package com.att.api.aab.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.att.api.controller.APIController;

public class AABController extends APIController {
    private static final long serialVersionUID = 1L;

    public void doPost(HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        final String forward = "WEB-INF/aab.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(forward);
        dispatcher.forward(request, response);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
