// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.selector;

import ch.qos.logback.classic.LoggerContext;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package ch.qos.logback.classic.selector:
//			ContextSelector

public class DefaultContextSelector
	implements ContextSelector
{

	public DefaultContextSelector(LoggerContext loggercontext)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		defaultLoggerContext = loggercontext;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field LoggerContext defaultLoggerContext>
	//    5    9:return          
	}

	public LoggerContext detachLoggerContext(String s)
	{
		return defaultLoggerContext;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field LoggerContext defaultLoggerContext>
	//    2    4:areturn         
	}

	public List getContextNames()
	{
		return Arrays.asList(((Object []) (new String[] {
			defaultLoggerContext.getName()
		})));
	//    0    0:iconst_1        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #15  <Field LoggerContext defaultLoggerContext>
	//    6   10:invokevirtual   #28  <Method String LoggerContext.getName()>
	//    7   13:aastore         
	//    8   14:invokestatic    #34  <Method List Arrays.asList(Object[])>
	//    9   17:areturn         
	}

	public LoggerContext getDefaultLoggerContext()
	{
		return defaultLoggerContext;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field LoggerContext defaultLoggerContext>
	//    2    4:areturn         
	}

	public LoggerContext getLoggerContext()
	{
		return getDefaultLoggerContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method LoggerContext getDefaultLoggerContext()>
	//    2    4:areturn         
	}

	public LoggerContext getLoggerContext(String s)
	{
		if(defaultLoggerContext.getName().equals(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field LoggerContext defaultLoggerContext>
	//*   2    4:invokevirtual   #28  <Method String LoggerContext.getName()>
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #45  <Method boolean String.equals(Object)>
	//*   5   11:ifeq            19
			return defaultLoggerContext;
	//    6   14:aload_0         
	//    7   15:getfield        #15  <Field LoggerContext defaultLoggerContext>
	//    8   18:areturn         
		else
			return null;
	//    9   19:aconst_null     
	//   10   20:areturn         
	}

	private LoggerContext defaultLoggerContext;
}
