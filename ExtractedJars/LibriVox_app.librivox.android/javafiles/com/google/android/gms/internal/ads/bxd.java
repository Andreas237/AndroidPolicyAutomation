// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcj, bxc, bxe, bck, 
//			bxh, bxj, zzyv, zzzw, 
//			ub, bxq, bxt, bwn, 
//			bwp, ak, oc, nv, 
//			zzwf, bxk, bxm, bwr, 
//			bwt, zzwb

public abstract class bxd extends bcj
	implements bxc
{

	public bxd()
	{
		super("com.google.android.gms.ads.internal.client.IAdManager");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IAdManager">
	//    2    3:invokespecial   #13  <Method void bcj(String)>
	//    3    6:return          
	}

	public static bxc a(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
	//    4    6:aload_0         
	//    5    7:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IAdManager">
	//    6    9:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof bxc)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class bxc>
	//*  10   19:ifeq            27
			return (bxc)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class bxc>
	//   13   26:areturn         
		else
			return ((bxc) (new bxe(ibinder)));
	//   14   27:new             #24  <Class bxe>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #27  <Method void bxe(IBinder)>
	//   18   35:areturn         
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
	{
		Object obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          7
		Object obj2 = null;
	//    2    3:aconst_null     
	//    3    4:astore          8
		Object obj3 = null;
	//    4    6:aconst_null     
	//    5    7:astore          9
		Object obj4 = null;
	//    6    9:aconst_null     
	//    7   10:astore          10
		Object obj = null;
	//    8   12:aconst_null     
	//    9   13:astore          6
		switch(i)
	//*  10   15:iload_1         
		{
	//*  11   16:tableswitch     1 38: default 184
	//	               1 969
	//	               2 958
	//	               3 939
	//	               4 910
	//	               5 899
	//	               6 888
	//	               7 825
	//	               8 762
	//	               9 751
	//	               10 740
	//	               11 729
	//	               12 712
	//	               13 691
	//	               14 673
	//	               15 651
	//	               16 184
	//	               17 184
	//	               18 634
	//	               19 616
	//	               20 553
	//	               21 490
	//	               22 475
	//	               23 456
	//	               24 438
	//	               25 423
	//	               26 406
	//	               27 184
	//	               28 184
	//	               29 385
	//	               30 364
	//	               31 347
	//	               32 330
	//	               33 313
	//	               34 298
	//	               35 281
	//	               36 218
	//	               37 201
	//	               38 186
		case 16: // '\020'
		case 17: // '\021'
		case 27: // '\033'
		case 28: // '\034'
		default:
			return false;
	//   12  184:iconst_0        
	//   13  185:ireturn         

		case 38: // '&'
			b(parcel.readString());
	//   14  186:aload_0         
	//   15  187:aload_2         
	//   16  188:invokevirtual   #35  <Method String Parcel.readString()>
	//   17  191:invokevirtual   #38  <Method void b(String)>
			parcel1.writeNoException();
	//   18  194:aload_3         
	//   19  195:invokevirtual   #41  <Method void Parcel.writeNoException()>
			break;
	//   20  198:goto            983

		case 37: // '%'
			parcel = ((Parcel) (q()));
	//   21  201:aload_0         
	//   22  202:invokevirtual   #45  <Method android.os.Bundle q()>
	//   23  205:astore_2        
			parcel1.writeNoException();
	//   24  206:aload_3         
	//   25  207:invokevirtual   #41  <Method void Parcel.writeNoException()>
			bck.b(parcel1, ((android.os.Parcelable) (parcel)));
	//   26  210:aload_3         
	//   27  211:aload_2         
	//   28  212:invokestatic    #50  <Method void bck.b(Parcel, android.os.Parcelable)>
			break;
	//   29  215:goto            983

		case 36: // '$'
			parcel = ((Parcel) (parcel.readStrongBinder()));
	//   30  218:aload_2         
	//   31  219:invokevirtual   #54  <Method IBinder Parcel.readStrongBinder()>
	//   32  222:astore_2        
			if(parcel == null)
	//*  33  223:aload_2         
	//*  34  224:ifnonnull       233
			{
				parcel = ((Parcel) (obj));
	//   35  227:aload           6
	//   36  229:astore_2        
			} else
	//*  37  230:goto            269
			{
				android.os.IInterface iinterface = ((IBinder) (parcel)).queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
	//   38  233:aload_2         
	//   39  234:ldc1            #56  <String "com.google.android.gms.ads.internal.client.IAdMetadataListener">
	//   40  236:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   41  241:astore          6
				if(iinterface instanceof bxh)
	//*  42  243:aload           6
	//*  43  245:instanceof      #58  <Class bxh>
	//*  44  248:ifeq            260
					parcel = ((Parcel) ((bxh)iinterface));
	//   45  251:aload           6
	//   46  253:checkcast       #58  <Class bxh>
	//   47  256:astore_2        
				else
	//*  48  257:goto            269
					parcel = ((Parcel) (new bxj(((IBinder) (parcel)))));
	//   49  260:new             #60  <Class bxj>
	//   50  263:dup             
	//   51  264:aload_2         
	//   52  265:invokespecial   #61  <Method void bxj(IBinder)>
	//   53  268:astore_2        
			}
			a(((bxh) (parcel)));
	//   54  269:aload_0         
	//   55  270:aload_2         
	//   56  271:invokevirtual   #64  <Method void a(bxh)>
			parcel1.writeNoException();
	//   57  274:aload_3         
	//   58  275:invokevirtual   #41  <Method void Parcel.writeNoException()>
			break;
	//   59  278:goto            983

		case 35: // '#'
			parcel = ((Parcel) (q_()));
	//   60  281:aload_0         
	//   61  282:invokevirtual   #67  <Method String q_()>
	//   62  285:astore_2        
			parcel1.writeNoException();
	//   63  286:aload_3         
	//   64  287:invokevirtual   #41  <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//   65  290:aload_3         
	//   66  291:aload_2         
	//   67  292:invokevirtual   #70  <Method void Parcel.writeString(String)>
			break;
	//   68  295:goto            983

		case 34: // '"'
			c(bck.a(parcel));
	//   69  298:aload_0         
	//   70  299:aload_2         
	//   71  300:invokestatic    #73  <Method boolean bck.a(Parcel)>
	//   72  303:invokevirtual   #77  <Method void c(boolean)>
			parcel1.writeNoException();
	//   73  306:aload_3         
	//   74  307:invokevirtual   #41  <Method void Parcel.writeNoException()>
			break;
	//   75  310:goto            983

		case 33: // '!'
			parcel = ((Parcel) (F()));
	//   76  313:aload_0         
	//   77  314:invokevirtual   #81  <Method bwr F()>
	//   78  317:astore_2        
			parcel1.writeNoException();
	//   79  318:aload_3         
	//   80  319:invokevirtual   #41  <Method void Parcel.writeNoException()>
			bck.a(parcel1, ((android.os.IInterface) (parcel)));
	//   81  322:aload_3         
	//   82  323:aload_2         
	//   83  324:invokestatic    #84  <Method void bck.a(Parcel, android.os.IInterface)>
			break;
	//   84  327:goto            983

		case 32: // ' '
			parcel = ((Parcel) (E()));
	//   85  330:aload_0         
	//   86  331:invokevirtual   #88  <Method bxk E()>
	//   87  334:astore_2        
			parcel1.writeNoException();
	//   88  335:aload_3         
	//   89  336:invokevirtual   #41  <Method void Parcel.writeNoException()>
			bck.a(parcel1, ((android.os.IInterface) (parcel)));
	//   90  339:aload_3         
	//   91  340:aload_2         
	//   92  341:invokestatic    #84  <Method void bck.a(Parcel, android.os.IInterface)>
			break;
	//   93  344:goto            983

		case 31: // '\037'
			parcel = ((Parcel) (D()));
	//   94  347:aload_0         
	//   95  348:invokevirtual   #91  <Method String D()>
	//   96  351:astore_2        
			parcel1.writeNoException();
	//   97  352:aload_3         
	//   98  353:invokevirtual   #41  <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//   99  356:aload_3         
	//  100  357:aload_2         
	//  101  358:invokevirtual   #70  <Method void Parcel.writeString(String)>
			break;
	//  102  361:goto            983

		case 30: // '\036'
			a((zzyv)bck.a(parcel, zzyv.CREATOR));
	//  103  364:aload_0         
	//  104  365:aload_2         
	//  105  366:getstatic       #97  <Field android.os.Parcelable$Creator zzyv.CREATOR>
	//  106  369:invokestatic    #100 <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//  107  372:checkcast       #93  <Class zzyv>
	//  108  375:invokevirtual   #103 <Method void a(zzyv)>
			parcel1.writeNoException();
	//  109  378:aload_3         
	//  110  379:invokevirtual   #41  <Method void Parcel.writeNoException()>
			break;
	//  111  382:goto            983

		case 29: // '\035'
			a((zzzw)bck.a(parcel, zzzw.CREATOR));
	//  112  385:aload_0         
	//  113  386:aload_2         
	//  114  387:getstatic       #106 <Field android.os.Parcelable$Creator zzzw.CREATOR>
	//  115  390:invokestatic    #100 <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//  116  393:checkcast       #105 <Class zzzw>
	//  117  396:invokevirtual   #109 <Method void a(zzzw)>
			parcel1.writeNoException();
	//  118  399:aload_3         
	//  119  400:invokevirtual   #41  <Method void Parcel.writeNoException()>
			break;
	//  120  403:goto            983

		case 26: // '\032'
			parcel = ((Parcel) (t()));
	//  121  406:aload_0         
	//  122  407:invokevirtual   #113 <Method byg t()>
	//  123  410:astore_2        
			parcel1.writeNoException();
	//  124  411:aload_3         
	//  125  412:invokevirtual   #41  <Method void Parcel.writeNoException()>
			bck.a(parcel1, ((android.os.IInterface) (parcel)));
	//  126  415:aload_3         
	//  127  416:aload_2         
	//  128  417:invokestatic    #84  <Method void bck.a(Parcel, android.os.IInterface)>
			break;
	//  129  420:goto            983

		case 25: // '\031'
			a(parcel.readString());
	//  130  423:aload_0         
	//  131  424:aload_2         
	//  132  425:invokevirtual   #35  <Method String Parcel.readString()>
	//  133  428:invokevirtual   #115 <Method void a(String)>
			parcel1.writeNoException();
	//  134  431:aload_3         
	//  135  432:invokevirtual   #41  <Method void Parcel.writeNoException()>
			break;
	//  136  435:goto            983

		case 24: // '\030'
			a(ub.a(parcel.readStrongBinder()));
	//  137  438:aload_0         
	//  138  439:aload_2         
	//  139  440:invokevirtual   #54  <Method IBinder Parcel.readStrongBinder()>
	//  140  443:invokestatic    #120 <Method ua ub.a(IBinder)>
	//  141  446:invokevirtual   #123 <Method void a(ua)>
			parcel1.writeNoException();
	//  142  449:aload_3         
	//  143  450:invokevirtual   #41  <Method void Parcel.writeNoException()>
			break;
	//  144  453:goto            983

		case 23: // '\027'
			boolean flag = s();
	//  145  456:aload_0         
	//  146  457:invokevirtual   #127 <Method boolean s()>
	//  147  460:istore          5
			parcel1.writeNoException();
	//  148  462:aload_3         
	//  149  463:invokevirtual   #41  <Method void Parcel.writeNoException()>
			bck.a(parcel1, flag);
	//  150  466:aload_3         
	//  151  467:iload           5
	//  152  469:invokestatic    #130 <Method void bck.a(Parcel, boolean)>
			break;
	//  153  472:goto            983

		case 22: // '\026'
			b(bck.a(parcel));
	//  154  475:aload_0         
	//  155  476:aload_2         
	//  156  477:invokestatic    #73  <Method boolean bck.a(Parcel)>
	//  157  480:invokevirtual   #132 <Method void b(boolean)>
			parcel1.writeNoException();
	//  158  483:aload_3         
	//  159  484:invokevirtual   #41  <Method void Parcel.writeNoException()>
			break;
	//  160  487:goto            983

		case 21: // '\025'
			parcel = ((Parcel) (parcel.readStrongBinder()));
	//  161  490:aload_2         
	//  162  491:invokevirtual   #54  <Method IBinder Parcel.readStrongBinder()>
	//  163  494:astore_2        
			if(parcel == null)
	//* 164  495:aload_2         
	//* 165  496:ifnonnull       505
			{
				parcel = ((Parcel) (obj1));
	//  166  499:aload           7
	//  167  501:astore_2        
			} else
	//* 168  502:goto            541
			{
				android.os.IInterface iinterface1 = ((IBinder) (parcel)).queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
	//  169  505:aload_2         
	//  170  506:ldc1            #134 <String "com.google.android.gms.ads.internal.client.ICorrelationIdProvider">
	//  171  508:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//  172  513:astore          6
				if(iinterface1 instanceof bxq)
	//* 173  515:aload           6
	//* 174  517:instanceof      #136 <Class bxq>
	//* 175  520:ifeq            532
					parcel = ((Parcel) ((bxq)iinterface1));
	//  176  523:aload           6
	//  177  525:checkcast       #136 <Class bxq>
	//  178  528:astore_2        
				else
	//* 179  529:goto            541
					parcel = ((Parcel) (new bxt(((IBinder) (parcel)))));
	//  180  532:new             #138 <Class bxt>
	//  181  535:dup             
	//  182  536:aload_2         
	//  183  537:invokespecial   #139 <Method void bxt(IBinder)>
	//  184  540:astore_2        
			}
			a(((bxq) (parcel)));
	//  185  541:aload_0         
	//  186  542:aload_2         
	//  187  543:invokevirtual   #142 <Method void a(bxq)>
			parcel1.writeNoException();
	//  188  546:aload_3         
	//  189  547:invokevirtual   #41  <Method void Parcel.writeNoException()>
			break;
	//  190  550:goto            983

		case 20: // '\024'
			parcel = ((Parcel) (parcel.readStrongBinder()));
	//  191  553:aload_2         
	//  192  554:invokevirtual   #54  <Method IBinder Parcel.readStrongBinder()>
	//  193  557:astore_2        
			if(parcel == null)
	//* 194  558:aload_2         
	//* 195  559:ifnonnull       568
			{
				parcel = ((Parcel) (obj2));
	//  196  562:aload           8
	//  197  564:astore_2        
			} else
	//* 198  565:goto            604
			{
				android.os.IInterface iinterface2 = ((IBinder) (parcel)).queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
	//  199  568:aload_2         
	//  200  569:ldc1            #144 <String "com.google.android.gms.ads.internal.client.IAdClickListener">
	//  201  571:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//  202  576:astore          6
				if(iinterface2 instanceof bwn)
	//* 203  578:aload           6
	//* 204  580:instanceof      #146 <Class bwn>
	//* 205  583:ifeq            595
					parcel = ((Parcel) ((bwn)iinterface2));
	//  206  586:aload           6
	//  207  588:checkcast       #146 <Class bwn>
	//  208  591:astore_2        
				else
	//* 209  592:goto            604
					parcel = ((Parcel) (new bwp(((IBinder) (parcel)))));
	//  210  595:new             #148 <Class bwp>
	//  211  598:dup             
	//  212  599:aload_2         
	//  213  600:invokespecial   #149 <Method void bwp(IBinder)>
	//  214  603:astore_2        
			}
			a(((bwn) (parcel)));
	//  215  604:aload_0         
	//  216  605:aload_2         
	//  217  606:invokevirtual   #152 <Method void a(bwn)>
			parcel1.writeNoException();
	//  218  609:aload_3         
	//  219  610:invokevirtual   #41  <Method void Parcel.writeNoException()>
			break;
	//  220  613:goto            983

		case 19: // '\023'
			a(ak.a(parcel.readStrongBinder()));
	//  221  616:aload_0         
	//  222  617:aload_2         
	//  223  618:invokevirtual   #54  <Method IBinder Parcel.readStrongBinder()>
	//  224  621:invokestatic    #157 <Method aj ak.a(IBinder)>
	//  225  624:invokevirtual   #160 <Method void a(aj)>
			parcel1.writeNoException();
	//  226  627:aload_3         
	//  227  628:invokevirtual   #41  <Method void Parcel.writeNoException()>
			break;
	//  228  631:goto            983

		case 18: // '\022'
			parcel = ((Parcel) (a()));
	//  229  634:aload_0         
	//  230  635:invokevirtual   #162 <Method String a()>
	//  231  638:astore_2        
			parcel1.writeNoException();
	//  232  639:aload_3         
	//  233  640:invokevirtual   #41  <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//  234  643:aload_3         
	//  235  644:aload_2         
	//  236  645:invokevirtual   #70  <Method void Parcel.writeString(String)>
			break;
	//  237  648:goto            983

		case 15: // '\017'
			a(oc.a(parcel.readStrongBinder()), parcel.readString());
	//  238  651:aload_0         
	//  239  652:aload_2         
	//  240  653:invokevirtual   #54  <Method IBinder Parcel.readStrongBinder()>
	//  241  656:invokestatic    #167 <Method ob oc.a(IBinder)>
	//  242  659:aload_2         
	//  243  660:invokevirtual   #35  <Method String Parcel.readString()>
	//  244  663:invokevirtual   #170 <Method void a(ob, String)>
			parcel1.writeNoException();
	//  245  666:aload_3         
	//  246  667:invokevirtual   #41  <Method void Parcel.writeNoException()>
			break;
	//  247  670:goto            983

		case 14: // '\016'
			a(nv.a(parcel.readStrongBinder()));
	//  248  673:aload_0         
	//  249  674:aload_2         
	//  250  675:invokevirtual   #54  <Method IBinder Parcel.readStrongBinder()>
	//  251  678:invokestatic    #175 <Method nu nv.a(IBinder)>
	//  252  681:invokevirtual   #178 <Method void a(nu)>
			parcel1.writeNoException();
	//  253  684:aload_3         
	//  254  685:invokevirtual   #41  <Method void Parcel.writeNoException()>
			break;
	//  255  688:goto            983

		case 13: // '\r'
			a((zzwf)bck.a(parcel, zzwf.CREATOR));
	//  256  691:aload_0         
	//  257  692:aload_2         
	//  258  693:getstatic       #181 <Field android.os.Parcelable$Creator zzwf.CREATOR>
	//  259  696:invokestatic    #100 <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//  260  699:checkcast       #180 <Class zzwf>
	//  261  702:invokevirtual   #184 <Method void a(zzwf)>
			parcel1.writeNoException();
	//  262  705:aload_3         
	//  263  706:invokevirtual   #41  <Method void Parcel.writeNoException()>
			break;
	//  264  709:goto            983

		case 12: // '\f'
			parcel = ((Parcel) (l()));
	//  265  712:aload_0         
	//  266  713:invokevirtual   #188 <Method zzwf l()>
	//  267  716:astore_2        
			parcel1.writeNoException();
	//  268  717:aload_3         
	//  269  718:invokevirtual   #41  <Method void Parcel.writeNoException()>
			bck.b(parcel1, ((android.os.Parcelable) (parcel)));
	//  270  721:aload_3         
	//  271  722:aload_2         
	//  272  723:invokestatic    #50  <Method void bck.b(Parcel, android.os.Parcelable)>
			break;
	//  273  726:goto            983

		case 11: // '\013'
			n();
	//  274  729:aload_0         
	//  275  730:invokevirtual   #191 <Method void n()>
			parcel1.writeNoException();
	//  276  733:aload_3         
	//  277  734:invokevirtual   #41  <Method void Parcel.writeNoException()>
			break;
	//  278  737:goto            983

		case 10: // '\n'
			r();
	//  279  740:aload_0         
	//  280  741:invokevirtual   #194 <Method void r()>
			parcel1.writeNoException();
	//  281  744:aload_3         
	//  282  745:invokevirtual   #41  <Method void Parcel.writeNoException()>
			break;
	//  283  748:goto            983

		case 9: // '\t'
			H();
	//  284  751:aload_0         
	//  285  752:invokevirtual   #197 <Method void H()>
			parcel1.writeNoException();
	//  286  755:aload_3         
	//  287  756:invokevirtual   #41  <Method void Parcel.writeNoException()>
			break;
	//  288  759:goto            983

		case 8: // '\b'
			parcel = ((Parcel) (parcel.readStrongBinder()));
	//  289  762:aload_2         
	//  290  763:invokevirtual   #54  <Method IBinder Parcel.readStrongBinder()>
	//  291  766:astore_2        
			if(parcel == null)
	//* 292  767:aload_2         
	//* 293  768:ifnonnull       777
			{
				parcel = ((Parcel) (obj3));
	//  294  771:aload           9
	//  295  773:astore_2        
			} else
	//* 296  774:goto            813
			{
				android.os.IInterface iinterface3 = ((IBinder) (parcel)).queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
	//  297  777:aload_2         
	//  298  778:ldc1            #199 <String "com.google.android.gms.ads.internal.client.IAppEventListener">
	//  299  780:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//  300  785:astore          6
				if(iinterface3 instanceof bxk)
	//* 301  787:aload           6
	//* 302  789:instanceof      #201 <Class bxk>
	//* 303  792:ifeq            804
					parcel = ((Parcel) ((bxk)iinterface3));
	//  304  795:aload           6
	//  305  797:checkcast       #201 <Class bxk>
	//  306  800:astore_2        
				else
	//* 307  801:goto            813
					parcel = ((Parcel) (new bxm(((IBinder) (parcel)))));
	//  308  804:new             #203 <Class bxm>
	//  309  807:dup             
	//  310  808:aload_2         
	//  311  809:invokespecial   #204 <Method void bxm(IBinder)>
	//  312  812:astore_2        
			}
			a(((bxk) (parcel)));
	//  313  813:aload_0         
	//  314  814:aload_2         
	//  315  815:invokevirtual   #207 <Method void a(bxk)>
			parcel1.writeNoException();
	//  316  818:aload_3         
	//  317  819:invokevirtual   #41  <Method void Parcel.writeNoException()>
			break;
	//  318  822:goto            983

		case 7: // '\007'
			parcel = ((Parcel) (parcel.readStrongBinder()));
	//  319  825:aload_2         
	//  320  826:invokevirtual   #54  <Method IBinder Parcel.readStrongBinder()>
	//  321  829:astore_2        
			if(parcel == null)
	//* 322  830:aload_2         
	//* 323  831:ifnonnull       840
			{
				parcel = ((Parcel) (obj4));
	//  324  834:aload           10
	//  325  836:astore_2        
			} else
	//* 326  837:goto            876
			{
				android.os.IInterface iinterface4 = ((IBinder) (parcel)).queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
	//  327  840:aload_2         
	//  328  841:ldc1            #209 <String "com.google.android.gms.ads.internal.client.IAdListener">
	//  329  843:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//  330  848:astore          6
				if(iinterface4 instanceof bwr)
	//* 331  850:aload           6
	//* 332  852:instanceof      #211 <Class bwr>
	//* 333  855:ifeq            867
					parcel = ((Parcel) ((bwr)iinterface4));
	//  334  858:aload           6
	//  335  860:checkcast       #211 <Class bwr>
	//  336  863:astore_2        
				else
	//* 337  864:goto            876
					parcel = ((Parcel) (new bwt(((IBinder) (parcel)))));
	//  338  867:new             #213 <Class bwt>
	//  339  870:dup             
	//  340  871:aload_2         
	//  341  872:invokespecial   #214 <Method void bwt(IBinder)>
	//  342  875:astore_2        
			}
			a(((bwr) (parcel)));
	//  343  876:aload_0         
	//  344  877:aload_2         
	//  345  878:invokevirtual   #217 <Method void a(bwr)>
			parcel1.writeNoException();
	//  346  881:aload_3         
	//  347  882:invokevirtual   #41  <Method void Parcel.writeNoException()>
			break;

	//* 348  885:goto            983
		case 6: // '\006'
			p();
	//  349  888:aload_0         
	//  350  889:invokevirtual   #220 <Method void p()>
			parcel1.writeNoException();
	//  351  892:aload_3         
	//  352  893:invokevirtual   #41  <Method void Parcel.writeNoException()>
			break;

	//* 353  896:goto            983
		case 5: // '\005'
			o();
	//  354  899:aload_0         
	//  355  900:invokevirtual   #223 <Method void o()>
			parcel1.writeNoException();
	//  356  903:aload_3         
	//  357  904:invokevirtual   #41  <Method void Parcel.writeNoException()>
			break;

	//* 358  907:goto            983
		case 4: // '\004'
			boolean flag1 = b((zzwb)bck.a(parcel, zzwb.CREATOR));
	//  359  910:aload_0         
	//  360  911:aload_2         
	//  361  912:getstatic       #226 <Field android.os.Parcelable$Creator zzwb.CREATOR>
	//  362  915:invokestatic    #100 <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//  363  918:checkcast       #225 <Class zzwb>
	//  364  921:invokevirtual   #229 <Method boolean b(zzwb)>
	//  365  924:istore          5
			parcel1.writeNoException();
	//  366  926:aload_3         
	//  367  927:invokevirtual   #41  <Method void Parcel.writeNoException()>
			bck.a(parcel1, flag1);
	//  368  930:aload_3         
	//  369  931:iload           5
	//  370  933:invokestatic    #130 <Method void bck.a(Parcel, boolean)>
			break;

	//* 371  936:goto            983
		case 3: // '\003'
			boolean flag2 = m();
	//  372  939:aload_0         
	//  373  940:invokevirtual   #232 <Method boolean m()>
	//  374  943:istore          5
			parcel1.writeNoException();
	//  375  945:aload_3         
	//  376  946:invokevirtual   #41  <Method void Parcel.writeNoException()>
			bck.a(parcel1, flag2);
	//  377  949:aload_3         
	//  378  950:iload           5
	//  379  952:invokestatic    #130 <Method void bck.a(Parcel, boolean)>
			break;

	//* 380  955:goto            983
		case 2: // '\002'
			j();
	//  381  958:aload_0         
	//  382  959:invokevirtual   #235 <Method void j()>
			parcel1.writeNoException();
	//  383  962:aload_3         
	//  384  963:invokevirtual   #41  <Method void Parcel.writeNoException()>
			break;

	//* 385  966:goto            983
		case 1: // '\001'
			parcel = ((Parcel) (k()));
	//  386  969:aload_0         
	//  387  970:invokevirtual   #239 <Method com.google.android.gms.c.a k()>
	//  388  973:astore_2        
			parcel1.writeNoException();
	//  389  974:aload_3         
	//  390  975:invokevirtual   #41  <Method void Parcel.writeNoException()>
			bck.a(parcel1, ((android.os.IInterface) (parcel)));
	//  391  978:aload_3         
	//  392  979:aload_2         
	//  393  980:invokestatic    #84  <Method void bck.a(Parcel, android.os.IInterface)>
			break;
		}
		return true;
	//  394  983:iconst_1        
	//  395  984:ireturn         
	}
}
