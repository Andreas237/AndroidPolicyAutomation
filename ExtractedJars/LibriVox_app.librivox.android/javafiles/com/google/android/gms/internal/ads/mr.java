// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzans

public final class mr
	implements android.os.Parcelable.Creator
{

	public mr()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public final Object createFromParcel(Parcel parcel)
	{
		int l = a.b(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #19  <Method int a.b(Parcel)>
	//    2    4:istore          5
		int k = 0;
	//    3    6:iconst_0        
	//    4    7:istore          4
		int j = 0;
	//    5    9:iconst_0        
	//    6   10:istore_3        
		int i = 0;
	//    7   11:iconst_0        
	//    8   12:istore_2        
		do
			if(parcel.dataPosition() < l)
	//*   9   13:aload_1         
	//*  10   14:invokevirtual   #25  <Method int Parcel.dataPosition()>
	//*  11   17:iload           5
	//*  12   19:icmpge          100
			{
				int i1 = a.a(parcel);
	//   13   22:aload_1         
	//   14   23:invokestatic    #28  <Method int a.a(Parcel)>
	//   15   26:istore          6
				switch(a.a(i1))
	//*  16   28:iload           6
	//*  17   30:invokestatic    #31  <Method int a.a(int)>
				{
	//*  18   33:tableswitch     1 3: default 60
	//	               1 89
	//	               2 79
	//	               3 69
				default:
					a.b(parcel, i1);
	//   19   60:aload_1         
	//   20   61:iload           6
	//   21   63:invokestatic    #34  <Method void a.b(Parcel, int)>
					break;

	//*  22   66:goto            13
				case 3: // '\003'
					i = a.d(parcel, i1);
	//   23   69:aload_1         
	//   24   70:iload           6
	//   25   72:invokestatic    #38  <Method int a.d(Parcel, int)>
	//   26   75:istore_2        
					break;

	//*  27   76:goto            13
				case 2: // '\002'
					j = a.d(parcel, i1);
	//   28   79:aload_1         
	//   29   80:iload           6
	//   30   82:invokestatic    #38  <Method int a.d(Parcel, int)>
	//   31   85:istore_3        
					break;

	//*  32   86:goto            13
				case 1: // '\001'
					k = a.d(parcel, i1);
	//   33   89:aload_1         
	//   34   90:iload           6
	//   35   92:invokestatic    #38  <Method int a.d(Parcel, int)>
	//   36   95:istore          4
					break;
				}
			} else
	//*  37   97:goto            13
			{
				a.E(parcel, l);
	//   38  100:aload_1         
	//   39  101:iload           5
	//   40  103:invokestatic    #41  <Method void a.E(Parcel, int)>
				return ((Object) (new zzans(k, j, i)));
	//   41  106:new             #43  <Class zzans>
	//   42  109:dup             
	//   43  110:iload           4
	//   44  112:iload_3         
	//   45  113:iload_2         
	//   46  114:invokespecial   #46  <Method void zzans(int, int, int)>
	//   47  117:areturn         
			}
		while(true);
	}

	public final Object[] newArray(int i)
	{
		return ((Object []) (new zzans[i]));
	//    0    0:iload_1         
	//    1    1:anewarray       zzans[]
	//    2    4:areturn         
	}
}
