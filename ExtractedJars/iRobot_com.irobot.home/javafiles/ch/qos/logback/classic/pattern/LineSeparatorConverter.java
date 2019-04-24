// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.CoreConstants;

// Referenced classes of package ch.qos.logback.classic.pattern:
//			ClassicConverter

public class LineSeparatorConverter extends ClassicConverter
{

	public LineSeparatorConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void ClassicConverter()>
	//    2    4:return          
	}

	public String convert(ILoggingEvent iloggingevent)
	{
		return CoreConstants.LINE_SEPARATOR;
	//    0    0:getstatic       #17  <Field String CoreConstants.LINE_SEPARATOR>
	//    1    3:areturn         
	}

	public volatile String convert(Object obj)
	{
		return convert((ILoggingEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #20  <Class ILoggingEvent>
	//    3    5:invokevirtual   #22  <Method String convert(ILoggingEvent)>
	//    4    8:areturn         
	}
}
