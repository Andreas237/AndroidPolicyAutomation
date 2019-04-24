// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.persistentQueue.sqlite;


// Referenced classes of package com.birbit.android.jobqueue.persistentQueue.sqlite:
//			SqlHelper

public static class SqlHelper$ForeignKey
{

	final String targetFieldName;
	final String targetTable;

	public SqlHelper$ForeignKey(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		targetTable = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field String targetTable>
		targetFieldName = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field String targetFieldName>
	//    8   14:return          
	}
}
