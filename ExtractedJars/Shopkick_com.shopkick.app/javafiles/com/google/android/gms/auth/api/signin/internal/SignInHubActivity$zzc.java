// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.support.v4.content.Loader;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.auth.api.signin.internal:
//			SignInHubActivity, zze, zzy

private final class SignInHubActivity$zzc
	implements android.support.v4.app.llbacks
{

	public final Loader onCreateLoader(int i, Bundle bundle)
	{
		return ((Loader) (new zze(((android.content.Context) (zzbz)), GoogleApiClient.getAllClients())));
	//    0    0:new             #27  <Class zze>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field SignInHubActivity zzbz>
	//    4    8:invokestatic    #33  <Method java.util.Set GoogleApiClient.getAllClients()>
	//    5   11:invokespecial   #36  <Method void zze(android.content.Context, java.util.Set)>
	//    6   14:areturn         
	}

	public final void onLoadFinished(Loader loader, Object obj)
	{
		loader = ((Loader) (zzbz));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SignInHubActivity zzbz>
	//    2    4:astore_1        
		((SignInHubActivity) (loader)).setResult(SignInHubActivity.zzc(((SignInHubActivity) (loader))), SignInHubActivity.zzd(zzbz));
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:invokestatic    #43  <Method int SignInHubActivity.zzc(SignInHubActivity)>
	//    6   10:aload_0         
	//    7   11:getfield        #16  <Field SignInHubActivity zzbz>
	//    8   14:invokestatic    #47  <Method android.content.Intent SignInHubActivity.zzd(SignInHubActivity)>
	//    9   17:invokevirtual   #51  <Method void SignInHubActivity.setResult(int, android.content.Intent)>
		zzbz.finish();
	//   10   20:aload_0         
	//   11   21:getfield        #16  <Field SignInHubActivity zzbz>
	//   12   24:invokevirtual   #54  <Method void SignInHubActivity.finish()>
	//   13   27:return          
	}

	public final void onLoaderReset(Loader loader)
	{
	//    0    0:return          
	}

	private final SignInHubActivity zzbz;

	private SignInHubActivity$zzc(SignInHubActivity signinhubactivity)
	{
		zzbz = signinhubactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field SignInHubActivity zzbz>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}

	SignInHubActivity$zzc(SignInHubActivity signinhubactivity, zzy zzy)
	{
		this(signinhubactivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void SignInHubActivity$zzc(SignInHubActivity)>
	//    3    5:return          
	}
}
