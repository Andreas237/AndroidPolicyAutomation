// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.DataSnapshot;
import com.firebase.client.FirebaseError;

// Referenced classes of package com.firebase.client.core:
//			Repo

class Repo$13
	implements Runnable
{

	public void run()
	{
		val$handler.onComplete(val$innerClassError, false, val$snap);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field com.firebase.client.Transaction$Handler val$handler>
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field FirebaseError val$innerClassError>
	//    4    8:iconst_0        
	//    5    9:aload_0         
	//    6   10:getfield        #29  <Field DataSnapshot val$snap>
	//    7   13:invokeinterface #40  <Method void com.firebase.client.Transaction$Handler.onComplete(FirebaseError, boolean, DataSnapshot)>
	//    8   18:return          
	}

	final Repo this$0;
	final com.firebase.client.ion.Handler val$handler;
	final FirebaseError val$innerClassError;
	final DataSnapshot val$snap;

	Repo$13()
	{
		this$0 = final_repo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field Repo this$0>
		val$handler = handler1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field com.firebase.client.Transaction$Handler val$handler>
		val$innerClassError = firebaseerror;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field FirebaseError val$innerClassError>
		val$snap = DataSnapshot.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field DataSnapshot val$snap>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}
}
