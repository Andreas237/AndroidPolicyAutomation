// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bci, ahv, bck, aht

public final class ahx extends bci
	implements ahv
{

	ahx(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.measurement.IMeasurementManager">
	//    3    4:invokespecial   #13  <Method void bci(IBinder, String)>
	//    4    7:return          
	}

	public final void a(aht aht)
	{
		android.os.Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method android.os.Parcel bci.z()>
	//    2    4:astore_2        
		bck.a(parcel, ((android.os.IInterface) (aht)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #25  <Method void bck.a(android.os.Parcel, android.os.IInterface)>
		((bci)this).b(1, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #29  <Method void bci.b(int, android.os.Parcel)>
	//   10   16:return          
	}
}
