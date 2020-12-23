# news-manager

English:
As the name suggests, this is a news management system with three login modes: tourist mode, login mode and administrator mode.
Under the tourist mode: the functions of adding, modifying and deleting news are illegal.
In login mode: modifying and deleting functions are illegal.
Administrator mode can unlock all functions.
The idea is very simple.I'll give you the tables created by the database.
The quanxian field in the Mima database is used to mark whether it is an administrator or not.
When logging in, Axios requests data, and then uses localstorage for persistent storage.


This is a front-end and back-end separation project based on Vue + element UI + springboot + JPA framework.
It uses Axios to call interface and transfer values.
nodejs and vue should be installed.
Plugins to be installed in Vue: Axios, element UI.
This project uses vue3. After installation, you can input Vue ui in CMD to create the project directly. There are guides on Baidu.

If you have any problem,you can contact me: QQ 1097180981
Reference items: https://b23.tv/qs3kwE I learned from this project

Still need to improve:
1. The riqi field of adding news and saving news should be date
2. Use vuex along component to store the value persistently

汉语：
顾名思义，这是一个新闻管理系统,拥有游客模式、登录模式、管理员模式三个模式登录
游客模式下：新闻增添、修改、删除功能是非法的
登录模式下：修改、删除功能是非法的
管理员模式可解锁全部功能
其思想很简单，数据库表我也会以代码的方式给出，mima数据库中的quanxian字段用于标记是否为管理员
登录时axios请求数据过来后利用localstorage进行持久化存储


这是一个基于 vue+element ui+springboot+jpa框架的前后端分离项目，利用axios进行接口调用与传值
需安装：nodejs,vue
vue中要安装的插件：axios、element ui 

这个项目用的是vue3 安装好了后可以在cmd中输入vue ui直接创建项目，具体教程自己百度即可
如果遇到了问题可以私：QQ 1097180981
可以参考的项目：https://b23.tv/qs3kwE 我跟着这个项目学习的

仍需改进：
1.增添新闻以及保存新闻的数据库riqi字段应该是Date
2.利用vuex-along组件进行数值的持久化存储

