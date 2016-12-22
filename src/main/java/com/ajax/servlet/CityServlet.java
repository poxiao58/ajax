package com.ajax.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ���ж��������˵� servlet��
 */
public class CityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * get��������
	 * �������û���get���������ʱ��ֱ����������doPost()����
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * post����
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");//�����������Ϊ"UTF-8"
		String province=request.getParameter("province");
		response.setCharacterEncoding("UTF-8");//������Ӧ����ΪUTF-8 ע������������writeǰ�����Ч!!
		PrintWriter write=response.getWriter();
		if("����ʡ".equals(province)){
			write.println("<option>֣����</option>");
			write.println("<option>������</option>");
			write.println("<option>������</option>");
			write.println("<option>������</option>");
			write.println("<option>������</option>");
			write.println("<option>������</option>");
			write.println("<option>ƽ��ɽ</option>");
			write.println("<option>������</option>");
			write.println("<option>������</option>");
			write.println("<option>�ױ���</option>");
			write.println("<option>�����</option>");
			write.println("<option>�����</option>");
			write.println("<option>����Ͽ</option>");
			write.println("<option>������</option>");
			write.println("<option>�ܿ���</option>");
			write.println("<option>פ���</option>");
			write.println("<option>��Դ��</option>");
		}
	}

}
