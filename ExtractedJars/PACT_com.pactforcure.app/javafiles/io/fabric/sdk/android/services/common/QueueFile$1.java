// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.common;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package io.fabric.sdk.android.services.common:
//			QueueFile

class QueueFile$1
	implements ementReader
{

	public void read(InputStream inputstream, int i)
		throws IOException
	{
		if(first)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field boolean first>
	//*   2    4:ifeq            22
			first = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #28  <Field boolean first>
		else
	//*   6   12:aload_0         
	//*   7   13:getfield        #23  <Field StringBuilder val$builder>
	//*   8   16:iload_2         
	//*   9   17:invokevirtual   #39  <Method StringBuilder StringBuilder.append(int)>
	//*  10   20:pop             
	//*  11   21:return          
			val$builder.append(", ");
	//   12   22:aload_0         
	//   13   23:getfield        #23  <Field StringBuilder val$builder>
	//   14   26:ldc1            #41  <String ", ">
	//   15   28:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
		val$builder.append(i);
	//*  17   32:goto            12
	}

	boolean first;
	final QueueFile this$0;
	final StringBuilder val$builder;

	QueueFile$1()
	{
		this$0 = final_queuefile;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field QueueFile this$0>
		val$builder = StringBuilder.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field StringBuilder val$builder>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #26  <Method void Object()>
		first = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #28  <Field boolean first>
	//   11   19:return          
	}
}
