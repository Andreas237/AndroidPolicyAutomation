// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.persistentQueue.sqlite;


// Referenced classes of package com.birbit.android.jobqueue.persistentQueue.sqlite:
//			SqliteJobQueue

static class SqliteJobQueue$InvalidJobException extends Exception
{

	SqliteJobQueue$InvalidJobException(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void Exception(String)>
	//    3    5:return          
	}

	SqliteJobQueue$InvalidJobException(String s, Throwable throwable)
	{
		super(s, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #15  <Method void Exception(String, Throwable)>
	//    4    6:return          
	}
}
