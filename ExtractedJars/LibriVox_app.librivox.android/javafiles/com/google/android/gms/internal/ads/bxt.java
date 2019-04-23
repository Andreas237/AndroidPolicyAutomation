// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bci, bxq

public final class bxt extends bci
	implements bxq
{

	bxt(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.client.ICorrelationIdProvider">
	//    3    4:invokespecial   #13  <Method void bci(IBinder, String)>
	//    4    7:return          
	}

	public final long a()
	{
		Parcel parcel = ((bci)this).a(1, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    6:invokevirtual   #23  <Method Parcel bci.a(int, Parcel)>
	//    5    9:astore_3        
		long l = parcel.readLong();
	//    6   10:aload_3         
	//    7   11:invokevirtual   #28  <Method long Parcel.readLong()>
	//    8   14:lstore_1        
		parcel.recycle();
	//    9   15:aload_3         
	//   10   16:invokevirtual   #32  <Method void Parcel.recycle()>
		return l;
	//   11   19:lload_1         
	//   12   20:lreturn         
	}
}
