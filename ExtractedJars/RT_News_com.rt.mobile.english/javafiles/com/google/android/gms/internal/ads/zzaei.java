// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaer, zzadx, zzaej

public final class zzaei extends zzaer
{

	public zzaei(zzadx zzadx1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void zzaer()>
		zzcen = new WeakReference(((Object) (zzadx1)));
	//    2    4:aload_0         
	//    3    5:new             #15  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #18  <Method void WeakReference(Object)>
	//    7   13:putfield        #20  <Field WeakReference zzcen>
	//    8   16:return          
	}

	public final void zza(zzaej zzaej)
	{
		zzadx zzadx1 = (zzadx)zzcen.get();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field WeakReference zzcen>
	//    2    4:invokevirtual   #27  <Method Object WeakReference.get()>
	//    3    7:checkcast       #29  <Class zzadx>
	//    4   10:astore_2        
		if(zzadx1 != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          22
			zzadx1.zza(zzaej);
	//    7   15:aload_2         
	//    8   16:aload_1         
	//    9   17:invokeinterface #31  <Method void zzadx.zza(zzaej)>
	//   10   22:return          
	}

	private final WeakReference zzcen;
}
