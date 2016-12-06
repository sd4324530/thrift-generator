
thrift-generator
================

Creating a thrift file via a Java interface

## example
```java
public interface IHelloService {

    void say(String what);

    HelloBean getBean(String name, int age, boolean sex);
}
```
```java

public class ThriftStructBuilderTest {

	private ThriftFileBuilder fileBuilder = new ThriftFileBuilder();
	
	@Test
	public void toOutputstream() throws Exception {
		this.fileBuilder.buildToOutputStream(IHelloService.class, System.out);
	}
	
}
```
### 执行: 
```mvn test -Dtest=com.sohu.thrift.generator.builder.ThriftStructBuilderTest```
###**注：使用jdk8编译，可以自动获取方法的参数名**
### 之后会在控制台输出如下信息: 
```thrift

	namespace java com.github.sd4324530.thriftDemo


	struct HelloBean {
			1:string id,
			2:string name,
			3:i32 age,
			4:bool sex
	}

	service IHelloService {
		 	void say(1:string what),		        	
		 	HelloBean getBean(1:string name, 2:i32 age, 3:bool sex)		        	
	}


```
