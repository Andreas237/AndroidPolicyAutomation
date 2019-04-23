// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import com.google.android.gms.c.b;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcj, mf, mh, bck, 
//			mb, mc, kt, md, 
//			me, lz, ma, lw, 
//			lx, zzwf, mi, mj

public abstract class mg extends bcj
	implements mf
{

	public mg()
	{
		super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter">
	//    2    3:invokespecial   #13  <Method void bcj(String)>
	//    3    6:return          
	}

	public static mf a(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
	//    4    6:aload_0         
	//    5    7:ldc1            #10  <String "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter">
	//    6    9:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof mf)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class mf>
	//*  10   19:ifeq            27
			return (mf)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class mf>
	//   13   26:areturn         
		else
			return ((mf) (new mh(ibinder)));
	//   14   27:new             #24  <Class mh>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #27  <Method void mh(IBinder)>
	//   18   35:areturn         
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 12: default 64
	//	               1 664
	//	               2 647
	//	               3 630
	//	               4 502
	//	               5 485
	//	               6 367
	//	               7 356
	//	               8 238
	//	               9 227
	//	               10 209
	//	               11 184
	//	               12 66
		default:
			return false;
	//    2   64:iconst_0        
	//    3   65:ireturn         

		case 12: // '\f'
			String s = parcel.readString();
	//    4   66:aload_2         
	//    5   67:invokevirtual   #35  <Method String Parcel.readString()>
	//    6   70:astore          6
			String s5 = parcel.readString();
	//    7   72:aload_2         
	//    8   73:invokevirtual   #35  <Method String Parcel.readString()>
	//    9   76:astore          7
			Bundle bundle1 = (Bundle)bck.a(parcel, Bundle.CREATOR);
	//   10   78:aload_2         
	//   11   79:getstatic       #41  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   12   82:invokestatic    #46  <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//   13   85:checkcast       #37  <Class Bundle>
	//   14   88:astore          8
			com.google.android.gms.c.a a2 = b.a(parcel.readStrongBinder());
	//   15   90:aload_2         
	//   16   91:invokevirtual   #50  <Method IBinder Parcel.readStrongBinder()>
	//   17   94:invokestatic    #55  <Method com.google.android.gms.c.a b.a(IBinder)>
	//   18   97:astore          9
			Object obj = ((Object) (parcel.readStrongBinder()));
	//   19   99:aload_2         
	//   20  100:invokevirtual   #50  <Method IBinder Parcel.readStrongBinder()>
	//   21  103:astore          5
			if(obj == null)
	//*  22  105:aload           5
	//*  23  107:ifnonnull       116
			{
				obj = null;
	//   24  110:aconst_null     
	//   25  111:astore          5
			} else
	//*  26  113:goto            156
			{
				android.os.IInterface iinterface = ((IBinder) (obj)).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
	//   27  116:aload           5
	//   28  118:ldc1            #57  <String "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback">
	//   29  120:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   30  125:astore          10
				if(iinterface instanceof mb)
	//*  31  127:aload           10
	//*  32  129:instanceof      #59  <Class mb>
	//*  33  132:ifeq            145
					obj = ((Object) ((mb)iinterface));
	//   34  135:aload           10
	//   35  137:checkcast       #59  <Class mb>
	//   36  140:astore          5
				else
	//*  37  142:goto            156
					obj = ((Object) (new mc(((IBinder) (obj)))));
	//   38  145:new             #61  <Class mc>
	//   39  148:dup             
	//   40  149:aload           5
	//   41  151:invokespecial   #62  <Method void mc(IBinder)>
	//   42  154:astore          5
			}
			a(s, s5, bundle1, a2, ((mb) (obj)), kt.a(parcel.readStrongBinder()));
	//   43  156:aload_0         
	//   44  157:aload           6
	//   45  159:aload           7
	//   46  161:aload           8
	//   47  163:aload           9
	//   48  165:aload           5
	//   49  167:aload_2         
	//   50  168:invokevirtual   #50  <Method IBinder Parcel.readStrongBinder()>
	//   51  171:invokestatic    #67  <Method ks kt.a(IBinder)>
	//   52  174:invokevirtual   #70  <Method void a(String, String, Bundle, com.google.android.gms.c.a, mb, ks)>
			parcel1.writeNoException();
	//   53  177:aload_3         
	//   54  178:invokevirtual   #73  <Method void Parcel.writeNoException()>
			break;
	//   55  181:goto            784

		case 11: // '\013'
			a(parcel.createStringArray(), (Bundle[])parcel.createTypedArray(Bundle.CREATOR));
	//   56  184:aload_0         
	//   57  185:aload_2         
	//   58  186:invokevirtual   #77  <Method String[] Parcel.createStringArray()>
	//   59  189:aload_2         
	//   60  190:getstatic       #41  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   61  193:invokevirtual   #81  <Method Object[] Parcel.createTypedArray(android.os.Parcelable$Creator)>
	//   62  196:checkcast       #83  <Class Bundle[]>
	//   63  199:invokevirtual   #86  <Method void a(String[], Bundle[])>
			parcel1.writeNoException();
	//   64  202:aload_3         
	//   65  203:invokevirtual   #73  <Method void Parcel.writeNoException()>
			break;
	//   66  206:goto            784

		case 10: // '\n'
			a(b.a(parcel.readStrongBinder()));
	//   67  209:aload_0         
	//   68  210:aload_2         
	//   69  211:invokevirtual   #50  <Method IBinder Parcel.readStrongBinder()>
	//   70  214:invokestatic    #55  <Method com.google.android.gms.c.a b.a(IBinder)>
	//   71  217:invokevirtual   #89  <Method void a(com.google.android.gms.c.a)>
			parcel1.writeNoException();
	//   72  220:aload_3         
	//   73  221:invokevirtual   #73  <Method void Parcel.writeNoException()>
			break;
	//   74  224:goto            784

		case 9: // '\t'
			e();
	//   75  227:aload_0         
	//   76  228:invokevirtual   #92  <Method void e()>
			parcel1.writeNoException();
	//   77  231:aload_3         
	//   78  232:invokevirtual   #73  <Method void Parcel.writeNoException()>
			break;
	//   79  235:goto            784

		case 8: // '\b'
			String s1 = parcel.readString();
	//   80  238:aload_2         
	//   81  239:invokevirtual   #35  <Method String Parcel.readString()>
	//   82  242:astore          6
			String s6 = parcel.readString();
	//   83  244:aload_2         
	//   84  245:invokevirtual   #35  <Method String Parcel.readString()>
	//   85  248:astore          7
			Bundle bundle2 = (Bundle)bck.a(parcel, Bundle.CREATOR);
	//   86  250:aload_2         
	//   87  251:getstatic       #41  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   88  254:invokestatic    #46  <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//   89  257:checkcast       #37  <Class Bundle>
	//   90  260:astore          8
			com.google.android.gms.c.a a3 = b.a(parcel.readStrongBinder());
	//   91  262:aload_2         
	//   92  263:invokevirtual   #50  <Method IBinder Parcel.readStrongBinder()>
	//   93  266:invokestatic    #55  <Method com.google.android.gms.c.a b.a(IBinder)>
	//   94  269:astore          9
			Object obj1 = ((Object) (parcel.readStrongBinder()));
	//   95  271:aload_2         
	//   96  272:invokevirtual   #50  <Method IBinder Parcel.readStrongBinder()>
	//   97  275:astore          5
			if(obj1 == null)
	//*  98  277:aload           5
	//*  99  279:ifnonnull       288
			{
				obj1 = null;
	//  100  282:aconst_null     
	//  101  283:astore          5
			} else
	//* 102  285:goto            328
			{
				android.os.IInterface iinterface1 = ((IBinder) (obj1)).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
	//  103  288:aload           5
	//  104  290:ldc1            #94  <String "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback">
	//  105  292:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//  106  297:astore          10
				if(iinterface1 instanceof md)
	//* 107  299:aload           10
	//* 108  301:instanceof      #96  <Class md>
	//* 109  304:ifeq            317
					obj1 = ((Object) ((md)iinterface1));
	//  110  307:aload           10
	//  111  309:checkcast       #96  <Class md>
	//  112  312:astore          5
				else
	//* 113  314:goto            328
					obj1 = ((Object) (new me(((IBinder) (obj1)))));
	//  114  317:new             #98  <Class me>
	//  115  320:dup             
	//  116  321:aload           5
	//  117  323:invokespecial   #99  <Method void me(IBinder)>
	//  118  326:astore          5
			}
			a(s1, s6, bundle2, a3, ((md) (obj1)), kt.a(parcel.readStrongBinder()));
	//  119  328:aload_0         
	//  120  329:aload           6
	//  121  331:aload           7
	//  122  333:aload           8
	//  123  335:aload           9
	//  124  337:aload           5
	//  125  339:aload_2         
	//  126  340:invokevirtual   #50  <Method IBinder Parcel.readStrongBinder()>
	//  127  343:invokestatic    #67  <Method ks kt.a(IBinder)>
	//  128  346:invokevirtual   #102 <Method void a(String, String, Bundle, com.google.android.gms.c.a, md, ks)>
			parcel1.writeNoException();
	//  129  349:aload_3         
	//  130  350:invokevirtual   #73  <Method void Parcel.writeNoException()>
			break;
	//  131  353:goto            784

		case 7: // '\007'
			d();
	//  132  356:aload_0         
	//  133  357:invokevirtual   #105 <Method void d()>
			parcel1.writeNoException();
	//  134  360:aload_3         
	//  135  361:invokevirtual   #73  <Method void Parcel.writeNoException()>
			break;
	//  136  364:goto            784

		case 6: // '\006'
			String s2 = parcel.readString();
	//  137  367:aload_2         
	//  138  368:invokevirtual   #35  <Method String Parcel.readString()>
	//  139  371:astore          6
			String s7 = parcel.readString();
	//  140  373:aload_2         
	//  141  374:invokevirtual   #35  <Method String Parcel.readString()>
	//  142  377:astore          7
			Bundle bundle3 = (Bundle)bck.a(parcel, Bundle.CREATOR);
	//  143  379:aload_2         
	//  144  380:getstatic       #41  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//  145  383:invokestatic    #46  <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//  146  386:checkcast       #37  <Class Bundle>
	//  147  389:astore          8
			com.google.android.gms.c.a a4 = b.a(parcel.readStrongBinder());
	//  148  391:aload_2         
	//  149  392:invokevirtual   #50  <Method IBinder Parcel.readStrongBinder()>
	//  150  395:invokestatic    #55  <Method com.google.android.gms.c.a b.a(IBinder)>
	//  151  398:astore          9
			Object obj2 = ((Object) (parcel.readStrongBinder()));
	//  152  400:aload_2         
	//  153  401:invokevirtual   #50  <Method IBinder Parcel.readStrongBinder()>
	//  154  404:astore          5
			if(obj2 == null)
	//* 155  406:aload           5
	//* 156  408:ifnonnull       417
			{
				obj2 = null;
	//  157  411:aconst_null     
	//  158  412:astore          5
			} else
	//* 159  414:goto            457
			{
				android.os.IInterface iinterface2 = ((IBinder) (obj2)).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
	//  160  417:aload           5
	//  161  419:ldc1            #107 <String "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback">
	//  162  421:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//  163  426:astore          10
				if(iinterface2 instanceof lz)
	//* 164  428:aload           10
	//* 165  430:instanceof      #109 <Class lz>
	//* 166  433:ifeq            446
					obj2 = ((Object) ((lz)iinterface2));
	//  167  436:aload           10
	//  168  438:checkcast       #109 <Class lz>
	//  169  441:astore          5
				else
	//* 170  443:goto            457
					obj2 = ((Object) (new ma(((IBinder) (obj2)))));
	//  171  446:new             #111 <Class ma>
	//  172  449:dup             
	//  173  450:aload           5
	//  174  452:invokespecial   #112 <Method void ma(IBinder)>
	//  175  455:astore          5
			}
			a(s2, s7, bundle3, a4, ((lz) (obj2)), kt.a(parcel.readStrongBinder()));
	//  176  457:aload_0         
	//  177  458:aload           6
	//  178  460:aload           7
	//  179  462:aload           8
	//  180  464:aload           9
	//  181  466:aload           5
	//  182  468:aload_2         
	//  183  469:invokevirtual   #50  <Method IBinder Parcel.readStrongBinder()>
	//  184  472:invokestatic    #67  <Method ks kt.a(IBinder)>
	//  185  475:invokevirtual   #115 <Method void a(String, String, Bundle, com.google.android.gms.c.a, lz, ks)>
			parcel1.writeNoException();
	//  186  478:aload_3         
	//  187  479:invokevirtual   #73  <Method void Parcel.writeNoException()>
			break;
	//  188  482:goto            784

		case 5: // '\005'
			parcel = ((Parcel) (c()));
	//  189  485:aload_0         
	//  190  486:invokevirtual   #119 <Method byg c()>
	//  191  489:astore_2        
			parcel1.writeNoException();
	//  192  490:aload_3         
	//  193  491:invokevirtual   #73  <Method void Parcel.writeNoException()>
			bck.a(parcel1, ((android.os.IInterface) (parcel)));
	//  194  494:aload_3         
	//  195  495:aload_2         
	//  196  496:invokestatic    #122 <Method void bck.a(Parcel, android.os.IInterface)>
			break;
	//  197  499:goto            784

		case 4: // '\004'
			String s3 = parcel.readString();
	//  198  502:aload_2         
	//  199  503:invokevirtual   #35  <Method String Parcel.readString()>
	//  200  506:astore          6
			String s8 = parcel.readString();
	//  201  508:aload_2         
	//  202  509:invokevirtual   #35  <Method String Parcel.readString()>
	//  203  512:astore          7
			Bundle bundle4 = (Bundle)bck.a(parcel, Bundle.CREATOR);
	//  204  514:aload_2         
	//  205  515:getstatic       #41  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//  206  518:invokestatic    #46  <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//  207  521:checkcast       #37  <Class Bundle>
	//  208  524:astore          8
			com.google.android.gms.c.a a5 = b.a(parcel.readStrongBinder());
	//  209  526:aload_2         
	//  210  527:invokevirtual   #50  <Method IBinder Parcel.readStrongBinder()>
	//  211  530:invokestatic    #55  <Method com.google.android.gms.c.a b.a(IBinder)>
	//  212  533:astore          9
			Object obj3 = ((Object) (parcel.readStrongBinder()));
	//  213  535:aload_2         
	//  214  536:invokevirtual   #50  <Method IBinder Parcel.readStrongBinder()>
	//  215  539:astore          5
			if(obj3 == null)
	//* 216  541:aload           5
	//* 217  543:ifnonnull       552
			{
				obj3 = null;
	//  218  546:aconst_null     
	//  219  547:astore          5
			} else
	//* 220  549:goto            592
			{
				android.os.IInterface iinterface3 = ((IBinder) (obj3)).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
	//  221  552:aload           5
	//  222  554:ldc1            #124 <String "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback">
	//  223  556:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//  224  561:astore          10
				if(iinterface3 instanceof lw)
	//* 225  563:aload           10
	//* 226  565:instanceof      #126 <Class lw>
	//* 227  568:ifeq            581
					obj3 = ((Object) ((lw)iinterface3));
	//  228  571:aload           10
	//  229  573:checkcast       #126 <Class lw>
	//  230  576:astore          5
				else
	//* 231  578:goto            592
					obj3 = ((Object) (new lx(((IBinder) (obj3)))));
	//  232  581:new             #128 <Class lx>
	//  233  584:dup             
	//  234  585:aload           5
	//  235  587:invokespecial   #129 <Method void lx(IBinder)>
	//  236  590:astore          5
			}
			a(s3, s8, bundle4, a5, ((lw) (obj3)), kt.a(parcel.readStrongBinder()), (zzwf)bck.a(parcel, zzwf.CREATOR));
	//  237  592:aload_0         
	//  238  593:aload           6
	//  239  595:aload           7
	//  240  597:aload           8
	//  241  599:aload           9
	//  242  601:aload           5
	//  243  603:aload_2         
	//  244  604:invokevirtual   #50  <Method IBinder Parcel.readStrongBinder()>
	//  245  607:invokestatic    #67  <Method ks kt.a(IBinder)>
	//  246  610:aload_2         
	//  247  611:getstatic       #132 <Field android.os.Parcelable$Creator zzwf.CREATOR>
	//  248  614:invokestatic    #46  <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//  249  617:checkcast       #131 <Class zzwf>
	//  250  620:invokevirtual   #135 <Method void a(String, String, Bundle, com.google.android.gms.c.a, lw, ks, zzwf)>
			parcel1.writeNoException();
	//  251  623:aload_3         
	//  252  624:invokevirtual   #73  <Method void Parcel.writeNoException()>
			break;
	//  253  627:goto            784

		case 3: // '\003'
			parcel = ((Parcel) (b()));
	//  254  630:aload_0         
	//  255  631:invokevirtual   #139 <Method zzans b()>
	//  256  634:astore_2        
			parcel1.writeNoException();
	//  257  635:aload_3         
	//  258  636:invokevirtual   #73  <Method void Parcel.writeNoException()>
			com.google.android.gms.internal.ads.bck.b(parcel1, ((android.os.Parcelable) (parcel)));
	//  259  639:aload_3         
	//  260  640:aload_2         
	//  261  641:invokestatic    #142 <Method void com.google.android.gms.internal.ads.bck.b(Parcel, android.os.Parcelable)>
			break;
	//  262  644:goto            784

		case 2: // '\002'
			parcel = ((Parcel) (a()));
	//  263  647:aload_0         
	//  264  648:invokevirtual   #144 <Method zzans a()>
	//  265  651:astore_2        
			parcel1.writeNoException();
	//  266  652:aload_3         
	//  267  653:invokevirtual   #73  <Method void Parcel.writeNoException()>
			com.google.android.gms.internal.ads.bck.b(parcel1, ((android.os.Parcelable) (parcel)));
	//  268  656:aload_3         
	//  269  657:aload_2         
	//  270  658:invokestatic    #142 <Method void com.google.android.gms.internal.ads.bck.b(Parcel, android.os.Parcelable)>
			break;
	//  271  661:goto            784

		case 1: // '\001'
			com.google.android.gms.c.a a1 = b.a(parcel.readStrongBinder());
	//  272  664:aload_2         
	//  273  665:invokevirtual   #50  <Method IBinder Parcel.readStrongBinder()>
	//  274  668:invokestatic    #55  <Method com.google.android.gms.c.a b.a(IBinder)>
	//  275  671:astore          5
			String s4 = parcel.readString();
	//  276  673:aload_2         
	//  277  674:invokevirtual   #35  <Method String Parcel.readString()>
	//  278  677:astore          6
			Bundle bundle = (Bundle)bck.a(parcel, Bundle.CREATOR);
	//  279  679:aload_2         
	//  280  680:getstatic       #41  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//  281  683:invokestatic    #46  <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//  282  686:checkcast       #37  <Class Bundle>
	//  283  689:astore          7
			Bundle bundle5 = (Bundle)bck.a(parcel, Bundle.CREATOR);
	//  284  691:aload_2         
	//  285  692:getstatic       #41  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//  286  695:invokestatic    #46  <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//  287  698:checkcast       #37  <Class Bundle>
	//  288  701:astore          8
			zzwf zzwf1 = (zzwf)bck.a(parcel, zzwf.CREATOR);
	//  289  703:aload_2         
	//  290  704:getstatic       #132 <Field android.os.Parcelable$Creator zzwf.CREATOR>
	//  291  707:invokestatic    #46  <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//  292  710:checkcast       #131 <Class zzwf>
	//  293  713:astore          9
			parcel = ((Parcel) (parcel.readStrongBinder()));
	//  294  715:aload_2         
	//  295  716:invokevirtual   #50  <Method IBinder Parcel.readStrongBinder()>
	//  296  719:astore_2        
			if(parcel == null)
	//* 297  720:aload_2         
	//* 298  721:ifnonnull       729
			{
				parcel = null;
	//  299  724:aconst_null     
	//  300  725:astore_2        
			} else
	//* 301  726:goto            765
			{
				android.os.IInterface iinterface4 = ((IBinder) (parcel)).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
	//  302  729:aload_2         
	//  303  730:ldc1            #146 <String "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback">
	//  304  732:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//  305  737:astore          10
				if(iinterface4 instanceof mi)
	//* 306  739:aload           10
	//* 307  741:instanceof      #148 <Class mi>
	//* 308  744:ifeq            756
					parcel = ((Parcel) ((mi)iinterface4));
	//  309  747:aload           10
	//  310  749:checkcast       #148 <Class mi>
	//  311  752:astore_2        
				else
	//* 312  753:goto            765
					parcel = ((Parcel) (new mj(((IBinder) (parcel)))));
	//  313  756:new             #150 <Class mj>
	//  314  759:dup             
	//  315  760:aload_2         
	//  316  761:invokespecial   #151 <Method void mj(IBinder)>
	//  317  764:astore_2        
			}
			a(a1, s4, bundle, bundle5, zzwf1, ((mi) (parcel)));
	//  318  765:aload_0         
	//  319  766:aload           5
	//  320  768:aload           6
	//  321  770:aload           7
	//  322  772:aload           8
	//  323  774:aload           9
	//  324  776:aload_2         
	//  325  777:invokevirtual   #154 <Method void a(com.google.android.gms.c.a, String, Bundle, Bundle, zzwf, mi)>
			parcel1.writeNoException();
	//  326  780:aload_3         
	//  327  781:invokevirtual   #73  <Method void Parcel.writeNoException()>
			break;
		}
		return true;
	//  328  784:iconst_1        
	//  329  785:ireturn         
	}
}
