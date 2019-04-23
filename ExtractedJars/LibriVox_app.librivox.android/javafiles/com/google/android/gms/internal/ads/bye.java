// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bci, byc

public final class bye extends bci
	implements byc
{

	bye(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IMuteThisAdReason">
	//    3    4:invokespecial   #13  <Method void bci(IBinder, String)>
	//    4    7:return          
	}

	public final String a()
	{
		Parcel parcel = ((bci)this).a(1, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    6:invokevirtual   #23  <Method Parcel bci.a(int, Parcel)>
	//    5    9:astore_1        
		String s = parcel.readString();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #28  <Method String Parcel.readString()>
	//    8   14:astore_2        
		parcel.recycle();
	//    9   15:aload_1         
	//   10   16:invokevirtual   #32  <Method void Parcel.recycle()>
		return s;
	//   11   19:aload_2         
	//   12   20:areturn         
	}
}
