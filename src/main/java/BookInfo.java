/**
 * Project name(项目名称)：图书信息查询
 * Package(包名): PACKAGE_NAME
 * Class(类名): BookInfo
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/23
 * Time(创建时间)： 22:54
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class BookInfo
{
    private int id;
    private String name;
    private int price;            //价格
    private String author;
    private String startTime;   //出版时间

    public BookInfo(int id, String name, int price, String author, String startTime)
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.author = author;
        this.startTime = startTime;
    }


    public String toString()
    {
        return "名字：" + this.name + "\tid:" + this.id + "\t价格："
                + this.price + "\t作者：" + this.author + "\t出版时间：" + this.startTime;
    }

    public int getId()
    {
        return this.id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public BookInfo()
    {
    }

    public String getStartTime()
    {
        return startTime;
    }

    public void setStartTime(String startTime)
    {
        this.startTime = startTime;
    }

}
