package kr.or.connect;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.or.connect.domain.Book;
import kr.or.connect.persistence.BookDao;

public class BookLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		BookDao dao = context.getBean(BookDao.class);
		Book book = new Book("네이버 Java", "김강산", 512);
		int count = dao.countBooks();
		System.out.println(count);
		System.out.println(dao.selectById(dao.insert(book)));
		context.close();
	}

}
