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
//			zzaap, zzzy, zzabj

public final class zzaab extends zzc
{

	public zzaab(Context context, Api api, Looper looper, com.google.android.gms.common.api.Api.zze zze, zzzy zzzy1, zzg zzg, com.google.android.gms.common.api.Api.zza zza)
	{
		super(context, api, looper);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #20  <Method void zzc(Context, Api, Looper)>
		zzazq = zze;
	//    5    7:aload_0         
	//    6    8:aload           4
	//    7   10:putfield        #22  <Field com.google.android.gms.common.api.Api$zze zzazq>
		zzazr = zzzy1;
	//    8   13:aload_0         
	//    9   14:aload           5
	//   10   16:putfield        #24  <Field zzzy zzazr>
		zzazs = zzg;
	//   11   19:aload_0         
	//   12   20:aload           6
	//   13   22:putfield        #26  <Field zzg zzazs>
		zzaxY = zza;
	//   14   25:aload_0         
	//   15   26:aload           7
	//   16   28:putfield        #28  <Field com.google.android.gms.common.api.Api$zza zzaxY>
		zzaxK.zza(((zzc) (this)));
	//   17   31:aload_0         
	//   18   32:getfield        #32  <Field zzaap zzaxK>
	//   19   35:aload_0         
	//   20   36:invokevirtual   #38  <Method void zzaap.zza(zzc)>
	//   21   39:return          
	}

	public com.google.android.gms.common.api.Api.zze buildApiClient(Looper looper, zzaap.zza zza)
	{
		zzazr.zza(((zzzz) (zza)));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field zzzy zzazr>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #49  <Method void zzzy.zza(zzzz)>
		return zzazq;
	//    4    8:aload_0         
	//    5    9:getfield        #22  <Field com.google.android.gms.common.api.Api$zze zzazq>
	//    6   12:areturn         
	}

	public zzabj createSignInCoordinator(Context context, Handler handler)
	{
		return new zzabj(context, handler, zzazs, zzaxY);
	//    0    0:new             #54  <Class zzabj>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_0         
	//    5    7:getfield        #26  <Field zzg zzazs>
	//    6   10:aload_0         
	//    7   11:getfield        #28  <Field com.google.android.gms.common.api.Api$zza zzaxY>
	//    8   14:invokespecial   #57  <Method void zzabj(Context, Handler, zzg, com.google.android.gms.common.api.Api$zza)>
	//    9   17:areturn         
	}

	public com.google.android.gms.common.api.Api.zze zzvr()
	{
		return zzazq;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field com.google.android.gms.common.api.Api$zze zzazq>
	//    2    4:areturn         
	}

	private final com.google.android.gms.common.api.Api.zza zzaxY;
	private final com.google.android.gms.common.api.Api.zze zzazq;
	private final zzzy zzazr;
	private final zzg zzazs;
}
