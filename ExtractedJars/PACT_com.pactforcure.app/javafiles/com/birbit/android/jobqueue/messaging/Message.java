// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.messaging;


// Referenced classes of package com.birbit.android.jobqueue.messaging:
//			Type

public abstract class Message
{

	protected Message(Type type1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		readyNs = 0x0L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #16  <Long 0x0L>
	//    4    8:putfield        #19  <Field long readyNs>
		type = type1;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #21  <Field Type type>
	//    8   16:return          
	}

	protected abstract void onRecycled();

	final void recycle()
	{
		next = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #26  <Field Message next>
		readyNs = 0x0L;
	//    3    5:aload_0         
	//    4    6:ldc2w           #16  <Long 0x0L>
	//    5    9:putfield        #19  <Field long readyNs>
		onRecycled();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #28  <Method void onRecycled()>
	//    8   16:return          
	}

	Message next;
	public long readyNs;
	public final Type type;
}
