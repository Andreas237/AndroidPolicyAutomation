// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import com.google.android.gms.analytics.zzk;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzau, zzx, zzat, zzdh, 
//			zzaw

public final class zzbh extends zzau
{

	zzbh(zzaw zzaw)
	{
		super(zzaw);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void zzau(zzaw)>
	//    3    5:aload_0         
	//    4    6:new             #13  <Class zzx>
	//    5    9:dup             
	//    6   10:invokespecial   #16  <Method void zzx()>
	//    7   13:putfield        #18  <Field zzx zzsq>
	//    8   16:return          
	}

	protected final void zzag()
	{
		((zzat)this).zzca().zzad().zza(zzsq);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method zzk zzat.zzca()>
	//    2    4:invokevirtual   #32  <Method zzx zzk.zzad()>
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field zzx zzsq>
	//    5   11:invokevirtual   #36  <Method void zzx.zza(zzx)>
		Object obj = ((Object) (((zzat)this).zzce()));
	//    6   14:aload_0         
	//    7   15:invokevirtual   #40  <Method zzdh zzat.zzce()>
	//    8   18:astore_1        
		String s = ((zzdh) (obj)).zzaj();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #46  <Method String zzdh.zzaj()>
	//   11   23:astore_2        
		if(s != null)
	//*  12   24:aload_2         
	//*  13   25:ifnull          36
			zzsq.setAppName(s);
	//   14   28:aload_0         
	//   15   29:getfield        #18  <Field zzx zzsq>
	//   16   32:aload_2         
	//   17   33:invokevirtual   #50  <Method void zzx.setAppName(String)>
		obj = ((Object) (((zzdh) (obj)).zzak()));
	//   18   36:aload_1         
	//   19   37:invokevirtual   #53  <Method String zzdh.zzak()>
	//   20   40:astore_1        
		if(obj != null)
	//*  21   41:aload_1         
	//*  22   42:ifnull          53
			zzsq.setAppVersion(((String) (obj)));
	//   23   45:aload_0         
	//   24   46:getfield        #18  <Field zzx zzsq>
	//   25   49:aload_1         
	//   26   50:invokevirtual   #56  <Method void zzx.setAppVersion(String)>
	//   27   53:return          
	}

	public final zzx zzdf()
	{
		((zzau)this).zzcl();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #60  <Method void zzau.zzcl()>
		return zzsq;
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field zzx zzsq>
	//    4    8:areturn         
	}

	private final zzx zzsq = new zzx();
}
