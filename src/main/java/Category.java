/**
 * Project name(项目名称)：图书信息查询
 * Package(包名): PACKAGE_NAME
 * Class(类名): Category
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/23
 * Time(创建时间)： 22:49
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Category
{
    public Category(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    private int id;
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Category()
    {

    }


    public String toString()
    {
        return "所属分类：" + this.name;
    }


    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }
}
