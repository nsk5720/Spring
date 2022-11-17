package com.nsk.spring;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/* �������� ���� Ŭ�������� �˷��ش� */
@Service
public class BookServiceImpl implements BookService{	//BookService�� �������̽� (�޼ҵ常 ������ �ִ�)
	@Autowired
	BookDao bookdao;
	/* �����ͺ��̽� ������ ���� BookDao �ν��Ͻ��� ���� */
	
	@Override
	public String create(Map<String, Object>map) {
		// BookDao.Insert �޼��� ���� // map�� �츮�� ���� �����͸� BookDao.Insert �޼��忡 ����
		// affectRowCount �������� ������� �� ���� ����. ������ 1�̸� �Է����� ���� ���(�峭ġ�°��)���� 0��
		int affectRowCount = this.bookdao.insert(map);	// affectRowCount = ���̺귯�� = ������ ���� ���
		if(affectRowCount == 1) {
			// map �ν��Ͻ��� book ���̺��� PK�� book_id�� ������� ���̴�. book_id ���� ����(book_SQL.xml�� ��ġ�鼭 book_id �ʵ尡 �� ���� ���� ������)
			return map.get("book_id").toString();
		}
		return null;
	}
}