// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.core.view.QuerySpec;

// Referenced classes of package com.firebase.client.core:
//			Repo, ValueEventRegistration

class Repo$17
	implements Runnable
{

	public void run()
	{
		Repo repo = Repo.this;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Repo this$0>
	//    2    4:astore_1        
		repo.removeEventCallback(((EventRegistration) (new ValueEventRegistration(repo, nsactionData.access._mth2200(val$transaction), QuerySpec.defaultQueryAtPath(nsactionData.access._mth1900(val$transaction))))));
	//    3    5:aload_1         
	//    4    6:new             #28  <Class ValueEventRegistration>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:getfield        #21  <Field Repo$TransactionData val$transaction>
	//    9   15:invokestatic    #34  <Method com.firebase.client.ValueEventListener Repo$TransactionData.access$2200(Repo$TransactionData)>
	//   10   18:aload_0         
	//   11   19:getfield        #21  <Field Repo$TransactionData val$transaction>
	//   12   22:invokestatic    #38  <Method Path Repo$TransactionData.access$1900(Repo$TransactionData)>
	//   13   25:invokestatic    #44  <Method QuerySpec QuerySpec.defaultQueryAtPath(Path)>
	//   14   28:invokespecial   #47  <Method void ValueEventRegistration(Repo, com.firebase.client.ValueEventListener, QuerySpec)>
	//   15   31:invokevirtual   #51  <Method void Repo.removeEventCallback(EventRegistration)>
	//   16   34:return          
	}

	final Repo this$0;
	final nsactionData val$transaction;

	Repo$17()
	{
		this$0 = final_repo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field Repo this$0>
		val$transaction = nsactionData.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Repo$TransactionData val$transaction>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
