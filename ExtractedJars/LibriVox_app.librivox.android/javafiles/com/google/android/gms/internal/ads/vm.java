// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzawo

public final class vm
	implements android.os.Parcelable.Creator
{

	public vm()
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
		String s1 = null;
	//    3    5:aconst_null     
	//    4    6:astore          11
		String s = s1;
	//    5    8:aload           11
	//    6   10:astore          8
		Object obj = ((Object) (s));
	//    7   12:aload           8
	//    8   14:astore          9
		Object obj1 = obj;
	//    9   16:aload           9
	//   10   18:astore          10
		boolean flag3 = false;
	//   11   20:iconst_0        
	//   12   21:istore          7
		boolean flag2 = false;
	//   13   23:iconst_0        
	//   14   24:istore          6
		boolean flag1 = false;
	//   15   26:iconst_0        
	//   16   27:istore          5
		boolean flag = false;
	//   17   29:iconst_0        
	//   18   30:istore          4
		do
			if(parcel.dataPosition() < i)
	//*  19   32:aload_1         
	//*  20   33:invokevirtual   #25  <Method int Parcel.dataPosition()>
	//*  21   36:iload_2         
	//*  22   37:icmpge          184
			{
				int j = a.a(parcel);
	//   23   40:aload_1         
	//   24   41:invokestatic    #28  <Method int a.a(Parcel)>
	//   25   44:istore_3        
				switch(a.a(j))
	//*  26   45:iload_3         
	//*  27   46:invokestatic    #31  <Method int a.a(int)>
				{
	//*  28   49:tableswitch     2 9: default 96
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

	//*  32  101:goto            32
				case 9: // '\t'
					obj1 = ((Object) (a.B(parcel, j)));
	//   33  104:aload_1         
	//   34  105:iload_3         
	//   35  106:invokestatic    #38  <Method java.util.ArrayList a.B(Parcel, int)>
	//   36  109:astore          10
					break;

	//*  37  111:goto            32
				case 8: // '\b'
					flag = a.c(parcel, j);
	//   38  114:aload_1         
	//   39  115:iload_3         
	//   40  116:invokestatic    #42  <Method boolean a.c(Parcel, int)>
	//   41  119:istore          4
					break;

	//*  42  121:goto            32
				case 7: // '\007'
					flag1 = a.c(parcel, j);
	//   43  124:aload_1         
	//   44  125:iload_3         
	//   45  126:invokestatic    #42  <Method boolean a.c(Parcel, int)>
	//   46  129:istore          5
					break;

	//*  47  131:goto            32
				case 6: // '\006'
					obj = ((Object) (a.B(parcel, j)));
	//   48  134:aload_1         
	//   49  135:iload_3         
	//   50  136:invokestatic    #38  <Method java.util.ArrayList a.B(Parcel, int)>
	//   51  139:astore          9
					break;

	//*  52  141:goto            32
				case 5: // '\005'
					flag2 = a.c(parcel, j);
	//   53  144:aload_1         
	//   54  145:iload_3         
	//   55  146:invokestatic    #42  <Method boolean a.c(Parcel, int)>
	//   56  149:istore          6
					break;

	//*  57  151:goto            32
				case 4: // '\004'
					flag3 = a.c(parcel, j);
	//   58  154:aload_1         
	//   59  155:iload_3         
	//   60  156:invokestatic    #42  <Method boolean a.c(Parcel, int)>
	//   61  159:istore          7
					break;

	//*  62  161:goto            32
				case 3: // '\003'
					s = a.n(parcel, j);
	//   63  164:aload_1         
	//   64  165:iload_3         
	//   65  166:invokestatic    #46  <Method String a.n(Parcel, int)>
	//   66  169:astore          8
					break;

	//*  67  171:goto            32
				case 2: // '\002'
					s1 = a.n(parcel, j);
	//   68  174:aload_1         
	//   69  175:iload_3         
	//   70  176:invokestatic    #46  <Method String a.n(Parcel, int)>
	//   71  179:astore          11
					break;
				}
			} else
	//*  72  181:goto            32
			{
				a.E(parcel, i);
	//   73  184:aload_1         
	//   74  185:iload_2         
	//   75  186:invokestatic    #49  <Method void a.E(Parcel, int)>
				return ((Object) (new zzawo(s1, s, flag3, flag2, ((java.util.List) (obj)), flag1, flag, ((java.util.List) (obj1)))));
	//   76  189:new             #51  <Class zzawo>
	//   77  192:dup             
	//   78  193:aload           11
	//   79  195:aload           8
	//   80  197:iload           7
	//   81  199:iload           6
	//   82  201:aload           9
	//   83  203:iload           5
	//   84  205:iload           4
	//   85  207:aload           10
	//   86  209:invokespecial   #54  <Method void zzawo(String, String, boolean, boolean, java.util.List, boolean, boolean, java.util.List)>
	//   87  212:areturn         
			}
		while(true);
	}

	public final Object[] newArray(int i)
	{
		return ((Object []) (new zzawo[i]));
	//    0    0:iload_1         
	//    1    1:anewarray       zzawo[]
	//    2    4:areturn         
	}
}
