// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;

// Referenced classes of package ch.qos.logback.classic.pattern:
//			ClassicConverter

public class MarkerConverter extends ClassicConverter
{

	public MarkerConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ClassicConverter()>
	//    2    4:return          
	}

	public String convert(ILoggingEvent iloggingevent)
	{
		iloggingevent = ((ILoggingEvent) (iloggingevent.getMarker()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #22  <Method org.slf4j.Marker ILoggingEvent.getMarker()>
	//    2    6:astore_1        
		if(iloggingevent == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       15
			return EMPTY;
	//    5   11:getstatic       #24  <Field String EMPTY>
	//    6   14:areturn         
		else
			return ((Object) (iloggingevent)).toString();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #30  <Method String Object.toString()>
	//    9   19:areturn         
	}

	public volatile String convert(Object obj)
	{
		return convert((ILoggingEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #18  <Class ILoggingEvent>
	//    3    5:invokevirtual   #33  <Method String convert(ILoggingEvent)>
	//    4    8:areturn         
	}

	private static String EMPTY = "";

	static 
	{
	//    0    0:return          
	}
}
