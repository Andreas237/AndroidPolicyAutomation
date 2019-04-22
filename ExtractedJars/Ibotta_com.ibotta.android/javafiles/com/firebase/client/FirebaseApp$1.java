// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client;

import com.firebase.client.core.Repo;

// Referenced classes of package com.firebase.client:
//			FirebaseApp

class FirebaseApp$1
	implements Runnable
{

	public void run()
	{
		FirebaseApp.access$000(FirebaseApp.this).purgeOutstandingWrites();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field FirebaseApp this$0>
	//    2    4:invokestatic    #25  <Method Repo FirebaseApp.access$000(FirebaseApp)>
	//    3    7:invokevirtual   #28  <Method void Repo.purgeOutstandingWrites()>
	//    4   10:return          
	}

	final FirebaseApp this$0;

	FirebaseApp$1()
	{
		this$0 = FirebaseApp.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field FirebaseApp this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
