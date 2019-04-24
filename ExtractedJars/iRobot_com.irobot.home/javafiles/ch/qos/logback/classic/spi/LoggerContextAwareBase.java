// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.spi.ContextAwareBase;

// Referenced classes of package ch.qos.logback.classic.spi:
//			LoggerContextAware

public class LoggerContextAwareBase extends ContextAwareBase
	implements LoggerContextAware
{

	public LoggerContextAwareBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void ContextAwareBase()>
	//    2    4:return          
	}

	public LoggerContext getLoggerContext()
	{
		return (LoggerContext)context;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Context context>
	//    2    4:checkcast       #19  <Class LoggerContext>
	//    3    7:areturn         
	}

	public void setContext(Context context)
	{
		if(!(context instanceof LoggerContext) && context != null)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #19  <Class LoggerContext>
	//*   2    4:ifne            24
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       14
	//*   5   11:goto            24
		{
			throw new IllegalArgumentException("LoggerContextAwareBase only accepts contexts of type c.l.classic.LoggerContext");
	//    6   14:new             #23  <Class IllegalArgumentException>
	//    7   17:dup             
	//    8   18:ldc1            #25  <String "LoggerContextAwareBase only accepts contexts of type c.l.classic.LoggerContext">
	//    9   20:invokespecial   #28  <Method void IllegalArgumentException(String)>
	//   10   23:athrow          
		} else
		{
			super.setContext(context);
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:invokespecial   #30  <Method void ContextAwareBase.setContext(Context)>
			return;
	//   14   29:return          
		}
	}

	public void setLoggerContext(LoggerContext loggercontext)
	{
		super.setContext(((Context) (loggercontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #30  <Method void ContextAwareBase.setContext(Context)>
	//    3    5:return          
	}
}
