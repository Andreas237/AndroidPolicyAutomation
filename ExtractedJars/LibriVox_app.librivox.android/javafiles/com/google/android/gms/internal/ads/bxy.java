// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.c.a;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bci, bxx, bck

public final class bxy extends bci
	implements bxx
{

	bxy(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator">
	//    3    4:invokespecial   #13  <Method void bci(IBinder, String)>
	//    4    7:return          
	}

	public final IBinder a(a a1, int i)
	{
		Object obj = ((Object) (((bci)this).z()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_3        
		com.google.android.gms.internal.ads.bck.a(((Parcel) (obj)), ((android.os.IInterface) (a1)));
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokestatic    #25  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		((Parcel) (obj)).writeInt(0xda3360);
	//    6   10:aload_3         
	//    7   11:ldc1            #26  <Int 0xda3360>
	//    8   13:invokevirtual   #32  <Method void Parcel.writeInt(int)>
		a1 = ((a) (((bci)this).a(1, ((Parcel) (obj)))));
	//    9   16:aload_0         
	//   10   17:iconst_1        
	//   11   18:aload_3         
	//   12   19:invokevirtual   #35  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//   13   22:astore_1        
		obj = ((Object) (((Parcel) (a1)).readStrongBinder()));
	//   14   23:aload_1         
	//   15   24:invokevirtual   #39  <Method IBinder Parcel.readStrongBinder()>
	//   16   27:astore_3        
		((Parcel) (a1)).recycle();
	//   17   28:aload_1         
	//   18   29:invokevirtual   #43  <Method void Parcel.recycle()>
		return ((IBinder) (obj));
	//   19   32:aload_3         
	//   20   33:areturn         
	}
}
