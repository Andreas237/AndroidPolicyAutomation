// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bci, bxk

public final class bxm extends bci
	implements bxk
{

	bxm(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IAppEventListener">
	//    3    4:invokespecial   #13  <Method void bci(IBinder, String)>
	//    4    7:return          
	}

	public final void a(String s, String s1)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_3        
		parcel.writeString(s);
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #26  <Method void Parcel.writeString(String)>
		parcel.writeString(s1);
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #26  <Method void Parcel.writeString(String)>
		((bci)this).b(1, parcel);
	//    9   15:aload_0         
	//   10   16:iconst_1        
	//   11   17:aload_3         
	//   12   18:invokevirtual   #30  <Method void bci.b(int, Parcel)>
	//   13   21:return          
	}
}
