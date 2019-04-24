// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.util;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.status.StatusListener;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.util.OptionHelper;

public class StatusListenerConfigHelper
{

	public StatusListenerConfigHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	private static void addStatusListener(LoggerContext loggercontext, String s)
	{
		initListener(loggercontext, createListenerPerClassName(loggercontext, s));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokestatic    #15  <Method StatusListener createListenerPerClassName(LoggerContext, String)>
	//    4    6:invokestatic    #19  <Method void initListener(LoggerContext, StatusListener)>
	//    5    9:return          
	}

	private static StatusListener createListenerPerClassName(LoggerContext loggercontext, String s)
	{
		try
		{
			loggercontext = ((LoggerContext) ((StatusListener)OptionHelper.instantiateByClassName(s, ch/qos/logback/core/status/StatusListener, ((ch.qos.logback.core.Context) (loggercontext)))));
	//    0    0:aload_1         
	//    1    1:ldc1            #23  <Class StatusListener>
	//    2    3:aload_0         
	//    3    4:invokestatic    #29  <Method Object OptionHelper.instantiateByClassName(String, Class, ch.qos.logback.core.Context)>
	//    4    7:checkcast       #23  <Class StatusListener>
	//    5   10:astore_0        
		}
	//*   6   11:aload_0         
	//*   7   12:areturn         
		// Misplaced declaration of an exception variable
		catch(LoggerContext loggercontext)
	//*   8   13:astore_0        
		{
			((Exception) (loggercontext)).printStackTrace();
	//    9   14:aload_0         
	//   10   15:invokevirtual   #32  <Method void Exception.printStackTrace()>
			return null;
	//   11   18:aconst_null     
	//   12   19:areturn         
		}
		return ((StatusListener) (loggercontext));
	}

	private static void initListener(LoggerContext loggercontext, StatusListener statuslistener)
	{
		if(statuslistener != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          47
		{
			if(statuslistener instanceof ContextAware)
	//*   2    4:aload_1         
	//*   3    5:instanceof      #34  <Class ContextAware>
	//*   4    8:ifeq            21
				((ContextAware)statuslistener).setContext(((ch.qos.logback.core.Context) (loggercontext)));
	//    5   11:aload_1         
	//    6   12:checkcast       #34  <Class ContextAware>
	//    7   15:aload_0         
	//    8   16:invokeinterface #38  <Method void ContextAware.setContext(ch.qos.logback.core.Context)>
			if(statuslistener instanceof LifeCycle)
	//*   9   21:aload_1         
	//*  10   22:instanceof      #40  <Class LifeCycle>
	//*  11   25:ifeq            37
				((LifeCycle)statuslistener).start();
	//   12   28:aload_1         
	//   13   29:checkcast       #40  <Class LifeCycle>
	//   14   32:invokeinterface #43  <Method void LifeCycle.start()>
			loggercontext.getStatusManager().add(statuslistener);
	//   15   37:aload_0         
	//   16   38:invokevirtual   #49  <Method StatusManager LoggerContext.getStatusManager()>
	//   17   41:aload_1         
	//   18   42:invokeinterface #55  <Method void StatusManager.add(StatusListener)>
		}
	//   19   47:return          
	}

	static void installIfAsked(LoggerContext loggercontext)
	{
		String s = OptionHelper.getSystemProperty("logback.statusListenerClass");
	//    0    0:ldc1            #59  <String "logback.statusListenerClass">
	//    1    2:invokestatic    #63  <Method String OptionHelper.getSystemProperty(String)>
	//    2    5:astore_1        
		if(!OptionHelper.isEmpty(s))
	//*   3    6:aload_1         
	//*   4    7:invokestatic    #67  <Method boolean OptionHelper.isEmpty(String)>
	//*   5   10:ifne            18
			addStatusListener(loggercontext, s);
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:invokestatic    #69  <Method void addStatusListener(LoggerContext, String)>
	//    9   18:return          
	}
}
