// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.c.a;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bci, nq, bck

public final class nr extends bci
	implements nq
{

	nr(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator">
	//    3    4:invokespecial   #13  <Method void bci(IBinder, String)>
	//    4    7:return          
	}

	public final IBinder a(a a1)
	{
		Object obj = ((Object) (((bci)this).z()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_2        
		com.google.android.gms.internal.ads.bck.a(((Parcel) (obj)), ((android.os.IInterface) (a1)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #25  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		a1 = ((a) (((bci)this).a(1, ((Parcel) (obj)))));
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #28  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//   10   16:astore_1        
		obj = ((Object) (((Parcel) (a1)).readStrongBinder()));
	//   11   17:aload_1         
	//   12   18:invokevirtual   #34  <Method IBinder Parcel.readStrongBinder()>
	//   13   21:astore_2        
		((Parcel) (a1)).recycle();
	//   14   22:aload_1         
	//   15   23:invokevirtual   #38  <Method void Parcel.recycle()>
		return ((IBinder) (obj));
	//   16   26:aload_2         
	//   17   27:areturn         
	}
}
