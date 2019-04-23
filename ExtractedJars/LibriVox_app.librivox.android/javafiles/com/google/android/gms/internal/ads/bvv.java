// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzvv, zzzs, zzwb

public final class bvv
	implements android.os.Parcelable.Creator
{

	public bvv()
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
		android.os.Bundle bundle = null;
	//    3    6:aconst_null     
	//    4    7:astore          25
		Object obj = ((Object) (bundle));
	//    5    9:aload           25
	//    6   11:astore          13
		Object obj1 = obj;
	//    7   13:aload           13
	//    8   15:astore          14
		Object obj2 = obj1;
	//    9   17:aload           14
	//   10   19:astore          15
		Object obj3 = obj2;
	//   11   21:aload           15
	//   12   23:astore          16
		Object obj4 = obj3;
	//   13   25:aload           16
	//   14   27:astore          17
		Object obj5 = obj4;
	//   15   29:aload           17
	//   16   31:astore          18
		Object obj6 = obj5;
	//   17   33:aload           18
	//   18   35:astore          19
		Object obj7 = obj6;
	//   19   37:aload           19
	//   20   39:astore          20
		Object obj8 = obj7;
	//   21   41:aload           20
	//   22   43:astore          21
		Object obj9 = obj8;
	//   23   45:aload           21
	//   24   47:astore          22
		Object obj10 = obj9;
	//   25   49:aload           22
	//   26   51:astore          23
		Object obj11 = obj10;
	//   27   53:aload           23
	//   28   55:astore          24
		long l1 = 0L;
	//   29   57:lconst_0        
	//   30   58:lstore          8
		int l = 0;
	//   31   60:iconst_0        
	//   32   61:istore          5
		int k = 0;
	//   33   63:iconst_0        
	//   34   64:istore          4
		boolean flag2 = false;
	//   35   66:iconst_0        
	//   36   67:istore          12
		int j = 0;
	//   37   69:iconst_0        
	//   38   70:istore_3        
		boolean flag1 = false;
	//   39   71:iconst_0        
	//   40   72:istore          11
		boolean flag = false;
	//   41   74:iconst_0        
	//   42   75:istore          10
		int i = 0;
	//   43   77:iconst_0        
	//   44   78:istore_2        
		do
			if(parcel.dataPosition() < i1)
	//*  45   79:aload_1         
	//*  46   80:invokevirtual   #25  <Method int Parcel.dataPosition()>
	//*  47   83:iload           6
	//*  48   85:icmpge          452
			{
				int j1 = a.a(parcel);
	//   49   88:aload_1         
	//   50   89:invokestatic    #28  <Method int a.a(Parcel)>
	//   51   92:istore          7
				switch(a.a(j1))
	//*  52   94:iload           7
	//*  53   96:invokestatic    #31  <Method int a.a(int)>
				{
	//*  54   99:tableswitch     1 21: default 196
	//	               1 441
	//	               2 430
	//	               3 419
	//	               4 408
	//	               5 397
	//	               6 386
	//	               7 376
	//	               8 365
	//	               9 354
	//	               10 337
	//	               11 320
	//	               12 309
	//	               13 298
	//	               14 287
	//	               15 276
	//	               16 265
	//	               17 254
	//	               18 243
	//	               19 226
	//	               20 216
	//	               21 205
				default:
					a.b(parcel, j1);
	//   55  196:aload_1         
	//   56  197:iload           7
	//   57  199:invokestatic    #34  <Method void a.b(Parcel, int)>
					break;

	//*  58  202:goto            79
				case 21: // '\025'
					obj11 = ((Object) (a.n(parcel, j1)));
	//   59  205:aload_1         
	//   60  206:iload           7
	//   61  208:invokestatic    #38  <Method String a.n(Parcel, int)>
	//   62  211:astore          24
					break;

	//*  63  213:goto            79
				case 20: // '\024'
					i = a.d(parcel, j1);
	//   64  216:aload_1         
	//   65  217:iload           7
	//   66  219:invokestatic    #42  <Method int a.d(Parcel, int)>
	//   67  222:istore_2        
					break;

	//*  68  223:goto            79
				case 19: // '\023'
					obj10 = ((Object) ((zzvv)a.a(parcel, j1, zzvv.CREATOR)));
	//   69  226:aload_1         
	//   70  227:iload           7
	//   71  229:getstatic       #48  <Field android.os.Parcelable$Creator zzvv.CREATOR>
	//   72  232:invokestatic    #51  <Method android.os.Parcelable a.a(Parcel, int, android.os.Parcelable$Creator)>
	//   73  235:checkcast       #44  <Class zzvv>
	//   74  238:astore          23
					break;

	//*  75  240:goto            79
				case 18: // '\022'
					flag = a.c(parcel, j1);
	//   76  243:aload_1         
	//   77  244:iload           7
	//   78  246:invokestatic    #55  <Method boolean a.c(Parcel, int)>
	//   79  249:istore          10
					break;

	//*  80  251:goto            79
				case 17: // '\021'
					obj9 = ((Object) (a.n(parcel, j1)));
	//   81  254:aload_1         
	//   82  255:iload           7
	//   83  257:invokestatic    #38  <Method String a.n(Parcel, int)>
	//   84  260:astore          22
					break;

	//*  85  262:goto            79
				case 16: // '\020'
					obj8 = ((Object) (a.n(parcel, j1)));
	//   86  265:aload_1         
	//   87  266:iload           7
	//   88  268:invokestatic    #38  <Method String a.n(Parcel, int)>
	//   89  271:astore          21
					break;

	//*  90  273:goto            79
				case 15: // '\017'
					obj7 = ((Object) (a.B(parcel, j1)));
	//   91  276:aload_1         
	//   92  277:iload           7
	//   93  279:invokestatic    #59  <Method java.util.ArrayList a.B(Parcel, int)>
	//   94  282:astore          20
					break;

	//*  95  284:goto            79
				case 14: // '\016'
					obj6 = ((Object) (a.p(parcel, j1)));
	//   96  287:aload_1         
	//   97  288:iload           7
	//   98  290:invokestatic    #63  <Method android.os.Bundle a.p(Parcel, int)>
	//   99  293:astore          19
					break;

	//* 100  295:goto            79
				case 13: // '\r'
					obj5 = ((Object) (a.p(parcel, j1)));
	//  101  298:aload_1         
	//  102  299:iload           7
	//  103  301:invokestatic    #63  <Method android.os.Bundle a.p(Parcel, int)>
	//  104  304:astore          18
					break;

	//* 105  306:goto            79
				case 12: // '\f'
					obj4 = ((Object) (a.n(parcel, j1)));
	//  106  309:aload_1         
	//  107  310:iload           7
	//  108  312:invokestatic    #38  <Method String a.n(Parcel, int)>
	//  109  315:astore          17
					break;

	//* 110  317:goto            79
				case 11: // '\013'
					obj3 = ((Object) ((Location)a.a(parcel, j1, Location.CREATOR)));
	//  111  320:aload_1         
	//  112  321:iload           7
	//  113  323:getstatic       #66  <Field android.os.Parcelable$Creator Location.CREATOR>
	//  114  326:invokestatic    #51  <Method android.os.Parcelable a.a(Parcel, int, android.os.Parcelable$Creator)>
	//  115  329:checkcast       #65  <Class Location>
	//  116  332:astore          16
					break;

	//* 117  334:goto            79
				case 10: // '\n'
					obj2 = ((Object) ((zzzs)a.a(parcel, j1, zzzs.CREATOR)));
	//  118  337:aload_1         
	//  119  338:iload           7
	//  120  340:getstatic       #69  <Field android.os.Parcelable$Creator zzzs.CREATOR>
	//  121  343:invokestatic    #51  <Method android.os.Parcelable a.a(Parcel, int, android.os.Parcelable$Creator)>
	//  122  346:checkcast       #68  <Class zzzs>
	//  123  349:astore          15
					break;

	//* 124  351:goto            79
				case 9: // '\t'
					obj1 = ((Object) (a.n(parcel, j1)));
	//  125  354:aload_1         
	//  126  355:iload           7
	//  127  357:invokestatic    #38  <Method String a.n(Parcel, int)>
	//  128  360:astore          14
					break;

	//* 129  362:goto            79
				case 8: // '\b'
					flag1 = a.c(parcel, j1);
	//  130  365:aload_1         
	//  131  366:iload           7
	//  132  368:invokestatic    #55  <Method boolean a.c(Parcel, int)>
	//  133  371:istore          11
					break;

	//* 134  373:goto            79
				case 7: // '\007'
					j = a.d(parcel, j1);
	//  135  376:aload_1         
	//  136  377:iload           7
	//  137  379:invokestatic    #42  <Method int a.d(Parcel, int)>
	//  138  382:istore_3        
					break;

	//* 139  383:goto            79
				case 6: // '\006'
					flag2 = a.c(parcel, j1);
	//  140  386:aload_1         
	//  141  387:iload           7
	//  142  389:invokestatic    #55  <Method boolean a.c(Parcel, int)>
	//  143  392:istore          12
					break;

	//* 144  394:goto            79
				case 5: // '\005'
					obj = ((Object) (a.B(parcel, j1)));
	//  145  397:aload_1         
	//  146  398:iload           7
	//  147  400:invokestatic    #59  <Method java.util.ArrayList a.B(Parcel, int)>
	//  148  403:astore          13
					break;

	//* 149  405:goto            79
				case 4: // '\004'
					k = a.d(parcel, j1);
	//  150  408:aload_1         
	//  151  409:iload           7
	//  152  411:invokestatic    #42  <Method int a.d(Parcel, int)>
	//  153  414:istore          4
					break;

	//* 154  416:goto            79
				case 3: // '\003'
					bundle = a.p(parcel, j1);
	//  155  419:aload_1         
	//  156  420:iload           7
	//  157  422:invokestatic    #63  <Method android.os.Bundle a.p(Parcel, int)>
	//  158  425:astore          25
					break;

	//* 159  427:goto            79
				case 2: // '\002'
					l1 = a.f(parcel, j1);
	//  160  430:aload_1         
	//  161  431:iload           7
	//  162  433:invokestatic    #73  <Method long a.f(Parcel, int)>
	//  163  436:lstore          8
					break;

	//* 164  438:goto            79
				case 1: // '\001'
					l = a.d(parcel, j1);
	//  165  441:aload_1         
	//  166  442:iload           7
	//  167  444:invokestatic    #42  <Method int a.d(Parcel, int)>
	//  168  447:istore          5
					break;
				}
			} else
	//* 169  449:goto            79
			{
				a.E(parcel, i1);
	//  170  452:aload_1         
	//  171  453:iload           6
	//  172  455:invokestatic    #76  <Method void a.E(Parcel, int)>
				return ((Object) (new zzwb(l, l1, bundle, k, ((java.util.List) (obj)), flag2, j, flag1, ((String) (obj1)), ((zzzs) (obj2)), ((Location) (obj3)), ((String) (obj4)), ((android.os.Bundle) (obj5)), ((android.os.Bundle) (obj6)), ((java.util.List) (obj7)), ((String) (obj8)), ((String) (obj9)), flag, ((zzvv) (obj10)), i, ((String) (obj11)))));
	//  173  458:new             #78  <Class zzwb>
	//  174  461:dup             
	//  175  462:iload           5
	//  176  464:lload           8
	//  177  466:aload           25
	//  178  468:iload           4
	//  179  470:aload           13
	//  180  472:iload           12
	//  181  474:iload_3         
	//  182  475:iload           11
	//  183  477:aload           14
	//  184  479:aload           15
	//  185  481:aload           16
	//  186  483:aload           17
	//  187  485:aload           18
	//  188  487:aload           19
	//  189  489:aload           20
	//  190  491:aload           21
	//  191  493:aload           22
	//  192  495:iload           10
	//  193  497:aload           23
	//  194  499:iload_2         
	//  195  500:aload           24
	//  196  502:invokespecial   #81  <Method void zzwb(int, long, android.os.Bundle, int, java.util.List, boolean, int, boolean, String, zzzs, Location, String, android.os.Bundle, android.os.Bundle, java.util.List, String, String, boolean, zzvv, int, String)>
	//  197  505:areturn         
			}
		while(true);
	}

	public final Object[] newArray(int i)
	{
		return ((Object []) (new zzwb[i]));
	//    0    0:iload_1         
	//    1    1:anewarray       zzwb[]
	//    2    4:areturn         
	}
}
