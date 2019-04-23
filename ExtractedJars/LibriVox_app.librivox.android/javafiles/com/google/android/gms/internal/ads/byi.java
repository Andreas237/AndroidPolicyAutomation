// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bci, byg, bck, byj, 
//			byl

public final class byi extends bci
	implements byg
{

	byi(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.client.IVideoController");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IVideoController">
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

	public final void a(byj byj1)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_2        
		bck.a(parcel, ((android.os.IInterface) (byj1)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #30  <Method void bck.a(Parcel, android.os.IInterface)>
		((bci)this).b(8, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          8
	//    8   13:aload_2         
	//    9   14:invokevirtual   #24  <Method void bci.b(int, Parcel)>
	//   10   17:return          
	}

	public final void a(boolean flag)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_2        
		bck.a(parcel, flag);
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:invokestatic    #34  <Method void bck.a(Parcel, boolean)>
		((bci)this).b(3, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_3        
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

	public final boolean c()
	{
		Parcel parcel = ((bci)this).a(4, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    6:invokevirtual   #39  <Method Parcel bci.a(int, Parcel)>
	//    5    9:astore_2        
		boolean flag = bck.a(parcel);
	//    6   10:aload_2         
	//    7   11:invokestatic    #42  <Method boolean bck.a(Parcel)>
	//    8   14:istore_1        
		parcel.recycle();
	//    9   15:aload_2         
	//   10   16:invokevirtual   #47  <Method void Parcel.recycle()>
		return flag;
	//   11   19:iload_1         
	//   12   20:ireturn         
	}

	public final int d()
	{
		Parcel parcel = ((bci)this).a(5, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:iconst_5        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    6:invokevirtual   #39  <Method Parcel bci.a(int, Parcel)>
	//    5    9:astore_2        
		int k = parcel.readInt();
	//    6   10:aload_2         
	//    7   11:invokevirtual   #52  <Method int Parcel.readInt()>
	//    8   14:istore_1        
		parcel.recycle();
	//    9   15:aload_2         
	//   10   16:invokevirtual   #47  <Method void Parcel.recycle()>
		return k;
	//   11   19:iload_1         
	//   12   20:ireturn         
	}

	public final float e()
	{
		Parcel parcel = ((bci)this).a(6, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:bipush          6
	//    2    3:aload_0         
	//    3    4:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    7:invokevirtual   #39  <Method Parcel bci.a(int, Parcel)>
	//    5   10:astore_2        
		float f1 = parcel.readFloat();
	//    6   11:aload_2         
	//    7   12:invokevirtual   #57  <Method float Parcel.readFloat()>
	//    8   15:fstore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #47  <Method void Parcel.recycle()>
		return f1;
	//   11   20:fload_1         
	//   12   21:freturn         
	}

	public final float f()
	{
		Parcel parcel = ((bci)this).a(7, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:bipush          7
	//    2    3:aload_0         
	//    3    4:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    7:invokevirtual   #39  <Method Parcel bci.a(int, Parcel)>
	//    5   10:astore_2        
		float f1 = parcel.readFloat();
	//    6   11:aload_2         
	//    7   12:invokevirtual   #57  <Method float Parcel.readFloat()>
	//    8   15:fstore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #47  <Method void Parcel.recycle()>
		return f1;
	//   11   20:fload_1         
	//   12   21:freturn         
	}

	public final byj g()
	{
		Parcel parcel = ((bci)this).a(11, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:bipush          11
	//    2    3:aload_0         
	//    3    4:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    7:invokevirtual   #39  <Method Parcel bci.a(int, Parcel)>
	//    5   10:astore_2        
		Object obj = ((Object) (parcel.readStrongBinder()));
	//    6   11:aload_2         
	//    7   12:invokevirtual   #64  <Method IBinder Parcel.readStrongBinder()>
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
			android.os.IInterface iinterface = ((IBinder) (obj)).queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
	//   14   25:aload_1         
	//   15   26:ldc1            #66  <String "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks">
	//   16   28:invokeinterface #72  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   17   33:astore_3        
			if(iinterface instanceof byj)
	//*  18   34:aload_3         
	//*  19   35:instanceof      #74  <Class byj>
	//*  20   38:ifeq            49
				obj = ((Object) ((byj)iinterface));
	//   21   41:aload_3         
	//   22   42:checkcast       #74  <Class byj>
	//   23   45:astore_1        
			else
	//*  24   46:goto            58
				obj = ((Object) (new byl(((IBinder) (obj)))));
	//   25   49:new             #76  <Class byl>
	//   26   52:dup             
	//   27   53:aload_1         
	//   28   54:invokespecial   #78  <Method void byl(IBinder)>
	//   29   57:astore_1        
		}
		parcel.recycle();
	//   30   58:aload_2         
	//   31   59:invokevirtual   #47  <Method void Parcel.recycle()>
		return ((byj) (obj));
	//   32   62:aload_1         
	//   33   63:areturn         
	}

	public final float h()
	{
		Parcel parcel = ((bci)this).a(9, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:bipush          9
	//    2    3:aload_0         
	//    3    4:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    7:invokevirtual   #39  <Method Parcel bci.a(int, Parcel)>
	//    5   10:astore_2        
		float f1 = parcel.readFloat();
	//    6   11:aload_2         
	//    7   12:invokevirtual   #57  <Method float Parcel.readFloat()>
	//    8   15:fstore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #47  <Method void Parcel.recycle()>
		return f1;
	//   11   20:fload_1         
	//   12   21:freturn         
	}

	public final boolean i()
	{
		Parcel parcel = ((bci)this).a(10, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:aload_0         
	//    3    4:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    7:invokevirtual   #39  <Method Parcel bci.a(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = bck.a(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #42  <Method boolean bck.a(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #47  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public final boolean j()
	{
		Parcel parcel = ((bci)this).a(12, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:bipush          12
	//    2    3:aload_0         
	//    3    4:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    7:invokevirtual   #39  <Method Parcel bci.a(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = bck.a(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #42  <Method boolean bck.a(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #47  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}
}
