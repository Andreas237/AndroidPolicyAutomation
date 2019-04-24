// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model.internal;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.*;
import java.util.List;

public interface IPolylineDelegate
	extends IInterface
{
	public static abstract class zza extends Binder
		implements IPolylineDelegate
	{

		public static IPolylineDelegate zzep(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//    4    6:aload_0         
		//    5    7:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//    6    9:invokeinterface #19  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface != null && (iinterface instanceof IPolylineDelegate))
		//*   8   15:aload_1         
		//*   9   16:ifnull          31
		//*  10   19:aload_1         
		//*  11   20:instanceof      #6   <Class IPolylineDelegate>
		//*  12   23:ifeq            31
				return (IPolylineDelegate)iinterface;
		//   13   26:aload_1         
		//   14   27:checkcast       #6   <Class IPolylineDelegate>
		//   15   30:areturn         
			else
				return ((IPolylineDelegate) (new zza(ibinder)));
		//   16   31:new             #9   <Class IPolylineDelegate$zza$zza>
		//   17   34:dup             
		//   18   35:aload_0         
		//   19   36:invokespecial   #23  <Method void IPolylineDelegate$zza$zza(IBinder)>
		//   20   39:areturn         
		}

		public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
			throws RemoteException
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:lookupswitch    29: default 244
		//		               1: 255
		//		               2: 271
		//		               3: 293
		//		               4: 316
		//		               5: 338
		//		               6: 358
		//		               7: 382
		//		               8: 402
		//		               9: 424
		//		               10: 444
		//		               11: 468
		//		               12: 502
		//		               13: 537
		//		               14: 571
		//		               15: 606
		//		               16: 648
		//		               17: 670
		//		               18: 704
		//		               19: 739
		//		               20: 781
		//		               21: 821
		//		               22: 863
		//		               23: 903
		//		               24: 923
		//		               25: 945
		//		               26: 968
		//		               27: 990
		//		               28: 1013
		//		               1598968902: 247
		//*   2  244:goto            1051
			case 1598968902: 
				parcel1.writeString("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//    3  247:aload_3         
		//    4  248:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//    5  250:invokevirtual   #34  <Method void Parcel.writeString(String)>
				return true;
		//    6  253:iconst_1        
		//    7  254:ireturn         

			case 1: // '\001'
				parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//    8  255:aload_2         
		//    9  256:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//   10  258:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				remove();
		//   11  261:aload_0         
		//   12  262:invokevirtual   #41  <Method void remove()>
				parcel1.writeNoException();
		//   13  265:aload_3         
		//   14  266:invokevirtual   #44  <Method void Parcel.writeNoException()>
				return true;
		//   15  269:iconst_1        
		//   16  270:ireturn         

			case 2: // '\002'
				parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//   17  271:aload_2         
		//   18  272:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//   19  274:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getId()));
		//   20  277:aload_0         
		//   21  278:invokevirtual   #48  <Method String getId()>
		//   22  281:astore_2        
				parcel1.writeNoException();
		//   23  282:aload_3         
		//   24  283:invokevirtual   #44  <Method void Parcel.writeNoException()>
				parcel1.writeString(((String) (parcel)));
		//   25  286:aload_3         
		//   26  287:aload_2         
		//   27  288:invokevirtual   #34  <Method void Parcel.writeString(String)>
				return true;
		//   28  291:iconst_1        
		//   29  292:ireturn         

			case 3: // '\003'
				parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//   30  293:aload_2         
		//   31  294:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//   32  296:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				setPoints(((List) (parcel.createTypedArrayList(LatLng.CREATOR))));
		//   33  299:aload_0         
		//   34  300:aload_2         
		//   35  301:getstatic       #54  <Field android.os.Parcelable$Creator LatLng.CREATOR>
		//   36  304:invokevirtual   #58  <Method java.util.ArrayList Parcel.createTypedArrayList(android.os.Parcelable$Creator)>
		//   37  307:invokevirtual   #62  <Method void setPoints(List)>
				parcel1.writeNoException();
		//   38  310:aload_3         
		//   39  311:invokevirtual   #44  <Method void Parcel.writeNoException()>
				return true;
		//   40  314:iconst_1        
		//   41  315:ireturn         

			case 4: // '\004'
				parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//   42  316:aload_2         
		//   43  317:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//   44  319:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getPoints()));
		//   45  322:aload_0         
		//   46  323:invokevirtual   #66  <Method List getPoints()>
		//   47  326:astore_2        
				parcel1.writeNoException();
		//   48  327:aload_3         
		//   49  328:invokevirtual   #44  <Method void Parcel.writeNoException()>
				parcel1.writeTypedList(((List) (parcel)));
		//   50  331:aload_3         
		//   51  332:aload_2         
		//   52  333:invokevirtual   #69  <Method void Parcel.writeTypedList(List)>
				return true;
		//   53  336:iconst_1        
		//   54  337:ireturn         

			case 5: // '\005'
				parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//   55  338:aload_2         
		//   56  339:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//   57  341:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				setWidth(parcel.readFloat());
		//   58  344:aload_0         
		//   59  345:aload_2         
		//   60  346:invokevirtual   #73  <Method float Parcel.readFloat()>
		//   61  349:invokevirtual   #77  <Method void setWidth(float)>
				parcel1.writeNoException();
		//   62  352:aload_3         
		//   63  353:invokevirtual   #44  <Method void Parcel.writeNoException()>
				return true;
		//   64  356:iconst_1        
		//   65  357:ireturn         

			case 6: // '\006'
				parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//   66  358:aload_2         
		//   67  359:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//   68  361:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				float f = getWidth();
		//   69  364:aload_0         
		//   70  365:invokevirtual   #80  <Method float getWidth()>
		//   71  368:fstore          5
				parcel1.writeNoException();
		//   72  370:aload_3         
		//   73  371:invokevirtual   #44  <Method void Parcel.writeNoException()>
				parcel1.writeFloat(f);
		//   74  374:aload_3         
		//   75  375:fload           5
		//   76  377:invokevirtual   #83  <Method void Parcel.writeFloat(float)>
				return true;
		//   77  380:iconst_1        
		//   78  381:ireturn         

			case 7: // '\007'
				parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//   79  382:aload_2         
		//   80  383:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//   81  385:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				setColor(parcel.readInt());
		//   82  388:aload_0         
		//   83  389:aload_2         
		//   84  390:invokevirtual   #87  <Method int Parcel.readInt()>
		//   85  393:invokevirtual   #91  <Method void setColor(int)>
				parcel1.writeNoException();
		//   86  396:aload_3         
		//   87  397:invokevirtual   #44  <Method void Parcel.writeNoException()>
				return true;
		//   88  400:iconst_1        
		//   89  401:ireturn         

			case 8: // '\b'
				parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//   90  402:aload_2         
		//   91  403:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//   92  405:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				i = getColor();
		//   93  408:aload_0         
		//   94  409:invokevirtual   #94  <Method int getColor()>
		//   95  412:istore_1        
				parcel1.writeNoException();
		//   96  413:aload_3         
		//   97  414:invokevirtual   #44  <Method void Parcel.writeNoException()>
				parcel1.writeInt(i);
		//   98  417:aload_3         
		//   99  418:iload_1         
		//  100  419:invokevirtual   #97  <Method void Parcel.writeInt(int)>
				return true;
		//  101  422:iconst_1        
		//  102  423:ireturn         

			case 9: // '\t'
				parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//  103  424:aload_2         
		//  104  425:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//  105  427:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				setZIndex(parcel.readFloat());
		//  106  430:aload_0         
		//  107  431:aload_2         
		//  108  432:invokevirtual   #73  <Method float Parcel.readFloat()>
		//  109  435:invokevirtual   #100 <Method void setZIndex(float)>
				parcel1.writeNoException();
		//  110  438:aload_3         
		//  111  439:invokevirtual   #44  <Method void Parcel.writeNoException()>
				return true;
		//  112  442:iconst_1        
		//  113  443:ireturn         

			case 10: // '\n'
				parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//  114  444:aload_2         
		//  115  445:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//  116  447:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				float f1 = getZIndex();
		//  117  450:aload_0         
		//  118  451:invokevirtual   #103 <Method float getZIndex()>
		//  119  454:fstore          5
				parcel1.writeNoException();
		//  120  456:aload_3         
		//  121  457:invokevirtual   #44  <Method void Parcel.writeNoException()>
				parcel1.writeFloat(f1);
		//  122  460:aload_3         
		//  123  461:fload           5
		//  124  463:invokevirtual   #83  <Method void Parcel.writeFloat(float)>
				return true;
		//  125  466:iconst_1        
		//  126  467:ireturn         

			case 11: // '\013'
				parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//  127  468:aload_2         
		//  128  469:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//  129  471:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				boolean flag;
				if(parcel.readInt() != 0)
		//* 130  474:aload_2         
		//* 131  475:invokevirtual   #87  <Method int Parcel.readInt()>
		//* 132  478:ifeq            487
					flag = true;
		//  133  481:iconst_1        
		//  134  482:istore          6
				else
		//* 135  484:goto            490
					flag = false;
		//  136  487:iconst_0        
		//  137  488:istore          6
				setVisible(flag);
		//  138  490:aload_0         
		//  139  491:iload           6
		//  140  493:invokevirtual   #107 <Method void setVisible(boolean)>
				parcel1.writeNoException();
		//  141  496:aload_3         
		//  142  497:invokevirtual   #44  <Method void Parcel.writeNoException()>
				return true;
		//  143  500:iconst_1        
		//  144  501:ireturn         

			case 12: // '\f'
				parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//  145  502:aload_2         
		//  146  503:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//  147  505:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				boolean flag1 = isVisible();
		//  148  508:aload_0         
		//  149  509:invokevirtual   #111 <Method boolean isVisible()>
		//  150  512:istore          6
				parcel1.writeNoException();
		//  151  514:aload_3         
		//  152  515:invokevirtual   #44  <Method void Parcel.writeNoException()>
				if(flag1)
		//* 153  518:iload           6
		//* 154  520:ifeq            528
					i = 1;
		//  155  523:iconst_1        
		//  156  524:istore_1        
				else
		//* 157  525:goto            530
					i = 0;
		//  158  528:iconst_0        
		//  159  529:istore_1        
				parcel1.writeInt(i);
		//  160  530:aload_3         
		//  161  531:iload_1         
		//  162  532:invokevirtual   #97  <Method void Parcel.writeInt(int)>
				return true;
		//  163  535:iconst_1        
		//  164  536:ireturn         

			case 13: // '\r'
				parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//  165  537:aload_2         
		//  166  538:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//  167  540:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				boolean flag2;
				if(parcel.readInt() != 0)
		//* 168  543:aload_2         
		//* 169  544:invokevirtual   #87  <Method int Parcel.readInt()>
		//* 170  547:ifeq            556
					flag2 = true;
		//  171  550:iconst_1        
		//  172  551:istore          6
				else
		//* 173  553:goto            559
					flag2 = false;
		//  174  556:iconst_0        
		//  175  557:istore          6
				setGeodesic(flag2);
		//  176  559:aload_0         
		//  177  560:iload           6
		//  178  562:invokevirtual   #114 <Method void setGeodesic(boolean)>
				parcel1.writeNoException();
		//  179  565:aload_3         
		//  180  566:invokevirtual   #44  <Method void Parcel.writeNoException()>
				return true;
		//  181  569:iconst_1        
		//  182  570:ireturn         

			case 14: // '\016'
				parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//  183  571:aload_2         
		//  184  572:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//  185  574:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				boolean flag3 = isGeodesic();
		//  186  577:aload_0         
		//  187  578:invokevirtual   #117 <Method boolean isGeodesic()>
		//  188  581:istore          6
				parcel1.writeNoException();
		//  189  583:aload_3         
		//  190  584:invokevirtual   #44  <Method void Parcel.writeNoException()>
				if(flag3)
		//* 191  587:iload           6
		//* 192  589:ifeq            597
					i = 1;
		//  193  592:iconst_1        
		//  194  593:istore_1        
				else
		//* 195  594:goto            599
					i = 0;
		//  196  597:iconst_0        
		//  197  598:istore_1        
				parcel1.writeInt(i);
		//  198  599:aload_3         
		//  199  600:iload_1         
		//  200  601:invokevirtual   #97  <Method void Parcel.writeInt(int)>
				return true;
		//  201  604:iconst_1        
		//  202  605:ireturn         

			case 15: // '\017'
				parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//  203  606:aload_2         
		//  204  607:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//  205  609:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				boolean flag4 = equalsRemote(zzep(parcel.readStrongBinder()));
		//  206  612:aload_0         
		//  207  613:aload_2         
		//  208  614:invokevirtual   #121 <Method IBinder Parcel.readStrongBinder()>
		//  209  617:invokestatic    #123 <Method IPolylineDelegate zzep(IBinder)>
		//  210  620:invokevirtual   #127 <Method boolean equalsRemote(IPolylineDelegate)>
		//  211  623:istore          6
				parcel1.writeNoException();
		//  212  625:aload_3         
		//  213  626:invokevirtual   #44  <Method void Parcel.writeNoException()>
				if(flag4)
		//* 214  629:iload           6
		//* 215  631:ifeq            639
					i = 1;
		//  216  634:iconst_1        
		//  217  635:istore_1        
				else
		//* 218  636:goto            641
					i = 0;
		//  219  639:iconst_0        
		//  220  640:istore_1        
				parcel1.writeInt(i);
		//  221  641:aload_3         
		//  222  642:iload_1         
		//  223  643:invokevirtual   #97  <Method void Parcel.writeInt(int)>
				return true;
		//  224  646:iconst_1        
		//  225  647:ireturn         

			case 16: // '\020'
				parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//  226  648:aload_2         
		//  227  649:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//  228  651:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				i = hashCodeRemote();
		//  229  654:aload_0         
		//  230  655:invokevirtual   #130 <Method int hashCodeRemote()>
		//  231  658:istore_1        
				parcel1.writeNoException();
		//  232  659:aload_3         
		//  233  660:invokevirtual   #44  <Method void Parcel.writeNoException()>
				parcel1.writeInt(i);
		//  234  663:aload_3         
		//  235  664:iload_1         
		//  236  665:invokevirtual   #97  <Method void Parcel.writeInt(int)>
				return true;
		//  237  668:iconst_1        
		//  238  669:ireturn         

			case 17: // '\021'
				parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//  239  670:aload_2         
		//  240  671:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//  241  673:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				boolean flag5;
				if(parcel.readInt() != 0)
		//* 242  676:aload_2         
		//* 243  677:invokevirtual   #87  <Method int Parcel.readInt()>
		//* 244  680:ifeq            689
					flag5 = true;
		//  245  683:iconst_1        
		//  246  684:istore          6
				else
		//* 247  686:goto            692
					flag5 = false;
		//  248  689:iconst_0        
		//  249  690:istore          6
				setClickable(flag5);
		//  250  692:aload_0         
		//  251  693:iload           6
		//  252  695:invokevirtual   #133 <Method void setClickable(boolean)>
				parcel1.writeNoException();
		//  253  698:aload_3         
		//  254  699:invokevirtual   #44  <Method void Parcel.writeNoException()>
				return true;
		//  255  702:iconst_1        
		//  256  703:ireturn         

			case 18: // '\022'
				parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//  257  704:aload_2         
		//  258  705:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//  259  707:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				boolean flag6 = isClickable();
		//  260  710:aload_0         
		//  261  711:invokevirtual   #136 <Method boolean isClickable()>
		//  262  714:istore          6
				parcel1.writeNoException();
		//  263  716:aload_3         
		//  264  717:invokevirtual   #44  <Method void Parcel.writeNoException()>
				if(flag6)
		//* 265  720:iload           6
		//* 266  722:ifeq            730
					i = 1;
		//  267  725:iconst_1        
		//  268  726:istore_1        
				else
		//* 269  727:goto            732
					i = 0;
		//  270  730:iconst_0        
		//  271  731:istore_1        
				parcel1.writeInt(i);
		//  272  732:aload_3         
		//  273  733:iload_1         
		//  274  734:invokevirtual   #97  <Method void Parcel.writeInt(int)>
				return true;
		//  275  737:iconst_1        
		//  276  738:ireturn         

			case 19: // '\023'
				parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//  277  739:aload_2         
		//  278  740:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//  279  742:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//* 280  745:aload_2         
		//* 281  746:invokevirtual   #87  <Method int Parcel.readInt()>
		//* 282  749:ifeq            768
					parcel = ((Parcel) ((Cap)Cap.CREATOR.createFromParcel(parcel)));
		//  283  752:getstatic       #139 <Field android.os.Parcelable$Creator Cap.CREATOR>
		//  284  755:aload_2         
		//  285  756:invokeinterface #145 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  286  761:checkcast       #138 <Class Cap>
		//  287  764:astore_2        
				else
		//* 288  765:goto            770
					parcel = null;
		//  289  768:aconst_null     
		//  290  769:astore_2        
				setStartCap(((Cap) (parcel)));
		//  291  770:aload_0         
		//  292  771:aload_2         
		//  293  772:invokevirtual   #149 <Method void setStartCap(Cap)>
				parcel1.writeNoException();
		//  294  775:aload_3         
		//  295  776:invokevirtual   #44  <Method void Parcel.writeNoException()>
				return true;
		//  296  779:iconst_1        
		//  297  780:ireturn         

			case 20: // '\024'
				parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//  298  781:aload_2         
		//  299  782:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//  300  784:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getStartCap()));
		//  301  787:aload_0         
		//  302  788:invokevirtual   #153 <Method Cap getStartCap()>
		//  303  791:astore_2        
				parcel1.writeNoException();
		//  304  792:aload_3         
		//  305  793:invokevirtual   #44  <Method void Parcel.writeNoException()>
				if(parcel != null)
		//* 306  796:aload_2         
		//* 307  797:ifnull          814
				{
					parcel1.writeInt(1);
		//  308  800:aload_3         
		//  309  801:iconst_1        
		//  310  802:invokevirtual   #97  <Method void Parcel.writeInt(int)>
					((Cap) (parcel)).writeToParcel(parcel1, 1);
		//  311  805:aload_2         
		//  312  806:aload_3         
		//  313  807:iconst_1        
		//  314  808:invokevirtual   #157 <Method void Cap.writeToParcel(Parcel, int)>
				} else
		//* 315  811:goto            819
				{
					parcel1.writeInt(0);
		//  316  814:aload_3         
		//  317  815:iconst_0        
		//  318  816:invokevirtual   #97  <Method void Parcel.writeInt(int)>
				}
				return true;
		//  319  819:iconst_1        
		//  320  820:ireturn         

			case 21: // '\025'
				parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//  321  821:aload_2         
		//  322  822:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//  323  824:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//* 324  827:aload_2         
		//* 325  828:invokevirtual   #87  <Method int Parcel.readInt()>
		//* 326  831:ifeq            850
					parcel = ((Parcel) ((Cap)Cap.CREATOR.createFromParcel(parcel)));
		//  327  834:getstatic       #139 <Field android.os.Parcelable$Creator Cap.CREATOR>
		//  328  837:aload_2         
		//  329  838:invokeinterface #145 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  330  843:checkcast       #138 <Class Cap>
		//  331  846:astore_2        
				else
		//* 332  847:goto            852
					parcel = null;
		//  333  850:aconst_null     
		//  334  851:astore_2        
				setEndCap(((Cap) (parcel)));
		//  335  852:aload_0         
		//  336  853:aload_2         
		//  337  854:invokevirtual   #160 <Method void setEndCap(Cap)>
				parcel1.writeNoException();
		//  338  857:aload_3         
		//  339  858:invokevirtual   #44  <Method void Parcel.writeNoException()>
				return true;
		//  340  861:iconst_1        
		//  341  862:ireturn         

			case 22: // '\026'
				parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//  342  863:aload_2         
		//  343  864:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//  344  866:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getEndCap()));
		//  345  869:aload_0         
		//  346  870:invokevirtual   #163 <Method Cap getEndCap()>
		//  347  873:astore_2        
				parcel1.writeNoException();
		//  348  874:aload_3         
		//  349  875:invokevirtual   #44  <Method void Parcel.writeNoException()>
				if(parcel != null)
		//* 350  878:aload_2         
		//* 351  879:ifnull          896
				{
					parcel1.writeInt(1);
		//  352  882:aload_3         
		//  353  883:iconst_1        
		//  354  884:invokevirtual   #97  <Method void Parcel.writeInt(int)>
					((Cap) (parcel)).writeToParcel(parcel1, 1);
		//  355  887:aload_2         
		//  356  888:aload_3         
		//  357  889:iconst_1        
		//  358  890:invokevirtual   #157 <Method void Cap.writeToParcel(Parcel, int)>
				} else
		//* 359  893:goto            901
				{
					parcel1.writeInt(0);
		//  360  896:aload_3         
		//  361  897:iconst_0        
		//  362  898:invokevirtual   #97  <Method void Parcel.writeInt(int)>
				}
				return true;
		//  363  901:iconst_1        
		//  364  902:ireturn         

			case 23: // '\027'
				parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//  365  903:aload_2         
		//  366  904:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//  367  906:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				setJointType(parcel.readInt());
		//  368  909:aload_0         
		//  369  910:aload_2         
		//  370  911:invokevirtual   #87  <Method int Parcel.readInt()>
		//  371  914:invokevirtual   #166 <Method void setJointType(int)>
				parcel1.writeNoException();
		//  372  917:aload_3         
		//  373  918:invokevirtual   #44  <Method void Parcel.writeNoException()>
				return true;
		//  374  921:iconst_1        
		//  375  922:ireturn         

			case 24: // '\030'
				parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//  376  923:aload_2         
		//  377  924:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//  378  926:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				i = getJointType();
		//  379  929:aload_0         
		//  380  930:invokevirtual   #169 <Method int getJointType()>
		//  381  933:istore_1        
				parcel1.writeNoException();
		//  382  934:aload_3         
		//  383  935:invokevirtual   #44  <Method void Parcel.writeNoException()>
				parcel1.writeInt(i);
		//  384  938:aload_3         
		//  385  939:iload_1         
		//  386  940:invokevirtual   #97  <Method void Parcel.writeInt(int)>
				return true;
		//  387  943:iconst_1        
		//  388  944:ireturn         

			case 25: // '\031'
				parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//  389  945:aload_2         
		//  390  946:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//  391  948:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				setPattern(((List) (parcel.createTypedArrayList(PatternItem.CREATOR))));
		//  392  951:aload_0         
		//  393  952:aload_2         
		//  394  953:getstatic       #172 <Field android.os.Parcelable$Creator PatternItem.CREATOR>
		//  395  956:invokevirtual   #58  <Method java.util.ArrayList Parcel.createTypedArrayList(android.os.Parcelable$Creator)>
		//  396  959:invokevirtual   #175 <Method void setPattern(List)>
				parcel1.writeNoException();
		//  397  962:aload_3         
		//  398  963:invokevirtual   #44  <Method void Parcel.writeNoException()>
				return true;
		//  399  966:iconst_1        
		//  400  967:ireturn         

			case 26: // '\032'
				parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//  401  968:aload_2         
		//  402  969:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//  403  971:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getPattern()));
		//  404  974:aload_0         
		//  405  975:invokevirtual   #178 <Method List getPattern()>
		//  406  978:astore_2        
				parcel1.writeNoException();
		//  407  979:aload_3         
		//  408  980:invokevirtual   #44  <Method void Parcel.writeNoException()>
				parcel1.writeTypedList(((List) (parcel)));
		//  409  983:aload_3         
		//  410  984:aload_2         
		//  411  985:invokevirtual   #69  <Method void Parcel.writeTypedList(List)>
				return true;
		//  412  988:iconst_1        
		//  413  989:ireturn         

			case 27: // '\033'
				parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//  414  990:aload_2         
		//  415  991:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//  416  993:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				setTag(com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel.readStrongBinder()));
		//  417  996:aload_0         
		//  418  997:aload_2         
		//  419  998:invokevirtual   #121 <Method IBinder Parcel.readStrongBinder()>
		//  420 1001:invokestatic    #184 <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
		//  421 1004:invokevirtual   #188 <Method void setTag(IObjectWrapper)>
				parcel1.writeNoException();
		//  422 1007:aload_3         
		//  423 1008:invokevirtual   #44  <Method void Parcel.writeNoException()>
				return true;
		//  424 1011:iconst_1        
		//  425 1012:ireturn         

			case 28: // '\034'
				parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//  426 1013:aload_2         
		//  427 1014:ldc1            #13  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//  428 1016:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getTag()));
		//  429 1019:aload_0         
		//  430 1020:invokevirtual   #192 <Method IObjectWrapper getTag()>
		//  431 1023:astore_2        
				parcel1.writeNoException();
		//  432 1024:aload_3         
		//  433 1025:invokevirtual   #44  <Method void Parcel.writeNoException()>
				if(parcel != null)
		//* 434 1028:aload_2         
		//* 435 1029:ifnull          1042
					parcel = ((Parcel) (((IObjectWrapper) (parcel)).asBinder()));
		//  436 1032:aload_2         
		//  437 1033:invokeinterface #197 <Method IBinder IObjectWrapper.asBinder()>
		//  438 1038:astore_2        
				else
		//* 439 1039:goto            1044
					parcel = null;
		//  440 1042:aconst_null     
		//  441 1043:astore_2        
				parcel1.writeStrongBinder(((IBinder) (parcel)));
		//  442 1044:aload_3         
		//  443 1045:aload_2         
		//  444 1046:invokevirtual   #200 <Method void Parcel.writeStrongBinder(IBinder)>
				return true;
		//  445 1049:iconst_1        
		//  446 1050:ireturn         
			}
			return super.onTransact(i, parcel, parcel1, j);
		//  447 1051:aload_0         
		//  448 1052:iload_1         
		//  449 1053:aload_2         
		//  450 1054:aload_3         
		//  451 1055:iload           4
		//  452 1057:invokespecial   #202 <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//  453 1060:ireturn         
		}
	}

	static class zza.zza
		implements IPolylineDelegate
	{

		public IBinder asBinder()
		{
			return zzrk;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zzrk>
		//    2    4:areturn         
		}

		public boolean equalsRemote(IPolylineDelegate ipolylinedelegate)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore          4
			parcel1 = Parcel.obtain();
		//    2    5:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    8:astore          5
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//    4   10:aload           4
		//    5   12:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//    6   14:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(ipolylinedelegate == null) goto _L2; else goto _L1
		//    7   17:aload_1         
		//    8   18:ifnull          101
_L1:
			ipolylinedelegate = ((IPolylineDelegate) (ipolylinedelegate.asBinder()));
		//    9   21:aload_1         
		//   10   22:invokeinterface #39  <Method IBinder IPolylineDelegate.asBinder()>
		//   11   27:astore_1        
		//*  12   28:goto            31
_L4:
			int i;
			parcel.writeStrongBinder(((IBinder) (ipolylinedelegate)));
		//   13   31:aload           4
		//   14   33:aload_1         
		//   15   34:invokevirtual   #42  <Method void Parcel.writeStrongBinder(IBinder)>
			zzrk.transact(15, parcel, parcel1, 0);
		//   16   37:aload_0         
		//   17   38:getfield        #18  <Field IBinder zzrk>
		//   18   41:bipush          15
		//   19   43:aload           4
		//   20   45:aload           5
		//   21   47:iconst_0        
		//   22   48:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   23   53:pop             
			parcel1.readException();
		//   24   54:aload           5
		//   25   56:invokevirtual   #51  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   26   59:aload           5
		//   27   61:invokevirtual   #55  <Method int Parcel.readInt()>
		//   28   64:istore_2        
			boolean flag;
			if(i != 0)
		//*  29   65:iload_2         
		//*  30   66:ifeq            74
				flag = true;
		//   31   69:iconst_1        
		//   32   70:istore_3        
			else
		//*  33   71:goto            76
				flag = false;
		//   34   74:iconst_0        
		//   35   75:istore_3        
			parcel1.recycle();
		//   36   76:aload           5
		//   37   78:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   81:aload           4
		//   39   83:invokevirtual   #58  <Method void Parcel.recycle()>
			return flag;
		//   40   86:iload_3         
		//   41   87:ireturn         
			ipolylinedelegate;
		//   42   88:astore_1        
			parcel1.recycle();
		//   43   89:aload           5
		//   44   91:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   45   94:aload           4
		//   46   96:invokevirtual   #58  <Method void Parcel.recycle()>
			throw ipolylinedelegate;
		//   47   99:aload_1         
		//   48  100:athrow          
_L2:
			ipolylinedelegate = null;
		//   49  101:aconst_null     
		//   50  102:astore_1        
			if(true) goto _L4; else goto _L3
		//   51  103:goto            31
_L3:
		}

		public int getColor()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			int i;
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(8, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:bipush          8
		//   10   20:aload_2         
		//   11   21:aload_3         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_3         
		//   16   30:invokevirtual   #51  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   33:aload_3         
		//   18   34:invokevirtual   #55  <Method int Parcel.readInt()>
		//   19   37:istore_1        
			parcel1.recycle();
		//   20   38:aload_3         
		//   21   39:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   42:aload_2         
		//   23   43:invokevirtual   #58  <Method void Parcel.recycle()>
			return i;
		//   24   46:iload_1         
		//   25   47:ireturn         
			Exception exception;
			exception;
		//   26   48:astore          4
			parcel1.recycle();
		//   27   50:aload_3         
		//   28   51:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   54:aload_2         
		//   30   55:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   31   58:aload           4
		//   32   60:athrow          
		}

		public Cap getEndCap()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			Cap cap;
