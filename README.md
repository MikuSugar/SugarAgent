# SugarAgent

通过SSH 代理将本机指定端口的通信转发到远程端口。

## 缘起

ssh自带了端口代理转发功能，但不知道为啥在我的本本上长时间执行会出问题，所以用Java写了一个，暂时没有出现问题。

## 构建

```shell
mvn package assembly:single
```

## 执行

example:

```shell
java -jar /Users/mikusugar/soft/sugaragent.jar host=xxx  user=xxx pw=xx sshPort=22 localPort=8210 remotePort=8210
# 将本机8210端口转发到远程8210端口
```

