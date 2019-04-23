// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.c.a;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bci, bxa, bck, km

public final class bxb extends bci
	implements bxa
{

	bxb(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator">
	//    3    4:invokespecial   #13  <Method void bci(IBinder, String)>
	//    4    7:return          
	}

	public final IBinder a(a a1, String s, km km, int i)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore          5
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (a1)));
	//    3    6:aload           5
	//    4    8:aload_1         
	//    5    9:invokestatic    #25  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		parcel.writeString(s);
	//    6   12:aload           5
	//    7   14:aload_2         
	//    8   15:invokevirtual   #31  <Method void Parcel.writeString(String)>
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (km)));
	//    9   18:aload           5
	//   10   20:aload_3         
	//   11   21:invokestatic    #25  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		parcel.writeInt(0xda3360);
	//   12   24:aload           5
	//   13   26:ldc1            #32  <Int 0xda3360>
	//   14   28:invokevirtual   #36  <Method void Parcel.writeInt(int)>
		a1 = ((a) (((bci)this).a(1, parcel)));
	//   15   31:aload_0         
	//   16   32:iconst_1        
	//   17   33:aload           5
	//   18   35:invokevirtual   #39  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//   19   38:astore_1        
		s = ((String) (((Parcel) (a1)).readStrongBinder()));
	//   20   39:aload_1         
	//   21   40:invokevirtual   #43  <Method IBinder Parcel.readStrongBinder()>
	//   22   43:astore_2        
		((Parcel) (a1)).recycle();
	//   23   44:aload_1         
	//   24   45:invokevirtual   #47  <Method void Parcel.recycle()>
		return ((IBinder) (s));
	//   25   48:aload_2         
	//   26   49:areturn         
	}
}
