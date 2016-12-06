/**
 * 
 */
package com.sohu.thrift.generator.builder;

import com.github.sd4324530.thriftDemo.IHelloService;
import org.junit.Test;

/**
 * @author hongliuliao
 *
 * createTime:2012-12-6 下午3:24:05
 */
public class ThriftStructBuilderTest {

	private ThriftFileBuilder fileBuilder = new ThriftFileBuilder();
	
	@Test
	public void toOutputstream() throws Exception {
//		try (FileOutputStream fileOutputStream = new FileOutputStream("D:/helloService.thrift")){
//			this.fileBuilder.buildToOutputStream(IHelloService.class, fileOutputStream);
//			System.out.println("OK");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		this.fileBuilder.buildToOutputStream(IHelloService.class, System.out);
	}
	
}
