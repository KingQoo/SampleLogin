package login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Customer;
import dao.CustomerDAO;
import tool.Action;

public class LoginAction extends Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		HttpSession session = request.getSession();
		System.out.println(session);
		System.out.println(session.getAttribute("customer"));


		String login = request.getParameter("login");
		String password = request.getParameter("password");

		CustomerDAO dao = new CustomerDAO();
		Customer customer = dao.search(login, password);

		Object sessions = session.getAttribute("customer");
		String message = null;
		String dest = null;

		//ユーザーが登録されている、かつログインしていない場合
		if(customer != null && sessions == null ) {
			session.setAttribute("customer", customer);
			 message = "ようこそ";
			dest = "login-out.jsp";
		}//ユーザーが登録されている、かつログインしている場合
		else if (customer != null && sessions != null ) {
			 message = "すでにログイン済みです。";
			dest = "login-in.jsp";
		}//ユーザーが登録されていない場合
		else {
			message = "ユーザーが登録されていません。";
			request.setAttribute("login", login);
			request.setAttribute("password", password);
			dest = "login-in.jsp";
		}

			request.setAttribute("message", message);
			return dest;
	}
}
