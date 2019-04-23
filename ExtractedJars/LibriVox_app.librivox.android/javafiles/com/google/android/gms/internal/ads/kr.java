// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import com.google.android.gms.c.a;
import com.google.android.gms.c.b;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bci, kp, bck, ky, 
//			la, lb, ld, dc, 
//			byh, le, lh, ux, 
//			zzwb, ks, zzacp, zzwf, 
//			db, byg

public final class kr extends bci
	implements kp
{

	kr(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter">
	//    3    4:invokespecial   #13  <Method void bci(IBinder, String)>
	//    4    7:return          
	}

	public final a a()
	{
		Parcel parcel = ((bci)this).a(2, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    6:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//    5    9:astore_1        
		a a1 = com.google.android.gms.c.b.a(parcel.readStrongBinder());
	//    6   10:aload_1         
	//    7   11:invokevirtual   #29  <Method IBinder Parcel.readStrongBinder()>
	//    8   14:invokestatic    #34  <Method a b.a(IBinder)>
	//    9   17:astore_2        
		parcel.recycle();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #38  <Method void Parcel.recycle()>
		return a1;
	//   12   22:aload_2         
	//   13   23:areturn         
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
	//    5    7:invokestatic    #44  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		((bci)this).b(21, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          21
	//    8   13:aload_2         
	//    9   14:invokevirtual   #48  <Method void com.google.android.gms.internal.ads.bci.b(int, Parcel)>
	//   10   17:return          
	}

	public final void a(a a1, ux ux, List list)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore          4
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (a1)));
	//    3    6:aload           4
	//    4    8:aload_1         
	//    5    9:invokestatic    #44  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (ux)));
	//    6   12:aload           4
	//    7   14:aload_2         
	//    8   15:invokestatic    #44  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		parcel.writeStringList(list);
	//    9   18:aload           4
	//   10   20:aload_3         
	//   11   21:invokevirtual   #53  <Method void Parcel.writeStringList(List)>
		((bci)this).b(23, parcel);
	//   12   24:aload_0         
	//   13   25:bipush          23
	//   14   27:aload           4
	//   15   29:invokevirtual   #48  <Method void com.google.android.gms.internal.ads.bci.b(int, Parcel)>
	//   16   32:return          
	}

	public final void a(a a1, zzwb zzwb, String s, ks ks)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore          5
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (a1)));
	//    3    6:aload           5
	//    4    8:aload_1         
	//    5    9:invokestatic    #44  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.Parcelable) (zzwb)));
	//    6   12:aload           5
	//    7   14:aload_2         
	//    8   15:invokestatic    #57  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.Parcelable)>
		parcel.writeString(s);
	//    9   18:aload           5
	//   10   20:aload_3         
	//   11   21:invokevirtual   #61  <Method void Parcel.writeString(String)>
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (ks)));
	//   12   24:aload           5
	//   13   26:aload           4
	//   14   28:invokestatic    #44  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		((bci)this).b(3, parcel);
	//   15   31:aload_0         
	//   16   32:iconst_3        
	//   17   33:aload           5
	//   18   35:invokevirtual   #48  <Method void com.google.android.gms.internal.ads.bci.b(int, Parcel)>
	//   19   38:return          
	}

	public final void a(a a1, zzwb zzwb, String s, ux ux, String s1)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore          6
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (a1)));
	//    3    6:aload           6
	//    4    8:aload_1         
	//    5    9:invokestatic    #44  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.Parcelable) (zzwb)));
	//    6   12:aload           6
	//    7   14:aload_2         
	//    8   15:invokestatic    #57  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.Parcelable)>
		parcel.writeString(s);
	//    9   18:aload           6
	//   10   20:aload_3         
	//   11   21:invokevirtual   #61  <Method void Parcel.writeString(String)>
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (ux)));
	//   12   24:aload           6
	//   13   26:aload           4
	//   14   28:invokestatic    #44  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		parcel.writeString(s1);
	//   15   31:aload           6
	//   16   33:aload           5
	//   17   35:invokevirtual   #61  <Method void Parcel.writeString(String)>
		((bci)this).b(10, parcel);
	//   18   38:aload_0         
	//   19   39:bipush          10
	//   20   41:aload           6
	//   21   43:invokevirtual   #48  <Method void com.google.android.gms.internal.ads.bci.b(int, Parcel)>
	//   22   46:return          
	}

	public final void a(a a1, zzwb zzwb, String s, String s1, ks ks)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore          6
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (a1)));
	//    3    6:aload           6
	//    4    8:aload_1         
	//    5    9:invokestatic    #44  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.Parcelable) (zzwb)));
	//    6   12:aload           6
	//    7   14:aload_2         
	//    8   15:invokestatic    #57  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.Parcelable)>
		parcel.writeString(s);
	//    9   18:aload           6
	//   10   20:aload_3         
	//   11   21:invokevirtual   #61  <Method void Parcel.writeString(String)>
		parcel.writeString(s1);
	//   12   24:aload           6
	//   13   26:aload           4
	//   14   28:invokevirtual   #61  <Method void Parcel.writeString(String)>
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (ks)));
	//   15   31:aload           6
	//   16   33:aload           5
	//   17   35:invokestatic    #44  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		((bci)this).b(7, parcel);
	//   18   38:aload_0         
	//   19   39:bipush          7
	//   20   41:aload           6
	//   21   43:invokevirtual   #48  <Method void com.google.android.gms.internal.ads.bci.b(int, Parcel)>
	//   22   46:return          
	}

	public final void a(a a1, zzwb zzwb, String s, String s1, ks ks, zzacp zzacp, List list)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore          8
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (a1)));
	//    3    6:aload           8
	//    4    8:aload_1         
	//    5    9:invokestatic    #44  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.Parcelable) (zzwb)));
	//    6   12:aload           8
	//    7   14:aload_2         
	//    8   15:invokestatic    #57  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.Parcelable)>
		parcel.writeString(s);
	//    9   18:aload           8
	//   10   20:aload_3         
	//   11   21:invokevirtual   #61  <Method void Parcel.writeString(String)>
		parcel.writeString(s1);
	//   12   24:aload           8
	//   13   26:aload           4
	//   14   28:invokevirtual   #61  <Method void Parcel.writeString(String)>
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (ks)));
	//   15   31:aload           8
	//   16   33:aload           5
	//   17   35:invokestatic    #44  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.Parcelable) (zzacp)));
	//   18   38:aload           8
	//   19   40:aload           6
	//   20   42:invokestatic    #57  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.Parcelable)>
		parcel.writeStringList(list);
	//   21   45:aload           8
	//   22   47:aload           7
	//   23   49:invokevirtual   #53  <Method void Parcel.writeStringList(List)>
		((bci)this).b(14, parcel);
	//   24   52:aload_0         
	//   25   53:bipush          14
	//   26   55:aload           8
	//   27   57:invokevirtual   #48  <Method void com.google.android.gms.internal.ads.bci.b(int, Parcel)>
	//   28   60:return          
	}

	public final void a(a a1, zzwf zzwf, zzwb zzwb, String s, ks ks)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore          6
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (a1)));
	//    3    6:aload           6
	//    4    8:aload_1         
	//    5    9:invokestatic    #44  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.Parcelable) (zzwf)));
	//    6   12:aload           6
	//    7   14:aload_2         
	//    8   15:invokestatic    #57  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.Parcelable)>
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.Parcelable) (zzwb)));
	//    9   18:aload           6
	//   10   20:aload_3         
	//   11   21:invokestatic    #57  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.Parcelable)>
		parcel.writeString(s);
	//   12   24:aload           6
	//   13   26:aload           4
	//   14   28:invokevirtual   #61  <Method void Parcel.writeString(String)>
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (ks)));
	//   15   31:aload           6
	//   16   33:aload           5
	//   17   35:invokestatic    #44  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		((bci)this).b(1, parcel);
	//   18   38:aload_0         
	//   19   39:iconst_1        
	//   20   40:aload           6
	//   21   42:invokevirtual   #48  <Method void com.google.android.gms.internal.ads.bci.b(int, Parcel)>
	//   22   45:return          
	}

	public final void a(a a1, zzwf zzwf, zzwb zzwb, String s, String s1, ks ks)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore          7
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (a1)));
	//    3    6:aload           7
	//    4    8:aload_1         
	//    5    9:invokestatic    #44  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.Parcelable) (zzwf)));
	//    6   12:aload           7
	//    7   14:aload_2         
	//    8   15:invokestatic    #57  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.Parcelable)>
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.Parcelable) (zzwb)));
	//    9   18:aload           7
	//   10   20:aload_3         
	//   11   21:invokestatic    #57  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.Parcelable)>
		parcel.writeString(s);
	//   12   24:aload           7
	//   13   26:aload           4
	//   14   28:invokevirtual   #61  <Method void Parcel.writeString(String)>
		parcel.writeString(s1);
	//   15   31:aload           7
	//   16   33:aload           5
	//   17   35:invokevirtual   #61  <Method void Parcel.writeString(String)>
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.IInterface) (ks)));
	//   18   38:aload           7
	//   19   40:aload           6
	//   20   42:invokestatic    #44  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		((bci)this).b(6, parcel);
	//   21   45:aload_0         
	//   22   46:bipush          6
	//   23   48:aload           7
	//   24   50:invokevirtual   #48  <Method void com.google.android.gms.internal.ads.bci.b(int, Parcel)>
	//   25   53:return          
	}

	public final void a(zzwb zzwb, String s)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_3        
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.Parcelable) (zzwb)));
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokestatic    #57  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.Parcelable)>
		parcel.writeString(s);
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #61  <Method void Parcel.writeString(String)>
		((bci)this).b(11, parcel);
	//    9   15:aload_0         
	//   10   16:bipush          11
	//   11   18:aload_3         
	//   12   19:invokevirtual   #48  <Method void com.google.android.gms.internal.ads.bci.b(int, Parcel)>
	//   13   22:return          
	}

	public final void a(zzwb zzwb, String s, String s1)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore          4
		com.google.android.gms.internal.ads.bck.a(parcel, ((android.os.Parcelable) (zzwb)));
	//    3    6:aload           4
	//    4    8:aload_1         
	//    5    9:invokestatic    #57  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.Parcelable)>
		parcel.writeString(s);
	//    6   12:aload           4
	//    7   14:aload_2         
	//    8   15:invokevirtual   #61  <Method void Parcel.writeString(String)>
		parcel.writeString(s1);
	//    9   18:aload           4
	//   10   20:aload_3         
	//   11   21:invokevirtual   #61  <Method void Parcel.writeString(String)>
		((bci)this).b(20, parcel);
	//   12   24:aload_0         
	//   13   25:bipush          20
	//   14   27:aload           4
	//   15   29:invokevirtual   #48  <Method void com.google.android.gms.internal.ads.bci.b(int, Parcel)>
	//   16   32:return          
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
	//    5    7:invokestatic    #72  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, boolean)>
		((bci)this).b(25, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          25
	//    8   13:aload_2         
	//    9   14:invokevirtual   #48  <Method void com.google.android.gms.internal.ads.bci.b(int, Parcel)>
	//   10   17:return          
	}

	public final void b()
	{
		((bci)this).b(4, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    6:invokevirtual   #48  <Method void com.google.android.gms.internal.ads.bci.b(int, Parcel)>
	//    5    9:return          
	}

	public final void c()
	{
		((bci)this).b(5, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:iconst_5        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    6:invokevirtual   #48  <Method void com.google.android.gms.internal.ads.bci.b(int, Parcel)>
	//    5    9:return          
	}

	public final void d()
	{
		((bci)this).b(8, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:aload_0         
	//    3    4:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    7:invokevirtual   #48  <Method void com.google.android.gms.internal.ads.bci.b(int, Parcel)>
	//    5   10:return          
	}

	public final void e()
	{
		((bci)this).b(9, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:bipush          9
	//    2    3:aload_0         
	//    3    4:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    7:invokevirtual   #48  <Method void com.google.android.gms.internal.ads.bci.b(int, Parcel)>
	//    5   10:return          
	}

	public final void f()
	{
		((bci)this).b(12, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:bipush          12
	//    2    3:aload_0         
	//    3    4:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    7:invokevirtual   #48  <Method void com.google.android.gms.internal.ads.bci.b(int, Parcel)>
	//    5   10:return          
	}

	public final boolean g()
	{
		Parcel parcel = ((bci)this).a(13, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:bipush          13
	//    2    3:aload_0         
	//    3    4:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    7:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = com.google.android.gms.internal.ads.bck.a(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #81  <Method boolean com.google.android.gms.internal.ads.bck.a(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #38  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public final ky h()
	{
		Parcel parcel = ((bci)this).a(15, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:bipush          15
	//    2    3:aload_0         
	//    3    4:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    7:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//    5   10:astore_2        
		Object obj = ((Object) (parcel.readStrongBinder()));
	//    6   11:aload_2         
	//    7   12:invokevirtual   #29  <Method IBinder Parcel.readStrongBinder()>
	//    8   15:astore_1        
		if(obj == null)
	//*   9   16:aload_1         
	//*  10   17:ifnonnull       25
		{
			obj = null;
	//   11   20:aconst_null     
	//   12   21:astore_1        
		} else
	//*  13   22:goto            58
		{
			android.os.IInterface iinterface = ((IBinder) (obj)).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
	//   14   25:aload_1         
	//   15   26:ldc1            #85  <String "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper">
	//   16   28:invokeinterface #91  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   17   33:astore_3        
			if(iinterface instanceof ky)
	//*  18   34:aload_3         
	//*  19   35:instanceof      #93  <Class ky>
	//*  20   38:ifeq            49
				obj = ((Object) ((ky)iinterface));
	//   21   41:aload_3         
	//   22   42:checkcast       #93  <Class ky>
	//   23   45:astore_1        
			else
	//*  24   46:goto            58
				obj = ((Object) (new la(((IBinder) (obj)))));
	//   25   49:new             #95  <Class la>
	//   26   52:dup             
	//   27   53:aload_1         
	//   28   54:invokespecial   #97  <Method void la(IBinder)>
	//   29   57:astore_1        
		}
		parcel.recycle();
	//   30   58:aload_2         
	//   31   59:invokevirtual   #38  <Method void Parcel.recycle()>
		return ((ky) (obj));
	//   32   62:aload_1         
	//   33   63:areturn         
	}

	public final lb i()
	{
		Parcel parcel = ((bci)this).a(16, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:bipush          16
	//    2    3:aload_0         
	//    3    4:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    7:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//    5   10:astore_2        
		Object obj = ((Object) (parcel.readStrongBinder()));
	//    6   11:aload_2         
	//    7   12:invokevirtual   #29  <Method IBinder Parcel.readStrongBinder()>
	//    8   15:astore_1        
		if(obj == null)
	//*   9   16:aload_1         
	//*  10   17:ifnonnull       25
		{
			obj = null;
	//   11   20:aconst_null     
	//   12   21:astore_1        
		} else
	//*  13   22:goto            58
		{
			android.os.IInterface iinterface = ((IBinder) (obj)).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
	//   14   25:aload_1         
	//   15   26:ldc1            #101 <String "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper">
	//   16   28:invokeinterface #91  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   17   33:astore_3        
			if(iinterface instanceof lb)
	//*  18   34:aload_3         
	//*  19   35:instanceof      #103 <Class lb>
	//*  20   38:ifeq            49
				obj = ((Object) ((lb)iinterface));
	//   21   41:aload_3         
	//   22   42:checkcast       #103 <Class lb>
	//   23   45:astore_1        
			else
	//*  24   46:goto            58
				obj = ((Object) (new ld(((IBinder) (obj)))));
	//   25   49:new             #105 <Class ld>
	//   26   52:dup             
	//   27   53:aload_1         
	//   28   54:invokespecial   #106 <Method void ld(IBinder)>
	//   29   57:astore_1        
		}
		parcel.recycle();
	//   30   58:aload_2         
	//   31   59:invokevirtual   #38  <Method void Parcel.recycle()>
		return ((lb) (obj));
	//   32   62:aload_1         
	//   33   63:areturn         
	}

	public final Bundle j()
	{
		Parcel parcel = ((bci)this).a(17, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:bipush          17
	//    2    3:aload_0         
	//    3    4:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    7:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//    5   10:astore_1        
		Bundle bundle = (Bundle)com.google.android.gms.internal.ads.bck.a(parcel, Bundle.CREATOR);
	//    6   11:aload_1         
	//    7   12:getstatic       #114 <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//    8   15:invokestatic    #117 <Method android.os.Parcelable com.google.android.gms.internal.ads.bck.a(Parcel, android.os.Parcelable$Creator)>
	//    9   18:checkcast       #110 <Class Bundle>
	//   10   21:astore_2        
		parcel.recycle();
	//   11   22:aload_1         
	//   12   23:invokevirtual   #38  <Method void Parcel.recycle()>
		return bundle;
	//   13   26:aload_2         
	//   14   27:areturn         
	}

	public final Bundle k()
	{
		Parcel parcel = ((bci)this).a(18, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:bipush          18
	//    2    3:aload_0         
	//    3    4:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    7:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//    5   10:astore_1        
		Bundle bundle = (Bundle)com.google.android.gms.internal.ads.bck.a(parcel, Bundle.CREATOR);
	//    6   11:aload_1         
	//    7   12:getstatic       #114 <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//    8   15:invokestatic    #117 <Method android.os.Parcelable com.google.android.gms.internal.ads.bck.a(Parcel, android.os.Parcelable$Creator)>
	//    9   18:checkcast       #110 <Class Bundle>
	//   10   21:astore_2        
		parcel.recycle();
	//   11   22:aload_1         
	//   12   23:invokevirtual   #38  <Method void Parcel.recycle()>
		return bundle;
	//   13   26:aload_2         
	//   14   27:areturn         
	}

	public final Bundle l()
	{
		Parcel parcel = ((bci)this).a(19, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:bipush          19
	//    2    3:aload_0         
	//    3    4:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    7:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//    5   10:astore_1        
		Bundle bundle = (Bundle)com.google.android.gms.internal.ads.bck.a(parcel, Bundle.CREATOR);
	//    6   11:aload_1         
	//    7   12:getstatic       #114 <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//    8   15:invokestatic    #117 <Method android.os.Parcelable com.google.android.gms.internal.ads.bck.a(Parcel, android.os.Parcelable$Creator)>
	//    9   18:checkcast       #110 <Class Bundle>
	//   10   21:astore_2        
		parcel.recycle();
	//   11   22:aload_1         
	//   12   23:invokevirtual   #38  <Method void Parcel.recycle()>
		return bundle;
	//   13   26:aload_2         
	//   14   27:areturn         
	}

	public final boolean m()
	{
		Parcel parcel = ((bci)this).a(22, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:bipush          22
	//    2    3:aload_0         
	//    3    4:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    7:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = com.google.android.gms.internal.ads.bck.a(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #81  <Method boolean com.google.android.gms.internal.ads.bck.a(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #38  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public final db n()
	{
		Parcel parcel = ((bci)this).a(24, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:bipush          24
	//    2    3:aload_0         
	//    3    4:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    7:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//    5   10:astore_1        
		db db = com.google.android.gms.internal.ads.dc.a(parcel.readStrongBinder());
	//    6   11:aload_1         
	//    7   12:invokevirtual   #29  <Method IBinder Parcel.readStrongBinder()>
	//    8   15:invokestatic    #127 <Method db com.google.android.gms.internal.ads.dc.a(IBinder)>
	//    9   18:astore_2        
		parcel.recycle();
	//   10   19:aload_1         
	//   11   20:invokevirtual   #38  <Method void Parcel.recycle()>
		return db;
	//   12   23:aload_2         
	//   13   24:areturn         
	}

	public final byg o()
	{
		Parcel parcel = ((bci)this).a(26, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:bipush          26
	//    2    3:aload_0         
	//    3    4:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    7:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//    5   10:astore_1        
		byg byg = com.google.android.gms.internal.ads.byh.a(parcel.readStrongBinder());
	//    6   11:aload_1         
	//    7   12:invokevirtual   #29  <Method IBinder Parcel.readStrongBinder()>
	//    8   15:invokestatic    #134 <Method byg com.google.android.gms.internal.ads.byh.a(IBinder)>
	//    9   18:astore_2        
		parcel.recycle();
	//   10   19:aload_1         
	//   11   20:invokevirtual   #38  <Method void Parcel.recycle()>
		return byg;
	//   12   23:aload_2         
	//   13   24:areturn         
	}

	public final le p()
	{
		Parcel parcel = ((bci)this).a(27, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:bipush          27
	//    2    3:aload_0         
	//    3    4:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    7:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.ads.bci.a(int, Parcel)>
	//    5   10:astore_2        
		Object obj = ((Object) (parcel.readStrongBinder()));
	//    6   11:aload_2         
	//    7   12:invokevirtual   #29  <Method IBinder Parcel.readStrongBinder()>
	//    8   15:astore_1        
		if(obj == null)
	//*   9   16:aload_1         
	//*  10   17:ifnonnull       25
		{
			obj = null;
	//   11   20:aconst_null     
	//   12   21:astore_1        
		} else
	//*  13   22:goto            58
		{
			android.os.IInterface iinterface = ((IBinder) (obj)).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
	//   14   25:aload_1         
	//   15   26:ldc1            #138 <String "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper">
	//   16   28:invokeinterface #91  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   17   33:astore_3        
			if(iinterface instanceof le)
	//*  18   34:aload_3         
	//*  19   35:instanceof      #140 <Class le>
	//*  20   38:ifeq            49
				obj = ((Object) ((le)iinterface));
	//   21   41:aload_3         
	//   22   42:checkcast       #140 <Class le>
	//   23   45:astore_1        
			else
	//*  24   46:goto            58
				obj = ((Object) (new lh(((IBinder) (obj)))));
	//   25   49:new             #142 <Class lh>
	//   26   52:dup             
	//   27   53:aload_1         
	//   28   54:invokespecial   #143 <Method void lh(IBinder)>
	//   29   57:astore_1        
		}
		parcel.recycle();
	//   30   58:aload_2         
	//   31   59:invokevirtual   #38  <Method void Parcel.recycle()>
		return ((le) (obj));
	//   32   62:aload_1         
	//   33   63:areturn         
	}
}
