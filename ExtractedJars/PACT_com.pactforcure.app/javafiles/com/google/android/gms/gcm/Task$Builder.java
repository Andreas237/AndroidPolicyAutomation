// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.gcm;

import android.os.Bundle;
import com.google.android.gms.common.internal.zzac;

// Referenced classes of package com.google.android.gms.gcm:
//			Task, zzc, GcmNetworkManager

public static abstract class Task$Builder
{

	public abstract Task build();

	protected void checkConditions()
	{
		boolean flag;
		if(gcmTaskService != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field String gcmTaskService>
	//*   2    4:ifnull          44
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_1        
		else
	//*   5    9:iload_1         
	//*   6   10:ldc1            #40  <String "Must provide an endpoint for this task by calling setService(ComponentName).">
	//*   7   12:invokestatic    #46  <Method void zzac.zzb(boolean, Object)>
	//*   8   15:aload_0         
	//*   9   16:getfield        #48  <Field String tag>
	//*  10   19:invokestatic    #54  <Method void GcmNetworkManager.zzeC(String)>
	//*  11   22:aload_0         
	//*  12   23:getfield        #31  <Field zzc zzbgy>
	//*  13   26:invokestatic    #58  <Method void Task.zza(zzc)>
	//*  14   29:aload_0         
	//*  15   30:getfield        #60  <Field boolean isPersisted>
	//*  16   33:ifeq            43
	//*  17   36:aload_0         
	//*  18   37:getfield        #62  <Field Bundle extras>
	//*  19   40:invokestatic    #66  <Method void Task.zzL(Bundle)>
	//*  20   43:return          
			flag = false;
	//   21   44:iconst_0        
	//   22   45:istore_1        
		zzac.zzb(flag, "Must provide an endpoint for this task by calling setService(ComponentName).");
		GcmNetworkManager.zzeC(tag);
		Task.zza(zzbgy);
		if(isPersisted)
			Task.zzL(extras);
	//*  23   46:goto            9
	}

	public abstract Task$Builder setExtras(Bundle bundle);

	public abstract Task$Builder setPersisted(boolean flag);

	public abstract Task$Builder setRequiredNetwork(int i);

	public abstract Task$Builder setRequiresCharging(boolean flag);

	public abstract Task$Builder setService(Class class1);

	public abstract Task$Builder setTag(String s);

	public abstract Task$Builder setUpdateCurrent(boolean flag);

	protected Bundle extras;
	protected String gcmTaskService;
	protected boolean isPersisted;
	protected int requiredNetworkState;
	protected boolean requiresCharging;
	protected String tag;
	protected boolean updateCurrent;
	protected zzc zzbgy;

	public Task$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		zzbgy = zzc.zzbgm;
	//    2    4:aload_0         
	//    3    5:getstatic       #29  <Field zzc zzc.zzbgm>
	//    4    8:putfield        #31  <Field zzc zzbgy>
	//    5   11:return          
	}
}
