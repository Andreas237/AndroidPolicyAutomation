// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzr

public final class kd
	implements android.os.Parcelable.Creator
{

	public kd()
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
		String s3 = null;
	//    3    6:aconst_null     
	//    4    7:astore          12
		String s = s3;
	//    5    9:aload           12
	//    6   11:astore          9
		String s1 = s;
	//    7   13:aload           9
	//    8   15:astore          10
		String s2 = s1;
	//    9   17:aload           10
	//   10   19:astore          11
		int k = 0;
	//   11   21:iconst_0        
	//   12   22:istore          4
		int j = 0;
	//   13   24:iconst_0        
	//   14   25:istore_3        
		boolean flag1 = true;
	//   15   26:iconst_1        
	//   16   27:istore          8
		boolean flag = false;
	//   17   29:iconst_0        
	//   18   30:istore          7
		int i = 0;
	//   19   32:iconst_0        
	//   20   33:istore_2        
		do
			if(parcel.dataPosition() < l)
	//*  21   34:aload_1         
	//*  22   35:invokevirtual   #25  <Method int Parcel.dataPosition()>
	//*  23   38:iload           5
	//*  24   40:icmpge          210
			{
				int i1 = a.a(parcel);
	//   25   43:aload_1         
	//   26   44:invokestatic    #28  <Method int a.a(Parcel)>
	//   27   47:istore          6
				switch(a.a(i1))
	//*  28   49:iload           6
	//*  29   51:invokestatic    #31  <Method int a.a(int)>
				{
	//*  30   54:tableswitch     2 10: default 104
	//	               2 199
	//	               3 188
	//	               4 178
	//	               5 167
	//	               6 156
	//	               7 145
	//	               8 134
	//	               9 123
	//	               10 113
				default:
					a.b(parcel, i1);
	//   31  104:aload_1         
	//   32  105:iload           6
	//   33  107:invokestatic    #34  <Method void a.b(Parcel, int)>
					break;

	//*  34  110:goto            34
				case 10: // '\n'
					i = a.d(parcel, i1);
	//   35  113:aload_1         
	//   36  114:iload           6
	//   37  116:invokestatic    #38  <Method int a.d(Parcel, int)>
	//   38  119:istore_2        
					break;

	//*  39  120:goto            34
				case 9: // '\t'
					flag = a.c(parcel, i1);
	//   40  123:aload_1         
	//   41  124:iload           6
	//   42  126:invokestatic    #42  <Method boolean a.c(Parcel, int)>
	//   43  129:istore          7
					break;

	//*  44  131:goto            34
				case 8: // '\b'
					s2 = a.n(parcel, i1);
	//   45  134:aload_1         
	//   46  135:iload           6
	//   47  137:invokestatic    #46  <Method String a.n(Parcel, int)>
	//   48  140:astore          11
					break;

	//*  49  142:goto            34
				case 7: // '\007'
					flag1 = a.c(parcel, i1);
	//   50  145:aload_1         
	//   51  146:iload           6
	//   52  148:invokestatic    #42  <Method boolean a.c(Parcel, int)>
	//   53  151:istore          8
					break;

	//*  54  153:goto            34
				case 6: // '\006'
					s1 = a.n(parcel, i1);
	//   55  156:aload_1         
	//   56  157:iload           6
	//   57  159:invokestatic    #46  <Method String a.n(Parcel, int)>
	//   58  162:astore          10
					break;

	//*  59  164:goto            34
				case 5: // '\005'
					s = a.n(parcel, i1);
	//   60  167:aload_1         
	//   61  168:iload           6
	//   62  170:invokestatic    #46  <Method String a.n(Parcel, int)>
	//   63  173:astore          9
					break;

	//*  64  175:goto            34
				case 4: // '\004'
					j = a.d(parcel, i1);
	//   65  178:aload_1         
	//   66  179:iload           6
	//   67  181:invokestatic    #38  <Method int a.d(Parcel, int)>
	//   68  184:istore_3        
					break;

	//*  69  185:goto            34
				case 3: // '\003'
					k = a.d(parcel, i1);
	//   70  188:aload_1         
	//   71  189:iload           6
	//   72  191:invokestatic    #38  <Method int a.d(Parcel, int)>
	//   73  194:istore          4
					break;

	//*  74  196:goto            34
				case 2: // '\002'
					s3 = a.n(parcel, i1);
	//   75  199:aload_1         
	//   76  200:iload           6
	//   77  202:invokestatic    #46  <Method String a.n(Parcel, int)>
	//   78  205:astore          12
					break;
				}
			} else
	//*  79  207:goto            34
			{
				a.E(parcel, l);
	//   80  210:aload_1         
	//   81  211:iload           5
	//   82  213:invokestatic    #49  <Method void a.E(Parcel, int)>
				return ((Object) (new zzr(s3, k, j, s, s1, flag1, s2, flag, i)));
	//   83  216:new             #51  <Class zzr>
	//   84  219:dup             
	//   85  220:aload           12
	//   86  222:iload           4
	//   87  224:iload_3         
	//   88  225:aload           9
	//   89  227:aload           10
	//   90  229:iload           8
	//   91  231:aload           11
	//   92  233:iload           7
	//   93  235:iload_2         
	//   94  236:invokespecial   #54  <Method void zzr(String, int, int, String, String, boolean, String, boolean, int)>
	//   95  239:areturn         
			}
		while(true);
	}

	public final Object[] newArray(int i)
	{
		return ((Object []) (new zzr[i]));
	//    0    0:iload_1         
	//    1    1:anewarray       zzr[]
	//    2    4:areturn         
	}
}
