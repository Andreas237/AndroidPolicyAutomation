// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcj, bwr

public abstract class bws extends bcj
	implements bwr
{

	public bws()
	{
		super("com.google.android.gms.ads.internal.client.IAdListener");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IAdListener">
	//    2    3:invokespecial   #13  <Method void bcj(String)>
	//    3    6:return          
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 7: default 44
	//	               1 92
	//	               2 81
	//	               3 74
	//	               4 67
	//	               5 60
	//	               6 53
	//	               7 46
		default:
			return false;
	//    2   44:iconst_0        
	//    3   45:ireturn         

		case 7: // '\007'
			e();
	//    4   46:aload_0         
	//    5   47:invokevirtual   #19  <Method void e()>
			break;

	//*   6   50:goto            96
		case 6: // '\006'
			f();
	//    7   53:aload_0         
	//    8   54:invokevirtual   #22  <Method void f()>
			break;

	//*   9   57:goto            96
		case 5: // '\005'
			d();
	//   10   60:aload_0         
	//   11   61:invokevirtual   #25  <Method void d()>
			break;

	//*  12   64:goto            96
		case 4: // '\004'
			c();
	//   13   67:aload_0         
	//   14   68:invokevirtual   #28  <Method void c()>
			break;

	//*  15   71:goto            96
		case 3: // '\003'
			b();
	//   16   74:aload_0         
	//   17   75:invokevirtual   #31  <Method void b()>
			break;

	//*  18   78:goto            96
		case 2: // '\002'
			a(parcel.readInt());
	//   19   81:aload_0         
	//   20   82:aload_2         
	//   21   83:invokevirtual   #37  <Method int Parcel.readInt()>
	//   22   86:invokevirtual   #41  <Method void a(int)>
			break;

	//*  23   89:goto            96
		case 1: // '\001'
			a();
	//   24   92:aload_0         
	//   25   93:invokevirtual   #43  <Method void a()>
			break;
		}
		parcel1.writeNoException();
	//   26   96:aload_3         
	//   27   97:invokevirtual   #46  <Method void Parcel.writeNoException()>
		return true;
	//   28  100:iconst_1        
	//   29  101:ireturn         
	}
}
