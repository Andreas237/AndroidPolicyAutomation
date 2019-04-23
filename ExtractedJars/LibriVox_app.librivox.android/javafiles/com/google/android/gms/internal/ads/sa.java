// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbi, zzatb

public final class sa
	implements android.os.Parcelable.Creator
{

	public sa()
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
		android.os.Bundle bundle = null;
	//    3    5:aconst_null     
	//    4    6:astore          12
		Object obj = ((Object) (bundle));
	//    5    8:aload           12
	//    6   10:astore          5
		Object obj1 = obj;
	//    7   12:aload           5
	//    8   14:astore          6
		Object obj2 = obj1;
	//    9   16:aload           6
	//   10   18:astore          7
		Object obj3 = obj2;
	//   11   20:aload           7
	//   12   22:astore          8
		Object obj4 = obj3;
	//   13   24:aload           8
	//   14   26:astore          9
		Object obj5 = obj4;
	//   15   28:aload           9
	//   16   30:astore          10
		Object obj6 = obj5;
	//   17   32:aload           10
	//   18   34:astore          11
		boolean flag = false;
	//   19   36:iconst_0        
	//   20   37:istore          4
		do
			if(parcel.dataPosition() < i)
	//*  21   39:aload_1         
	//*  22   40:invokevirtual   #25  <Method int Parcel.dataPosition()>
	//*  23   43:iload_2         
	//*  24   44:icmpge          224
			{
				int j = a.a(parcel);
	//   25   47:aload_1         
	//   26   48:invokestatic    #28  <Method int a.a(Parcel)>
	//   27   51:istore_3        
				switch(a.a(j))
	//*  28   52:iload_3         
	//*  29   53:invokestatic    #31  <Method int a.a(int)>
				{
	//*  30   56:tableswitch     1 9: default 108
	//	               1 214
	//	               2 198
	//	               3 182
	//	               4 172
	//	               5 162
	//	               6 146
	//	               7 136
	//	               8 126
	//	               9 116
				default:
					a.b(parcel, j);
	//   31  108:aload_1         
	//   32  109:iload_3         
	//   33  110:invokestatic    #34  <Method void a.b(Parcel, int)>
					break;

	//*  34  113:goto            39
				case 9: // '\t'
					obj6 = ((Object) (a.n(parcel, j)));
	//   35  116:aload_1         
	//   36  117:iload_3         
	//   37  118:invokestatic    #38  <Method String a.n(Parcel, int)>
	//   38  121:astore          11
					break;

	//*  39  123:goto            39
				case 8: // '\b'
					flag = a.c(parcel, j);
	//   40  126:aload_1         
	//   41  127:iload_3         
	//   42  128:invokestatic    #42  <Method boolean a.c(Parcel, int)>
	//   43  131:istore          4
					break;

	//*  44  133:goto            39
				case 7: // '\007'
					obj5 = ((Object) (a.n(parcel, j)));
	//   45  136:aload_1         
	//   46  137:iload_3         
	//   47  138:invokestatic    #38  <Method String a.n(Parcel, int)>
	//   48  141:astore          10
					break;

	//*  49  143:goto            39
				case 6: // '\006'
					obj4 = ((Object) ((PackageInfo)a.a(parcel, j, PackageInfo.CREATOR)));
	//   50  146:aload_1         
	//   51  147:iload_3         
	//   52  148:getstatic       #48  <Field android.os.Parcelable$Creator PackageInfo.CREATOR>
	//   53  151:invokestatic    #51  <Method android.os.Parcelable a.a(Parcel, int, android.os.Parcelable$Creator)>
	//   54  154:checkcast       #44  <Class PackageInfo>
	//   55  157:astore          9
					break;

	//*  56  159:goto            39
				case 5: // '\005'
					obj3 = ((Object) (a.B(parcel, j)));
	//   57  162:aload_1         
	//   58  163:iload_3         
	//   59  164:invokestatic    #55  <Method java.util.ArrayList a.B(Parcel, int)>
	//   60  167:astore          8
					break;

	//*  61  169:goto            39
				case 4: // '\004'
					obj2 = ((Object) (a.n(parcel, j)));
	//   62  172:aload_1         
	//   63  173:iload_3         
	//   64  174:invokestatic    #38  <Method String a.n(Parcel, int)>
	//   65  177:astore          7
					break;

	//*  66  179:goto            39
				case 3: // '\003'
					obj1 = ((Object) ((ApplicationInfo)a.a(parcel, j, ApplicationInfo.CREATOR)));
	//   67  182:aload_1         
	//   68  183:iload_3         
	//   69  184:getstatic       #58  <Field android.os.Parcelable$Creator ApplicationInfo.CREATOR>
	//   70  187:invokestatic    #51  <Method android.os.Parcelable a.a(Parcel, int, android.os.Parcelable$Creator)>
	//   71  190:checkcast       #57  <Class ApplicationInfo>
	//   72  193:astore          6
					break;

	//*  73  195:goto            39
				case 2: // '\002'
					obj = ((Object) ((zzbbi)a.a(parcel, j, zzbbi.CREATOR)));
	//   74  198:aload_1         
	//   75  199:iload_3         
	//   76  200:getstatic       #61  <Field android.os.Parcelable$Creator zzbbi.CREATOR>
	//   77  203:invokestatic    #51  <Method android.os.Parcelable a.a(Parcel, int, android.os.Parcelable$Creator)>
	//   78  206:checkcast       #60  <Class zzbbi>
	//   79  209:astore          5
					break;

	//*  80  211:goto            39
				case 1: // '\001'
					bundle = a.p(parcel, j);
	//   81  214:aload_1         
	//   82  215:iload_3         
	//   83  216:invokestatic    #65  <Method android.os.Bundle a.p(Parcel, int)>
	//   84  219:astore          12
					break;
				}
			} else
	//*  85  221:goto            39
			{
				a.E(parcel, i);
	//   86  224:aload_1         
	//   87  225:iload_2         
	//   88  226:invokestatic    #68  <Method void a.E(Parcel, int)>
				return ((Object) (new zzatb(bundle, ((zzbbi) (obj)), ((ApplicationInfo) (obj1)), ((String) (obj2)), ((java.util.List) (obj3)), ((PackageInfo) (obj4)), ((String) (obj5)), flag, ((String) (obj6)))));
	//   89  229:new             #70  <Class zzatb>
	//   90  232:dup             
	//   91  233:aload           12
	//   92  235:aload           5
	//   93  237:aload           6
	//   94  239:aload           7
	//   95  241:aload           8
	//   96  243:aload           9
	//   97  245:aload           10
	//   98  247:iload           4
	//   99  249:aload           11
	//  100  251:invokespecial   #73  <Method void zzatb(android.os.Bundle, zzbbi, ApplicationInfo, String, java.util.List, PackageInfo, String, boolean, String)>
	//  101  254:areturn         
			}
		while(true);
	}

	public final Object[] newArray(int i)
	{
		return ((Object []) (new zzatb[i]));
	//    0    0:iload_1         
	//    1    1:anewarray       zzatb[]
	//    2    4:areturn         
	}
}
