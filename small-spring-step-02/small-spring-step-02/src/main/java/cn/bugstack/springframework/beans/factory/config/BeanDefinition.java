package cn.bugstack.springframework.beans.factory.config;

// 告诉编译器忽略指定的警告，不用在编译完成后出现警告信息。
@SuppressWarnings({"rawtypes"}) //rawtypes是说传参时也要传递带泛型的参数
public class BeanDefinition {
    // 在bean定义类中已经把上一章节中的Object bean替换为Class,
    // 这样就可以把bean的实例化操作放到容器中处理了
    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {

        return beanClass;

    }

    public void setBeanClass(Class beanClass) {

        this.beanClass = beanClass;
    }
}
