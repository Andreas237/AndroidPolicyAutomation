// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;

// Referenced classes of package ch.qos.logback.classic.pattern:
//			ThrowableHandlingConverter

public class NopThrowableInformationConverter extends ThrowableHandlingConverter
{

	public NopThrowableInformationConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void ThrowableHandlingConverter()>
	//    2    4:return          
	}

	public String convert(ILoggingEvent iloggingevent)
	{
		return "";
	//    0    0:ldc1            #13  <String "">
	//    1    2:areturn         
	}

	public volatile String convert(Object obj)
	{
		return convert((ILoggingEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #16  <Class ILoggingEvent>
	//    3    5:invokevirtual   #18  <Method String convert(ILoggingEvent)>
	//    4    8:areturn         
	}
}
