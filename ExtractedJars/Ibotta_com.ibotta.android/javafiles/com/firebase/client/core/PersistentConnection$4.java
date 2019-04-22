// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.FirebaseError;
import java.util.Map;

// Referenced classes of package com.firebase.client.core:
//			PersistentConnection

class PersistentConnection$4
	implements sponseListener
{

	public void onResponse(Map map)
	{
		PersistentConnection.access$602(PersistentConnection.this, nnectionState.Connected);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field PersistentConnection this$0>
	//    2    4:getstatic       #37  <Field PersistentConnection$ConnectionState PersistentConnection$ConnectionState.Connected>
	//    3    7:invokestatic    #41  <Method PersistentConnection$ConnectionState PersistentConnection.access$602(PersistentConnection, PersistentConnection$ConnectionState)>
	//    4   10:pop             
		if(val$credential == PersistentConnection.access$700(PersistentConnection.this))
	//*   5   11:aload_0         
	//*   6   12:getfield        #23  <Field PersistentConnection$AuthCredential val$credential>
	//*   7   15:aload_0         
	//*   8   16:getfield        #21  <Field PersistentConnection this$0>
	//*   9   19:invokestatic    #45  <Method PersistentConnection$AuthCredential PersistentConnection.access$700(PersistentConnection)>
	//*  10   22:if_acmpne       123
		{
			String s = (String)map.get("s");
	//   11   25:aload_1         
	//   12   26:ldc1            #47  <String "s">
	//   13   28:invokeinterface #53  <Method Object Map.get(Object)>
	//   14   33:checkcast       #55  <Class String>
	//   15   36:astore_2        
			if(s.equals("ok"))
	//*  16   37:aload_2         
	//*  17   38:ldc1            #57  <String "ok">
	//*  18   40:invokevirtual   #61  <Method boolean String.equals(Object)>
	//*  19   43:ifeq            77
			{
				PersistentConnection.access$800(PersistentConnection.this).onAuthStatus(true);
	//   20   46:aload_0         
	//   21   47:getfield        #21  <Field PersistentConnection this$0>
	//   22   50:invokestatic    #65  <Method PersistentConnection$Delegate PersistentConnection.access$800(PersistentConnection)>
	//   23   53:iconst_1        
	//   24   54:invokeinterface #70  <Method void PersistentConnection$Delegate.onAuthStatus(boolean)>
				val$credential.onSuccess(map.get("d"));
	//   25   59:aload_0         
	//   26   60:getfield        #23  <Field PersistentConnection$AuthCredential val$credential>
	//   27   63:aload_1         
	//   28   64:ldc1            #72  <String "d">
	//   29   66:invokeinterface #53  <Method Object Map.get(Object)>
	//   30   71:invokevirtual   #78  <Method void PersistentConnection$AuthCredential.onSuccess(Object)>
			} else
	//*  31   74:goto            123
			{
				PersistentConnection.access$702(PersistentConnection.this, ((thCredential) (null)));
	//   32   77:aload_0         
	//   33   78:getfield        #21  <Field PersistentConnection this$0>
	//   34   81:aconst_null     
	//   35   82:invokestatic    #82  <Method PersistentConnection$AuthCredential PersistentConnection.access$702(PersistentConnection, PersistentConnection$AuthCredential)>
	//   36   85:pop             
				PersistentConnection.access$800(PersistentConnection.this).onAuthStatus(false);
	//   37   86:aload_0         
	//   38   87:getfield        #21  <Field PersistentConnection this$0>
	//   39   90:invokestatic    #65  <Method PersistentConnection$Delegate PersistentConnection.access$800(PersistentConnection)>
	//   40   93:iconst_0        
	//   41   94:invokeinterface #70  <Method void PersistentConnection$Delegate.onAuthStatus(boolean)>
				map = ((Map) ((String)map.get("d")));
	//   42   99:aload_1         
	//   43  100:ldc1            #72  <String "d">
	//   44  102:invokeinterface #53  <Method Object Map.get(Object)>
	//   45  107:checkcast       #55  <Class String>
	//   46  110:astore_1        
				val$credential.onCancel(FirebaseError.fromStatus(s, ((String) (map))));
	//   47  111:aload_0         
	//   48  112:getfield        #23  <Field PersistentConnection$AuthCredential val$credential>
	//   49  115:aload_2         
	//   50  116:aload_1         
	//   51  117:invokestatic    #88  <Method FirebaseError FirebaseError.fromStatus(String, String)>
	//   52  120:invokevirtual   #92  <Method void PersistentConnection$AuthCredential.onCancel(FirebaseError)>
			}
		}
		if(val$restoreWritesAfterComplete)
	//*  53  123:aload_0         
	//*  54  124:getfield        #25  <Field boolean val$restoreWritesAfterComplete>
	//*  55  127:ifeq            137
			PersistentConnection.access$900(PersistentConnection.this);
	//   56  130:aload_0         
	//   57  131:getfield        #21  <Field PersistentConnection this$0>
	//   58  134:invokestatic    #96  <Method void PersistentConnection.access$900(PersistentConnection)>
	//   59  137:return          
	}

	final PersistentConnection this$0;
	final thCredential val$credential;
	final boolean val$restoreWritesAfterComplete;

	PersistentConnection$4()
	{
		this$0 = final_persistentconnection;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field PersistentConnection this$0>
		val$credential = thcredential;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field PersistentConnection$AuthCredential val$credential>
		val$restoreWritesAfterComplete = Z.this;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #25  <Field boolean val$restoreWritesAfterComplete>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
