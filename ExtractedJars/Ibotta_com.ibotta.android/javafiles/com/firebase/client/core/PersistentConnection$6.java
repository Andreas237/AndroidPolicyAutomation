// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.FirebaseError;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.firebase.client.core:
//			PersistentConnection

class PersistentConnection$6
	implements sponseListener
{

	public void onResponse(Map map)
	{
		String s = (String)map.get("s");
	//    0    0:aload_1         
	//    1    1:ldc1            #29  <String "s">
	//    2    3:invokeinterface #35  <Method Object Map.get(Object)>
	//    3    8:checkcast       #37  <Class String>
	//    4   11:astore_2        
		if(s.equals("ok"))
	//*   5   12:aload_2         
	//*   6   13:ldc1            #39  <String "ok">
	//*   7   15:invokevirtual   #43  <Method boolean String.equals(Object)>
	//*   8   18:ifeq            71
		{
			Object obj = ((Object) ((Map)map.get("d")));
	//    9   21:aload_1         
	//   10   22:ldc1            #45  <String "d">
	//   11   24:invokeinterface #35  <Method Object Map.get(Object)>
	//   12   29:checkcast       #31  <Class Map>
	//   13   32:astore_3        
			if(((Map) (obj)).containsKey("w"))
	//*  14   33:aload_3         
	//*  15   34:ldc1            #47  <String "w">
	//*  16   36:invokeinterface #50  <Method boolean Map.containsKey(Object)>
	//*  17   41:ifeq            71
			{
				obj = ((Object) ((List)((Map) (obj)).get("w")));
	//   18   44:aload_3         
	//   19   45:ldc1            #47  <String "w">
	//   20   47:invokeinterface #35  <Method Object Map.get(Object)>
	//   21   52:checkcast       #52  <Class List>
	//   22   55:astore_3        
				PersistentConnection.access$1300(PersistentConnection.this, ((List) (obj)), val$listen.getQuery());
	//   23   56:aload_0         
	//   24   57:getfield        #19  <Field PersistentConnection this$0>
	//   25   60:aload_3         
	//   26   61:aload_0         
	//   27   62:getfield        #21  <Field PersistentConnection$OutstandingListen val$listen>
	//   28   65:invokevirtual   #58  <Method com.firebase.client.core.view.QuerySpec PersistentConnection$OutstandingListen.getQuery()>
	//   29   68:invokestatic    #62  <Method void PersistentConnection.access$1300(PersistentConnection, List, com.firebase.client.core.view.QuerySpec)>
			}
		}
		if((tstandingListen)PersistentConnection.access$1400(PersistentConnection.this).get(((Object) (val$listen.getQuery()))) == val$listen)
	//*  30   71:aload_0         
	//*  31   72:getfield        #19  <Field PersistentConnection this$0>
	//*  32   75:invokestatic    #66  <Method Map PersistentConnection.access$1400(PersistentConnection)>
	//*  33   78:aload_0         
	//*  34   79:getfield        #21  <Field PersistentConnection$OutstandingListen val$listen>
	//*  35   82:invokevirtual   #58  <Method com.firebase.client.core.view.QuerySpec PersistentConnection$OutstandingListen.getQuery()>
	//*  36   85:invokeinterface #35  <Method Object Map.get(Object)>
	//*  37   90:checkcast       #54  <Class PersistentConnection$OutstandingListen>
	//*  38   93:aload_0         
	//*  39   94:getfield        #21  <Field PersistentConnection$OutstandingListen val$listen>
	//*  40   97:if_acmpne       167
		{
			if(!s.equals("ok"))
	//*  41  100:aload_2         
	//*  42  101:ldc1            #39  <String "ok">
	//*  43  103:invokevirtual   #43  <Method boolean String.equals(Object)>
	//*  44  106:ifne            154
			{
				PersistentConnection.access$1500(PersistentConnection.this, val$listen.getQuery());
	//   45  109:aload_0         
	//   46  110:getfield        #19  <Field PersistentConnection this$0>
	//   47  113:aload_0         
	//   48  114:getfield        #21  <Field PersistentConnection$OutstandingListen val$listen>
	//   49  117:invokevirtual   #58  <Method com.firebase.client.core.view.QuerySpec PersistentConnection$OutstandingListen.getQuery()>
	//   50  120:invokestatic    #70  <Method PersistentConnection$OutstandingListen PersistentConnection.access$1500(PersistentConnection, com.firebase.client.core.view.QuerySpec)>
	//   51  123:pop             
				map = ((Map) (FirebaseError.fromStatus(s, (String)map.get("d"))));
	//   52  124:aload_2         
	//   53  125:aload_1         
	//   54  126:ldc1            #45  <String "d">
	//   55  128:invokeinterface #35  <Method Object Map.get(Object)>
	//   56  133:checkcast       #37  <Class String>
	//   57  136:invokestatic    #76  <Method FirebaseError FirebaseError.fromStatus(String, String)>
	//   58  139:astore_1        
				tstandingListen.access._mth500(val$listen).onRequestResult(((FirebaseError) (map)));
	//   59  140:aload_0         
	//   60  141:getfield        #21  <Field PersistentConnection$OutstandingListen val$listen>
	//   61  144:invokestatic    #80  <Method PersistentConnection$RequestResultListener PersistentConnection$OutstandingListen.access$500(PersistentConnection$OutstandingListen)>
	//   62  147:aload_1         
	//   63  148:invokeinterface #86  <Method void PersistentConnection$RequestResultListener.onRequestResult(FirebaseError)>
				return;
	//   64  153:return          
			}
			tstandingListen.access._mth500(val$listen).onRequestResult(((FirebaseError) (null)));
	//   65  154:aload_0         
	//   66  155:getfield        #21  <Field PersistentConnection$OutstandingListen val$listen>
	//   67  158:invokestatic    #80  <Method PersistentConnection$RequestResultListener PersistentConnection$OutstandingListen.access$500(PersistentConnection$OutstandingListen)>
	//   68  161:aconst_null     
	//   69  162:invokeinterface #86  <Method void PersistentConnection$RequestResultListener.onRequestResult(FirebaseError)>
		}
	//   70  167:return          
	}

	final PersistentConnection this$0;
	final tstandingListen val$listen;

	PersistentConnection$6()
	{
		this$0 = final_persistentconnection;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field PersistentConnection this$0>
		val$listen = tstandingListen.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field PersistentConnection$OutstandingListen val$listen>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
