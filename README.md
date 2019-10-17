﻿# BOS物流管理功能

### 开发环境： eclipse+maven+svn+powerdesigner

### 软件架构： mysql+struts2+spring+hibernate+easyui

### 运行过程： 本次项目由两部分组成，bos-web项目运行时调用了bos_crm的服务，它们是两个独立的web项目。其中bos_crm不是maven项目，依赖包点击[下载](https://pan.baidu.com/s/1vfG9hle59Es0Zb6lLlJHfQ)，放至WEB-INF/lib下。项目运行成功后，通过如localhost:8080/bos-web/login形式访问。

### 项目描述：本系统是基于B/S架构而设计开发的，是某物流公司的一个后台管理系统，属于物流公司整个ERP平台的一个组成部分。本系统是此物流公司的一个二期改造项目，原来此公司存在一个C/S架构的系统，后来业务不断扩大，所以公司决定进行改造。该系统主要有基础设置、取派、中转、路由、报表几大部分组成。

### 相关框架：
- apache POI：Apache POI是Apache基金会的开放源码函式库，POI提供API给					  Java程序对Microsoft Office格式档案读和写的功能。
- apache CXF：使得运行在不同机器上的不同应用无须借助附加的、专门的第三方软				  件或硬件， 就可相互交换数据或集成。
- apache shiro：完成对项目、认证、授权、会话管理、加密等功能。
- ehcache：ehcache是专门缓存插件，可以缓存Java对象，提高系统性能。
- Quartz：Quartz可以用来创建简单或为运行十个，百个，甚至是好几万个Jobs这样			  复杂的程序。Jobs可以做成标准的Java组件
- Highcharts：Highcharts能够很简单便捷的在web网站或是web应用程序添加有交互				 性的图表

### 系统主要包括以下模块：
- 基础设置：管理定区、分区、取派员以及收派标准等内容功能。
- 取派：管理记录各定区下的分区的取派员的取派任务。
- 中转：记录管理物品所经定区、分区以及取派员的详细信息。
- 路由：记录查询物品从寄货到收获间的详细路线。
- 报表：生动展示已分派任务定区的详细情况。
- 系统管理：管理用户以及分配各用户的权限



QQ群：807661097


