// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.c.b;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcj, le, bck

public abstract class lf extends bcj
	implements le
{

	public lf()
	{
		super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper">
	//    2    3:invokespecial   #13  <Method void bcj(String)>
	//    3    6:return          
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     2 22: default 100
	//	               2 459
	//	               3 442
	//	               4 425
	//	               5 408
	//	               6 391
	//	               7 374
	//	               8 355
	//	               9 338
	//	               10 321
	//	               11 304
	//	               12 287
	//	               13 270
	//	               14 253
	//	               15 236
	//	               16 219
	//	               17 200
	//	               18 181
	//	               19 170
	//	               20 152
	//	               21 120
	//	               22 102
		default:
			return false;
	//    2  100:iconst_0        
	//    3  101:ireturn         

		case 22: // '\026'
			b(b.a(parcel.readStrongBinder()));
	//    4  102:aload_0         
	//    5  103:aload_2         
	//    6  104:invokevirtual   #22  <Method android.os.IBinder Parcel.readStrongBinder()>
	//    7  107:invokestatic    #28  <Method com.google.android.gms.c.a b.a(android.os.IBinder)>
	//    8  110:invokevirtual   #32  <Method void b(com.google.android.gms.c.a)>
			parcel1.writeNoException();
	//    9  113:aload_3         
	//   10  114:invokevirtual   #35  <Method void Parcel.writeNoException()>
			break;

	//*  11  117:goto            473
		case 21: // '\025'
			a(b.a(parcel.readStrongBinder()), b.a(parcel.readStrongBinder()), b.a(parcel.readStrongBinder()));
	//   12  120:aload_0         
	//   13  121:aload_2         
	//   14  122:invokevirtual   #22  <Method android.os.IBinder Parcel.readStrongBinder()>
	//   15  125:invokestatic    #28  <Method com.google.android.gms.c.a b.a(android.os.IBinder)>
	//   16  128:aload_2         
	//   17  129:invokevirtual   #22  <Method android.os.IBinder Parcel.readStrongBinder()>
	//   18  132:invokestatic    #28  <Method com.google.android.gms.c.a b.a(android.os.IBinder)>
	//   19  135:aload_2         
	//   20  136:invokevirtual   #22  <Method android.os.IBinder Parcel.readStrongBinder()>
	//   21  139:invokestatic    #28  <Method com.google.android.gms.c.a b.a(android.os.IBinder)>
	//   22  142:invokevirtual   #38  <Method void a(com.google.android.gms.c.a, com.google.android.gms.c.a, com.google.android.gms.c.a)>
			parcel1.writeNoException();
	//   23  145:aload_3         
	//   24  146:invokevirtual   #35  <Method void Parcel.writeNoException()>
			break;

	//*  25  149:goto            473
		case 20: // '\024'
			a(b.a(parcel.readStrongBinder()));
	//   26  152:aload_0         
	//   27  153:aload_2         
	//   28  154:invokevirtual   #22  <Method android.os.IBinder Parcel.readStrongBinder()>
	//   29  157:invokestatic    #28  <Method com.google.android.gms.c.a b.a(android.os.IBinder)>
	//   30  160:invokevirtual   #40  <Method void a(com.google.android.gms.c.a)>
			parcel1.writeNoException();
	//   31  163:aload_3         
	//   32  164:invokevirtual   #35  <Method void Parcel.writeNoException()>
			break;

	//*  33  167:goto            473
		case 19: // '\023'
			r();
	//   34  170:aload_0         
	//   35  171:invokevirtual   #43  <Method void r()>
			parcel1.writeNoException();
	//   36  174:aload_3         
	//   37  175:invokevirtual   #35  <Method void Parcel.writeNoException()>
			break;

	//*  38  178:goto            473
		case 18: // '\022'
			boolean flag = q();
	//   39  181:aload_0         
	//   40  182:invokevirtual   #47  <Method boolean q()>
	//   41  185:istore          7
			parcel1.writeNoException();
	//   42  187:aload_3         
	//   43  188:invokevirtual   #35  <Method void Parcel.writeNoException()>
			bck.a(parcel1, flag);
	//   44  191:aload_3         
	//   45  192:iload           7
	//   46  194:invokestatic    #52  <Method void bck.a(Parcel, boolean)>
			break;

	//*  47  197:goto            473
		case 17: // '\021'
			boolean flag1 = p();
	//   48  200:aload_0         
	//   49  201:invokevirtual   #55  <Method boolean p()>
	//   50  204:istore          7
			parcel1.writeNoException();
	//   51  206:aload_3         
	//   52  207:invokevirtual   #35  <Method void Parcel.writeNoException()>
			bck.a(parcel1, flag1);
	//   53  210:aload_3         
	//   54  211:iload           7
	//   55  213:invokestatic    #52  <Method void bck.a(Parcel, boolean)>
			break;

	//*  56  216:goto            473
		case 16: // '\020'
			parcel = ((Parcel) (o()));
	//   57  219:aload_0         
	//   58  220:invokevirtual   #59  <Method android.os.Bundle o()>
	//   59  223:astore_2        
			parcel1.writeNoException();
	//   60  224:aload_3         
	//   61  225:invokevirtual   #35  <Method void Parcel.writeNoException()>
			com.google.android.gms.internal.ads.bck.b(parcel1, ((android.os.Parcelable) (parcel)));
	//   62  228:aload_3         
	//   63  229:aload_2         
	//   64  230:invokestatic    #62  <Method void com.google.android.gms.internal.ads.bck.b(Parcel, android.os.Parcelable)>
			break;

	//*  65  233:goto            473
		case 15: // '\017'
			parcel = ((Parcel) (n()));
	//   66  236:aload_0         
	//   67  237:invokevirtual   #66  <Method com.google.android.gms.c.a n()>
	//   68  240:astore_2        
			parcel1.writeNoException();
	//   69  241:aload_3         
	//   70  242:invokevirtual   #35  <Method void Parcel.writeNoException()>
			bck.a(parcel1, ((android.os.IInterface) (parcel)));
	//   71  245:aload_3         
	//   72  246:aload_2         
	//   73  247:invokestatic    #69  <Method void bck.a(Parcel, android.os.IInterface)>
			break;

	//*  74  250:goto            473
		case 14: // '\016'
			parcel = ((Parcel) (m()));
	//   75  253:aload_0         
	//   76  254:invokevirtual   #72  <Method com.google.android.gms.c.a m()>
	//   77  257:astore_2        
			parcel1.writeNoException();
	//   78  258:aload_3         
	//   79  259:invokevirtual   #35  <Method void Parcel.writeNoException()>
			bck.a(parcel1, ((android.os.IInterface) (parcel)));
	//   80  262:aload_3         
	//   81  263:aload_2         
	//   82  264:invokestatic    #69  <Method void bck.a(Parcel, android.os.IInterface)>
			break;

	//*  83  267:goto            473
		case 13: // '\r'
			parcel = ((Parcel) (l()));
	//   84  270:aload_0         
	//   85  271:invokevirtual   #75  <Method com.google.android.gms.c.a l()>
	//   86  274:astore_2        
			parcel1.writeNoException();
	//   87  275:aload_3         
	//   88  276:invokevirtual   #35  <Method void Parcel.writeNoException()>
			bck.a(parcel1, ((android.os.IInterface) (parcel)));
	//   89  279:aload_3         
	//   90  280:aload_2         
	//   91  281:invokestatic    #69  <Method void bck.a(Parcel, android.os.IInterface)>
			break;

	//*  92  284:goto            473
		case 12: // '\f'
			parcel = ((Parcel) (k()));
	//   93  287:aload_0         
	//   94  288:invokevirtual   #79  <Method ca k()>
	//   95  291:astore_2        
			parcel1.writeNoException();
	//   96  292:aload_3         
	//   97  293:invokevirtual   #35  <Method void Parcel.writeNoException()>
			bck.a(parcel1, ((android.os.IInterface) (parcel)));
	//   98  296:aload_3         
	//   99  297:aload_2         
	//  100  298:invokestatic    #69  <Method void bck.a(Parcel, android.os.IInterface)>
			break;

	//* 101  301:goto            473
		case 11: // '\013'
			parcel = ((Parcel) (j()));
	//  102  304:aload_0         
	//  103  305:invokevirtual   #83  <Method byg j()>
	//  104  308:astore_2        
			parcel1.writeNoException();
	//  105  309:aload_3         
	//  106  310:invokevirtual   #35  <Method void Parcel.writeNoException()>
			bck.a(parcel1, ((android.os.IInterface) (parcel)));
	//  107  313:aload_3         
	//  108  314:aload_2         
	//  109  315:invokestatic    #69  <Method void bck.a(Parcel, android.os.IInterface)>
			break;

	//* 110  318:goto            473
		case 10: // '\n'
			parcel = ((Parcel) (i()));
	//  111  321:aload_0         
	//  112  322:invokevirtual   #87  <Method String i()>
	//  113  325:astore_2        
			parcel1.writeNoException();
	//  114  326:aload_3         
	//  115  327:invokevirtual   #35  <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//  116  330:aload_3         
	//  117  331:aload_2         
	//  118  332:invokevirtual   #90  <Method void Parcel.writeString(String)>
			break;

	//* 119  335:goto            473
		case 9: // '\t'
			parcel = ((Parcel) (h()));
	//  120  338:aload_0         
	//  121  339:invokevirtual   #93  <Method String h()>
	//  122  342:astore_2        
			parcel1.writeNoException();
	//  123  343:aload_3         
	//  124  344:invokevirtual   #35  <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//  125  347:aload_3         
	//  126  348:aload_2         
	//  127  349:invokevirtual   #90  <Method void Parcel.writeString(String)>
			break;

	//* 128  352:goto            473
		case 8: // '\b'
			double d = g();
	//  129  355:aload_0         
	//  130  356:invokevirtual   #97  <Method double g()>
	//  131  359:dstore          5
			parcel1.writeNoException();
	//  132  361:aload_3         
	//  133  362:invokevirtual   #35  <Method void Parcel.writeNoException()>
			parcel1.writeDouble(d);
	//  134  365:aload_3         
	//  135  366:dload           5
	//  136  368:invokevirtual   #101 <Method void Parcel.writeDouble(double)>
			break;

	//* 137  371:goto            473
		case 7: // '\007'
			parcel = ((Parcel) (f()));
	//  138  374:aload_0         
	//  139  375:invokevirtual   #104 <Method String f()>
	//  140  378:astore_2        
			parcel1.writeNoException();
	//  141  379:aload_3         
	//  142  380:invokevirtual   #35  <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//  143  383:aload_3         
	//  144  384:aload_2         
	//  145  385:invokevirtual   #90  <Method void Parcel.writeString(String)>
			break;

	//* 146  388:goto            473
		case 6: // '\006'
			parcel = ((Parcel) (e()));
	//  147  391:aload_0         
	//  148  392:invokevirtual   #107 <Method String e()>
	//  149  395:astore_2        
			parcel1.writeNoException();
	//  150  396:aload_3         
	//  151  397:invokevirtual   #35  <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//  152  400:aload_3         
	//  153  401:aload_2         
	//  154  402:invokevirtual   #90  <Method void Parcel.writeString(String)>
			break;

	//* 155  405:goto            473
		case 5: // '\005'
			parcel = ((Parcel) (d()));
	//  156  408:aload_0         
	//  157  409:invokevirtual   #111 <Method cf d()>
	//  158  412:astore_2        
			parcel1.writeNoException();
	//  159  413:aload_3         
	//  160  414:invokevirtual   #35  <Method void Parcel.writeNoException()>
			bck.a(parcel1, ((android.os.IInterface) (parcel)));
	//  161  417:aload_3         
	//  162  418:aload_2         
	//  163  419:invokestatic    #69  <Method void bck.a(Parcel, android.os.IInterface)>
			break;

	//* 164  422:goto            473
		case 4: // '\004'
			parcel = ((Parcel) (c()));
	//  165  425:aload_0         
	//  166  426:invokevirtual   #114 <Method String c()>
	//  167  429:astore_2        
			parcel1.writeNoException();
	//  168  430:aload_3         
	//  169  431:invokevirtual   #35  <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//  170  434:aload_3         
	//  171  435:aload_2         
	//  172  436:invokevirtual   #90  <Method void Parcel.writeString(String)>
			break;

	//* 173  439:goto            473
		case 3: // '\003'
			parcel = ((Parcel) (b()));
	//  174  442:aload_0         
	//  175  443:invokevirtual   #117 <Method java.util.List b()>
	//  176  446:astore_2        
			parcel1.writeNoException();
	//  177  447:aload_3         
	//  178  448:invokevirtual   #35  <Method void Parcel.writeNoException()>
			parcel1.writeList(((java.util.List) (parcel)));
	//  179  451:aload_3         
	//  180  452:aload_2         
	//  181  453:invokevirtual   #121 <Method void Parcel.writeList(java.util.List)>
			break;

	//* 182  456:goto            473
		case 2: // '\002'
			parcel = ((Parcel) (a()));
	//  183  459:aload_0         
	//  184  460:invokevirtual   #123 <Method String a()>
	//  185  463:astore_2        
			parcel1.writeNoException();
	//  186  464:aload_3         
	//  187  465:invokevirtual   #35  <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//  188  468:aload_3         
	//  189  469:aload_2         
	//  190  470:invokevirtual   #90  <Method void Parcel.writeString(String)>
			break;
		}
		return true;
	//  191  473:iconst_1        
	//  192  474:ireturn         
	}
}
