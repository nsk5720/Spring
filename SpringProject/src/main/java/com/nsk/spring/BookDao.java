package com.nsk.spring;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/*데이터베이스에 접근하는 클래스임을 명시*/
/*스프링이 데이터베이스를 관리하는 클래스라고 인지해서 자바 빈(java bean)으로 등록해서 관리 (*라이브러리임//클래스랑DB를 연동시켜주는?)*/
@Repository
public class BookDao {
	@Autowired	// sqlSessionTemplate 객체를 사용할 수 있게 만들어주는 어노테이션
	SqlSessionTemplate sqlSessionTemplate;
	/* 매퍼 XML(book_SQL.xml)을 실행시키기 위해서 SqlSessionTemplate 객체를 멤버 변수로 선언 */

	public int insert(Map<String, Object> map) {
		return this.sqlSessionTemplate.insert("book.insert", map);	
		//book.insert => book_SQL.xml에 있는 namespace="book" 밑에 있는 id=insert
	}
	
	public Map<String, Object> selectDetail(Map<String, Object> map) {
		return this.sqlSessionTemplate.selectOne("book.select_detail", map);
	}
	
    public int update(Map<String, Object> map) {
        return this.sqlSessionTemplate.update("book.update", map);
    }   

    
    public int delete(Map<String, Object> map) {
        return this.sqlSessionTemplate.delete("book.delete", map);
    }    
}
