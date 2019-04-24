// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			RegistrationMethods, zaca, zacb, ListenerHolder, 
//			zaby, zabz, RemoteCall, zabx

public static class RegistrationMethods$Builder
{

	static RemoteCall zaa(RegistrationMethods$Builder registrationmethods$builder)
	{
		return registrationmethods$builder.zaka;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field RemoteCall zaka>
	//    2    4:areturn         
	}

	static RemoteCall zab(RegistrationMethods$Builder registrationmethods$builder)
	{
		return registrationmethods$builder.zakb;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field RemoteCall zakb>
	//    2    4:areturn         
	}

	public RegistrationMethods build()
	{
		RemoteCall remotecall = zaka;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field RemoteCall zaka>
	//    2    4:astore_3        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		boolean flag;
		if(remotecall != null)
	//*   5    7:aload_3         
	//*   6    8:ifnull          16
			flag = true;
	//    7   11:iconst_1        
	//    8   12:istore_1        
		else
	//*   9   13:goto            18
			flag = false;
	//   10   16:iconst_0        
	//   11   17:istore_1        
		Preconditions.checkArgument(flag, "Must set register function");
	//   12   18:iload_1         
	//   13   19:ldc1            #41  <String "Must set register function">
	//   14   21:invokestatic    #47  <Method void Preconditions.checkArgument(boolean, Object)>
		if(zakb != null)
	//*  15   24:aload_0         
	//*  16   25:getfield        #37  <Field RemoteCall zakb>
	//*  17   28:ifnull          36
			flag = true;
	//   18   31:iconst_1        
	//   19   32:istore_1        
		else
	//*  20   33:goto            38
			flag = false;
	//   21   36:iconst_0        
	//   22   37:istore_1        
		Preconditions.checkArgument(flag, "Must set unregister function");
	//   23   38:iload_1         
	//   24   39:ldc1            #49  <String "Must set unregister function">
	//   25   41:invokestatic    #47  <Method void Preconditions.checkArgument(boolean, Object)>
		flag = flag1;
	//   26   44:iload_2         
	//   27   45:istore_1        
		if(zakc != null)
	//*  28   46:aload_0         
	//*  29   47:getfield        #51  <Field ListenerHolder zakc>
	//*  30   50:ifnull          55
			flag = true;
	//   31   53:iconst_1        
	//   32   54:istore_1        
		Preconditions.checkArgument(flag, "Must set holder");
	//   33   55:iload_1         
	//   34   56:ldc1            #53  <String "Must set holder">
	//   35   58:invokestatic    #47  <Method void Preconditions.checkArgument(boolean, Object)>
		return new RegistrationMethods(((RegisterListenerMethod) (new zaca(this, zakc, zakd, zajv))), ((UnregisterListenerMethod) (new zacb(this, zakc.getListenerKey()))), ((zabx) (null)));
	//   36   61:new             #7   <Class RegistrationMethods>
	//   37   64:dup             
	//   38   65:new             #55  <Class zaca>
	//   39   68:dup             
	//   40   69:aload_0         
	//   41   70:aload_0         
	//   42   71:getfield        #51  <Field ListenerHolder zakc>
	//   43   74:aload_0         
	//   44   75:getfield        #57  <Field Feature[] zakd>
	//   45   78:aload_0         
	//   46   79:getfield        #27  <Field boolean zajv>
	//   47   82:invokespecial   #60  <Method void zaca(RegistrationMethods$Builder, ListenerHolder, Feature[], boolean)>
	//   48   85:new             #62  <Class zacb>
	//   49   88:dup             
	//   50   89:aload_0         
	//   51   90:aload_0         
	//   52   91:getfield        #51  <Field ListenerHolder zakc>
	//   53   94:invokevirtual   #68  <Method ListenerHolder$ListenerKey ListenerHolder.getListenerKey()>
	//   54   97:invokespecial   #71  <Method void zacb(RegistrationMethods$Builder, ListenerHolder$ListenerKey)>
	//   55  100:aconst_null     
	//   56  101:invokespecial   #74  <Method void RegistrationMethods(RegisterListenerMethod, UnregisterListenerMethod, zabx)>
	//   57  104:areturn         
	}

	public RegistrationMethods$Builder register(RemoteCall remotecall)
	{
		zaka = remotecall;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field RemoteCall zaka>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public RegistrationMethods$Builder register(BiConsumer biconsumer)
	{
		zaka = ((RemoteCall) (new zaby(biconsumer)));
	//    0    0:aload_0         
	//    1    1:new             #84  <Class zaby>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #87  <Method void zaby(BiConsumer)>
	//    5    9:putfield        #34  <Field RemoteCall zaka>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public RegistrationMethods$Builder setAutoResolveMissingFeatures(boolean flag)
	{
		zajv = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #27  <Field boolean zajv>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public RegistrationMethods$Builder setFeatures(Feature afeature[])
	{
		zakd = afeature;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #57  <Field Feature[] zakd>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public RegistrationMethods$Builder unregister(RemoteCall remotecall)
	{
		zakb = remotecall;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field RemoteCall zakb>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public RegistrationMethods$Builder unregister(BiConsumer biconsumer)
	{
		zaka = ((RemoteCall) (new zabz(this)));
	//    0    0:aload_0         
	//    1    1:new             #99  <Class zabz>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #102 <Method void zabz(RegistrationMethods$Builder)>
	//    5    9:putfield        #34  <Field RemoteCall zaka>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public RegistrationMethods$Builder withHolder(ListenerHolder listenerholder)
	{
		zakc = listenerholder;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field ListenerHolder zakc>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	final void zaa(com.google.android.gms.common.api.Api.AnyClient anyclient, TaskCompletionSource taskcompletionsource)
	{
		zaka.accept(((Object) (anyclient)), ((Object) (taskcompletionsource)));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field RemoteCall zaka>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #113 <Method void RemoteCall.accept(Object, Object)>
	//    5   11:return          
	}

	private boolean zajv;
	private RemoteCall zaka;
	private RemoteCall zakb;
	private ListenerHolder zakc;
	private Feature zakd[];

	private RegistrationMethods$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		zajv = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #27  <Field boolean zajv>
	//    5    9:return          
	}

	RegistrationMethods$Builder(zabx zabx)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void RegistrationMethods$Builder()>
	//    2    4:return          
	}
}
