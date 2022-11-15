package com.nsk.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*������̼��� �ִ� Ŭ������ �������� �������� ��û(request)�� �޾Ƶ��̴� ��Ʈ�ѷ���� �����ؼ�
/*  �ڹ� ��(java bean)���� ����ؼ� ����*/
@Controller
public class BookController {
	/* @RequestMapping ������̼��� �������� ��û�� ����Ǵ� �ڹ� �޼ҵ带 ���� */
	/* value �Ӽ��� �������� �ּ�(URI)�� ���� */
	/* method �Ӽ��� http ��û �޼ҵ带 �ǹ� (GET������� ó��) */
	/* �Ϲ����� �� ������ ���߿��� GET �޼ҵ�� �����͸� �������� ���� ��쿡, POST �޼ҵ�� �����Ͱ� ����� ��� ��� */
	/* 1. get: 255����/�ð��� ���� (����� �Ҿ���)
	 * 2. POST: �ð�������X/������ (��ü�� ����)*/
	/* å ���� ȭ���� �� �������� ȭ���� ������ �� �������� ������ �Ͼ�� �����Ƿ� GET �޼ҵ带 ��� */
	/* ModelAndView�� ��Ʈ�ѷ��� ��ȯ�� �����͸� ����ϴ� ��(Model)�� (And) ȭ���� ����ϴ� ��(View)�� ��θ� ���ĳ��� ��ü */
	
	@RequestMapping(value="/create", method = RequestMethod.GET)
	public ModelAndView create() {	// create() �� �޼ҵ�
		/* ModelAndView�� �����ڿ� ���ڿ�(String type) �Ķ���Ͱ� �ԷµǸ� ���� ��ζ�� ���� */
		return new ModelAndView("book/create");	// book/create => view�� ���
		/* create �޼ҵ�� ���������� /create �ּҰ� GET������� �ԷµǾ��� �� book/create����� �並 �����ش� */
		// create�� type=json Ȥ�� type=xmló�� '���ɾ�' �� ��ü
	}
}