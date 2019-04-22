// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

// Referenced classes of package com.firebase.client.core:
//			Repo

class Repo$5
	implements Runnable
{

	public void run()
	{
		val$onComplete.onComplete(val$error, val$ref);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field com.firebase.client.Firebase$CompletionListener val$onComplete>
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field FirebaseError val$error>
	//    4    8:aload_0         
	//    5    9:getfield        #29  <Field Firebase val$ref>
	//    6   12:invokeinterface #40  <Method void com.firebase.client.Firebase$CompletionListener.onComplete(FirebaseError, Firebase)>
	//    7   17:return          
	}

	final Repo this$0;
	final FirebaseError val$error;
	final com.firebase.client.e.CompletionListener val$onComplete;
	final Firebase val$ref;

	Repo$5()
	{
		this$0 = final_repo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field Repo this$0>
		val$onComplete = completionlistener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field com.firebase.client.Firebase$CompletionListener val$onComplete>
		val$error = firebaseerror;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field FirebaseError val$error>
		val$ref = Firebase.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field Firebase val$ref>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}
}
