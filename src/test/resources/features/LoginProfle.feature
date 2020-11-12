# language: zh-CN
@LoginProfile
功能:Login Profile
  作为网站使用者，想要使用网站的功能首先要登录系统
  背景: 登录网站
    当我打开网站URL "http://gonghang.test.cdecube.com"
    那么进入登录页面
  @smoke
  场景: 登录
    当我输入用户名为"000008"
    并且输入密码为"11111111"
    那么我能看到URL变为"http://gonghang.test.cdecube.com/expiring/enterprise"
    并且可以看到"退出"按钮
  @sit
  场景大纲:输入错误的用户名密码登录失败
    当我输入用户名为"<username>"
    并且输入密码为"<password>"
    同时点击登录按钮
    那么我将看到验证失败的提示"<message>"
  @demo1
    例子:
      | username | password | message |
      | 000009   | 11111111 | "用户名或密码错误" |
      | 000008   | 111111111 | "用户名或密码错误" |
      |          | 11111111  | "请输入用户名" |
      | 000008   |           | "请输入密码"   |