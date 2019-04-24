// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.filter;

import ch.qos.logback.core.spi.*;

public abstract class Filter extends ContextAwareBase
	implements LifeCycle
{

	public Filter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void ContextAwareBase()>
		start = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #17  <Field boolean start>
	//    5    9:return          
	}

	public abstract FilterReply decide(Object obj);

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String name>
	//    2    4:areturn         
	}

	public boolean isStarted()
	{
		return start;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field boolean start>
	//    2    4:ireturn         
	}

	public void setName(String s)
	{
		name = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field String name>
	//    3    5:return          
	}

	public void start()
	{
		start = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #17  <Field boolean start>
	//    3    5:return          
	}

	public void stop()
	{
		start = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #17  <Field boolean start>
	//    3    5:return          
	}

	private String name;
	boolean start;
}
