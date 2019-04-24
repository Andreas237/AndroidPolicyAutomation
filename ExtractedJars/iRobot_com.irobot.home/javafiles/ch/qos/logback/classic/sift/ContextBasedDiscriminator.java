// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.sift;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.LoggerContextVO;
import ch.qos.logback.core.sift.AbstractDiscriminator;

public class ContextBasedDiscriminator extends AbstractDiscriminator
{

	public ContextBasedDiscriminator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void AbstractDiscriminator()>
	//    2    4:return          
	}

	public String getDefaultValue()
	{
		return defaultValue;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String defaultValue>
	//    2    4:areturn         
	}

	public String getDiscriminatingValue(ILoggingEvent iloggingevent)
	{
		String s = iloggingevent.getLoggerContextVO().getName();
	//    0    0:aload_1         
	//    1    1:invokeinterface #27  <Method LoggerContextVO ILoggingEvent.getLoggerContextVO()>
	//    2    6:invokevirtual   #32  <Method String LoggerContextVO.getName()>
	//    3    9:astore_2        
		iloggingevent = ((ILoggingEvent) (s));
	//    4   10:aload_2         
	//    5   11:astore_1        
		if(s == null)
	//*   6   12:aload_2         
	//*   7   13:ifnonnull       21
			iloggingevent = ((ILoggingEvent) (defaultValue));
	//    8   16:aload_0         
	//    9   17:getfield        #19  <Field String defaultValue>
	//   10   20:astore_1        
		return ((String) (iloggingevent));
	//   11   21:aload_1         
	//   12   22:areturn         
	}

	public volatile String getDiscriminatingValue(Object obj)
	{
		return getDiscriminatingValue((ILoggingEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #23  <Class ILoggingEvent>
	//    3    5:invokevirtual   #35  <Method String getDiscriminatingValue(ILoggingEvent)>
	//    4    8:areturn         
	}

	public String getKey()
	{
		return "contextName";
	//    0    0:ldc1            #9   <String "contextName">
	//    1    2:areturn         
	}

	public void setDefaultValue(String s)
	{
		defaultValue = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field String defaultValue>
	//    3    5:return          
	}

	public void setKey(String s)
	{
		throw new UnsupportedOperationException("Key cannot be set. Using fixed key contextName");
	//    0    0:new             #41  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #43  <String "Key cannot be set. Using fixed key contextName">
	//    3    6:invokespecial   #45  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	private static final String KEY = "contextName";
	private String defaultValue;
}
