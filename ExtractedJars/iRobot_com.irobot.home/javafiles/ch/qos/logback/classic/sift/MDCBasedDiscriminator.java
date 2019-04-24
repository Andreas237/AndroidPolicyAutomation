// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.sift;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.sift.AbstractDiscriminator;
import ch.qos.logback.core.util.OptionHelper;
import java.util.Map;

public class MDCBasedDiscriminator extends AbstractDiscriminator
{

	public MDCBasedDiscriminator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void AbstractDiscriminator()>
	//    2    4:return          
	}

	public String getDefaultValue()
	{
		return defaultValue;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field String defaultValue>
	//    2    4:areturn         
	}

	public String getDiscriminatingValue(ILoggingEvent iloggingevent)
	{
		iloggingevent = ((ILoggingEvent) (iloggingevent.getMDCPropertyMap()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #25  <Method Map ILoggingEvent.getMDCPropertyMap()>
	//    2    6:astore_1        
		if(iloggingevent == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       16
			return defaultValue;
	//    5   11:aload_0         
	//    6   12:getfield        #17  <Field String defaultValue>
	//    7   15:areturn         
		String s = (String)((Map) (iloggingevent)).get(((Object) (key)));
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #27  <Field String key>
	//   11   21:invokeinterface #33  <Method Object Map.get(Object)>
	//   12   26:checkcast       #35  <Class String>
	//   13   29:astore_2        
		iloggingevent = ((ILoggingEvent) (s));
	//   14   30:aload_2         
	//   15   31:astore_1        
		if(s == null)
	//*  16   32:aload_2         
	//*  17   33:ifnonnull       41
			iloggingevent = ((ILoggingEvent) (defaultValue));
	//   18   36:aload_0         
	//   19   37:getfield        #17  <Field String defaultValue>
	//   20   40:astore_1        
		return ((String) (iloggingevent));
	//   21   41:aload_1         
	//   22   42:areturn         
	}

	public volatile String getDiscriminatingValue(Object obj)
	{
		return getDiscriminatingValue((ILoggingEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #21  <Class ILoggingEvent>
	//    3    5:invokevirtual   #38  <Method String getDiscriminatingValue(ILoggingEvent)>
	//    4    8:areturn         
	}

	public String getKey()
	{
		return key;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String key>
	//    2    4:areturn         
	}

	public void setDefaultValue(String s)
	{
		defaultValue = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field String defaultValue>
	//    3    5:return          
	}

	public void setKey(String s)
	{
		key = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field String key>
	//    3    5:return          
	}

	public void start()
	{
		int i;
		if(OptionHelper.isEmpty(key))
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field String key>
	//*   2    4:invokestatic    #49  <Method boolean OptionHelper.isEmpty(String)>
	//*   3    7:ifeq            21
		{
			addError("The \"Key\" property must be set");
	//    4   10:aload_0         
	//    5   11:ldc1            #51  <String "The \"Key\" property must be set">
	//    6   13:invokevirtual   #54  <Method void addError(String)>
			i = 1;
	//    7   16:iconst_1        
	//    8   17:istore_1        
		} else
	//*   9   18:goto            23
		{
			i = 0;
	//   10   21:iconst_0        
	//   11   22:istore_1        
		}
		int j = i;
	//   12   23:iload_1         
	//   13   24:istore_2        
		if(OptionHelper.isEmpty(defaultValue))
	//*  14   25:aload_0         
	//*  15   26:getfield        #17  <Field String defaultValue>
	//*  16   29:invokestatic    #49  <Method boolean OptionHelper.isEmpty(String)>
	//*  17   32:ifeq            45
		{
			j = i + 1;
	//   18   35:iload_1         
	//   19   36:iconst_1        
	//   20   37:iadd            
	//   21   38:istore_2        
			addError("The \"DefaultValue\" property must be set");
	//   22   39:aload_0         
	//   23   40:ldc1            #56  <String "The \"DefaultValue\" property must be set">
	//   24   42:invokevirtual   #54  <Method void addError(String)>
		}
		if(j == 0)
	//*  25   45:iload_2         
	//*  26   46:ifne            54
			started = true;
	//   27   49:aload_0         
	//   28   50:iconst_1        
	//   29   51:putfield        #60  <Field boolean started>
	//   30   54:return          
	}

	private String defaultValue;
	private String key;
}
