## 新特性实践
项目是用来学习与实践新技术与特性使用。目前项目中使用的技术点：

- Kotlin
- Spring Boot
- Spring IO platform
- Spring Boot 通过属性自动配置Bean

## 特性说明：
1. Spring Boot 通过属性自动配置Bean
    > 通过注释```application.propertiese```中```app.sendMail.admin```属性，应用在```AppAutoConfigure```中会根据
    ```@ConditionalOnProperty("app.sendMail.admin")```条件，初始化事件监听器```SendMailEventLisenter```
2. Spring 事件特性
    >  **发送事件：** ```HelloController```中注入```applicationEventPublisher```，通过```publishEvent```方法发送事件。
    
    > **事件：** 事件```SendMailEvent```可以实现```ApplicationEvent```，也可以不实现
    
    > **接收事件：** 使用```SendMailEventLisenter```接收事件，在接收的方法上配置```@EventListener```。
    ```@EventListener```可以指定条件```@EventListener(condition = "#event.greeting == 'Hello'")```
    


