// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.c.b;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcj, tu, tw, ts, 
//			tt, bck, bxi, ua, 
//			uc, zzavh

public abstract class tv extends bcj
	implements tu
{

	public tv()
	{
		super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd">
	//    2    3:invokespecial   #13  <Method void bcj(String)>
	//    3    6:return          
	}

	public static tu a(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
	//    4    6:aload_0         
	//    5    7:ldc1            #10  <String "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd">
	//    6    9:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof tu)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class tu>
	//*  10   19:ifeq            27
			return (tu)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class tu>
	//   13   26:areturn         
		else
			return ((tu) (new tw(ibinder)));
	//   14   27:new             #24  <Class tw>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #27  <Method void tw(IBinder)>
	//   18   35:areturn         
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
	{
		if(i != 34)
	//*   0    0:iload_1         
	//*   1    1:bipush          34
	//*   2    3:icmpeq          497
		{
			Object obj1 = null;
	//    3    6:aconst_null     
	//    4    7:astore          7
			Object obj = null;
	//    5    9:aconst_null     
	//    6   10:astore          6
			switch(i)
	//*   7   12:iload_1         
			{
	//*   8   13:tableswitch     1 3: default 40
	//	               1 476
	//	               2 465
	//	               3 402
			default:
				switch(i)
	//*   9   40:iload_1         
				{
	//*  10   41:tableswitch     5 19: default 116
	//	               5 383
	//	               6 372
	//	               7 361
	//	               8 350
	//	               9 332
	//	               10 314
	//	               11 296
	//	               12 279
	//	               13 264
	//	               14 246
	//	               15 229
	//	               16 166
	//	               17 151
	//	               18 133
	//	               19 118
				default:
					return false;
	//   11  116:iconst_0        
	//   12  117:ireturn         

				case 19: // '\023'
					c(parcel.readString());
	//   13  118:aload_0         
	//   14  119:aload_2         
	//   15  120:invokevirtual   #35  <Method String Parcel.readString()>
	//   16  123:invokevirtual   #38  <Method void c(String)>
					parcel1.writeNoException();
	//   17  126:aload_3         
	//   18  127:invokevirtual   #41  <Method void Parcel.writeNoException()>
					break;

	//*  19  130:goto            509
				case 18: // '\022'
					a(b.a(parcel.readStrongBinder()));
	//   20  133:aload_0         
	//   21  134:aload_2         
	//   22  135:invokevirtual   #45  <Method IBinder Parcel.readStrongBinder()>
	//   23  138:invokestatic    #50  <Method com.google.android.gms.c.a b.a(IBinder)>
	//   24  141:invokevirtual   #53  <Method void a(com.google.android.gms.c.a)>
					parcel1.writeNoException();
	//   25  144:aload_3         
	//   26  145:invokevirtual   #41  <Method void Parcel.writeNoException()>
					break;

	//*  27  148:goto            509
				case 17: // '\021'
					a(parcel.readString());
	//   28  151:aload_0         
	//   29  152:aload_2         
	//   30  153:invokevirtual   #35  <Method String Parcel.readString()>
	//   31  156:invokevirtual   #55  <Method void a(String)>
					parcel1.writeNoException();
	//   32  159:aload_3         
	//   33  160:invokevirtual   #41  <Method void Parcel.writeNoException()>
					break;

	//*  34  163:goto            509
				case 16: // '\020'
					parcel = ((Parcel) (parcel.readStrongBinder()));
	//   35  166:aload_2         
	//   36  167:invokevirtual   #45  <Method IBinder Parcel.readStrongBinder()>
	//   37  170:astore_2        
					if(parcel == null)
	//*  38  171:aload_2         
	//*  39  172:ifnonnull       181
					{
						parcel = ((Parcel) (obj));
	//   40  175:aload           6
	//   41  177:astore_2        
					} else
	//*  42  178:goto            217
					{
						android.os.IInterface iinterface = ((IBinder) (parcel)).queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
	//   43  181:aload_2         
	//   44  182:ldc1            #57  <String "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener">
	//   45  184:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   46  189:astore          6
						if(iinterface instanceof ts)
	//*  47  191:aload           6
	//*  48  193:instanceof      #59  <Class ts>
	//*  49  196:ifeq            208
							parcel = ((Parcel) ((ts)iinterface));
	//   50  199:aload           6
	//   51  201:checkcast       #59  <Class ts>
	//   52  204:astore_2        
						else
	//*  53  205:goto            217
							parcel = ((Parcel) (new tt(((IBinder) (parcel)))));
	//   54  208:new             #61  <Class tt>
	//   55  211:dup             
	//   56  212:aload_2         
	//   57  213:invokespecial   #62  <Method void tt(IBinder)>
	//   58  216:astore_2        
					}
					a(((ts) (parcel)));
	//   59  217:aload_0         
	//   60  218:aload_2         
	//   61  219:invokevirtual   #65  <Method void a(ts)>
					parcel1.writeNoException();
	//   62  222:aload_3         
	//   63  223:invokevirtual   #41  <Method void Parcel.writeNoException()>
					break;

	//*  64  226:goto            509
				case 15: // '\017'
					parcel = ((Parcel) (b()));
	//   65  229:aload_0         
	//   66  230:invokevirtual   #69  <Method android.os.Bundle b()>
	//   67  233:astore_2        
					parcel1.writeNoException();
	//   68  234:aload_3         
	//   69  235:invokevirtual   #41  <Method void Parcel.writeNoException()>
					com.google.android.gms.internal.ads.bck.b(parcel1, ((android.os.Parcelable) (parcel)));
	//   70  238:aload_3         
	//   71  239:aload_2         
	//   72  240:invokestatic    #74  <Method void com.google.android.gms.internal.ads.bck.b(Parcel, android.os.Parcelable)>
					break;

	//*  73  243:goto            509
				case 14: // '\016'
					a(bxi.a(parcel.readStrongBinder()));
	//   74  246:aload_0         
	//   75  247:aload_2         
	//   76  248:invokevirtual   #45  <Method IBinder Parcel.readStrongBinder()>
	//   77  251:invokestatic    #79  <Method bxh bxi.a(IBinder)>
	//   78  254:invokevirtual   #82  <Method void a(bxh)>
					parcel1.writeNoException();
	//   79  257:aload_3         
	//   80  258:invokevirtual   #41  <Method void Parcel.writeNoException()>
					break;

	//*  81  261:goto            509
				case 13: // '\r'
					b(parcel.readString());
	//   82  264:aload_0         
	//   83  265:aload_2         
	//   84  266:invokevirtual   #35  <Method String Parcel.readString()>
	//   85  269:invokevirtual   #84  <Method void b(String)>
					parcel1.writeNoException();
	//   86  272:aload_3         
	//   87  273:invokevirtual   #41  <Method void Parcel.writeNoException()>
					break;

	//*  88  276:goto            509
				case 12: // '\f'
					parcel = ((Parcel) (g()));
	//   89  279:aload_0         
	//   90  280:invokevirtual   #87  <Method String g()>
	//   91  283:astore_2        
					parcel1.writeNoException();
	//   92  284:aload_3         
	//   93  285:invokevirtual   #41  <Method void Parcel.writeNoException()>
					parcel1.writeString(((String) (parcel)));
	//   94  288:aload_3         
	//   95  289:aload_2         
	//   96  290:invokevirtual   #90  <Method void Parcel.writeString(String)>
					break;

	//*  97  293:goto            509
				case 11: // '\013'
					d(b.a(parcel.readStrongBinder()));
	//   98  296:aload_0         
	//   99  297:aload_2         
	//  100  298:invokevirtual   #45  <Method IBinder Parcel.readStrongBinder()>
	//  101  301:invokestatic    #50  <Method com.google.android.gms.c.a b.a(IBinder)>
	//  102  304:invokevirtual   #93  <Method void d(com.google.android.gms.c.a)>
					parcel1.writeNoException();
	//  103  307:aload_3         
	//  104  308:invokevirtual   #41  <Method void Parcel.writeNoException()>
					break;

	//* 105  311:goto            509
				case 10: // '\n'
					c(b.a(parcel.readStrongBinder()));
	//  106  314:aload_0         
	//  107  315:aload_2         
	//  108  316:invokevirtual   #45  <Method IBinder Parcel.readStrongBinder()>
	//  109  319:invokestatic    #50  <Method com.google.android.gms.c.a b.a(IBinder)>
	//  110  322:invokevirtual   #95  <Method void c(com.google.android.gms.c.a)>
					parcel1.writeNoException();
	//  111  325:aload_3         
	//  112  326:invokevirtual   #41  <Method void Parcel.writeNoException()>
					break;

	//* 113  329:goto            509
				case 9: // '\t'
					b(b.a(parcel.readStrongBinder()));
	//  114  332:aload_0         
	//  115  333:aload_2         
	//  116  334:invokevirtual   #45  <Method IBinder Parcel.readStrongBinder()>
	//  117  337:invokestatic    #50  <Method com.google.android.gms.c.a b.a(IBinder)>
	//  118  340:invokevirtual   #97  <Method void b(com.google.android.gms.c.a)>
					parcel1.writeNoException();
	//  119  343:aload_3         
	//  120  344:invokevirtual   #41  <Method void Parcel.writeNoException()>
					break;

	//* 121  347:goto            509
				case 8: // '\b'
					f();
	//  122  350:aload_0         
	//  123  351:invokevirtual   #100 <Method void f()>
					parcel1.writeNoException();
	//  124  354:aload_3         
	//  125  355:invokevirtual   #41  <Method void Parcel.writeNoException()>
					break;

	//* 126  358:goto            509
				case 7: // '\007'
					e();
	//  127  361:aload_0         
	//  128  362:invokevirtual   #103 <Method void e()>
					parcel1.writeNoException();
	//  129  365:aload_3         
	//  130  366:invokevirtual   #41  <Method void Parcel.writeNoException()>
					break;

	//* 131  369:goto            509
				case 6: // '\006'
					d();
	//  132  372:aload_0         
	//  133  373:invokevirtual   #105 <Method void d()>
					parcel1.writeNoException();
	//  134  376:aload_3         
	//  135  377:invokevirtual   #41  <Method void Parcel.writeNoException()>
					break;

	//* 136  380:goto            509
				case 5: // '\005'
					boolean flag = c();
	//  137  383:aload_0         
	//  138  384:invokevirtual   #108 <Method boolean c()>
	//  139  387:istore          5
					parcel1.writeNoException();
	//  140  389:aload_3         
	//  141  390:invokevirtual   #41  <Method void Parcel.writeNoException()>
					bck.a(parcel1, flag);
	//  142  393:aload_3         
	//  143  394:iload           5
	//  144  396:invokestatic    #111 <Method void bck.a(Parcel, boolean)>
					break;
				}
				break;

	//* 145  399:goto            509
			case 3: // '\003'
				parcel = ((Parcel) (parcel.readStrongBinder()));
	//  146  402:aload_2         
	//  147  403:invokevirtual   #45  <Method IBinder Parcel.readStrongBinder()>
	//  148  406:astore_2        
				if(parcel == null)
	//* 149  407:aload_2         
	//* 150  408:ifnonnull       417
				{
					parcel = ((Parcel) (obj1));
	//  151  411:aload           7
	//  152  413:astore_2        
				} else
	//* 153  414:goto            453
				{
					android.os.IInterface iinterface1 = ((IBinder) (parcel)).queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
	//  154  417:aload_2         
	//  155  418:ldc1            #113 <String "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener">
	//  156  420:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//  157  425:astore          6
					if(iinterface1 instanceof ua)
	//* 158  427:aload           6
	//* 159  429:instanceof      #115 <Class ua>
	//* 160  432:ifeq            444
						parcel = ((Parcel) ((ua)iinterface1));
	//  161  435:aload           6
	//  162  437:checkcast       #115 <Class ua>
	//  163  440:astore_2        
					else
	//* 164  441:goto            453
						parcel = ((Parcel) (new uc(((IBinder) (parcel)))));
	//  165  444:new             #117 <Class uc>
	//  166  447:dup             
	//  167  448:aload_2         
	//  168  449:invokespecial   #118 <Method void uc(IBinder)>
	//  169  452:astore_2        
				}
				a(((ua) (parcel)));
	//  170  453:aload_0         
	//  171  454:aload_2         
	//  172  455:invokevirtual   #121 <Method void a(ua)>
				parcel1.writeNoException();
	//  173  458:aload_3         
	//  174  459:invokevirtual   #41  <Method void Parcel.writeNoException()>
				break;

	//* 175  462:goto            509
			case 2: // '\002'
				a();
	//  176  465:aload_0         
	//  177  466:invokevirtual   #123 <Method void a()>
				parcel1.writeNoException();
	//  178  469:aload_3         
	//  179  470:invokevirtual   #41  <Method void Parcel.writeNoException()>
				break;

	//* 180  473:goto            509
			case 1: // '\001'
				a((zzavh)bck.a(parcel, zzavh.CREATOR));
	//  181  476:aload_0         
	//  182  477:aload_2         
	//  183  478:getstatic       #129 <Field android.os.Parcelable$Creator zzavh.CREATOR>
	//  184  481:invokestatic    #132 <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//  185  484:checkcast       #125 <Class zzavh>
	//  186  487:invokevirtual   #135 <Method void a(zzavh)>
				parcel1.writeNoException();
	//  187  490:aload_3         
	//  188  491:invokevirtual   #41  <Method void Parcel.writeNoException()>
				break;
			}
		} else
	//* 189  494:goto            509
		{
			a(bck.a(parcel));
	//  190  497:aload_0         
	//  191  498:aload_2         
	//  192  499:invokestatic    #138 <Method boolean bck.a(Parcel)>
	//  193  502:invokevirtual   #141 <Method void a(boolean)>
			parcel1.writeNoException();
	//  194  505:aload_3         
	//  195  506:invokevirtual   #41  <Method void Parcel.writeNoException()>
		}
		return true;
	//  196  509:iconst_1        
	//  197  510:ireturn         
	}
}
