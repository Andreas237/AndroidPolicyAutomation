// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzwf

public final class bvx
	implements android.os.Parcelable.Creator
{

	public bvx()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public final Object createFromParcel(Parcel parcel)
	{
		int i1 = a.b(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #19  <Method int a.b(Parcel)>
	//    2    4:istore          6
		String s = null;
	//    3    6:aconst_null     
	//    4    7:astore          13
		Object obj = ((Object) (s));
	//    5    9:aload           13
	//    6   11:astore          12
		int l = 0;
	//    7   13:iconst_0        
	//    8   14:istore          5
		int k = 0;
	//    9   16:iconst_0        
	//   10   17:istore          4
		boolean flag3 = false;
	//   11   19:iconst_0        
	//   12   20:istore          11
		int j = 0;
	//   13   22:iconst_0        
	//   14   23:istore_3        
		int i = 0;
	//   15   24:iconst_0        
	//   16   25:istore_2        
		boolean flag2 = false;
	//   17   26:iconst_0        
	//   18   27:istore          10
		boolean flag1 = false;
	//   19   29:iconst_0        
	//   20   30:istore          9
		boolean flag = false;
	//   21   32:iconst_0        
	//   22   33:istore          8
		do
			if(parcel.dataPosition() < i1)
	//*  23   35:aload_1         
	//*  24   36:invokevirtual   #25  <Method int Parcel.dataPosition()>
	//*  25   39:iload           6
	//*  26   41:icmpge          231
			{
				int j1 = a.a(parcel);
	//   27   44:aload_1         
	//   28   45:invokestatic    #28  <Method int a.a(Parcel)>
	//   29   48:istore          7
				switch(a.a(j1))
	//*  30   50:iload           7
	//*  31   52:invokestatic    #31  <Method int a.a(int)>
				{
	//*  32   55:tableswitch     2 11: default 108
	//	               2 220
	//	               3 209
	//	               4 198
	//	               5 187
	//	               6 177
	//	               7 167
	//	               8 150
	//	               9 139
	//	               10 128
	//	               11 117
				default:
					a.b(parcel, j1);
	//   33  108:aload_1         
	//   34  109:iload           7
	//   35  111:invokestatic    #34  <Method void a.b(Parcel, int)>
					break;

	//*  36  114:goto            35
				case 11: // '\013'
					flag = a.c(parcel, j1);
	//   37  117:aload_1         
	//   38  118:iload           7
	//   39  120:invokestatic    #38  <Method boolean a.c(Parcel, int)>
	//   40  123:istore          8
					break;

	//*  41  125:goto            35
				case 10: // '\n'
					flag1 = a.c(parcel, j1);
	//   42  128:aload_1         
	//   43  129:iload           7
	//   44  131:invokestatic    #38  <Method boolean a.c(Parcel, int)>
	//   45  134:istore          9
					break;

	//*  46  136:goto            35
				case 9: // '\t'
					flag2 = a.c(parcel, j1);
	//   47  139:aload_1         
	//   48  140:iload           7
	//   49  142:invokestatic    #38  <Method boolean a.c(Parcel, int)>
	//   50  145:istore          10
					break;

	//*  51  147:goto            35
				case 8: // '\b'
					obj = ((Object) ((zzwf[])a.b(parcel, j1, zzwf.CREATOR)));
	//   52  150:aload_1         
	//   53  151:iload           7
	//   54  153:getstatic       #44  <Field android.os.Parcelable$Creator zzwf.CREATOR>
	//   55  156:invokestatic    #47  <Method Object[] a.b(Parcel, int, android.os.Parcelable$Creator)>
	//   56  159:checkcast       #49  <Class zzwf[]>
	//   57  162:astore          12
					break;

	//*  58  164:goto            35
				case 7: // '\007'
					i = a.d(parcel, j1);
	//   59  167:aload_1         
	//   60  168:iload           7
	//   61  170:invokestatic    #53  <Method int a.d(Parcel, int)>
	//   62  173:istore_2        
					break;

	//*  63  174:goto            35
				case 6: // '\006'
					j = a.d(parcel, j1);
	//   64  177:aload_1         
	//   65  178:iload           7
	//   66  180:invokestatic    #53  <Method int a.d(Parcel, int)>
	//   67  183:istore_3        
					break;

	//*  68  184:goto            35
				case 5: // '\005'
					flag3 = a.c(parcel, j1);
	//   69  187:aload_1         
	//   70  188:iload           7
	//   71  190:invokestatic    #38  <Method boolean a.c(Parcel, int)>
	//   72  193:istore          11
					break;

	//*  73  195:goto            35
				case 4: // '\004'
					k = a.d(parcel, j1);
	//   74  198:aload_1         
	//   75  199:iload           7
	//   76  201:invokestatic    #53  <Method int a.d(Parcel, int)>
	//   77  204:istore          4
					break;

	//*  78  206:goto            35
				case 3: // '\003'
					l = a.d(parcel, j1);
	//   79  209:aload_1         
	//   80  210:iload           7
	//   81  212:invokestatic    #53  <Method int a.d(Parcel, int)>
	//   82  215:istore          5
					break;

	//*  83  217:goto            35
				case 2: // '\002'
					s = a.n(parcel, j1);
	//   84  220:aload_1         
	//   85  221:iload           7
	//   86  223:invokestatic    #57  <Method String a.n(Parcel, int)>
	//   87  226:astore          13
					break;
				}
			} else
	//*  88  228:goto            35
			{
				a.E(parcel, i1);
	//   89  231:aload_1         
	//   90  232:iload           6
	//   91  234:invokestatic    #60  <Method void a.E(Parcel, int)>
				return ((Object) (new zzwf(s, l, k, flag3, j, i, ((zzwf []) (obj)), flag2, flag1, flag)));
	//   92  237:new             #40  <Class zzwf>
	//   93  240:dup             
	//   94  241:aload           13
	//   95  243:iload           5
	//   96  245:iload           4
	//   97  247:iload           11
	//   98  249:iload_3         
	//   99  250:iload_2         
	//  100  251:aload           12
	//  101  253:iload           10
	//  102  255:iload           9
	//  103  257:iload           8
	//  104  259:invokespecial   #63  <Method void zzwf(String, int, int, boolean, int, int, zzwf[], boolean, boolean, boolean)>
	//  105  262:areturn         
			}
		while(true);
	}

	public final Object[] newArray(int i)
	{
		return ((Object []) (new zzwf[i]));
	//    0    0:iload_1         
	//    1    1:anewarray       zzwf[]
	//    2    4:areturn         
	}
}
