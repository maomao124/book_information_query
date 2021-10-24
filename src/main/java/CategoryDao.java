
import java.text.DecimalFormat;
import java.util.*;

/**
 * Project name(项目名称)：图书信息查询
 * Package(包名): PACKAGE_NAME
 * Class(类名): CategoryDao
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/23
 * Time(创建时间)： 23:01
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class CategoryDao
{
    public static Map<Category, List<BookInfo>> categoryMap = new HashMap<Category, List<BookInfo>>();

    public static void printAllInfo()
    {
        DecimalFormat decimalFormat = new DecimalFormat("00000");
        for (Category category : categoryMap.keySet())
        {
            System.out.println("所属类别：" + category.getName());
            List<BookInfo> books = categoryMap.get(category);

            System.out.println("图书编号\t" + "图书名称\t" + "图书价格\t" + "图书作者\t" + "出版时间");
            // 获取图书
            /*
            for (int i = 0; i < books.size(); i++)
            {
                BookInfo bookInfo = books.get(i);
                System.out.println(decimalFormat.format(bookInfo.getId()) + "\t\t" + String.format("%-15s", bookInfo.getName())
                        + String.format("%-10d", bookInfo.getPrice()) + String.format("%-12s", bookInfo.getAuthor())
                        + bookInfo.getStartTime());
            }
            for (int i = 0; i < books.size(); i++)
            {
                BookInfo bookInfo = books.get(i);
                System.out.printf("%-10s%-18s%-10d%-10s%-10s\n", decimalFormat.format(bookInfo.getId()), bookInfo.getName(),
                        bookInfo.getPrice(), bookInfo.getAuthor(), bookInfo.getStartTime());
            }

            for (int i = 0; i < books.size(); i++)
            {
                BookInfo bookInfo = books.get(i); // 获取图书
                System.out.println(decimalFormat.format(bookInfo.getId()) + "\t\t" + bookInfo.getName()
                        + "\t\t" + bookInfo.getPrice() + "\t\t" + bookInfo.getAuthor() + "\t\t" + bookInfo.getStartTime());
            }

             */
            for (int i = 0; i < books.size(); i++)
            {
                BookInfo bookInfo = books.get(i);
                System.out.printf("%s\t\t%s\t\t%d\t\t%s\t\t%s\n", decimalFormat.format(bookInfo.getId()), bookInfo.getName(),
                        bookInfo.getPrice(), bookInfo.getAuthor(), bookInfo.getStartTime());
            }
            System.out.println();
        }
    }

    public static void search_category()
    {
        boolean isTure = false;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入类别名称：");
        String s = input.nextLine();
        DecimalFormat decimalFormat = new DecimalFormat("00000");
        for (Category category : categoryMap.keySet())
        {
            if (s.equals(category.getName()))
            {
                isTure = true;
                List<BookInfo> books = categoryMap.get(category);
                System.out.println("图书编号\t" + "图书名称\t" + "图书价格\t" + "图书作者\t" + "出版时间");
                for (int i = 0; i < books.size(); i++)
                {
                    BookInfo bookInfo = books.get(i);
                    System.out.printf("%s\t\t%s\t\t%d\t\t%s\t\t%s\n", decimalFormat.format(bookInfo.getId()), bookInfo.getName(),
                            bookInfo.getPrice(), bookInfo.getAuthor(), bookInfo.getStartTime());
                }
                System.out.println();
            }
        }
        if (!isTure)
        {
            System.out.println("未找到名称为" + s + "的类别！");
        }
    }

    public static void search_book()
    {
        int num = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入图书的名称：");
        String s = input.nextLine();
        DecimalFormat decimalFormat = new DecimalFormat("00000");
        System.out.println("图书编号\t" + "图书名称\t" + "图书价格\t" + "图书作者\t" + "出版时间\t\t所属类别");
        for (Category category : categoryMap.keySet())
        {
            List<BookInfo> books = categoryMap.get(category);

            for (BookInfo bookInfo : books)
            {
                if (s.equals(bookInfo.getName()))
                {
                    num++;
                    System.out.printf("%s\t\t%s\t\t%d\t\t%s\t\t%s\t\t%s\n", decimalFormat.format(bookInfo.getId()), bookInfo.getName(),
                            bookInfo.getPrice(), bookInfo.getAuthor(), bookInfo.getStartTime(), category.getName());
                }
            }
        }
        System.out.println(num + "项符合要求");
    }

    //搜索符合价格区间内的图书
    public static void search_price()
    {
        int num = 0;
        Scanner input = new Scanner(System.in);
        int max;
        int min;
        System.out.print("请输入最高价格：");
        max = input.nextInt();
        System.out.print("请输入最低价格：");
        min = input.nextInt();
        if (max < min)
        {
            System.out.println("输入错误！最大值小于最小值！！！");
        }
        else
        {
            DecimalFormat decimalFormat = new DecimalFormat("00000");
            System.out.println("图书编号\t" + "图书名称\t" + "图书价格\t" + "图书作者\t" + "出版时间\t\t所属类别");
            for (Category category : categoryMap.keySet())
            {
                List<BookInfo> books = categoryMap.get(category);

                for (int i = 0; i < books.size(); i++)
                {
                    BookInfo bookInfo = books.get(i);
                    if (max >= bookInfo.getPrice() && min <= bookInfo.getPrice())
                    {
                        num++;
                        System.out.printf("%s\t\t%s\t\t%d\t\t%s\t\t%s\t\t%s\n", decimalFormat.format(bookInfo.getId()), bookInfo.getName(),
                                bookInfo.getPrice(), bookInfo.getAuthor(), bookInfo.getStartTime(), category.getName());
                    }
                }
            }
            System.out.println(num + "项符合要求");
        }
    }

    public static void addBook()
    {
        boolean isTure = false;
        System.out.println("请输入类别：");
        Scanner input = new Scanner(System.in);
        String s;
        s = input.nextLine();
        DecimalFormat decimalFormat = new DecimalFormat("00000");
        for (Category category : categoryMap.keySet())
        {
            if (s.equals(category.getName()))
            {
                isTure = true;
                List<BookInfo> books = categoryMap.get(category);
                BookInfo bookInfo = new BookInfo();
                System.out.print("id：");
                bookInfo.setId(input.nextInt());
                System.out.print("名字：");
                bookInfo.setName(input.next());
                System.out.print("价格：");
                bookInfo.setPrice(input.nextInt());
                System.out.print("作者：");
                bookInfo.setAuthor(input.next());
                System.out.print("出版时间：");
                bookInfo.setStartTime(input.next());
                books.add(bookInfo);
                System.out.println("添加成功");
            }
        }
        if (!isTure)
        {
            System.out.println("未找到名称为" + s + "的类别！");
        }
    }

    public static void addCategory()
    {
        System.out.print("请输入要添加的类别的名称：");
        String s;
        Scanner input = new Scanner(System.in);
        s = input.next();
        int id;
        System.out.print("请输入类别的id：");
        id = input.nextInt();
        Category category = new Category(id, s);
        List<BookInfo> list = new ArrayList<>();
        CategoryDao.categoryMap.put(category, list);
        System.out.println("添加完成");
    }

    public static void deleteBook()
    {
        boolean isTure = false;
        System.out.println("删除图书！！！");
        System.out.println("请输入要删除的图书名字：");
        String s;
        Scanner input = new Scanner(System.in);
        s = input.next();
        for (Category category : categoryMap.keySet())
        {
            List<BookInfo> books = categoryMap.get(category);

            for (int i = 0; i < books.size(); i++)
            {
                BookInfo bookInfo = books.get(i);
                if (s.equals(bookInfo.getName()))
                {
                    System.out.println("id=" + bookInfo.getId() + " , " + "名称=" + bookInfo.getName() + " 的图书已删除");
                    books.remove(bookInfo);
                    isTure = true;
                }
            }
        }
        if (!isTure)
        {
            System.out.println("未找到！");
        }
    }

    public static void deleteCategory()
    {
        //V remove(Object key)	从 Map 集合中删除 key 对应的键-值对，返回 key 对应的 value，如果该 key 不存在，则返回 null
        System.out.println("删除类别！！！");
        boolean isTure = false;
        int id;
        String name;
        Scanner input = new Scanner(System.in);
        System.out.print("请输入类别名称：");
        name = input.next();
        /*
        System.out.print("请输入类别id：");
        id = input.nextInt();
        Category category = new Category(id, name);
        if (categoryMap.remove(category) == null)
        {
            System.out.println("改类别不存在！！！");
        }
        else
        {
            System.out.println("删除成功");
        }
         */
        Category c = null;
        for (Category category : categoryMap.keySet())
        {
            if (name.equals(category.getName()))
            {
                c = category;
                isTure = true;
            }
        }

        if (!isTure)
        {
            System.out.println("删除失败！");
        }
        else
        {
            categoryMap.remove(c);
            System.out.println("删除成功！");
        }
    }
}
