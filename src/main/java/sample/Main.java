package sample;

import java.util.List;

import mybatis.map.BookInfoMapper;
import mybatis.map.entity.BookInfo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/spring/conf/applicationContext.xml");
        BookInfoMapper mapper = applicationContext.getBean(BookInfoMapper.class);

        List<BookInfo> bookInfoList = mapper.selectAll();

        for( BookInfo targetBook : bookInfoList ) {
            System.out.println(targetBook);
        }

    }

}
