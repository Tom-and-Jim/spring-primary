# 组件扫描与自动装配

# 涉及的类

   1. Component: 要被扫描的组件，可以设置 bean id, 默认为类名小写
   2. ComponentScan: 指定扫描的包。默认为所在的包，也可以设置一个或者多个包名、类名
   3. AutoWeird: 自动装配。自动生成方法参数所需的类，可以设置 require=false,不安全，不建议使用

# 测试
    junit
