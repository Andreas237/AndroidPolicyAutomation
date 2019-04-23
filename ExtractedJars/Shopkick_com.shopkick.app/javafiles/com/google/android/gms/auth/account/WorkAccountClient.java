// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.internal.auth.zzh;
import com.google.android.gms.tasks.Task;

// Referenced classes of package com.google.android.gms.auth.account:
//			WorkAccount, WorkAccountApi, zzg

public class WorkAccountClient extends GoogleApi
{

	WorkAccountClient(Activity activity)
	{
		super(activity, WorkAccount.API, ((com.google.android.gms.common.api.Api.ApiOptions) (null)), com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #16  <Field com.google.android.gms.common.api.Api WorkAccount.API>
	//    3    5:aconst_null     
	//    4    6:getstatic       #22  <Field com.google.android.gms.common.api.GoogleApi$Settings com.google.android.gms.common.api.GoogleApi$Settings.DEFAULT_SETTINGS>
	//    5    9:invokespecial   #25  <Method void GoogleApi(Activity, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, com.google.android.gms.common.api.GoogleApi$Settings)>
		zzac = ((WorkAccountApi) (new zzh()));
	//    6   12:aload_0         
	//    7   13:new             #27  <Class zzh>
	//    8   16:dup             
	//    9   17:invokespecial   #30  <Method void zzh()>
	//   10   20:putfield        #32  <Field WorkAccountApi zzac>
	//   11   23:return          
	}

	WorkAccountClient(Context context)
	{
		super(context, WorkAccount.API, ((com.google.android.gms.common.api.Api.ApiOptions) (null)), com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #16  <Field com.google.android.gms.common.api.Api WorkAccount.API>
	//    3    5:aconst_null     
	//    4    6:getstatic       #22  <Field com.google.android.gms.common.api.GoogleApi$Settings com.google.android.gms.common.api.GoogleApi$Settings.DEFAULT_SETTINGS>
	//    5    9:invokespecial   #38  <Method void GoogleApi(Context, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, com.google.android.gms.common.api.GoogleApi$Settings)>
		zzac = ((WorkAccountApi) (new zzh()));
	//    6   12:aload_0         
	//    7   13:new             #27  <Class zzh>
	//    8   16:dup             
	//    9   17:invokespecial   #30  <Method void zzh()>
	//   10   20:putfield        #32  <Field WorkAccountApi zzac>
	//   11   23:return          
	}

	public Task addWorkAccount(String s)
	{
		return PendingResultUtil.toTask(zzac.addWorkAccount(asGoogleApiClient(), s), ((com.google.android.gms.common.internal.PendingResultUtil.ResultConverter) (new zzg(this))));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field WorkAccountApi zzac>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #44  <Method com.google.android.gms.common.api.GoogleApiClient asGoogleApiClient()>
	//    4    8:aload_1         
	//    5    9:invokeinterface #49  <Method com.google.android.gms.common.api.PendingResult WorkAccountApi.addWorkAccount(com.google.android.gms.common.api.GoogleApiClient, String)>
	//    6   14:new             #51  <Class zzg>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:invokespecial   #54  <Method void zzg(WorkAccountClient)>
	//   10   22:invokestatic    #60  <Method Task PendingResultUtil.toTask(com.google.android.gms.common.api.PendingResult, com.google.android.gms.common.internal.PendingResultUtil$ResultConverter)>
	//   11   25:areturn         
	}

	public Task removeWorkAccount(Account account)
	{
		return PendingResultUtil.toVoidTask(zzac.removeWorkAccount(asGoogleApiClient(), account));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field WorkAccountApi zzac>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #44  <Method com.google.android.gms.common.api.GoogleApiClient asGoogleApiClient()>
	//    4    8:aload_1         
	//    5    9:invokeinterface #67  <Method com.google.android.gms.common.api.PendingResult WorkAccountApi.removeWorkAccount(com.google.android.gms.common.api.GoogleApiClient, Account)>
	//    6   14:invokestatic    #71  <Method Task PendingResultUtil.toVoidTask(com.google.android.gms.common.api.PendingResult)>
	//    7   17:areturn         
	}

	public Task setWorkAuthenticatorEnabled(boolean flag)
	{
		return PendingResultUtil.toVoidTask(zzac.setWorkAuthenticatorEnabledWithResult(asGoogleApiClient(), flag));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field WorkAccountApi zzac>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #44  <Method com.google.android.gms.common.api.GoogleApiClient asGoogleApiClient()>
	//    4    8:iload_1         
	//    5    9:invokeinterface #78  <Method com.google.android.gms.common.api.PendingResult WorkAccountApi.setWorkAuthenticatorEnabledWithResult(com.google.android.gms.common.api.GoogleApiClient, boolean)>
	//    6   14:invokestatic    #71  <Method Task PendingResultUtil.toVoidTask(com.google.android.gms.common.api.PendingResult)>
	//    7   17:areturn         
	}

	private final WorkAccountApi zzac;
}