label0:
			{
				parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
				zzrk.transact(22, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:bipush          22
		//   10   20:aload_2         
		//   11   21:aload_3         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
				parcel1.readException();
		//   15   29:aload_3         
		//   16   30:invokevirtual   #51  <Method void Parcel.readException()>
				if(parcel1.readInt() != 0)
		//*  17   33:aload_3         
		//*  18   34:invokevirtual   #55  <Method int Parcel.readInt()>
		//*  19   37:ifeq            56
				{
					cap = (Cap)Cap.CREATOR.createFromParcel(parcel1);
		//   20   40:getstatic       #68  <Field android.os.Parcelable$Creator Cap.CREATOR>
		//   21   43:aload_3         
		//   22   44:invokeinterface #74  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   23   49:checkcast       #64  <Class Cap>
		//   24   52:astore_1        
					break label0;
		//   25   53:goto            58
				}
				cap = null;
		//   26   56:aconst_null     
		//   27   57:astore_1        
			}
			parcel1.recycle();
		//   28   58:aload_3         
		//   29   59:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   30   62:aload_2         
		//   31   63:invokevirtual   #58  <Method void Parcel.recycle()>
			return cap;
		//   32   66:aload_1         
		//   33   67:areturn         
			Exception exception;
			exception;
		//   34   68:astore_1        
			parcel1.recycle();
		//   35   69:aload_3         
		//   36   70:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   37   73:aload_2         
		//   38   74:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   39   77:aload_1         
		//   40   78:athrow          
		}

		public String getId()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore_2        
			String s;
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(2, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:iconst_2        
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   27:pop             
			parcel1.readException();
		//   15   28:aload_2         
		//   16   29:invokevirtual   #51  <Method void Parcel.readException()>
			s = parcel1.readString();
		//   17   32:aload_2         
		//   18   33:invokevirtual   #79  <Method String Parcel.readString()>
		//   19   36:astore_3        
			parcel1.recycle();
		//   20   37:aload_2         
		//   21   38:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   41:aload_1         
		//   23   42:invokevirtual   #58  <Method void Parcel.recycle()>
			return s;
		//   24   45:aload_3         
		//   25   46:areturn         
			Exception exception;
			exception;
		//   26   47:astore_3        
			parcel1.recycle();
		//   27   48:aload_2         
		//   28   49:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   52:aload_1         
		//   30   53:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   31   56:aload_3         
		//   32   57:athrow          
		}

		public int getJointType()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			int i;
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(24, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:bipush          24
		//   10   20:aload_2         
		//   11   21:aload_3         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_3         
		//   16   30:invokevirtual   #51  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   33:aload_3         
		//   18   34:invokevirtual   #55  <Method int Parcel.readInt()>
		//   19   37:istore_1        
			parcel1.recycle();
		//   20   38:aload_3         
		//   21   39:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   42:aload_2         
		//   23   43:invokevirtual   #58  <Method void Parcel.recycle()>
			return i;
		//   24   46:iload_1         
		//   25   47:ireturn         
			Exception exception;
			exception;
		//   26   48:astore          4
			parcel1.recycle();
		//   27   50:aload_3         
		//   28   51:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   54:aload_2         
		//   30   55:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   31   58:aload           4
		//   32   60:athrow          
		}

		public List getPattern()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore_2        
			java.util.ArrayList arraylist;
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(26, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:bipush          26
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_2         
		//   16   30:invokevirtual   #51  <Method void Parcel.readException()>
			arraylist = parcel1.createTypedArrayList(PatternItem.CREATOR);
		//   17   33:aload_2         
		//   18   34:getstatic       #85  <Field android.os.Parcelable$Creator PatternItem.CREATOR>
		//   19   37:invokevirtual   #89  <Method java.util.ArrayList Parcel.createTypedArrayList(android.os.Parcelable$Creator)>
		//   20   40:astore_3        
			parcel1.recycle();
		//   21   41:aload_2         
		//   22   42:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   23   45:aload_1         
		//   24   46:invokevirtual   #58  <Method void Parcel.recycle()>
			return ((List) (arraylist));
		//   25   49:aload_3         
		//   26   50:areturn         
			Exception exception;
			exception;
		//   27   51:astore_3        
			parcel1.recycle();
		//   28   52:aload_2         
		//   29   53:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   30   56:aload_1         
		//   31   57:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   32   60:aload_3         
		//   33   61:athrow          
		}

		public List getPoints()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore_2        
			java.util.ArrayList arraylist;
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(4, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:iconst_4        
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   27:pop             
			parcel1.readException();
		//   15   28:aload_2         
		//   16   29:invokevirtual   #51  <Method void Parcel.readException()>
			arraylist = parcel1.createTypedArrayList(LatLng.CREATOR);
		//   17   32:aload_2         
		//   18   33:getstatic       #95  <Field android.os.Parcelable$Creator LatLng.CREATOR>
		//   19   36:invokevirtual   #89  <Method java.util.ArrayList Parcel.createTypedArrayList(android.os.Parcelable$Creator)>
		//   20   39:astore_3        
			parcel1.recycle();
		//   21   40:aload_2         
		//   22   41:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   23   44:aload_1         
		//   24   45:invokevirtual   #58  <Method void Parcel.recycle()>
			return ((List) (arraylist));
		//   25   48:aload_3         
		//   26   49:areturn         
			Exception exception;
			exception;
		//   27   50:astore_3        
			parcel1.recycle();
		//   28   51:aload_2         
		//   29   52:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   30   55:aload_1         
		//   31   56:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   32   59:aload_3         
		//   33   60:athrow          
		}

		public Cap getStartCap()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			Cap cap;
