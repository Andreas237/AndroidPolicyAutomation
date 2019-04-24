// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzadz, zzafm, zzafn, zzaol, 
//			zzadx, zzaen

public final class zzaec extends zzadz
{

	public zzaec(Context context, zzaol zzaol, zzadx zzadx)
	{
		super(zzaol, zzadx);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #12  <Method void zzadz(zzaol, zzadx)>
		mContext = context;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #14  <Field Context mContext>
	//    7   11:return          
	}

	public final void zznz()
	{
	//    0    0:return          
	}

	public final zzaen zzoa()
	{
		return ((zzaen) (zzafn.zza(mContext, zzafm.zzm(mContext))));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #14  <Field Context mContext>
	//    4    8:invokestatic    #27  <Method zzafm zzafm.zzm(Context)>
	//    5   11:invokestatic    #33  <Method zzafn zzafn.zza(Context, zzafm)>
	//    6   14:areturn         
	}

	private final Context mContext;
}
