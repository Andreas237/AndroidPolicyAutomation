// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client;

import com.firebase.client.core.Repo;

// Referenced classes of package com.firebase.client:
//			Firebase

class Firebase$5
	implements Runnable
{

	public void run()
	{
		repo.setHijackHash(val$hijackHash);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Firebase this$0>
	//    2    4:getfield        #30  <Field Repo Firebase.repo>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field boolean val$hijackHash>
	//    5   11:invokevirtual   #33  <Method void Repo.setHijackHash(boolean)>
	//    6   14:return          
	}

	final Firebase this$0;
	final boolean val$hijackHash;

	Firebase$5()
	{
		this$0 = final_firebase;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field Firebase this$0>
		val$hijackHash = Z.this;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #21  <Field boolean val$hijackHash>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