label0:
			{
				parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
				zzrk.transact(20, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:bipush          20
		//   10   20:aload_2         
		//   11   21:aload_3         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
				parcel1.readException();
		//   15   29:aload_3         
		//   16   30:invokevirtual   #51  <Method void Parcel.readException()>
				if(parcel1.readInt() != 0)
		//*  17   33:aload_3         
		//*  18   34:invokevirtual   #55  <Method int Parcel.readInt()>
		//*  19   37:ifeq            56
				{
					cap = (Cap)Cap.CREATOR.createFromParcel(parcel1);
		//   20   40:getstatic       #68  <Field android.os.Parcelable$Creator Cap.CREATOR>
		//   21   43:aload_3         
		//   22   44:invokeinterface #74  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   23   49:checkcast       #64  <Class Cap>
		//   24   52:astore_1        
					break label0;
		//   25   53:goto            58
				}
				cap = null;
		//   26   56:aconst_null     
		//   27   57:astore_1        
			}
			parcel1.recycle();
		//   28   58:aload_3         
		//   29   59:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   30   62:aload_2         
		//   31   63:invokevirtual   #58  <Method void Parcel.recycle()>
			return cap;
		//   32   66:aload_1         
		//   33   67:areturn         
			Exception exception;
			exception;
		//   34   68:astore_1        
			parcel1.recycle();
		//   35   69:aload_3         
		//   36   70:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   37   73:aload_2         
		//   38   74:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   39   77:aload_1         
		//   40   78:athrow          
		}

		public IObjectWrapper getTag()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore_2        
			IObjectWrapper iobjectwrapper;
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(28, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:bipush          28
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_2         
		//   16   30:invokevirtual   #51  <Method void Parcel.readException()>
			iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder());
		//   17   33:aload_2         
		//   18   34:invokevirtual   #102 <Method IBinder Parcel.readStrongBinder()>
		//   19   37:invokestatic    #108 <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
		//   20   40:astore_3        
			parcel1.recycle();
		//   21   41:aload_2         
		//   22   42:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   23   45:aload_1         
		//   24   46:invokevirtual   #58  <Method void Parcel.recycle()>
			return iobjectwrapper;
		//   25   49:aload_3         
		//   26   50:areturn         
			Exception exception;
			exception;
		//   27   51:astore_3        
			parcel1.recycle();
		//   28   52:aload_2         
		//   29   53:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   30   56:aload_1         
		//   31   57:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   32   60:aload_3         
		//   33   61:athrow          
		}

		public float getWidth()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			float f;
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(6, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:bipush          6
		//   10   20:aload_2         
		//   11   21:aload_3         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_3         
		//   16   30:invokevirtual   #51  <Method void Parcel.readException()>
			f = parcel1.readFloat();
		//   17   33:aload_3         
		//   18   34:invokevirtual   #113 <Method float Parcel.readFloat()>
		//   19   37:fstore_1        
			parcel1.recycle();
		//   20   38:aload_3         
		//   21   39:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   42:aload_2         
		//   23   43:invokevirtual   #58  <Method void Parcel.recycle()>
			return f;
		//   24   46:fload_1         
		//   25   47:freturn         
			Exception exception;
			exception;
		//   26   48:astore          4
			parcel1.recycle();
		//   27   50:aload_3         
		//   28   51:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   54:aload_2         
		//   30   55:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   31   58:aload           4
		//   32   60:athrow          
		}

		public float getZIndex()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			float f;
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(10, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:bipush          10
		//   10   20:aload_2         
		//   11   21:aload_3         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_3         
		//   16   30:invokevirtual   #51  <Method void Parcel.readException()>
			f = parcel1.readFloat();
		//   17   33:aload_3         
		//   18   34:invokevirtual   #113 <Method float Parcel.readFloat()>
		//   19   37:fstore_1        
			parcel1.recycle();
		//   20   38:aload_3         
		//   21   39:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   42:aload_2         
		//   23   43:invokevirtual   #58  <Method void Parcel.recycle()>
			return f;
		//   24   46:fload_1         
		//   25   47:freturn         
			Exception exception;
			exception;
		//   26   48:astore          4
			parcel1.recycle();
		//   27   50:aload_3         
		//   28   51:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   54:aload_2         
		//   30   55:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   31   58:aload           4
		//   32   60:athrow          
		}

		public int hashCodeRemote()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			int i;
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(16, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:bipush          16
		//   10   20:aload_2         
		//   11   21:aload_3         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_3         
		//   16   30:invokevirtual   #51  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   33:aload_3         
		//   18   34:invokevirtual   #55  <Method int Parcel.readInt()>
		//   19   37:istore_1        
			parcel1.recycle();
		//   20   38:aload_3         
		//   21   39:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   42:aload_2         
		//   23   43:invokevirtual   #58  <Method void Parcel.recycle()>
			return i;
		//   24   46:iload_1         
		//   25   47:ireturn         
			Exception exception;
			exception;
		//   26   48:astore          4
			parcel1.recycle();
		//   27   50:aload_3         
		//   28   51:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   54:aload_2         
		//   30   55:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   31   58:aload           4
		//   32   60:athrow          
		}

		public boolean isClickable()
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//    4    9:aload_3         
		//    5   10:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(18, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #18  <Field IBinder zzrk>
		//    9   19:bipush          18
		//   10   21:aload_3         
		//   11   22:aload           4
		//   12   24:iconst_0        
		//   13   25:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   30:pop             
			parcel1.readException();
		//   15   31:aload           4
		//   16   33:invokevirtual   #51  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   36:aload           4
		//   18   38:invokevirtual   #55  <Method int Parcel.readInt()>
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
		//   28   55:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   58:aload_3         
		//   30   59:invokevirtual   #58  <Method void Parcel.recycle()>
			return flag;
		//   31   62:iload_2         
		//   32   63:ireturn         
			Exception exception;
			exception;
		//   33   64:astore          5
			parcel1.recycle();
		//   34   66:aload           4
		//   35   68:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   71:aload_3         
		//   37   72:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   38   75:aload           5
		//   39   77:athrow          
		}

		public boolean isGeodesic()
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//    4    9:aload_3         
		//    5   10:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(14, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #18  <Field IBinder zzrk>
		//    9   19:bipush          14
		//   10   21:aload_3         
		//   11   22:aload           4
		//   12   24:iconst_0        
		//   13   25:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   30:pop             
			parcel1.readException();
		//   15   31:aload           4
		//   16   33:invokevirtual   #51  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   36:aload           4
		//   18   38:invokevirtual   #55  <Method int Parcel.readInt()>
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
		//   28   55:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   58:aload_3         
		//   30   59:invokevirtual   #58  <Method void Parcel.recycle()>
			return flag;
		//   31   62:iload_2         
		//   32   63:ireturn         
			Exception exception;
			exception;
		//   33   64:astore          5
			parcel1.recycle();
		//   34   66:aload           4
		//   35   68:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   71:aload_3         
		//   37   72:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   38   75:aload           5
		//   39   77:athrow          
		}

		public boolean isVisible()
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//    4    9:aload_3         
		//    5   10:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(12, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #18  <Field IBinder zzrk>
		//    9   19:bipush          12
		//   10   21:aload_3         
		//   11   22:aload           4
		//   12   24:iconst_0        
		//   13   25:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   30:pop             
			parcel1.readException();
		//   15   31:aload           4
		//   16   33:invokevirtual   #51  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   36:aload           4
		//   18   38:invokevirtual   #55  <Method int Parcel.readInt()>
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
		//   28   55:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   58:aload_3         
		//   30   59:invokevirtual   #58  <Method void Parcel.recycle()>
			return flag;
		//   31   62:iload_2         
		//   32   63:ireturn         
			Exception exception;
			exception;
		//   33   64:astore          5
			parcel1.recycle();
		//   34   66:aload           4
		//   35   68:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   71:aload_3         
		//   37   72:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   38   75:aload           5
		//   39   77:athrow          
		}

		public void remove()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore_2        
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(1, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:iconst_1        
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   27:pop             
			parcel1.readException();
		//   15   28:aload_2         
		//   16   29:invokevirtual   #51  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   32:aload_2         
		//   18   33:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   36:aload_1         
		//   20   37:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   21   40:return          
			Exception exception;
			exception;
		//   22   41:astore_3        
			parcel1.recycle();
		//   23   42:aload_2         
		//   24   43:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   46:aload_1         
		//   26   47:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   27   50:aload_3         
		//   28   51:athrow          
		}

		public void setClickable(boolean flag)
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//    4    9:aload_3         
		//    5   10:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
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
		//*  14   26:invokevirtual   #126 <Method void Parcel.writeInt(int)>
		//*  15   29:aload_0         
		//*  16   30:getfield        #18  <Field IBinder zzrk>
		//*  17   33:bipush          17
		//*  18   35:aload_3         
		//*  19   36:aload           4
		//*  20   38:iconst_0        
		//*  21   39:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//*  22   44:pop             
		//*  23   45:aload           4
		//*  24   47:invokevirtual   #51  <Method void Parcel.readException()>
		//*  25   50:aload           4
		//*  26   52:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  27   55:aload_3         
		//*  28   56:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  29   59:return          
		//*  30   60:astore          5
		//*  31   62:aload           4
		//*  32   64:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  33   67:aload_3         
		//*  34   68:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  35   71:aload           5
		//*  36   73:athrow          
				i = 0;
		//   37   74:iconst_0        
		//   38   75:istore_2        
			parcel.writeInt(i);
			zzrk.transact(17, parcel, parcel1, 0);
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

		public void setColor(int i)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeInt(i);
		//    7   14:aload_2         
		//    8   15:iload_1         
		//    9   16:invokevirtual   #126 <Method void Parcel.writeInt(int)>
			zzrk.transact(7, parcel, parcel1, 0);
		//   10   19:aload_0         
		//   11   20:getfield        #18  <Field IBinder zzrk>
		//   12   23:bipush          7
		//   13   25:aload_2         
		//   14   26:aload_3         
		//   15   27:iconst_0        
		//   16   28:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   17   33:pop             
			parcel1.readException();
		//   18   34:aload_3         
		//   19   35:invokevirtual   #51  <Method void Parcel.readException()>
			parcel1.recycle();
		//   20   38:aload_3         
		//   21   39:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   42:aload_2         
		//   23   43:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   24   46:return          
			Exception exception;
			exception;
		//   25   47:astore          4
			parcel1.recycle();
		//   26   49:aload_3         
		//   27   50:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   53:aload_2         
		//   29   54:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   30   57:aload           4
		//   31   59:athrow          
		}

		public void setEndCap(Cap cap)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(cap == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #126 <Method void Parcel.writeInt(int)>
			cap.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #133 <Method void Cap.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #126 <Method void Parcel.writeInt(int)>
			zzrk.transact(21, parcel, parcel1, 0);
		//   20   37:aload_0         
		//   21   38:getfield        #18  <Field IBinder zzrk>
		//   22   41:bipush          21
		//   23   43:aload_2         
		//   24   44:aload_3         
		//   25   45:iconst_0        
		//   26   46:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   27   51:pop             
			parcel1.readException();
		//   28   52:aload_3         
		//   29   53:invokevirtual   #51  <Method void Parcel.readException()>
			parcel1.recycle();
		//   30   56:aload_3         
		//   31   57:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   32   60:aload_2         
		//   33   61:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   34   64:return          
			cap;
		//   35   65:astore_1        
			parcel1.recycle();
		//   36   66:aload_3         
		//   37   67:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   70:aload_2         
		//   39   71:invokevirtual   #58  <Method void Parcel.recycle()>
			throw cap;
		//   40   74:aload_1         
		//   41   75:athrow          
		}

		public void setGeodesic(boolean flag)
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//    4    9:aload_3         
		//    5   10:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
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
		//*  14   26:invokevirtual   #126 <Method void Parcel.writeInt(int)>
		//*  15   29:aload_0         
		//*  16   30:getfield        #18  <Field IBinder zzrk>
		//*  17   33:bipush          13
		//*  18   35:aload_3         
		//*  19   36:aload           4
		//*  20   38:iconst_0        
		//*  21   39:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//*  22   44:pop             
		//*  23   45:aload           4
		//*  24   47:invokevirtual   #51  <Method void Parcel.readException()>
		//*  25   50:aload           4
		//*  26   52:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  27   55:aload_3         
		//*  28   56:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  29   59:return          
		//*  30   60:astore          5
		//*  31   62:aload           4
		//*  32   64:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  33   67:aload_3         
		//*  34   68:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  35   71:aload           5
		//*  36   73:athrow          
				i = 0;
		//   37   74:iconst_0        
		//   38   75:istore_2        
			parcel.writeInt(i);
			zzrk.transact(13, parcel, parcel1, 0);
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

		public void setJointType(int i)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeInt(i);
		//    7   14:aload_2         
		//    8   15:iload_1         
		//    9   16:invokevirtual   #126 <Method void Parcel.writeInt(int)>
			zzrk.transact(23, parcel, parcel1, 0);
		//   10   19:aload_0         
		//   11   20:getfield        #18  <Field IBinder zzrk>
		//   12   23:bipush          23
		//   13   25:aload_2         
		//   14   26:aload_3         
		//   15   27:iconst_0        
		//   16   28:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   17   33:pop             
			parcel1.readException();
		//   18   34:aload_3         
		//   19   35:invokevirtual   #51  <Method void Parcel.readException()>
			parcel1.recycle();
		//   20   38:aload_3         
		//   21   39:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   42:aload_2         
		//   23   43:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   24   46:return          
			Exception exception;
			exception;
		//   25   47:astore          4
			parcel1.recycle();
		//   26   49:aload_3         
		//   27   50:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   53:aload_2         
		//   29   54:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   30   57:aload           4
		//   31   59:athrow          
		}

		public void setPattern(List list)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeTypedList(list);
		//    7   14:aload_2         
		//    8   15:aload_1         
		//    9   16:invokevirtual   #140 <Method void Parcel.writeTypedList(List)>
			zzrk.transact(25, parcel, parcel1, 0);
		//   10   19:aload_0         
		//   11   20:getfield        #18  <Field IBinder zzrk>
		//   12   23:bipush          25
		//   13   25:aload_2         
		//   14   26:aload_3         
		//   15   27:iconst_0        
		//   16   28:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   17   33:pop             
			parcel1.readException();
		//   18   34:aload_3         
		//   19   35:invokevirtual   #51  <Method void Parcel.readException()>
			parcel1.recycle();
		//   20   38:aload_3         
		//   21   39:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   42:aload_2         
		//   23   43:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   24   46:return          
			list;
		//   25   47:astore_1        
			parcel1.recycle();
		//   26   48:aload_3         
		//   27   49:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   52:aload_2         
		//   29   53:invokevirtual   #58  <Method void Parcel.recycle()>
			throw list;
		//   30   56:aload_1         
		//   31   57:athrow          
		}

		public void setPoints(List list)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeTypedList(list);
		//    7   14:aload_2         
		//    8   15:aload_1         
		//    9   16:invokevirtual   #140 <Method void Parcel.writeTypedList(List)>
			zzrk.transact(3, parcel, parcel1, 0);
		//   10   19:aload_0         
		//   11   20:getfield        #18  <Field IBinder zzrk>
		//   12   23:iconst_3        
		//   13   24:aload_2         
		//   14   25:aload_3         
		//   15   26:iconst_0        
		//   16   27:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   17   32:pop             
			parcel1.readException();
		//   18   33:aload_3         
		//   19   34:invokevirtual   #51  <Method void Parcel.readException()>
			parcel1.recycle();
		//   20   37:aload_3         
		//   21   38:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   41:aload_2         
		//   23   42:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   24   45:return          
			list;
		//   25   46:astore_1        
			parcel1.recycle();
		//   26   47:aload_3         
		//   27   48:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   51:aload_2         
		//   29   52:invokevirtual   #58  <Method void Parcel.recycle()>
			throw list;
		//   30   55:aload_1         
		//   31   56:athrow          
		}

		public void setStartCap(Cap cap)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(cap == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #126 <Method void Parcel.writeInt(int)>
			cap.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #133 <Method void Cap.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #126 <Method void Parcel.writeInt(int)>
			zzrk.transact(19, parcel, parcel1, 0);
		//   20   37:aload_0         
		//   21   38:getfield        #18  <Field IBinder zzrk>
		//   22   41:bipush          19
		//   23   43:aload_2         
		//   24   44:aload_3         
		//   25   45:iconst_0        
		//   26   46:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   27   51:pop             
			parcel1.readException();
		//   28   52:aload_3         
		//   29   53:invokevirtual   #51  <Method void Parcel.readException()>
			parcel1.recycle();
		//   30   56:aload_3         
		//   31   57:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   32   60:aload_2         
		//   33   61:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   34   64:return          
			cap;
		//   35   65:astore_1        
			parcel1.recycle();
		//   36   66:aload_3         
		//   37   67:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   70:aload_2         
		//   39   71:invokevirtual   #58  <Method void Parcel.recycle()>
			throw cap;
		//   40   74:aload_1         
		//   41   75:athrow          
		}

		public void setTag(IObjectWrapper iobjectwrapper)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(iobjectwrapper == null) goto _L2; else goto _L1
		//    7   14:aload_1         
		//    8   15:ifnull          72
