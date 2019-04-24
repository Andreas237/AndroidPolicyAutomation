// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;

// Referenced classes of package ch.qos.logback.classic.pattern:
//			NamedConverter

public class LoggerConverter extends NamedConverter
{

	public LoggerConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void NamedConverter()>
	//    2    4:return          
	}

	protected String getFullyQualifiedName(ILoggingEvent iloggingevent)
	{
		return iloggingevent.getLoggerName();
	//    0    0:aload_1         
	//    1    1:invokeinterface #17  <Method String ILoggingEvent.getLoggerName()>
	//    2    6:areturn         
	}
}
