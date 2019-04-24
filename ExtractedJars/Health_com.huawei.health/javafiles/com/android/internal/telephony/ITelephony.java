// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.internal.telephony;

import android.os.*;
import android.telephony.NeighboringCellInfo;
import java.util.List;

public interface ITelephony
	extends IInterface
{
	public static abstract class Stub extends Binder
		implements ITelephony
	{

		public static ITelephony asInterface(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.android.internal.telephony.ITelephony");
		//    4    6:aload_0         
		//    5    7:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//    6    9:invokeinterface #114 <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface != null && (iinterface instanceof ITelephony))
		//*   8   15:aload_1         
		//*   9   16:ifnull          31
		//*  10   19:aload_1         
		//*  11   20:instanceof      #6   <Class ITelephony>
		//*  12   23:ifeq            31
				return (ITelephony)iinterface;
		//   13   26:aload_1         
		//   14   27:checkcast       #6   <Class ITelephony>
		//   15   30:areturn         
			else
				return ((ITelephony) (new Proxy(ibinder)));
		//   16   31:new             #9   <Class ITelephony$Stub$Proxy>
		//   17   34:dup             
		//   18   35:aload_0         
		//   19   36:invokespecial   #117 <Method void ITelephony$Stub$Proxy(IBinder)>
		//   20   39:areturn         
		}

		public IBinder asBinder()
		{
			return ((IBinder) (this));
		//    0    0:aload_0         
		//    1    1:areturn         
		}

		public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
			throws RemoteException
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:lookupswitch    42: default 348
		//		               1: 359
		//		               2: 394
		//		               3: 414
		//		               4: 434
		//		               5: 469
		//		               6: 504
		//		               7: 526
		//		               8: 542
		//		               9: 577
		//		               10: 593
		//		               11: 632
		//		               12: 667
		//		               13: 683
		//		               14: 726
		//		               15: 742
		//		               16: 768
		//		               17: 803
		//		               18: 843
		//		               19: 865
		//		               20: 887
		//		               21: 909
		//		               22: 931
		//		               23: 953
		//		               24: 975
		//		               25: 997
		//		               26: 1019
		//		               27: 1054
		//		               28: 1107
		//		               29: 1123
		//		               30: 1139
		//		               31: 1165
		//		               32: 1200
		//		               33: 1216
		//		               34: 1251
		//		               35: 1290
		//		               36: 1325
		//		               37: 1360
		//		               38: 1382
		//		               39: 1404
		//		               40: 1443
		//		               41: 1496
		//		               1598968902: 351
		//*   2  348:goto            1531
			case 1598968902: 
				parcel1.writeString("com.android.internal.telephony.ITelephony");
		//    3  351:aload_3         
		//    4  352:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//    5  354:invokevirtual   #129 <Method void Parcel.writeString(String)>
				return true;
		//    6  357:iconst_1        
		//    7  358:ireturn         

			case 1: // '\001'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//    8  359:aload_2         
		//    9  360:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//   10  362:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				boolean flag = showCallScreen();
		//   11  365:aload_0         
		//   12  366:invokevirtual   #136 <Method boolean showCallScreen()>
		//   13  369:istore          5
				parcel1.writeNoException();
		//   14  371:aload_3         
		//   15  372:invokevirtual   #139 <Method void Parcel.writeNoException()>
				if(flag)
		//*  16  375:iload           5
		//*  17  377:ifeq            385
					i = 1;
		//   18  380:iconst_1        
		//   19  381:istore_1        
				else
		//*  20  382:goto            387
					i = 0;
		//   21  385:iconst_0        
		//   22  386:istore_1        
				parcel1.writeInt(i);
		//   23  387:aload_3         
		//   24  388:iload_1         
		//   25  389:invokevirtual   #143 <Method void Parcel.writeInt(int)>
				return true;
		//   26  392:iconst_1        
		//   27  393:ireturn         

			case 2: // '\002'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//   28  394:aload_2         
		//   29  395:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//   30  397:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				dial(parcel.readString());
		//   31  400:aload_0         
		//   32  401:aload_2         
		//   33  402:invokevirtual   #147 <Method String Parcel.readString()>
		//   34  405:invokevirtual   #150 <Method void dial(String)>
				parcel1.writeNoException();
		//   35  408:aload_3         
		//   36  409:invokevirtual   #139 <Method void Parcel.writeNoException()>
				return true;
		//   37  412:iconst_1        
		//   38  413:ireturn         

			case 3: // '\003'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//   39  414:aload_2         
		//   40  415:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//   41  417:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				call(parcel.readString());
		//   42  420:aload_0         
		//   43  421:aload_2         
		//   44  422:invokevirtual   #147 <Method String Parcel.readString()>
		//   45  425:invokevirtual   #153 <Method void call(String)>
				parcel1.writeNoException();
		//   46  428:aload_3         
		//   47  429:invokevirtual   #139 <Method void Parcel.writeNoException()>
				return true;
		//   48  432:iconst_1        
		//   49  433:ireturn         

			case 4: // '\004'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//   50  434:aload_2         
		//   51  435:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//   52  437:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				boolean flag1 = isIdle();
		//   53  440:aload_0         
		//   54  441:invokevirtual   #156 <Method boolean isIdle()>
		//   55  444:istore          5
				parcel1.writeNoException();
		//   56  446:aload_3         
		//   57  447:invokevirtual   #139 <Method void Parcel.writeNoException()>
				if(flag1)
		//*  58  450:iload           5
		//*  59  452:ifeq            460
					i = 1;
		//   60  455:iconst_1        
		//   61  456:istore_1        
				else
		//*  62  457:goto            462
					i = 0;
		//   63  460:iconst_0        
		//   64  461:istore_1        
				parcel1.writeInt(i);
		//   65  462:aload_3         
		//   66  463:iload_1         
		//   67  464:invokevirtual   #143 <Method void Parcel.writeInt(int)>
				return true;
		//   68  467:iconst_1        
		//   69  468:ireturn         

			case 5: // '\005'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//   70  469:aload_2         
		//   71  470:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//   72  472:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				boolean flag2 = hasIccCard();
		//   73  475:aload_0         
		//   74  476:invokevirtual   #159 <Method boolean hasIccCard()>
		//   75  479:istore          5
				parcel1.writeNoException();
		//   76  481:aload_3         
		//   77  482:invokevirtual   #139 <Method void Parcel.writeNoException()>
				if(flag2)
		//*  78  485:iload           5
		//*  79  487:ifeq            495
					i = 1;
		//   80  490:iconst_1        
		//   81  491:istore_1        
				else
		//*  82  492:goto            497
					i = 0;
		//   83  495:iconst_0        
		//   84  496:istore_1        
				parcel1.writeInt(i);
		//   85  497:aload_3         
		//   86  498:iload_1         
		//   87  499:invokevirtual   #143 <Method void Parcel.writeInt(int)>
				return true;
		//   88  502:iconst_1        
		//   89  503:ireturn         

			case 6: // '\006'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//   90  504:aload_2         
		//   91  505:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//   92  507:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				i = getLteOnCdmaMode();
		//   93  510:aload_0         
		//   94  511:invokevirtual   #163 <Method int getLteOnCdmaMode()>
		//   95  514:istore_1        
				parcel1.writeNoException();
		//   96  515:aload_3         
		//   97  516:invokevirtual   #139 <Method void Parcel.writeNoException()>
				parcel1.writeInt(i);
		//   98  519:aload_3         
		//   99  520:iload_1         
		//  100  521:invokevirtual   #143 <Method void Parcel.writeInt(int)>
				return true;
		//  101  524:iconst_1        
		//  102  525:ireturn         

			case 7: // '\007'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//  103  526:aload_2         
		//  104  527:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//  105  529:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				answerRingingCall();
		//  106  532:aload_0         
		//  107  533:invokevirtual   #166 <Method void answerRingingCall()>
				parcel1.writeNoException();
		//  108  536:aload_3         
		//  109  537:invokevirtual   #139 <Method void Parcel.writeNoException()>
				return true;
		//  110  540:iconst_1        
		//  111  541:ireturn         

			case 8: // '\b'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//  112  542:aload_2         
		//  113  543:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//  114  545:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				boolean flag3 = disableDataConnectivity();
		//  115  548:aload_0         
		//  116  549:invokevirtual   #169 <Method boolean disableDataConnectivity()>
		//  117  552:istore          5
				parcel1.writeNoException();
		//  118  554:aload_3         
		//  119  555:invokevirtual   #139 <Method void Parcel.writeNoException()>
				if(flag3)
		//* 120  558:iload           5
		//* 121  560:ifeq            568
					i = 1;
		//  122  563:iconst_1        
		//  123  564:istore_1        
				else
		//* 124  565:goto            570
					i = 0;
		//  125  568:iconst_0        
		//  126  569:istore_1        
				parcel1.writeInt(i);
		//  127  570:aload_3         
		//  128  571:iload_1         
		//  129  572:invokevirtual   #143 <Method void Parcel.writeInt(int)>
				return true;
		//  130  575:iconst_1        
		//  131  576:ireturn         

			case 9: // '\t'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//  132  577:aload_2         
		//  133  578:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//  134  580:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				cancelMissedCallsNotification();
		//  135  583:aload_0         
		//  136  584:invokevirtual   #172 <Method void cancelMissedCallsNotification()>
				parcel1.writeNoException();
		//  137  587:aload_3         
		//  138  588:invokevirtual   #139 <Method void Parcel.writeNoException()>
				return true;
		//  139  591:iconst_1        
		//  140  592:ireturn         

			case 10: // '\n'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//  141  593:aload_2         
		//  142  594:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//  143  596:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				boolean flag4 = handlePinMmi(parcel.readString());
		//  144  599:aload_0         
		//  145  600:aload_2         
		//  146  601:invokevirtual   #147 <Method String Parcel.readString()>
		//  147  604:invokevirtual   #176 <Method boolean handlePinMmi(String)>
		//  148  607:istore          5
				parcel1.writeNoException();
		//  149  609:aload_3         
		//  150  610:invokevirtual   #139 <Method void Parcel.writeNoException()>
				if(flag4)
		//* 151  613:iload           5
		//* 152  615:ifeq            623
					i = 1;
		//  153  618:iconst_1        
		//  154  619:istore_1        
				else
		//* 155  620:goto            625
					i = 0;
		//  156  623:iconst_0        
		//  157  624:istore_1        
				parcel1.writeInt(i);
		//  158  625:aload_3         
		//  159  626:iload_1         
		//  160  627:invokevirtual   #143 <Method void Parcel.writeInt(int)>
				return true;
		//  161  630:iconst_1        
		//  162  631:ireturn         

			case 11: // '\013'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//  163  632:aload_2         
		//  164  633:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//  165  635:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				boolean flag5 = isRadioOn();
		//  166  638:aload_0         
		//  167  639:invokevirtual   #179 <Method boolean isRadioOn()>
		//  168  642:istore          5
				parcel1.writeNoException();
		//  169  644:aload_3         
		//  170  645:invokevirtual   #139 <Method void Parcel.writeNoException()>
				if(flag5)
		//* 171  648:iload           5
		//* 172  650:ifeq            658
					i = 1;
		//  173  653:iconst_1        
		//  174  654:istore_1        
				else
		//* 175  655:goto            660
					i = 0;
		//  176  658:iconst_0        
		//  177  659:istore_1        
				parcel1.writeInt(i);
		//  178  660:aload_3         
		//  179  661:iload_1         
		//  180  662:invokevirtual   #143 <Method void Parcel.writeInt(int)>
				return true;
		//  181  665:iconst_1        
		//  182  666:ireturn         

			case 12: // '\f'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//  183  667:aload_2         
		//  184  668:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//  185  670:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				toggleRadioOnOff();
		//  186  673:aload_0         
		//  187  674:invokevirtual   #182 <Method void toggleRadioOnOff()>
				parcel1.writeNoException();
		//  188  677:aload_3         
		//  189  678:invokevirtual   #139 <Method void Parcel.writeNoException()>
				return true;
		//  190  681:iconst_1        
		//  191  682:ireturn         

			case 13: // '\r'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//  192  683:aload_2         
		//  193  684:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//  194  686:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				boolean flag6 = supplyPuk(parcel.readString(), parcel.readString());
		//  195  689:aload_0         
		//  196  690:aload_2         
		//  197  691:invokevirtual   #147 <Method String Parcel.readString()>
		//  198  694:aload_2         
		//  199  695:invokevirtual   #147 <Method String Parcel.readString()>
		//  200  698:invokevirtual   #186 <Method boolean supplyPuk(String, String)>
		//  201  701:istore          5
				parcel1.writeNoException();
		//  202  703:aload_3         
		//  203  704:invokevirtual   #139 <Method void Parcel.writeNoException()>
				if(flag6)
		//* 204  707:iload           5
		//* 205  709:ifeq            717
					i = 1;
		//  206  712:iconst_1        
		//  207  713:istore_1        
				else
		//* 208  714:goto            719
					i = 0;
		//  209  717:iconst_0        
		//  210  718:istore_1        
				parcel1.writeInt(i);
		//  211  719:aload_3         
		//  212  720:iload_1         
		//  213  721:invokevirtual   #143 <Method void Parcel.writeInt(int)>
				return true;
		//  214  724:iconst_1        
		//  215  725:ireturn         

			case 14: // '\016'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//  216  726:aload_2         
		//  217  727:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//  218  729:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				disableLocationUpdates();
		//  219  732:aload_0         
		//  220  733:invokevirtual   #189 <Method void disableLocationUpdates()>
				parcel1.writeNoException();
		//  221  736:aload_3         
		//  222  737:invokevirtual   #139 <Method void Parcel.writeNoException()>
				return true;
		//  223  740:iconst_1        
		//  224  741:ireturn         

			case 15: // '\017'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//  225  742:aload_2         
		//  226  743:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//  227  745:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				i = enableApnType(parcel.readString());
		//  228  748:aload_0         
		//  229  749:aload_2         
		//  230  750:invokevirtual   #147 <Method String Parcel.readString()>
		//  231  753:invokevirtual   #193 <Method int enableApnType(String)>
		//  232  756:istore_1        
				parcel1.writeNoException();
		//  233  757:aload_3         
		//  234  758:invokevirtual   #139 <Method void Parcel.writeNoException()>
				parcel1.writeInt(i);
		//  235  761:aload_3         
		//  236  762:iload_1         
		//  237  763:invokevirtual   #143 <Method void Parcel.writeInt(int)>
				return true;
		//  238  766:iconst_1        
		//  239  767:ireturn         

			case 16: // '\020'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//  240  768:aload_2         
		//  241  769:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//  242  771:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				boolean flag7 = isDataConnectivityPossible();
		//  243  774:aload_0         
		//  244  775:invokevirtual   #196 <Method boolean isDataConnectivityPossible()>
		//  245  778:istore          5
				parcel1.writeNoException();
		//  246  780:aload_3         
		//  247  781:invokevirtual   #139 <Method void Parcel.writeNoException()>
				if(flag7)
		//* 248  784:iload           5
		//* 249  786:ifeq            794
					i = 1;
		//  250  789:iconst_1        
		//  251  790:istore_1        
				else
		//* 252  791:goto            796
					i = 0;
		//  253  794:iconst_0        
		//  254  795:istore_1        
				parcel1.writeInt(i);
		//  255  796:aload_3         
		//  256  797:iload_1         
		//  257  798:invokevirtual   #143 <Method void Parcel.writeInt(int)>
				return true;
		//  258  801:iconst_1        
		//  259  802:ireturn         

			case 17: // '\021'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//  260  803:aload_2         
		//  261  804:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//  262  806:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getCellLocation()));
		//  263  809:aload_0         
		//  264  810:invokevirtual   #200 <Method Bundle getCellLocation()>
		//  265  813:astore_2        
				parcel1.writeNoException();
		//  266  814:aload_3         
		//  267  815:invokevirtual   #139 <Method void Parcel.writeNoException()>
				if(parcel != null)
		//* 268  818:aload_2         
		//* 269  819:ifnull          836
				{
					parcel1.writeInt(1);
		//  270  822:aload_3         
		//  271  823:iconst_1        
		//  272  824:invokevirtual   #143 <Method void Parcel.writeInt(int)>
					((Bundle) (parcel)).writeToParcel(parcel1, 1);
		//  273  827:aload_2         
		//  274  828:aload_3         
		//  275  829:iconst_1        
		//  276  830:invokevirtual   #206 <Method void Bundle.writeToParcel(Parcel, int)>
				} else
		//* 277  833:goto            841
				{
					parcel1.writeInt(0);
		//  278  836:aload_3         
		//  279  837:iconst_0        
		//  280  838:invokevirtual   #143 <Method void Parcel.writeInt(int)>
				}
				return true;
		//  281  841:iconst_1        
		//  282  842:ireturn         

			case 18: // '\022'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//  283  843:aload_2         
		//  284  844:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//  285  846:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getNeighboringCellInfo()));
		//  286  849:aload_0         
		//  287  850:invokevirtual   #210 <Method List getNeighboringCellInfo()>
		//  288  853:astore_2        
				parcel1.writeNoException();
		//  289  854:aload_3         
		//  290  855:invokevirtual   #139 <Method void Parcel.writeNoException()>
				parcel1.writeTypedList(((List) (parcel)));
		//  291  858:aload_3         
		//  292  859:aload_2         
		//  293  860:invokevirtual   #214 <Method void Parcel.writeTypedList(List)>
				return true;
		//  294  863:iconst_1        
		//  295  864:ireturn         

			case 19: // '\023'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//  296  865:aload_2         
		//  297  866:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//  298  868:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				i = getCallState();
		//  299  871:aload_0         
		//  300  872:invokevirtual   #217 <Method int getCallState()>
		//  301  875:istore_1        
				parcel1.writeNoException();
		//  302  876:aload_3         
		//  303  877:invokevirtual   #139 <Method void Parcel.writeNoException()>
				parcel1.writeInt(i);
		//  304  880:aload_3         
		//  305  881:iload_1         
		//  306  882:invokevirtual   #143 <Method void Parcel.writeInt(int)>
				return true;
		//  307  885:iconst_1        
		//  308  886:ireturn         

			case 20: // '\024'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//  309  887:aload_2         
		//  310  888:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//  311  890:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				i = getDataActivity();
		//  312  893:aload_0         
		//  313  894:invokevirtual   #220 <Method int getDataActivity()>
		//  314  897:istore_1        
				parcel1.writeNoException();
		//  315  898:aload_3         
		//  316  899:invokevirtual   #139 <Method void Parcel.writeNoException()>
				parcel1.writeInt(i);
		//  317  902:aload_3         
		//  318  903:iload_1         
		//  319  904:invokevirtual   #143 <Method void Parcel.writeInt(int)>
				return true;
		//  320  907:iconst_1        
		//  321  908:ireturn         

			case 21: // '\025'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//  322  909:aload_2         
		//  323  910:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//  324  912:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				i = getDataState();
		//  325  915:aload_0         
		//  326  916:invokevirtual   #223 <Method int getDataState()>
		//  327  919:istore_1        
				parcel1.writeNoException();
		//  328  920:aload_3         
		//  329  921:invokevirtual   #139 <Method void Parcel.writeNoException()>
				parcel1.writeInt(i);
		//  330  924:aload_3         
		//  331  925:iload_1         
		//  332  926:invokevirtual   #143 <Method void Parcel.writeInt(int)>
				return true;
		//  333  929:iconst_1        
		//  334  930:ireturn         

			case 22: // '\026'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//  335  931:aload_2         
		//  336  932:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//  337  934:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				i = getActivePhoneType();
		//  338  937:aload_0         
		//  339  938:invokevirtual   #226 <Method int getActivePhoneType()>
		//  340  941:istore_1        
				parcel1.writeNoException();
		//  341  942:aload_3         
		//  342  943:invokevirtual   #139 <Method void Parcel.writeNoException()>
				parcel1.writeInt(i);
		//  343  946:aload_3         
		//  344  947:iload_1         
		//  345  948:invokevirtual   #143 <Method void Parcel.writeInt(int)>
				return true;
		//  346  951:iconst_1        
		//  347  952:ireturn         

			case 23: // '\027'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//  348  953:aload_2         
		//  349  954:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//  350  956:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				i = getCdmaEriIconIndex();
		//  351  959:aload_0         
		//  352  960:invokevirtual   #229 <Method int getCdmaEriIconIndex()>
		//  353  963:istore_1        
				parcel1.writeNoException();
		//  354  964:aload_3         
		//  355  965:invokevirtual   #139 <Method void Parcel.writeNoException()>
				parcel1.writeInt(i);
		//  356  968:aload_3         
		//  357  969:iload_1         
		//  358  970:invokevirtual   #143 <Method void Parcel.writeInt(int)>
				return true;
		//  359  973:iconst_1        
		//  360  974:ireturn         

			case 24: // '\030'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//  361  975:aload_2         
		//  362  976:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//  363  978:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				i = getCdmaEriIconMode();
		//  364  981:aload_0         
		//  365  982:invokevirtual   #232 <Method int getCdmaEriIconMode()>
		//  366  985:istore_1        
				parcel1.writeNoException();
		//  367  986:aload_3         
		//  368  987:invokevirtual   #139 <Method void Parcel.writeNoException()>
				parcel1.writeInt(i);
		//  369  990:aload_3         
		//  370  991:iload_1         
		//  371  992:invokevirtual   #143 <Method void Parcel.writeInt(int)>
				return true;
		//  372  995:iconst_1        
		//  373  996:ireturn         

			case 25: // '\031'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//  374  997:aload_2         
		//  375  998:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//  376 1000:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getCdmaEriText()));
		//  377 1003:aload_0         
		//  378 1004:invokevirtual   #235 <Method String getCdmaEriText()>
		//  379 1007:astore_2        
				parcel1.writeNoException();
		//  380 1008:aload_3         
		//  381 1009:invokevirtual   #139 <Method void Parcel.writeNoException()>
				parcel1.writeString(((String) (parcel)));
		//  382 1012:aload_3         
		//  383 1013:aload_2         
		//  384 1014:invokevirtual   #129 <Method void Parcel.writeString(String)>
				return true;
		//  385 1017:iconst_1        
		//  386 1018:ireturn         

			case 26: // '\032'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//  387 1019:aload_2         
		//  388 1020:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//  389 1022:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				boolean flag8 = needsOtaServiceProvisioning();
		//  390 1025:aload_0         
		//  391 1026:invokevirtual   #238 <Method boolean needsOtaServiceProvisioning()>
		//  392 1029:istore          5
				parcel1.writeNoException();
		//  393 1031:aload_3         
		//  394 1032:invokevirtual   #139 <Method void Parcel.writeNoException()>
				if(flag8)
		//* 395 1035:iload           5
		//* 396 1037:ifeq            1045
					i = 1;
		//  397 1040:iconst_1        
		//  398 1041:istore_1        
				else
		//* 399 1042:goto            1047
					i = 0;
		//  400 1045:iconst_0        
		//  401 1046:istore_1        
				parcel1.writeInt(i);
		//  402 1047:aload_3         
		//  403 1048:iload_1         
		//  404 1049:invokevirtual   #143 <Method void Parcel.writeInt(int)>
				return true;
		//  405 1052:iconst_1        
		//  406 1053:ireturn         

			case 27: // '\033'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//  407 1054:aload_2         
		//  408 1055:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//  409 1057:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				boolean flag9;
				if(parcel.readInt() != 0)
		//* 410 1060:aload_2         
		//* 411 1061:invokevirtual   #241 <Method int Parcel.readInt()>
		//* 412 1064:ifeq            1073
					flag9 = true;
		//  413 1067:iconst_1        
		//  414 1068:istore          5
				else
		//* 415 1070:goto            1076
					flag9 = false;
		//  416 1073:iconst_0        
		//  417 1074:istore          5
				flag9 = setRadio(flag9);
		//  418 1076:aload_0         
		//  419 1077:iload           5
		//  420 1079:invokevirtual   #245 <Method boolean setRadio(boolean)>
		//  421 1082:istore          5
				parcel1.writeNoException();
		//  422 1084:aload_3         
		//  423 1085:invokevirtual   #139 <Method void Parcel.writeNoException()>
				if(flag9)
		//* 424 1088:iload           5
		//* 425 1090:ifeq            1098
					i = 1;
		//  426 1093:iconst_1        
		//  427 1094:istore_1        
				else
		//* 428 1095:goto            1100
					i = 0;
		//  429 1098:iconst_0        
		//  430 1099:istore_1        
				parcel1.writeInt(i);
		//  431 1100:aload_3         
		//  432 1101:iload_1         
		//  433 1102:invokevirtual   #143 <Method void Parcel.writeInt(int)>
				return true;
		//  434 1105:iconst_1        
		//  435 1106:ireturn         

			case 28: // '\034'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//  436 1107:aload_2         
		//  437 1108:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//  438 1110:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				updateServiceLocation();
		//  439 1113:aload_0         
		//  440 1114:invokevirtual   #248 <Method void updateServiceLocation()>
				parcel1.writeNoException();
		//  441 1117:aload_3         
		//  442 1118:invokevirtual   #139 <Method void Parcel.writeNoException()>
				return true;
		//  443 1121:iconst_1        
		//  444 1122:ireturn         

			case 29: // '\035'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//  445 1123:aload_2         
		//  446 1124:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//  447 1126:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				enableLocationUpdates();
		//  448 1129:aload_0         
		//  449 1130:invokevirtual   #251 <Method void enableLocationUpdates()>
				parcel1.writeNoException();
		//  450 1133:aload_3         
		//  451 1134:invokevirtual   #139 <Method void Parcel.writeNoException()>
				return true;
		//  452 1137:iconst_1        
		//  453 1138:ireturn         

			case 30: // '\036'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//  454 1139:aload_2         
		//  455 1140:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//  456 1142:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				i = disableApnType(parcel.readString());
		//  457 1145:aload_0         
		//  458 1146:aload_2         
		//  459 1147:invokevirtual   #147 <Method String Parcel.readString()>
		//  460 1150:invokevirtual   #254 <Method int disableApnType(String)>
		//  461 1153:istore_1        
				parcel1.writeNoException();
		//  462 1154:aload_3         
		//  463 1155:invokevirtual   #139 <Method void Parcel.writeNoException()>
				parcel1.writeInt(i);
		//  464 1158:aload_3         
		//  465 1159:iload_1         
		//  466 1160:invokevirtual   #143 <Method void Parcel.writeInt(int)>
				return true;
		//  467 1163:iconst_1        
		//  468 1164:ireturn         

			case 31: // '\037'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//  469 1165:aload_2         
		//  470 1166:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//  471 1168:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				boolean flag10 = isOffhook();
		//  472 1171:aload_0         
		//  473 1172:invokevirtual   #257 <Method boolean isOffhook()>
		//  474 1175:istore          5
				parcel1.writeNoException();
		//  475 1177:aload_3         
		//  476 1178:invokevirtual   #139 <Method void Parcel.writeNoException()>
				if(flag10)
		//* 477 1181:iload           5
		//* 478 1183:ifeq            1191
					i = 1;
		//  479 1186:iconst_1        
		//  480 1187:istore_1        
				else
		//* 481 1188:goto            1193
					i = 0;
		//  482 1191:iconst_0        
		//  483 1192:istore_1        
				parcel1.writeInt(i);
		//  484 1193:aload_3         
		//  485 1194:iload_1         
		//  486 1195:invokevirtual   #143 <Method void Parcel.writeInt(int)>
				return true;
		//  487 1198:iconst_1        
		//  488 1199:ireturn         

			case 32: // ' '
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//  489 1200:aload_2         
		//  490 1201:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//  491 1203:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				silenceRinger();
		//  492 1206:aload_0         
		//  493 1207:invokevirtual   #260 <Method void silenceRinger()>
				parcel1.writeNoException();
		//  494 1210:aload_3         
		//  495 1211:invokevirtual   #139 <Method void Parcel.writeNoException()>
				return true;
		//  496 1214:iconst_1        
		//  497 1215:ireturn         

			case 33: // '!'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//  498 1216:aload_2         
		//  499 1217:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//  500 1219:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				boolean flag11 = isRinging();
		//  501 1222:aload_0         
		//  502 1223:invokevirtual   #263 <Method boolean isRinging()>
		//  503 1226:istore          5
				parcel1.writeNoException();
		//  504 1228:aload_3         
		//  505 1229:invokevirtual   #139 <Method void Parcel.writeNoException()>
				if(flag11)
		//* 506 1232:iload           5
		//* 507 1234:ifeq            1242
					i = 1;
		//  508 1237:iconst_1        
		//  509 1238:istore_1        
				else
		//* 510 1239:goto            1244
					i = 0;
		//  511 1242:iconst_0        
		//  512 1243:istore_1        
				parcel1.writeInt(i);
		//  513 1244:aload_3         
		//  514 1245:iload_1         
		//  515 1246:invokevirtual   #143 <Method void Parcel.writeInt(int)>
				return true;
		//  516 1249:iconst_1        
		//  517 1250:ireturn         

			case 34: // '"'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//  518 1251:aload_2         
		//  519 1252:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//  520 1254:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				boolean flag12 = supplyPin(parcel.readString());
		//  521 1257:aload_0         
		//  522 1258:aload_2         
		//  523 1259:invokevirtual   #147 <Method String Parcel.readString()>
		//  524 1262:invokevirtual   #266 <Method boolean supplyPin(String)>
		//  525 1265:istore          5
				parcel1.writeNoException();
		//  526 1267:aload_3         
		//  527 1268:invokevirtual   #139 <Method void Parcel.writeNoException()>
				if(flag12)
		//* 528 1271:iload           5
		//* 529 1273:ifeq            1281
					i = 1;
		//  530 1276:iconst_1        
		//  531 1277:istore_1        
				else
		//* 532 1278:goto            1283
					i = 0;
		//  533 1281:iconst_0        
		//  534 1282:istore_1        
				parcel1.writeInt(i);
		//  535 1283:aload_3         
		//  536 1284:iload_1         
		//  537 1285:invokevirtual   #143 <Method void Parcel.writeInt(int)>
				return true;
		//  538 1288:iconst_1        
		//  539 1289:ireturn         

			case 35: // '#'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//  540 1290:aload_2         
		//  541 1291:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//  542 1293:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				boolean flag13 = isSimPinEnabled();
		//  543 1296:aload_0         
		//  544 1297:invokevirtual   #269 <Method boolean isSimPinEnabled()>
		//  545 1300:istore          5
				parcel1.writeNoException();
		//  546 1302:aload_3         
		//  547 1303:invokevirtual   #139 <Method void Parcel.writeNoException()>
				if(flag13)
		//* 548 1306:iload           5
		//* 549 1308:ifeq            1316
					i = 1;
		//  550 1311:iconst_1        
		//  551 1312:istore_1        
				else
		//* 552 1313:goto            1318
					i = 0;
		//  553 1316:iconst_0        
		//  554 1317:istore_1        
				parcel1.writeInt(i);
		//  555 1318:aload_3         
		//  556 1319:iload_1         
		//  557 1320:invokevirtual   #143 <Method void Parcel.writeInt(int)>
				return true;
		//  558 1323:iconst_1        
		//  559 1324:ireturn         

			case 36: // '$'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//  560 1325:aload_2         
		//  561 1326:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//  562 1328:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				boolean flag14 = enableDataConnectivity();
		//  563 1331:aload_0         
		//  564 1332:invokevirtual   #272 <Method boolean enableDataConnectivity()>
		//  565 1335:istore          5
				parcel1.writeNoException();
		//  566 1337:aload_3         
		//  567 1338:invokevirtual   #139 <Method void Parcel.writeNoException()>
				if(flag14)
		//* 568 1341:iload           5
		//* 569 1343:ifeq            1351
					i = 1;
		//  570 1346:iconst_1        
		//  571 1347:istore_1        
				else
		//* 572 1348:goto            1353
					i = 0;
		//  573 1351:iconst_0        
		//  574 1352:istore_1        
				parcel1.writeInt(i);
		//  575 1353:aload_3         
		//  576 1354:iload_1         
		//  577 1355:invokevirtual   #143 <Method void Parcel.writeInt(int)>
				return true;
		//  578 1358:iconst_1        
		//  579 1359:ireturn         

			case 37: // '%'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//  580 1360:aload_2         
		//  581 1361:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//  582 1363:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				i = getVoiceMessageCount();
		//  583 1366:aload_0         
		//  584 1367:invokevirtual   #275 <Method int getVoiceMessageCount()>
		//  585 1370:istore_1        
				parcel1.writeNoException();
		//  586 1371:aload_3         
		//  587 1372:invokevirtual   #139 <Method void Parcel.writeNoException()>
				parcel1.writeInt(i);
		//  588 1375:aload_3         
		//  589 1376:iload_1         
		//  590 1377:invokevirtual   #143 <Method void Parcel.writeInt(int)>
				return true;
		//  591 1380:iconst_1        
		//  592 1381:ireturn         

			case 38: // '&'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//  593 1382:aload_2         
		//  594 1383:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//  595 1385:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				i = getNetworkType();
		//  596 1388:aload_0         
		//  597 1389:invokevirtual   #278 <Method int getNetworkType()>
		//  598 1392:istore_1        
				parcel1.writeNoException();
		//  599 1393:aload_3         
		//  600 1394:invokevirtual   #139 <Method void Parcel.writeNoException()>
				parcel1.writeInt(i);
		//  601 1397:aload_3         
		//  602 1398:iload_1         
		//  603 1399:invokevirtual   #143 <Method void Parcel.writeInt(int)>
				return true;
		//  604 1402:iconst_1        
		//  605 1403:ireturn         

			case 39: // '\''
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//  606 1404:aload_2         
		//  607 1405:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//  608 1407:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				boolean flag15 = endCallForSubscriber(parcel.readInt());
		//  609 1410:aload_0         
		//  610 1411:aload_2         
		//  611 1412:invokevirtual   #241 <Method int Parcel.readInt()>
		//  612 1415:invokevirtual   #282 <Method boolean endCallForSubscriber(int)>
		//  613 1418:istore          5
				parcel1.writeNoException();
		//  614 1420:aload_3         
		//  615 1421:invokevirtual   #139 <Method void Parcel.writeNoException()>
				if(flag15)
		//* 616 1424:iload           5
		//* 617 1426:ifeq            1434
					i = 1;
		//  618 1429:iconst_1        
		//  619 1430:istore_1        
				else
		//* 620 1431:goto            1436
					i = 0;
		//  621 1434:iconst_0        
		//  622 1435:istore_1        
				parcel1.writeInt(i);
		//  623 1436:aload_3         
		//  624 1437:iload_1         
		//  625 1438:invokevirtual   #143 <Method void Parcel.writeInt(int)>
				return true;
		//  626 1441:iconst_1        
		//  627 1442:ireturn         

			case 40: // '('
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//  628 1443:aload_2         
		//  629 1444:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//  630 1446:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				boolean flag16;
				if(parcel.readInt() != 0)
		//* 631 1449:aload_2         
		//* 632 1450:invokevirtual   #241 <Method int Parcel.readInt()>
		//* 633 1453:ifeq            1462
					flag16 = true;
		//  634 1456:iconst_1        
		//  635 1457:istore          5
				else
		//* 636 1459:goto            1465
					flag16 = false;
		//  637 1462:iconst_0        
		//  638 1463:istore          5
				flag16 = showCallScreenWithDialpad(flag16);
		//  639 1465:aload_0         
		//  640 1466:iload           5
		//  641 1468:invokevirtual   #285 <Method boolean showCallScreenWithDialpad(boolean)>
		//  642 1471:istore          5
				parcel1.writeNoException();
		//  643 1473:aload_3         
		//  644 1474:invokevirtual   #139 <Method void Parcel.writeNoException()>
				if(flag16)
		//* 645 1477:iload           5
		//* 646 1479:ifeq            1487
					i = 1;
		//  647 1482:iconst_1        
		//  648 1483:istore_1        
				else
		//* 649 1484:goto            1489
					i = 0;
		//  650 1487:iconst_0        
		//  651 1488:istore_1        
				parcel1.writeInt(i);
		//  652 1489:aload_3         
		//  653 1490:iload_1         
		//  654 1491:invokevirtual   #143 <Method void Parcel.writeInt(int)>
				return true;
		//  655 1494:iconst_1        
		//  656 1495:ireturn         

			case 41: // ')'
				parcel.enforceInterface("com.android.internal.telephony.ITelephony");
		//  657 1496:aload_2         
		//  658 1497:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//  659 1499:invokevirtual   #132 <Method void Parcel.enforceInterface(String)>
				boolean flag17 = endCall();
		//  660 1502:aload_0         
		//  661 1503:invokevirtual   #288 <Method boolean endCall()>
		//  662 1506:istore          5
				parcel1.writeNoException();
		//  663 1508:aload_3         
		//  664 1509:invokevirtual   #139 <Method void Parcel.writeNoException()>
				if(flag17)
		//* 665 1512:iload           5
		//* 666 1514:ifeq            1522
					i = 1;
		//  667 1517:iconst_1        
		//  668 1518:istore_1        
				else
		//* 669 1519:goto            1524
					i = 0;
		//  670 1522:iconst_0        
		//  671 1523:istore_1        
				parcel1.writeInt(i);
		//  672 1524:aload_3         
		//  673 1525:iload_1         
		//  674 1526:invokevirtual   #143 <Method void Parcel.writeInt(int)>
				return true;
		//  675 1529:iconst_1        
		//  676 1530:ireturn         
			}
			return super.onTransact(i, parcel, parcel1, j);
		//  677 1531:aload_0         
		//  678 1532:iload_1         
		//  679 1533:aload_2         
		//  680 1534:aload_3         
		//  681 1535:iload           4
		//  682 1537:invokespecial   #290 <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//  683 1540:ireturn         
		}

		private static final String DESCRIPTOR = "com.android.internal.telephony.ITelephony";
		static final int TRANSACTION_answerRingingCall = 7;
		static final int TRANSACTION_call = 3;
		static final int TRANSACTION_cancelMissedCallsNotification = 9;
		static final int TRANSACTION_dial = 2;
		static final int TRANSACTION_disableApnType = 30;
		static final int TRANSACTION_disableDataConnectivity = 8;
		static final int TRANSACTION_disableLocationUpdates = 14;
		static final int TRANSACTION_enableApnType = 15;
		static final int TRANSACTION_enableDataConnectivity = 36;
		static final int TRANSACTION_enableLocationUpdates = 29;
		static final int TRANSACTION_endCall = 41;
		static final int TRANSACTION_endCallForSubscriber = 39;
		static final int TRANSACTION_getActivePhoneType = 22;
		static final int TRANSACTION_getCallState = 19;
		static final int TRANSACTION_getCdmaEriIconIndex = 23;
		static final int TRANSACTION_getCdmaEriIconMode = 24;
		static final int TRANSACTION_getCdmaEriText = 25;
		static final int TRANSACTION_getCellLocation = 17;
		static final int TRANSACTION_getDataActivity = 20;
		static final int TRANSACTION_getDataState = 21;
		static final int TRANSACTION_getLteOnCdmaMode = 6;
		static final int TRANSACTION_getNeighboringCellInfo = 18;
		static final int TRANSACTION_getNetworkType = 38;
		static final int TRANSACTION_getVoiceMessageCount = 37;
		static final int TRANSACTION_handlePinMmi = 10;
		static final int TRANSACTION_hasIccCard = 5;
		static final int TRANSACTION_isDataConnectivityPossible = 16;
		static final int TRANSACTION_isIdle = 4;
		static final int TRANSACTION_isOffhook = 31;
		static final int TRANSACTION_isRadioOn = 11;
		static final int TRANSACTION_isRinging = 33;
		static final int TRANSACTION_isSimPinEnabled = 35;
		static final int TRANSACTION_needsOtaServiceProvisioning = 26;
		static final int TRANSACTION_setRadio = 27;
		static final int TRANSACTION_showCallScreen = 1;
		static final int TRANSACTION_showCallScreenWithDialpad = 40;
		static final int TRANSACTION_silenceRinger = 32;
		static final int TRANSACTION_supplyPin = 34;
		static final int TRANSACTION_supplyPuk = 13;
		static final int TRANSACTION_toggleRadioOnOff = 12;
		static final int TRANSACTION_updateServiceLocation = 28;

		public Stub()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #101 <Method void Binder()>
			attachInterface(((IInterface) (this)), "com.android.internal.telephony.ITelephony");
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:ldc1            #14  <String "com.android.internal.telephony.ITelephony">
		//    5    8:invokevirtual   #105 <Method void attachInterface(IInterface, String)>
		//    6   11:return          
		}
	}

	static class Stub.Proxy
		implements ITelephony
	{

		public void answerRingingCall()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore_2        
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    8:aload_1         
		//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(7, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          7
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_2         
		//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   33:aload_2         
		//   18   34:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   37:aload_1         
		//   20   38:invokevirtual   #47  <Method void Parcel.recycle()>
			return;
		//   21   41:return          
			Exception exception;
			exception;
		//   22   42:astore_3        
			parcel1.recycle();
		//   23   43:aload_2         
		//   24   44:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   47:aload_1         
		//   26   48:invokevirtual   #47  <Method void Parcel.recycle()>
			throw exception;
		//   27   51:aload_3         
		//   28   52:athrow          
		}

		public IBinder asBinder()
		{
			return mRemote;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field IBinder mRemote>
		//    2    4:areturn         
		}

		public void call(String s)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    8:aload_2         
		//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeString(s);
		//    7   14:aload_2         
		//    8   15:aload_1         
		//    9   16:invokevirtual   #54  <Method void Parcel.writeString(String)>
			mRemote.transact(3, parcel, parcel1, 0);
		//   10   19:aload_0         
		//   11   20:getfield        #19  <Field IBinder mRemote>
		//   12   23:iconst_3        
		//   13   24:aload_2         
		//   14   25:aload_3         
		//   15   26:iconst_0        
		//   16   27:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   17   32:pop             
			parcel1.readException();
		//   18   33:aload_3         
		//   19   34:invokevirtual   #44  <Method void Parcel.readException()>
			parcel1.recycle();
		//   20   37:aload_3         
		//   21   38:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   41:aload_2         
		//   23   42:invokevirtual   #47  <Method void Parcel.recycle()>
			return;
		//   24   45:return          
			s;
		//   25   46:astore_1        
			parcel1.recycle();
		//   26   47:aload_3         
		//   27   48:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   51:aload_2         
		//   29   52:invokevirtual   #47  <Method void Parcel.recycle()>
			throw s;
		//   30   55:aload_1         
		//   31   56:athrow          
		}

		public void cancelMissedCallsNotification()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore_2        
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    8:aload_1         
		//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(9, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          9
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_2         
		//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   33:aload_2         
		//   18   34:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   37:aload_1         
		//   20   38:invokevirtual   #47  <Method void Parcel.recycle()>
			return;
		//   21   41:return          
			Exception exception;
			exception;
		//   22   42:astore_3        
			parcel1.recycle();
		//   23   43:aload_2         
		//   24   44:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   47:aload_1         
		//   26   48:invokevirtual   #47  <Method void Parcel.recycle()>
			throw exception;
		//   27   51:aload_3         
		//   28   52:athrow          
		}

		public void dial(String s)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    8:aload_2         
		//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeString(s);
		//    7   14:aload_2         
		//    8   15:aload_1         
		//    9   16:invokevirtual   #54  <Method void Parcel.writeString(String)>
			mRemote.transact(2, parcel, parcel1, 0);
		//   10   19:aload_0         
		//   11   20:getfield        #19  <Field IBinder mRemote>
		//   12   23:iconst_2        
		//   13   24:aload_2         
		//   14   25:aload_3         
		//   15   26:iconst_0        
		//   16   27:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   17   32:pop             
			parcel1.readException();
		//   18   33:aload_3         
		//   19   34:invokevirtual   #44  <Method void Parcel.readException()>
			parcel1.recycle();
		//   20   37:aload_3         
		//   21   38:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   41:aload_2         
		//   23   42:invokevirtual   #47  <Method void Parcel.recycle()>
			return;
		//   24   45:return          
			s;
		//   25   46:astore_1        
			parcel1.recycle();
		//   26   47:aload_3         
		//   27   48:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   51:aload_2         
		//   29   52:invokevirtual   #47  <Method void Parcel.recycle()>
			throw s;
		//   30   55:aload_1         
		//   31   56:athrow          
		}

		public int disableApnType(String s)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			int i;
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    9:aload_3         
		//    5   10:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeString(s);
		//    7   15:aload_3         
		//    8   16:aload_1         
		//    9   17:invokevirtual   #54  <Method void Parcel.writeString(String)>
			mRemote.transact(30, parcel, parcel1, 0);
		//   10   20:aload_0         
		//   11   21:getfield        #19  <Field IBinder mRemote>
		//   12   24:bipush          30
		//   13   26:aload_3         
		//   14   27:aload           4
		//   15   29:iconst_0        
		//   16   30:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   17   35:pop             
			parcel1.readException();
		//   18   36:aload           4
		//   19   38:invokevirtual   #44  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   20   41:aload           4
		//   21   43:invokevirtual   #62  <Method int Parcel.readInt()>
		//   22   46:istore_2        
			parcel1.recycle();
		//   23   47:aload           4
		//   24   49:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   52:aload_3         
		//   26   53:invokevirtual   #47  <Method void Parcel.recycle()>
			return i;
		//   27   56:iload_2         
		//   28   57:ireturn         
			s;
		//   29   58:astore_1        
			parcel1.recycle();
		//   30   59:aload           4
		//   31   61:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   32   64:aload_3         
		//   33   65:invokevirtual   #47  <Method void Parcel.recycle()>
			throw s;
		//   34   68:aload_1         
		//   35   69:athrow          
		}

		public boolean disableDataConnectivity()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			int i;
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    9:aload_3         
		//    5   10:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(8, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field IBinder mRemote>
		//    9   19:bipush          8
		//   10   21:aload_3         
		//   11   22:aload           4
		//   12   24:iconst_0        
		//   13   25:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   30:pop             
			parcel1.readException();
		//   15   31:aload           4
		//   16   33:invokevirtual   #44  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   36:aload           4
		//   18   38:invokevirtual   #62  <Method int Parcel.readInt()>
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
		//   28   55:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   58:aload_3         
		//   30   59:invokevirtual   #47  <Method void Parcel.recycle()>
			return flag;
		//   31   62:iload_2         
		//   32   63:ireturn         
			Exception exception;
			exception;
		//   33   64:astore          5
			parcel1.recycle();
		//   34   66:aload           4
		//   35   68:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   71:aload_3         
		//   37   72:invokevirtual   #47  <Method void Parcel.recycle()>
			throw exception;
		//   38   75:aload           5
		//   39   77:athrow          
		}

		public void disableLocationUpdates()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore_2        
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    8:aload_1         
		//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(14, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          14
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_2         
		//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   33:aload_2         
		//   18   34:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   37:aload_1         
		//   20   38:invokevirtual   #47  <Method void Parcel.recycle()>
			return;
		//   21   41:return          
			Exception exception;
			exception;
		//   22   42:astore_3        
			parcel1.recycle();
		//   23   43:aload_2         
		//   24   44:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   47:aload_1         
		//   26   48:invokevirtual   #47  <Method void Parcel.recycle()>
			throw exception;
		//   27   51:aload_3         
		//   28   52:athrow          
		}

		public int enableApnType(String s)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			int i;
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    9:aload_3         
		//    5   10:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeString(s);
		//    7   15:aload_3         
		//    8   16:aload_1         
		//    9   17:invokevirtual   #54  <Method void Parcel.writeString(String)>
			mRemote.transact(15, parcel, parcel1, 0);
		//   10   20:aload_0         
		//   11   21:getfield        #19  <Field IBinder mRemote>
		//   12   24:bipush          15
		//   13   26:aload_3         
		//   14   27:aload           4
		//   15   29:iconst_0        
		//   16   30:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   17   35:pop             
			parcel1.readException();
		//   18   36:aload           4
		//   19   38:invokevirtual   #44  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   20   41:aload           4
		//   21   43:invokevirtual   #62  <Method int Parcel.readInt()>
		//   22   46:istore_2        
			parcel1.recycle();
		//   23   47:aload           4
		//   24   49:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   52:aload_3         
		//   26   53:invokevirtual   #47  <Method void Parcel.recycle()>
			return i;
		//   27   56:iload_2         
		//   28   57:ireturn         
			s;
		//   29   58:astore_1        
			parcel1.recycle();
		//   30   59:aload           4
		//   31   61:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   32   64:aload_3         
		//   33   65:invokevirtual   #47  <Method void Parcel.recycle()>
			throw s;
		//   34   68:aload_1         
		//   35   69:athrow          
		}

		public boolean enableDataConnectivity()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			int i;
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    9:aload_3         
		//    5   10:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(36, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field IBinder mRemote>
		//    9   19:bipush          36
		//   10   21:aload_3         
		//   11   22:aload           4
		//   12   24:iconst_0        
		//   13   25:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   30:pop             
			parcel1.readException();
		//   15   31:aload           4
		//   16   33:invokevirtual   #44  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   36:aload           4
		//   18   38:invokevirtual   #62  <Method int Parcel.readInt()>
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
		//   28   55:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   58:aload_3         
		//   30   59:invokevirtual   #47  <Method void Parcel.recycle()>
			return flag;
		//   31   62:iload_2         
		//   32   63:ireturn         
			Exception exception;
			exception;
		//   33   64:astore          5
			parcel1.recycle();
		//   34   66:aload           4
		//   35   68:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   71:aload_3         
		//   37   72:invokevirtual   #47  <Method void Parcel.recycle()>
			throw exception;
		//   38   75:aload           5
		//   39   77:athrow          
		}

		public void enableLocationUpdates()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore_2        
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    8:aload_1         
		//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(29, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          29
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_2         
		//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   33:aload_2         
		//   18   34:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   37:aload_1         
		//   20   38:invokevirtual   #47  <Method void Parcel.recycle()>
			return;
		//   21   41:return          
			Exception exception;
			exception;
		//   22   42:astore_3        
			parcel1.recycle();
		//   23   43:aload_2         
		//   24   44:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   47:aload_1         
		//   26   48:invokevirtual   #47  <Method void Parcel.recycle()>
			throw exception;
		//   27   51:aload_3         
		//   28   52:athrow          
		}

		public boolean endCall()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			int i;
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    9:aload_3         
		//    5   10:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(41, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field IBinder mRemote>
		//    9   19:bipush          41
		//   10   21:aload_3         
		//   11   22:aload           4
		//   12   24:iconst_0        
		//   13   25:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   30:pop             
			parcel1.readException();
		//   15   31:aload           4
		//   16   33:invokevirtual   #44  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   36:aload           4
		//   18   38:invokevirtual   #62  <Method int Parcel.readInt()>
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
		//   28   55:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   58:aload_3         
		//   30   59:invokevirtual   #47  <Method void Parcel.recycle()>
			return flag;
		//   31   62:iload_2         
		//   32   63:ireturn         
			Exception exception;
			exception;
		//   33   64:astore          5
			parcel1.recycle();
		//   34   66:aload           4
		//   35   68:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   71:aload_3         
		//   37   72:invokevirtual   #47  <Method void Parcel.recycle()>
			throw exception;
		//   38   75:aload           5
		//   39   77:athrow          
		}

		public boolean endCallForSubscriber(int i)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    9:aload_3         
		//    5   10:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeInt(i);
		//    7   15:aload_3         
		//    8   16:iload_1         
		//    9   17:invokevirtual   #75  <Method void Parcel.writeInt(int)>
			mRemote.transact(39, parcel, parcel1, 0);
		//   10   20:aload_0         
		//   11   21:getfield        #19  <Field IBinder mRemote>
		//   12   24:bipush          39
		//   13   26:aload_3         
		//   14   27:aload           4
		//   15   29:iconst_0        
		//   16   30:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   17   35:pop             
			parcel1.readException();
		//   18   36:aload           4
		//   19   38:invokevirtual   #44  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   20   41:aload           4
		//   21   43:invokevirtual   #62  <Method int Parcel.readInt()>
		//   22   46:istore_1        
			boolean flag;
			if(i != 0)
		//*  23   47:iload_1         
		//*  24   48:ifeq            56
				flag = true;
		//   25   51:iconst_1        
		//   26   52:istore_2        
			else
		//*  27   53:goto            58
				flag = false;
		//   28   56:iconst_0        
		//   29   57:istore_2        
			parcel1.recycle();
		//   30   58:aload           4
		//   31   60:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   32   63:aload_3         
		//   33   64:invokevirtual   #47  <Method void Parcel.recycle()>
			return flag;
		//   34   67:iload_2         
		//   35   68:ireturn         
			Exception exception;
			exception;
		//   36   69:astore          5
			parcel1.recycle();
		//   37   71:aload           4
		//   38   73:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   39   76:aload_3         
		//   40   77:invokevirtual   #47  <Method void Parcel.recycle()>
			throw exception;
		//   41   80:aload           5
		//   42   82:athrow          
		}

		public int getActivePhoneType()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			int i;
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    8:aload_2         
		//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(22, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          22
		//   10   20:aload_2         
		//   11   21:aload_3         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_3         
		//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   33:aload_3         
		//   18   34:invokevirtual   #62  <Method int Parcel.readInt()>
		//   19   37:istore_1        
			parcel1.recycle();
		//   20   38:aload_3         
		//   21   39:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   42:aload_2         
		//   23   43:invokevirtual   #47  <Method void Parcel.recycle()>
			return i;
		//   24   46:iload_1         
		//   25   47:ireturn         
			Exception exception;
			exception;
		//   26   48:astore          4
			parcel1.recycle();
		//   27   50:aload_3         
		//   28   51:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   54:aload_2         
		//   30   55:invokevirtual   #47  <Method void Parcel.recycle()>
			throw exception;
		//   31   58:aload           4
		//   32   60:athrow          
		}

		public int getCallState()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			int i;
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    8:aload_2         
		//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(19, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          19
		//   10   20:aload_2         
		//   11   21:aload_3         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_3         
		//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   33:aload_3         
		//   18   34:invokevirtual   #62  <Method int Parcel.readInt()>
		//   19   37:istore_1        
			parcel1.recycle();
		//   20   38:aload_3         
		//   21   39:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   42:aload_2         
		//   23   43:invokevirtual   #47  <Method void Parcel.recycle()>
			return i;
		//   24   46:iload_1         
		//   25   47:ireturn         
			Exception exception;
			exception;
		//   26   48:astore          4
			parcel1.recycle();
		//   27   50:aload_3         
		//   28   51:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   54:aload_2         
		//   30   55:invokevirtual   #47  <Method void Parcel.recycle()>
			throw exception;
		//   31   58:aload           4
		//   32   60:athrow          
		}

		public int getCdmaEriIconIndex()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			int i;
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    8:aload_2         
		//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(23, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          23
		//   10   20:aload_2         
		//   11   21:aload_3         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_3         
		//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   33:aload_3         
		//   18   34:invokevirtual   #62  <Method int Parcel.readInt()>
		//   19   37:istore_1        
			parcel1.recycle();
		//   20   38:aload_3         
		//   21   39:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   42:aload_2         
		//   23   43:invokevirtual   #47  <Method void Parcel.recycle()>
			return i;
		//   24   46:iload_1         
		//   25   47:ireturn         
			Exception exception;
			exception;
		//   26   48:astore          4
			parcel1.recycle();
		//   27   50:aload_3         
		//   28   51:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   54:aload_2         
		//   30   55:invokevirtual   #47  <Method void Parcel.recycle()>
			throw exception;
		//   31   58:aload           4
		//   32   60:athrow          
		}

		public int getCdmaEriIconMode()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			int i;
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    8:aload_2         
		//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(24, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          24
		//   10   20:aload_2         
		//   11   21:aload_3         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_3         
		//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   33:aload_3         
		//   18   34:invokevirtual   #62  <Method int Parcel.readInt()>
		//   19   37:istore_1        
			parcel1.recycle();
		//   20   38:aload_3         
		//   21   39:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   42:aload_2         
		//   23   43:invokevirtual   #47  <Method void Parcel.recycle()>
			return i;
		//   24   46:iload_1         
		//   25   47:ireturn         
			Exception exception;
			exception;
		//   26   48:astore          4
			parcel1.recycle();
		//   27   50:aload_3         
		//   28   51:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   54:aload_2         
		//   30   55:invokevirtual   #47  <Method void Parcel.recycle()>
			throw exception;
		//   31   58:aload           4
		//   32   60:athrow          
		}

		public String getCdmaEriText()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore_2        
			String s;
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    8:aload_1         
		//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(25, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          25
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_2         
		//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
			s = parcel1.readString();
		//   17   33:aload_2         
		//   18   34:invokevirtual   #84  <Method String Parcel.readString()>
		//   19   37:astore_3        
			parcel1.recycle();
		//   20   38:aload_2         
		//   21   39:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   42:aload_1         
		//   23   43:invokevirtual   #47  <Method void Parcel.recycle()>
			return s;
		//   24   46:aload_3         
		//   25   47:areturn         
			Exception exception;
			exception;
		//   26   48:astore_3        
			parcel1.recycle();
		//   27   49:aload_2         
		//   28   50:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   53:aload_1         
		//   30   54:invokevirtual   #47  <Method void Parcel.recycle()>
			throw exception;
		//   31   57:aload_3         
		//   32   58:athrow          
		}

		public Bundle getCellLocation()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			Bundle bundle;
