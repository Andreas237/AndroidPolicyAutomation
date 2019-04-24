// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;

// Referenced classes of package ch.qos.logback.classic.pattern:
//			NamedConverter

public class ClassOfCallerConverter extends NamedConverter
{

	public ClassOfCallerConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void NamedConverter()>
	//    2    4:return          
	}

	protected String getFullyQualifiedName(ILoggingEvent iloggingevent)
	{
		iloggingevent = ((ILoggingEvent) (iloggingevent.getCallerData()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #17  <Method StackTraceElement[] ILoggingEvent.getCallerData()>
	//    2    6:astore_1        
		if(iloggingevent != null && iloggingevent.length > 0)
	//*   3    7:aload_1         
	//*   4    8:ifnull          23
	//*   5   11:aload_1         
	//*   6   12:arraylength     
	//*   7   13:ifle            23
			return ((StackTraceElement) (iloggingevent[0])).getClassName();
	//    8   16:aload_1         
	//    9   17:iconst_0        
	//   10   18:aaload          
	//   11   19:invokevirtual   #23  <Method String StackTraceElement.getClassName()>
	//   12   22:areturn         
		else
			return "?";
	//   13   23:ldc1            #25  <String "?">
	//   14   25:areturn         
	}
}
