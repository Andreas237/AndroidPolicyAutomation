// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.*;

// Referenced classes of package ch.qos.logback.classic.pattern:
//			ThrowableProxyConverter

public class ExtendedThrowableProxyConverter extends ThrowableProxyConverter
{

	public ExtendedThrowableProxyConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void ThrowableProxyConverter()>
	//    2    4:return          
	}

	protected void extraData(StringBuilder stringbuilder, StackTraceElementProxy stacktraceelementproxy)
	{
		ThrowableProxyUtil.subjoinPackagingData(stringbuilder, stacktraceelementproxy);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #16  <Method void ThrowableProxyUtil.subjoinPackagingData(StringBuilder, StackTraceElementProxy)>
	//    3    5:return          
	}

	protected void prepareLoggingEvent(ILoggingEvent iloggingevent)
	{
	//    0    0:return          
	}
}
