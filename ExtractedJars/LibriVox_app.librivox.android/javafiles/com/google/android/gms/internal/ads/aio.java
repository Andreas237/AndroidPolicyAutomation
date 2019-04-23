// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbjg

public final class aio
	implements android.os.Parcelable.Creator
{

	public aio()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public final Object createFromParcel(Parcel parcel)
	{
		int j = a.b(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #19  <Method int a.b(Parcel)>
	//    2    4:istore_3        
		String s1 = null;
	//    3    5:aconst_null     
	//    4    6:astore          6
		int i = 0;
	//    5    8:iconst_0        
	//    6    9:istore_2        
		String s = null;
	//    7   10:aconst_null     
	//    8   11:astore          5
		do
			if(parcel.dataPosition() < j)
	//*   9   13:aload_1         
	//*  10   14:invokevirtual   #25  <Method int Parcel.dataPosition()>
	//*  11   17:iload_3         
	//*  12   18:icmpge          101
			{
				int k = a.a(parcel);
	//   13   21:aload_1         
	//   14   22:invokestatic    #28  <Method int a.a(Parcel)>
	//   15   25:istore          4
				switch(a.a(k))
	//*  16   27:iload           4
	//*  17   29:invokestatic    #31  <Method int a.a(int)>
				{
	//*  18   32:tableswitch     1 3: default 60
	//	               1 91
	//	               2 80
	//	               3 69
				default:
					a.b(parcel, k);
	//   19   60:aload_1         
	//   20   61:iload           4
	//   21   63:invokestatic    #34  <Method void a.b(Parcel, int)>
					break;

	//*  22   66:goto            13
				case 3: // '\003'
					s = a.n(parcel, k);
	//   23   69:aload_1         
	//   24   70:iload           4
	//   25   72:invokestatic    #38  <Method String a.n(Parcel, int)>
	//   26   75:astore          5
					break;

	//*  27   77:goto            13
				case 2: // '\002'
					s1 = a.n(parcel, k);
	//   28   80:aload_1         
	//   29   81:iload           4
	//   30   83:invokestatic    #38  <Method String a.n(Parcel, int)>
	//   31   86:astore          6
					break;

	//*  32   88:goto            13
				case 1: // '\001'
					i = a.d(parcel, k);
	//   33   91:aload_1         
	//   34   92:iload           4
	//   35   94:invokestatic    #42  <Method int a.d(Parcel, int)>
	//   36   97:istore_2        
					break;
				}
			} else
	//*  37   98:goto            13
			{
				a.E(parcel, j);
	//   38  101:aload_1         
	//   39  102:iload_3         
	//   40  103:invokestatic    #45  <Method void a.E(Parcel, int)>
				return ((Object) (new zzbjg(i, s1, s)));
	//   41  106:new             #47  <Class zzbjg>
	//   42  109:dup             
	//   43  110:iload_2         
	//   44  111:aload           6
	//   45  113:aload           5
	//   46  115:invokespecial   #50  <Method void zzbjg(int, String, String)>
	//   47  118:areturn         
			}
		while(true);
	}

	public final Object[] newArray(int i)
	{
		return ((Object []) (new zzbjg[i]));
	//    0    0:iload_1         
	//    1    1:anewarray       zzbjg[]
	//    2    4:areturn         
	}
}
