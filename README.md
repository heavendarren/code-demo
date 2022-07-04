一个用于代码规范的demo
===============



## 分包结构
- base  公共父类
- business  业务处理层
- common  公共代码
- config  配置
- controller 控制器
- converter 转换器
- dao  持久层
- domain 对象
- enums 枚举
- event 事件
- service 服务层
- util 工具包

## 数据流转

- 前端-controller使用vo
- business-service 使用po
- business 接受vo输出vo

##测试
测试使用内置的h2数据库
##
开发环境使用mysql

## 启动与部署
- 执行docker-compose 文件的mysql服务
- 执行test-resources 下的schema.sql
- 执行docker-compose 文件的web服务