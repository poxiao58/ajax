package com.ajax.angularjsCityServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;

/**
 * Servlet implementation class AngularjsCityServlet
 */
public class AngularjsCityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");//�����������Ϊ"UTF-8"
		String province=request.getParameter("province");
		response.setCharacterEncoding("UTF-8");//������Ӧ����ΪUTF-8 ע������������writeǰ�����Ч!!
		PrintWriter write=response.getWriter();
		request.setAttribute("data", "������");
		List<String> list=new ArrayList<>();
		JSONArray jsonArray = new JSONArray();  
		if("����ʡ".equals(province)){
			list.add("֣����");
			list.add("������");
			list.add("������");
			list.add("������");
			list.add("������");
			list.add("������");
			list.add("ƽ��ɽ");
			list.add("������");
			list.add("������");
			list.add("�ױ���");
			list.add("�����");
			list.add("�����");
			list.add("����Ͽ");
			list.add("������");
			list.add("�ܿ���");
			list.add("פ���");
			list.add("��Դ��");
			jsonArray.put(list);
			write.print(jsonArray);
		}
	}

}
