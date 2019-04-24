// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zzcl, zzck, zzdd, zzch

final class zzcj extends TaskApiCall
{

	zzcj(zzch zzch, String as[], String s, List list)
	{
		zzut = as;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field String[] zzut>
		zzuu = s;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #17  <Field String zzuu>
		zzny = list;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #19  <Field List zzny>
		super();
	//    9   16:aload_0         
	//   10   17:invokespecial   #22  <Method void TaskApiCall()>
	//   11   20:return          
	}

	protected final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient, TaskCompletionSource taskcompletionsource)
		throws RemoteException
	{
		anyclient = ((com.google.android.gms.common.api.Api.AnyClient) ((zzcl)anyclient));
	//    0    0:aload_1         
	//    1    1:checkcast       #29  <Class zzcl>
	//    2    4:astore_1        
		taskcompletionsource = ((TaskCompletionSource) (new zzck(this, taskcompletionsource)));
	//    3    5:new             #31  <Class zzck>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokespecial   #34  <Method void zzck(zzcj, TaskCompletionSource)>
	//    8   14:astore_2        
		((zzdd)((zzcl) (anyclient)).getService()).zza(((com.google.android.gms.common.api.internal.IStatusCallback) (taskcompletionsource)), zzut, zzuu, zzny);
	//    9   15:aload_1         
	//   10   16:invokevirtual   #38  <Method android.os.IInterface zzcl.getService()>
	//   11   19:checkcast       #40  <Class zzdd>
	//   12   22:aload_2         
	//   13   23:aload_0         
	//   14   24:getfield        #15  <Field String[] zzut>
	//   15   27:aload_0         
	//   16   28:getfield        #17  <Field String zzuu>
	//   17   31:aload_0         
	//   18   32:getfield        #19  <Field List zzny>
	//   19   35:invokeinterface #44  <Method void zzdd.zza(com.google.android.gms.common.api.internal.IStatusCallback, String[], String, List)>
	//   20   40:return          
	}

	private final List zzny;
	private final String zzut[];
	private final String zzuu;
}
