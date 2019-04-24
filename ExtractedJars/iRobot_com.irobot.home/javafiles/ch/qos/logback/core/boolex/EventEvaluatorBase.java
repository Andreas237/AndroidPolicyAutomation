// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.boolex;

import ch.qos.logback.core.spi.ContextAwareBase;

// Referenced classes of package ch.qos.logback.core.boolex:
//			EventEvaluator

public abstract class EventEvaluatorBase extends ContextAwareBase
	implements EventEvaluator
{

	public EventEvaluatorBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void ContextAwareBase()>
	//    2    4:return          
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String name>
	//    2    4:areturn         
	}

	public boolean isStarted()
	{
		return started;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field boolean started>
	//    2    4:ireturn         
	}

	public void setName(String s)
	{
		if(name != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field String name>
	//*   2    4:ifnull          17
		{
			throw new IllegalStateException("name has been already set");
	//    3    7:new             #28  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #30  <String "name has been already set">
	//    6   13:invokespecial   #32  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		} else
		{
			name = s;
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:putfield        #20  <Field String name>
			return;
	//   11   22:return          
		}
	}

	public void start()
	{
		started = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #24  <Field boolean started>
	//    3    5:return          
	}

	public void stop()
	{
		started = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #24  <Field boolean started>
	//    3    5:return          
	}

	String name;
	boolean started;
}
