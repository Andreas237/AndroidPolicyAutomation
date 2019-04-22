// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

// Referenced classes of package com.firebase.client.core:
//			Repo, Path

class Repo$6
	implements com.firebase.client.e.CompletionListener
{

	public void onComplete(FirebaseError firebaseerror, Firebase firebase)
	{
		Repo.access$500(Repo.this, "setValue", val$path, firebaseerror);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Repo this$0>
	//    2    4:ldc1            #36  <String "setValue">
	//    3    6:aload_0         
	//    4    7:getfield        #25  <Field Path val$path>
	//    5   10:aload_1         
	//    6   11:invokestatic    #40  <Method void Repo.access$500(Repo, String, Path, FirebaseError)>
		Repo.access$600(Repo.this, val$writeId, val$path, firebaseerror);
	//    7   14:aload_0         
	//    8   15:getfield        #23  <Field Repo this$0>
	//    9   18:aload_0         
	//   10   19:getfield        #27  <Field long val$writeId>
	//   11   22:aload_0         
	//   12   23:getfield        #25  <Field Path val$path>
	//   13   26:aload_1         
	//   14   27:invokestatic    #44  <Method void Repo.access$600(Repo, long, Path, FirebaseError)>
		callOnComplete(val$onComplete, firebaseerror, val$path);
	//   15   30:aload_0         
	//   16   31:getfield        #23  <Field Repo this$0>
	//   17   34:aload_0         
	//   18   35:getfield        #29  <Field com.firebase.client.Firebase$CompletionListener val$onComplete>
	//   19   38:aload_1         
	//   20   39:aload_0         
	//   21   40:getfield        #25  <Field Path val$path>
	//   22   43:invokevirtual   #48  <Method void Repo.callOnComplete(com.firebase.client.Firebase$CompletionListener, FirebaseError, Path)>
	//   23   46:return          
	}

	final Repo this$0;
	final com.firebase.client.e.CompletionListener val$onComplete;
	final Path val$path;
	final long val$writeId;

	Repo$6()
	{
		this$0 = final_repo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field Repo this$0>
		val$path = path1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field Path val$path>
		val$writeId = l;
	//    6   10:aload_0         
	//    7   11:lload_3         
	//    8   12:putfield        #27  <Field long val$writeId>
		val$onComplete = com.firebase.client.e.CompletionListener.this;
	//    9   15:aload_0         
	//   10   16:aload           5
	//   11   18:putfield        #29  <Field com.firebase.client.Firebase$CompletionListener val$onComplete>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}
}
