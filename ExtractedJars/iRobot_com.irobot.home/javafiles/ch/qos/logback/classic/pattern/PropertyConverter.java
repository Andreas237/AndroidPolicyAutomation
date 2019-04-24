// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.LoggerContextVO;
import java.util.Map;

// Referenced classes of package ch.qos.logback.classic.pattern:
//			ClassicConverter

public final class PropertyConverter extends ClassicConverter
{

	public PropertyConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void ClassicConverter()>
	//    2    4:return          
	}

	public String convert(ILoggingEvent iloggingevent)
	{
		if(key == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field String key>
	//*   2    4:ifnonnull       10
			return "Property_HAS_NO_KEY";
	//    3    7:ldc1            #17  <String "Property_HAS_NO_KEY">
	//    4    9:areturn         
		iloggingevent = ((ILoggingEvent) ((String)iloggingevent.getLoggerContextVO().getPropertyMap().get(((Object) (key)))));
	//    5   10:aload_1         
	//    6   11:invokeinterface #23  <Method LoggerContextVO ILoggingEvent.getLoggerContextVO()>
	//    7   16:invokevirtual   #29  <Method Map LoggerContextVO.getPropertyMap()>
	//    8   19:aload_0         
	//    9   20:getfield        #15  <Field String key>
	//   10   23:invokeinterface #35  <Method Object Map.get(Object)>
	//   11   28:checkcast       #37  <Class String>
	//   12   31:astore_1        
		if(iloggingevent != null)
	//*  13   32:aload_1         
	//*  14   33:ifnull          38
			return ((String) (iloggingevent));
	//   15   36:aload_1         
	//   16   37:areturn         
		else
			return System.getProperty(key);
	//   17   38:aload_0         
	//   18   39:getfield        #15  <Field String key>
	//   19   42:invokestatic    #43  <Method String System.getProperty(String)>
	//   20   45:areturn         
	}

	public volatile String convert(Object obj)
	{
		return convert((ILoggingEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #19  <Class ILoggingEvent>
	//    3    5:invokevirtual   #46  <Method String convert(ILoggingEvent)>
	//    4    8:areturn         
	}

	public void start()
	{
		String s = getFirstOption();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #51  <Method String getFirstOption()>
	//    2    4:astore_1        
		if(s != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
		{
			key = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #15  <Field String key>
			super.start();
	//    8   14:aload_0         
	//    9   15:invokespecial   #53  <Method void ClassicConverter.start()>
		}
	//   10   18:return          
	}

	String key;
}
