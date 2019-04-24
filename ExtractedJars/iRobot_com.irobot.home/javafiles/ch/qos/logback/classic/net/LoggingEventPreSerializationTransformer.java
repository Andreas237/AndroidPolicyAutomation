// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.net;

import ch.qos.logback.classic.spi.*;
import ch.qos.logback.core.spi.PreSerializationTransformer;
import java.io.Serializable;

public class LoggingEventPreSerializationTransformer
	implements PreSerializationTransformer
{

	public LoggingEventPreSerializationTransformer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public Serializable transform(ILoggingEvent iloggingevent)
	{
		if(iloggingevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(iloggingevent instanceof LoggingEvent)
	//*   4    6:aload_1         
	//*   5    7:instanceof      #16  <Class LoggingEvent>
	//*   6   10:ifeq            18
			return ((Serializable) (LoggingEventVO.build(iloggingevent)));
	//    7   13:aload_1         
	//    8   14:invokestatic    #22  <Method LoggingEventVO LoggingEventVO.build(ILoggingEvent)>
	//    9   17:areturn         
		if(iloggingevent instanceof LoggingEventVO)
	//*  10   18:aload_1         
	//*  11   19:instanceof      #18  <Class LoggingEventVO>
	//*  12   22:ifeq            30
		{
			return ((Serializable) ((LoggingEventVO)iloggingevent));
	//   13   25:aload_1         
	//   14   26:checkcast       #18  <Class LoggingEventVO>
	//   15   29:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   16   30:new             #24  <Class StringBuilder>
	//   17   33:dup             
	//   18   34:invokespecial   #25  <Method void StringBuilder()>
	//   19   37:astore_2        
			stringbuilder.append("Unsupported type ");
	//   20   38:aload_2         
	//   21   39:ldc1            #27  <String "Unsupported type ">
	//   22   41:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
			stringbuilder.append(((Object) (iloggingevent)).getClass().getName());
	//   24   45:aload_2         
	//   25   46:aload_1         
	//   26   47:invokevirtual   #35  <Method Class Object.getClass()>
	//   27   50:invokevirtual   #41  <Method String Class.getName()>
	//   28   53:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   29   56:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   30   57:new             #43  <Class IllegalArgumentException>
	//   31   60:dup             
	//   32   61:aload_2         
	//   33   62:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   34   65:invokespecial   #49  <Method void IllegalArgumentException(String)>
	//   35   68:athrow          
		}
	}

	public volatile Serializable transform(Object obj)
	{
		return transform((ILoggingEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #52  <Class ILoggingEvent>
	//    3    5:invokevirtual   #54  <Method Serializable transform(ILoggingEvent)>
	//    4    8:areturn         
	}
}
