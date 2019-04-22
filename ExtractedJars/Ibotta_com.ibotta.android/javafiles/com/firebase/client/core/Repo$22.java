// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.FirebaseError;

// Referenced classes of package com.firebase.client.core:
//			Repo

class Repo$22
	implements Runnable
{

	public void run()
	{
		nsactionData.access._mth2100(val$transaction).onComplete(val$abortError, false, ((com.firebase.client.DataSnapshot) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Repo$TransactionData val$transaction>
	//    2    4:invokestatic    #36  <Method com.firebase.client.Transaction$Handler Repo$TransactionData.access$2100(Repo$TransactionData)>
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field FirebaseError val$abortError>
	//    5   11:iconst_0        
	//    6   12:aconst_null     
	//    7   13:invokeinterface #42  <Method void com.firebase.client.Transaction$Handler.onComplete(FirebaseError, boolean, com.firebase.client.DataSnapshot)>
	//    8   18:return          
	}

	final Repo this$0;
	final FirebaseError val$abortError;
	final nsactionData val$transaction;

	Repo$22()
	{
		this$0 = final_repo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field Repo this$0>
		val$transaction = nsactiondata;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field Repo$TransactionData val$transaction>
		val$abortError = FirebaseError.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field FirebaseError val$abortError>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
