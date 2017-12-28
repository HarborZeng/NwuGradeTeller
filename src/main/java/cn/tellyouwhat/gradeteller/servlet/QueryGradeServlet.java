package cn.tellyouwhat.gradeteller.servlet;

import cn.tellyouwhat.gradeteller.murpnewsservice.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "QueryGradeServlet", urlPatterns = "/queryAllGrade")
public class QueryGradeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String studentNumber = request.getParameter("stu-num");

        MURPNewsService service = new MURPNewsService();
        MURPNewsServiceSoap serviceSoap = service.getMURPNewsServiceSoap();
        ArrayOfMurpcustomi userinfo = serviceSoap.searchUser(
                studentNumber, null, null)
                .getUserinfo();
        if (userinfo == null) {
            return;
        }
        Murpcustomi user = userinfo.getMurpcustomi().get(0);
        if (user == null) {
            return;
        }

        PrintWriter writer = response.getWriter();

        List<PublicStruct> grades = serviceSoap.mark(
                Integer.parseInt(user.getMcid())).getPublicStruct();
        for (PublicStruct grade : grades) {
            String name = grade.getExtend1();
            String score = grade.getExtend2();
            writer.println(name + ": " + score + "\n");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);

    }
}
