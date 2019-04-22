// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.accounttransfer;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.auth.*;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

// Referenced classes of package com.google.android.gms.auth.api.accounttransfer:
//			zzf, AccountTransferException, zzj, zzm, 
//			zzh, zzg, zzl, zzn

public class AccountTransferClient extends GoogleApi
{
	private static class zzd extends zzv
	{

		public final void onFailure(Status status)
		{
			zzbg.zzd(status);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field AccountTransferClient$zze zzbg>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #27  <Method void AccountTransferClient$zze.zzd(Status)>
		//    4    8:return          
		}

		private zze zzbg;

		public zzd(zze zze1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void zzv()>
			zzbg = zze1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field AccountTransferClient$zze zzbg>
		//    5    9:return          
		}
	}

	private static abstract class zze extends TaskApiCall
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

		private zze()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void TaskApiCall()>
		//    2    4:return          
		}

		zze(com.google.android.gms.auth.api.accounttransfer.zzf zzf1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void AccountTransferClient$zze()>
		//    2    4:return          
		}
	}

	private static abstract class zzf extends zze
	{

		zzab zzbi;

		private zzf()
		{
			super(((com.google.android.gms.auth.api.accounttransfer.zzf) (null)));
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #15  <Method void AccountTransferClient$zze(zzf)>
			zzbi = ((zzab) (new zzn(this)));
		//    3    5:aload_0         
		//    4    6:new             #17  <Class zzn>
		//    5    9:dup             
		//    6   10:aload_0         
		//    7   11:invokespecial   #20  <Method void zzn(AccountTransferClient$zzf)>
		//    8   14:putfield        #22  <Field zzab zzbi>
		//    9   17:return          
		}

		zzf(com.google.android.gms.auth.api.accounttransfer.zzf zzf1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void AccountTransferClient$zzf()>
		//    2    4:return          
		}
	}


	AccountTransferClient(Activity activity)
	{
		super(activity, zzaw, ((com.google.android.gms.common.api.Api.ApiOptions) (null)), (new com.google.android.gms.common.api.GoogleApi.Settings.Builder()).setMapper(((com.google.android.gms.common.api.internal.StatusExceptionMapper) (new ApiExceptionMapper()))).build());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #46  <Field Api zzaw>
	//    3    5:aconst_null     
	//    4    6:new             #51  <Class com.google.android.gms.common.api.GoogleApi$Settings$Builder>
	//    5    9:dup             
	//    6   10:invokespecial   #52  <Method void com.google.android.gms.common.api.GoogleApi$Settings$Builder()>
	//    7   13:new             #54  <Class ApiExceptionMapper>
	//    8   16:dup             
	//    9   17:invokespecial   #55  <Method void ApiExceptionMapper()>
	//   10   20:invokevirtual   #59  <Method com.google.android.gms.common.api.GoogleApi$Settings$Builder com.google.android.gms.common.api.GoogleApi$Settings$Builder.setMapper(com.google.android.gms.common.api.internal.StatusExceptionMapper)>
	//   11   23:invokevirtual   #63  <Method com.google.android.gms.common.api.GoogleApi$Settings com.google.android.gms.common.api.GoogleApi$Settings$Builder.build()>
	//   12   26:invokespecial   #66  <Method void GoogleApi(Activity, Api, com.google.android.gms.common.api.Api$ApiOptions, com.google.android.gms.common.api.GoogleApi$Settings)>
	//   13   29:return          
	}

	AccountTransferClient(Context context)
	{
		super(context, zzaw, ((com.google.android.gms.common.api.Api.ApiOptions) (null)), (new com.google.android.gms.common.api.GoogleApi.Settings.Builder()).setMapper(((com.google.android.gms.common.api.internal.StatusExceptionMapper) (new ApiExceptionMapper()))).build());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #46  <Field Api zzaw>
	//    3    5:aconst_null     
	//    4    6:new             #51  <Class com.google.android.gms.common.api.GoogleApi$Settings$Builder>
	//    5    9:dup             
	//    6   10:invokespecial   #52  <Method void com.google.android.gms.common.api.GoogleApi$Settings$Builder()>
	//    7   13:new             #54  <Class ApiExceptionMapper>
	//    8   16:dup             
	//    9   17:invokespecial   #55  <Method void ApiExceptionMapper()>
	//   10   20:invokevirtual   #59  <Method com.google.android.gms.common.api.GoogleApi$Settings$Builder com.google.android.gms.common.api.GoogleApi$Settings$Builder.setMapper(com.google.android.gms.common.api.internal.StatusExceptionMapper)>
	//   11   23:invokevirtual   #63  <Method com.google.android.gms.common.api.GoogleApi$Settings com.google.android.gms.common.api.GoogleApi$Settings$Builder.build()>
	//   12   26:invokespecial   #71  <Method void GoogleApi(Context, Api, com.google.android.gms.common.api.Api$ApiOptions, com.google.android.gms.common.api.GoogleApi$Settings)>
	//   13   29:return          
	}

	private static void zzd(TaskCompletionSource taskcompletionsource, Status status)
	{
		taskcompletionsource.setException(((Exception) (new AccountTransferException(status))));
	//    0    0:aload_0         
	//    1    1:new             #74  <Class AccountTransferException>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #77  <Method void AccountTransferException(Status)>
	//    5    9:invokevirtual   #83  <Method void TaskCompletionSource.setException(Exception)>
	//    6   12:return          
	}

	static void zze(TaskCompletionSource taskcompletionsource, Status status)
	{
		zzd(taskcompletionsource, status);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #85  <Method void zzd(TaskCompletionSource, Status)>
	//    3    5:return          
	}

	public Task getDeviceMetaData(String s)
	{
		Preconditions.checkNotNull(((Object) (s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #93  <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		return doRead(((TaskApiCall) (new zzj(this, new zzy(s)))));
	//    3    5:aload_0         
	//    4    6:new             #95  <Class zzj>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:new             #97  <Class zzy>
	//    8   14:dup             
	//    9   15:aload_1         
	//   10   16:invokespecial   #100 <Method void zzy(String)>
	//   11   19:invokespecial   #103 <Method void zzj(AccountTransferClient, zzy)>
	//   12   22:invokevirtual   #107 <Method Task doRead(TaskApiCall)>
	//   13   25:areturn         
	}

	public Task notifyCompletion(String s, int i)
	{
		Preconditions.checkNotNull(((Object) (s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #93  <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		return doWrite(((TaskApiCall) (new zzm(this, new zzae(s, i)))));
	//    3    5:aload_0         
	//    4    6:new             #113 <Class zzm>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:new             #115 <Class zzae>
	//    8   14:dup             
	//    9   15:aload_1         
	//   10   16:iload_2         
	//   11   17:invokespecial   #118 <Method void zzae(String, int)>
	//   12   20:invokespecial   #121 <Method void zzm(AccountTransferClient, zzae)>
	//   13   23:invokevirtual   #124 <Method Task doWrite(TaskApiCall)>
	//   14   26:areturn         
	}

	public Task retrieveData(String s)
	{
		Preconditions.checkNotNull(((Object) (s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #93  <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		return doRead(((TaskApiCall) (new zzh(this, new zzag(s)))));
	//    3    5:aload_0         
	//    4    6:new             #128 <Class zzh>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:new             #130 <Class zzag>
	//    8   14:dup             
	//    9   15:aload_1         
	//   10   16:invokespecial   #131 <Method void zzag(String)>
	//   11   19:invokespecial   #134 <Method void zzh(AccountTransferClient, zzag)>
	//   12   22:invokevirtual   #107 <Method Task doRead(TaskApiCall)>
	//   13   25:areturn         
	}

	public Task sendData(String s, byte abyte0[])
	{
		Preconditions.checkNotNull(((Object) (s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #93  <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		Preconditions.checkNotNull(((Object) (abyte0)));
	//    3    5:aload_2         
	//    4    6:invokestatic    #93  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:pop             
		return doWrite(((TaskApiCall) (new zzg(this, new zzai(s, abyte0)))));
	//    6   10:aload_0         
	//    7   11:new             #139 <Class zzg>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:new             #141 <Class zzai>
	//   11   19:dup             
	//   12   20:aload_1         
	//   13   21:aload_2         
	//   14   22:invokespecial   #144 <Method void zzai(String, byte[])>
	//   15   25:invokespecial   #147 <Method void zzg(AccountTransferClient, zzai)>
	//   16   28:invokevirtual   #124 <Method Task doWrite(TaskApiCall)>
	//   17   31:areturn         
	}

	public Task showUserChallenge(String s, PendingIntent pendingintent)
	{
		Preconditions.checkNotNull(((Object) (s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #93  <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		Preconditions.checkNotNull(((Object) (pendingintent)));
	//    3    5:aload_2         
	//    4    6:invokestatic    #93  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:pop             
		return doWrite(((TaskApiCall) (new zzl(this, new zzak(s, pendingintent)))));
	//    6   10:aload_0         
	//    7   11:new             #152 <Class zzl>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:new             #154 <Class zzak>
	//   11   19:dup             
	//   12   20:aload_1         
	//   13   21:aload_2         
	//   14   22:invokespecial   #157 <Method void zzak(String, PendingIntent)>
	//   15   25:invokespecial   #160 <Method void zzl(AccountTransferClient, zzak)>
	//   16   28:invokevirtual   #124 <Method Task doWrite(TaskApiCall)>
	//   17   31:areturn         
	}

	private static final com.google.android.gms.common.api.Api.ClientKey zzau;
	private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zzav;
	private static final Api zzaw;

	static 
	{
		zzau = new com.google.android.gms.common.api.Api.ClientKey();
	//    0    0:new             #27  <Class com.google.android.gms.common.api.Api$ClientKey>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void com.google.android.gms.common.api.Api$ClientKey()>
	//    3    7:putstatic       #32  <Field com.google.android.gms.common.api.Api$ClientKey zzau>
		zzav = ((com.google.android.gms.common.api.Api.AbstractClientBuilder) (new com.google.android.gms.auth.api.accounttransfer.zzf()));
	//    4   10:new             #34  <Class zzf>
	//    5   13:dup             
	//    6   14:invokespecial   #35  <Method void zzf()>
	//    7   17:putstatic       #37  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zzav>
		zzaw = new Api("AccountTransfer.ACCOUNT_TRANSFER_API", zzav, zzau);
	//    8   20:new             #39  <Class Api>
	//    9   23:dup             
	//   10   24:ldc1            #41  <String "AccountTransfer.ACCOUNT_TRANSFER_API">
	//   11   26:getstatic       #37  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zzav>
	//   12   29:getstatic       #32  <Field com.google.android.gms.common.api.Api$ClientKey zzau>
	//   13   32:invokespecial   #44  <Method void Api(String, com.google.android.gms.common.api.Api$AbstractClientBuilder, com.google.android.gms.common.api.Api$ClientKey)>
	//   14   35:putstatic       #46  <Field Api zzaw>
	//*  15   38:return          
	}
}
