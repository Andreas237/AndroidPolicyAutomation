// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bci, brt, bck, zztv, 
//			zzty

public final class bru extends bci
	implements brt
{

	bru(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.cache.ICacheService");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.cache.ICacheService">
	//    3    4:invokespecial   #13  <Method void bci(IBinder, String)>
	//    4    7:return          
	}

	public final zztv a(zzty zzty)
	{
		Object obj = ((Object) (((bci)this).z()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_2        
		bck.a(((Parcel) (obj)), ((android.os.Parcelable) (zzty)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #25  <Method void bck.a(Parcel, android.os.Parcelable)>
		zzty = ((zzty) (((bci)this).a(1, ((Parcel) (obj)))));
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #28  <Method Parcel bci.a(int, Parcel)>
	//   10   16:astore_1        
		obj = ((Object) ((zztv)bck.a(((Parcel) (zzty)), zztv.CREATOR)));
	//   11   17:aload_1         
	//   12   18:getstatic       #34  <Field android.os.Parcelable$Creator zztv.CREATOR>
	//   13   21:invokestatic    #37  <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//   14   24:checkcast       #30  <Class zztv>
	//   15   27:astore_2        
		((Parcel) (zzty)).recycle();
	//   16   28:aload_1         
	//   17   29:invokevirtual   #43  <Method void Parcel.recycle()>
		return ((zztv) (obj));
	//   18   32:aload_2         
	//   19   33:areturn         
	}
}
