// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.log;


// Referenced classes of package com.itextpdf.text.log:
//			NoOpLogger, Logger

public class LoggerFactory
{

	private LoggerFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		logger = ((Logger) (new NoOpLogger()));
	//    2    4:aload_0         
	//    3    5:new             #19  <Class NoOpLogger>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void NoOpLogger()>
	//    6   12:putfield        #22  <Field Logger logger>
	//    7   15:return          
	}

	public static LoggerFactory getInstance()
	{
		return myself;
	//    0    0:getstatic       #15  <Field LoggerFactory myself>
	//    1    3:areturn         
	}

	public static Logger getLogger(Class class1)
	{
		return myself.logger.getLogger(class1);
	//    0    0:getstatic       #15  <Field LoggerFactory myself>
	//    1    3:getfield        #22  <Field Logger logger>
	//    2    6:aload_0         
	//    3    7:invokeinterface #30  <Method Logger Logger.getLogger(Class)>
	//    4   12:areturn         
	}

	public static Logger getLogger(String s)
	{
		return myself.logger.getLogger(s);
	//    0    0:getstatic       #15  <Field LoggerFactory myself>
	//    1    3:getfield        #22  <Field Logger logger>
	//    2    6:aload_0         
	//    3    7:invokeinterface #35  <Method Logger Logger.getLogger(String)>
	//    4   12:areturn         
	}

	public Logger logger()
	{
		return logger;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Logger logger>
	//    2    4:areturn         
	}

	public void setLogger(Logger logger1)
	{
		logger = logger1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field Logger logger>
	//    3    5:return          
	}

	private static LoggerFactory myself = new LoggerFactory();
	private Logger logger;

	static 
	{
	//    0    0:new             #2   <Class LoggerFactory>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void LoggerFactory()>
	//    3    7:putstatic       #15  <Field LoggerFactory myself>
	//*   4   10:return          
	}
}
