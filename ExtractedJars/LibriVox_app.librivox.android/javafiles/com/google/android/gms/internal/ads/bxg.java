// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.c.a;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bci, bxf, bck, zzwf, 
//			km

public final class bxg extends bci
	implements bxf
{

	bxg(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IAdManagerCreator">
	//    3    4:invokespecial   #13  <Method void bci(IBinder, String)>
	//    4    7:return          
	}

	public final IBinder a(a a1, zzwf zzwf, String s, km km, int i, int j)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore          7
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (a1)));
	//    3    6:aload           7
	//    4    8:aload_1         
	//    5    9:invokestatic    #25  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.Parcelable) (zzwf)));
	//    6   12:aload           7
	//    7   14:aload_2         
	//    8   15:invokestatic    #28  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.Parcelable)>
		parcel.writeString(s);
	//    9   18:aload           7
	//   10   20:aload_3         
	//   11   21:invokevirtual   #34  <Method void Parcel.writeString(String)>
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (km)));
	//   12   24:aload           7
	//   13   26:aload           4
	//   14   28:invokestatic    #25  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		parcel.writeInt(0xda3360);
	//   15   31:aload           7
	//   16   33:ldc1            #35  <Int 0xda3360>
	//   17   35:invokevirtual   #39  <Method void Parcel.writeInt(int)>
		parcel.writeInt(j);
	//   18   38:aload           7
	//   19   40:iload           6
	//   20   42:invokevirtual   #39  <Method void Parcel.writeInt(int)>
		a1 = ((a) (((bci)this).a(2, parcel)));
	//   21   45:aload_0         
	//   22   46:iconst_2        
	//   23   47:aload           7
	//   24   49:invokevirtual   #42  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//   25   52:astore_1        
		zzwf = ((zzwf) (((Parcel) (a1)).readStrongBinder()));
	//   26   53:aload_1         
	//   27   54:invokevirtual   #46  <Method IBinder Parcel.readStrongBinder()>
	//   28   57:astore_2        
		((Parcel) (a1)).recycle();
	//   29   58:aload_1         
	//   30   59:invokevirtual   #50  <Method void Parcel.recycle()>
		return ((IBinder) (zzwf));
	//   31   62:aload_2         
	//   32   63:areturn         
	}
}
