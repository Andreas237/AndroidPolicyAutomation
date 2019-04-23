// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.c.b;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcj, lb, bck

public abstract class lc extends bcj
	implements lb
{

	public lc()
	{
		super("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper">
	//    2    3:invokespecial   #13  <Method void bcj(String)>
	//    3    6:return          
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     2 22: default 100
	//	               2 424
	//	               3 407
	//	               4 390
	//	               5 373
	//	               6 356
	//	               7 339
	//	               8 328
	//	               9 310
	//	               10 292
	//	               11 273
	//	               12 254
	//	               13 237
	//	               14 219
	//	               15 202
	//	               16 185
	//	               17 100
	//	               18 100
	//	               19 168
	//	               20 151
	//	               21 134
	//	               22 102
		case 17: // '\021'
		case 18: // '\022'
		default:
			return false;
	//    2  100:iconst_0        
	//    3  101:ireturn         

		case 22: // '\026'
			a(b.a(parcel.readStrongBinder()), b.a(parcel.readStrongBinder()), b.a(parcel.readStrongBinder()));
	//    4  102:aload_0         
	//    5  103:aload_2         
	//    6  104:invokevirtual   #22  <Method android.os.IBinder Parcel.readStrongBinder()>
	//    7  107:invokestatic    #28  <Method com.google.android.gms.c.a b.a(android.os.IBinder)>
	//    8  110:aload_2         
	//    9  111:invokevirtual   #22  <Method android.os.IBinder Parcel.readStrongBinder()>
	//   10  114:invokestatic    #28  <Method com.google.android.gms.c.a b.a(android.os.IBinder)>
	//   11  117:aload_2         
	//   12  118:invokevirtual   #22  <Method android.os.IBinder Parcel.readStrongBinder()>
	//   13  121:invokestatic    #28  <Method com.google.android.gms.c.a b.a(android.os.IBinder)>
	//   14  124:invokevirtual   #31  <Method void a(com.google.android.gms.c.a, com.google.android.gms.c.a, com.google.android.gms.c.a)>
			parcel1.writeNoException();
	//   15  127:aload_3         
	//   16  128:invokevirtual   #34  <Method void Parcel.writeNoException()>
			break;

	//*  17  131:goto            438
		case 21: // '\025'
			parcel = ((Parcel) (o()));
	//   18  134:aload_0         
	//   19  135:invokevirtual   #38  <Method com.google.android.gms.c.a o()>
	//   20  138:astore_2        
			parcel1.writeNoException();
	//   21  139:aload_3         
	//   22  140:invokevirtual   #34  <Method void Parcel.writeNoException()>
			bck.a(parcel1, ((android.os.IInterface) (parcel)));
	//   23  143:aload_3         
	//   24  144:aload_2         
	//   25  145:invokestatic    #43  <Method void bck.a(Parcel, android.os.IInterface)>
			break;

	//*  26  148:goto            438
		case 20: // '\024'
			parcel = ((Parcel) (n()));
	//   27  151:aload_0         
	//   28  152:invokevirtual   #46  <Method com.google.android.gms.c.a n()>
	//   29  155:astore_2        
			parcel1.writeNoException();
	//   30  156:aload_3         
	//   31  157:invokevirtual   #34  <Method void Parcel.writeNoException()>
			bck.a(parcel1, ((android.os.IInterface) (parcel)));
	//   32  160:aload_3         
	//   33  161:aload_2         
	//   34  162:invokestatic    #43  <Method void bck.a(Parcel, android.os.IInterface)>
			break;

	//*  35  165:goto            438
		case 19: // '\023'
			parcel = ((Parcel) (m()));
	//   36  168:aload_0         
	//   37  169:invokevirtual   #50  <Method ca m()>
	//   38  172:astore_2        
			parcel1.writeNoException();
	//   39  173:aload_3         
	//   40  174:invokevirtual   #34  <Method void Parcel.writeNoException()>
			bck.a(parcel1, ((android.os.IInterface) (parcel)));
	//   41  177:aload_3         
	//   42  178:aload_2         
	//   43  179:invokestatic    #43  <Method void bck.a(Parcel, android.os.IInterface)>
			break;

	//*  44  182:goto            438
		case 16: // '\020'
			parcel = ((Parcel) (l()));
	//   45  185:aload_0         
	//   46  186:invokevirtual   #54  <Method byg l()>
	//   47  189:astore_2        
			parcel1.writeNoException();
	//   48  190:aload_3         
	//   49  191:invokevirtual   #34  <Method void Parcel.writeNoException()>
			bck.a(parcel1, ((android.os.IInterface) (parcel)));
	//   50  194:aload_3         
	//   51  195:aload_2         
	//   52  196:invokestatic    #43  <Method void bck.a(Parcel, android.os.IInterface)>
			break;

	//*  53  199:goto            438
		case 15: // '\017'
			parcel = ((Parcel) (k()));
	//   54  202:aload_0         
	//   55  203:invokevirtual   #57  <Method com.google.android.gms.c.a k()>
	//   56  206:astore_2        
			parcel1.writeNoException();
	//   57  207:aload_3         
	//   58  208:invokevirtual   #34  <Method void Parcel.writeNoException()>
			bck.a(parcel1, ((android.os.IInterface) (parcel)));
	//   59  211:aload_3         
	//   60  212:aload_2         
	//   61  213:invokestatic    #43  <Method void bck.a(Parcel, android.os.IInterface)>
			break;

	//*  62  216:goto            438
		case 14: // '\016'
			c(b.a(parcel.readStrongBinder()));
	//   63  219:aload_0         
	//   64  220:aload_2         
	//   65  221:invokevirtual   #22  <Method android.os.IBinder Parcel.readStrongBinder()>
	//   66  224:invokestatic    #28  <Method com.google.android.gms.c.a b.a(android.os.IBinder)>
	//   67  227:invokevirtual   #61  <Method void c(com.google.android.gms.c.a)>
			parcel1.writeNoException();
	//   68  230:aload_3         
	//   69  231:invokevirtual   #34  <Method void Parcel.writeNoException()>
			break;

	//*  70  234:goto            438
		case 13: // '\r'
			parcel = ((Parcel) (j()));
	//   71  237:aload_0         
	//   72  238:invokevirtual   #65  <Method android.os.Bundle j()>
	//   73  241:astore_2        
			parcel1.writeNoException();
	//   74  242:aload_3         
	//   75  243:invokevirtual   #34  <Method void Parcel.writeNoException()>
			com.google.android.gms.internal.ads.bck.b(parcel1, ((android.os.Parcelable) (parcel)));
	//   76  246:aload_3         
	//   77  247:aload_2         
	//   78  248:invokestatic    #69  <Method void com.google.android.gms.internal.ads.bck.b(Parcel, android.os.Parcelable)>
			break;

	//*  79  251:goto            438
		case 12: // '\f'
			boolean flag = i();
	//   80  254:aload_0         
	//   81  255:invokevirtual   #73  <Method boolean i()>
	//   82  258:istore          5
			parcel1.writeNoException();
	//   83  260:aload_3         
	//   84  261:invokevirtual   #34  <Method void Parcel.writeNoException()>
			bck.a(parcel1, flag);
	//   85  264:aload_3         
	//   86  265:iload           5
	//   87  267:invokestatic    #76  <Method void bck.a(Parcel, boolean)>
			break;

	//*  88  270:goto            438
		case 11: // '\013'
			boolean flag1 = h();
	//   89  273:aload_0         
	//   90  274:invokevirtual   #79  <Method boolean h()>
	//   91  277:istore          5
			parcel1.writeNoException();
	//   92  279:aload_3         
	//   93  280:invokevirtual   #34  <Method void Parcel.writeNoException()>
			bck.a(parcel1, flag1);
	//   94  283:aload_3         
	//   95  284:iload           5
	//   96  286:invokestatic    #76  <Method void bck.a(Parcel, boolean)>
			break;

	//*  97  289:goto            438
		case 10: // '\n'
			b(b.a(parcel.readStrongBinder()));
	//   98  292:aload_0         
	//   99  293:aload_2         
	//  100  294:invokevirtual   #22  <Method android.os.IBinder Parcel.readStrongBinder()>
	//  101  297:invokestatic    #28  <Method com.google.android.gms.c.a b.a(android.os.IBinder)>
	//  102  300:invokevirtual   #81  <Method void b(com.google.android.gms.c.a)>
			parcel1.writeNoException();
	//  103  303:aload_3         
	//  104  304:invokevirtual   #34  <Method void Parcel.writeNoException()>
			break;

	//* 105  307:goto            438
		case 9: // '\t'
			a(b.a(parcel.readStrongBinder()));
	//  106  310:aload_0         
	//  107  311:aload_2         
	//  108  312:invokevirtual   #22  <Method android.os.IBinder Parcel.readStrongBinder()>
	//  109  315:invokestatic    #28  <Method com.google.android.gms.c.a b.a(android.os.IBinder)>
	//  110  318:invokevirtual   #83  <Method void a(com.google.android.gms.c.a)>
			parcel1.writeNoException();
	//  111  321:aload_3         
	//  112  322:invokevirtual   #34  <Method void Parcel.writeNoException()>
			break;

	//* 113  325:goto            438
		case 8: // '\b'
			g();
	//  114  328:aload_0         
	//  115  329:invokevirtual   #86  <Method void g()>
			parcel1.writeNoException();
	//  116  332:aload_3         
	//  117  333:invokevirtual   #34  <Method void Parcel.writeNoException()>
			break;

	//* 118  336:goto            438
		case 7: // '\007'
			parcel = ((Parcel) (f()));
	//  119  339:aload_0         
	//  120  340:invokevirtual   #90  <Method String f()>
	//  121  343:astore_2        
			parcel1.writeNoException();
	//  122  344:aload_3         
	//  123  345:invokevirtual   #34  <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//  124  348:aload_3         
	//  125  349:aload_2         
	//  126  350:invokevirtual   #93  <Method void Parcel.writeString(String)>
			break;

	//* 127  353:goto            438
		case 6: // '\006'
			parcel = ((Parcel) (e()));
	//  128  356:aload_0         
	//  129  357:invokevirtual   #96  <Method String e()>
	//  130  360:astore_2        
			parcel1.writeNoException();
	//  131  361:aload_3         
	//  132  362:invokevirtual   #34  <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//  133  365:aload_3         
	//  134  366:aload_2         
	//  135  367:invokevirtual   #93  <Method void Parcel.writeString(String)>
			break;

	//* 136  370:goto            438
		case 5: // '\005'
			parcel = ((Parcel) (d()));
	//  137  373:aload_0         
	//  138  374:invokevirtual   #100 <Method cf d()>
	//  139  377:astore_2        
			parcel1.writeNoException();
	//  140  378:aload_3         
	//  141  379:invokevirtual   #34  <Method void Parcel.writeNoException()>
			bck.a(parcel1, ((android.os.IInterface) (parcel)));
	//  142  382:aload_3         
	//  143  383:aload_2         
	//  144  384:invokestatic    #43  <Method void bck.a(Parcel, android.os.IInterface)>
			break;

	//* 145  387:goto            438
		case 4: // '\004'
			parcel = ((Parcel) (c()));
	//  146  390:aload_0         
	//  147  391:invokevirtual   #102 <Method String c()>
	//  148  394:astore_2        
			parcel1.writeNoException();
	//  149  395:aload_3         
	//  150  396:invokevirtual   #34  <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//  151  399:aload_3         
	//  152  400:aload_2         
	//  153  401:invokevirtual   #93  <Method void Parcel.writeString(String)>
			break;

	//* 154  404:goto            438
		case 3: // '\003'
			parcel = ((Parcel) (b()));
	//  155  407:aload_0         
	//  156  408:invokevirtual   #105 <Method java.util.List b()>
	//  157  411:astore_2        
			parcel1.writeNoException();
	//  158  412:aload_3         
	//  159  413:invokevirtual   #34  <Method void Parcel.writeNoException()>
			parcel1.writeList(((java.util.List) (parcel)));
	//  160  416:aload_3         
	//  161  417:aload_2         
	//  162  418:invokevirtual   #109 <Method void Parcel.writeList(java.util.List)>
			break;

	//* 163  421:goto            438
		case 2: // '\002'
			parcel = ((Parcel) (a()));
	//  164  424:aload_0         
	//  165  425:invokevirtual   #111 <Method String a()>
	//  166  428:astore_2        
			parcel1.writeNoException();
	//  167  429:aload_3         
	//  168  430:invokevirtual   #34  <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//  169  433:aload_3         
	//  170  434:aload_2         
	//  171  435:invokevirtual   #93  <Method void Parcel.writeString(String)>
			break;
		}
		return true;
	//  172  438:iconst_1        
	//  173  439:ireturn         
	}
}
