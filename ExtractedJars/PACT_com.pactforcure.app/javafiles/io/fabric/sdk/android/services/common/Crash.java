// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.common;


public abstract class Crash
{
	public static class FatalException extends Crash
	{

		public FatalException(String s)
		{
			super(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #9   <Method void Crash(String)>
		//    3    5:return          
		}

		public FatalException(String s, String s1)
		{
			super(s, s1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #13  <Method void Crash(String, String)>
		//    4    6:return          
		}
	}

	public static class LoggedException extends Crash
	{

		public LoggedException(String s)
		{
			super(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #9   <Method void Crash(String)>
		//    3    5:return          
		}

		public LoggedException(String s, String s1)
		{
			super(s, s1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #13  <Method void Crash(String, String)>
		//    4    6:return          
		}
	}


	public Crash(String s)
	{
		this(s, "<unknown>");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #14  <String "<unknown>">
	//    3    4:invokespecial   #21  <Method void Crash(String, String)>
	//    4    7:return          
	}

	public Crash(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		sessionId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field String sessionId>
		exceptionName = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #29  <Field String exceptionName>
	//    8   14:return          
	}

	public String getExceptionName()
	{
		return exceptionName;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String exceptionName>
	//    2    4:areturn         
	}

	public String getSessionId()
	{
		return sessionId;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String sessionId>
	//    2    4:areturn         
	}

	private static final String UNKNOWN_EXCEPTION = "<unknown>";
	private final String exceptionName;
	private final String sessionId;
}
