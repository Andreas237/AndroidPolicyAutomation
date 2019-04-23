// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.c.a;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bci, bxu, bck, km

public final class bxw extends bci
	implements bxu
{

	bxw(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager">
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

	public final void a(float f)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_2        
		parcel.writeFloat(f);
	//    3    5:aload_2         
	//    4    6:fload_1         
	//    5    7:invokevirtual   #30  <Method void Parcel.writeFloat(float)>
		((bci)this).b(2, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_2        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #24  <Method void bci.b(int, Parcel)>
	//   10   16:return          
	}

	public final void a(a a1, String s)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_3        
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (a1)));
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokestatic    #36  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		parcel.writeString(s);
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #40  <Method void Parcel.writeString(String)>
		((bci)this).b(5, parcel);
	//    9   15:aload_0         
	//   10   16:iconst_5        
	//   11   17:aload_3         
	//   12   18:invokevirtual   #24  <Method void bci.b(int, Parcel)>
	//   13   21:return          
	}

	public final void a(km km)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_2        
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (km)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #36  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		((bci)this).b(11, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          11
	//    8   13:aload_2         
	//    9   14:invokevirtual   #24  <Method void bci.b(int, Parcel)>
	//   10   17:return          
	}

	public final void a(String s)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_2        
		parcel.writeString(s);
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #40  <Method void Parcel.writeString(String)>
		((bci)this).b(3, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_3        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #24  <Method void bci.b(int, Parcel)>
	//   10   16:return          
	}

	public final void a(String s, a a1)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_3        
		parcel.writeString(s);
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #40  <Method void Parcel.writeString(String)>
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (a1)));
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:invokestatic    #36  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		((bci)this).b(6, parcel);
	//    9   15:aload_0         
	//   10   16:bipush          6
	//   11   18:aload_3         
	//   12   19:invokevirtual   #24  <Method void bci.b(int, Parcel)>
	//   13   22:return          
	}

	public final void a(boolean flag)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_2        
		com.google.android.gms.internal.ads.bck.a(parcel, flag);
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:invokestatic    #46  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, boolean)>
		((bci)this).b(4, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_4        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #24  <Method void bci.b(int, Parcel)>
	//   10   16:return          
	}

	public final float b()
	{
		Parcel parcel = ((bci)this).a(7, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:bipush          7
	//    2    3:aload_0         
	//    3    4:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    7:invokevirtual   #50  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//    5   10:astore_2        
		float f = parcel.readFloat();
	//    6   11:aload_2         
	//    7   12:invokevirtual   #53  <Method float Parcel.readFloat()>
	//    8   15:fstore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #56  <Method void Parcel.recycle()>
		return f;
	//   11   20:fload_1         
	//   12   21:freturn         
	}

	public final void b(String s)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_2        
		parcel.writeString(s);
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #40  <Method void Parcel.writeString(String)>
		((bci)this).b(10, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          10
	//    8   13:aload_2         
	//    9   14:invokevirtual   #24  <Method void bci.b(int, Parcel)>
	//   10   17:return          
	}

	public final boolean c()
	{
		Parcel parcel = ((bci)this).a(8, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:aload_0         
	//    3    4:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    7:invokevirtual   #50  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = com.google.android.gms.internal.ads.bck.a(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #61  <Method boolean com.google.android.gms.internal.ads.bck.a(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #56  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public final String d()
	{
		Parcel parcel = ((bci)this).a(9, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:bipush          9
	//    2    3:aload_0         
	//    3    4:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    7:invokevirtual   #50  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//    5   10:astore_1        
		String s = parcel.readString();
	//    6   11:aload_1         
	//    7   12:invokevirtual   #66  <Method String Parcel.readString()>
	//    8   15:astore_2        
		parcel.recycle();
	//    9   16:aload_1         
	//   10   17:invokevirtual   #56  <Method void Parcel.recycle()>
		return s;
	//   11   20:aload_2         
	//   12   21:areturn         
	}
}
