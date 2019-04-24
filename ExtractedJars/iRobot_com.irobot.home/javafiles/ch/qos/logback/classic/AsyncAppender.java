// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AsyncAppenderBase;

// Referenced classes of package ch.qos.logback.classic:
//			Level

public class AsyncAppender extends AsyncAppenderBase
{

	public AsyncAppender()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void AsyncAppenderBase()>
		includeCallerData = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #13  <Field boolean includeCallerData>
	//    5    9:return          
	}

	protected boolean isDiscardable(ILoggingEvent iloggingevent)
	{
		return iloggingevent.getLevel().toInt() <= 20000;
	//    0    0:aload_1         
	//    1    1:invokeinterface #22  <Method Level ILoggingEvent.getLevel()>
	//    2    6:invokevirtual   #28  <Method int Level.toInt()>
	//    3    9:sipush          20000
	//    4   12:icmpgt          17
	//    5   15:iconst_1        
	//    6   16:ireturn         
	//    7   17:iconst_0        
	//    8   18:ireturn         
	}

	protected volatile boolean isDiscardable(Object obj)
	{
		return isDiscardable((ILoggingEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #18  <Class ILoggingEvent>
	//    3    5:invokevirtual   #31  <Method boolean isDiscardable(ILoggingEvent)>
	//    4    8:ireturn         
	}

	public boolean isIncludeCallerData()
	{
		return includeCallerData;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field boolean includeCallerData>
	//    2    4:ireturn         
	}

	protected void preprocess(ILoggingEvent iloggingevent)
	{
		iloggingevent.prepareForDeferredProcessing();
	//    0    0:aload_1         
	//    1    1:invokeinterface #38  <Method void ILoggingEvent.prepareForDeferredProcessing()>
		if(includeCallerData)
	//*   2    6:aload_0         
	//*   3    7:getfield        #13  <Field boolean includeCallerData>
	//*   4   10:ifeq            20
			iloggingevent.getCallerData();
	//    5   13:aload_1         
	//    6   14:invokeinterface #42  <Method StackTraceElement[] ILoggingEvent.getCallerData()>
	//    7   19:pop             
	//    8   20:return          
	}

	protected volatile void preprocess(Object obj)
	{
		preprocess((ILoggingEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #18  <Class ILoggingEvent>
	//    3    5:invokevirtual   #45  <Method void preprocess(ILoggingEvent)>
	//    4    8:return          
	}

	public void setIncludeCallerData(boolean flag)
	{
		includeCallerData = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #13  <Field boolean includeCallerData>
	//    3    5:return          
	}

	boolean includeCallerData;
}
