// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.DataSnapshot;
import com.firebase.client.FirebaseError;

// Referenced classes of package com.firebase.client.core:
//			Repo

class Repo$18
	implements Runnable
{

	public void run()
	{
		nsactionData.access._mth2100(val$transaction).onComplete(val$callbackError, false, val$snapshot);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Repo$TransactionData val$transaction>
	//    2    4:invokestatic    #40  <Method com.firebase.client.Transaction$Handler Repo$TransactionData.access$2100(Repo$TransactionData)>
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field FirebaseError val$callbackError>
	//    5   11:iconst_0        
	//    6   12:aload_0         
	//    7   13:getfield        #29  <Field DataSnapshot val$snapshot>
	//    8   16:invokeinterface #46  <Method void com.firebase.client.Transaction$Handler.onComplete(FirebaseError, boolean, DataSnapshot)>
	//    9   21:return          
	}

	final Repo this$0;
	final FirebaseError val$callbackError;
	final DataSnapshot val$snapshot;
	final nsactionData val$transaction;

	Repo$18()
	{
		this$0 = final_repo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field Repo this$0>
		val$transaction = nsactiondata;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field Repo$TransactionData val$transaction>
		val$callbackError = firebaseerror;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field FirebaseError val$callbackError>
		val$snapshot = DataSnapshot.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field DataSnapshot val$snapshot>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}
}
