// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zaci, zack, zacj, RemoteCall

public abstract class TaskApiCall
{
	public static class Builder
	{

		static RemoteCall zaa(Builder builder1)
		{
			return builder1.zakl;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field RemoteCall zakl>
		//    2    4:areturn         
		}

		public TaskApiCall build()
		{
			boolean flag;
			if(zakl != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #29  <Field RemoteCall zakl>
		//*   2    4:ifnull          12
				flag = true;
		//    3    7:iconst_1        
		//    4    8:istore_1        
			else
		//*   5    9:goto            14
				flag = false;
		//    6   12:iconst_0        
		//    7   13:istore_1        
			Preconditions.checkArgument(flag, "execute parameter required");
		//    8   14:iload_1         
		//    9   15:ldc1            #33  <String "execute parameter required">
		//   10   17:invokestatic    #39  <Method void Preconditions.checkArgument(boolean, Object)>
			return ((TaskApiCall) (new zack(this, zakd, zakk)));
		//   11   20:new             #41  <Class zack>
		//   12   23:dup             
		//   13   24:aload_0         
		//   14   25:aload_0         
		//   15   26:getfield        #43  <Field Feature[] zakd>
		//   16   29:aload_0         
		//   17   30:getfield        #22  <Field boolean zakk>
		//   18   33:invokespecial   #46  <Method void zack(TaskApiCall$Builder, Feature[], boolean)>
		//   19   36:areturn         
		}

		public Builder execute(BiConsumer biconsumer)
		{
			zakl = ((RemoteCall) (new zacj(biconsumer)));
		//    0    0:aload_0         
		//    1    1:new             #54  <Class zacj>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:invokespecial   #57  <Method void zacj(BiConsumer)>
		//    5    9:putfield        #29  <Field RemoteCall zakl>
			return this;
		//    6   12:aload_0         
		//    7   13:areturn         
		}

		public Builder run(RemoteCall remotecall)
		{
			zakl = remotecall;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #29  <Field RemoteCall zakl>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setAutoResolveMissingFeatures(boolean flag)
		{
			zakk = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #22  <Field boolean zakk>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public transient Builder setFeatures(Feature afeature[])
		{
			zakd = afeature;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #43  <Field Feature[] zakd>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private Feature zakd[];
		private boolean zakk;
		private RemoteCall zakl;

		private Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			zakk = true;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #22  <Field boolean zakk>
		//    5    9:return          
		}

		Builder(zaci zaci)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void TaskApiCall$Builder()>
		//    2    4:return          
		}
	}


	public TaskApiCall()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		zakd = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #20  <Field Feature[] zakd>
		zakk = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #22  <Field boolean zakk>
	//    8   14:return          
	}

	private TaskApiCall(Feature afeature[], boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		zakd = afeature;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Feature[] zakd>
		zakk = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #22  <Field boolean zakk>
	//    8   14:return          
	}

	TaskApiCall(Feature afeature[], boolean flag, zaci zaci)
	{
		this(afeature, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void TaskApiCall(Feature[], boolean)>
	//    4    6:return          
	}

	public static Builder builder()
	{
		return new Builder(((zaci) (null)));
	//    0    0:new             #7   <Class TaskApiCall$Builder>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #34  <Method void TaskApiCall$Builder(zaci)>
	//    4    8:areturn         
	}

	protected abstract void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient, TaskCompletionSource taskcompletionsource)
		throws RemoteException;

	public boolean shouldAutoResolveMissingFeatures()
	{
		return zakk;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field boolean zakk>
	//    2    4:ireturn         
	}

	public final Feature[] zabt()
	{
		return zakd;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Feature[] zakd>
	//    2    4:areturn         
	}

	private final Feature zakd[];
	private final boolean zakk;
}
