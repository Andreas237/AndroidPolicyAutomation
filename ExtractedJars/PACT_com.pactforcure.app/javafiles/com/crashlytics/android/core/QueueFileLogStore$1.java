// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.crashlytics.android.core:
//			QueueFileLogStore

class QueueFileLogStore$1
	implements io.fabric.sdk.android.services.common.der
{

	public void read(InputStream inputstream, int i)
		throws IOException
	{
		int ai[];
		inputstream.read(val$logBytes, val$offsetHolder[0], i);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #23  <Field byte[] val$logBytes>
	//    3    5:aload_0         
	//    4    6:getfield        #25  <Field int[] val$offsetHolder>
	//    5    9:iconst_0        
	//    6   10:iaload          
	//    7   11:iload_2         
	//    8   12:invokevirtual   #38  <Method int InputStream.read(byte[], int, int)>
	//    9   15:pop             
		ai = val$offsetHolder;
	//   10   16:aload_0         
	//   11   17:getfield        #25  <Field int[] val$offsetHolder>
	//   12   20:astore_3        
		ai[0] = ai[0] + i;
	//   13   21:aload_3         
	//   14   22:iconst_0        
	//   15   23:aload_3         
	//   16   24:iconst_0        
	//   17   25:iaload          
	//   18   26:iload_2         
	//   19   27:iadd            
	//   20   28:iastore         
		inputstream.close();
	//   21   29:aload_1         
	//   22   30:invokevirtual   #41  <Method void InputStream.close()>
		return;
	//   23   33:return          
		Exception exception;
		exception;
	//   24   34:astore_3        
		inputstream.close();
	//   25   35:aload_1         
	//   26   36:invokevirtual   #41  <Method void InputStream.close()>
		throw exception;
	//   27   39:aload_3         
	//   28   40:athrow          
	}

	final QueueFileLogStore this$0;
	final byte val$logBytes[];
	final int val$offsetHolder[];

	QueueFileLogStore$1()
	{
		this$0 = final_queuefilelogstore;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field QueueFileLogStore this$0>
		val$logBytes = abyte0;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field byte[] val$logBytes>
		val$offsetHolder = _5B_I.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field int[] val$offsetHolder>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
