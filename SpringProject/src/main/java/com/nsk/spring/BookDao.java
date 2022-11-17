package com.nsk.spring;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/*�����ͺ��̽��� �����ϴ� Ŭ�������� ����*/
/*�������� �����ͺ��̽��� �����ϴ� Ŭ������� �����ؼ� �ڹ� ��(java bean)���� ����ؼ� ���� (*���̺귯����//Ŭ������DB�� ���������ִ�?)*/
@Repository
public class BookDao {
	@Autowired	// sqlSessionTemplate ��ü�� ����� �� �ְ� ������ִ� ������̼�
	SqlSessionTemplate sqlSessionTemplate;
	/* ���� XML(book_SQL.xml)�� �����Ű�� ���ؼ� SqlSessionTemplate ��ü�� ��� ������ ���� */

	public int insert(Map<String, Object> map) {
		return this.sqlSessionTemplate.insert("book.insert", map);
	}
}