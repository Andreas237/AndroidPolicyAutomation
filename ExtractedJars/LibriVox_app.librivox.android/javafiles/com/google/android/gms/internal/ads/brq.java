// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzty

public final class brq
	implements android.os.Parcelable.Creator
{

	public brq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public final Object createFromParcel(Parcel parcel)
	{
		int i = a.b(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #19  <Method int a.b(Parcel)>
	//    2    4:istore_2        
		long l1 = 0L;
	//    3    5:lconst_0        
	//    4    6:lstore          6
		long l = l1;
	//    5    8:lload           6
	//    6   10:lstore          4
		String s3 = null;
	//    7   12:aconst_null     
	//    8   13:astore          13
		String s = s3;
	//    9   15:aload           13
	//   10   17:astore          9
		String s1 = s;
	//   11   19:aload           9
	//   12   21:astore          10
		String s2 = s1;
	//   13   23:aload           10
	//   14   25:astore          11
		Object obj = ((Object) (s2));
	//   15   27:aload           11
	//   16   29:astore          12
		boolean flag = false;
	//   17   31:iconst_0        
	//   18   32:istore          8
		do
			if(parcel.dataPosition() < i)
	//*  19   34:aload_1         
	//*  20   35:invokevirtual   #25  <Method int Parcel.dataPosition()>
	//*  21   38:iload_2         
	//*  22   39:icmpge          184
			{
				int j = a.a(parcel);
	//   23   42:aload_1         
	//   24   43:invokestatic    #28  <Method int a.a(Parcel)>
	//   25   46:istore_3        
				switch(a.a(j))
	//*  26   47:iload_3         
	//*  27   48:invokestatic    #31  <Method int a.a(int)>
				{
	//*  28   51:tableswitch     2 9: default 96
	//	               2 174
	//	               3 164
	//	               4 154
	//	               5 144
	//	               6 134
	//	               7 124
	//	               8 114
	//	               9 104
				default:
					a.b(parcel, j);
	//   29   96:aload_1         
	//   30   97:iload_3         
	//   31   98:invokestatic    #34  <Method void a.b(Parcel, int)>
					break;

	//*  32  101:goto            34
				case 9: // '\t'
					l = a.f(parcel, j);
	//   33  104:aload_1         
	//   34  105:iload_3         
	//   35  106:invokestatic    #38  <Method long a.f(Parcel, int)>
	//   36  109:lstore          4
					break;

	//*  37  111:goto            34
				case 8: // '\b'
					flag = a.c(parcel, j);
	//   38  114:aload_1         
	//   39  115:iload_3         
	//   40  116:invokestatic    #42  <Method boolean a.c(Parcel, int)>
	//   41  119:istore          8
					break;

	//*  42  121:goto            34
				case 7: // '\007'
					obj = ((Object) (a.p(parcel, j)));
	//   43  124:aload_1         
	//   44  125:iload_3         
	//   45  126:invokestatic    #46  <Method android.os.Bundle a.p(Parcel, int)>
	//   46  129:astore          12
					break;

	//*  47  131:goto            34
				case 6: // '\006'
					s2 = a.n(parcel, j);
	//   48  134:aload_1         
	//   49  135:iload_3         
	//   50  136:invokestatic    #50  <Method String a.n(Parcel, int)>
	//   51  139:astore          11
					break;

	//*  52  141:goto            34
				case 5: // '\005'
					s1 = a.n(parcel, j);
	//   53  144:aload_1         
	//   54  145:iload_3         
	//   55  146:invokestatic    #50  <Method String a.n(Parcel, int)>
	//   56  149:astore          10
					break;

	//*  57  151:goto            34
				case 4: // '\004'
					s = a.n(parcel, j);
	//   58  154:aload_1         
	//   59  155:iload_3         
	//   60  156:invokestatic    #50  <Method String a.n(Parcel, int)>
	//   61  159:astore          9
					break;

	//*  62  161:goto            34
				case 3: // '\003'
					l1 = a.f(parcel, j);
	//   63  164:aload_1         
	//   64  165:iload_3         
	//   65  166:invokestatic    #38  <Method long a.f(Parcel, int)>
	//   66  169:lstore          6
					break;

	//*  67  171:goto            34
				case 2: // '\002'
					s3 = a.n(parcel, j);
	//   68  174:aload_1         
	//   69  175:iload_3         
	//   70  176:invokestatic    #50  <Method String a.n(Parcel, int)>
	//   71  179:astore          13
					break;
				}
			} else
	//*  72  181:goto            34
			{
				a.E(parcel, i);
	//   73  184:aload_1         
	//   74  185:iload_2         
	//   75  186:invokestatic    #53  <Method void a.E(Parcel, int)>
				return ((Object) (new zzty(s3, l1, s, s1, s2, ((android.os.Bundle) (obj)), flag, l)));
	//   76  189:new             #55  <Class zzty>
	//   77  192:dup             
	//   78  193:aload           13
	//   79  195:lload           6
	//   80  197:aload           9
	//   81  199:aload           10
	//   82  201:aload           11
	//   83  203:aload           12
	//   84  205:iload           8
	//   85  207:lload           4
	//   86  209:invokespecial   #58  <Method void zzty(String, long, String, String, String, android.os.Bundle, boolean, long)>
	//   87  212:areturn         
			}
		while(true);
	}

	public final Object[] newArray(int i)
	{
		return ((Object []) (new zzty[i]));
	//    0    0:iload_1         
	//    1    1:anewarray       zzty[]
	//    2    4:areturn         
	}
}
