// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.FirebaseError;
import java.util.Map;

// Referenced classes of package com.firebase.client.core:
//			PersistentConnection

class PersistentConnection$3
	implements sponseListener
{

	public void onResponse(Map map)
	{
		Object obj = ((Object) ((String)map.get("s")));
	//    0    0:aload_1         
	//    1    1:ldc1            #29  <String "s">
	//    2    3:invokeinterface #35  <Method Object Map.get(Object)>
	//    3    8:checkcast       #37  <Class String>
	//    4   11:astore_2        
		if(!((String) (obj)).equals("ok"))
	//*   5   12:aload_2         
	//*   6   13:ldc1            #39  <String "ok">
	//*   7   15:invokevirtual   #43  <Method boolean String.equals(Object)>
	//*   8   18:ifne            40
			map = ((Map) (FirebaseError.fromStatus(((String) (obj)), (String)map.get("d"))));
	//    9   21:aload_2         
	//   10   22:aload_1         
	//   11   23:ldc1            #45  <String "d">
	//   12   25:invokeinterface #35  <Method Object Map.get(Object)>
	//   13   30:checkcast       #37  <Class String>
	//   14   33:invokestatic    #51  <Method FirebaseError FirebaseError.fromStatus(String, String)>
	//   15   36:astore_1        
		else
	//*  16   37:goto            42
			map = null;
	//   17   40:aconst_null     
	//   18   41:astore_1        
		obj = ((Object) (val$onComplete));
	//   19   42:aload_0         
	//   20   43:getfield        #21  <Field com.firebase.client.Firebase$CompletionListener val$onComplete>
	//   21   46:astore_2        
		if(obj != null)
	//*  22   47:aload_2         
	//*  23   48:ifnull          59
			((com.firebase.client.ener) (obj)).onComplete(((FirebaseError) (map)), ((com.firebase.client.Firebase) (null)));
	//   24   51:aload_2         
	//   25   52:aload_1         
	//   26   53:aconst_null     
	//   27   54:invokeinterface #57  <Method void com.firebase.client.Firebase$CompletionListener.onComplete(FirebaseError, com.firebase.client.Firebase)>
	//   28   59:return          
	}

	final PersistentConnection this$0;
	final com.firebase.client.ener val$onComplete;

	PersistentConnection$3()
	{
		this$0 = final_persistentconnection;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field PersistentConnection this$0>
		val$onComplete = com.firebase.client.ener.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field com.firebase.client.Firebase$CompletionListener val$onComplete>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
