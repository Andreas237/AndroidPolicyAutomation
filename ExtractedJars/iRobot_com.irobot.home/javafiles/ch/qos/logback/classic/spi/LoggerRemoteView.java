// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.LoggerContext;
import java.io.Serializable;

// Referenced classes of package ch.qos.logback.classic.spi:
//			LoggerContextVO

public class LoggerRemoteView
	implements Serializable
{

	public LoggerRemoteView(String s, LoggerContext loggercontext)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field String name>
		loggerContextView = loggercontext.getLoggerContextRemoteView();
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #32  <Method LoggerContextVO LoggerContext.getLoggerContextRemoteView()>
	//    8   14:putfield        #34  <Field LoggerContextVO loggerContextView>
	//    9   17:return          
	}

	public LoggerContextVO getLoggerContextView()
	{
		return loggerContextView;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field LoggerContextVO loggerContextView>
	//    2    4:areturn         
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String name>
	//    2    4:areturn         
	}

	static final boolean $assertionsDisabled = false;
	private static final long serialVersionUID = 0x9d9f4ae0L;
	final LoggerContextVO loggerContextView;
	final String name;

	static 
	{
	//    0    0:return          
	}
}
