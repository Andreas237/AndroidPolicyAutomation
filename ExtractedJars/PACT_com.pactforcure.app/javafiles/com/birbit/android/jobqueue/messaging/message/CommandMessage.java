// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.messaging.message;

import com.birbit.android.jobqueue.messaging.Message;
import com.birbit.android.jobqueue.messaging.Type;

public class CommandMessage extends Message
{

	public CommandMessage()
	{
		super(Type.COMMAND);
	//    0    0:aload_0         
	//    1    1:getstatic       #22  <Field Type Type.COMMAND>
	//    2    4:invokespecial   #25  <Method void Message(Type)>
	//    3    7:return          
	}

	public Runnable getRunnable()
	{
		return runnable;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Runnable runnable>
	//    2    4:areturn         
	}

	public int getWhat()
	{
		return what;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int what>
	//    2    4:ireturn         
	}

	protected void onRecycled()
	{
		what = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #34  <Field int what>
		runnable = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #30  <Field Runnable runnable>
	//    6   10:return          
	}

	public void set(int i)
	{
		what = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #34  <Field int what>
	//    3    5:return          
	}

	public void setRunnable(Runnable runnable1)
	{
		runnable = runnable1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field Runnable runnable>
	//    3    5:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append("Command[").append(what).append("]").toString();
	//    0    0:new             #43  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #45  <Method void StringBuilder()>
	//    3    7:ldc1            #47  <String "Command[">
	//    4    9:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #34  <Field int what>
	//    7   16:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//    8   19:ldc1            #56  <String "]">
	//    9   21:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   11   27:areturn         
	}

	public static final int POKE = 2;
	public static final int QUIT = 1;
	public static final int RUNNABLE = 3;
	private Runnable runnable;
	private int what;
}
