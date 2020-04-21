# Spring 中 Bean 的作用域
Spring定义了多种作用域，可以基于这些作用域创建bean：

1. 单例(Singleton)：在整个应用中，只创建bean的一个实例。
2. 原型(Prototype)：每次注入或者通过Spring应用上下文获取的时候，都会创建一个新的bean实例。
3. 会话(Session)：在Web应用中，为每个会话创建一个bean实例。
4. 请求(Request)：在Web应用中，为每个请求创建一个bean实例。

单例是默认的作用域，如果要使用其它的作用域创建bean，需要使用@Scope注解，该注解可以和@Component，@Service，@Bean等注解一起使用。