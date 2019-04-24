// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.cast.zzdg;
import com.google.android.gms.tasks.TaskCompletionSource;

// Referenced classes of package com.google.android.gms.cast:
//			zzs, CastRemoteDisplayClient

final class zzt extends CastRemoteDisplayClient.zza
{

	zzt(zzs zzs1, TaskCompletionSource taskcompletionsource)
	{
		zzbm = zzs1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzs zzbm>
		zzbj = taskcompletionsource;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #14  <Field TaskCompletionSource zzbj>
		super(((zzp) (null)));
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:invokespecial   #17  <Method void CastRemoteDisplayClient$zza(zzp)>
	//    9   15:return          
	}

	public final void onDisconnected()
		throws RemoteException
	{
		CastRemoteDisplayClient.zza(zzbm.zzbi).d("onDisconnected", new Object[0]);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzs zzbm>
	//    2    4:getfield        #28  <Field CastRemoteDisplayClient zzs.zzbi>
	//    3    7:invokestatic    #34  <Method zzdg CastRemoteDisplayClient.zza(CastRemoteDisplayClient)>
	//    4   10:ldc1            #35  <String "onDisconnected">
	//    5   12:iconst_0        
	//    6   13:anewarray       Object[]
	//    7   16:invokevirtual   #43  <Method void zzdg.d(String, Object[])>
		CastRemoteDisplayClient.zzb(zzbm.zzbi);
	//    8   19:aload_0         
	//    9   20:getfield        #12  <Field zzs zzbm>
	//   10   23:getfield        #28  <Field CastRemoteDisplayClient zzs.zzbi>
	//   11   26:invokestatic    #47  <Method void CastRemoteDisplayClient.zzb(CastRemoteDisplayClient)>
		TaskUtil.setResultOrApiException(Status.RESULT_SUCCESS, zzbj);
	//   12   29:getstatic       #53  <Field Status Status.RESULT_SUCCESS>
	//   13   32:aload_0         
	//   14   33:getfield        #14  <Field TaskCompletionSource zzbj>
	//   15   36:invokestatic    #59  <Method void TaskUtil.setResultOrApiException(Status, TaskCompletionSource)>
	//   16   39:return          
	}

	public final void onError(int i)
		throws RemoteException
	{
		CastRemoteDisplayClient.zza(zzbm.zzbi).d("onError: %d", new Object[] {
			Integer.valueOf(i)
		});
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzs zzbm>
	//    2    4:getfield        #28  <Field CastRemoteDisplayClient zzs.zzbi>
	//    3    7:invokestatic    #34  <Method zzdg CastRemoteDisplayClient.zza(CastRemoteDisplayClient)>
	//    4   10:ldc1            #64  <String "onError: %d">
	//    5   12:iconst_1        
	//    6   13:anewarray       Object[]
	//    7   16:dup             
	//    8   17:iconst_0        
	//    9   18:iload_1         
	//   10   19:invokestatic    #70  <Method Integer Integer.valueOf(int)>
	//   11   22:aastore         
	//   12   23:invokevirtual   #43  <Method void zzdg.d(String, Object[])>
		CastRemoteDisplayClient.zzb(zzbm.zzbi);
	//   13   26:aload_0         
	//   14   27:getfield        #12  <Field zzs zzbm>
	//   15   30:getfield        #28  <Field CastRemoteDisplayClient zzs.zzbi>
	//   16   33:invokestatic    #47  <Method void CastRemoteDisplayClient.zzb(CastRemoteDisplayClient)>
		TaskUtil.setResultOrApiException(Status.RESULT_INTERNAL_ERROR, zzbj);
	//   17   36:getstatic       #73  <Field Status Status.RESULT_INTERNAL_ERROR>
	//   18   39:aload_0         
	//   19   40:getfield        #14  <Field TaskCompletionSource zzbj>
	//   20   43:invokestatic    #59  <Method void TaskUtil.setResultOrApiException(Status, TaskCompletionSource)>
	//   21   46:return          
	}

	private final TaskCompletionSource zzbj;
	private final zzs zzbm;
}
