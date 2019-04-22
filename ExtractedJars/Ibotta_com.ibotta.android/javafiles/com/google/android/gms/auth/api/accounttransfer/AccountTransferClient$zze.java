// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.internal.auth.zzac;
import com.google.android.gms.internal.auth.zzx;
import com.google.android.gms.tasks.TaskCompletionSource;

// Referenced classes of package com.google.android.gms.auth.api.accounttransfer:
//			AccountTransferClient, zzf

private static abstract class AccountTransferClient$zze extends TaskApiCall
{

	protected void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient, TaskCompletionSource taskcompletionsource)
		throws RemoteException
	{
		anyclient = ((com.google.android.gms.common.api.Api.AnyClient) ((zzx)anyclient));
	//    0    0:aload_1         
	//    1    1:checkcast       #24  <Class zzx>
	//    2    4:astore_1        
		zzbh = taskcompletionsource;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field TaskCompletionSource zzbh>
		zzd((zzac)((zzx) (anyclient)).getService());
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #30  <Method android.os.IInterface zzx.getService()>
	//    9   15:checkcast       #32  <Class zzac>
	//   10   18:invokevirtual   #36  <Method void zzd(zzac)>
	//   11   21:return          
	}

	protected final void setResult(Object obj)
	{
		zzbh.setResult(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field TaskCompletionSource zzbh>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #43  <Method void TaskCompletionSource.setResult(Object)>
	//    4    8:return          
	}

	protected final void zzd(Status status)
	{
		AccountTransferClient.zze(zzbh, status);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field TaskCompletionSource zzbh>
	//    2    4:aload_1         
	//    3    5:invokestatic    #49  <Method void AccountTransferClient.zze(TaskCompletionSource, Status)>
	//    4    8:return          
	}

	protected abstract void zzd(zzac zzac1)
		throws RemoteException;

	private TaskCompletionSource zzbh;

	private AccountTransferClient$zze()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void TaskApiCall()>
	//    2    4:return          
	}

	AccountTransferClient$zze(zzf zzf)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void AccountTransferClient$zze()>
	//    2    4:return          
	}
}
