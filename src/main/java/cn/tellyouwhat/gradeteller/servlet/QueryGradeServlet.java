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

        String checked = request.getParameter("agreement");
        if (checked == null) {
            addErrorMessage(request, response, "您必须要同意条款才能继续！");
            return;
        }

        if ("".equals(studentNumber) || studentNumber == null) {
            addErrorMessage(request, response, "请输入学号再试！");
            return;
        }else if(studentNumber.length() < 10) {
            addErrorMessage(request, response, "输入的学号长度不足");
            return;
        }

        MURPNewsService service = new MURPNewsService();
        MURPNewsServiceSoap serviceSoap = service.getMURPNewsServiceSoap();
        ArrayOfMurpcustomi userinfo = serviceSoap.searchUser(
                studentNumber, null, null)
                .getUserinfo();

        if (userinfo == null) {
            addErrorMessage(request, response, "输入的学号不正确！");
            return;
        }

        Murpcustomi user = userinfo.getMurpcustomi().get(0);
        if (user == null) {
            addErrorMessage(request, response, "输入的学号不正确！");
            return;
        }

        List<PublicStruct> grades = serviceSoap.mark(
                Integer.parseInt(user.getMcid())).getPublicStruct();
        request.setAttribute("grades", grades);
        request.getRequestDispatcher(request.getContextPath() + "/index.jsp")
                .forward(request, response);

    }

    private void addErrorMessage(HttpServletRequest request, HttpServletResponse response, String s) throws ServletException, IOException {
        request.setAttribute("errorMessage", s);
        request.getRequestDispatcher(request.getContextPath() + "/index.jsp")
                .forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);

    }
}
