package cn.tellyouwhat.gradeteller.servlet;

import cn.tellyouwhat.gradeteller.murpnewsservice.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "QueryGradeServlet", urlPatterns = "/queryAllGrade")
public class QueryGradeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String studentNumber = request.getParameter("stu-num");

        if ("".equals(studentNumber) || studentNumber == null) {
            request.setAttribute("errorMessage", "请输入学号再试！");
            request.getRequestDispatcher(request.getContextPath() + "/index.jsp")
                    .forward(request, response);
            return;
        }else if(studentNumber.length() < 10) {
            request.setAttribute("errorMessage", "输入的学号长度不足");
            request.getRequestDispatcher(request.getContextPath() + "/index.jsp")
                    .forward(request, response);
            return;
        }

        MURPNewsService service = new MURPNewsService();
        MURPNewsServiceSoap serviceSoap = service.getMURPNewsServiceSoap();
        ArrayOfMurpcustomi userinfo = serviceSoap.searchUser(
                studentNumber, null, null)
                .getUserinfo();

        if (userinfo == null) {
            request.setAttribute("errorMessage", "输入的学号不正确！");
            request.getRequestDispatcher(request.getContextPath() + "/index.jsp")
                    .forward(request, response);
            return;
        }

        Murpcustomi user = userinfo.getMurpcustomi().get(0);
        if (user == null) {
            request.setAttribute("errorMessage", "输入的学号不正确！");
            request.getRequestDispatcher(request.getContextPath() + "/index.jsp")
                    .forward(request, response);
            return;
        }

        List<PublicStruct> grades = serviceSoap.mark(
                Integer.parseInt(user.getMcid())).getPublicStruct();
        request.setAttribute("grades", grades);
        request.getRequestDispatcher(request.getContextPath() + "/index.jsp")
                .forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);

    }
}
