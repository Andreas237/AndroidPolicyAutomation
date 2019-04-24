// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.util.BiConsumer;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			TaskApiCall, zzcf, zzce

public static class TaskApiCall$Builder
{

	static BiConsumer zza(TaskApiCall$Builder taskapicall$builder)
	{
		return taskapicall$builder.zzmb;
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

	public TaskApiCall$Builder execute(BiConsumer biconsumer)
	{
		zzmb = biconsumer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field BiConsumer zzmb>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public TaskApiCall$Builder setAutoResolveMissingFeatures(boolean flag)
	{
		zzma = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #22  <Field boolean zzma>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public TaskApiCall$Builder setFeatures(Feature afeature[])
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

	private TaskApiCall$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		zzma = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #22  <Field boolean zzma>
	//    5    9:return          
	}

	TaskApiCall$Builder(zzce zzce)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void TaskApiCall$Builder()>
	//    2    4:return          
	}
}
