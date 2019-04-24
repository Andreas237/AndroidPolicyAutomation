// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;
import com.google.android.gms.fitness.request.*;

public interface zzaov
	extends IInterface
{
	public static abstract class zza extends Binder
		implements zzaov
	{

		public static zzaov zzcz(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
		//    4    6:aload_0         
		//    5    7:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi">
		//    6    9:invokeinterface #19  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface != null && (iinterface instanceof zzaov))
		//*   8   15:aload_1         
		//*   9   16:ifnull          31
		//*  10   19:aload_1         
		//*  11   20:instanceof      #6   <Class zzaov>
		//*  12   23:ifeq            31
				return (zzaov)iinterface;
		//   13   26:aload_1         
		//   14   27:checkcast       #6   <Class zzaov>
		//   15   30:areturn         
			else
				return ((zzaov) (new zza(ibinder)));
		//   16   31:new             #9   <Class zzaov$zza$zza>
		//   17   34:dup             
		//   18   35:aload_0         
		//   19   36:invokespecial   #23  <Method void zzaov$zza$zza(IBinder)>
		//   20   39:areturn         
		}

		public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
			throws RemoteException
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:lookupswitch    16: default 140
		//		               1: 151
		//		               2: 193
		//		               3: 235
		//		               4: 277
		//		               5: 319
		//		               6: 361
		//		               7: 403
		//		               8: 445
		//		               9: 487
		//		               10: 529
		//		               11: 571
		//		               12: 613
		//		               13: 655
		//		               14: 697
		//		               15: 739
		//		               1598968902: 143
		//*   2  140:goto            781
			case 1598968902: 
				parcel1.writeString("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
		//    3  143:aload_3         
		//    4  144:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi">
		//    5  146:invokevirtual   #34  <Method void Parcel.writeString(String)>
				return true;
		//    6  149:iconst_1        
		//    7  150:ireturn         

			case 1: // '\001'
				parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
		//    8  151:aload_2         
		//    9  152:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi">
		//   10  154:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//*  11  157:aload_2         
		//*  12  158:invokevirtual   #41  <Method int Parcel.readInt()>
		//*  13  161:ifeq            180
					parcel = ((Parcel) ((DataReadRequest)DataReadRequest.CREATOR.createFromParcel(parcel)));
		//   14  164:getstatic       #47  <Field android.os.Parcelable$Creator DataReadRequest.CREATOR>
		//   15  167:aload_2         
		//   16  168:invokeinterface #53  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   17  173:checkcast       #43  <Class DataReadRequest>
		//   18  176:astore_2        
				else
		//*  19  177:goto            182
					parcel = null;
		//   20  180:aconst_null     
		//   21  181:astore_2        
				zza(((DataReadRequest) (parcel)));
		//   22  182:aload_0         
		//   23  183:aload_2         
		//   24  184:invokevirtual   #56  <Method void zza(DataReadRequest)>
				parcel1.writeNoException();
		//   25  187:aload_3         
		//   26  188:invokevirtual   #60  <Method void Parcel.writeNoException()>
				return true;
		//   27  191:iconst_1        
		//   28  192:ireturn         

			case 2: // '\002'
				parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
		//   29  193:aload_2         
		//   30  194:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi">
		//   31  196:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//*  32  199:aload_2         
		//*  33  200:invokevirtual   #41  <Method int Parcel.readInt()>
		//*  34  203:ifeq            222
					parcel = ((Parcel) ((zzg)zzg.CREATOR.createFromParcel(parcel)));
		//   35  206:getstatic       #63  <Field android.os.Parcelable$Creator zzg.CREATOR>
		//   36  209:aload_2         
		//   37  210:invokeinterface #53  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   38  215:checkcast       #62  <Class zzg>
		//   39  218:astore_2        
				else
		//*  40  219:goto            224
					parcel = null;
		//   41  222:aconst_null     
		//   42  223:astore_2        
				zza(((zzg) (parcel)));
		//   43  224:aload_0         
		//   44  225:aload_2         
		//   45  226:invokevirtual   #66  <Method void zza(zzg)>
				parcel1.writeNoException();
		//   46  229:aload_3         
		//   47  230:invokevirtual   #60  <Method void Parcel.writeNoException()>
				return true;
		//   48  233:iconst_1        
		//   49  234:ireturn         

			case 3: // '\003'
				parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
		//   50  235:aload_2         
		//   51  236:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi">
		//   52  238:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//*  53  241:aload_2         
		//*  54  242:invokevirtual   #41  <Method int Parcel.readInt()>
		//*  55  245:ifeq            264
					parcel = ((Parcel) ((DataDeleteRequest)DataDeleteRequest.CREATOR.createFromParcel(parcel)));
		//   56  248:getstatic       #69  <Field android.os.Parcelable$Creator DataDeleteRequest.CREATOR>
		//   57  251:aload_2         
		//   58  252:invokeinterface #53  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   59  257:checkcast       #68  <Class DataDeleteRequest>
		//   60  260:astore_2        
				else
		//*  61  261:goto            266
					parcel = null;
		//   62  264:aconst_null     
		//   63  265:astore_2        
				zza(((DataDeleteRequest) (parcel)));
		//   64  266:aload_0         
		//   65  267:aload_2         
		//   66  268:invokevirtual   #72  <Method void zza(DataDeleteRequest)>
				parcel1.writeNoException();
		//   67  271:aload_3         
		//   68  272:invokevirtual   #60  <Method void Parcel.writeNoException()>
				return true;
		//   69  275:iconst_1        
		//   70  276:ireturn         

			case 4: // '\004'
				parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
		//   71  277:aload_2         
		//   72  278:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi">
		//   73  280:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//*  74  283:aload_2         
		//*  75  284:invokevirtual   #41  <Method int Parcel.readInt()>
		//*  76  287:ifeq            306
					parcel = ((Parcel) ((zzad)zzad.CREATOR.createFromParcel(parcel)));
		//   77  290:getstatic       #75  <Field android.os.Parcelable$Creator zzad.CREATOR>
		//   78  293:aload_2         
		//   79  294:invokeinterface #53  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   80  299:checkcast       #74  <Class zzad>
		//   81  302:astore_2        
				else
		//*  82  303:goto            308
					parcel = null;
		//   83  306:aconst_null     
		//   84  307:astore_2        
				zza(((zzad) (parcel)));
		//   85  308:aload_0         
		//   86  309:aload_2         
		//   87  310:invokevirtual   #78  <Method void zza(zzad)>
				parcel1.writeNoException();
		//   88  313:aload_3         
		//   89  314:invokevirtual   #60  <Method void Parcel.writeNoException()>
				return true;
		//   90  317:iconst_1        
		//   91  318:ireturn         

			case 5: // '\005'
				parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
		//   92  319:aload_2         
		//   93  320:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi">
		//   94  322:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//*  95  325:aload_2         
		//*  96  326:invokevirtual   #41  <Method int Parcel.readInt()>
		//*  97  329:ifeq            348
					parcel = ((Parcel) ((zzat)zzat.CREATOR.createFromParcel(parcel)));
		//   98  332:getstatic       #81  <Field android.os.Parcelable$Creator zzat.CREATOR>
		//   99  335:aload_2         
		//  100  336:invokeinterface #53  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  101  341:checkcast       #80  <Class zzat>
		//  102  344:astore_2        
				else
		//* 103  345:goto            350
					parcel = null;
		//  104  348:aconst_null     
		//  105  349:astore_2        
				zza(((zzat) (parcel)));
		//  106  350:aload_0         
		//  107  351:aload_2         
		//  108  352:invokevirtual   #84  <Method void zza(zzat)>
				parcel1.writeNoException();
		//  109  355:aload_3         
		//  110  356:invokevirtual   #60  <Method void Parcel.writeNoException()>
				return true;
		//  111  359:iconst_1        
		//  112  360:ireturn         

			case 6: // '\006'
				parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
		//  113  361:aload_2         
		//  114  362:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi">
		//  115  364:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//* 116  367:aload_2         
		//* 117  368:invokevirtual   #41  <Method int Parcel.readInt()>
		//* 118  371:ifeq            390
					parcel = ((Parcel) ((zzar)zzar.CREATOR.createFromParcel(parcel)));
		//  119  374:getstatic       #87  <Field android.os.Parcelable$Creator zzar.CREATOR>
		//  120  377:aload_2         
		//  121  378:invokeinterface #53  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  122  383:checkcast       #86  <Class zzar>
		//  123  386:astore_2        
				else
		//* 124  387:goto            392
					parcel = null;
		//  125  390:aconst_null     
		//  126  391:astore_2        
				zza(((zzar) (parcel)));
		//  127  392:aload_0         
		//  128  393:aload_2         
		//  129  394:invokevirtual   #90  <Method void zza(zzar)>
				parcel1.writeNoException();
		//  130  397:aload_3         
		//  131  398:invokevirtual   #60  <Method void Parcel.writeNoException()>
				return true;
		//  132  401:iconst_1        
		//  133  402:ireturn         

			case 7: // '\007'
				parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
		//  134  403:aload_2         
		//  135  404:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi">
		//  136  406:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//* 137  409:aload_2         
		//* 138  410:invokevirtual   #41  <Method int Parcel.readInt()>
		//* 139  413:ifeq            432
					parcel = ((Parcel) ((zzd)zzd.CREATOR.createFromParcel(parcel)));
		//  140  416:getstatic       #93  <Field android.os.Parcelable$Creator zzd.CREATOR>
		//  141  419:aload_2         
		//  142  420:invokeinterface #53  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  143  425:checkcast       #92  <Class zzd>
		//  144  428:astore_2        
				else
		//* 145  429:goto            434
					parcel = null;
		//  146  432:aconst_null     
		//  147  433:astore_2        
				zza(((zzd) (parcel)));
		//  148  434:aload_0         
		//  149  435:aload_2         
		//  150  436:invokevirtual   #96  <Method void zza(zzd)>
				parcel1.writeNoException();
		//  151  439:aload_3         
		//  152  440:invokevirtual   #60  <Method void Parcel.writeNoException()>
				return true;
		//  153  443:iconst_1        
		//  154  444:ireturn         

			case 8: // '\b'
				parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
		//  155  445:aload_2         
		//  156  446:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi">
		//  157  448:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//* 158  451:aload_2         
		//* 159  452:invokevirtual   #41  <Method int Parcel.readInt()>
		//* 160  455:ifeq            474
					parcel = ((Parcel) ((zzg)zzg.CREATOR.createFromParcel(parcel)));
		//  161  458:getstatic       #63  <Field android.os.Parcelable$Creator zzg.CREATOR>
		//  162  461:aload_2         
		//  163  462:invokeinterface #53  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  164  467:checkcast       #62  <Class zzg>
		//  165  470:astore_2        
				else
		//* 166  471:goto            476
					parcel = null;
		//  167  474:aconst_null     
		//  168  475:astore_2        
				zzb(((zzg) (parcel)));
		//  169  476:aload_0         
		//  170  477:aload_2         
		//  171  478:invokevirtual   #99  <Method void zzb(zzg)>
				parcel1.writeNoException();
		//  172  481:aload_3         
		//  173  482:invokevirtual   #60  <Method void Parcel.writeNoException()>
				return true;
		//  174  485:iconst_1        
		//  175  486:ireturn         

			case 9: // '\t'
				parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
		//  176  487:aload_2         
		//  177  488:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi">
		//  178  490:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//* 179  493:aload_2         
		//* 180  494:invokevirtual   #41  <Method int Parcel.readInt()>
		//* 181  497:ifeq            516
					parcel = ((Parcel) ((DataUpdateRequest)DataUpdateRequest.CREATOR.createFromParcel(parcel)));
		//  182  500:getstatic       #102 <Field android.os.Parcelable$Creator DataUpdateRequest.CREATOR>
		//  183  503:aload_2         
		//  184  504:invokeinterface #53  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  185  509:checkcast       #101 <Class DataUpdateRequest>
		//  186  512:astore_2        
				else
		//* 187  513:goto            518
					parcel = null;
		//  188  516:aconst_null     
		//  189  517:astore_2        
				zza(((DataUpdateRequest) (parcel)));
		//  190  518:aload_0         
		//  191  519:aload_2         
		//  192  520:invokevirtual   #105 <Method void zza(DataUpdateRequest)>
				parcel1.writeNoException();
		//  193  523:aload_3         
		//  194  524:invokevirtual   #60  <Method void Parcel.writeNoException()>
				return true;
		//  195  527:iconst_1        
		//  196  528:ireturn         

			case 10: // '\n'
				parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
		//  197  529:aload_2         
		//  198  530:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi">
		//  199  532:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//* 200  535:aload_2         
		//* 201  536:invokevirtual   #41  <Method int Parcel.readInt()>
		//* 202  539:ifeq            558
					parcel = ((Parcel) ((DataUpdateListenerRegistrationRequest)DataUpdateListenerRegistrationRequest.CREATOR.createFromParcel(parcel)));
		//  203  542:getstatic       #108 <Field android.os.Parcelable$Creator DataUpdateListenerRegistrationRequest.CREATOR>
		//  204  545:aload_2         
		//  205  546:invokeinterface #53  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  206  551:checkcast       #107 <Class DataUpdateListenerRegistrationRequest>
		//  207  554:astore_2        
				else
		//* 208  555:goto            560
					parcel = null;
		//  209  558:aconst_null     
		//  210  559:astore_2        
				zza(((DataUpdateListenerRegistrationRequest) (parcel)));
		//  211  560:aload_0         
		//  212  561:aload_2         
		//  213  562:invokevirtual   #111 <Method void zza(DataUpdateListenerRegistrationRequest)>
				parcel1.writeNoException();
		//  214  565:aload_3         
		//  215  566:invokevirtual   #60  <Method void Parcel.writeNoException()>
				return true;
		//  216  569:iconst_1        
		//  217  570:ireturn         

			case 11: // '\013'
				parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
		//  218  571:aload_2         
		//  219  572:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi">
		//  220  574:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//* 221  577:aload_2         
		//* 222  578:invokevirtual   #41  <Method int Parcel.readInt()>
		//* 223  581:ifeq            600
					parcel = ((Parcel) ((zzq)zzq.CREATOR.createFromParcel(parcel)));
		//  224  584:getstatic       #114 <Field android.os.Parcelable$Creator zzq.CREATOR>
		//  225  587:aload_2         
		//  226  588:invokeinterface #53  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  227  593:checkcast       #113 <Class zzq>
		//  228  596:astore_2        
				else
		//* 229  597:goto            602
					parcel = null;
		//  230  600:aconst_null     
		//  231  601:astore_2        
				zza(((zzq) (parcel)));
		//  232  602:aload_0         
		//  233  603:aload_2         
		//  234  604:invokevirtual   #117 <Method void zza(zzq)>
				parcel1.writeNoException();
		//  235  607:aload_3         
		//  236  608:invokevirtual   #60  <Method void Parcel.writeNoException()>
				return true;
		//  237  611:iconst_1        
		//  238  612:ireturn         

			case 12: // '\f'
				parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
		//  239  613:aload_2         
		//  240  614:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi">
		//  241  616:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//* 242  619:aload_2         
		//* 243  620:invokevirtual   #41  <Method int Parcel.readInt()>
		//* 244  623:ifeq            642
					parcel = ((Parcel) ((zzz)zzz.CREATOR.createFromParcel(parcel)));
		//  245  626:getstatic       #120 <Field android.os.Parcelable$Creator zzz.CREATOR>
		//  246  629:aload_2         
		//  247  630:invokeinterface #53  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  248  635:checkcast       #119 <Class zzz>
		//  249  638:astore_2        
				else
		//* 250  639:goto            644
					parcel = null;
		//  251  642:aconst_null     
		//  252  643:astore_2        
				zza(((zzz) (parcel)));
		//  253  644:aload_0         
		//  254  645:aload_2         
		//  255  646:invokevirtual   #123 <Method void zza(zzz)>
				parcel1.writeNoException();
		//  256  649:aload_3         
		//  257  650:invokevirtual   #60  <Method void Parcel.writeNoException()>
				return true;
		//  258  653:iconst_1        
		//  259  654:ireturn         

			case 13: // '\r'
				parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
		//  260  655:aload_2         
		//  261  656:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi">
		//  262  658:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//* 263  661:aload_2         
		//* 264  662:invokevirtual   #41  <Method int Parcel.readInt()>
		//* 265  665:ifeq            684
					parcel = ((Parcel) ((zzt)zzt.CREATOR.createFromParcel(parcel)));
		//  266  668:getstatic       #126 <Field android.os.Parcelable$Creator zzt.CREATOR>
		//  267  671:aload_2         
		//  268  672:invokeinterface #53  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  269  677:checkcast       #125 <Class zzt>
		//  270  680:astore_2        
				else
		//* 271  681:goto            686
					parcel = null;
		//  272  684:aconst_null     
		//  273  685:astore_2        
				zza(((zzt) (parcel)));
		//  274  686:aload_0         
		//  275  687:aload_2         
		//  276  688:invokevirtual   #129 <Method void zza(zzt)>
				parcel1.writeNoException();
		//  277  691:aload_3         
		//  278  692:invokevirtual   #60  <Method void Parcel.writeNoException()>
				return true;
		//  279  695:iconst_1        
		//  280  696:ireturn         

			case 14: // '\016'
				parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
		//  281  697:aload_2         
		//  282  698:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi">
		//  283  700:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//* 284  703:aload_2         
		//* 285  704:invokevirtual   #41  <Method int Parcel.readInt()>
		//* 286  707:ifeq            726
					parcel = ((Parcel) ((zzbs)zzbs.CREATOR.createFromParcel(parcel)));
		//  287  710:getstatic       #132 <Field android.os.Parcelable$Creator zzbs.CREATOR>
		//  288  713:aload_2         
		//  289  714:invokeinterface #53  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  290  719:checkcast       #131 <Class zzbs>
		//  291  722:astore_2        
				else
		//* 292  723:goto            728
					parcel = null;
		//  293  726:aconst_null     
		//  294  727:astore_2        
				zza(((zzbs) (parcel)));
		//  295  728:aload_0         
		//  296  729:aload_2         
		//  297  730:invokevirtual   #135 <Method void zza(zzbs)>
				parcel1.writeNoException();
		//  298  733:aload_3         
		//  299  734:invokevirtual   #60  <Method void Parcel.writeNoException()>
				return true;
		//  300  737:iconst_1        
		//  301  738:ireturn         

			case 15: // '\017'
				parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
		//  302  739:aload_2         
		//  303  740:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi">
		//  304  742:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//* 305  745:aload_2         
		//* 306  746:invokevirtual   #41  <Method int Parcel.readInt()>
		//* 307  749:ifeq            768
					parcel = ((Parcel) ((zzaf)zzaf.CREATOR.createFromParcel(parcel)));
		//  308  752:getstatic       #138 <Field android.os.Parcelable$Creator zzaf.CREATOR>
		//  309  755:aload_2         
		//  310  756:invokeinterface #53  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  311  761:checkcast       #137 <Class zzaf>
		//  312  764:astore_2        
				else
		//* 313  765:goto            770
					parcel = null;
		//  314  768:aconst_null     
		//  315  769:astore_2        
				zza(((zzaf) (parcel)));
		//  316  770:aload_0         
		//  317  771:aload_2         
		//  318  772:invokevirtual   #141 <Method void zza(zzaf)>
				parcel1.writeNoException();
		//  319  775:aload_3         
		//  320  776:invokevirtual   #60  <Method void Parcel.writeNoException()>
				return true;
		//  321  779:iconst_1        
		//  322  780:ireturn         
			}
			return super.onTransact(i, parcel, parcel1, j);
		//  323  781:aload_0         
		//  324  782:iload_1         
		//  325  783:aload_2         
		//  326  784:aload_3         
		//  327  785:iload           4
		//  328  787:invokespecial   #143 <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//  329  790:ireturn         
		}
	}

	static class zza.zza
		implements zzaov
	{

		public IBinder asBinder()
		{
			return zzrk;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zzrk>
		//    2    4:areturn         
		}

		public void zza(DataDeleteRequest datadeleterequest)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(datadeleterequest == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			datadeleterequest.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #46  <Method void DataDeleteRequest.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzrk.transact(3, parcel, parcel1, 0);
		//   20   37:aload_0         
		//   21   38:getfield        #18  <Field IBinder zzrk>
		//   22   41:iconst_3        
		//   23   42:aload_2         
		//   24   43:aload_3         
		//   25   44:iconst_0        
		//   26   45:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   27   50:pop             
			parcel1.readException();
		//   28   51:aload_3         
		//   29   52:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   30   55:aload_3         
		//   31   56:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   32   59:aload_2         
		//   33   60:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   34   63:return          
			datadeleterequest;
		//   35   64:astore_1        
			parcel1.recycle();
		//   36   65:aload_3         
		//   37   66:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   69:aload_2         
		//   39   70:invokevirtual   #58  <Method void Parcel.recycle()>
			throw datadeleterequest;
		//   40   73:aload_1         
		//   41   74:athrow          
		}

		public void zza(DataReadRequest datareadrequest)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(datareadrequest == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			datareadrequest.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #63  <Method void DataReadRequest.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzrk.transact(1, parcel, parcel1, 0);
		//   20   37:aload_0         
		//   21   38:getfield        #18  <Field IBinder zzrk>
		//   22   41:iconst_1        
		//   23   42:aload_2         
		//   24   43:aload_3         
		//   25   44:iconst_0        
		//   26   45:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   27   50:pop             
			parcel1.readException();
		//   28   51:aload_3         
		//   29   52:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   30   55:aload_3         
		//   31   56:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   32   59:aload_2         
		//   33   60:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   34   63:return          
			datareadrequest;
		//   35   64:astore_1        
			parcel1.recycle();
		//   36   65:aload_3         
		//   37   66:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   69:aload_2         
		//   39   70:invokevirtual   #58  <Method void Parcel.recycle()>
			throw datareadrequest;
		//   40   73:aload_1         
		//   41   74:athrow          
		}

		public void zza(DataUpdateListenerRegistrationRequest dataupdatelistenerregistrationrequest)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(dataupdatelistenerregistrationrequest == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			dataupdatelistenerregistrationrequest.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #67  <Method void DataUpdateListenerRegistrationRequest.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzrk.transact(10, parcel, parcel1, 0);
		//   20   37:aload_0         
		//   21   38:getfield        #18  <Field IBinder zzrk>
		//   22   41:bipush          10
		//   23   43:aload_2         
		//   24   44:aload_3         
		//   25   45:iconst_0        
		//   26   46:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   27   51:pop             
			parcel1.readException();
		//   28   52:aload_3         
		//   29   53:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   30   56:aload_3         
		//   31   57:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   32   60:aload_2         
		//   33   61:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   34   64:return          
			dataupdatelistenerregistrationrequest;
		//   35   65:astore_1        
			parcel1.recycle();
		//   36   66:aload_3         
		//   37   67:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   70:aload_2         
		//   39   71:invokevirtual   #58  <Method void Parcel.recycle()>
			throw dataupdatelistenerregistrationrequest;
		//   40   74:aload_1         
		//   41   75:athrow          
		}

		public void zza(DataUpdateRequest dataupdaterequest)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(dataupdaterequest == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			dataupdaterequest.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #71  <Method void DataUpdateRequest.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzrk.transact(9, parcel, parcel1, 0);
		//   20   37:aload_0         
		//   21   38:getfield        #18  <Field IBinder zzrk>
		//   22   41:bipush          9
		//   23   43:aload_2         
		//   24   44:aload_3         
		//   25   45:iconst_0        
		//   26   46:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   27   51:pop             
			parcel1.readException();
		//   28   52:aload_3         
		//   29   53:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   30   56:aload_3         
		//   31   57:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   32   60:aload_2         
		//   33   61:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   34   64:return          
			dataupdaterequest;
		//   35   65:astore_1        
			parcel1.recycle();
		//   36   66:aload_3         
		//   37   67:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   70:aload_2         
		//   39   71:invokevirtual   #58  <Method void Parcel.recycle()>
			throw dataupdaterequest;
		//   40   74:aload_1         
		//   41   75:athrow          
		}

		public void zza(zzad zzad1)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(zzad1 == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzad1.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #75  <Method void zzad.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzrk.transact(4, parcel, parcel1, 0);
		//   20   37:aload_0         
		//   21   38:getfield        #18  <Field IBinder zzrk>
		//   22   41:iconst_4        
		//   23   42:aload_2         
		//   24   43:aload_3         
		//   25   44:iconst_0        
		//   26   45:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   27   50:pop             
			parcel1.readException();
		//   28   51:aload_3         
		//   29   52:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   30   55:aload_3         
		//   31   56:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   32   59:aload_2         
		//   33   60:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   34   63:return          
			zzad1;
		//   35   64:astore_1        
			parcel1.recycle();
		//   36   65:aload_3         
		//   37   66:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   69:aload_2         
		//   39   70:invokevirtual   #58  <Method void Parcel.recycle()>
			throw zzad1;
		//   40   73:aload_1         
		//   41   74:athrow          
		}

		public void zza(zzaf zzaf1)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(zzaf1 == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzaf1.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #79  <Method void zzaf.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzrk.transact(15, parcel, parcel1, 0);
		//   20   37:aload_0         
		//   21   38:getfield        #18  <Field IBinder zzrk>
		//   22   41:bipush          15
		//   23   43:aload_2         
		//   24   44:aload_3         
		//   25   45:iconst_0        
		//   26   46:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   27   51:pop             
			parcel1.readException();
		//   28   52:aload_3         
		//   29   53:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   30   56:aload_3         
		//   31   57:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   32   60:aload_2         
		//   33   61:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   34   64:return          
			zzaf1;
		//   35   65:astore_1        
			parcel1.recycle();
		//   36   66:aload_3         
		//   37   67:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   70:aload_2         
		//   39   71:invokevirtual   #58  <Method void Parcel.recycle()>
			throw zzaf1;
		//   40   74:aload_1         
		//   41   75:athrow          
		}

		public void zza(zzar zzar1)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(zzar1 == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzar1.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #83  <Method void zzar.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzrk.transact(6, parcel, parcel1, 0);
		//   20   37:aload_0         
		//   21   38:getfield        #18  <Field IBinder zzrk>
		//   22   41:bipush          6
		//   23   43:aload_2         
		//   24   44:aload_3         
		//   25   45:iconst_0        
		//   26   46:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   27   51:pop             
			parcel1.readException();
		//   28   52:aload_3         
		//   29   53:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   30   56:aload_3         
		//   31   57:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   32   60:aload_2         
		//   33   61:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   34   64:return          
			zzar1;
		//   35   65:astore_1        
			parcel1.recycle();
		//   36   66:aload_3         
		//   37   67:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   70:aload_2         
		//   39   71:invokevirtual   #58  <Method void Parcel.recycle()>
			throw zzar1;
		//   40   74:aload_1         
		//   41   75:athrow          
		}

		public void zza(zzat zzat1)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(zzat1 == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzat1.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #87  <Method void zzat.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzrk.transact(5, parcel, parcel1, 0);
		//   20   37:aload_0         
		//   21   38:getfield        #18  <Field IBinder zzrk>
		//   22   41:iconst_5        
		//   23   42:aload_2         
		//   24   43:aload_3         
		//   25   44:iconst_0        
		//   26   45:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   27   50:pop             
			parcel1.readException();
		//   28   51:aload_3         
		//   29   52:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   30   55:aload_3         
		//   31   56:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   32   59:aload_2         
		//   33   60:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   34   63:return          
			zzat1;
		//   35   64:astore_1        
			parcel1.recycle();
		//   36   65:aload_3         
		//   37   66:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   69:aload_2         
		//   39   70:invokevirtual   #58  <Method void Parcel.recycle()>
			throw zzat1;
		//   40   73:aload_1         
		//   41   74:athrow          
		}

		public void zza(zzbs zzbs1)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(zzbs1 == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzbs1.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #91  <Method void zzbs.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzrk.transact(14, parcel, parcel1, 0);
		//   20   37:aload_0         
		//   21   38:getfield        #18  <Field IBinder zzrk>
		//   22   41:bipush          14
		//   23   43:aload_2         
		//   24   44:aload_3         
		//   25   45:iconst_0        
		//   26   46:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   27   51:pop             
			parcel1.readException();
		//   28   52:aload_3         
		//   29   53:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   30   56:aload_3         
		//   31   57:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   32   60:aload_2         
		//   33   61:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   34   64:return          
			zzbs1;
		//   35   65:astore_1        
			parcel1.recycle();
		//   36   66:aload_3         
		//   37   67:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   70:aload_2         
		//   39   71:invokevirtual   #58  <Method void Parcel.recycle()>
			throw zzbs1;
		//   40   74:aload_1         
		//   41   75:athrow          
		}

		public void zza(zzd zzd1)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(zzd1 == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzd1.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #95  <Method void zzd.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzrk.transact(7, parcel, parcel1, 0);
		//   20   37:aload_0         
		//   21   38:getfield        #18  <Field IBinder zzrk>
		//   22   41:bipush          7
		//   23   43:aload_2         
		//   24   44:aload_3         
		//   25   45:iconst_0        
		//   26   46:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   27   51:pop             
			parcel1.readException();
		//   28   52:aload_3         
		//   29   53:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   30   56:aload_3         
		//   31   57:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   32   60:aload_2         
		//   33   61:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   34   64:return          
			zzd1;
		//   35   65:astore_1        
			parcel1.recycle();
		//   36   66:aload_3         
		//   37   67:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   70:aload_2         
		//   39   71:invokevirtual   #58  <Method void Parcel.recycle()>
			throw zzd1;
		//   40   74:aload_1         
		//   41   75:athrow          
		}

		public void zza(zzg zzg1)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(zzg1 == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzg1.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #99  <Method void zzg.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzrk.transact(2, parcel, parcel1, 0);
		//   20   37:aload_0         
		//   21   38:getfield        #18  <Field IBinder zzrk>
		//   22   41:iconst_2        
		//   23   42:aload_2         
		//   24   43:aload_3         
		//   25   44:iconst_0        
		//   26   45:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   27   50:pop             
			parcel1.readException();
		//   28   51:aload_3         
		//   29   52:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   30   55:aload_3         
		//   31   56:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   32   59:aload_2         
		//   33   60:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   34   63:return          
			zzg1;
		//   35   64:astore_1        
			parcel1.recycle();
		//   36   65:aload_3         
		//   37   66:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   69:aload_2         
		//   39   70:invokevirtual   #58  <Method void Parcel.recycle()>
			throw zzg1;
		//   40   73:aload_1         
		//   41   74:athrow          
		}

		public void zza(zzq zzq1)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(zzq1 == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzq1.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #103 <Method void zzq.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzrk.transact(11, parcel, parcel1, 0);
		//   20   37:aload_0         
		//   21   38:getfield        #18  <Field IBinder zzrk>
		//   22   41:bipush          11
		//   23   43:aload_2         
		//   24   44:aload_3         
		//   25   45:iconst_0        
		//   26   46:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   27   51:pop             
			parcel1.readException();
		//   28   52:aload_3         
		//   29   53:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   30   56:aload_3         
		//   31   57:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   32   60:aload_2         
		//   33   61:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   34   64:return          
			zzq1;
		//   35   65:astore_1        
			parcel1.recycle();
		//   36   66:aload_3         
		//   37   67:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   70:aload_2         
		//   39   71:invokevirtual   #58  <Method void Parcel.recycle()>
			throw zzq1;
		//   40   74:aload_1         
		//   41   75:athrow          
		}

		public void zza(zzt zzt1)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(zzt1 == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzt1.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #107 <Method void zzt.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzrk.transact(13, parcel, parcel1, 0);
		//   20   37:aload_0         
		//   21   38:getfield        #18  <Field IBinder zzrk>
		//   22   41:bipush          13
		//   23   43:aload_2         
		//   24   44:aload_3         
		//   25   45:iconst_0        
		//   26   46:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   27   51:pop             
			parcel1.readException();
		//   28   52:aload_3         
		//   29   53:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   30   56:aload_3         
		//   31   57:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   32   60:aload_2         
		//   33   61:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   34   64:return          
			zzt1;
		//   35   65:astore_1        
			parcel1.recycle();
		//   36   66:aload_3         
		//   37   67:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   70:aload_2         
		//   39   71:invokevirtual   #58  <Method void Parcel.recycle()>
			throw zzt1;
		//   40   74:aload_1         
		//   41   75:athrow          
		}

		public void zza(zzz zzz1)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(zzz1 == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzz1.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #111 <Method void zzz.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzrk.transact(12, parcel, parcel1, 0);
		//   20   37:aload_0         
		//   21   38:getfield        #18  <Field IBinder zzrk>
		//   22   41:bipush          12
		//   23   43:aload_2         
		//   24   44:aload_3         
		//   25   45:iconst_0        
		//   26   46:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   27   51:pop             
			parcel1.readException();
		//   28   52:aload_3         
		//   29   53:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   30   56:aload_3         
		//   31   57:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   32   60:aload_2         
		//   33   61:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   34   64:return          
			zzz1;
		//   35   65:astore_1        
			parcel1.recycle();
		//   36   66:aload_3         
		//   37   67:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   70:aload_2         
		//   39   71:invokevirtual   #58  <Method void Parcel.recycle()>
			throw zzz1;
		//   40   74:aload_1         
		//   41   75:athrow          
		}

		public void zzb(zzg zzg1)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(zzg1 == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzg1.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #99  <Method void zzg.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzrk.transact(8, parcel, parcel1, 0);
		//   20   37:aload_0         
		//   21   38:getfield        #18  <Field IBinder zzrk>
		//   22   41:bipush          8
		//   23   43:aload_2         
		//   24   44:aload_3         
		//   25   45:iconst_0        
		//   26   46:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   27   51:pop             
			parcel1.readException();
		//   28   52:aload_3         
		//   29   53:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   30   56:aload_3         
		//   31   57:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   32   60:aload_2         
		//   33   61:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   34   64:return          
			zzg1;
		//   35   65:astore_1        
			parcel1.recycle();
		//   36   66:aload_3         
		//   37   67:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   70:aload_2         
		//   39   71:invokevirtual   #58  <Method void Parcel.recycle()>
			throw zzg1;
		//   40   74:aload_1         
		//   41   75:athrow          
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


	public abstract void zza(DataDeleteRequest datadeleterequest)
		throws RemoteException;

	public abstract void zza(DataReadRequest datareadrequest)
		throws RemoteException;

	public abstract void zza(DataUpdateListenerRegistrationRequest dataupdatelistenerregistrationrequest)
		throws RemoteException;

	public abstract void zza(DataUpdateRequest dataupdaterequest)
		throws RemoteException;

	public abstract void zza(zzad zzad)
		throws RemoteException;

	public abstract void zza(zzaf zzaf)
		throws RemoteException;

	public abstract void zza(zzar zzar)
		throws RemoteException;

	public abstract void zza(zzat zzat)
		throws RemoteException;

	public abstract void zza(zzbs zzbs)
		throws RemoteException;

	public abstract void zza(zzd zzd)
		throws RemoteException;

	public abstract void zza(zzg zzg)
		throws RemoteException;

	public abstract void zza(zzq zzq)
		throws RemoteException;

	public abstract void zza(zzt zzt)
		throws RemoteException;

	public abstract void zza(zzz zzz)
		throws RemoteException;

	public abstract void zzb(zzg zzg)
		throws RemoteException;
}
