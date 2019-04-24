// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.logger;


// Referenced classes of package co.touchlab.squeaky.logger:
//			AndroidLog, OLogImpl

public class OLog
{

	public OLog()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public static void d(String s, String s1)
	{
		log.d(s, s1);
	//    0    0:getstatic       #15  <Field OLogImpl log>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #23  <Method void OLogImpl.d(String, String)>
	//    4   10:return          
	}

	public static void d(String s, String s1, Throwable throwable)
	{
		log.d(s, s1, throwable);
	//    0    0:getstatic       #15  <Field OLogImpl log>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #26  <Method void OLogImpl.d(String, String, Throwable)>
	//    5   11:return          
	}

	public static void e(String s, String s1)
	{
		log.e(s, s1);
	//    0    0:getstatic       #15  <Field OLogImpl log>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #29  <Method void OLogImpl.e(String, String)>
	//    4   10:return          
	}

	public static void e(String s, String s1, Throwable throwable)
	{
		log.e(s, s1, throwable);
	//    0    0:getstatic       #15  <Field OLogImpl log>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #31  <Method void OLogImpl.e(String, String, Throwable)>
	//    5   11:return          
	}

	public static void i(String s, String s1)
	{
		log.i(s, s1);
	//    0    0:getstatic       #15  <Field OLogImpl log>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #34  <Method void OLogImpl.i(String, String)>
	//    4   10:return          
	}

	public static void i(String s, String s1, Throwable throwable)
	{
		log.i(s, s1, throwable);
	//    0    0:getstatic       #15  <Field OLogImpl log>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #36  <Method void OLogImpl.i(String, String, Throwable)>
	//    5   11:return          
	}

	public static void setLog(OLogImpl ologimpl)
	{
		log = ologimpl;
	//    0    0:aload_0         
	//    1    1:putstatic       #15  <Field OLogImpl log>
	//    2    4:return          
	}

	public static void w(String s, String s1)
	{
		log.w(s, s1);
	//    0    0:getstatic       #15  <Field OLogImpl log>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #41  <Method void OLogImpl.w(String, String)>
	//    4   10:return          
	}

	public static void w(String s, String s1, Throwable throwable)
	{
		log.w(s, s1, throwable);
	//    0    0:getstatic       #15  <Field OLogImpl log>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #43  <Method void OLogImpl.w(String, String, Throwable)>
	//    5   11:return          
	}

	private static OLogImpl log = new AndroidLog();

	static 
	{
	//    0    0:new             #10  <Class AndroidLog>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void AndroidLog()>
	//    3    7:putstatic       #15  <Field OLogImpl log>
	//*   4   10:return          
	}
}
