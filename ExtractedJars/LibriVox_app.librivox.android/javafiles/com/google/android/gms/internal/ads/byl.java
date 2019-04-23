// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bci, byj, bck

public final class byl extends bci
	implements byj
{

	byl(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks">
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

	public final void a(boolean flag)
	{
		android.os.Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method android.os.Parcel bci.z()>
	//    2    4:astore_2        
		bck.a(parcel, flag);
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:invokestatic    #30  <Method void bck.a(android.os.Parcel, boolean)>
		((bci)this).b(5, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_5        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #24  <Method void bci.b(int, android.os.Parcel)>
	//   10   16:return          
	}

	public final void b()
	{
		((bci)this).b(2, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #20  <Method android.os.Parcel bci.z()>
	//    4    6:invokevirtual   #24  <Method void bci.b(int, android.os.Parcel)>
	//    5    9:return          
	}

	public final void c()
	{
		((bci)this).b(3, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #20  <Method android.os.Parcel bci.z()>
	//    4    6:invokevirtual   #24  <Method void bci.b(int, android.os.Parcel)>
	//    5    9:return          
	}

	public final void d()
	{
		((bci)this).b(4, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #20  <Method android.os.Parcel bci.z()>
	//    4    6:invokevirtual   #24  <Method void bci.b(int, android.os.Parcel)>
	//    5    9:return          
	}
}
