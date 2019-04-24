// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.net;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.net.AbstractSSLSocketAppender;
import ch.qos.logback.core.spi.PreSerializationTransformer;
import java.net.InetAddress;

// Referenced classes of package ch.qos.logback.classic.net:
//			LoggingEventPreSerializationTransformer

public class SSLSocketAppender extends AbstractSSLSocketAppender
{

	public SSLSocketAppender()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void AbstractSSLSocketAppender()>
		pst = ((PreSerializationTransformer) (new LoggingEventPreSerializationTransformer()));
	//    2    4:aload_0         
	//    3    5:new             #16  <Class LoggingEventPreSerializationTransformer>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void LoggingEventPreSerializationTransformer()>
	//    6   12:putfield        #19  <Field PreSerializationTransformer pst>
	//    7   15:return          
	}

	public SSLSocketAppender(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #24  <Method void AbstractSSLSocketAppender(String, int)>
		pst = ((PreSerializationTransformer) (new LoggingEventPreSerializationTransformer()));
	//    4    6:aload_0         
	//    5    7:new             #16  <Class LoggingEventPreSerializationTransformer>
	//    6   10:dup             
	//    7   11:invokespecial   #17  <Method void LoggingEventPreSerializationTransformer()>
	//    8   14:putfield        #19  <Field PreSerializationTransformer pst>
	//    9   17:return          
	}

	public SSLSocketAppender(InetAddress inetaddress, int i)
	{
		super(inetaddress.getHostAddress(), i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #32  <Method String InetAddress.getHostAddress()>
	//    3    5:iload_2         
	//    4    6:invokespecial   #24  <Method void AbstractSSLSocketAppender(String, int)>
		pst = ((PreSerializationTransformer) (new LoggingEventPreSerializationTransformer()));
	//    5    9:aload_0         
	//    6   10:new             #16  <Class LoggingEventPreSerializationTransformer>
	//    7   13:dup             
	//    8   14:invokespecial   #17  <Method void LoggingEventPreSerializationTransformer()>
	//    9   17:putfield        #19  <Field PreSerializationTransformer pst>
	//   10   20:return          
	}

	public PreSerializationTransformer getPST()
	{
		return pst;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field PreSerializationTransformer pst>
	//    2    4:areturn         
	}

	protected void postProcessEvent(ILoggingEvent iloggingevent)
	{
		if(includeCallerData)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field boolean includeCallerData>
	//*   2    4:ifeq            14
			iloggingevent.getCallerData();
	//    3    7:aload_1         
	//    4    8:invokeinterface #46  <Method StackTraceElement[] ILoggingEvent.getCallerData()>
	//    5   13:pop             
	//    6   14:return          
	}

	protected volatile void postProcessEvent(Object obj)
	{
		postProcessEvent((ILoggingEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #42  <Class ILoggingEvent>
	//    3    5:invokevirtual   #49  <Method void postProcessEvent(ILoggingEvent)>
	//    4    8:return          
	}

	public void setIncludeCallerData(boolean flag)
	{
		includeCallerData = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #40  <Field boolean includeCallerData>
	//    3    5:return          
	}

	private boolean includeCallerData;
	private final PreSerializationTransformer pst;
}
