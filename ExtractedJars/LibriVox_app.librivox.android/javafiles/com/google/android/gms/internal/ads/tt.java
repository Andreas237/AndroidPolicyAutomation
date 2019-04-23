// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bci, ts, bck, tp

public final class tt extends bci
	implements ts
{

	tt(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener">
	//    3    4:invokespecial   #13  <Method void bci(IBinder, String)>
	//    4    7:return          
	}

	public final void a(tp tp, String s)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_3        
		bck.a(parcel, ((android.os.IInterface) (tp)));
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokestatic    #25  <Method void bck.a(Parcel, android.os.IInterface)>
		parcel.writeString(s);
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #31  <Method void Parcel.writeString(String)>
		((bci)this).b(1, parcel);
	//    9   15:aload_0         
	//   10   16:iconst_1        
	//   11   17:aload_3         
	//   12   18:invokevirtual   #35  <Method void bci.b(int, Parcel)>
	//   13   21:return          
	}
}
