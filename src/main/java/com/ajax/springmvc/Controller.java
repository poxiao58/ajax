package com.ajax.springmvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * springmvc��Ϊajax��̨����
 * @author lijun
 *
 */
@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping("/springmvcajax")
	@ResponseBody
	public List<String> post(String province){
		List<String> list=new ArrayList<>();
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
		}
		return list;
	}
}
