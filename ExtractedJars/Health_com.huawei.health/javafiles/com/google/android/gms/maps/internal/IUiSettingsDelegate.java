// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.os.*;

public interface IUiSettingsDelegate
	extends IInterface
{
	public static abstract class zza extends Binder
		implements IUiSettingsDelegate
	{

		public static IUiSettingsDelegate zzeg(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//    4    6:aload_0         
		//    5    7:ldc1            #13  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//    6    9:invokeinterface #19  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface != null && (iinterface instanceof IUiSettingsDelegate))
		//*   8   15:aload_1         
		//*   9   16:ifnull          31
		//*  10   19:aload_1         
		//*  11   20:instanceof      #6   <Class IUiSettingsDelegate>
		//*  12   23:ifeq            31
				return (IUiSettingsDelegate)iinterface;
		//   13   26:aload_1         
		//   14   27:checkcast       #6   <Class IUiSettingsDelegate>
		//   15   30:areturn         
			else
				return ((IUiSettingsDelegate) (new zza(ibinder)));
		//   16   31:new             #9   <Class IUiSettingsDelegate$zza$zza>
		//   17   34:dup             
		//   18   35:aload_0         
		//   19   36:invokespecial   #23  <Method void IUiSettingsDelegate$zza$zza(IBinder)>
		//   20   39:areturn         
		}

		public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
			throws RemoteException
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:lookupswitch    20: default 172
		//		               1: 183
		//		               2: 217
		//		               3: 251
		//		               4: 285
		//		               5: 319
		//		               6: 353
		//		               7: 387
		//		               8: 421
		//		               9: 455
		//		               10: 490
		//		               11: 525
		//		               12: 560
		//		               13: 595
		//		               14: 630
		//		               15: 665
		//		               16: 700
		//		               17: 734
		//		               18: 769
		//		               19: 803
		//		               1598968902: 175
		//*   2  172:goto            838
			case 1598968902: 
				parcel1.writeString("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//    3  175:aload_3         
		//    4  176:ldc1            #13  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//    5  178:invokevirtual   #34  <Method void Parcel.writeString(String)>
				return true;
		//    6  181:iconst_1        
		//    7  182:ireturn         

			case 1: // '\001'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//    8  183:aload_2         
		//    9  184:ldc1            #13  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//   10  186:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				boolean flag;
				if(parcel.readInt() != 0)
		//*  11  189:aload_2         
		//*  12  190:invokevirtual   #41  <Method int Parcel.readInt()>
		//*  13  193:ifeq            202
					flag = true;
		//   14  196:iconst_1        
		//   15  197:istore          5
				else
		//*  16  199:goto            205
					flag = false;
		//   17  202:iconst_0        
		//   18  203:istore          5
				setZoomControlsEnabled(flag);
		//   19  205:aload_0         
		//   20  206:iload           5
		//   21  208:invokevirtual   #45  <Method void setZoomControlsEnabled(boolean)>
				parcel1.writeNoException();
		//   22  211:aload_3         
		//   23  212:invokevirtual   #49  <Method void Parcel.writeNoException()>
				return true;
		//   24  215:iconst_1        
		//   25  216:ireturn         

			case 2: // '\002'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//   26  217:aload_2         
		//   27  218:ldc1            #13  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//   28  220:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				boolean flag1;
				if(parcel.readInt() != 0)
		//*  29  223:aload_2         
		//*  30  224:invokevirtual   #41  <Method int Parcel.readInt()>
		//*  31  227:ifeq            236
					flag1 = true;
		//   32  230:iconst_1        
		//   33  231:istore          5
				else
		//*  34  233:goto            239
					flag1 = false;
		//   35  236:iconst_0        
		//   36  237:istore          5
				setCompassEnabled(flag1);
		//   37  239:aload_0         
		//   38  240:iload           5
		//   39  242:invokevirtual   #52  <Method void setCompassEnabled(boolean)>
				parcel1.writeNoException();
		//   40  245:aload_3         
		//   41  246:invokevirtual   #49  <Method void Parcel.writeNoException()>
				return true;
		//   42  249:iconst_1        
		//   43  250:ireturn         

			case 3: // '\003'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//   44  251:aload_2         
		//   45  252:ldc1            #13  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//   46  254:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				boolean flag2;
				if(parcel.readInt() != 0)
		//*  47  257:aload_2         
		//*  48  258:invokevirtual   #41  <Method int Parcel.readInt()>
		//*  49  261:ifeq            270
					flag2 = true;
		//   50  264:iconst_1        
		//   51  265:istore          5
				else
		//*  52  267:goto            273
					flag2 = false;
		//   53  270:iconst_0        
		//   54  271:istore          5
				setMyLocationButtonEnabled(flag2);
		//   55  273:aload_0         
		//   56  274:iload           5
		//   57  276:invokevirtual   #55  <Method void setMyLocationButtonEnabled(boolean)>
				parcel1.writeNoException();
		//   58  279:aload_3         
		//   59  280:invokevirtual   #49  <Method void Parcel.writeNoException()>
				return true;
		//   60  283:iconst_1        
		//   61  284:ireturn         

			case 4: // '\004'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//   62  285:aload_2         
		//   63  286:ldc1            #13  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//   64  288:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				boolean flag3;
				if(parcel.readInt() != 0)
		//*  65  291:aload_2         
		//*  66  292:invokevirtual   #41  <Method int Parcel.readInt()>
		//*  67  295:ifeq            304
					flag3 = true;
		//   68  298:iconst_1        
		//   69  299:istore          5
				else
		//*  70  301:goto            307
					flag3 = false;
		//   71  304:iconst_0        
		//   72  305:istore          5
				setScrollGesturesEnabled(flag3);
		//   73  307:aload_0         
		//   74  308:iload           5
		//   75  310:invokevirtual   #58  <Method void setScrollGesturesEnabled(boolean)>
				parcel1.writeNoException();
		//   76  313:aload_3         
		//   77  314:invokevirtual   #49  <Method void Parcel.writeNoException()>
				return true;
		//   78  317:iconst_1        
		//   79  318:ireturn         

			case 5: // '\005'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//   80  319:aload_2         
		//   81  320:ldc1            #13  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//   82  322:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				boolean flag4;
				if(parcel.readInt() != 0)
		//*  83  325:aload_2         
		//*  84  326:invokevirtual   #41  <Method int Parcel.readInt()>
		//*  85  329:ifeq            338
					flag4 = true;
		//   86  332:iconst_1        
		//   87  333:istore          5
				else
		//*  88  335:goto            341
					flag4 = false;
		//   89  338:iconst_0        
		//   90  339:istore          5
				setZoomGesturesEnabled(flag4);
		//   91  341:aload_0         
		//   92  342:iload           5
		//   93  344:invokevirtual   #61  <Method void setZoomGesturesEnabled(boolean)>
				parcel1.writeNoException();
		//   94  347:aload_3         
		//   95  348:invokevirtual   #49  <Method void Parcel.writeNoException()>
				return true;
		//   96  351:iconst_1        
		//   97  352:ireturn         

			case 6: // '\006'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//   98  353:aload_2         
		//   99  354:ldc1            #13  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//  100  356:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				boolean flag5;
				if(parcel.readInt() != 0)
		//* 101  359:aload_2         
		//* 102  360:invokevirtual   #41  <Method int Parcel.readInt()>
		//* 103  363:ifeq            372
					flag5 = true;
		//  104  366:iconst_1        
		//  105  367:istore          5
				else
		//* 106  369:goto            375
					flag5 = false;
		//  107  372:iconst_0        
		//  108  373:istore          5
				setTiltGesturesEnabled(flag5);
		//  109  375:aload_0         
		//  110  376:iload           5
		//  111  378:invokevirtual   #64  <Method void setTiltGesturesEnabled(boolean)>
				parcel1.writeNoException();
		//  112  381:aload_3         
		//  113  382:invokevirtual   #49  <Method void Parcel.writeNoException()>
				return true;
		//  114  385:iconst_1        
		//  115  386:ireturn         

			case 7: // '\007'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//  116  387:aload_2         
		//  117  388:ldc1            #13  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//  118  390:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				boolean flag6;
				if(parcel.readInt() != 0)
		//* 119  393:aload_2         
		//* 120  394:invokevirtual   #41  <Method int Parcel.readInt()>
		//* 121  397:ifeq            406
					flag6 = true;
		//  122  400:iconst_1        
		//  123  401:istore          5
				else
		//* 124  403:goto            409
					flag6 = false;
		//  125  406:iconst_0        
		//  126  407:istore          5
				setRotateGesturesEnabled(flag6);
		//  127  409:aload_0         
		//  128  410:iload           5
		//  129  412:invokevirtual   #67  <Method void setRotateGesturesEnabled(boolean)>
				parcel1.writeNoException();
		//  130  415:aload_3         
		//  131  416:invokevirtual   #49  <Method void Parcel.writeNoException()>
				return true;
		//  132  419:iconst_1        
		//  133  420:ireturn         

			case 8: // '\b'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//  134  421:aload_2         
		//  135  422:ldc1            #13  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//  136  424:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				boolean flag7;
				if(parcel.readInt() != 0)
		//* 137  427:aload_2         
		//* 138  428:invokevirtual   #41  <Method int Parcel.readInt()>
		//* 139  431:ifeq            440
					flag7 = true;
		//  140  434:iconst_1        
		//  141  435:istore          5
				else
		//* 142  437:goto            443
					flag7 = false;
		//  143  440:iconst_0        
		//  144  441:istore          5
				setAllGesturesEnabled(flag7);
		//  145  443:aload_0         
		//  146  444:iload           5
		//  147  446:invokevirtual   #70  <Method void setAllGesturesEnabled(boolean)>
				parcel1.writeNoException();
		//  148  449:aload_3         
		//  149  450:invokevirtual   #49  <Method void Parcel.writeNoException()>
				return true;
		//  150  453:iconst_1        
		//  151  454:ireturn         

			case 9: // '\t'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//  152  455:aload_2         
		//  153  456:ldc1            #13  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//  154  458:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				boolean flag8 = isZoomControlsEnabled();
		//  155  461:aload_0         
		//  156  462:invokevirtual   #74  <Method boolean isZoomControlsEnabled()>
		//  157  465:istore          5
				parcel1.writeNoException();
		//  158  467:aload_3         
		//  159  468:invokevirtual   #49  <Method void Parcel.writeNoException()>
				if(flag8)
		//* 160  471:iload           5
		//* 161  473:ifeq            481
					i = 1;
		//  162  476:iconst_1        
		//  163  477:istore_1        
				else
		//* 164  478:goto            483
					i = 0;
		//  165  481:iconst_0        
		//  166  482:istore_1        
				parcel1.writeInt(i);
		//  167  483:aload_3         
		//  168  484:iload_1         
		//  169  485:invokevirtual   #78  <Method void Parcel.writeInt(int)>
				return true;
		//  170  488:iconst_1        
		//  171  489:ireturn         

			case 10: // '\n'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//  172  490:aload_2         
		//  173  491:ldc1            #13  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//  174  493:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				boolean flag9 = isCompassEnabled();
		//  175  496:aload_0         
		//  176  497:invokevirtual   #81  <Method boolean isCompassEnabled()>
		//  177  500:istore          5
				parcel1.writeNoException();
		//  178  502:aload_3         
		//  179  503:invokevirtual   #49  <Method void Parcel.writeNoException()>
				if(flag9)
		//* 180  506:iload           5
		//* 181  508:ifeq            516
					i = 1;
		//  182  511:iconst_1        
		//  183  512:istore_1        
				else
		//* 184  513:goto            518
					i = 0;
		//  185  516:iconst_0        
		//  186  517:istore_1        
				parcel1.writeInt(i);
		//  187  518:aload_3         
		//  188  519:iload_1         
		//  189  520:invokevirtual   #78  <Method void Parcel.writeInt(int)>
				return true;
		//  190  523:iconst_1        
		//  191  524:ireturn         

			case 11: // '\013'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//  192  525:aload_2         
		//  193  526:ldc1            #13  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//  194  528:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				boolean flag10 = isMyLocationButtonEnabled();
		//  195  531:aload_0         
		//  196  532:invokevirtual   #84  <Method boolean isMyLocationButtonEnabled()>
		//  197  535:istore          5
				parcel1.writeNoException();
		//  198  537:aload_3         
		//  199  538:invokevirtual   #49  <Method void Parcel.writeNoException()>
				if(flag10)
		//* 200  541:iload           5
		//* 201  543:ifeq            551
					i = 1;
		//  202  546:iconst_1        
		//  203  547:istore_1        
				else
		//* 204  548:goto            553
					i = 0;
		//  205  551:iconst_0        
		//  206  552:istore_1        
				parcel1.writeInt(i);
		//  207  553:aload_3         
		//  208  554:iload_1         
		//  209  555:invokevirtual   #78  <Method void Parcel.writeInt(int)>
				return true;
		//  210  558:iconst_1        
		//  211  559:ireturn         

			case 12: // '\f'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//  212  560:aload_2         
		//  213  561:ldc1            #13  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//  214  563:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				boolean flag11 = isScrollGesturesEnabled();
		//  215  566:aload_0         
		//  216  567:invokevirtual   #87  <Method boolean isScrollGesturesEnabled()>
		//  217  570:istore          5
				parcel1.writeNoException();
		//  218  572:aload_3         
		//  219  573:invokevirtual   #49  <Method void Parcel.writeNoException()>
				if(flag11)
		//* 220  576:iload           5
		//* 221  578:ifeq            586
					i = 1;
		//  222  581:iconst_1        
		//  223  582:istore_1        
				else
		//* 224  583:goto            588
					i = 0;
		//  225  586:iconst_0        
		//  226  587:istore_1        
				parcel1.writeInt(i);
		//  227  588:aload_3         
		//  228  589:iload_1         
		//  229  590:invokevirtual   #78  <Method void Parcel.writeInt(int)>
				return true;
		//  230  593:iconst_1        
		//  231  594:ireturn         

			case 13: // '\r'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//  232  595:aload_2         
		//  233  596:ldc1            #13  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//  234  598:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				boolean flag12 = isZoomGesturesEnabled();
		//  235  601:aload_0         
		//  236  602:invokevirtual   #90  <Method boolean isZoomGesturesEnabled()>
		//  237  605:istore          5
				parcel1.writeNoException();
		//  238  607:aload_3         
		//  239  608:invokevirtual   #49  <Method void Parcel.writeNoException()>
				if(flag12)
		//* 240  611:iload           5
		//* 241  613:ifeq            621
					i = 1;
		//  242  616:iconst_1        
		//  243  617:istore_1        
				else
		//* 244  618:goto            623
					i = 0;
		//  245  621:iconst_0        
		//  246  622:istore_1        
				parcel1.writeInt(i);
		//  247  623:aload_3         
		//  248  624:iload_1         
		//  249  625:invokevirtual   #78  <Method void Parcel.writeInt(int)>
				return true;
		//  250  628:iconst_1        
		//  251  629:ireturn         

			case 14: // '\016'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//  252  630:aload_2         
		//  253  631:ldc1            #13  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//  254  633:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				boolean flag13 = isTiltGesturesEnabled();
		//  255  636:aload_0         
		//  256  637:invokevirtual   #93  <Method boolean isTiltGesturesEnabled()>
		//  257  640:istore          5
				parcel1.writeNoException();
		//  258  642:aload_3         
		//  259  643:invokevirtual   #49  <Method void Parcel.writeNoException()>
				if(flag13)
		//* 260  646:iload           5
		//* 261  648:ifeq            656
					i = 1;
		//  262  651:iconst_1        
		//  263  652:istore_1        
				else
		//* 264  653:goto            658
					i = 0;
		//  265  656:iconst_0        
		//  266  657:istore_1        
				parcel1.writeInt(i);
		//  267  658:aload_3         
		//  268  659:iload_1         
		//  269  660:invokevirtual   #78  <Method void Parcel.writeInt(int)>
				return true;
		//  270  663:iconst_1        
		//  271  664:ireturn         

			case 15: // '\017'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//  272  665:aload_2         
		//  273  666:ldc1            #13  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//  274  668:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				boolean flag14 = isRotateGesturesEnabled();
		//  275  671:aload_0         
		//  276  672:invokevirtual   #96  <Method boolean isRotateGesturesEnabled()>
		//  277  675:istore          5
				parcel1.writeNoException();
		//  278  677:aload_3         
		//  279  678:invokevirtual   #49  <Method void Parcel.writeNoException()>
				if(flag14)
		//* 280  681:iload           5
		//* 281  683:ifeq            691
					i = 1;
		//  282  686:iconst_1        
		//  283  687:istore_1        
				else
		//* 284  688:goto            693
					i = 0;
		//  285  691:iconst_0        
		//  286  692:istore_1        
				parcel1.writeInt(i);
		//  287  693:aload_3         
		//  288  694:iload_1         
		//  289  695:invokevirtual   #78  <Method void Parcel.writeInt(int)>
				return true;
		//  290  698:iconst_1        
		//  291  699:ireturn         

			case 16: // '\020'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//  292  700:aload_2         
		//  293  701:ldc1            #13  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//  294  703:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				boolean flag15;
				if(parcel.readInt() != 0)
		//* 295  706:aload_2         
		//* 296  707:invokevirtual   #41  <Method int Parcel.readInt()>
		//* 297  710:ifeq            719
					flag15 = true;
		//  298  713:iconst_1        
		//  299  714:istore          5
				else
		//* 300  716:goto            722
					flag15 = false;
		//  301  719:iconst_0        
		//  302  720:istore          5
				setIndoorLevelPickerEnabled(flag15);
		//  303  722:aload_0         
		//  304  723:iload           5
		//  305  725:invokevirtual   #99  <Method void setIndoorLevelPickerEnabled(boolean)>
				parcel1.writeNoException();
		//  306  728:aload_3         
		//  307  729:invokevirtual   #49  <Method void Parcel.writeNoException()>
				return true;
		//  308  732:iconst_1        
		//  309  733:ireturn         

			case 17: // '\021'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//  310  734:aload_2         
		//  311  735:ldc1            #13  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//  312  737:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				boolean flag16 = isIndoorLevelPickerEnabled();
		//  313  740:aload_0         
		//  314  741:invokevirtual   #102 <Method boolean isIndoorLevelPickerEnabled()>
		//  315  744:istore          5
				parcel1.writeNoException();
		//  316  746:aload_3         
		//  317  747:invokevirtual   #49  <Method void Parcel.writeNoException()>
				if(flag16)
		//* 318  750:iload           5
		//* 319  752:ifeq            760
					i = 1;
		//  320  755:iconst_1        
		//  321  756:istore_1        
				else
		//* 322  757:goto            762
					i = 0;
		//  323  760:iconst_0        
		//  324  761:istore_1        
				parcel1.writeInt(i);
		//  325  762:aload_3         
		//  326  763:iload_1         
		//  327  764:invokevirtual   #78  <Method void Parcel.writeInt(int)>
				return true;
		//  328  767:iconst_1        
		//  329  768:ireturn         

			case 18: // '\022'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//  330  769:aload_2         
		//  331  770:ldc1            #13  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//  332  772:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				boolean flag17;
				if(parcel.readInt() != 0)
		//* 333  775:aload_2         
		//* 334  776:invokevirtual   #41  <Method int Parcel.readInt()>
		//* 335  779:ifeq            788
					flag17 = true;
		//  336  782:iconst_1        
		//  337  783:istore          5
				else
		//* 338  785:goto            791
					flag17 = false;
		//  339  788:iconst_0        
		//  340  789:istore          5
				setMapToolbarEnabled(flag17);
		//  341  791:aload_0         
		//  342  792:iload           5
		//  343  794:invokevirtual   #105 <Method void setMapToolbarEnabled(boolean)>
				parcel1.writeNoException();
		//  344  797:aload_3         
		//  345  798:invokevirtual   #49  <Method void Parcel.writeNoException()>
				return true;
		//  346  801:iconst_1        
		//  347  802:ireturn         

			case 19: // '\023'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//  348  803:aload_2         
		//  349  804:ldc1            #13  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//  350  806:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				boolean flag18 = isMapToolbarEnabled();
		//  351  809:aload_0         
		//  352  810:invokevirtual   #108 <Method boolean isMapToolbarEnabled()>
		//  353  813:istore          5
				parcel1.writeNoException();
		//  354  815:aload_3         
		//  355  816:invokevirtual   #49  <Method void Parcel.writeNoException()>
				if(flag18)
		//* 356  819:iload           5
		//* 357  821:ifeq            829
					i = 1;
		//  358  824:iconst_1        
		//  359  825:istore_1        
				else
		//* 360  826:goto            831
					i = 0;
		//  361  829:iconst_0        
		//  362  830:istore_1        
				parcel1.writeInt(i);
		//  363  831:aload_3         
		//  364  832:iload_1         
		//  365  833:invokevirtual   #78  <Method void Parcel.writeInt(int)>
				return true;
		//  366  836:iconst_1        
		//  367  837:ireturn         
			}
			return super.onTransact(i, parcel, parcel1, j);
		//  368  838:aload_0         
		//  369  839:iload_1         
		//  370  840:aload_2         
		//  371  841:aload_3         
		//  372  842:iload           4
		//  373  844:invokespecial   #110 <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//  374  847:ireturn         
		}
	}

	static class zza.zza
		implements IUiSettingsDelegate
	{

		public IBinder asBinder()
		{
			return zzrk;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zzrk>
		//    2    4:areturn         
		}

		public boolean isCompassEnabled()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			int i;
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//    4    9:aload_3         
		//    5   10:ldc1            #33  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(10, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #18  <Field IBinder zzrk>
		//    9   19:bipush          10
		//   10   21:aload_3         
		//   11   22:aload           4
		//   12   24:iconst_0        
		//   13   25:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   30:pop             
			parcel1.readException();
		//   15   31:aload           4
		//   16   33:invokevirtual   #46  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   36:aload           4
		//   18   38:invokevirtual   #50  <Method int Parcel.readInt()>
		//   19   41:istore_1        
			boolean flag;
			if(i != 0)
		//*  20   42:iload_1         
		//*  21   43:ifeq            51
				flag = true;
		//   22   46:iconst_1        
		//   23   47:istore_2        
			else
		//*  24   48:goto            53
				flag = false;
		//   25   51:iconst_0        
		//   26   52:istore_2        
			parcel1.recycle();
		//   27   53:aload           4
		//   28   55:invokevirtual   #53  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   58:aload_3         
		//   30   59:invokevirtual   #53  <Method void Parcel.recycle()>
			return flag;
		//   31   62:iload_2         
		//   32   63:ireturn         
			Exception exception;
			exception;
		//   33   64:astore          5
			parcel1.recycle();
		//   34   66:aload           4
		//   35   68:invokevirtual   #53  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   71:aload_3         
		//   37   72:invokevirtual   #53  <Method void Parcel.recycle()>
			throw exception;
		//   38   75:aload           5
		//   39   77:athrow          
		}

		public boolean isIndoorLevelPickerEnabled()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			int i;
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//    4    9:aload_3         
		//    5   10:ldc1            #33  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(17, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #18  <Field IBinder zzrk>
		//    9   19:bipush          17
		//   10   21:aload_3         
		//   11   22:aload           4
		//   12   24:iconst_0        
		//   13   25:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   30:pop             
			parcel1.readException();
		//   15   31:aload           4
		//   16   33:invokevirtual   #46  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   36:aload           4
		//   18   38:invokevirtual   #50  <Method int Parcel.readInt()>
		//   19   41:istore_1        
			boolean flag;
			if(i != 0)
		//*  20   42:iload_1         
		//*  21   43:ifeq            51
				flag = true;
		//   22   46:iconst_1        
		//   23   47:istore_2        
			else
		//*  24   48:goto            53
				flag = false;
		//   25   51:iconst_0        
		//   26   52:istore_2        
			parcel1.recycle();
		//   27   53:aload           4
		//   28   55:invokevirtual   #53  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   58:aload_3         
		//   30   59:invokevirtual   #53  <Method void Parcel.recycle()>
			return flag;
		//   31   62:iload_2         
		//   32   63:ireturn         
			Exception exception;
			exception;
		//   33   64:astore          5
			parcel1.recycle();
		//   34   66:aload           4
		//   35   68:invokevirtual   #53  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   71:aload_3         
		//   37   72:invokevirtual   #53  <Method void Parcel.recycle()>
			throw exception;
		//   38   75:aload           5
		//   39   77:athrow          
		}

		public boolean isMapToolbarEnabled()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			int i;
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//    4    9:aload_3         
		//    5   10:ldc1            #33  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(19, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #18  <Field IBinder zzrk>
		//    9   19:bipush          19
		//   10   21:aload_3         
		//   11   22:aload           4
		//   12   24:iconst_0        
		//   13   25:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   30:pop             
			parcel1.readException();
		//   15   31:aload           4
		//   16   33:invokevirtual   #46  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   36:aload           4
		//   18   38:invokevirtual   #50  <Method int Parcel.readInt()>
		//   19   41:istore_1        
			boolean flag;
			if(i != 0)
		//*  20   42:iload_1         
		//*  21   43:ifeq            51
				flag = true;
		//   22   46:iconst_1        
		//   23   47:istore_2        
			else
		//*  24   48:goto            53
				flag = false;
		//   25   51:iconst_0        
		//   26   52:istore_2        
			parcel1.recycle();
		//   27   53:aload           4
		//   28   55:invokevirtual   #53  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   58:aload_3         
		//   30   59:invokevirtual   #53  <Method void Parcel.recycle()>
			return flag;
		//   31   62:iload_2         
		//   32   63:ireturn         
			Exception exception;
			exception;
		//   33   64:astore          5
			parcel1.recycle();
		//   34   66:aload           4
		//   35   68:invokevirtual   #53  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   71:aload_3         
		//   37   72:invokevirtual   #53  <Method void Parcel.recycle()>
			throw exception;
		//   38   75:aload           5
		//   39   77:athrow          
		}

		public boolean isMyLocationButtonEnabled()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			int i;
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//    4    9:aload_3         
		//    5   10:ldc1            #33  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(11, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #18  <Field IBinder zzrk>
		//    9   19:bipush          11
		//   10   21:aload_3         
		//   11   22:aload           4
		//   12   24:iconst_0        
		//   13   25:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   30:pop             
			parcel1.readException();
		//   15   31:aload           4
		//   16   33:invokevirtual   #46  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   36:aload           4
		//   18   38:invokevirtual   #50  <Method int Parcel.readInt()>
		//   19   41:istore_1        
			boolean flag;
			if(i != 0)
		//*  20   42:iload_1         
		//*  21   43:ifeq            51
				flag = true;
		//   22   46:iconst_1        
		//   23   47:istore_2        
			else
		//*  24   48:goto            53
				flag = false;
		//   25   51:iconst_0        
		//   26   52:istore_2        
			parcel1.recycle();
		//   27   53:aload           4
		//   28   55:invokevirtual   #53  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   58:aload_3         
		//   30   59:invokevirtual   #53  <Method void Parcel.recycle()>
			return flag;
		//   31   62:iload_2         
		//   32   63:ireturn         
			Exception exception;
			exception;
		//   33   64:astore          5
			parcel1.recycle();
		//   34   66:aload           4
		//   35   68:invokevirtual   #53  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   71:aload_3         
		//   37   72:invokevirtual   #53  <Method void Parcel.recycle()>
			throw exception;
		//   38   75:aload           5
		//   39   77:athrow          
		}

		public boolean isRotateGesturesEnabled()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			int i;
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//    4    9:aload_3         
		//    5   10:ldc1            #33  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(15, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #18  <Field IBinder zzrk>
		//    9   19:bipush          15
		//   10   21:aload_3         
		//   11   22:aload           4
		//   12   24:iconst_0        
		//   13   25:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   30:pop             
			parcel1.readException();
		//   15   31:aload           4
		//   16   33:invokevirtual   #46  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   36:aload           4
		//   18   38:invokevirtual   #50  <Method int Parcel.readInt()>
		//   19   41:istore_1        
			boolean flag;
			if(i != 0)
		//*  20   42:iload_1         
		//*  21   43:ifeq            51
				flag = true;
		//   22   46:iconst_1        
		//   23   47:istore_2        
			else
		//*  24   48:goto            53
				flag = false;
		//   25   51:iconst_0        
		//   26   52:istore_2        
			parcel1.recycle();
		//   27   53:aload           4
		//   28   55:invokevirtual   #53  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   58:aload_3         
		//   30   59:invokevirtual   #53  <Method void Parcel.recycle()>
			return flag;
		//   31   62:iload_2         
		//   32   63:ireturn         
			Exception exception;
			exception;
		//   33   64:astore          5
			parcel1.recycle();
		//   34   66:aload           4
		//   35   68:invokevirtual   #53  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   71:aload_3         
		//   37   72:invokevirtual   #53  <Method void Parcel.recycle()>
			throw exception;
		//   38   75:aload           5
		//   39   77:athrow          
		}

		public boolean isScrollGesturesEnabled()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			int i;
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//    4    9:aload_3         
		//    5   10:ldc1            #33  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(12, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #18  <Field IBinder zzrk>
		//    9   19:bipush          12
		//   10   21:aload_3         
		//   11   22:aload           4
		//   12   24:iconst_0        
		//   13   25:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   30:pop             
			parcel1.readException();
		//   15   31:aload           4
		//   16   33:invokevirtual   #46  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   36:aload           4
		//   18   38:invokevirtual   #50  <Method int Parcel.readInt()>
		//   19   41:istore_1        
			boolean flag;
			if(i != 0)
		//*  20   42:iload_1         
		//*  21   43:ifeq            51
				flag = true;
		//   22   46:iconst_1        
		//   23   47:istore_2        
			else
		//*  24   48:goto            53
				flag = false;
		//   25   51:iconst_0        
		//   26   52:istore_2        
			parcel1.recycle();
		//   27   53:aload           4
		//   28   55:invokevirtual   #53  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   58:aload_3         
		//   30   59:invokevirtual   #53  <Method void Parcel.recycle()>
			return flag;
		//   31   62:iload_2         
		//   32   63:ireturn         
			Exception exception;
			exception;
		//   33   64:astore          5
			parcel1.recycle();
		//   34   66:aload           4
		//   35   68:invokevirtual   #53  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   71:aload_3         
		//   37   72:invokevirtual   #53  <Method void Parcel.recycle()>
			throw exception;
		//   38   75:aload           5
		//   39   77:athrow          
		}

		public boolean isTiltGesturesEnabled()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			int i;
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//    4    9:aload_3         
		//    5   10:ldc1            #33  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(14, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #18  <Field IBinder zzrk>
		//    9   19:bipush          14
		//   10   21:aload_3         
		//   11   22:aload           4
		//   12   24:iconst_0        
		//   13   25:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   30:pop             
			parcel1.readException();
		//   15   31:aload           4
		//   16   33:invokevirtual   #46  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   36:aload           4
		//   18   38:invokevirtual   #50  <Method int Parcel.readInt()>
		//   19   41:istore_1        
			boolean flag;
			if(i != 0)
		//*  20   42:iload_1         
		//*  21   43:ifeq            51
				flag = true;
		//   22   46:iconst_1        
		//   23   47:istore_2        
			else
		//*  24   48:goto            53
				flag = false;
		//   25   51:iconst_0        
		//   26   52:istore_2        
			parcel1.recycle();
		//   27   53:aload           4
		//   28   55:invokevirtual   #53  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   58:aload_3         
		//   30   59:invokevirtual   #53  <Method void Parcel.recycle()>
			return flag;
		//   31   62:iload_2         
		//   32   63:ireturn         
			Exception exception;
			exception;
		//   33   64:astore          5
			parcel1.recycle();
		//   34   66:aload           4
		//   35   68:invokevirtual   #53  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   71:aload_3         
		//   37   72:invokevirtual   #53  <Method void Parcel.recycle()>
			throw exception;
		//   38   75:aload           5
		//   39   77:athrow          
		}

		public boolean isZoomControlsEnabled()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			int i;
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//    4    9:aload_3         
		//    5   10:ldc1            #33  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(9, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #18  <Field IBinder zzrk>
		//    9   19:bipush          9
		//   10   21:aload_3         
		//   11   22:aload           4
		//   12   24:iconst_0        
		//   13   25:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   30:pop             
			parcel1.readException();
		//   15   31:aload           4
		//   16   33:invokevirtual   #46  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   36:aload           4
		//   18   38:invokevirtual   #50  <Method int Parcel.readInt()>
		//   19   41:istore_1        
			boolean flag;
			if(i != 0)
		//*  20   42:iload_1         
		//*  21   43:ifeq            51
				flag = true;
		//   22   46:iconst_1        
		//   23   47:istore_2        
			else
		//*  24   48:goto            53
				flag = false;
		//   25   51:iconst_0        
		//   26   52:istore_2        
			parcel1.recycle();
		//   27   53:aload           4
		//   28   55:invokevirtual   #53  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   58:aload_3         
		//   30   59:invokevirtual   #53  <Method void Parcel.recycle()>
			return flag;
		//   31   62:iload_2         
		//   32   63:ireturn         
			Exception exception;
			exception;
		//   33   64:astore          5
			parcel1.recycle();
		//   34   66:aload           4
		//   35   68:invokevirtual   #53  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   71:aload_3         
		//   37   72:invokevirtual   #53  <Method void Parcel.recycle()>
			throw exception;
		//   38   75:aload           5
		//   39   77:athrow          
		}

		public boolean isZoomGesturesEnabled()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			int i;
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//    4    9:aload_3         
		//    5   10:ldc1            #33  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(13, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #18  <Field IBinder zzrk>
		//    9   19:bipush          13
		//   10   21:aload_3         
		//   11   22:aload           4
		//   12   24:iconst_0        
		//   13   25:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   30:pop             
			parcel1.readException();
		//   15   31:aload           4
		//   16   33:invokevirtual   #46  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   36:aload           4
		//   18   38:invokevirtual   #50  <Method int Parcel.readInt()>
		//   19   41:istore_1        
			boolean flag;
			if(i != 0)
		//*  20   42:iload_1         
		//*  21   43:ifeq            51
				flag = true;
		//   22   46:iconst_1        
		//   23   47:istore_2        
			else
		//*  24   48:goto            53
				flag = false;
		//   25   51:iconst_0        
		//   26   52:istore_2        
			parcel1.recycle();
		//   27   53:aload           4
		//   28   55:invokevirtual   #53  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   58:aload_3         
		//   30   59:invokevirtual   #53  <Method void Parcel.recycle()>
			return flag;
		//   31   62:iload_2         
		//   32   63:ireturn         
			Exception exception;
			exception;
		//   33   64:astore          5
			parcel1.recycle();
		//   34   66:aload           4
		//   35   68:invokevirtual   #53  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   71:aload_3         
		//   37   72:invokevirtual   #53  <Method void Parcel.recycle()>
			throw exception;
		//   38   75:aload           5
		//   39   77:athrow          
		}

		public void setAllGesturesEnabled(boolean flag)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//    4    9:aload_3         
		//    5   10:ldc1            #33  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			int i;
			Exception exception;
			if(flag)
		//*   7   15:iload_1         
		//*   8   16:ifeq            74
				i = 1;
		//    9   19:iconst_1        
		//   10   20:istore_2        
			else
		//*  11   21:goto            24
		//*  12   24:aload_3         
		//*  13   25:iload_2         
		//*  14   26:invokevirtual   #68  <Method void Parcel.writeInt(int)>
		//*  15   29:aload_0         
		//*  16   30:getfield        #18  <Field IBinder zzrk>
		//*  17   33:bipush          8
		//*  18   35:aload_3         
		//*  19   36:aload           4
		//*  20   38:iconst_0        
		//*  21   39:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//*  22   44:pop             
		//*  23   45:aload           4
		//*  24   47:invokevirtual   #46  <Method void Parcel.readException()>
		//*  25   50:aload           4
		//*  26   52:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  27   55:aload_3         
		//*  28   56:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  29   59:return          
		//*  30   60:astore          5
		//*  31   62:aload           4
		//*  32   64:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  33   67:aload_3         
		//*  34   68:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  35   71:aload           5
		//*  36   73:athrow          
				i = 0;
		//   37   74:iconst_0        
		//   38   75:istore_2        
			parcel.writeInt(i);
			zzrk.transact(8, parcel, parcel1, 0);
			parcel1.readException();
			parcel1.recycle();
			parcel.recycle();
			return;
			exception;
			parcel1.recycle();
			parcel.recycle();
			throw exception;
		//*  39   76:goto            24
		}

		public void setCompassEnabled(boolean flag)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//    4    9:aload_3         
		//    5   10:ldc1            #33  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			int i;
			Exception exception;
			if(flag)
		//*   7   15:iload_1         
		//*   8   16:ifeq            73
				i = 1;
		//    9   19:iconst_1        
		//   10   20:istore_2        
			else
		//*  11   21:goto            24
		//*  12   24:aload_3         
		//*  13   25:iload_2         
		//*  14   26:invokevirtual   #68  <Method void Parcel.writeInt(int)>
		//*  15   29:aload_0         
		//*  16   30:getfield        #18  <Field IBinder zzrk>
		//*  17   33:iconst_2        
		//*  18   34:aload_3         
		//*  19   35:aload           4
		//*  20   37:iconst_0        
		//*  21   38:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//*  22   43:pop             
		//*  23   44:aload           4
		//*  24   46:invokevirtual   #46  <Method void Parcel.readException()>
		//*  25   49:aload           4
		//*  26   51:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  27   54:aload_3         
		//*  28   55:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  29   58:return          
		//*  30   59:astore          5
		//*  31   61:aload           4
		//*  32   63:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  33   66:aload_3         
		//*  34   67:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  35   70:aload           5
		//*  36   72:athrow          
				i = 0;
		//   37   73:iconst_0        
		//   38   74:istore_2        
			parcel.writeInt(i);
			zzrk.transact(2, parcel, parcel1, 0);
			parcel1.readException();
			parcel1.recycle();
			parcel.recycle();
			return;
			exception;
			parcel1.recycle();
			parcel.recycle();
			throw exception;
		//*  39   75:goto            24
		}

		public void setIndoorLevelPickerEnabled(boolean flag)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//    4    9:aload_3         
		//    5   10:ldc1            #33  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			int i;
			Exception exception;
			if(flag)
		//*   7   15:iload_1         
		//*   8   16:ifeq            74
				i = 1;
		//    9   19:iconst_1        
		//   10   20:istore_2        
			else
		//*  11   21:goto            24
		//*  12   24:aload_3         
		//*  13   25:iload_2         
		//*  14   26:invokevirtual   #68  <Method void Parcel.writeInt(int)>
		//*  15   29:aload_0         
		//*  16   30:getfield        #18  <Field IBinder zzrk>
		//*  17   33:bipush          16
		//*  18   35:aload_3         
		//*  19   36:aload           4
		//*  20   38:iconst_0        
		//*  21   39:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//*  22   44:pop             
		//*  23   45:aload           4
		//*  24   47:invokevirtual   #46  <Method void Parcel.readException()>
		//*  25   50:aload           4
		//*  26   52:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  27   55:aload_3         
		//*  28   56:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  29   59:return          
		//*  30   60:astore          5
		//*  31   62:aload           4
		//*  32   64:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  33   67:aload_3         
		//*  34   68:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  35   71:aload           5
		//*  36   73:athrow          
				i = 0;
		//   37   74:iconst_0        
		//   38   75:istore_2        
			parcel.writeInt(i);
			zzrk.transact(16, parcel, parcel1, 0);
			parcel1.readException();
			parcel1.recycle();
			parcel.recycle();
			return;
			exception;
			parcel1.recycle();
			parcel.recycle();
			throw exception;
		//*  39   76:goto            24
		}

		public void setMapToolbarEnabled(boolean flag)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//    4    9:aload_3         
		//    5   10:ldc1            #33  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			int i;
			Exception exception;
			if(flag)
		//*   7   15:iload_1         
		//*   8   16:ifeq            74
				i = 1;
		//    9   19:iconst_1        
		//   10   20:istore_2        
			else
		//*  11   21:goto            24
		//*  12   24:aload_3         
		//*  13   25:iload_2         
		//*  14   26:invokevirtual   #68  <Method void Parcel.writeInt(int)>
		//*  15   29:aload_0         
		//*  16   30:getfield        #18  <Field IBinder zzrk>
		//*  17   33:bipush          18
		//*  18   35:aload_3         
		//*  19   36:aload           4
		//*  20   38:iconst_0        
		//*  21   39:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//*  22   44:pop             
		//*  23   45:aload           4
		//*  24   47:invokevirtual   #46  <Method void Parcel.readException()>
		//*  25   50:aload           4
		//*  26   52:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  27   55:aload_3         
		//*  28   56:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  29   59:return          
		//*  30   60:astore          5
		//*  31   62:aload           4
		//*  32   64:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  33   67:aload_3         
		//*  34   68:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  35   71:aload           5
		//*  36   73:athrow          
				i = 0;
		//   37   74:iconst_0        
		//   38   75:istore_2        
			parcel.writeInt(i);
			zzrk.transact(18, parcel, parcel1, 0);
			parcel1.readException();
			parcel1.recycle();
			parcel.recycle();
			return;
			exception;
			parcel1.recycle();
			parcel.recycle();
			throw exception;
		//*  39   76:goto            24
		}

		public void setMyLocationButtonEnabled(boolean flag)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//    4    9:aload_3         
		//    5   10:ldc1            #33  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			int i;
			Exception exception;
			if(flag)
		//*   7   15:iload_1         
		//*   8   16:ifeq            73
				i = 1;
		//    9   19:iconst_1        
		//   10   20:istore_2        
			else
		//*  11   21:goto            24
		//*  12   24:aload_3         
		//*  13   25:iload_2         
		//*  14   26:invokevirtual   #68  <Method void Parcel.writeInt(int)>
		//*  15   29:aload_0         
		//*  16   30:getfield        #18  <Field IBinder zzrk>
		//*  17   33:iconst_3        
		//*  18   34:aload_3         
		//*  19   35:aload           4
		//*  20   37:iconst_0        
		//*  21   38:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//*  22   43:pop             
		//*  23   44:aload           4
		//*  24   46:invokevirtual   #46  <Method void Parcel.readException()>
		//*  25   49:aload           4
		//*  26   51:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  27   54:aload_3         
		//*  28   55:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  29   58:return          
		//*  30   59:astore          5
		//*  31   61:aload           4
		//*  32   63:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  33   66:aload_3         
		//*  34   67:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  35   70:aload           5
		//*  36   72:athrow          
				i = 0;
		//   37   73:iconst_0        
		//   38   74:istore_2        
			parcel.writeInt(i);
			zzrk.transact(3, parcel, parcel1, 0);
			parcel1.readException();
			parcel1.recycle();
			parcel.recycle();
			return;
			exception;
			parcel1.recycle();
			parcel.recycle();
			throw exception;
		//*  39   75:goto            24
		}

		public void setRotateGesturesEnabled(boolean flag)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//    4    9:aload_3         
		//    5   10:ldc1            #33  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			int i;
			Exception exception;
			if(flag)
		//*   7   15:iload_1         
		//*   8   16:ifeq            74
				i = 1;
		//    9   19:iconst_1        
		//   10   20:istore_2        
			else
		//*  11   21:goto            24
		//*  12   24:aload_3         
		//*  13   25:iload_2         
		//*  14   26:invokevirtual   #68  <Method void Parcel.writeInt(int)>
		//*  15   29:aload_0         
		//*  16   30:getfield        #18  <Field IBinder zzrk>
		//*  17   33:bipush          7
		//*  18   35:aload_3         
		//*  19   36:aload           4
		//*  20   38:iconst_0        
		//*  21   39:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//*  22   44:pop             
		//*  23   45:aload           4
		//*  24   47:invokevirtual   #46  <Method void Parcel.readException()>
		//*  25   50:aload           4
		//*  26   52:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  27   55:aload_3         
		//*  28   56:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  29   59:return          
		//*  30   60:astore          5
		//*  31   62:aload           4
		//*  32   64:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  33   67:aload_3         
		//*  34   68:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  35   71:aload           5
		//*  36   73:athrow          
				i = 0;
		//   37   74:iconst_0        
		//   38   75:istore_2        
			parcel.writeInt(i);
			zzrk.transact(7, parcel, parcel1, 0);
			parcel1.readException();
			parcel1.recycle();
			parcel.recycle();
			return;
			exception;
			parcel1.recycle();
			parcel.recycle();
			throw exception;
		//*  39   76:goto            24
		}

		public void setScrollGesturesEnabled(boolean flag)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//    4    9:aload_3         
		//    5   10:ldc1            #33  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			int i;
			Exception exception;
			if(flag)
		//*   7   15:iload_1         
		//*   8   16:ifeq            73
				i = 1;
		//    9   19:iconst_1        
		//   10   20:istore_2        
			else
		//*  11   21:goto            24
		//*  12   24:aload_3         
		//*  13   25:iload_2         
		//*  14   26:invokevirtual   #68  <Method void Parcel.writeInt(int)>
		//*  15   29:aload_0         
		//*  16   30:getfield        #18  <Field IBinder zzrk>
		//*  17   33:iconst_4        
		//*  18   34:aload_3         
		//*  19   35:aload           4
		//*  20   37:iconst_0        
		//*  21   38:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//*  22   43:pop             
		//*  23   44:aload           4
		//*  24   46:invokevirtual   #46  <Method void Parcel.readException()>
		//*  25   49:aload           4
		//*  26   51:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  27   54:aload_3         
		//*  28   55:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  29   58:return          
		//*  30   59:astore          5
		//*  31   61:aload           4
		//*  32   63:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  33   66:aload_3         
		//*  34   67:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  35   70:aload           5
		//*  36   72:athrow          
				i = 0;
		//   37   73:iconst_0        
		//   38   74:istore_2        
			parcel.writeInt(i);
			zzrk.transact(4, parcel, parcel1, 0);
			parcel1.readException();
			parcel1.recycle();
			parcel.recycle();
			return;
			exception;
			parcel1.recycle();
			parcel.recycle();
			throw exception;
		//*  39   75:goto            24
		}

		public void setTiltGesturesEnabled(boolean flag)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//    4    9:aload_3         
		//    5   10:ldc1            #33  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			int i;
			Exception exception;
			if(flag)
		//*   7   15:iload_1         
		//*   8   16:ifeq            74
				i = 1;
		//    9   19:iconst_1        
		//   10   20:istore_2        
			else
		//*  11   21:goto            24
		//*  12   24:aload_3         
		//*  13   25:iload_2         
		//*  14   26:invokevirtual   #68  <Method void Parcel.writeInt(int)>
		//*  15   29:aload_0         
		//*  16   30:getfield        #18  <Field IBinder zzrk>
		//*  17   33:bipush          6
		//*  18   35:aload_3         
		//*  19   36:aload           4
		//*  20   38:iconst_0        
		//*  21   39:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//*  22   44:pop             
		//*  23   45:aload           4
		//*  24   47:invokevirtual   #46  <Method void Parcel.readException()>
		//*  25   50:aload           4
		//*  26   52:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  27   55:aload_3         
		//*  28   56:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  29   59:return          
		//*  30   60:astore          5
		//*  31   62:aload           4
		//*  32   64:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  33   67:aload_3         
		//*  34   68:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  35   71:aload           5
		//*  36   73:athrow          
				i = 0;
		//   37   74:iconst_0        
		//   38   75:istore_2        
			parcel.writeInt(i);
			zzrk.transact(6, parcel, parcel1, 0);
			parcel1.readException();
			parcel1.recycle();
			parcel.recycle();
			return;
			exception;
			parcel1.recycle();
			parcel.recycle();
			throw exception;
		//*  39   76:goto            24
		}

		public void setZoomControlsEnabled(boolean flag)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//    4    9:aload_3         
		//    5   10:ldc1            #33  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			int i;
			Exception exception;
			if(flag)
		//*   7   15:iload_1         
		//*   8   16:ifeq            73
				i = 1;
		//    9   19:iconst_1        
		//   10   20:istore_2        
			else
		//*  11   21:goto            24
		//*  12   24:aload_3         
		//*  13   25:iload_2         
		//*  14   26:invokevirtual   #68  <Method void Parcel.writeInt(int)>
		//*  15   29:aload_0         
		//*  16   30:getfield        #18  <Field IBinder zzrk>
		//*  17   33:iconst_1        
		//*  18   34:aload_3         
		//*  19   35:aload           4
		//*  20   37:iconst_0        
		//*  21   38:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//*  22   43:pop             
		//*  23   44:aload           4
		//*  24   46:invokevirtual   #46  <Method void Parcel.readException()>
		//*  25   49:aload           4
		//*  26   51:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  27   54:aload_3         
		//*  28   55:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  29   58:return          
		//*  30   59:astore          5
		//*  31   61:aload           4
		//*  32   63:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  33   66:aload_3         
		//*  34   67:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  35   70:aload           5
		//*  36   72:athrow          
				i = 0;
		//   37   73:iconst_0        
		//   38   74:istore_2        
			parcel.writeInt(i);
			zzrk.transact(1, parcel, parcel1, 0);
			parcel1.readException();
			parcel1.recycle();
			parcel.recycle();
			return;
			exception;
			parcel1.recycle();
			parcel.recycle();
			throw exception;
		//*  39   75:goto            24
		}

		public void setZoomGesturesEnabled(boolean flag)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
		//    4    9:aload_3         
		//    5   10:ldc1            #33  <String "com.google.android.gms.maps.internal.IUiSettingsDelegate">
		//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			int i;
			Exception exception;
			if(flag)
		//*   7   15:iload_1         
		//*   8   16:ifeq            73
				i = 1;
		//    9   19:iconst_1        
		//   10   20:istore_2        
			else
		//*  11   21:goto            24
		//*  12   24:aload_3         
		//*  13   25:iload_2         
		//*  14   26:invokevirtual   #68  <Method void Parcel.writeInt(int)>
		//*  15   29:aload_0         
		//*  16   30:getfield        #18  <Field IBinder zzrk>
		//*  17   33:iconst_5        
		//*  18   34:aload_3         
		//*  19   35:aload           4
		//*  20   37:iconst_0        
		//*  21   38:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//*  22   43:pop             
		//*  23   44:aload           4
		//*  24   46:invokevirtual   #46  <Method void Parcel.readException()>
		//*  25   49:aload           4
		//*  26   51:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  27   54:aload_3         
		//*  28   55:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  29   58:return          
		//*  30   59:astore          5
		//*  31   61:aload           4
		//*  32   63:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  33   66:aload_3         
		//*  34   67:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  35   70:aload           5
		//*  36   72:athrow          
				i = 0;
		//   37   73:iconst_0        
		//   38   74:istore_2        
			parcel.writeInt(i);
			zzrk.transact(5, parcel, parcel1, 0);
			parcel1.readException();
			parcel1.recycle();
			parcel.recycle();
			return;
			exception;
			parcel1.recycle();
			parcel.recycle();
			throw exception;
		//*  39   75:goto            24
		}

		private IBinder zzrk;

		zza.zza(IBinder ibinder)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			zzrk = ibinder;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field IBinder zzrk>
		//    5    9:return          
		}
	}


	public abstract boolean isCompassEnabled()
		throws RemoteException;

	public abstract boolean isIndoorLevelPickerEnabled()
		throws RemoteException;

	public abstract boolean isMapToolbarEnabled()
		throws RemoteException;

	public abstract boolean isMyLocationButtonEnabled()
		throws RemoteException;

	public abstract boolean isRotateGesturesEnabled()
		throws RemoteException;

	public abstract boolean isScrollGesturesEnabled()
		throws RemoteException;

	public abstract boolean isTiltGesturesEnabled()
		throws RemoteException;

	public abstract boolean isZoomControlsEnabled()
		throws RemoteException;

	public abstract boolean isZoomGesturesEnabled()
		throws RemoteException;

	public abstract void setAllGesturesEnabled(boolean flag)
		throws RemoteException;

	public abstract void setCompassEnabled(boolean flag)
		throws RemoteException;

	public abstract void setIndoorLevelPickerEnabled(boolean flag)
		throws RemoteException;

	public abstract void setMapToolbarEnabled(boolean flag)
		throws RemoteException;

	public abstract void setMyLocationButtonEnabled(boolean flag)
		throws RemoteException;

	public abstract void setRotateGesturesEnabled(boolean flag)
		throws RemoteException;

	public abstract void setScrollGesturesEnabled(boolean flag)
		throws RemoteException;

	public abstract void setTiltGesturesEnabled(boolean flag)
		throws RemoteException;

	public abstract void setZoomControlsEnabled(boolean flag)
		throws RemoteException;

	public abstract void setZoomGesturesEnabled(boolean flag)
		throws RemoteException;
}
