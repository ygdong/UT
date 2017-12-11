package servlet;

import mockit.*;
import org.junit.Test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthenticationServletTest {
    @Tested
    AuthenticationServlet authenticationServlet;

    @Injectable
    AccountDao accountDao;


    @Test
    public void should_forward_to_home_if_login_valid(@Mocked final HttpServletRequest request, @Mocked final HttpServletResponse response) throws Exception {

        new Expectations() {{
            request.getParameter("name");
            result = "a";
            request.getParameter("password");
            result = "a";
            accountDao.isValid("a", "a");
            result = true;
        }};

        authenticationServlet.doGet(request, response);

        new Verifications() {{
            request.getRequestDispatcher("/home").forward(request, response);
        }};
    }
}