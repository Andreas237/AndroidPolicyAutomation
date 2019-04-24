// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.rolling;

import ch.qos.logback.core.spi.ContextAwareBase;

// Referenced classes of package ch.qos.logback.core.rolling:
//			TriggeringPolicy

public abstract class TriggeringPolicyBase extends ContextAwareBase
	implements TriggeringPolicy
{

	public TriggeringPolicyBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void ContextAwareBase()>
	//    2    4:return          
	}

	public boolean isStarted()
	{
		return start;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field boolean start>
	//    2    4:ireturn         
	}

	public void start()
	{
		start = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #18  <Field boolean start>
	//    3    5:return          
	}

	public void stop()
	{
		start = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #18  <Field boolean start>
	//    3    5:return          
	}

	private boolean start;
}
