// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.*;
import com.google.android.gms.c.a;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bci, nn, bck

public final class np extends bci
	implements nn
{

	np(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.overlay.client.IAdOverlay">
	//    3    4:invokespecial   #13  <Method void bci(IBinder, String)>
	//    4    7:return          
	}

	public final void a(int i1, int j1, Intent intent)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore          4
		parcel.writeInt(i1);
	//    3    6:aload           4
	//    4    8:iload_1         
	//    5    9:invokevirtual   #26  <Method void Parcel.writeInt(int)>
		parcel.writeInt(j1);
	//    6   12:aload           4
	//    7   14:iload_2         
	//    8   15:invokevirtual   #26  <Method void Parcel.writeInt(int)>
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.Parcelable) (intent)));
	//    9   18:aload           4
	//   10   20:aload_3         
	//   11   21:invokestatic    #31  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.Parcelable)>
		((bci)this).b(12, parcel);
	//   12   24:aload_0         
	//   13   25:bipush          12
	//   14   27:aload           4
	//   15   29:invokevirtual   #35  <Method void bci.b(int, Parcel)>
	//   16   32:return          
	}

	public final void a(Bundle bundle)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_2        
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.Parcelable) (bundle)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #31  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.Parcelable)>
		((bci)this).b(1, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #35  <Method void bci.b(int, Parcel)>
	//   10   16:return          
	}

	public final void a(a a1)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_2        
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (a1)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #40  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		((bci)this).b(13, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          13
	//    8   13:aload_2         
	//    9   14:invokevirtual   #35  <Method void bci.b(int, Parcel)>
	//   10   17:return          
	}

	public final void b(Bundle bundle)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_2        
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.Parcelable) (bundle)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #31  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.Parcelable)>
		parcel = ((bci)this).a(6, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          6
	//    8   13:aload_2         
	//    9   14:invokevirtual   #43  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//   10   17:astore_2        
		if(parcel.readInt() != 0)
	//*  11   18:aload_2         
	//*  12   19:invokevirtual   #47  <Method int Parcel.readInt()>
	//*  13   22:ifeq            30
			bundle.readFromParcel(parcel);
	//   14   25:aload_1         
	//   15   26:aload_2         
	//   16   27:invokevirtual   #53  <Method void Bundle.readFromParcel(Parcel)>
		parcel.recycle();
	//   17   30:aload_2         
	//   18   31:invokevirtual   #57  <Method void Parcel.recycle()>
	//   19   34:return          
	}

	public final void d()
	{
		((bci)this).b(10, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:aload_0         
	//    3    4:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    7:invokevirtual   #35  <Method void bci.b(int, Parcel)>
	//    5   10:return          
	}

	public final boolean e()
	{
		Parcel parcel = ((bci)this).a(11, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:bipush          11
	//    2    3:aload_0         
	//    3    4:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    7:invokevirtual   #43  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = com.google.android.gms.internal.ads.bck.a(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #63  <Method boolean com.google.android.gms.internal.ads.bck.a(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #57  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public final void f()
	{
		((bci)this).b(2, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    6:invokevirtual   #35  <Method void bci.b(int, Parcel)>
	//    5    9:return          
	}

	public final void g()
	{
		((bci)this).b(3, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    6:invokevirtual   #35  <Method void bci.b(int, Parcel)>
	//    5    9:return          
	}

	public final void h()
	{
		((bci)this).b(4, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    6:invokevirtual   #35  <Method void bci.b(int, Parcel)>
	//    5    9:return          
	}

	public final void i()
	{
		((bci)this).b(5, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:iconst_5        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    6:invokevirtual   #35  <Method void bci.b(int, Parcel)>
	//    5    9:return          
	}

	public final void j()
	{
		((bci)this).b(7, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:bipush          7
	//    2    3:aload_0         
	//    3    4:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    7:invokevirtual   #35  <Method void bci.b(int, Parcel)>
	//    5   10:return          
	}

	public final void k()
	{
		((bci)this).b(8, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:aload_0         
	//    3    4:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    7:invokevirtual   #35  <Method void bci.b(int, Parcel)>
	//    5   10:return          
	}

	public final void l()
	{
		((bci)this).b(9, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:bipush          9
	//    2    3:aload_0         
	//    3    4:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    7:invokevirtual   #35  <Method void bci.b(int, Parcel)>
	//    5   10:return          
	}
}
