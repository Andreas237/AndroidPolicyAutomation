// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzrp

public final class zzrf
{

	public zzrf(Context context)
	{
		this(context, ((Map) (new HashMap())), new zzrp(context), DefaultClock.getInstance());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #21  <Class HashMap>
	//    3    5:dup             
	//    4    6:invokespecial   #24  <Method void HashMap()>
	//    5    9:new             #26  <Class zzrp>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #28  <Method void zzrp(Context)>
	//    9   17:invokestatic    #34  <Method Clock DefaultClock.getInstance()>
	//   10   20:invokespecial   #37  <Method void zzrf(Context, Map, zzrp, Clock)>
	//   11   23:return          
	}

	private zzrf(Context context, Map map, zzrp zzrp1, Clock clock)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
		zzbay = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #41  <Field String zzbay>
		zzbnw = ((Map) (new HashMap()));
	//    5    9:aload_0         
	//    6   10:new             #21  <Class HashMap>
	//    7   13:dup             
	//    8   14:invokespecial   #24  <Method void HashMap()>
	//    9   17:putfield        #43  <Field Map zzbnw>
		zzri = context;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #45  <Field Context zzri>
		zzrz = clock;
	//   13   25:aload_0         
	//   14   26:aload           4
	//   15   28:putfield        #47  <Field Clock zzrz>
		zzbqg = zzrp1;
	//   16   31:aload_0         
	//   17   32:aload_3         
	//   18   33:putfield        #49  <Field zzrp zzbqg>
		zzbnx = map;
	//   19   36:aload_0         
	//   20   37:aload_2         
	//   21   38:putfield        #51  <Field Map zzbnx>
	//   22   41:return          
	}

	public final void zzfh(String s)
	{
		zzbay = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field String zzbay>
	//    3    5:return          
	}

	private String zzbay;
	private Map zzbnw;
	private final Map zzbnx;
	private final zzrp zzbqg;
	private final Context zzri;
	private final Clock zzrz;
}
