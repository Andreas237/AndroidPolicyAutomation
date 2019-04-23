// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcj, byj, bck

public abstract class byk extends bcj
	implements byj
{

	public byk()
	{
		super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks">
	//    2    3:invokespecial   #13  <Method void bcj(String)>
	//    3    6:return          
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 5: default 36
	//	               1 70
	//	               2 63
	//	               3 56
	//	               4 49
	//	               5 38
		default:
			return false;
	//    2   36:iconst_0        
	//    3   37:ireturn         

		case 5: // '\005'
			a(bck.a(parcel));
	//    4   38:aload_0         
	//    5   39:aload_2         
	//    6   40:invokestatic    #22  <Method boolean bck.a(Parcel)>
	//    7   43:invokevirtual   #25  <Method void a(boolean)>
			break;

	//*   8   46:goto            74
		case 4: // '\004'
			d();
	//    9   49:aload_0         
	//   10   50:invokevirtual   #28  <Method void d()>
			break;

	//*  11   53:goto            74
		case 3: // '\003'
			c();
	//   12   56:aload_0         
	//   13   57:invokevirtual   #31  <Method void c()>
			break;

	//*  14   60:goto            74
		case 2: // '\002'
			b();
	//   15   63:aload_0         
	//   16   64:invokevirtual   #34  <Method void b()>
			break;

	//*  17   67:goto            74
		case 1: // '\001'
			a();
	//   18   70:aload_0         
	//   19   71:invokevirtual   #36  <Method void a()>
			break;
		}
		parcel1.writeNoException();
	//   20   74:aload_3         
	//   21   75:invokevirtual   #41  <Method void Parcel.writeNoException()>
		return true;
	//   22   78:iconst_1        
	//   23   79:ireturn         
	}
}
