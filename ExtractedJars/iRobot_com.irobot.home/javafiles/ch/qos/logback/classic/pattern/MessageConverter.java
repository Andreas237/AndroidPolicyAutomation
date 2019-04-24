// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;

// Referenced classes of package ch.qos.logback.classic.pattern:
//			ClassicConverter

public class MessageConverter extends ClassicConverter
{

	public MessageConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void ClassicConverter()>
	//    2    4:return          
	}

	public String convert(ILoggingEvent iloggingevent)
	{
		return iloggingevent.getFormattedMessage();
	//    0    0:aload_1         
	//    1    1:invokeinterface #17  <Method String ILoggingEvent.getFormattedMessage()>
	//    2    6:areturn         
	}

	public volatile String convert(Object obj)
	{
		return convert((ILoggingEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #13  <Class ILoggingEvent>
	//    3    5:invokevirtual   #20  <Method String convert(ILoggingEvent)>
	//    4    8:areturn         
	}
}
