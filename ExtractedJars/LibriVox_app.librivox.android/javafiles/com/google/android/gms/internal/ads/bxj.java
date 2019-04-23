// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bci, bxh

public final class bxj extends bci
	implements bxh
{

	bxj(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.client.IAdMetadataListener");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IAdMetadataListener">
	//    3    4:invokespecial   #13  <Method void bci(IBinder, String)>
	//    4    7:return          
	}

	public final void a()
	{
		((bci)this).b(1, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #20  <Method android.os.Parcel bci.z()>
	//    4    6:invokevirtual   #24  <Method void bci.b(int, android.os.Parcel)>
	//    5    9:return          
	}
}
