// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.c.a;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bci, tx, bck, km

public final class tz extends bci
	implements tx
{

	tz(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator">
	//    3    4:invokespecial   #13  <Method void bci(IBinder, String)>
	//    4    7:return          
	}

	public final IBinder a(a a1, km km, int i)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore          4
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (a1)));
	//    3    6:aload           4
	//    4    8:aload_1         
	//    5    9:invokestatic    #25  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (km)));
	//    6   12:aload           4
	//    7   14:aload_2         
	//    8   15:invokestatic    #25  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		parcel.writeInt(0xda3360);
	//    9   18:aload           4
	//   10   20:ldc1            #26  <Int 0xda3360>
	//   11   22:invokevirtual   #32  <Method void Parcel.writeInt(int)>
		a1 = ((a) (((bci)this).a(1, parcel)));
	//   12   25:aload_0         
	//   13   26:iconst_1        
	//   14   27:aload           4
	//   15   29:invokevirtual   #35  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//   16   32:astore_1        
		km = ((km) (((Parcel) (a1)).readStrongBinder()));
	//   17   33:aload_1         
	//   18   34:invokevirtual   #39  <Method IBinder Parcel.readStrongBinder()>
	//   19   37:astore_2        
		((Parcel) (a1)).recycle();
	//   20   38:aload_1         
	//   21   39:invokevirtual   #43  <Method void Parcel.recycle()>
		return ((IBinder) (km));
	//   22   42:aload_2         
	//   23   43:areturn         
	}
}