_L1:
			iobjectwrapper = ((IObjectWrapper) (iobjectwrapper.asBinder()));
		//    9   18:aload_1         
		//   10   19:invokeinterface #149 <Method IBinder IObjectWrapper.asBinder()>
		//   11   24:astore_1        
		//*  12   25:goto            28
_L4:
			parcel.writeStrongBinder(((IBinder) (iobjectwrapper)));
		//   13   28:aload_2         
		//   14   29:aload_1         
		//   15   30:invokevirtual   #42  <Method void Parcel.writeStrongBinder(IBinder)>
			zzrk.transact(27, parcel, parcel1, 0);
		//   16   33:aload_0         
		//   17   34:getfield        #18  <Field IBinder zzrk>
		//   18   37:bipush          27
		//   19   39:aload_2         
		//   20   40:aload_3         
		//   21   41:iconst_0        
		//   22   42:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   23   47:pop             
			parcel1.readException();
		//   24   48:aload_3         
		//   25   49:invokevirtual   #51  <Method void Parcel.readException()>
			parcel1.recycle();
		//   26   52:aload_3         
		//   27   53:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   56:aload_2         
		//   29   57:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   30   60:return          
			iobjectwrapper;
		//   31   61:astore_1        
			parcel1.recycle();
		//   32   62:aload_3         
		//   33   63:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   34   66:aload_2         
		//   35   67:invokevirtual   #58  <Method void Parcel.recycle()>
			throw iobjectwrapper;
		//   36   70:aload_1         
		//   37   71:athrow          
