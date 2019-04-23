// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbi

public final class aal
	implements android.os.Parcelable.Creator
{

	public aal()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public final Object createFromParcel(Parcel parcel)
	{
		int k = a.b(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #19  <Method int a.b(Parcel)>
	//    2    4:istore          4
		String s = null;
	//    3    6:aconst_null     
	//    4    7:astore          8
		int j = 0;
	//    5    9:iconst_0        
	//    6   10:istore_3        
		int i = 0;
	//    7   11:iconst_0        
	//    8   12:istore_2        
		boolean flag1 = false;
	//    9   13:iconst_0        
	//   10   14:istore          7
		boolean flag = false;
	//   11   16:iconst_0        
	//   12   17:istore          6
		do
			if(parcel.dataPosition() < k)
	//*  13   19:aload_1         
	//*  14   20:invokevirtual   #25  <Method int Parcel.dataPosition()>
	//*  15   23:iload           4
	//*  16   25:icmpge          134
			{
				int l = a.a(parcel);
	//   17   28:aload_1         
	//   18   29:invokestatic    #28  <Method int a.a(Parcel)>
	//   19   32:istore          5
				switch(a.a(l))
	//*  20   34:iload           5
	//*  21   36:invokestatic    #31  <Method int a.a(int)>
				{
	//*  22   39:tableswitch     2 6: default 72
	//	               2 123
	//	               3 113
	//	               4 103
	//	               5 92
	//	               6 81
				default:
					a.b(parcel, l);
	//   23   72:aload_1         
	//   24   73:iload           5
	//   25   75:invokestatic    #34  <Method void a.b(Parcel, int)>
					break;

	//*  26   78:goto            19
				case 6: // '\006'
					flag = a.c(parcel, l);
	//   27   81:aload_1         
	//   28   82:iload           5
	//   29   84:invokestatic    #38  <Method boolean a.c(Parcel, int)>
	//   30   87:istore          6
					break;

	//*  31   89:goto            19
				case 5: // '\005'
					flag1 = a.c(parcel, l);
	//   32   92:aload_1         
	//   33   93:iload           5
	//   34   95:invokestatic    #38  <Method boolean a.c(Parcel, int)>
	//   35   98:istore          7
					break;

	//*  36  100:goto            19
				case 4: // '\004'
					i = a.d(parcel, l);
	//   37  103:aload_1         
	//   38  104:iload           5
	//   39  106:invokestatic    #42  <Method int a.d(Parcel, int)>
	//   40  109:istore_2        
					break;

	//*  41  110:goto            19
				case 3: // '\003'
					j = a.d(parcel, l);
	//   42  113:aload_1         
	//   43  114:iload           5
	//   44  116:invokestatic    #42  <Method int a.d(Parcel, int)>
	//   45  119:istore_3        
					break;

	//*  46  120:goto            19
				case 2: // '\002'
					s = a.n(parcel, l);
	//   47  123:aload_1         
	//   48  124:iload           5
	//   49  126:invokestatic    #46  <Method String a.n(Parcel, int)>
	//   50  129:astore          8
					break;
				}
			} else
	//*  51  131:goto            19
			{
				a.E(parcel, k);
	//   52  134:aload_1         
	//   53  135:iload           4
	//   54  137:invokestatic    #49  <Method void a.E(Parcel, int)>
				return ((Object) (new zzbbi(s, j, i, flag1, flag)));
	//   55  140:new             #51  <Class zzbbi>
	//   56  143:dup             
	//   57  144:aload           8
	//   58  146:iload_3         
	//   59  147:iload_2         
	//   60  148:iload           7
	//   61  150:iload           6
	//   62  152:invokespecial   #54  <Method void zzbbi(String, int, int, boolean, boolean)>
	//   63  155:areturn         
			}
		while(true);
	}

	public final Object[] newArray(int i)
	{
		return ((Object []) (new zzbbi[i]));
	//    0    0:iload_1         
	//    1    1:anewarray       zzbbi[]
	//    2    4:areturn         
	}
}
