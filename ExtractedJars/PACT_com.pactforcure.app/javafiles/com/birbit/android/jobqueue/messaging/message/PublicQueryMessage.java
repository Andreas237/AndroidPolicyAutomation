// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.messaging.message;

import com.birbit.android.jobqueue.IntCallback;
import com.birbit.android.jobqueue.messaging.Message;
import com.birbit.android.jobqueue.messaging.Type;

public class PublicQueryMessage extends Message
	implements com.birbit.android.jobqueue.IntCallback.MessageWithCallback
{

	public PublicQueryMessage()
	{
		super(Type.PUBLIC_QUERY);
	//    0    0:aload_0         
	//    1    1:getstatic       #38  <Field Type Type.PUBLIC_QUERY>
	//    2    4:invokespecial   #41  <Method void Message(Type)>
		what = -1;
	//    3    7:aload_0         
	//    4    8:iconst_m1       
	//    5    9:putfield        #43  <Field int what>
	//    6   12:return          
	}

	public IntCallback getCallback()
	{
		return callback;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field IntCallback callback>
	//    2    4:areturn         
	}

	public String getStringArg()
	{
		return stringArg;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field String stringArg>
	//    2    4:areturn         
	}

	public int getWhat()
	{
		return what;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int what>
	//    2    4:ireturn         
	}

	protected void onRecycled()
	{
		callback = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #48  <Field IntCallback callback>
		what = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #43  <Field int what>
	//    6   10:return          
	}

	public void set(int i, IntCallback intcallback)
	{
		callback = intcallback;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #48  <Field IntCallback callback>
		what = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #43  <Field int what>
	//    6   10:return          
	}

	public void set(int i, String s, IntCallback intcallback)
	{
		what = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #43  <Field int what>
		stringArg = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #52  <Field String stringArg>
		callback = intcallback;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #48  <Field IntCallback callback>
	//    9   15:return          
	}

	public void setCallback(IntCallback intcallback)
	{
		callback = intcallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #48  <Field IntCallback callback>
	//    3    5:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append("PublicQuery[").append(what).append("]").toString();
	//    0    0:new             #63  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #65  <Method void StringBuilder()>
	//    3    7:ldc1            #67  <String "PublicQuery[">
	//    4    9:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #43  <Field int what>
	//    7   16:invokevirtual   #74  <Method StringBuilder StringBuilder.append(int)>
	//    8   19:ldc1            #76  <String "]">
	//    9   21:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   11   27:areturn         
	}

	public static final int ACTIVE_CONSUMER_COUNT = 6;
	public static final int CLEAR = 5;
	public static final int COUNT = 0;
	public static final int COUNT_READY = 1;
	public static final int INTERNAL_RUNNABLE = 101;
	public static final int JOB_STATUS = 4;
	public static final int SCHEDULER_START = 7;
	public static final int START = 2;
	public static final int STOP = 3;
	private IntCallback callback;
	private String stringArg;
	private int what;
}
