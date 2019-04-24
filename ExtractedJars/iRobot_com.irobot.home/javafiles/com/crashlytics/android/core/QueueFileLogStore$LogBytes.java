// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;


// Referenced classes of package com.crashlytics.android.core:
//			QueueFileLogStore

public class QueueFileLogStore$LogBytes
{

	public final byte bytes[];
	public final int offset;
	final QueueFileLogStore this$0;

	public QueueFileLogStore$LogBytes(byte abyte0[], int i)
	{
		this$0 = QueueFileLogStore.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field QueueFileLogStore this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
		bytes = abyte0;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field byte[] bytes>
		offset = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #24  <Field int offset>
	//   11   19:return          
	}
}
