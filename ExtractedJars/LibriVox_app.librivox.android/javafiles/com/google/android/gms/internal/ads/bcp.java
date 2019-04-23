// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.c.a;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bci, bcn, bck

public final class bcp extends bci
	implements bcn
{

	bcp(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.clearcut.IClearcut");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.clearcut.IClearcut">
	//    3    4:invokespecial   #13  <Method void bci(IBinder, String)>
	//    4    7:return          
	}

	public final void a()
	{
		((bci)this).b(3, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:iconst_3        
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
		((bci)this).b(6, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          6
	//    8   13:aload_2         
	//    9   14:invokevirtual   #24  <Method void bci.b(int, Parcel)>
	//   10   17:return          
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
		((bci)this).b(2, parcel);
	//    9   15:aload_0         
	//   10   16:iconst_2        
	//   11   17:aload_3         
	//   12   18:invokevirtual   #24  <Method void bci.b(int, Parcel)>
	//   13   21:return          
	}

	public final void a(a a1, String s, String s1)
	{
		s1 = ((String) (((bci)this).z()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_3        
		com.google.android.gms.internal.ads.bck.a(((Parcel) (s1)), ((android.os.IInterface) (a1)));
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokestatic    #36  <Method void com.google.android.gms.internal.ads.bck.a(Parcel, android.os.IInterface)>
		((Parcel) (s1)).writeString(s);
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #40  <Method void Parcel.writeString(String)>
		((Parcel) (s1)).writeString(((String) (null)));
	//    9   15:aload_3         
	//   10   16:aconst_null     
	//   11   17:invokevirtual   #40  <Method void Parcel.writeString(String)>
		((bci)this).b(8, ((Parcel) (s1)));
	//   12   20:aload_0         
	//   13   21:bipush          8
	//   14   23:aload_3         
	//   15   24:invokevirtual   #24  <Method void bci.b(int, Parcel)>
	//   16   27:return          
	}

	public final void a(byte abyte0[])
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_2        
		parcel.writeByteArray(abyte0);
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #45  <Method void Parcel.writeByteArray(byte[])>
		((bci)this).b(5, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_5        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #24  <Method void bci.b(int, Parcel)>
	//   10   16:return          
	}

	public final void a(int ai[])
	{
		ai = ((int []) (((bci)this).z()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_1        
		((Parcel) (ai)).writeIntArray(((int []) (null)));
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:invokevirtual   #49  <Method void Parcel.writeIntArray(int[])>
		((bci)this).b(4, ((Parcel) (ai)));
	//    6   10:aload_0         
	//    7   11:iconst_4        
	//    8   12:aload_1         
	//    9   13:invokevirtual   #24  <Method void bci.b(int, Parcel)>
	//   10   16:return          
	}

	public final void b(int i)
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
}
