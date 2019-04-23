// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import com.google.android.gms.clearcut.zze;

// Referenced classes of package com.google.android.gms.internal.clearcut:
//			a, jz, bk, jx

public final class ka extends a
	implements jz
{

	ka(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.clearcut.internal.IClearcutLoggerService">
	//    3    4:invokespecial   #13  <Method void a(IBinder, String)>
	//    4    7:return          
	}

	public final void a(jx jx, zze zze)
	{
		android.os.Parcel parcel = ((a)this).a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #19  <Method android.os.Parcel a.a()>
	//    2    4:astore_3        
		bk.a(parcel, ((android.os.IInterface) (jx)));
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokestatic    #24  <Method void bk.a(android.os.Parcel, android.os.IInterface)>
		bk.a(parcel, ((android.os.Parcelable) (zze)));
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:invokestatic    #27  <Method void bk.a(android.os.Parcel, android.os.Parcelable)>
		((a)this).a(1, parcel);
	//    9   15:aload_0         
	//   10   16:iconst_1        
	//   11   17:aload_3         
	//   12   18:invokevirtual   #30  <Method void a.a(int, android.os.Parcel)>
	//   13   21:return          
	}
}
