// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.TaskCompletionSource;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			ListenerHolder

public abstract class RegisterListenerMethod
{

	protected RegisterListenerMethod(ListenerHolder listenerholder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		zajt = listenerholder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field ListenerHolder zajt>
		zaju = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #22  <Field Feature[] zaju>
		zajv = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #24  <Field boolean zajv>
	//   11   19:return          
	}

	protected RegisterListenerMethod(ListenerHolder listenerholder, Feature afeature[], boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		zajt = listenerholder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field ListenerHolder zajt>
		zaju = afeature;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field Feature[] zaju>
		zajv = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #24  <Field boolean zajv>
	//   11   19:return          
	}

	public void clearListener()
	{
		zajt.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ListenerHolder zajt>
	//    2    4:invokevirtual   #36  <Method void ListenerHolder.clear()>
	//    3    7:return          
	}

	public ListenerHolder.ListenerKey getListenerKey()
	{
		return zajt.getListenerKey();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ListenerHolder zajt>
	//    2    4:invokevirtual   #40  <Method ListenerHolder$ListenerKey ListenerHolder.getListenerKey()>
	//    3    7:areturn         
	}

	public Feature[] getRequiredFeatures()
	{
		return zaju;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Feature[] zaju>
	//    2    4:areturn         
	}

	protected abstract void registerListener(com.google.android.gms.common.api.Api.AnyClient anyclient, TaskCompletionSource taskcompletionsource)
		throws RemoteException;

	public final boolean shouldAutoResolveMissingFeatures()
	{
		return zajv;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field boolean zajv>
	//    2    4:ireturn         
	}

	private final ListenerHolder zajt;
	private final Feature zaju[];
	private final boolean zajv;
}