_L2:
			iobjectwrapper = null;
		//   38   72:aconst_null     
		//   39   73:astore_1        
			if(true) goto _L4; else goto _L3
		//   40   74:goto            28
_L3:
		}

		public void setVisible(boolean flag)
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//    4    9:aload_3         
		//    5   10:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
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
		//*  14   26:invokevirtual   #126 <Method void Parcel.writeInt(int)>
		//*  15   29:aload_0         
		//*  16   30:getfield        #18  <Field IBinder zzrk>
		//*  17   33:bipush          11
		//*  18   35:aload_3         
		//*  19   36:aload           4
		//*  20   38:iconst_0        
		//*  21   39:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//*  22   44:pop             
		//*  23   45:aload           4
		//*  24   47:invokevirtual   #51  <Method void Parcel.readException()>
		//*  25   50:aload           4
		//*  26   52:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  27   55:aload_3         
		//*  28   56:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  29   59:return          
		//*  30   60:astore          5
		//*  31   62:aload           4
		//*  32   64:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  33   67:aload_3         
		//*  34   68:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  35   71:aload           5
		//*  36   73:athrow          
				i = 0;
		//   37   74:iconst_0        
		//   38   75:istore_2        
			parcel.writeInt(i);
			zzrk.transact(11, parcel, parcel1, 0);
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

		public void setWidth(float f)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeFloat(f);
		//    7   14:aload_2         
		//    8   15:fload_1         
		//    9   16:invokevirtual   #155 <Method void Parcel.writeFloat(float)>
			zzrk.transact(5, parcel, parcel1, 0);
		//   10   19:aload_0         
		//   11   20:getfield        #18  <Field IBinder zzrk>
		//   12   23:iconst_5        
		//   13   24:aload_2         
		//   14   25:aload_3         
		//   15   26:iconst_0        
		//   16   27:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   17   32:pop             
			parcel1.readException();
		//   18   33:aload_3         
		//   19   34:invokevirtual   #51  <Method void Parcel.readException()>
			parcel1.recycle();
		//   20   37:aload_3         
		//   21   38:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   41:aload_2         
		//   23   42:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   24   45:return          
			Exception exception;
			exception;
		//   25   46:astore          4
			parcel1.recycle();
		//   26   48:aload_3         
		//   27   49:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   52:aload_2         
		//   29   53:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   30   56:aload           4
		//   31   58:athrow          
		}

		public void setZIndex(float f)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolylineDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolylineDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeFloat(f);
		//    7   14:aload_2         
		//    8   15:fload_1         
		//    9   16:invokevirtual   #155 <Method void Parcel.writeFloat(float)>
			zzrk.transact(9, parcel, parcel1, 0);
		//   10   19:aload_0         
		//   11   20:getfield        #18  <Field IBinder zzrk>
		//   12   23:bipush          9
		//   13   25:aload_2         
		//   14   26:aload_3         
		//   15   27:iconst_0        
		//   16   28:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   17   33:pop             
			parcel1.readException();
		//   18   34:aload_3         
		//   19   35:invokevirtual   #51  <Method void Parcel.readException()>
			parcel1.recycle();
		//   20   38:aload_3         
		//   21   39:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   42:aload_2         
		//   23   43:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   24   46:return          
			Exception exception;
			exception;
		//   25   47:astore          4
			parcel1.recycle();
		//   26   49:aload_3         
		//   27   50:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   53:aload_2         
		//   29   54:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   30   57:aload           4
		//   31   59:athrow          
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


	public abstract boolean equalsRemote(IPolylineDelegate ipolylinedelegate)
		throws RemoteException;

	public abstract int getColor()
		throws RemoteException;

	public abstract Cap getEndCap()
		throws RemoteException;

	public abstract String getId()
		throws RemoteException;

	public abstract int getJointType()
		throws RemoteException;

	public abstract List getPattern()
		throws RemoteException;

	public abstract List getPoints()
		throws RemoteException;

	public abstract Cap getStartCap()
		throws RemoteException;

	public abstract IObjectWrapper getTag()
		throws RemoteException;

	public abstract float getWidth()
		throws RemoteException;

	public abstract float getZIndex()
		throws RemoteException;

	public abstract int hashCodeRemote()
		throws RemoteException;

	public abstract boolean isClickable()
		throws RemoteException;

	public abstract boolean isGeodesic()
		throws RemoteException;

	public abstract boolean isVisible()
		throws RemoteException;

	public abstract void remove()
		throws RemoteException;

	public abstract void setClickable(boolean flag)
		throws RemoteException;

	public abstract void setColor(int i)
		throws RemoteException;

	public abstract void setEndCap(Cap cap)
		throws RemoteException;

	public abstract void setGeodesic(boolean flag)
		throws RemoteException;

	public abstract void setJointType(int i)
		throws RemoteException;

	public abstract void setPattern(List list)
		throws RemoteException;

	public abstract void setPoints(List list)
		throws RemoteException;

	public abstract void setStartCap(Cap cap)
		throws RemoteException;

	public abstract void setTag(IObjectWrapper iobjectwrapper)
		throws RemoteException;

	public abstract void setVisible(boolean flag)
		throws RemoteException;

	public abstract void setWidth(float f)
		throws RemoteException;

	public abstract void setZIndex(float f)
		throws RemoteException;
}
