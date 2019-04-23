// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.credentials;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.internal.auth-api.zzq;
import com.google.android.gms.tasks.Task;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//			CredentialsApi, CredentialRequestResponse, Credential, HintRequest, 
//			CredentialRequest

public class CredentialsClient extends GoogleApi
{

	CredentialsClient(Activity activity, com.google.android.gms.auth.api.Auth.AuthCredentialsOptions authcredentialsoptions)
	{
		super(activity, Auth.CREDENTIALS_API, ((com.google.android.gms.common.api.Api.ApiOptions) (authcredentialsoptions)), ((com.google.android.gms.common.api.internal.StatusExceptionMapper) (new ApiExceptionMapper())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #14  <Field com.google.android.gms.common.api.Api Auth.CREDENTIALS_API>
	//    3    5:aload_2         
	//    4    6:new             #16  <Class ApiExceptionMapper>
	//    5    9:dup             
	//    6   10:invokespecial   #19  <Method void ApiExceptionMapper()>
	//    7   13:invokespecial   #22  <Method void GoogleApi(Activity, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, com.google.android.gms.common.api.internal.StatusExceptionMapper)>
	//    8   16:return          
	}

	CredentialsClient(Context context, com.google.android.gms.auth.api.Auth.AuthCredentialsOptions authcredentialsoptions)
	{
		super(context, Auth.CREDENTIALS_API, ((com.google.android.gms.common.api.Api.ApiOptions) (authcredentialsoptions)), ((com.google.android.gms.common.api.internal.StatusExceptionMapper) (new ApiExceptionMapper())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #14  <Field com.google.android.gms.common.api.Api Auth.CREDENTIALS_API>
	//    3    5:aload_2         
	//    4    6:new             #16  <Class ApiExceptionMapper>
	//    5    9:dup             
	//    6   10:invokespecial   #19  <Method void ApiExceptionMapper()>
	//    7   13:invokespecial   #28  <Method void GoogleApi(Context, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, com.google.android.gms.common.api.internal.StatusExceptionMapper)>
	//    8   16:return          
	}

	public Task delete(Credential credential)
	{
		return PendingResultUtil.toVoidTask(Auth.CredentialsApi.delete(asGoogleApiClient(), credential));
	//    0    0:getstatic       #34  <Field CredentialsApi Auth.CredentialsApi>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #38  <Method com.google.android.gms.common.api.GoogleApiClient asGoogleApiClient()>
	//    3    7:aload_1         
	//    4    8:invokeinterface #43  <Method com.google.android.gms.common.api.PendingResult CredentialsApi.delete(com.google.android.gms.common.api.GoogleApiClient, Credential)>
	//    5   13:invokestatic    #49  <Method Task PendingResultUtil.toVoidTask(com.google.android.gms.common.api.PendingResult)>
	//    6   16:areturn         
	}

	public Task disableAutoSignIn()
	{
		return PendingResultUtil.toVoidTask(Auth.CredentialsApi.disableAutoSignIn(asGoogleApiClient()));
	//    0    0:getstatic       #34  <Field CredentialsApi Auth.CredentialsApi>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #38  <Method com.google.android.gms.common.api.GoogleApiClient asGoogleApiClient()>
	//    3    7:invokeinterface #56  <Method com.google.android.gms.common.api.PendingResult CredentialsApi.disableAutoSignIn(com.google.android.gms.common.api.GoogleApiClient)>
	//    4   12:invokestatic    #49  <Method Task PendingResultUtil.toVoidTask(com.google.android.gms.common.api.PendingResult)>
	//    5   15:areturn         
	}

	public PendingIntent getHintPickerIntent(HintRequest hintrequest)
	{
		return zzq.zzc(getApplicationContext(), (com.google.android.gms.auth.api.Auth.AuthCredentialsOptions)getApiOptions(), hintrequest);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #63  <Method Context getApplicationContext()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #67  <Method com.google.android.gms.common.api.Api$ApiOptions getApiOptions()>
	//    4    8:checkcast       #69  <Class com.google.android.gms.auth.api.Auth$AuthCredentialsOptions>
	//    5   11:aload_1         
	//    6   12:invokestatic    #75  <Method PendingIntent zzq.zzc(Context, com.google.android.gms.auth.api.Auth$AuthCredentialsOptions, HintRequest)>
	//    7   15:areturn         
	}

	public Task request(CredentialRequest credentialrequest)
	{
		return PendingResultUtil.toResponseTask(Auth.CredentialsApi.request(asGoogleApiClient(), credentialrequest), ((com.google.android.gms.common.api.Response) (new CredentialRequestResponse())));
	//    0    0:getstatic       #34  <Field CredentialsApi Auth.CredentialsApi>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #38  <Method com.google.android.gms.common.api.GoogleApiClient asGoogleApiClient()>
	//    3    7:aload_1         
	//    4    8:invokeinterface #80  <Method com.google.android.gms.common.api.PendingResult CredentialsApi.request(com.google.android.gms.common.api.GoogleApiClient, CredentialRequest)>
	//    5   13:new             #82  <Class CredentialRequestResponse>
	//    6   16:dup             
	//    7   17:invokespecial   #83  <Method void CredentialRequestResponse()>
	//    8   20:invokestatic    #87  <Method Task PendingResultUtil.toResponseTask(com.google.android.gms.common.api.PendingResult, com.google.android.gms.common.api.Response)>
	//    9   23:areturn         
	}

	public Task save(Credential credential)
	{
		return PendingResultUtil.toVoidTask(Auth.CredentialsApi.save(asGoogleApiClient(), credential));
	//    0    0:getstatic       #34  <Field CredentialsApi Auth.CredentialsApi>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #38  <Method com.google.android.gms.common.api.GoogleApiClient asGoogleApiClient()>
	//    3    7:aload_1         
	//    4    8:invokeinterface #91  <Method com.google.android.gms.common.api.PendingResult CredentialsApi.save(com.google.android.gms.common.api.GoogleApiClient, Credential)>
	//    5   13:invokestatic    #49  <Method Task PendingResultUtil.toVoidTask(com.google.android.gms.common.api.PendingResult)>
	//    6   16:areturn         
	}
}
