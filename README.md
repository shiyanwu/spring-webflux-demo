# spring-webflux-demo
spring webflux

1.安装 mongodb
    brew install mongodb
    
2.启动
    brew services start mongodb
    
3.连接 
    mongo
    
4.创建admin用户
    db.createUser({ user: 'admin', pwd: 'admin', roles: [ { role: "root", db: "admin" } ] });

