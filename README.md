# spring-task
	介绍spring3.0以后自主研发的定时任务工具spring-task

# 两种方式
1. 配置文件方式
- 实例如：job1(==com.vince.spring.task.service.TaskJob==)
- 配置如下
```
	<!-- 配置方式  -->
	<task:scheduled-tasks>
		<task:scheduled ref="taskJob" method="job1" cron="0 42 14 * * ?" />
	</task:scheduled-tasks>
```
2. 注解方式
- 实例如：job2(==com.vince.spring.task.service.TaskJob==)，为定时任务方法加==@Scheduled==注解
- 配置如下
```
	<!-- 注解方式  -->
	<task:annotation-driven/>
```

# 公共配置
1. 扫描注解，依赖注入

```
	<!-- 扫描注解  -->
	<context:component-scan base-package="com.vince.spring.task" />
```
	
