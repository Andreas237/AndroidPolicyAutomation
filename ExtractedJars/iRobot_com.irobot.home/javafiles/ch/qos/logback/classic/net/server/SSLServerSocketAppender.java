// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.net.server;

import ch.qos.logback.classic.net.LoggingEventPreSerializationTransformer;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.net.server.SSLServerSocketAppenderBase;
import ch.qos.logback.core.spi.PreSerializationTransformer;

public class SSLServerSocketAppender extends SSLServerSocketAppenderBase
{

	public SSLServerSocketAppender()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void SSLServerSocketAppenderBase()>
	//    2    4:return          
	}

	protected PreSerializationTransformer getPST()
	{
		return pst;
	//    0    0:getstatic       #19  <Field PreSerializationTransformer pst>
	//    1    3:areturn         
	}

	public boolean isIncludeCallerData()
	{
		return includeCallerData;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field boolean includeCallerData>
	//    2    4:ireturn         
	}

	protected void postProcessEvent(ILoggingEvent iloggingevent)
	{
		if(isIncludeCallerData())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #33  <Method boolean isIncludeCallerData()>
	//*   2    4:ifeq            14
			iloggingevent.getCallerData();
	//    3    7:aload_1         
	//    4    8:invokeinterface #39  <Method StackTraceElement[] ILoggingEvent.getCallerData()>
	//    5   13:pop             
	//    6   14:return          
	}

	protected volatile void postProcessEvent(Object obj)
	{
		postProcessEvent((ILoggingEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #35  <Class ILoggingEvent>
	//    3    5:invokevirtual   #42  <Method void postProcessEvent(ILoggingEvent)>
	//    4    8:return          
	}

	public void setIncludeCallerData(boolean flag)
	{
		includeCallerData = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #29  <Field boolean includeCallerData>
	//    3    5:return          
	}

	private static final PreSerializationTransformer pst = new LoggingEventPreSerializationTransformer();
	private boolean includeCallerData;

	static 
	{
	//    0    0:new             #14  <Class LoggingEventPreSerializationTransformer>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void LoggingEventPreSerializationTransformer()>
	//    3    7:putstatic       #19  <Field PreSerializationTransformer pst>
	//*   4   10:return          
	}
}
