// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.FirebaseError;
import java.util.*;

// Referenced classes of package com.firebase.client.core:
//			PersistentConnection

private static class PersistentConnection$AuthCredential
{

	public void addListener(com.firebase.client.Firebase.AuthListener authlistener)
	{
		listeners.add(((Object) (authlistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field List listeners>
	//    2    4:aload_1         
	//    3    5:invokeinterface #38  <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public String getCredential()
	{
		return credential;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String credential>
	//    2    4:areturn         
	}

	public boolean isComplete()
	{
		return onSuccessCalled;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field boolean onSuccessCalled>
	//    2    4:ireturn         
	}

	public boolean matches(String s)
	{
		return credential.equals(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String credential>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #53  <Method boolean String.equals(Object)>
	//    4    8:ireturn         
	}

	public void onCancel(FirebaseError firebaseerror)
	{
		if(onSuccessCalled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field boolean onSuccessCalled>
	//*   2    4:ifeq            13
		{
			onRevoked(firebaseerror);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #58  <Method void onRevoked(FirebaseError)>
			return;
	//    6   12:return          
		}
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((com.firebase.client.Firebase.AuthListener)iterator.next()).onAuthError(firebaseerror));
	//    7   13:aload_0         
	//    8   14:getfield        #32  <Field List listeners>
	//    9   17:invokeinterface #62  <Method Iterator List.iterator()>
	//   10   22:astore_2        
	//   11   23:aload_2         
	//   12   24:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//   13   29:ifeq            50
	//   14   32:aload_2         
	//   15   33:invokeinterface #71  <Method Object Iterator.next()>
	//   16   38:checkcast       #73  <Class com.firebase.client.Firebase$AuthListener>
	//   17   41:aload_1         
	//   18   42:invokeinterface #76  <Method void com.firebase.client.Firebase$AuthListener.onAuthError(FirebaseError)>
	//*  19   47:goto            23
	//   20   50:return          
	}

	public void onRevoked(FirebaseError firebaseerror)
	{
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((com.firebase.client.Firebase.AuthListener)iterator.next()).onAuthRevoked(firebaseerror));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field List listeners>
	//    2    4:invokeinterface #62  <Method Iterator List.iterator()>
	//    3    9:astore_2        
	//    4   10:aload_2         
	//    5   11:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            37
	//    7   19:aload_2         
	//    8   20:invokeinterface #71  <Method Object Iterator.next()>
	//    9   25:checkcast       #73  <Class com.firebase.client.Firebase$AuthListener>
	//   10   28:aload_1         
	//   11   29:invokeinterface #79  <Method void com.firebase.client.Firebase$AuthListener.onAuthRevoked(FirebaseError)>
	//*  12   34:goto            10
	//   13   37:return          
	}

	public void onSuccess(Object obj)
	{
		if(!onSuccessCalled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field boolean onSuccessCalled>
	//*   2    4:ifne            54
		{
			onSuccessCalled = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #27  <Field boolean onSuccessCalled>
			authData = obj;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #83  <Field Object authData>
			for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((com.firebase.client.Firebase.AuthListener)iterator.next()).onAuthSuccess(obj));
	//    9   17:aload_0         
	//   10   18:getfield        #32  <Field List listeners>
	//   11   21:invokeinterface #62  <Method Iterator List.iterator()>
	//   12   26:astore_2        
	//   13   27:aload_2         
	//   14   28:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//   15   33:ifeq            54
	//   16   36:aload_2         
	//   17   37:invokeinterface #71  <Method Object Iterator.next()>
	//   18   42:checkcast       #73  <Class com.firebase.client.Firebase$AuthListener>
	//   19   45:aload_1         
	//   20   46:invokeinterface #86  <Method void com.firebase.client.Firebase$AuthListener.onAuthSuccess(Object)>
		}
	//*  21   51:goto            27
	//   22   54:return          
	}

	public void preempt()
	{
		FirebaseError firebaseerror = FirebaseError.fromStatus("preempted");
	//    0    0:ldc1            #89  <String "preempted">
	//    1    2:invokestatic    #95  <Method FirebaseError FirebaseError.fromStatus(String)>
	//    2    5:astore_1        
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((com.firebase.client.Firebase.AuthListener)iterator.next()).onAuthError(firebaseerror));
	//    3    6:aload_0         
	//    4    7:getfield        #32  <Field List listeners>
	//    5   10:invokeinterface #62  <Method Iterator List.iterator()>
	//    6   15:astore_2        
	//    7   16:aload_2         
	//    8   17:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//    9   22:ifeq            43
	//   10   25:aload_2         
	//   11   26:invokeinterface #71  <Method Object Iterator.next()>
	//   12   31:checkcast       #73  <Class com.firebase.client.Firebase$AuthListener>
	//   13   34:aload_1         
	//   14   35:invokeinterface #76  <Method void com.firebase.client.Firebase$AuthListener.onAuthError(FirebaseError)>
	//*  15   40:goto            16
	//   16   43:return          
	}

	public void replay(com.firebase.client.Firebase.AuthListener authlistener)
	{
		authlistener.onAuthSuccess(authData);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #83  <Field Object authData>
	//    3    5:invokeinterface #86  <Method void com.firebase.client.Firebase$AuthListener.onAuthSuccess(Object)>
	//    4   10:return          
	}

	static final boolean $assertionsDisabled = false;
	private Object authData;
	private String credential;
	private List listeners;
	private boolean onSuccessCalled;

	static 
	{
	//    0    0:return          
	}

	PersistentConnection$AuthCredential(com.firebase.client.Firebase.AuthListener authlistener, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		onSuccessCalled = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #27  <Field boolean onSuccessCalled>
		listeners = ((List) (new ArrayList()));
	//    5    9:aload_0         
	//    6   10:new             #29  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #30  <Method void ArrayList()>
	//    9   17:putfield        #32  <Field List listeners>
		listeners.add(((Object) (authlistener)));
	//   10   20:aload_0         
	//   11   21:getfield        #32  <Field List listeners>
	//   12   24:aload_1         
	//   13   25:invokeinterface #38  <Method boolean List.add(Object)>
	//   14   30:pop             
		credential = s;
	//   15   31:aload_0         
	//   16   32:aload_2         
	//   17   33:putfield        #40  <Field String credential>
	//   18   36:return          
	}
}
