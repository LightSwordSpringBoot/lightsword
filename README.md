# 《Spring Boot开发：从0到1》 工程实例： LightSword 

使用SpringBoot,Scala開發的自動化測試平台

## 书籍参考

《Spring Boot开发：从0到1》
====
 
第一部分Spring Boot基础
 
[第1章 Spring Boot史前简述](http://www.jianshu.com/p/53134362089a)
===
1.1 J2EE（Java 2 Platform Enterprise Edition）简介

1.2 Java企业级开发框架概述

1.3 Spring生态系统

1.4 Spring JavaConfig
 
[第2章 Spring Boot简介](http://www.jianshu.com/p/53628ac5c85d)
===

2.1 用Spring Boot创造一切

2.2 Spring Boot起源

2.3 Spring Boot在Spring生态中的构成

   2.3.1 Spring生态顶级项目

   2.3.2 Spring cloud子项目

2.4 Spring Boot核心组件

2.5 Spring Boot版本历史

2.6 Spring Boot学习成本
 
[第3章 Spring Boot快速开始Hello World](http://www.jianshu.com/p/36529384b8c6)
===

3.1 Spring Boot CLI groovy版Hello World

3.2 常规Java版Hello World
 
[第4章 零XML配置的Spring Boot Application](http://www.jianshu.com/p/5e8210f5e5a3)
===

4.1 application.properties

4.2 Spring Boot属性配置和使用

4.2.1配置的优先级

4.2.2命令行参数配置

4.2.3 random.*属性配置

4.2.4属性文件配置

4.2.5 YAML格式的配置文件

4.2.6使用 Java配置类

4.3使用CommandLineRunner执行初始化加载
 
[第5章 Spring Boot自动配置原理](http://www.jianshu.com/p/346cac67bfcc)
===

5.1 Spring Boot的核心组件模块

5.2 Spring Boot Starters

5.3 @EnableAutoConfiguration自动配置原理

5.4 FreeMarkerAutoConfiguration自动配置的实例分析

5.5 spring.factories与定义应用程序的初始化行为
 
第二部分 Spring Boot集成
 
[第6章 Spring Boot数据库集成](http://www.jianshu.com/p/f67833d39247)
===

6.1 Spring Boot集成mybatis

6.2 Spring Boot集成jpa  

6.3 Spring Boot集成mongodb开发

 
[第7章 Spring Boot集成模板引擎](http://www.jianshu.com/p/3f6a32b2a86d)
===

7.1 Spring Boot集成jsp模板

7.2 Spring Boot集成thymeleaf模板

7.3 Spring Boot集成velocity模板

7.4 Spring Boot集成freemarker模板

7.5 Spring Boot集成groovy模板
 
[第8章 Spring Boot集成开发](http://www.jianshu.com/p/bcd61fb4d1f1)
===

[8.1 Spring Boot集成Groovy混合Java开发](http://www.jianshu.com/p/b64b4ed970f2)

[8.2 Spring Boot集成Groovy、Grails开发](http://www.jianshu.com/p/32c9b45a788f)

[8.3 Spring Boot集成Scala混合Java开发](http://www.jianshu.com/p/db44a6b380b9)

[8.4 Spring Boot集成Kotlin混合Java开发](http://www.jianshu.com/p/0d67771ae14c)

[8.5 Spring Boot集成Swagger2构建自动化Rest API文档](http://www.jianshu.com/p/39f145c6eb29)

[8.6 Spring Boot集成Spring Security](http://www.jianshu.com/p/08cc28921fd0)

[8.7 Spring Boot集成日志](http://www.jianshu.com/p/2edd7bdd437c)

[8.8 Spring Boot静态资源处理](http://www.jianshu.com/p/d127c4f78bb8)
 
[第9章 Spring Boot开发者工具](http://www.jianshu.com/p/127dd30cf75f)
===
9.1 Spring Boot maven plugin

9.2 Spring Boot gradle plugin

9.3 Spring Boot热部署

9.4 Spring Boot远程调试
 
[第10章 Spring Boot应用部署运维](http://www.jianshu.com/p/1ab5e5c48a96)
===
10.1 Spring Boot应用运行

10.2使用Spring Cloud部署

10.3使用Docker快速部署
 
[第11章 Spring Boot应用监控](http://www.jianshu.com/p/154fbb484614)
===
11.1 使用Spring Boot Actuator监控应用

11.2 Spring Boot远程Shell
 
[第12章 Spring Boot与微服务](http://www.jianshu.com/p/572f264d0bb5)
===
12.1 微服务架构

12.2 使用Spring Boot创建微服务
 
第三部分 问题解决
 
[第13章 常见问题与解决方案](http://www.jianshu.com/p/1f089aea98f5)
===
13.1 Spring MVC 关于controller的字符编码

13.2 Spring Boot启动报错

13.3 javax.servlet.ServletException

13.4 库依赖冲突问题

13.5 org.apache.catalina.LifecycleException

13.6 @EnableMongoRepositories路径配置

13.7 Logging system failed to initialize using configuration from 'logback.xml '

13.8 java.lang.IllegalArgumentException: Request header is too large

13.9 No handler found for GET /swagger-ui.html
 
[附录](http://www.jianshu.com/p/afe13c8de2d9)
===

[附录A 计算机的0和1](http://www.jianshu.com/p/9161842c9e11)
===
[附录B 编程的本质](http://www.jianshu.com/p/bd444f36e92b)
===
[附录C Java编程简史](http://www.jianshu.com/p/218fef40e8d9)
===

### SpringBoot简明教程

https://www.gitbook.com/book/jxgxldl/spring-boot2016/details

### Scala

https://www.gitbook.com/@universsky/







8.6 Spring Boot集成Spring Security
====



开发Web应用，对页面的安全控制通常是必须的。比如：对于没有访问权限的用户需要转到登录表单页面。要实现访问控制的方法多种多样，可以通过Aop、拦截器实现，也可以通过框架实现，例如：Apache Shiro、Spring Security。

很多成熟的大公司都会有专门针对用户管理方面有一套完整的SSO（单点登录），ACL（权限访问控制），UC(用户中心)系统。 但是在我们开发中小型系统的时候，往往还是优先选择轻量级可用的业内通用的框架解决方案。

Spring Security 就是一个Spring生态中关于安全方面的框架。它能够为基于Spring的企业应用系统提供声明式的安全访问控制解决方案。

Spring Security，是一个基于Spring AOP和Servlet过滤器的安全框架。它提供全面的安全性解决方案，同时在Web请求级和方法调用级处理身份确认和授权。在Spring Framework基础上，Spring Security充分利用了依赖注入（DI，Dependency Injection）和面向切面技术。

Spring Security提供了一组可以在Spring应用上下文中配置的Bean，充分利用了Spring IoC（Inversion of Control, 控制反转），DI和AOP（Aspect Oriented Progamming ，面向切面编程）功能，为应用系统提供声明式的安全访问控制功能，减少了为企业系统安全控制编写大量重复代码的工作，为基于J2EE企业应用软件提供了全面安全服务[0]。Spring Security的前身是 Acegi Security 。


本章节使用SpringBoot集成Spring Security开发一个LightSword接口自动化测试平台，由浅入深的讲解SpringBoot集成Spring Security开发技术知识。

本章节采用SpringBoot集成的主要的后端技术框架：

>编程语言：java，scala
ORM框架：jpa
View模板引擎：velocity
安全框架：spring security
数据库：mysql


## 初阶 Security： 默认认证用户名密码

项目pom.xml添加spring-boot-starter-security依赖
```
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
        </dependency>
```


重启你的应用。再次打开页面，你讲看到一个alert表单对话框：


![](http://upload-images.jianshu.io/upload_images/1233356-95b3b7bbd2228b52.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

这个用户名，密码是什么呢？

让我们来从SpringBoot源码寻找一下。

你搜一下输出日志，会看到下面一段输出：

```
2017-04-27 21:39:20.321  INFO 94124 --- [ost-startStop-1] b.a.s.AuthenticationManagerConfiguration : 

Using default security password: 6c920ced-f1c1-4604-96f7-f0ce4e46f5d4
```

这段日志是AuthenticationManagerConfiguration类里面的如下方法输出的：

```
		@Override
		public void configure(AuthenticationManagerBuilder auth) throws Exception {
			if (auth.isConfigured()) {
				return;
			}
			User user = this.securityProperties.getUser();
			if (user.isDefaultPassword()) {
				logger.info(String.format("%n%nUsing default security password: %s%n",
						user.getPassword()));
			}
			Set<String> roles = new LinkedHashSet<>(user.getRole());
			withUser(user.getName()).password(user.getPassword())
					.roles(roles.toArray(new String[roles.size()]));
			setField(auth, "defaultUserDetailsService", getUserDetailsService());
			super.configure(auth);
		}
```

我们可以看出，是SecurityProperties这个Bean管理了用户名和密码。
在SecurityProperties里面的一个内部静态类User类里面，管理了默认的认证的用户名与密码。代码如下

```
	public static class User {

		/**
		 * Default user name.
		 */
		private String name = "user";

		/**
		 * Password for the default user name.
		 */
		private String password = UUID.randomUUID().toString();

		/**
		 * Granted roles for the default user name.
		 */
		private List<String> role = new ArrayList<>(Collections.singletonList("USER"));

		private boolean defaultPassword = true;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			if (password.startsWith("${") && password.endsWith("}")
					|| !StringUtils.hasLength(password)) {
				return;
			}
			this.defaultPassword = false;
			this.password = password;
		}

		public List<String> getRole() {
			return this.role;
		}

		public void setRole(List<String> role) {
			this.role = new ArrayList<>(role);
		}

		public boolean isDefaultPassword() {
			return this.defaultPassword;
		}

	}
```

综上所述，security默认的用户名是user, 默认密码是应用启动的时候，通过UUID算法随机生成的。默认的role是"USER"。

当然，如果我们想简单改一下这个用户名密码，可以在application.properties配置你的用户名密码，例如
```
# security
security.user.name=admin
security.user.password=admin
```







当然这只是一个初级的配置，更复杂的配置，可以分不用角色，在控制范围上，能够拦截到方法级别的权限控制。 且看下文分解。

## 中阶 Security：内存用户名密码认证

在上面章节，我们什么都没做，就添加了spring-boot-starter-security依赖，整个应用就有了默认的认证安全机制。下面，我们来定制用户名密码。

写一个extends WebSecurityConfigurerAdapter的配置类:

```
package com.springboot.in.action.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by jack on 2017/4/27.
 */

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
            .withUser("root")
            .password("root")
            .roles("USER");
    }

}

```

简要说明：

1.通过 @EnableWebSecurity注解开启Spring Security的功能。使用@EnableGlobalMethodSecurity(prePostEnabled = true)这个注解，可以开启security的注解，我们可以在需要控制权限的方法上面使用@PreAuthorize，@PreFilter这些注解。

2.extends 继承 WebSecurityConfigurerAdapter 类，并重写它的方法来设置一些web安全的细节。我们结合@EnableWebSecurity注解和继承WebSecurityConfigurerAdapter，来给我们的系统加上基于web的安全机制。

3.在configure(HttpSecurity http)方法里面，默认的认证代码是：
```
		http
			.authorizeRequests()
				.anyRequest().authenticated()
				.and()
			.formLogin().and()
			.httpBasic();
```

从方法名我们基本可以看懂这些方法的功能。上面的那个默认的登录页面，就是SpringBoot默认的用户名密码认证的login页面。其源代码如下：

```

<html><head><title>Login Page</title></head><body onload='document.f.username.focus();'>
<h3>Login with Username and Password</h3><form name='f' action='/login' method='POST'>
<table>
	<tr><td>User:</td><td><input type='text' name='username' value=''></td></tr>
	<tr><td>Password:</td><td><input type='password' name='password'/></td></tr>
	<tr><td colspan='2'><input name="submit" type="submit" value="Login"/></td></tr>
	<input name="_csrf" type="hidden" value="b2155184-80cf-48a2-b547-91bbe364c98e" />
</table>
</form></body></html>

```

我们使用SpringBoot默认的配置super.configure(http)，它通过 authorizeRequests() 定义哪些URL需要被保护、哪些不需要被保护。默认配置是所有访问页面都需要认证，才可以访问。

4.通过 formLogin() 定义当需要用户登录时候，转到的登录页面。

5.configureGlobal(AuthenticationManagerBuilder auth) 方法，在内存中创建了一个用户，该用户的名称为root，密码为root，用户角色为USER。


我们再次启动应用，访问 http://localhost:8888
页面自动跳转到： http://localhost:8888/login
如下图所示：


![](http://upload-images.jianshu.io/upload_images/1233356-bd0f7ecc0ab3d3ba.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


这个默认的登录页面是怎么冒出来的呢？是的，SpringBoot内置的，SpringBoot甚至给我们做好了一个极简的登录页面。这个登录页面是通过Filter实现的。具体的实现类是org.springframework.security.web.authentication.ui.DefaultLoginPageGeneratingFilter。同时，这个DefaultLoginPageGeneratingFilter也是SpringBoot的默认内置的Filter。


输入用户名，密码，点击Login


![](http://upload-images.jianshu.io/upload_images/1233356-6dc909ab10e3993c.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

成功跳转我们之前要访问的页面：


![](http://upload-images.jianshu.io/upload_images/1233356-5a6e125c7832b32f.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


不过，我们发现，SpringBoot应用的启动日志还是打印了如下一段：

```
2017-04-27 22:51:44.059  INFO 95039 --- [ost-startStop-1] b.a.s.AuthenticationManagerConfiguration : 

Using default security password: 5fadfb54-2096-4a0b-ad46-2dad3220c825
```

但实际上，已经使用了我们定制的用户名密码了。




如果我们要配置多个用户，多个角色，可参考使用如下示例的代码：

```
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
                .withUser("root")
                .password("root")
                .roles("USER")
            .and()
                .withUser("admin").password("admin")
                .roles("ADMIN", "USER")
            .and()
                .withUser("user").password("user")
                .roles("USER");
    }
```

## 角色权限控制

当我们的系统功能模块当需求发展到一定程度时，会不同的用户，不同角色使用我们的系统。这样就要求我们的系统可以做到，能够对不同的系统功能模块，开放给对应的拥有其访问权限的用户使用。


Spring Security提供了Spring EL表达式，允许我们在定义URL路径访问(@RequestMapping)的方法上面添加注解，来控制访问权限。

在标注访问权限时，根据对应的表达式返回结果，控制访问权限：

>true，表示有权限
fasle，表示无权限

Spring Security可用表达式对象的基类是SecurityExpressionRoot。

```

package org.springframework.security.access.expression;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.access.hierarchicalroles.RoleHierarchy;
import org.springframework.security.authentication.AuthenticationTrustResolver;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

/**
 * Base root object for use in Spring Security expression evaluations.
 *
 * @author Luke Taylor
 * @since 3.0
 */
public abstract class SecurityExpressionRoot implements SecurityExpressionOperations {
	protected final Authentication authentication;
	private AuthenticationTrustResolver trustResolver;
	private RoleHierarchy roleHierarchy;
	private Set<String> roles;
	private String defaultRolePrefix = "ROLE_";

	/** Allows "permitAll" expression */
	public final boolean permitAll = true;

	/** Allows "denyAll" expression */
	public final boolean denyAll = false;
	private PermissionEvaluator permissionEvaluator;
	public final String read = "read";
	public final String write = "write";
	public final String create = "create";
	public final String delete = "delete";
	public final String admin = "administration";

	/**
	 * Creates a new instance
	 * @param authentication the {@link Authentication} to use. Cannot be null.
	 */
	public SecurityExpressionRoot(Authentication authentication) {
		if (authentication == null) {
			throw new IllegalArgumentException("Authentication object cannot be null");
		}
		this.authentication = authentication;
	}

	public final boolean hasAuthority(String authority) {
		return hasAnyAuthority(authority);
	}

	public final boolean hasAnyAuthority(String... authorities) {
		return hasAnyAuthorityName(null, authorities);
	}

	public final boolean hasRole(String role) {
		return hasAnyRole(role);
	}

	public final boolean hasAnyRole(String... roles) {
		return hasAnyAuthorityName(defaultRolePrefix, roles);
	}

	private boolean hasAnyAuthorityName(String prefix, String... roles) {
		Set<String> roleSet = getAuthoritySet();

		for (String role : roles) {
			String defaultedRole = getRoleWithDefaultPrefix(prefix, role);
			if (roleSet.contains(defaultedRole)) {
				return true;
			}
		}

		return false;
	}

	public final Authentication getAuthentication() {
		return authentication;
	}

	public final boolean permitAll() {
		return true;
	}

	public final boolean denyAll() {
		return false;
	}

	public final boolean isAnonymous() {
		return trustResolver.isAnonymous(authentication);
	}

	public final boolean isAuthenticated() {
		return !isAnonymous();
	}

	public final boolean isRememberMe() {
		return trustResolver.isRememberMe(authentication);
	}

	public final boolean isFullyAuthenticated() {
		return !trustResolver.isAnonymous(authentication)
				&& !trustResolver.isRememberMe(authentication);
	}

	/**
	 * Convenience method to access {@link Authentication#getPrincipal()} from
	 * {@link #getAuthentication()}
	 * @return
	 */
	public Object getPrincipal() {
		return authentication.getPrincipal();
	}

	public void setTrustResolver(AuthenticationTrustResolver trustResolver) {
		this.trustResolver = trustResolver;
	}

	public void setRoleHierarchy(RoleHierarchy roleHierarchy) {
		this.roleHierarchy = roleHierarchy;
	}

	/**
	 * <p>
	 * Sets the default prefix to be added to {@link #hasAnyRole(String...)} or
	 * {@link #hasRole(String)}. For example, if hasRole("ADMIN") or hasRole("ROLE_ADMIN")
	 * is passed in, then the role ROLE_ADMIN will be used when the defaultRolePrefix is
	 * "ROLE_" (default).
	 * </p>
	 *
	 * <p>
	 * If null or empty, then no default role prefix is used.
	 * </p>
	 *
	 * @param defaultRolePrefix the default prefix to add to roles. Default "ROLE_".
	 */
	public void setDefaultRolePrefix(String defaultRolePrefix) {
		this.defaultRolePrefix = defaultRolePrefix;
	}

	private Set<String> getAuthoritySet() {
		if (roles == null) {
			roles = new HashSet<String>();
			Collection<? extends GrantedAuthority> userAuthorities = authentication
					.getAuthorities();

			if (roleHierarchy != null) {
				userAuthorities = roleHierarchy
						.getReachableGrantedAuthorities(userAuthorities);
			}

			roles = AuthorityUtils.authorityListToSet(userAuthorities);
		}

		return roles;
	}

	public boolean hasPermission(Object target, Object permission) {
		return permissionEvaluator.hasPermission(authentication, target, permission);
	}

	public boolean hasPermission(Object targetId, String targetType, Object permission) {
		return permissionEvaluator.hasPermission(authentication, (Serializable) targetId,
				targetType, permission);
	}

	public void setPermissionEvaluator(PermissionEvaluator permissionEvaluator) {
		this.permissionEvaluator = permissionEvaluator;
	}

	/**
	 * Prefixes role with defaultRolePrefix if defaultRolePrefix is non-null and if role
	 * does not already start with defaultRolePrefix.
	 *
	 * @param defaultRolePrefix
	 * @param role
	 * @return
	 */
	private static String getRoleWithDefaultPrefix(String defaultRolePrefix, String role) {
		if (role == null) {
			return role;
		}
		if (defaultRolePrefix == null || defaultRolePrefix.length() == 0) {
			return role;
		}
		if (role.startsWith(defaultRolePrefix)) {
			return role;
		}
		return defaultRolePrefix + role;
	}
}


```

通过阅读源码，我们可以更加深刻的理解其EL写法，并在写代码的时候正确的使用。变量defaultRolePrefix硬编码约定了role的前缀是"ROLE_"。

同时，我们可以看出hasRole跟hasAnyRole是一样的。hasAnyRole是调用的hasAnyAuthorityName(defaultRolePrefix, roles)。所以，我们在学习一个框架或者一门技术的时候，最准确的就是源码。通过源码，我们可以更好更深入的理解技术的本质。


SecurityExpressionRoot为我们提供的使用Spring EL表达式总结如下[1]：

| 表达式            |  描述                               |
|----------------|---------------------------|
|hasRole([role])         | 当前用户是否拥有指定角色。
|hasAnyRole([role1,role2])         | 多个角色是一个以逗号进行分隔的字符串。如果当前用户拥有指定角色中的任意一个则返回true。
|hasAuthority([auth])      |等同于hasRole
|hasAnyAuthority([auth1,auth2])    |等同于hasAnyRole
|Principle      |代表当前用户的principle对象
|authentication    |直接从SecurityContext获取的当前Authentication对象
|permitAll    |总是返回true，表示允许所有的
|denyAll    |总是返回false，表示拒绝所有的
|isAnonymous()    |当前用户是否是一个匿名用户
|isRememberMe()    |表示当前用户是否是通过Remember-Me自动登录的
|isAuthenticated()      |表示当前用户是否已经登录认证成功了。
|isFullyAuthenticated()    |如果当前用户既不是一个匿名用户，同时又不是通过Remember-Me自动登录的，则返回true。



比如说，在lightsword系统中，我们设置测试报告页面，只针对ADMIN权限开放，代码如下：

```
package com.springboot.in.action.controller

import java.util

import com.alibaba.fastjson.serializer.SerializerFeature
import com.springboot.in.action.dao.HttpReportDao
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.{RequestMapping, RestController}
import org.springframework.web.servlet.ModelAndView

import scala.collection.JavaConversions._

@RestController
@RequestMapping(Array("/httpreport"))
class HttpReportController @Autowired()(val HttpReportDao: HttpReportDao) {

  @RequestMapping(value = {
    Array("", "/")
  })
  @PreAuthorize("hasRole('ADMIN')") // Spring Security默认的角色前缀是”ROLE_”,使用hasRole方法时已经默认加上了
  def list(model: Model) = {
    val reports = HttpReportDao.findAll
    model.addAttribute("reports", reports)

    val rateList = new util.ArrayList[Double]

    val trendList = new util.ArrayList[Object]

    for (r <- reports) {
      rateList.add(r.rate)

      // QualityTrend
      val qt = new util.HashMap[String, Any]

      qt.put("id", r.id)
      qt.put("failed", r.fail)
      qt.put("totalCases", r.pass + r.fail)
      qt.put("rate", r.rate)
      trendList.add(qt)
    }

    val jsonstr = com.alibaba.fastjson.JSON.toJSONString(trendList, SerializerFeature.BrowserCompatible)
    println(jsonstr)

    model.addAttribute("rateList", rateList)
    model.addAttribute("trendList", jsonstr)

    new ModelAndView("/httpreport/list")
  }

}

```


然后，我们配置用户user为USER权限：
```
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
            .withUser("root")
            .password("root")
            .roles("ADMIN", "USER")
            .and()
            .withUser("admin").password("admin")
            .roles("ADMIN", "USER")
            .and()
            .withUser("user").password("user")
            .roles("USER");
    }
```

重启应用，用用户名：user，密码：user登录系统，访问/httpreport页面，我们将会看到如下，不允许访问的报错页面：


![](http://upload-images.jianshu.io/upload_images/1233356-26e3494ed4cd9be4.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

##### 简要说明

在方法上添加@PreAuthorize这个注解，value="hasRole('ADMIN')")是Spring-EL expression，当表达式值为true，标识这个方法可以被调用。如果表达式值是false，标识此方法无权限访问。 





本小节完整的工程代码：
https://github.com/EasySpringBoot/lightsword/tree/spring_security_with_in_memory_auth




##在Spring Security里面获取当前登录认证通过的用户信息

如果我们想要在前端页面显示当前登录的用户怎么办呢？在在Spring Security里面怎样获取当前登录认证通过的用户信息？下面我们就来探讨这个问题。

很好办。我们添加一个LoginFilter，默认拦截所有请求，把当前登录的用户放到系统session中即可。在Spring Security中，用户信息保存在SecurityContextHolder中。Spring Security使用一个Authentication对象来持有所有系统的安全认证相关的信息。这个信息的内容格式如下：

```
{
	"accountNonExpired":true,
	"accountNonLocked":true,
	"authorities":[{
		"authority":"ROLE_ADMIN"
	},{
		"authority":"ROLE_USER"
	}],
	"credentialsNonExpired":true,
	"enabled":true,
	"username":"root"
}
```

这个Authentication对象信息其实就是User实体的信息(当然，密码没放进来)。

```
public class User implements UserDetails, CredentialsContainer {
	private String password;
	private final String username;
	private final Set<GrantedAuthority> authorities;
	private final boolean accountNonExpired;
	private final boolean accountNonLocked;
	private final boolean credentialsNonExpired;
	private final boolean enabled;
        ....
}
```



 我们可以使用下面的代码（Java）获得当前身份验证的用户的名称:

```
Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

if (principal instanceof UserDetails) {
    String username = ((UserDetails)principal).getUsername();
} else {
    String username = principal.toString();
}
```
通过调用getContext()返回的对象是SecurityContext的实例对象，该实例对象保存在ThreadLocal线程本地存储中。使用Spring Security框架，通常的认证机制都是返回UserDetails实例。


Spring MVC的 Web开发使用 Controller 基本上可以完成大部分需求，但是我们还可能会用到 Servlet、Filter、Listener、Interceptor 等等。

在Spring Boot中添加自己的Servlet有两种方法，代码注册Servlet和注解自动注册（Filter和Listener也是如此）。 

（1）代码注册通过ServletRegistrationBean、 FilterRegistrationBean 和 ServletListenerRegistrationBean 获得控制。 
也可以通过实现 ServletContextInitializer 接口直接注册。使用代码注册Servlet（就不需要@ServletComponentScan注解）

（2）在 SpringBootApplication 上使用@ServletComponentScan 注解后，Servlet、Filter、Listener 可以直接通过 @WebServlet、@WebFilter、@WebListener 注解自动注册。


下面我们就采用第（2）种方法，通过添加一个LoginFilter，拦截所有请求，把当前登录信息放到系统session中，并在前端页面显示。

1.添加一个实现了javax.servlet.Filter的LoginFilter，把当前登录信息放到系统session中

代码如下

```
package com.springboot.in.action.filter

import javax.servlet._
import javax.servlet.annotation.WebFilter
import javax.servlet.http.HttpServletRequest

import com.alibaba.fastjson.JSON
import com.alibaba.fastjson.serializer.SerializerFeature
import org.springframework.core.annotation.Order

/**
  * Created by jack on 2017/4/28.
  */
@Order(1) //@Order注解表示执行过滤顺序，值越小，越先执行
@WebFilter(filterName = "loginFilter", urlPatterns = Array("/*")) //需要在spring-boot的入口处加注解@ServletComponentScan, 如果不指定，默认url-pattern是/*
class LoginFilter extends Filter {
  override def init(filterConfig: FilterConfig): Unit = {}

  override def destroy(): Unit = {}

  override def doFilter(request: ServletRequest, response: ServletResponse, chain: FilterChain): Unit = {
    val session = request.asInstanceOf[HttpServletRequest].getSession

    import org.springframework.security.core.context.SecurityContextHolder
    import org.springframework.security.core.userdetails.UserDetails

    val principal = SecurityContextHolder.getContext.getAuthentication.getPrincipal


    println("LoginFilter:" + JSON.toJSONString(principal, SerializerFeature.PrettyFormat))

    var username = ""
    if (principal.isInstanceOf[UserDetails]) {
      username = principal.asInstanceOf[UserDetails].getUsername
    }
    else {
      username = principal.toString
    }
    session.setAttribute("username", username)

    chain.doFilter(request, response)
  }
}

```

我们通过

```
val principal = SecurityContextHolder.getContext.getAuthentication.getPrincipal


if (principal.isInstanceOf[UserDetails]) {
      username = principal.asInstanceOf[UserDetails].getUsername
    }
    else {
      username = principal.toString
    }

```
拿到认证信息，然后把用户名放到session中：
```
session.setAttribute("username", username)
chain.doFilter(request, response)

```

 
其中，@WebFilter(filterName = "loginFilter", urlPatterns = Array("/*")) ，这个注解用来声明一个Servlet的Filter，这个加注解@WebFilter的LoginFilter类必须要实现javax.servlet.Filter接口。它会在容器部署的时候扫描处理。如果不指定urlPatterns，默认url-pattern是/*。这个@WebFilter注解，在SpringBoot中，要给启动类加上注解@ServletComponentScan，开启扫描Servlet组件功能。


2.给启动类加上注解@ServletComponentScan

```
package com.springboot.in.action

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.servlet.ServletComponentScan

@SpringBootApplication
@ServletComponentScan(basePackages = Array("com.springboot.in.action"))
class AppConfig


```

这个注解将开启扫描Servlet组件功能。那些被标注了@WebFilter，@WebServlet，@WebListener的Bean将会注册到容器中。需要注意的一点是，这个扫描动作只在当我们使用的是嵌入式Servlet容器的时候才起作用。完成Bean注册工作的类是org.springframework.boot.web.servlet.ServletComponentScanRegistrar，它实现了Spring的ImportBeanDefinitionRegistrar接口。




3.前端显示用户信息

Velocity内置了一些对象，例如：$request、$response、$session，这些对象可以在vm模版里可以直接调用。所以我们只需要使用$session取出，当初我们放进session的对应key的属性值即可。

我们在LoginFilter里面是这样放进去的：

```
session.setAttribute("username", username)
```


在前端页面直接这样取出username

```
<div class="pull-left info">
    <p>$session.getAttribute('username')</p>
    <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
</div>
```


4.运行测试

部署应用运行，我们看一下运行日志：


```
2017-04-28 21:42:46.072  INFO 2961 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat initialized with port(s): 8888 (http)
2017-04-28 21:42:46.097  INFO 2961 --- [           main] o.apache.catalina.core.StandardService   : Starting service Tomcat
2017-04-28 21:42:46.099  INFO 2961 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.0.33
2017-04-28 21:42:46.328  INFO 2961 --- [ost-startStop-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2017-04-28 21:42:46.328  INFO 2961 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 4325 ms
2017-04-28 21:42:46.984  INFO 2961 --- [ost-startStop-1] o.s.b.c.embedded.FilterRegistrationBean  : Mapping filter: 'characterEncodingFilter' to: [/*]
2017-04-28 21:42:46.984  INFO 2961 --- [ost-startStop-1] o.s.b.c.embedded.FilterRegistrationBean  : Mapping filter: 'hiddenHttpMethodFilter' to: [/*]
2017-04-28 21:42:46.985  INFO 2961 --- [ost-startStop-1] o.s.b.c.embedded.FilterRegistrationBean  : Mapping filter: 'httpPutFormContentFilter' to: [/*]
2017-04-28 21:42:46.985  INFO 2961 --- [ost-startStop-1] o.s.b.c.embedded.FilterRegistrationBean  : Mapping filter: 'requestContextFilter' to: [/*]
2017-04-28 21:42:46.987  INFO 2961 --- [ost-startStop-1] .e.DelegatingFilterProxyRegistrationBean : Mapping filter: 'springSecurityFilterChain' to: [/*]
2017-04-28 21:42:46.988  INFO 2961 --- [ost-startStop-1] o.s.b.c.embedded.FilterRegistrationBean  : Mapping filter: 'com.springboot.in.action.filter.LoginFilter' to: [/*]
2017-04-28 21:42:46.988  INFO 2961 --- [ost-startStop-1] o.s.b.c.e.ServletRegistrationBean        : Mapping servlet: 'dispatcherServlet' to [/]
2017-04-28 21:42:47.734  INFO 2961 --- [ost-startStop-1] o.s.s.web.DefaultSecurityFilterChain     : Creating filter chain: org.springframework.security.web.util.matcher.AnyRequestMatcher@1, [org.springframework.security.web.context.request.async.WebAsyncManagerIntegrationFilter@7a20e3e2, org.springframework.security.web.context.SecurityContextPersistenceFilter@6d522c58, org.springframework.security.web.header.HeaderWriterFilter@43ba5fdb, org.springframework.security.web.csrf.CsrfFilter@4ae04f7a, org.springframework.security.web.authentication.logout.LogoutFilter@31e3441f, org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter@30dfa22c, org.springframework.security.web.authentication.ui.DefaultLoginPageGeneratingFilter@605f9361, org.springframework.security.web.authentication.www.BasicAuthenticationFilter@22a03a5f, org.springframework.security.web.savedrequest.RequestCacheAwareFilter@7806751c, org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestFilter@67831f83, org.springframework.security.web.authentication.AnonymousAuthenticationFilter@134ae8c4, org.springframework.security.web.session.SessionManagementFilter@4c60d4b8, org.springframework.security.web.access.ExceptionTranslationFilter@2be01c38, org.springframework.security.web.access.intercept.FilterSecurityInterceptor@34cb7b6d]
2017-04-28 21:42:48.105  INFO 2961 --- [           main] j.LocalContainerEntityManagerFactoryBean : Building JPA container EntityManagerFactory for persistence unit 'default'
2017-04-28 21:42:48.121  INFO 2961 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [
```

在上面的日志里面，我们可以看到如下一行

```
o.s.b.c.embedded.FilterRegistrationBean  : Mapping filter: 'com.springboot.in.action.filter.LoginFilter' to: [/*]
```
这表明我们定义的LoginFilter类成功注册，路径映射到/*。同时，我们在

```
o.s.s.web.DefaultSecurityFilterChain     : Creating filter chain: 
```
这行日志后面，看到SpringBoot默认创建了的那些Filter Chain。这些Filter如下：

```


org.springframework.security.web.context.request.async.WebAsyncManagerIntegrationFilter@7a20e3e2, 

org.springframework.security.web.context.SecurityContextPersistenceFilter@6d522c58,

org.springframework.security.web.header.HeaderWriterFilter@43ba5fdb, 

org.springframework.security.web.csrf.CsrfFilter@4ae04f7a, 

org.springframework.security.web.authentication.logout.LogoutFilter@31e3441f,

 org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter@30dfa22c, 

org.springframework.security.web.authentication.ui.DefaultLoginPageGeneratingFilter@605f9361, 

org.springframework.security.web.authentication.www.BasicAuthenticationFilter@22a03a5f, 

org.springframework.security.web.savedrequest.RequestCacheAwareFilter@7806751c, 

org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestFilter@67831f83, 

org.springframework.security.web.authentication.AnonymousAuthenticationFilter@134ae8c4, 

org.springframework.security.web.session.SessionManagementFilter@4c60d4b8, 

org.springframework.security.web.access.ExceptionTranslationFilter@2be01c38, 

org.springframework.security.web.access.intercept.FilterSecurityInterceptor@34cb7b6d


```

SpringBoot在背后，为我们默默做了这么多事情。






好了，言归正传，我们使用root用户名登录，我们可以看到页面上正确展示了我们当前登录的用户，如下图


![](http://upload-images.jianshu.io/upload_images/1233356-6884c938e2acb0b1.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)





####SpringBoot注册Servlet、Filter、Listener的方法

我们刚才是使用@WebFilter注解一个javax.servlet.Filter的实现类来实现一个LoginFilter。

基于JavaConfig，SpringBoot同样可以使用如下的方式实现Servlet、Filter、Listener的Bean的配置：

```
@Configuration
public class WebConfig {


    @Bean
    public ServletRegistrationBean servletRegistrationBean_demo2(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        servletRegistrationBean.addUrlMappings("/demo-servlet");
        servletRegistrationBean.setServlet(new DemoServlet());
        return servletRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){

        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new LoginFilter());
        Set<String> set = new HashSet<String>();
        set.add("/*");
        filterRegistrationBean.setUrlPatterns(set);
        return filterRegistrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean servletListenerRegistrationBean(){
        ServletListenerRegistrationBean servletListenerRegistrationBean =  new ServletListenerRegistrationBean();
        servletListenerRegistrationBean.setListener(new Log4jConfigListener());
        servletListenerRegistrationBean.addInitParameter("log4jConfigLocation","classpath:log4j.properties");
        return servletListenerRegistrationBean;
    }
}

```


从这里我们可以看出，JavaConfig在SpringBoot的自动配置中实现Bean注册的基本使用方式。



##进阶 Security： 用数据库存储用户和角色，实现安全认证


本节我们将在我们之前的系统上，实现一个用数据库存储用户和角色，实现系统的安全认证。在权限角色上，我们简单设计两个用户角色：USER，ADMIN。

我们设计页面的权限如下：

首页/ :  所有人可访问
登录页 /login:  所有人可访问
普通用户权限页 /httpapi, /httpsuite:  登录后的用户都可访问
管理员权限页 /httpreport ： 仅管理员可访问
无权限提醒页： 当一个用户访问了其没有权限的页面，我们使用全局统一的异常处理页面提示。



####1.数据库层设计：新建三张表User,Role,UserRole

对应的领域实体模型类如下：

用户表
```
package com.springboot.in.action.entity

import javax.persistence.{Entity, GeneratedValue, GenerationType, Id}

import scala.beans.BeanProperty

/**
  * Created by jack on 2017/4/29.
  */
@Entity
class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @BeanProperty
  var id: Integer = _
  @BeanProperty
  var userName: String = _
  @BeanProperty
  var password: String = _

}

```

角色表
```
package com.springboot.in.action.entity

import javax.persistence.{Entity, GeneratedValue, GenerationType, Id}

import scala.beans.BeanProperty

/**
  * Created by jack on 2017/4/29.
  */
@Entity
class Role {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @BeanProperty
  var id: Integer = _
  @BeanProperty
  var role: String = _

}
```

用户角色关联表

```
package com.springboot.in.action.entity

import javax.persistence.{Entity, GeneratedValue, GenerationType, Id}

import scala.beans.BeanProperty

/**
  * Created by jack on 2017/4/29.
  */
@Entity
class UserRole {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @BeanProperty
  var id: Integer = _
  @BeanProperty
  var userId: Integer = _
  @BeanProperty
  var roleId: Integer = _


}


```

写一个数据库测试数据初始化的Bean：

```
package com.springboot.in.action.service

import javax.annotation.PostConstruct

import com.springboot.in.action.dao.{RoleDao, UserDao, UserRoleDao}
import com.springboot.in.action.entity.{Role, User, UserRole}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
  * Created by jack on 2017/4/29.
  * 初始化测试数据
  */
//@Service // 需要初始化数据时，打开注释即可。
class DataInit @Autowired()(val userDao: UserDao,
                            val userRoleDao: UserRoleDao,
                            val roleDao: RoleDao) {

  @PostConstruct def dataInit(): Unit = {
    val admin = new User
    val jack = new User

    admin.userName = "admin"
    admin.password = "admin"

    jack.userName = "jack"
    jack.password = "123456"

    userDao.save(admin)
    userDao.save(jack)

    val adminRole = new Role
    val userRole = new Role

    adminRole.role = "ADMIN"
    userRole.role = "USER"

    roleDao.save(adminRole)
    roleDao.save(userRole)

    val userRoleAdminRecord1 = new UserRole
    userRoleAdminRecord1.userId = admin.id
    userRoleAdminRecord1.roleId = adminRole.id
    userRoleDao.save(userRoleAdminRecord1)

    val userRoleAdminRecord2 = new UserRole
    userRoleAdminRecord2.userId = admin.id
    userRoleAdminRecord2.roleId = userRole.id
    userRoleDao.save(userRoleAdminRecord2)

    val userRoleJackRecord = new UserRole
    userRoleJackRecord.userId = jack.id
    userRoleJackRecord.roleId = userRole.id
    userRoleDao.save(userRoleJackRecord)


  }

}

```






####2.配置Spring Security

我们首先使用Spring Security帮我们做登录、登出的处理，以及当用户未登录时只能访问: http://localhost:8888/  以及  http://localhost:8888/login  两个页面。

同样的，我们要写一个继承WebSecurityConfigurerAdapter的配置类：

```
package com.springboot.in.action.security;

import com.springboot.in.action.service.LightSwordUserDetailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Created by jack on 2017/4/27.
 */

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
//使用@EnableGlobalMethodSecurity(prePostEnabled = true)
// 这个注解，可以开启security的注解，我们可以在需要控制权限的方法上面使用@PreAuthorize，@PreFilter这些注解。
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    //@Autowired
    //LightSwordUserDetailService lightSwordUserDetailService;

    @Override
    @Bean
    public UserDetailsService userDetailsService() { //覆盖写userDetailsService方法 (1)
        return new LightSwordUserDetailService();

    }

    /**
     * If subclassed this will potentially override subclass configure(HttpSecurity)
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //super.configure(http);
        http.csrf().disable();

        http.authorizeRequests()
            .antMatchers("/").permitAll()
            .antMatchers("/amchart/**",
                "/bootstrap/**",
                "/build/**",
                "/css/**",
                "/dist/**",
                "/documentation/**",
                "/fonts/**",
                "/js/**",
                "/pages/**",
                "/plugins/**"
            ).permitAll() //默认不拦截静态资源等url pattern
            .anyRequest().authenticated().and()
            .formLogin().loginPage("/login")// 登录url请求路径 (2)
            .defaultSuccessUrl("/httpapi").permitAll().and() // 登录成功跳转路径url(3)
            .logout().permitAll();

        http.logout().logoutSuccessUrl("/"); // 退出默认跳转页面 (4)

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //auth
        //    .inMemoryAuthentication()
        //    .withUser("root")
        //    .password("root")
        //    .roles("ADMIN", "USER")
        //    .and()
        //    .withUser("admin").password("admin")
        //    .roles("ADMIN", "USER")
        //    .and()
        //    .withUser("user").password("user")
        //    .roles("USER");

        //AuthenticationManager使用我们的 lightSwordUserDetailService 来获取用户信息
        auth.userDetailsService(userDetailsService()); // （5）
    }

}

```


这里只做了基本的配置，其中：

（1）覆盖写userDetailsService方法，具体的LightSwordUserDetailService实现类，我们下面紧接着会讲。
（2）跳转登录页面url请求路径为/login，我们需要定义一个Controller把路径映射到login.html。代码如下

```
package com.springboot.in.action.security

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.{ViewControllerRegistry, WebMvcConfigurerAdapter}


/**
  * Created by jack on 2017/4/30.
  */
@Configuration
class WebMvcConfig extends WebMvcConfigurerAdapter {
  /**
    * 统一注册纯RequestMapping跳转View的Controller
    */
  override def addViewControllers(registry: ViewControllerRegistry) {
    registry.addViewController("/login").setViewName("/login")
  }
}
```
这里我们直接采用ViewControllerRegistry来注册一个纯路径映射的Controller方法。

login.html

```
#parse("/common/header.html")

<div class="container-fluid">

    <div class="box box-success">
        <div class="box-header">
            <h2>LightSword自动化测试平台（<a href="http://localhost:8888/">LightSword</a>)</h2>
        </div>

        <div class="box-body">

            <h3>登录</h3>
            <form name='f' action='/login' method='POST'>
                <table>
                    <tr>
                        <td>用户名:</td>
                        <td><input type='text' name='username' value=''></td>
                    </tr>
                    <tr>
                        <td>密码:</td>
                        <td><input type='password' name='password'/></td>
                    </tr>
                    <tr>
                        <td colspan='2'><input name="submit" type="submit" value="登录"/></td>
                    </tr>
                    <!--<input name="_csrf" type="hidden" value="${_csrf}"/>-->

                </table>
            </form>
        </div>
    </div>
</div>

<script>
    $(function () {
        $('[name=f]').focus()
    })
</script>

#parse("/common/footer.html")

```




（3）登录成功后跳转的路径为/httpapi
（4）退出后跳转到的url为/ 

我们同样使用@EnableGlobalMethodSecurity(prePostEnabled = true)这个注解，开启security的注解，这样我们可以在需要控制权限的方法上面使用@PreAuthorize，@PreFilter这些注解。


####3.自定义LightSwordUserDetailService

从数据库中获取用户信息的操作是必不可少的，我们首先来实现UserDetailsService，这个接口需要我们实现一个方法：loadUserByUsername。即从数据库中取出用户名、密码以及权限相关的信息。最后返回一个UserDetails 实现类。

代码如下：

```
package com.springboot.in.action.service

import java.util

import com.springboot.in.action.dao.{RoleDao, UserDao, UserRoleDao}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.{User, UserDetails, UserDetailsService, UsernameNotFoundException}
import org.springframework.stereotype.Service
import org.springframework.util.StringUtils


/**
  * Created by jack on 2017/4/29.
  */
@Service
class LightSwordUserDetailService extends UserDetailsService {

  @Autowired var userRoleDao: UserRoleDao = _
  @Autowired var userDao: UserDao = _
  @Autowired var roleDao: RoleDao = _


  override def loadUserByUsername(username: String): UserDetails = {

//    val user = userDao.findByUsername(username) // 直接调用jpa自动生成的方法
    val user = userDao.getUserByUsername(username)
    if (user == null) throw new UsernameNotFoundException(username + " not found")

    val authorities = new util.ArrayList[SimpleGrantedAuthority]
    val userRoles = userRoleDao.listByUserId(user.id)

    // Scala中调用java的collection类，使用scala的foreach，编译器会提示无法找到result的foreach方法。因为这里的userRoles的类型为java.util.List。若要将其转换为Scala的集合，就需要增加如下语句：
    import scala.collection.JavaConversions._
    for (userRole <- userRoles) {
      val roleId = userRole.roleId
      val roleName = roleDao.findOne(roleId).role
      if (!StringUtils.isEmpty(roleName)) {
        authorities.add(new SimpleGrantedAuthority(roleName))
      }

      System.err.println("username is " + username + ", " + roleName)
    }

    new User(username, user.password, authorities)
  }
}

```


##4.用户退出

我们在configure(HttpSecurity http)方法里面定义了任何权限都允许退出，
```
*.logout().permitAll();
http.logout().logoutSuccessUrl("/"); // 退出默认跳转页面 (4)
```

SpringBoot集成Security的默认退出请求是/logout ， 我们在顶部导航栏加个退出功能。代码如下

```
                    <li>
                        <a href="/logout">
                            <i class="fa fa-power-off"></i>
                        </a>
                    </li>
```


####5.配置错误处理页面



访问发生错误时，跳转到系统统一异常处理页面。

我们首先添加一个GlobalExceptionHandlerAdvice，使用@ControllerAdvice注解：

```
package com.springboot.in.action.advice

import org.springframework.web.bind.annotation.{ControllerAdvice, ExceptionHandler}
import org.springframework.web.context.request.WebRequest
import org.springframework.web.servlet.ModelAndView

/**
  * Created by jack on 2017/4/27.
  */
@ControllerAdvice
class GlobalExceptionHandlerAdvice {

  @ExceptionHandler(value = Array(classOf[Exception])) //表示捕捉到所有的异常，你也可以捕捉一个你自定义的异常
  def exception(exception: Exception, request: WebRequest): ModelAndView = {
    val modelAndView = new ModelAndView("/error") //error页面
    modelAndView.addObject("errorMessage", exception.getMessage)
    modelAndView.addObject("stackTrace", exception.getStackTrace)
    modelAndView
  }

}

```
其中，@ExceptionHandler(value = Array(classOf[Exception])) ，表示捕捉到所有的异常，这里你也可以捕捉一个你自定义的异常。比如说，针对安全认证的Exception，我们可以单独定义处理。此处不再赘述。感兴趣的读者，可自行尝试。


错误统一处理页面error.html

```
#parse("/common/header.html")
<h1>系统异常统一处理页面</h1>

<h3>异常消息: $errorMessage</h3>

<h3>异常堆栈信息：</h3>
<code>
    #foreach($e in $stackTrace)
    $e
    #end
</code>


#parse("/common/footer.html")

```




##6.测试运行

为了方便测试用户权限功能，我们给数据库初始化一些测试数据进去：

```
package com.springboot.in.action.service

import java.util.UUID
import javax.annotation.PostConstruct

import com.springboot.in.action.dao.{RoleDao, UserDao, UserRoleDao}
import com.springboot.in.action.entity.{Role, User, UserRole}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
  * Created by jack on 2017/4/29.
  * 初始化测试数据
  */
@Service // 需要初始化数据时，打开注释即可。
class DataInit @Autowired()(val userDao: UserDao,
                            val userRoleDao: UserRoleDao,
                            val roleDao: RoleDao) {

  @PostConstruct def dataInit(): Unit = {
    val uuid = UUID.randomUUID().toString

    val admin = new User
    val jack = new User

    admin.username = "admin_" + uuid
    admin.password = "admin"

    jack.username = "jack_" + uuid
    jack.password = "123456"

    userDao.save(admin)
    userDao.save(jack)

    val adminRole = new Role
    val userRole = new Role

    adminRole.role = "ROLE_ADMIN"
    userRole.role = "ROLE_USER"

    roleDao.save(adminRole)
    roleDao.save(userRole)

    val userRoleAdminRecord1 = new UserRole
    userRoleAdminRecord1.userId = admin.id
    userRoleAdminRecord1.roleId = adminRole.id
    userRoleDao.save(userRoleAdminRecord1)

    val userRoleAdminRecord2 = new UserRole
    userRoleAdminRecord2.userId = admin.id
    userRoleAdminRecord2.roleId = userRole.id
    userRoleDao.save(userRoleAdminRecord2)

    val userRoleJackRecord = new UserRole
    userRoleJackRecord.userId = jack.id
    userRoleJackRecord.roleId = userRole.id
    userRoleDao.save(userRoleJackRecord)


  }

}

```


同样的，在我们需要权限控制的页面对应的方法上添加@PreAuthorize注解，value="hasRole('ADMIN')")或"hasRole('USER')"等。

部署应用，访问http://localhost:8888/httpapi ， 我们可以看到系统自动拦截跳转到登录页面


![](http://upload-images.jianshu.io/upload_images/1233356-252a9cb9ec41e8e2.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


输入USER角色的用户名jack，密码123456，系统跳转到默认登录成功页面。我们访问无权限页面http://localhost:8888/httpreport ，可以看出，系统拦截到无权限，跳转到了错误提示页面


![](http://upload-images.jianshu.io/upload_images/1233356-3b23a0ed55a21a71.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


###HttpSecurity, WebSecurity和AuthenticationManagerBuilder





小结
===
本文通过一个最简单的示例完成了对Web应用的安全控制，Spring Security提供的功能还远不止于此，更多Spring Security的使用可参见【参考资料】部分。










参考资料：
0.http://baike.baidu.com/item/spring%20security
1.http://elim.iteye.com/blog/2247073
2.http://blog.csdn.net/u012373815/article/details/54632176
3.https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples/spring-boot-sample-secure
4.http://www.open-open.com/lib/view/open1464482054012.html
5.https://github.com/EasySpringBoot/spring-security
6.http://docs.spring.io/spring-security/site/docs/4.1.0.RELEASE/reference/htmlsingle/#jc-authentication
7.https://github.com/pzxwhc/MineKnowContainer/issues/58
8.http://stackoverflow.com/questions/22998731/httpsecurity-websecurity-and-authenticationmanagerbuilder
9.https://spring.io/blog/2013/07/03/spring-security-java-config-preview-web-security/
10.https://springcloud.cc/spring-security-zhcn.html





