// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

// Referenced classes of package com.firebase.client.core:
//			Repo, UserWriteRecord

class Repo$4
	implements com.firebase.client.e.CompletionListener
{

	public void onComplete(FirebaseError firebaseerror, Firebase firebase)
	{
		Repo.access$500(Repo.this, "Persisted write", val$write.getPath(), firebaseerror);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Repo this$0>
	//    2    4:ldc1            #29  <String "Persisted write">
	//    3    6:aload_0         
	//    4    7:getfield        #21  <Field UserWriteRecord val$write>
	//    5   10:invokevirtual   #35  <Method Path UserWriteRecord.getPath()>
	//    6   13:aload_1         
	//    7   14:invokestatic    #39  <Method void Repo.access$500(Repo, String, Path, FirebaseError)>
		Repo.access$600(Repo.this, val$write.getWriteId(), val$write.getPath(), firebaseerror);
	//    8   17:aload_0         
	//    9   18:getfield        #19  <Field Repo this$0>
	//   10   21:aload_0         
	//   11   22:getfield        #21  <Field UserWriteRecord val$write>
	//   12   25:invokevirtual   #43  <Method long UserWriteRecord.getWriteId()>
	//   13   28:aload_0         
	//   14   29:getfield        #21  <Field UserWriteRecord val$write>
	//   15   32:invokevirtual   #35  <Method Path UserWriteRecord.getPath()>
	//   16   35:aload_1         
	//   17   36:invokestatic    #47  <Method void Repo.access$600(Repo, long, Path, FirebaseError)>
	//   18   39:return          
	}

	final Repo this$0;
	final UserWriteRecord val$write;

	Repo$4()
	{
		this$0 = final_repo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field Repo this$0>
		val$write = UserWriteRecord.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field UserWriteRecord val$write>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
