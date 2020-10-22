## 区别
* @Component主要是采用类扫描的方式通过配置@CopmponetScan这个注解的方式进行自动的配置和注入到spring的容器中，但是在使用@Bean这个注解的时候是声明一个单独的bean的，就是你想让哪个对象注入Ioc的容器中，可以指定。
* @Component是用于在类上进行注解的，@Bean是用于在方法上面的
* @Component一般不会和@Configuration一起使用的，但是@Bean是必须和@Configuration一起使用的。

