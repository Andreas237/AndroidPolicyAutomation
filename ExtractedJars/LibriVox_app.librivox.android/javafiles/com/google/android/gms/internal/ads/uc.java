// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bci, ua, bck, tp

public final class uc extends bci
	implements ua
{

	uc(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener">
	//    3    4:invokespecial   #13  <Method void bci(IBinder, String)>
	//    4    7:return          
	}

	public final void a()
	{
		((bci)this).b(1, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    6:invokevirtual   #24  <Method void bci.b(int, Parcel)>
	//    5    9:return          
	}

	public final void a(int i)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_2        
		parcel.writeInt(i);
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:invokevirtual   #30  <Method void Parcel.writeInt(int)>
		((bci)this).b(7, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          7
	//    8   13:aload_2         
	//    9   14:invokevirtual   #24  <Method void bci.b(int, Parcel)>
	//   10   17:return          
	}

	public final void a(tp tp)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_2        
		bck.a(parcel, ((android.os.IInterface) (tp)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #36  <Method void bck.a(Parcel, android.os.IInterface)>
		((bci)this).b(5, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_5        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #24  <Method void bci.b(int, Parcel)>
	//   10   16:return          
	}

	public final void b()
	{
		((bci)this).b(2, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    6:invokevirtual   #24  <Method void bci.b(int, Parcel)>
	//    5    9:return          
	}

	public final void c()
	{
		((bci)this).b(3, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    6:invokevirtual   #24  <Method void bci.b(int, Parcel)>
	//    5    9:return          
	}

	public final void d()
	{
		((bci)this).b(4, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    6:invokevirtual   #24  <Method void bci.b(int, Parcel)>
	//    5    9:return          
	}

	public final void e()
	{
		((bci)this).b(6, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:bipush          6
	//    2    3:aload_0         
	//    3    4:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    7:invokevirtual   #24  <Method void bci.b(int, Parcel)>
	//    5   10:return          
	}

	public final void f()
	{
		((bci)this).b(8, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:aload_0         
	//    3    4:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    7:invokevirtual   #24  <Method void bci.b(int, Parcel)>
	//    5   10:return          
	}
}
