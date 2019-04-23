// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bci, bwu, bck, zzwb

public final class bww extends bci
	implements bwu
{

	bww(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.client.IAdLoader");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IAdLoader">
	//    3    4:invokespecial   #13  <Method void bci(IBinder, String)>
	//    4    7:return          
	}

	public final String a()
	{
		Parcel parcel = ((bci)this).a(2, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:iconst_2        
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

	public final void a(zzwb zzwb)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_2        
		bck.a(parcel, ((android.os.Parcelable) (zzwb)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #38  <Method void bck.a(Parcel, android.os.Parcelable)>
		((bci)this).b(1, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #42  <Method void bci.b(int, Parcel)>
	//   10   16:return          
	}

	public final void a(zzwb zzwb, int i)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_3        
		bck.a(parcel, ((android.os.Parcelable) (zzwb)));
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokestatic    #38  <Method void bck.a(Parcel, android.os.Parcelable)>
		parcel.writeInt(i);
	//    6   10:aload_3         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #47  <Method void Parcel.writeInt(int)>
		((bci)this).b(5, parcel);
	//    9   15:aload_0         
	//   10   16:iconst_5        
	//   11   17:aload_3         
	//   12   18:invokevirtual   #42  <Method void bci.b(int, Parcel)>
	//   13   21:return          
	}

	public final String b()
	{
		Parcel parcel = ((bci)this).a(4, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:iconst_4        
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

	public final boolean c()
	{
		Parcel parcel = ((bci)this).a(3, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    6:invokevirtual   #23  <Method Parcel bci.a(int, Parcel)>
	//    5    9:astore_2        
		boolean flag = bck.a(parcel);
	//    6   10:aload_2         
	//    7   11:invokestatic    #52  <Method boolean bck.a(Parcel)>
	//    8   14:istore_1        
		parcel.recycle();
	//    9   15:aload_2         
	//   10   16:invokevirtual   #32  <Method void Parcel.recycle()>
		return flag;
	//   11   19:iload_1         
	//   12   20:ireturn         
	}
}
