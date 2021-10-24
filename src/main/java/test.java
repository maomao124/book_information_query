import java.util.ArrayList;
import java.util.List;

/**
 * Project name(项目名称)：图书信息查询
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/23
 * Time(创建时间)： 23:18
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String[] args)
    {
        Category category1 = new Category(1, "小说类"); // 创建类别信息
        Category category2 = new Category(2, "教材类"); // 创建类别信息
        Category category3 = new Category(3, "故事类"); // 创建类别信息
        BookInfo book1 = new BookInfo(1, "斗罗大陆", 35, "张三", "2019/05/08");
        BookInfo book2 = new BookInfo(2, "数据结构", 69, "李春葆", "2016/06/24");
        BookInfo book3 = new BookInfo(3, "c语言程序设计", 49, "谭浩强", "2009/11/21");
        BookInfo book4 = new BookInfo(4, "计算机操作系统", 89, "李四", "2020/01/03");
        BookInfo book5 = new BookInfo(5, "安徒生童话", 33, "王五", "1997/02/06");
        BookInfo book6 = new BookInfo(6, "格林童话", 46, "赵六", "2018/07/09");
        //类别1
        List<BookInfo> list1 = new ArrayList<>();
        list1.add(book1);
        //类别2;
        List<BookInfo> list2 = new ArrayList<>();
        list2.add(book2);
        list2.add(book3);
        list2.add(book4);
        //类别3;
        List<BookInfo> list3 = new ArrayList<>();
        list3.add(book5);
        list3.add(book6);
        CategoryDao.categoryMap.put(category1, list1);
        CategoryDao.categoryMap.put(category2, list2);
        CategoryDao.categoryMap.put(category3, list3);
        CategoryDao.printAllInfo();
        CategoryDao.search_category();
        CategoryDao.printAllInfo();
        CategoryDao.search_book();
        CategoryDao.printAllInfo();
        CategoryDao.search_price();
        CategoryDao.printAllInfo();
        CategoryDao.addCategory();
        CategoryDao.printAllInfo();
        CategoryDao.addBook();
        CategoryDao.printAllInfo();
        CategoryDao.deleteBook();
        CategoryDao.printAllInfo();
        CategoryDao.deleteCategory();
        CategoryDao.printAllInfo();
    }
}
