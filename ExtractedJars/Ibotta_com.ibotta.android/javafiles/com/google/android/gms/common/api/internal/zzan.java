// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zzbe, zzam, zzaj, zzbc

final class zzan extends zzbe
{

	zzan(zzam zzam1, zzbc zzbc, ConnectionResult connectionresult)
	{
		zzhz = zzam1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzam zzhz>
		zzhy = connectionresult;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #14  <Field ConnectionResult zzhy>
		super(zzbc);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokespecial   #17  <Method void zzbe(zzbc)>
	//    9   15:return          
	}

	public final void zzaq()
	{
		zzaj.zza(zzhz.zzhv, zzhy);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzam zzhz>
	//    2    4:getfield        #29  <Field zzaj zzam.zzhv>
	//    3    7:aload_0         
	//    4    8:getfield        #14  <Field ConnectionResult zzhy>
	//    5   11:invokestatic    #35  <Method void zzaj.zza(zzaj, ConnectionResult)>
	//    6   14:return          
	}

	private final ConnectionResult zzhy;
	private final zzam zzhz;
}
