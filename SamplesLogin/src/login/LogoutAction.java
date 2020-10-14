package login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tool.Action;

public class LogoutAction extends Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		HttpSession session = request.getSession();

		String message = null;

		if(session.getAttribute("customer") != null) {
			session.removeAttribute("customer");
			message = "ログアウトが完了しました。";
		}else {
			message = "すでにログアウトしています。";
		}

		request.setAttribute("message", message);
		return "logout-out.jsp";
	}

}