label0:
			{
				parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    8:aload_2         
		//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
				mRemote.transact(17, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          17
		//   10   20:aload_2         
		//   11   21:aload_3         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
				parcel1.readException();
		//   15   29:aload_3         
		//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
				if(parcel1.readInt() != 0)
		//*  17   33:aload_3         
		//*  18   34:invokevirtual   #62  <Method int Parcel.readInt()>
		//*  19   37:ifeq            56
				{
					bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
		//   20   40:getstatic       #92  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//   21   43:aload_3         
		//   22   44:invokeinterface #98  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   23   49:checkcast       #88  <Class Bundle>
		//   24   52:astore_1        
					break label0;
		//   25   53:goto            58
				}
				bundle = null;
		//   26   56:aconst_null     
		//   27   57:astore_1        
			}
			parcel1.recycle();
		//   28   58:aload_3         
		//   29   59:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   30   62:aload_2         
		//   31   63:invokevirtual   #47  <Method void Parcel.recycle()>
			return bundle;
		//   32   66:aload_1         
		//   33   67:areturn         
			Exception exception;
			exception;
		//   34   68:astore_1        
			parcel1.recycle();
		//   35   69:aload_3         
		//   36   70:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   37   73:aload_2         
		//   38   74:invokevirtual   #47  <Method void Parcel.recycle()>
			throw exception;
		//   39   77:aload_1         
		//   40   78:athrow          
		}

		public int getDataActivity()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			int i;
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    8:aload_2         
		//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(20, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          20
		//   10   20:aload_2         
		//   11   21:aload_3         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_3         
		//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   33:aload_3         
		//   18   34:invokevirtual   #62  <Method int Parcel.readInt()>
		//   19   37:istore_1        
			parcel1.recycle();
		//   20   38:aload_3         
		//   21   39:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   42:aload_2         
		//   23   43:invokevirtual   #47  <Method void Parcel.recycle()>
			return i;
		//   24   46:iload_1         
		//   25   47:ireturn         
			Exception exception;
			exception;
		//   26   48:astore          4
			parcel1.recycle();
		//   27   50:aload_3         
		//   28   51:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   54:aload_2         
		//   30   55:invokevirtual   #47  <Method void Parcel.recycle()>
			throw exception;
		//   31   58:aload           4
		//   32   60:athrow          
		}

		public int getDataState()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			int i;
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    8:aload_2         
		//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(21, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          21
		//   10   20:aload_2         
		//   11   21:aload_3         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_3         
		//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   33:aload_3         
		//   18   34:invokevirtual   #62  <Method int Parcel.readInt()>
		//   19   37:istore_1        
			parcel1.recycle();
		//   20   38:aload_3         
		//   21   39:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   42:aload_2         
		//   23   43:invokevirtual   #47  <Method void Parcel.recycle()>
			return i;
		//   24   46:iload_1         
		//   25   47:ireturn         
			Exception exception;
			exception;
		//   26   48:astore          4
			parcel1.recycle();
		//   27   50:aload_3         
		//   28   51:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   54:aload_2         
		//   30   55:invokevirtual   #47  <Method void Parcel.recycle()>
			throw exception;
		//   31   58:aload           4
		//   32   60:athrow          
		}

		public String getInterfaceDescriptor()
		{
			return "com.android.internal.telephony.ITelephony";
		//    0    0:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    1    2:areturn         
		}

		public int getLteOnCdmaMode()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			int i;
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    8:aload_2         
		//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(6, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          6
		//   10   20:aload_2         
		//   11   21:aload_3         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_3         
		//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   33:aload_3         
		//   18   34:invokevirtual   #62  <Method int Parcel.readInt()>
		//   19   37:istore_1        
			parcel1.recycle();
		//   20   38:aload_3         
		//   21   39:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   42:aload_2         
		//   23   43:invokevirtual   #47  <Method void Parcel.recycle()>
			return i;
		//   24   46:iload_1         
		//   25   47:ireturn         
			Exception exception;
			exception;
		//   26   48:astore          4
			parcel1.recycle();
		//   27   50:aload_3         
		//   28   51:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   54:aload_2         
		//   30   55:invokevirtual   #47  <Method void Parcel.recycle()>
			throw exception;
		//   31   58:aload           4
		//   32   60:athrow          
		}

		public List getNeighboringCellInfo()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore_2        
			java.util.ArrayList arraylist;
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    8:aload_1         
		//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(18, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          18
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_2         
		//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
			arraylist = parcel1.createTypedArrayList(NeighboringCellInfo.CREATOR);
		//   17   33:aload_2         
		//   18   34:getstatic       #107 <Field android.os.Parcelable$Creator NeighboringCellInfo.CREATOR>
		//   19   37:invokevirtual   #111 <Method java.util.ArrayList Parcel.createTypedArrayList(android.os.Parcelable$Creator)>
		//   20   40:astore_3        
			parcel1.recycle();
		//   21   41:aload_2         
		//   22   42:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   23   45:aload_1         
		//   24   46:invokevirtual   #47  <Method void Parcel.recycle()>
			return ((List) (arraylist));
		//   25   49:aload_3         
		//   26   50:areturn         
			Exception exception;
			exception;
		//   27   51:astore_3        
			parcel1.recycle();
		//   28   52:aload_2         
		//   29   53:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   30   56:aload_1         
		//   31   57:invokevirtual   #47  <Method void Parcel.recycle()>
			throw exception;
		//   32   60:aload_3         
		//   33   61:athrow          
		}

		public int getNetworkType()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			int i;
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    8:aload_2         
		//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(38, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          38
		//   10   20:aload_2         
		//   11   21:aload_3         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_3         
		//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   33:aload_3         
		//   18   34:invokevirtual   #62  <Method int Parcel.readInt()>
		//   19   37:istore_1        
			parcel1.recycle();
		//   20   38:aload_3         
		//   21   39:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   42:aload_2         
		//   23   43:invokevirtual   #47  <Method void Parcel.recycle()>
			return i;
		//   24   46:iload_1         
		//   25   47:ireturn         
			Exception exception;
			exception;
		//   26   48:astore          4
			parcel1.recycle();
		//   27   50:aload_3         
		//   28   51:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   54:aload_2         
		//   30   55:invokevirtual   #47  <Method void Parcel.recycle()>
			throw exception;
		//   31   58:aload           4
		//   32   60:athrow          
		}

		public int getVoiceMessageCount()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			int i;
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    8:aload_2         
		//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(37, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          37
		//   10   20:aload_2         
		//   11   21:aload_3         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_3         
		//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   33:aload_3         
		//   18   34:invokevirtual   #62  <Method int Parcel.readInt()>
		//   19   37:istore_1        
			parcel1.recycle();
		//   20   38:aload_3         
		//   21   39:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   42:aload_2         
		//   23   43:invokevirtual   #47  <Method void Parcel.recycle()>
			return i;
		//   24   46:iload_1         
		//   25   47:ireturn         
			Exception exception;
			exception;
		//   26   48:astore          4
			parcel1.recycle();
		//   27   50:aload_3         
		//   28   51:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   54:aload_2         
		//   30   55:invokevirtual   #47  <Method void Parcel.recycle()>
			throw exception;
		//   31   58:aload           4
		//   32   60:athrow          
		}

		public boolean handlePinMmi(String s)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore          4
			parcel1 = Parcel.obtain();
		//    2    5:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    8:astore          5
			int i;
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4   10:aload           4
		//    5   12:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   14:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeString(s);
		//    7   17:aload           4
		//    8   19:aload_1         
		//    9   20:invokevirtual   #54  <Method void Parcel.writeString(String)>
			mRemote.transact(10, parcel, parcel1, 0);
		//   10   23:aload_0         
		//   11   24:getfield        #19  <Field IBinder mRemote>
		//   12   27:bipush          10
		//   13   29:aload           4
		//   14   31:aload           5
		//   15   33:iconst_0        
		//   16   34:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   17   39:pop             
			parcel1.readException();
		//   18   40:aload           5
		//   19   42:invokevirtual   #44  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   20   45:aload           5
		//   21   47:invokevirtual   #62  <Method int Parcel.readInt()>
		//   22   50:istore_2        
			boolean flag;
			if(i != 0)
		//*  23   51:iload_2         
		//*  24   52:ifeq            60
				flag = true;
		//   25   55:iconst_1        
		//   26   56:istore_3        
			else
		//*  27   57:goto            62
				flag = false;
		//   28   60:iconst_0        
		//   29   61:istore_3        
			parcel1.recycle();
		//   30   62:aload           5
		//   31   64:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   32   67:aload           4
		//   33   69:invokevirtual   #47  <Method void Parcel.recycle()>
			return flag;
		//   34   72:iload_3         
		//   35   73:ireturn         
			s;
		//   36   74:astore_1        
			parcel1.recycle();
		//   37   75:aload           5
		//   38   77:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   39   80:aload           4
		//   40   82:invokevirtual   #47  <Method void Parcel.recycle()>
			throw s;
		//   41   85:aload_1         
		//   42   86:athrow          
		}

		public boolean hasIccCard()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			int i;
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    9:aload_3         
		//    5   10:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(5, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field IBinder mRemote>
		//    9   19:iconst_5        
		//   10   20:aload_3         
		//   11   21:aload           4
		//   12   23:iconst_0        
		//   13   24:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   29:pop             
			parcel1.readException();
		//   15   30:aload           4
		//   16   32:invokevirtual   #44  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   35:aload           4
		//   18   37:invokevirtual   #62  <Method int Parcel.readInt()>
		//   19   40:istore_1        
			boolean flag;
			if(i != 0)
		//*  20   41:iload_1         
		//*  21   42:ifeq            50
				flag = true;
		//   22   45:iconst_1        
		//   23   46:istore_2        
			else
		//*  24   47:goto            52
				flag = false;
		//   25   50:iconst_0        
		//   26   51:istore_2        
			parcel1.recycle();
		//   27   52:aload           4
		//   28   54:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   57:aload_3         
		//   30   58:invokevirtual   #47  <Method void Parcel.recycle()>
			return flag;
		//   31   61:iload_2         
		//   32   62:ireturn         
			Exception exception;
			exception;
		//   33   63:astore          5
			parcel1.recycle();
		//   34   65:aload           4
		//   35   67:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   70:aload_3         
		//   37   71:invokevirtual   #47  <Method void Parcel.recycle()>
			throw exception;
		//   38   74:aload           5
		//   39   76:athrow          
		}

		public boolean isDataConnectivityPossible()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			int i;
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    9:aload_3         
		//    5   10:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(16, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field IBinder mRemote>
		//    9   19:bipush          16
		//   10   21:aload_3         
		//   11   22:aload           4
		//   12   24:iconst_0        
		//   13   25:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   30:pop             
			parcel1.readException();
		//   15   31:aload           4
		//   16   33:invokevirtual   #44  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   36:aload           4
		//   18   38:invokevirtual   #62  <Method int Parcel.readInt()>
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
		//   28   55:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   58:aload_3         
		//   30   59:invokevirtual   #47  <Method void Parcel.recycle()>
			return flag;
		//   31   62:iload_2         
		//   32   63:ireturn         
			Exception exception;
			exception;
		//   33   64:astore          5
			parcel1.recycle();
		//   34   66:aload           4
		//   35   68:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   71:aload_3         
		//   37   72:invokevirtual   #47  <Method void Parcel.recycle()>
			throw exception;
		//   38   75:aload           5
		//   39   77:athrow          
		}

		public boolean isIdle()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			int i;
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    9:aload_3         
		//    5   10:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(4, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field IBinder mRemote>
		//    9   19:iconst_4        
		//   10   20:aload_3         
		//   11   21:aload           4
		//   12   23:iconst_0        
		//   13   24:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   29:pop             
			parcel1.readException();
		//   15   30:aload           4
		//   16   32:invokevirtual   #44  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   35:aload           4
		//   18   37:invokevirtual   #62  <Method int Parcel.readInt()>
		//   19   40:istore_1        
			boolean flag;
			if(i != 0)
		//*  20   41:iload_1         
		//*  21   42:ifeq            50
				flag = true;
		//   22   45:iconst_1        
		//   23   46:istore_2        
			else
		//*  24   47:goto            52
				flag = false;
		//   25   50:iconst_0        
		//   26   51:istore_2        
			parcel1.recycle();
		//   27   52:aload           4
		//   28   54:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   57:aload_3         
		//   30   58:invokevirtual   #47  <Method void Parcel.recycle()>
			return flag;
		//   31   61:iload_2         
		//   32   62:ireturn         
			Exception exception;
			exception;
		//   33   63:astore          5
			parcel1.recycle();
		//   34   65:aload           4
		//   35   67:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   70:aload_3         
		//   37   71:invokevirtual   #47  <Method void Parcel.recycle()>
			throw exception;
		//   38   74:aload           5
		//   39   76:athrow          
		}

		public boolean isOffhook()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			int i;
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    9:aload_3         
		//    5   10:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(31, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field IBinder mRemote>
		//    9   19:bipush          31
		//   10   21:aload_3         
		//   11   22:aload           4
		//   12   24:iconst_0        
		//   13   25:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   30:pop             
			parcel1.readException();
		//   15   31:aload           4
		//   16   33:invokevirtual   #44  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   36:aload           4
		//   18   38:invokevirtual   #62  <Method int Parcel.readInt()>
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
		//   28   55:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   58:aload_3         
		//   30   59:invokevirtual   #47  <Method void Parcel.recycle()>
			return flag;
		//   31   62:iload_2         
		//   32   63:ireturn         
			Exception exception;
			exception;
		//   33   64:astore          5
			parcel1.recycle();
		//   34   66:aload           4
		//   35   68:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   71:aload_3         
		//   37   72:invokevirtual   #47  <Method void Parcel.recycle()>
			throw exception;
		//   38   75:aload           5
		//   39   77:athrow          
		}

		public boolean isRadioOn()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			int i;
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    9:aload_3         
		//    5   10:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(11, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field IBinder mRemote>
		//    9   19:bipush          11
		//   10   21:aload_3         
		//   11   22:aload           4
		//   12   24:iconst_0        
		//   13   25:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   30:pop             
			parcel1.readException();
		//   15   31:aload           4
		//   16   33:invokevirtual   #44  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   36:aload           4
		//   18   38:invokevirtual   #62  <Method int Parcel.readInt()>
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
		//   28   55:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   58:aload_3         
		//   30   59:invokevirtual   #47  <Method void Parcel.recycle()>
			return flag;
		//   31   62:iload_2         
		//   32   63:ireturn         
			Exception exception;
			exception;
		//   33   64:astore          5
			parcel1.recycle();
		//   34   66:aload           4
		//   35   68:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   71:aload_3         
		//   37   72:invokevirtual   #47  <Method void Parcel.recycle()>
			throw exception;
		//   38   75:aload           5
		//   39   77:athrow          
		}

		public boolean isRinging()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			int i;
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    9:aload_3         
		//    5   10:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(33, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field IBinder mRemote>
		//    9   19:bipush          33
		//   10   21:aload_3         
		//   11   22:aload           4
		//   12   24:iconst_0        
		//   13   25:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   30:pop             
			parcel1.readException();
		//   15   31:aload           4
		//   16   33:invokevirtual   #44  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   36:aload           4
		//   18   38:invokevirtual   #62  <Method int Parcel.readInt()>
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
		//   28   55:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   58:aload_3         
		//   30   59:invokevirtual   #47  <Method void Parcel.recycle()>
			return flag;
		//   31   62:iload_2         
		//   32   63:ireturn         
			Exception exception;
			exception;
		//   33   64:astore          5
			parcel1.recycle();
		//   34   66:aload           4
		//   35   68:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   71:aload_3         
		//   37   72:invokevirtual   #47  <Method void Parcel.recycle()>
			throw exception;
		//   38   75:aload           5
		//   39   77:athrow          
		}

		public boolean isSimPinEnabled()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			int i;
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    9:aload_3         
		//    5   10:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(35, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field IBinder mRemote>
		//    9   19:bipush          35
		//   10   21:aload_3         
		//   11   22:aload           4
		//   12   24:iconst_0        
		//   13   25:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   30:pop             
			parcel1.readException();
		//   15   31:aload           4
		//   16   33:invokevirtual   #44  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   36:aload           4
		//   18   38:invokevirtual   #62  <Method int Parcel.readInt()>
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
		//   28   55:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   58:aload_3         
		//   30   59:invokevirtual   #47  <Method void Parcel.recycle()>
			return flag;
		//   31   62:iload_2         
		//   32   63:ireturn         
			Exception exception;
			exception;
		//   33   64:astore          5
			parcel1.recycle();
		//   34   66:aload           4
		//   35   68:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   71:aload_3         
		//   37   72:invokevirtual   #47  <Method void Parcel.recycle()>
			throw exception;
		//   38   75:aload           5
		//   39   77:athrow          
		}

		public boolean needsOtaServiceProvisioning()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			int i;
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    9:aload_3         
		//    5   10:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(26, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field IBinder mRemote>
		//    9   19:bipush          26
		//   10   21:aload_3         
		//   11   22:aload           4
		//   12   24:iconst_0        
		//   13   25:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   30:pop             
			parcel1.readException();
		//   15   31:aload           4
		//   16   33:invokevirtual   #44  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   36:aload           4
		//   18   38:invokevirtual   #62  <Method int Parcel.readInt()>
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
		//   28   55:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   58:aload_3         
		//   30   59:invokevirtual   #47  <Method void Parcel.recycle()>
			return flag;
		//   31   62:iload_2         
		//   32   63:ireturn         
			Exception exception;
			exception;
		//   33   64:astore          5
			parcel1.recycle();
		//   34   66:aload           4
		//   35   68:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   71:aload_3         
		//   37   72:invokevirtual   #47  <Method void Parcel.recycle()>
			throw exception;
		//   38   75:aload           5
		//   39   77:athrow          
		}

		public boolean setRadio(boolean flag)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    9:aload_3         
		//    5   10:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			int i;
			Exception exception;
			if(flag)
		//*   7   15:iload_1         
		//*   8   16:ifeq            92
				i = 1;
		//    9   19:iconst_1        
		//   10   20:istore_2        
			else
		//*  11   21:goto            24
		//*  12   24:aload_3         
		//*  13   25:iload_2         
		//*  14   26:invokevirtual   #75  <Method void Parcel.writeInt(int)>
		//*  15   29:aload_0         
		//*  16   30:getfield        #19  <Field IBinder mRemote>
		//*  17   33:bipush          27
		//*  18   35:aload_3         
		//*  19   36:aload           4
		//*  20   38:iconst_0        
		//*  21   39:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//*  22   44:pop             
		//*  23   45:aload           4
		//*  24   47:invokevirtual   #44  <Method void Parcel.readException()>
		//*  25   50:aload           4
		//*  26   52:invokevirtual   #62  <Method int Parcel.readInt()>
		//*  27   55:istore_2        
		//*  28   56:iload_2         
		//*  29   57:ifeq            65
		//*  30   60:iconst_1        
		//*  31   61:istore_1        
		//*  32   62:goto            67
		//*  33   65:iconst_0        
		//*  34   66:istore_1        
		//*  35   67:aload           4
		//*  36   69:invokevirtual   #47  <Method void Parcel.recycle()>
		//*  37   72:aload_3         
		//*  38   73:invokevirtual   #47  <Method void Parcel.recycle()>
		//*  39   76:iload_1         
		//*  40   77:ireturn         
		//*  41   78:astore          5
		//*  42   80:aload           4
		//*  43   82:invokevirtual   #47  <Method void Parcel.recycle()>
		//*  44   85:aload_3         
		//*  45   86:invokevirtual   #47  <Method void Parcel.recycle()>
		//*  46   89:aload           5
		//*  47   91:athrow          
				i = 0;
		//   48   92:iconst_0        
		//   49   93:istore_2        
			parcel.writeInt(i);
			mRemote.transact(27, parcel, parcel1, 0);
			parcel1.readException();
			i = parcel1.readInt();
			if(i != 0)
				flag = true;
			else
				flag = false;
			parcel1.recycle();
			parcel.recycle();
			return flag;
			exception;
			parcel1.recycle();
			parcel.recycle();
			throw exception;
		//*  50   94:goto            24
		}

		public boolean showCallScreen()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			int i;
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    9:aload_3         
		//    5   10:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(1, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field IBinder mRemote>
		//    9   19:iconst_1        
		//   10   20:aload_3         
		//   11   21:aload           4
		//   12   23:iconst_0        
		//   13   24:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   29:pop             
			parcel1.readException();
		//   15   30:aload           4
		//   16   32:invokevirtual   #44  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   35:aload           4
		//   18   37:invokevirtual   #62  <Method int Parcel.readInt()>
		//   19   40:istore_1        
			boolean flag;
			if(i != 0)
		//*  20   41:iload_1         
		//*  21   42:ifeq            50
				flag = true;
		//   22   45:iconst_1        
		//   23   46:istore_2        
			else
		//*  24   47:goto            52
				flag = false;
		//   25   50:iconst_0        
		//   26   51:istore_2        
			parcel1.recycle();
		//   27   52:aload           4
		//   28   54:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   57:aload_3         
		//   30   58:invokevirtual   #47  <Method void Parcel.recycle()>
			return flag;
		//   31   61:iload_2         
		//   32   62:ireturn         
			Exception exception;
			exception;
		//   33   63:astore          5
			parcel1.recycle();
		//   34   65:aload           4
		//   35   67:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   70:aload_3         
		//   37   71:invokevirtual   #47  <Method void Parcel.recycle()>
			throw exception;
		//   38   74:aload           5
		//   39   76:athrow          
		}

		public boolean showCallScreenWithDialpad(boolean flag)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    9:aload_3         
		//    5   10:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			int i;
			Exception exception;
			if(flag)
		//*   7   15:iload_1         
		//*   8   16:ifeq            92
				i = 1;
		//    9   19:iconst_1        
		//   10   20:istore_2        
			else
		//*  11   21:goto            24
		//*  12   24:aload_3         
		//*  13   25:iload_2         
		//*  14   26:invokevirtual   #75  <Method void Parcel.writeInt(int)>
		//*  15   29:aload_0         
		//*  16   30:getfield        #19  <Field IBinder mRemote>
		//*  17   33:bipush          40
		//*  18   35:aload_3         
		//*  19   36:aload           4
		//*  20   38:iconst_0        
		//*  21   39:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//*  22   44:pop             
		//*  23   45:aload           4
		//*  24   47:invokevirtual   #44  <Method void Parcel.readException()>
		//*  25   50:aload           4
		//*  26   52:invokevirtual   #62  <Method int Parcel.readInt()>
		//*  27   55:istore_2        
		//*  28   56:iload_2         
		//*  29   57:ifeq            65
		//*  30   60:iconst_1        
		//*  31   61:istore_1        
		//*  32   62:goto            67
		//*  33   65:iconst_0        
		//*  34   66:istore_1        
		//*  35   67:aload           4
		//*  36   69:invokevirtual   #47  <Method void Parcel.recycle()>
		//*  37   72:aload_3         
		//*  38   73:invokevirtual   #47  <Method void Parcel.recycle()>
		//*  39   76:iload_1         
		//*  40   77:ireturn         
		//*  41   78:astore          5
		//*  42   80:aload           4
		//*  43   82:invokevirtual   #47  <Method void Parcel.recycle()>
		//*  44   85:aload_3         
		//*  45   86:invokevirtual   #47  <Method void Parcel.recycle()>
		//*  46   89:aload           5
		//*  47   91:athrow          
				i = 0;
		//   48   92:iconst_0        
		//   49   93:istore_2        
			parcel.writeInt(i);
			mRemote.transact(40, parcel, parcel1, 0);
			parcel1.readException();
			i = parcel1.readInt();
			if(i != 0)
				flag = true;
			else
				flag = false;
			parcel1.recycle();
			parcel.recycle();
			return flag;
			exception;
			parcel1.recycle();
			parcel.recycle();
			throw exception;
		//*  50   94:goto            24
		}

		public void silenceRinger()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore_2        
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    8:aload_1         
		//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(32, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          32
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_2         
		//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   33:aload_2         
		//   18   34:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   37:aload_1         
		//   20   38:invokevirtual   #47  <Method void Parcel.recycle()>
			return;
		//   21   41:return          
			Exception exception;
			exception;
		//   22   42:astore_3        
			parcel1.recycle();
		//   23   43:aload_2         
		//   24   44:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   47:aload_1         
		//   26   48:invokevirtual   #47  <Method void Parcel.recycle()>
			throw exception;
		//   27   51:aload_3         
		//   28   52:athrow          
		}

		public boolean supplyPin(String s)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore          4
			parcel1 = Parcel.obtain();
		//    2    5:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    8:astore          5
			int i;
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4   10:aload           4
		//    5   12:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   14:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeString(s);
		//    7   17:aload           4
		//    8   19:aload_1         
		//    9   20:invokevirtual   #54  <Method void Parcel.writeString(String)>
			mRemote.transact(34, parcel, parcel1, 0);
		//   10   23:aload_0         
		//   11   24:getfield        #19  <Field IBinder mRemote>
		//   12   27:bipush          34
		//   13   29:aload           4
		//   14   31:aload           5
		//   15   33:iconst_0        
		//   16   34:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   17   39:pop             
			parcel1.readException();
		//   18   40:aload           5
		//   19   42:invokevirtual   #44  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   20   45:aload           5
		//   21   47:invokevirtual   #62  <Method int Parcel.readInt()>
		//   22   50:istore_2        
			boolean flag;
			if(i != 0)
		//*  23   51:iload_2         
		//*  24   52:ifeq            60
				flag = true;
		//   25   55:iconst_1        
		//   26   56:istore_3        
			else
		//*  27   57:goto            62
				flag = false;
		//   28   60:iconst_0        
		//   29   61:istore_3        
			parcel1.recycle();
		//   30   62:aload           5
		//   31   64:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   32   67:aload           4
		//   33   69:invokevirtual   #47  <Method void Parcel.recycle()>
			return flag;
		//   34   72:iload_3         
		//   35   73:ireturn         
			s;
		//   36   74:astore_1        
			parcel1.recycle();
		//   37   75:aload           5
		//   38   77:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   39   80:aload           4
		//   40   82:invokevirtual   #47  <Method void Parcel.recycle()>
			throw s;
		//   41   85:aload_1         
		//   42   86:athrow          
		}

		public boolean supplyPuk(String s, String s1)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore          5
			parcel1 = Parcel.obtain();
		//    2    5:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    8:astore          6
			int i;
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4   10:aload           5
		//    5   12:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   14:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeString(s);
		//    7   17:aload           5
		//    8   19:aload_1         
		//    9   20:invokevirtual   #54  <Method void Parcel.writeString(String)>
			parcel.writeString(s1);
		//   10   23:aload           5
		//   11   25:aload_2         
		//   12   26:invokevirtual   #54  <Method void Parcel.writeString(String)>
			mRemote.transact(13, parcel, parcel1, 0);
		//   13   29:aload_0         
		//   14   30:getfield        #19  <Field IBinder mRemote>
		//   15   33:bipush          13
		//   16   35:aload           5
		//   17   37:aload           6
		//   18   39:iconst_0        
		//   19   40:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   20   45:pop             
			parcel1.readException();
		//   21   46:aload           6
		//   22   48:invokevirtual   #44  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   23   51:aload           6
		//   24   53:invokevirtual   #62  <Method int Parcel.readInt()>
		//   25   56:istore_3        
			boolean flag;
			if(i != 0)
		//*  26   57:iload_3         
		//*  27   58:ifeq            67
				flag = true;
		//   28   61:iconst_1        
		//   29   62:istore          4
			else
		//*  30   64:goto            70
				flag = false;
		//   31   67:iconst_0        
		//   32   68:istore          4
			parcel1.recycle();
		//   33   70:aload           6
		//   34   72:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   35   75:aload           5
		//   36   77:invokevirtual   #47  <Method void Parcel.recycle()>
			return flag;
		//   37   80:iload           4
		//   38   82:ireturn         
			s;
		//   39   83:astore_1        
			parcel1.recycle();
		//   40   84:aload           6
		//   41   86:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   42   89:aload           5
		//   43   91:invokevirtual   #47  <Method void Parcel.recycle()>
			throw s;
		//   44   94:aload_1         
		//   45   95:athrow          
		}

		public void toggleRadioOnOff()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore_2        
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    8:aload_1         
		//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(12, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          12
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_2         
		//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   33:aload_2         
		//   18   34:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   37:aload_1         
		//   20   38:invokevirtual   #47  <Method void Parcel.recycle()>
			return;
		//   21   41:return          
			Exception exception;
			exception;
		//   22   42:astore_3        
			parcel1.recycle();
		//   23   43:aload_2         
		//   24   44:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   47:aload_1         
		//   26   48:invokevirtual   #47  <Method void Parcel.recycle()>
			throw exception;
		//   27   51:aload_3         
		//   28   52:athrow          
		}

		public void updateServiceLocation()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore_2        
			parcel.writeInterfaceToken("com.android.internal.telephony.ITelephony");
		//    4    8:aload_1         
		//    5    9:ldc1            #31  <String "com.android.internal.telephony.ITelephony">
		//    6   11:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(28, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          28
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #41  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_2         
		//   16   30:invokevirtual   #44  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   33:aload_2         
		//   18   34:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   37:aload_1         
		//   20   38:invokevirtual   #47  <Method void Parcel.recycle()>
			return;
		//   21   41:return          
			Exception exception;
			exception;
		//   22   42:astore_3        
			parcel1.recycle();
		//   23   43:aload_2         
		//   24   44:invokevirtual   #47  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   47:aload_1         
		//   26   48:invokevirtual   #47  <Method void Parcel.recycle()>
			throw exception;
		//   27   51:aload_3         
		//   28   52:athrow          
		}

		private IBinder mRemote;

		Stub.Proxy(IBinder ibinder)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			mRemote = ibinder;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field IBinder mRemote>
		//    5    9:return          
		}
	}


	public abstract void answerRingingCall()
		throws RemoteException;

	public abstract void call(String s)
		throws RemoteException;

	public abstract void cancelMissedCallsNotification()
		throws RemoteException;

	public abstract void dial(String s)
		throws RemoteException;

	public abstract int disableApnType(String s)
		throws RemoteException;

	public abstract boolean disableDataConnectivity()
		throws RemoteException;

	public abstract void disableLocationUpdates()
		throws RemoteException;

	public abstract int enableApnType(String s)
		throws RemoteException;

	public abstract boolean enableDataConnectivity()
		throws RemoteException;

	public abstract void enableLocationUpdates()
		throws RemoteException;

	public abstract boolean endCall()
		throws RemoteException;

	public abstract boolean endCallForSubscriber(int i)
		throws RemoteException;

	public abstract int getActivePhoneType()
		throws RemoteException;

	public abstract int getCallState()
		throws RemoteException;

	public abstract int getCdmaEriIconIndex()
		throws RemoteException;

	public abstract int getCdmaEriIconMode()
		throws RemoteException;

	public abstract String getCdmaEriText()
		throws RemoteException;

	public abstract Bundle getCellLocation()
		throws RemoteException;

	public abstract int getDataActivity()
		throws RemoteException;

	public abstract int getDataState()
		throws RemoteException;

	public abstract int getLteOnCdmaMode()
		throws RemoteException;

	public abstract List getNeighboringCellInfo()
		throws RemoteException;

	public abstract int getNetworkType()
		throws RemoteException;

	public abstract int getVoiceMessageCount()
		throws RemoteException;

	public abstract boolean handlePinMmi(String s)
		throws RemoteException;

	public abstract boolean hasIccCard()
		throws RemoteException;

	public abstract boolean isDataConnectivityPossible()
		throws RemoteException;

	public abstract boolean isIdle()
		throws RemoteException;

	public abstract boolean isOffhook()
		throws RemoteException;

	public abstract boolean isRadioOn()
		throws RemoteException;

	public abstract boolean isRinging()
		throws RemoteException;

	public abstract boolean isSimPinEnabled()
		throws RemoteException;

	public abstract boolean needsOtaServiceProvisioning()
		throws RemoteException;

	public abstract boolean setRadio(boolean flag)
		throws RemoteException;

	public abstract boolean showCallScreen()
		throws RemoteException;

	public abstract boolean showCallScreenWithDialpad(boolean flag)
		throws RemoteException;

	public abstract void silenceRinger()
		throws RemoteException;

	public abstract boolean supplyPin(String s)
		throws RemoteException;

	public abstract boolean supplyPuk(String s, String s1)
		throws RemoteException;

	public abstract void toggleRadioOnOff()
		throws RemoteException;

	public abstract void updateServiceLocation()
		throws RemoteException;
}
