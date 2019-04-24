// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.log;


// Referenced classes of package com.itextpdf.text.log:
//			DefaultCounter, Counter

public class CounterFactory
{

	private CounterFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		counter = ((Counter) (new DefaultCounter()));
	//    2    4:aload_0         
	//    3    5:new             #19  <Class DefaultCounter>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void DefaultCounter()>
	//    6   12:putfield        #22  <Field Counter counter>
	//    7   15:return          
	}

	public static Counter getCounter(Class class1)
	{
		return myself.counter.getCounter(class1);
	//    0    0:getstatic       #15  <Field CounterFactory myself>
	//    1    3:getfield        #22  <Field Counter counter>
	//    2    6:aload_0         
	//    3    7:invokeinterface #28  <Method Counter Counter.getCounter(Class)>
	//    4   12:areturn         
	}

	public static CounterFactory getInstance()
	{
		return myself;
	//    0    0:getstatic       #15  <Field CounterFactory myself>
	//    1    3:areturn         
	}

	public Counter getCounter()
	{
		return counter;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Counter counter>
	//    2    4:areturn         
	}

	public void setCounter(Counter counter1)
	{
		counter = counter1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field Counter counter>
	//    3    5:return          
	}

	private static CounterFactory myself = new CounterFactory();
	private Counter counter;

	static 
	{
	//    0    0:new             #2   <Class CounterFactory>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void CounterFactory()>
	//    3    7:putstatic       #15  <Field CounterFactory myself>
	//*   4   10:return          
	}
}
