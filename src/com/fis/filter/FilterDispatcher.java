package com.fis.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class FilterDispatcher
 */
@WebFilter("*.action")
public class FilterDispatcher implements Filter {

    /**
     * Default constructor. 
     */
    public FilterDispatcher() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		HttpServletRequest hsr = (HttpServletRequest) request;
		String servletPath = hsr.getServletPath();
		String pagePath = "";
		String FOLDERPATH ="/WEB-INF/pages/";
		if(servletPath.equals("/goto-input.action")){
			pagePath = FOLDERPATH + "inputInfo.jsp";
		}
		
		if(servletPath.equals("/goto-show.action")){
			pagePath = FOLDERPATH + "showInfo.jsp";
			
			String userName = request.getParameter("userName");
			String userAccount = request.getParameter("userAccount");
			String userPwd = request.getParameter("userPwd");
			User user = new User(userName,userAccount,userPwd);
			request.setAttribute("user", user);
		}
		
		if(null!= servletPath){
			request.getRequestDispatcher(pagePath).forward(request, response);
			return;
		}
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
