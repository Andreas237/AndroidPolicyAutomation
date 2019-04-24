// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.ClientSettings;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			GoogleApiManager, zzp, zzby

public final class zzv extends GoogleApi
{

	public zzv(Context context, Api api, Looper looper, com.google.android.gms.common.api.Api.Client client, zzp zzp1, ClientSettings clientsettings, com.google.android.gms.common.api.Api.AbstractClientBuilder abstractclientbuilder)
	{
		super(context, api, looper);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #20  <Method void GoogleApi(Context, Api, Looper)>
		zzgd = client;
	//    5    7:aload_0         
	//    6    8:aload           4
	//    7   10:putfield        #22  <Field com.google.android.gms.common.api.Api$Client zzgd>
		zzge = zzp1;
	//    8   13:aload_0         
	//    9   14:aload           5
	//   10   16:putfield        #24  <Field zzp zzge>
		zzgf = clientsettings;
	//   11   19:aload_0         
	//   12   20:aload           6
	//   13   22:putfield        #26  <Field ClientSettings zzgf>
		zzdh = abstractclientbuilder;
	//   14   25:aload_0         
	//   15   26:aload           7
	//   16   28:putfield        #28  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zzdh>
		zzcq.zza(((GoogleApi) (this)));
	//   17   31:aload_0         
	//   18   32:getfield        #32  <Field GoogleApiManager zzcq>
	//   19   35:aload_0         
	//   20   36:invokevirtual   #38  <Method void GoogleApiManager.zza(GoogleApi)>
	//   21   39:return          
	}

	public final com.google.android.gms.common.api.Api.Client zza(Looper looper, GoogleApiManager.zza zza1)
	{
		zzge.zza(((zzq) (zza1)));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field zzp zzge>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #48  <Method void zzp.zza(zzq)>
		return zzgd;
	//    4    8:aload_0         
	//    5    9:getfield        #22  <Field com.google.android.gms.common.api.Api$Client zzgd>
	//    6   12:areturn         
	}

	public final zzby zza(Context context, Handler handler)
	{
		return new zzby(context, handler, zzgf, zzdh);
	//    0    0:new             #52  <Class zzby>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_0         
	//    5    7:getfield        #26  <Field ClientSettings zzgf>
	//    6   10:aload_0         
	//    7   11:getfield        #28  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zzdh>
	//    8   14:invokespecial   #55  <Method void zzby(Context, Handler, ClientSettings, com.google.android.gms.common.api.Api$AbstractClientBuilder)>
	//    9   17:areturn         
	}

	public final com.google.android.gms.common.api.Api.Client zzae()
	{
		return zzgd;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field com.google.android.gms.common.api.Api$Client zzgd>
	//    2    4:areturn         
	}

	private final com.google.android.gms.common.api.Api.AbstractClientBuilder zzdh;
	private final com.google.android.gms.common.api.Api.Client zzgd;
	private final zzp zzge;
	private final ClientSettings zzgf;
}
