package com.jennifer.datamodel.practice.datatransient;

/**
 * Created by jennifer.huang on 12/3/18.
 */

//http://www.cnblogs.com/lanxuezaipiao/p/3369962.html


/**
 * 总之，java 的transient关键字为我们提供了便利，你只需要实现Serilizable接口，将不需要序列化的属性前添加关键字transient，序列化对象的时候，这个属性就不会序列化到指定的目的地中。
 */
public class ItemTransient {
    public int id;
    public String itemName;
    public transient UserTransient owner;


    public ItemTransient(int id, String itemName, UserTransient owner) {
        this.id = id;
        this.itemName = itemName;
        this.owner = owner;
    }
}
