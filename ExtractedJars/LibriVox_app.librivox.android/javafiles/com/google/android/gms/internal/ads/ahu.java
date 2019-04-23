// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.c.b;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcj, aht, bck

public abstract class ahu extends bcj
	implements aht
{

	public ahu()
	{
		super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.measurement.IAppMeasurementProxy">
	//    2    3:invokespecial   #13  <Method void bcj(String)>
	//    3    6:return          
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 18: default 88
	//	               1 457
	//	               2 430
	//	               3 401
	//	               4 375
	//	               5 346
	//	               6 325
	//	               7 304
	//	               8 275
	//	               9 250
	//	               10 233
	//	               11 216
	//	               12 197
	//	               13 182
	//	               14 167
	//	               15 141
	//	               16 124
	//	               17 107
	//	               18 90
		default:
			return false;
	//    2   88:iconst_0        
	//    3   89:ireturn         

		case 18: // '\022'
			parcel = ((Parcel) (f()));
	//    4   90:aload_0         
	//    5   91:invokevirtual   #20  <Method String f()>
	//    6   94:astore_2        
			parcel1.writeNoException();
	//    7   95:aload_3         
	//    8   96:invokevirtual   #25  <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//    9   99:aload_3         
	//   10  100:aload_2         
	//   11  101:invokevirtual   #28  <Method void Parcel.writeString(String)>
			break;

	//*  12  104:goto            475
		case 17: // '\021'
			parcel = ((Parcel) (e()));
	//   13  107:aload_0         
	//   14  108:invokevirtual   #31  <Method String e()>
	//   15  111:astore_2        
			parcel1.writeNoException();
	//   16  112:aload_3         
	//   17  113:invokevirtual   #25  <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//   18  116:aload_3         
	//   19  117:aload_2         
	//   20  118:invokevirtual   #28  <Method void Parcel.writeString(String)>
			break;

	//*  21  121:goto            475
		case 16: // '\020'
			parcel = ((Parcel) (d()));
	//   22  124:aload_0         
	//   23  125:invokevirtual   #34  <Method String d()>
	//   24  128:astore_2        
			parcel1.writeNoException();
	//   25  129:aload_3         
	//   26  130:invokevirtual   #25  <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//   27  133:aload_3         
	//   28  134:aload_2         
	//   29  135:invokevirtual   #28  <Method void Parcel.writeString(String)>
			break;

	//*  30  138:goto            475
		case 15: // '\017'
			a(b.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
	//   31  141:aload_0         
	//   32  142:aload_2         
	//   33  143:invokevirtual   #38  <Method android.os.IBinder Parcel.readStrongBinder()>
	//   34  146:invokestatic    #44  <Method com.google.android.gms.c.a b.a(android.os.IBinder)>
	//   35  149:aload_2         
	//   36  150:invokevirtual   #47  <Method String Parcel.readString()>
	//   37  153:aload_2         
	//   38  154:invokevirtual   #47  <Method String Parcel.readString()>
	//   39  157:invokevirtual   #50  <Method void a(com.google.android.gms.c.a, String, String)>
			parcel1.writeNoException();
	//   40  160:aload_3         
	//   41  161:invokevirtual   #25  <Method void Parcel.writeNoException()>
			break;

	//*  42  164:goto            475
		case 14: // '\016'
			c(parcel.readString());
	//   43  167:aload_0         
	//   44  168:aload_2         
	//   45  169:invokevirtual   #47  <Method String Parcel.readString()>
	//   46  172:invokevirtual   #53  <Method void c(String)>
			parcel1.writeNoException();
	//   47  175:aload_3         
	//   48  176:invokevirtual   #25  <Method void Parcel.writeNoException()>
			break;

	//*  49  179:goto            475
		case 13: // '\r'
			b(parcel.readString());
	//   50  182:aload_0         
	//   51  183:aload_2         
	//   52  184:invokevirtual   #47  <Method String Parcel.readString()>
	//   53  187:invokevirtual   #56  <Method void b(String)>
			parcel1.writeNoException();
	//   54  190:aload_3         
	//   55  191:invokevirtual   #25  <Method void Parcel.writeNoException()>
			break;

	//*  56  194:goto            475
		case 12: // '\f'
			long l = c();
	//   57  197:aload_0         
	//   58  198:invokevirtual   #59  <Method long c()>
	//   59  201:lstore          5
			parcel1.writeNoException();
	//   60  203:aload_3         
	//   61  204:invokevirtual   #25  <Method void Parcel.writeNoException()>
			parcel1.writeLong(l);
	//   62  207:aload_3         
	//   63  208:lload           5
	//   64  210:invokevirtual   #63  <Method void Parcel.writeLong(long)>
			break;

	//*  65  213:goto            475
		case 11: // '\013'
			parcel = ((Parcel) (b()));
	//   66  216:aload_0         
	//   67  217:invokevirtual   #65  <Method String b()>
	//   68  220:astore_2        
			parcel1.writeNoException();
	//   69  221:aload_3         
	//   70  222:invokevirtual   #25  <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//   71  225:aload_3         
	//   72  226:aload_2         
	//   73  227:invokevirtual   #28  <Method void Parcel.writeString(String)>
			break;

	//*  74  230:goto            475
		case 10: // '\n'
			parcel = ((Parcel) (a()));
	//   75  233:aload_0         
	//   76  234:invokevirtual   #67  <Method String a()>
	//   77  237:astore_2        
			parcel1.writeNoException();
	//   78  238:aload_3         
	//   79  239:invokevirtual   #25  <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//   80  242:aload_3         
	//   81  243:aload_2         
	//   82  244:invokevirtual   #28  <Method void Parcel.writeString(String)>
			break;

	//*  83  247:goto            475
		case 9: // '\t'
			parcel = ((Parcel) (a(parcel.readString(), parcel.readString())));
	//   84  250:aload_0         
	//   85  251:aload_2         
	//   86  252:invokevirtual   #47  <Method String Parcel.readString()>
	//   87  255:aload_2         
	//   88  256:invokevirtual   #47  <Method String Parcel.readString()>
	//   89  259:invokevirtual   #70  <Method java.util.List a(String, String)>
	//   90  262:astore_2        
			parcel1.writeNoException();
	//   91  263:aload_3         
	//   92  264:invokevirtual   #25  <Method void Parcel.writeNoException()>
			parcel1.writeList(((java.util.List) (parcel)));
	//   93  267:aload_3         
	//   94  268:aload_2         
	//   95  269:invokevirtual   #74  <Method void Parcel.writeList(java.util.List)>
			break;

	//*  96  272:goto            475
		case 8: // '\b'
			b(parcel.readString(), parcel.readString(), (Bundle)bck.a(parcel, Bundle.CREATOR));
	//   97  275:aload_0         
	//   98  276:aload_2         
	//   99  277:invokevirtual   #47  <Method String Parcel.readString()>
	//  100  280:aload_2         
	//  101  281:invokevirtual   #47  <Method String Parcel.readString()>
	//  102  284:aload_2         
	//  103  285:getstatic       #80  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//  104  288:invokestatic    #85  <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//  105  291:checkcast       #76  <Class Bundle>
	//  106  294:invokevirtual   #88  <Method void b(String, String, Bundle)>
			parcel1.writeNoException();
	//  107  297:aload_3         
	//  108  298:invokevirtual   #25  <Method void Parcel.writeNoException()>
			break;

	//* 109  301:goto            475
		case 7: // '\007'
			c((Bundle)bck.a(parcel, Bundle.CREATOR));
	//  110  304:aload_0         
	//  111  305:aload_2         
	//  112  306:getstatic       #80  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//  113  309:invokestatic    #85  <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//  114  312:checkcast       #76  <Class Bundle>
	//  115  315:invokevirtual   #91  <Method void c(Bundle)>
			parcel1.writeNoException();
	//  116  318:aload_3         
	//  117  319:invokevirtual   #25  <Method void Parcel.writeNoException()>
			break;

	//* 118  322:goto            475
		case 6: // '\006'
			i = a(parcel.readString());
	//  119  325:aload_0         
	//  120  326:aload_2         
	//  121  327:invokevirtual   #47  <Method String Parcel.readString()>
	//  122  330:invokevirtual   #94  <Method int a(String)>
	//  123  333:istore_1        
			parcel1.writeNoException();
	//  124  334:aload_3         
	//  125  335:invokevirtual   #25  <Method void Parcel.writeNoException()>
			parcel1.writeInt(i);
	//  126  338:aload_3         
	//  127  339:iload_1         
	//  128  340:invokevirtual   #98  <Method void Parcel.writeInt(int)>
			break;

	//* 129  343:goto            475
		case 5: // '\005'
			parcel = ((Parcel) (a(parcel.readString(), parcel.readString(), bck.a(parcel))));
	//  130  346:aload_0         
	//  131  347:aload_2         
	//  132  348:invokevirtual   #47  <Method String Parcel.readString()>
	//  133  351:aload_2         
	//  134  352:invokevirtual   #47  <Method String Parcel.readString()>
	//  135  355:aload_2         
	//  136  356:invokestatic    #101 <Method boolean bck.a(Parcel)>
	//  137  359:invokevirtual   #104 <Method java.util.Map a(String, String, boolean)>
	//  138  362:astore_2        
			parcel1.writeNoException();
	//  139  363:aload_3         
	//  140  364:invokevirtual   #25  <Method void Parcel.writeNoException()>
			parcel1.writeMap(((java.util.Map) (parcel)));
	//  141  367:aload_3         
	//  142  368:aload_2         
	//  143  369:invokevirtual   #108 <Method void Parcel.writeMap(java.util.Map)>
			break;

	//* 144  372:goto            475
		case 4: // '\004'
			a(parcel.readString(), parcel.readString(), b.a(parcel.readStrongBinder()));
	//  145  375:aload_0         
	//  146  376:aload_2         
	//  147  377:invokevirtual   #47  <Method String Parcel.readString()>
	//  148  380:aload_2         
	//  149  381:invokevirtual   #47  <Method String Parcel.readString()>
	//  150  384:aload_2         
	//  151  385:invokevirtual   #38  <Method android.os.IBinder Parcel.readStrongBinder()>
	//  152  388:invokestatic    #44  <Method com.google.android.gms.c.a b.a(android.os.IBinder)>
	//  153  391:invokevirtual   #111 <Method void a(String, String, com.google.android.gms.c.a)>
			parcel1.writeNoException();
	//  154  394:aload_3         
	//  155  395:invokevirtual   #25  <Method void Parcel.writeNoException()>
			break;

	//* 156  398:goto            475
		case 3: // '\003'
			a(parcel.readString(), parcel.readString(), (Bundle)bck.a(parcel, Bundle.CREATOR));
	//  157  401:aload_0         
	//  158  402:aload_2         
	//  159  403:invokevirtual   #47  <Method String Parcel.readString()>
	//  160  406:aload_2         
	//  161  407:invokevirtual   #47  <Method String Parcel.readString()>
	//  162  410:aload_2         
	//  163  411:getstatic       #80  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//  164  414:invokestatic    #85  <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//  165  417:checkcast       #76  <Class Bundle>
	//  166  420:invokevirtual   #113 <Method void a(String, String, Bundle)>
			parcel1.writeNoException();
	//  167  423:aload_3         
	//  168  424:invokevirtual   #25  <Method void Parcel.writeNoException()>
			break;

	//* 169  427:goto            475
		case 2: // '\002'
			parcel = ((Parcel) (b((Bundle)bck.a(parcel, Bundle.CREATOR))));
	//  170  430:aload_0         
	//  171  431:aload_2         
	//  172  432:getstatic       #80  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//  173  435:invokestatic    #85  <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//  174  438:checkcast       #76  <Class Bundle>
	//  175  441:invokevirtual   #116 <Method Bundle b(Bundle)>
	//  176  444:astore_2        
			parcel1.writeNoException();
	//  177  445:aload_3         
	//  178  446:invokevirtual   #25  <Method void Parcel.writeNoException()>
			com.google.android.gms.internal.ads.bck.b(parcel1, ((android.os.Parcelable) (parcel)));
	//  179  449:aload_3         
	//  180  450:aload_2         
	//  181  451:invokestatic    #119 <Method void com.google.android.gms.internal.ads.bck.b(Parcel, android.os.Parcelable)>
			break;

	//* 182  454:goto            475
		case 1: // '\001'
			a((Bundle)bck.a(parcel, Bundle.CREATOR));
	//  183  457:aload_0         
	//  184  458:aload_2         
	//  185  459:getstatic       #80  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//  186  462:invokestatic    #85  <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//  187  465:checkcast       #76  <Class Bundle>
	//  188  468:invokevirtual   #121 <Method void a(Bundle)>
			parcel1.writeNoException();
	//  189  471:aload_3         
	//  190  472:invokevirtual   #25  <Method void Parcel.writeNoException()>
			break;
		}
		return true;
	//  191  475:iconst_1        
	//  192  476:ireturn         
	}
}
