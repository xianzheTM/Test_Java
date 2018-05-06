/**
 * 定义双向链表的功能
 * @author YL
 */

public interface Mylist {
    /**
     * 得到数组长度
     * @return int
     */
    int getLength();

    /**
     * 在末尾添加内容
     * @param data Object
     */
    void add(Object data);

    /**
     * 按索引值插入，分为头，尾，中间三种
     * @param data Object型，为插入内容
     * @param index int型，为索引值
     */
    void add(Object data, int index);

    /**
     * 检索内容插入
     * @param data Object 插入内容
     * @param afterData Object 检索内容
     */
    void add(Object data, Object afterData);

    /**
     * 删除索引值处的内容
     * @param index int 索引值
     */
    void del(int index);//index=0,index=x,index=-1

    /**
     * 删除内容
     * @param data Object
     */
    void del(Object data);

    /**
     * 获取索引值
     * @param data Object
     * @return int
     */
    int getIndex(Object data);

    /**
     * 读取内容
     * @param index int 索引值
     * @return Object 内容
     */
    Object getData(int index);
}


