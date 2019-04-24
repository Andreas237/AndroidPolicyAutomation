// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.zzc;
import com.google.android.gms.common.internal.zzg;

// Referenced classes of package com.google.android.gms.internal:
//			zzaax, zzaag, zzabr

public final class zzaaj extends zzc
{

	public zzaaj(Context context, Api api, Looper looper, com.google.android.gms.common.api.Api.zze zze, zzaag zzaag1, zzg zzg, com.google.android.gms.common.api.Api.zza zza)
	{
		super(context, api, looper);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #20  <Method void zzc(Context, Api, Looper)>
		zzaAJ = zze;
	//    5    7:aload_0         
	//    6    8:aload           4
	//    7   10:putfield        #22  <Field com.google.android.gms.common.api.Api$zze zzaAJ>
		zzaAK = zzaag1;
	//    8   13:aload_0         
	//    9   14:aload           5
	//   10   16:putfield        #24  <Field zzaag zzaAK>
		zzaAL = zzg;
	//   11   19:aload_0         
	//   12   20:aload           6
	//   13   22:putfield        #26  <Field zzg zzaAL>
		zzazo = zza;
	//   14   25:aload_0         
	//   15   26:aload           7
	//   16   28:putfield        #28  <Field com.google.android.gms.common.api.Api$zza zzazo>
		zzayX.zzb(((zzc) (this)));
	//   17   31:aload_0         
	//   18   32:getfield        #32  <Field zzaax zzayX>
	//   19   35:aload_0         
	//   20   36:invokevirtual   #38  <Method void zzaax.zzb(zzc)>
	//   21   39:return          
	}

	public com.google.android.gms.common.api.Api.zze buildApiClient(Looper looper, zzaax.zza zza)
	{
		zzaAK.zza(((zzaah) (zza)));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field zzaag zzaAK>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #50  <Method void zzaag.zza(zzaah)>
		return zzaAJ;
	//    4    8:aload_0         
	//    5    9:getfield        #22  <Field com.google.android.gms.common.api.Api$zze zzaAJ>
	//    6   12:areturn         
	}

	public zzabr createSignInCoordinator(Context context, Handler handler)
	{
		return new zzabr(context, handler, zzaAL, zzazo);
	//    0    0:new             #55  <Class zzabr>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_0         
	//    5    7:getfield        #26  <Field zzg zzaAL>
	//    6   10:aload_0         
	//    7   11:getfield        #28  <Field com.google.android.gms.common.api.Api$zza zzazo>
	//    8   14:invokespecial   #58  <Method void zzabr(Context, Handler, zzg, com.google.android.gms.common.api.Api$zza)>
	//    9   17:areturn         
	}

	public com.google.android.gms.common.api.Api.zze zzvU()
	{
		return zzaAJ;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field com.google.android.gms.common.api.Api$zze zzaAJ>
	//    2    4:areturn         
	}

	private final com.google.android.gms.common.api.Api.zze zzaAJ;
	private final zzaag zzaAK;
	private final zzg zzaAL;
	private final com.google.android.gms.common.api.Api.zza zzazo;
}
