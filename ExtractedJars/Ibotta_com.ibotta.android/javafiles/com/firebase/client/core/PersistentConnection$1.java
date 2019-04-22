// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;


// Referenced classes of package com.firebase.client.core:
//			PersistentConnection

class PersistentConnection$1
	implements Runnable
{

	public void run()
	{
		establishConnection();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field PersistentConnection this$0>
	//    2    4:invokevirtual   #25  <Method void PersistentConnection.establishConnection()>
	//    3    7:return          
	}

	final PersistentConnection this$0;

	PersistentConnection$1()
	{
		this$0 = PersistentConnection.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field PersistentConnection this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
