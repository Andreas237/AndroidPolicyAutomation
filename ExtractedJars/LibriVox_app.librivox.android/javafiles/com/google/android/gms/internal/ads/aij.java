// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.c.a;
import com.google.android.gms.c.b;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bci, aig, bck

public final class aij extends bci
	implements aig
{

	aij(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.omid.IOmid");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.omid.IOmid">
	//    3    4:invokespecial   #13  <Method void bci(IBinder, String)>
	//    4    7:return          
	}

	public final a a(String s, a a1, String s1, String s2, String s3, String s4)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore          7
		parcel.writeString(s);
	//    3    6:aload           7
	//    4    8:aload_1         
	//    5    9:invokevirtual   #26  <Method void Parcel.writeString(String)>
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (a1)));
	//    6   12:aload           7
	//    7   14:aload_2         
	//    8   15:invokestatic    #31  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		parcel.writeString(s1);
	//    9   18:aload           7
	//   10   20:aload_3         
	//   11   21:invokevirtual   #26  <Method void Parcel.writeString(String)>
		parcel.writeString(s2);
	//   12   24:aload           7
	//   13   26:aload           4
	//   14   28:invokevirtual   #26  <Method void Parcel.writeString(String)>
		parcel.writeString(s3);
	//   15   31:aload           7
	//   16   33:aload           5
	//   17   35:invokevirtual   #26  <Method void Parcel.writeString(String)>
		parcel.writeString(s4);
	//   18   38:aload           7
	//   19   40:aload           6
	//   20   42:invokevirtual   #26  <Method void Parcel.writeString(String)>
		s = ((String) (((bci)this).a(9, parcel)));
	//   21   45:aload_0         
	//   22   46:bipush          9
	//   23   48:aload           7
	//   24   50:invokevirtual   #34  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//   25   53:astore_1        
		a1 = com.google.android.gms.c.b.a(((Parcel) (s)).readStrongBinder());
	//   26   54:aload_1         
	//   27   55:invokevirtual   #38  <Method IBinder Parcel.readStrongBinder()>
	//   28   58:invokestatic    #43  <Method a b.a(IBinder)>
	//   29   61:astore_2        
		((Parcel) (s)).recycle();
	//   30   62:aload_1         
	//   31   63:invokevirtual   #47  <Method void Parcel.recycle()>
		return a1;
	//   32   66:aload_2         
	//   33   67:areturn         
	}

	public final String a()
	{
		Parcel parcel = ((bci)this).a(6, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:bipush          6
	//    2    3:aload_0         
	//    3    4:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    7:invokevirtual   #34  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//    5   10:astore_1        
		String s = parcel.readString();
	//    6   11:aload_1         
	//    7   12:invokevirtual   #51  <Method String Parcel.readString()>
	//    8   15:astore_2        
		parcel.recycle();
	//    9   16:aload_1         
	//   10   17:invokevirtual   #47  <Method void Parcel.recycle()>
		return s;
	//   11   20:aload_2         
	//   12   21:areturn         
	}

	public final void a(a a1, a a2)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_3        
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (a1)));
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokestatic    #31  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (a2)));
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:invokestatic    #31  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		((bci)this).b(5, parcel);
	//    9   15:aload_0         
	//   10   16:iconst_5        
	//   11   17:aload_3         
	//   12   18:invokevirtual   #56  <Method void com.google.android.gms.internal.ads.bci.b(int, Parcel)>
	//   13   21:return          
	}

	public final boolean a(a a1)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_3        
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (a1)));
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokestatic    #31  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		a1 = ((a) (((bci)this).a(2, parcel)));
	//    6   10:aload_0         
	//    7   11:iconst_2        
	//    8   12:aload_3         
	//    9   13:invokevirtual   #34  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//   10   16:astore_1        
		boolean flag = com.google.android.gms.internal.ads.bck.a(((Parcel) (a1)));
	//   11   17:aload_1         
	//   12   18:invokestatic    #60  <Method boolean com.google.android.gms.internal.ads.bck.a(Parcel)>
	//   13   21:istore_2        
		((Parcel) (a1)).recycle();
	//   14   22:aload_1         
	//   15   23:invokevirtual   #47  <Method void Parcel.recycle()>
		return flag;
	//   16   26:iload_2         
	//   17   27:ireturn         
	}

	public final void b(a a1)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_2        
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (a1)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #31  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		((bci)this).b(4, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_4        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #56  <Method void com.google.android.gms.internal.ads.bci.b(int, Parcel)>
	//   10   16:return          
	}

	public final void c(a a1)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_2        
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (a1)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #31  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		((bci)this).b(7, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          7
	//    8   13:aload_2         
	//    9   14:invokevirtual   #56  <Method void com.google.android.gms.internal.ads.bci.b(int, Parcel)>
	//   10   17:return          
	}
}
