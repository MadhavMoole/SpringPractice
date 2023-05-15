package org.me.p1;
import org.springframework.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LabourDisplayApplication {

	private static ApplicationContext ctx;
	
	public static void main(String[] args)
	{
		ctx=new ClassPathXmlApplicationContext("AppCtx.xml");
		Labour l1=(Labour)ctx.getBean("Labour");
		LabourDAO d1=(LabourDAO) ctx.getBean("lab");
		d1.insertLabour(l1);
	}
}
