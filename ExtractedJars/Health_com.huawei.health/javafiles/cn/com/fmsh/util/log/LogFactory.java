// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.util.log;


// Referenced classes of package cn.com.fmsh.util.log:
//			FMLog

public class LogFactory
{

	private LogFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		log = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #14  <Field FMLog log>
	//    5    9:return          
	}

	public static LogFactory getInstance()
	{
		if(instance == null)
	//*   0    0:getstatic       #19  <Field LogFactory instance>
	//*   1    3:ifnonnull       16
			instance = new LogFactory();
	//    2    6:new             #2   <Class LogFactory>
	//    3    9:dup             
	//    4   10:invokespecial   #20  <Method void LogFactory()>
	//    5   13:putstatic       #19  <Field LogFactory instance>
		return instance;
	//    6   16:getstatic       #19  <Field LogFactory instance>
	//    7   19:areturn         
	}

	public FMLog getLog()
	{
		return log;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FMLog log>
	//    2    4:areturn         
	}

	public void setLog(FMLog fmlog)
	{
		log = fmlog;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field FMLog log>
	//    3    5:return          
	}

	private static LogFactory instance;
	private FMLog log;
}
