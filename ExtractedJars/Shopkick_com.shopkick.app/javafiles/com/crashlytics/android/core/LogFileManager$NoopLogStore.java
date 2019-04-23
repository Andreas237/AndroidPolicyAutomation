// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;


// Referenced classes of package com.crashlytics.android.core:
//			FileLogStore, LogFileManager, ByteString

private static final class LogFileManager$NoopLogStore
	implements FileLogStore
{

	public void closeLogFile()
	{
	//    0    0:return          
	}

	public void deleteLogFile()
	{
	//    0    0:return          
	}

	public ByteString getLogAsByteString()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public byte[] getLogAsBytes()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void writeToLog(long l, String s)
	{
	//    0    0:return          
	}

	private LogFileManager$NoopLogStore()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	LogFileManager$NoopLogStore(LogFileManager._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void LogFileManager$NoopLogStore()>
	//    2    4:return          
	}
}
