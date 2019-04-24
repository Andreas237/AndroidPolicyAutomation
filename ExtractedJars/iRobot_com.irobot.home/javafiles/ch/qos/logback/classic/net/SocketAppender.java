// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.net;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.net.AbstractSocketAppender;
import ch.qos.logback.core.spi.PreSerializationTransformer;
import java.net.InetAddress;

// Referenced classes of package ch.qos.logback.classic.net:
//			LoggingEventPreSerializationTransformer

public class SocketAppender extends AbstractSocketAppender
{

	public SocketAppender()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void AbstractSocketAppender()>
		includeCallerData = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #23  <Field boolean includeCallerData>
	//    5    9:return          
	}

	public SocketAppender(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #27  <Method void AbstractSocketAppender(String, int)>
		includeCallerData = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #23  <Field boolean includeCallerData>
	//    7   11:return          
	}

	public SocketAppender(InetAddress inetaddress, int i)
	{
		super(inetaddress.getHostAddress(), i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #35  <Method String InetAddress.getHostAddress()>
	//    3    5:iload_2         
	//    4    6:invokespecial   #27  <Method void AbstractSocketAppender(String, int)>
		includeCallerData = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #23  <Field boolean includeCallerData>
	//    8   14:return          
	}

	public PreSerializationTransformer getPST()
	{
		return pst;
	//    0    0:getstatic       #19  <Field PreSerializationTransformer pst>
	//    1    3:areturn         
	}

	protected void postProcessEvent(ILoggingEvent iloggingevent)
	{
		if(includeCallerData)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field boolean includeCallerData>
	//*   2    4:ifeq            14
			iloggingevent.getCallerData();
	//    3    7:aload_1         
	//    4    8:invokeinterface #47  <Method StackTraceElement[] ILoggingEvent.getCallerData()>
	//    5   13:pop             
	//    6   14:return          
	}

	protected volatile void postProcessEvent(Object obj)
	{
		postProcessEvent((ILoggingEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #43  <Class ILoggingEvent>
	//    3    5:invokevirtual   #50  <Method void postProcessEvent(ILoggingEvent)>
	//    4    8:return          
	}

	public void setIncludeCallerData(boolean flag)
	{
		includeCallerData = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #23  <Field boolean includeCallerData>
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
