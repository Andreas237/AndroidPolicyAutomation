// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bci, lw

public final class lx extends bci
	implements lw
{

	lx(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback">
	//    3    4:invokespecial   #13  <Method void bci(IBinder, String)>
	//    4    7:return          
	}

	public final void a(String s)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_2        
		parcel.writeString(s);
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #25  <Method void Parcel.writeString(String)>
		((bci)this).b(2, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_2        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #29  <Method void bci.b(int, Parcel)>
	//   10   16:return          
	}
}
