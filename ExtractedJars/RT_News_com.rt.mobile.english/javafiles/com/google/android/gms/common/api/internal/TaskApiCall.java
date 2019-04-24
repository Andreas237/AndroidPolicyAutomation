// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zzce, zzcf

public abstract class TaskApiCall
{
	public static class Builder
	{

		static BiConsumer zza(Builder builder1)
		{
			return builder1.zzmb;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field BiConsumer zzmb>
		//    2    4:areturn         
		}

		public TaskApiCall build()
		{
			if(zzmb == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #29  <Field BiConsumer zzmb>
		//*   2    4:ifnonnull       17
				throw new IllegalArgumentException("execute parameter required");
		//    3    7:new             #33  <Class IllegalArgumentException>
		//    4   10:dup             
		//    5   11:ldc1            #35  <String "execute parameter required">
		//    6   13:invokespecial   #38  <Method void IllegalArgumentException(String)>
		//    7   16:athrow          
			else
				return ((TaskApiCall) (new zzcf(this, zzlz, zzma)));
		//    8   17:new             #40  <Class zzcf>
		//    9   20:dup             
		//   10   21:aload_0         
		//   11   22:aload_0         
		//   12   23:getfield        #42  <Field Feature[] zzlz>
		//   13   26:aload_0         
		//   14   27:getfield        #22  <Field boolean zzma>
		//   15   30:invokespecial   #45  <Method void zzcf(TaskApiCall$Builder, Feature[], boolean)>
		//   16   33:areturn         
		}

		public Builder execute(BiConsumer biconsumer)
		{
			zzmb = biconsumer;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #29  <Field BiConsumer zzmb>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setAutoResolveMissingFeatures(boolean flag)
		{
			zzma = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #22  <Field boolean zzma>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setFeatures(Feature afeature[])
		{
			zzlz = afeature;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #42  <Field Feature[] zzlz>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private Feature zzlz[];
		private boolean zzma;
		private BiConsumer zzmb;

		private Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			zzma = true;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #22  <Field boolean zzma>
		//    5    9:return          
		}

		Builder(zzce zzce)
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
		zzlz = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #20  <Field Feature[] zzlz>
		zzma = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #22  <Field boolean zzma>
	//    8   14:return          
	}

	private TaskApiCall(Feature afeature[], boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		zzlz = afeature;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Feature[] zzlz>
		zzma = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #22  <Field boolean zzma>
	//    8   14:return          
	}

	TaskApiCall(Feature afeature[], boolean flag, zzce zzce)
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
		return new Builder(((zzce) (null)));
	//    0    0:new             #7   <Class TaskApiCall$Builder>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #34  <Method void TaskApiCall$Builder(zzce)>
	//    4    8:areturn         
	}

	protected abstract void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient, TaskCompletionSource taskcompletionsource)
		throws RemoteException;

	public boolean shouldAutoResolveMissingFeatures()
	{
		return zzma;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field boolean zzma>
	//    2    4:ireturn         
	}

	public final Feature[] zzca()
	{
		return zzlz;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Feature[] zzlz>
	//    2    4:areturn         
	}

	private final Feature zzlz[];
	private final boolean zzma;
}
