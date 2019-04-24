// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.support.v4.util.SimpleArrayMap;
import com.google.android.gms.ads.internal.zzbc;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzabv, zzrf, zzaoj

final class zzaby
	implements Runnable
{

	zzaby(zzabv zzabv1, zzaoj zzaoj1, String s)
	{
		zzcal = zzabv1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field zzabv zzcal>
		zzcaj = zzaoj1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field zzaoj zzcaj>
		zzcak = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #20  <Field String zzcak>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #23  <Method void Object()>
	//   11   19:return          
	}

	public final void run()
	{
		zzcaj.set(((Object) ((zzrf)zzabv.zza(zzcal).zzdv().get(((Object) (zzcak))))));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzaoj zzcaj>
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field zzabv zzcal>
	//    4    8:invokestatic    #31  <Method zzbc zzabv.zza(zzabv)>
	//    5   11:invokevirtual   #37  <Method SimpleArrayMap zzbc.zzdv()>
	//    6   14:aload_0         
	//    7   15:getfield        #20  <Field String zzcak>
	//    8   18:invokevirtual   #43  <Method Object SimpleArrayMap.get(Object)>
	//    9   21:checkcast       #45  <Class zzrf>
	//   10   24:invokevirtual   #51  <Method void zzaoj.set(Object)>
	//   11   27:return          
	}

	private final zzaoj zzcaj;
	private final String zzcak;
	private final zzabv zzcal;
}
