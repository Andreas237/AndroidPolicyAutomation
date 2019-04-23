// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzsp

final class zzsq
	implements android.content.SharedPreferences.OnSharedPreferenceChangeListener
{

	zzsq(zzsp zzsp1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		zzbsc = zzsp1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field zzsp zzbsc>
	//    5    9:return          
	}

	public final void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
	{
		zzbsc.zza(sharedpreferences, s);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzsp zzbsc>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #23  <Method void zzsp.zza(SharedPreferences, String)>
	//    5    9:return          
	}

	private final zzsp zzbsc;
}
