# SSHFrame
准备给自己使用的一个SSH框架
---
- 整合了spring,hibernate,struts2.
- 去除了hibernate的相关hbm.xml改为spring对bean包的扫描，由实体类驱动数据库表的建立
- 一个简单的人员的增删改查

---
- 用struts2注解来实现Action配置。
- 修改了hibernate的命名策略，改为自己的命名策略，否则由实体类生成表时会出错

---
- 添加利用velocity生成action、service、seviceImpl等类的代码
- 写了个简单通用的manager类（后期需要扩展，封装数据库的操作）
- 添加几个简单的action、service、seviceImpl方法增删改查的模板，生成的代码会在generate目录下

---
- 添加日志组件log4j

---
- 对数据库操作进行一定封装，暂时没有对分页做封装。
- 利用AOP对数据库操作进行审计，得到审计日志，对某个实体类实现审计功能需要做两件事--实现AuditLogable接口，重写toString()方法
- 目前还有些模板代码待修改（打算放到最后了，代码没定型，写模板代码也没什么用）
