// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.GoogleMapOptions;

// Referenced classes of package com.google.android.gms.maps.internal:
//			IGoogleMapDelegate, zzt

public interface IMapFragmentDelegate
	extends IInterface
{
	public static abstract class zza extends Binder
		implements IMapFragmentDelegate
	{

		public static IMapFragmentDelegate zzdx(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
		//    4    6:aload_0         
		//    5    7:ldc1            #13  <String "com.google.android.gms.maps.internal.IMapFragmentDelegate">
		//    6    9:invokeinterface #19  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface != null && (iinterface instanceof IMapFragmentDelegate))
		//*   8   15:aload_1         
		//*   9   16:ifnull          31
		//*  10   19:aload_1         
		//*  11   20:instanceof      #6   <Class IMapFragmentDelegate>
		//*  12   23:ifeq            31
				return (IMapFragmentDelegate)iinterface;
		//   13   26:aload_1         
		//   14   27:checkcast       #6   <Class IMapFragmentDelegate>
		//   15   30:areturn         
			else
				return ((IMapFragmentDelegate) (new zza(ibinder)));
		//   16   31:new             #9   <Class IMapFragmentDelegate$zza$zza>
		//   17   34:dup             
		//   18   35:aload_0         
		//   19   36:invokespecial   #23  <Method void IMapFragmentDelegate$zza$zza(IBinder)>
		//   20   39:areturn         
		}

		public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
			throws RemoteException
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:lookupswitch    17: default 148
		//		               1: 159
		//		               2: 197
		//		               3: 279
		//		               4: 321
		//		               5: 407
		//		               6: 423
		//		               7: 439
		//		               8: 455
		//		               9: 471
		//		               10: 487
		//		               11: 552
		//		               12: 587
		//		               13: 610
		//		               14: 652
		//		               15: 668
		//		               16: 684
		//		               1598968902: 151
		//*   2  148:goto            700
			case 1598968902: 
				parcel1.writeString("com.google.android.gms.maps.internal.IMapFragmentDelegate");
		//    3  151:aload_3         
		//    4  152:ldc1            #13  <String "com.google.android.gms.maps.internal.IMapFragmentDelegate">
		//    5  154:invokevirtual   #34  <Method void Parcel.writeString(String)>
				return true;
		//    6  157:iconst_1        
		//    7  158:ireturn         

			case 1: // '\001'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
		//    8  159:aload_2         
		//    9  160:ldc1            #13  <String "com.google.android.gms.maps.internal.IMapFragmentDelegate">
		//   10  162:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getMap()));
		//   11  165:aload_0         
		//   12  166:invokevirtual   #41  <Method IGoogleMapDelegate getMap()>
		//   13  169:astore_2        
				parcel1.writeNoException();
		//   14  170:aload_3         
		//   15  171:invokevirtual   #45  <Method void Parcel.writeNoException()>
				if(parcel != null)
		//*  16  174:aload_2         
		//*  17  175:ifnull          188
					parcel = ((Parcel) (((IGoogleMapDelegate) (parcel)).asBinder()));
		//   18  178:aload_2         
		//   19  179:invokeinterface #51  <Method IBinder IGoogleMapDelegate.asBinder()>
		//   20  184:astore_2        
				else
		//*  21  185:goto            190
					parcel = null;
		//   22  188:aconst_null     
		//   23  189:astore_2        
				parcel1.writeStrongBinder(((IBinder) (parcel)));
		//   24  190:aload_3         
		//   25  191:aload_2         
		//   26  192:invokevirtual   #54  <Method void Parcel.writeStrongBinder(IBinder)>
				return true;
		//   27  195:iconst_1        
		//   28  196:ireturn         

			case 2: // '\002'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
		//   29  197:aload_2         
		//   30  198:ldc1            #13  <String "com.google.android.gms.maps.internal.IMapFragmentDelegate">
		//   31  200:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				IObjectWrapper iobjectwrapper1 = com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel.readStrongBinder());
		//   32  203:aload_2         
		//   33  204:invokevirtual   #57  <Method IBinder Parcel.readStrongBinder()>
		//   34  207:invokestatic    #63  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
		//   35  210:astore          7
				GoogleMapOptions googlemapoptions;
				if(parcel.readInt() != 0)
		//*  36  212:aload_2         
		//*  37  213:invokevirtual   #67  <Method int Parcel.readInt()>
		//*  38  216:ifeq            236
					googlemapoptions = (GoogleMapOptions)GoogleMapOptions.CREATOR.createFromParcel(parcel);
		//   39  219:getstatic       #73  <Field android.os.Parcelable$Creator GoogleMapOptions.CREATOR>
		//   40  222:aload_2         
		//   41  223:invokeinterface #79  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   42  228:checkcast       #69  <Class GoogleMapOptions>
		//   43  231:astore          6
				else
		//*  44  233:goto            239
					googlemapoptions = null;
		//   45  236:aconst_null     
		//   46  237:astore          6
				if(parcel.readInt() != 0)
		//*  47  239:aload_2         
		//*  48  240:invokevirtual   #67  <Method int Parcel.readInt()>
		//*  49  243:ifeq            262
					parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//   50  246:getstatic       #82  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//   51  249:aload_2         
		//   52  250:invokeinterface #79  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   53  255:checkcast       #81  <Class Bundle>
		//   54  258:astore_2        
				else
		//*  55  259:goto            264
					parcel = null;
		//   56  262:aconst_null     
		//   57  263:astore_2        
				onInflate(iobjectwrapper1, googlemapoptions, ((Bundle) (parcel)));
		//   58  264:aload_0         
		//   59  265:aload           7
		//   60  267:aload           6
		//   61  269:aload_2         
		//   62  270:invokevirtual   #86  <Method void onInflate(IObjectWrapper, GoogleMapOptions, Bundle)>
				parcel1.writeNoException();
		//   63  273:aload_3         
		//   64  274:invokevirtual   #45  <Method void Parcel.writeNoException()>
				return true;
		//   65  277:iconst_1        
		//   66  278:ireturn         

			case 3: // '\003'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
		//   67  279:aload_2         
		//   68  280:ldc1            #13  <String "com.google.android.gms.maps.internal.IMapFragmentDelegate">
		//   69  282:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//*  70  285:aload_2         
		//*  71  286:invokevirtual   #67  <Method int Parcel.readInt()>
		//*  72  289:ifeq            308
					parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//   73  292:getstatic       #82  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//   74  295:aload_2         
		//   75  296:invokeinterface #79  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   76  301:checkcast       #81  <Class Bundle>
		//   77  304:astore_2        
				else
		//*  78  305:goto            310
					parcel = null;
		//   79  308:aconst_null     
		//   80  309:astore_2        
				onCreate(((Bundle) (parcel)));
		//   81  310:aload_0         
		//   82  311:aload_2         
		//   83  312:invokevirtual   #90  <Method void onCreate(Bundle)>
				parcel1.writeNoException();
		//   84  315:aload_3         
		//   85  316:invokevirtual   #45  <Method void Parcel.writeNoException()>
				return true;
		//   86  319:iconst_1        
		//   87  320:ireturn         

			case 4: // '\004'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
		//   88  321:aload_2         
		//   89  322:ldc1            #13  <String "com.google.android.gms.maps.internal.IMapFragmentDelegate">
		//   90  324:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				IObjectWrapper iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel.readStrongBinder());
		//   91  327:aload_2         
		//   92  328:invokevirtual   #57  <Method IBinder Parcel.readStrongBinder()>
		//   93  331:invokestatic    #63  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
		//   94  334:astore          6
				IObjectWrapper iobjectwrapper2 = com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel.readStrongBinder());
		//   95  336:aload_2         
		//   96  337:invokevirtual   #57  <Method IBinder Parcel.readStrongBinder()>
		//   97  340:invokestatic    #63  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
		//   98  343:astore          7
				if(parcel.readInt() != 0)
		//*  99  345:aload_2         
		//* 100  346:invokevirtual   #67  <Method int Parcel.readInt()>
		//* 101  349:ifeq            368
					parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//  102  352:getstatic       #82  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//  103  355:aload_2         
		//  104  356:invokeinterface #79  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  105  361:checkcast       #81  <Class Bundle>
		//  106  364:astore_2        
				else
		//* 107  365:goto            370
					parcel = null;
		//  108  368:aconst_null     
		//  109  369:astore_2        
				parcel = ((Parcel) (onCreateView(iobjectwrapper, iobjectwrapper2, ((Bundle) (parcel)))));
		//  110  370:aload_0         
		//  111  371:aload           6
		//  112  373:aload           7
		//  113  375:aload_2         
		//  114  376:invokevirtual   #94  <Method IObjectWrapper onCreateView(IObjectWrapper, IObjectWrapper, Bundle)>
		//  115  379:astore_2        
				parcel1.writeNoException();
		//  116  380:aload_3         
		//  117  381:invokevirtual   #45  <Method void Parcel.writeNoException()>
				if(parcel != null)
		//* 118  384:aload_2         
		//* 119  385:ifnull          398
					parcel = ((Parcel) (((IObjectWrapper) (parcel)).asBinder()));
		//  120  388:aload_2         
		//  121  389:invokeinterface #97  <Method IBinder IObjectWrapper.asBinder()>
		//  122  394:astore_2        
				else
		//* 123  395:goto            400
					parcel = null;
		//  124  398:aconst_null     
		//  125  399:astore_2        
				parcel1.writeStrongBinder(((IBinder) (parcel)));
		//  126  400:aload_3         
		//  127  401:aload_2         
		//  128  402:invokevirtual   #54  <Method void Parcel.writeStrongBinder(IBinder)>
				return true;
		//  129  405:iconst_1        
		//  130  406:ireturn         

			case 5: // '\005'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
		//  131  407:aload_2         
		//  132  408:ldc1            #13  <String "com.google.android.gms.maps.internal.IMapFragmentDelegate">
		//  133  410:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				onResume();
		//  134  413:aload_0         
		//  135  414:invokevirtual   #100 <Method void onResume()>
				parcel1.writeNoException();
		//  136  417:aload_3         
		//  137  418:invokevirtual   #45  <Method void Parcel.writeNoException()>
				return true;
		//  138  421:iconst_1        
		//  139  422:ireturn         

			case 6: // '\006'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
		//  140  423:aload_2         
		//  141  424:ldc1            #13  <String "com.google.android.gms.maps.internal.IMapFragmentDelegate">
		//  142  426:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				onPause();
		//  143  429:aload_0         
		//  144  430:invokevirtual   #103 <Method void onPause()>
				parcel1.writeNoException();
		//  145  433:aload_3         
		//  146  434:invokevirtual   #45  <Method void Parcel.writeNoException()>
				return true;
		//  147  437:iconst_1        
		//  148  438:ireturn         

			case 7: // '\007'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
		//  149  439:aload_2         
		//  150  440:ldc1            #13  <String "com.google.android.gms.maps.internal.IMapFragmentDelegate">
		//  151  442:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				onDestroyView();
		//  152  445:aload_0         
		//  153  446:invokevirtual   #106 <Method void onDestroyView()>
				parcel1.writeNoException();
		//  154  449:aload_3         
		//  155  450:invokevirtual   #45  <Method void Parcel.writeNoException()>
				return true;
		//  156  453:iconst_1        
		//  157  454:ireturn         

			case 8: // '\b'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
		//  158  455:aload_2         
		//  159  456:ldc1            #13  <String "com.google.android.gms.maps.internal.IMapFragmentDelegate">
		//  160  458:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				onDestroy();
		//  161  461:aload_0         
		//  162  462:invokevirtual   #109 <Method void onDestroy()>
				parcel1.writeNoException();
		//  163  465:aload_3         
		//  164  466:invokevirtual   #45  <Method void Parcel.writeNoException()>
				return true;
		//  165  469:iconst_1        
		//  166  470:ireturn         

			case 9: // '\t'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
		//  167  471:aload_2         
		//  168  472:ldc1            #13  <String "com.google.android.gms.maps.internal.IMapFragmentDelegate">
		//  169  474:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				onLowMemory();
		//  170  477:aload_0         
		//  171  478:invokevirtual   #112 <Method void onLowMemory()>
				parcel1.writeNoException();
		//  172  481:aload_3         
		//  173  482:invokevirtual   #45  <Method void Parcel.writeNoException()>
				return true;
		//  174  485:iconst_1        
		//  175  486:ireturn         

			case 10: // '\n'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
		//  176  487:aload_2         
		//  177  488:ldc1            #13  <String "com.google.android.gms.maps.internal.IMapFragmentDelegate">
		//  178  490:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//* 179  493:aload_2         
		//* 180  494:invokevirtual   #67  <Method int Parcel.readInt()>
		//* 181  497:ifeq            516
					parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//  182  500:getstatic       #82  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//  183  503:aload_2         
		//  184  504:invokeinterface #79  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  185  509:checkcast       #81  <Class Bundle>
		//  186  512:astore_2        
				else
		//* 187  513:goto            518
					parcel = null;
		//  188  516:aconst_null     
		//  189  517:astore_2        
				onSaveInstanceState(((Bundle) (parcel)));
		//  190  518:aload_0         
		//  191  519:aload_2         
		//  192  520:invokevirtual   #115 <Method void onSaveInstanceState(Bundle)>
				parcel1.writeNoException();
		//  193  523:aload_3         
		//  194  524:invokevirtual   #45  <Method void Parcel.writeNoException()>
				if(parcel != null)
		//* 195  527:aload_2         
		//* 196  528:ifnull          545
				{
					parcel1.writeInt(1);
		//  197  531:aload_3         
		//  198  532:iconst_1        
		//  199  533:invokevirtual   #119 <Method void Parcel.writeInt(int)>
					((Bundle) (parcel)).writeToParcel(parcel1, 1);
		//  200  536:aload_2         
		//  201  537:aload_3         
		//  202  538:iconst_1        
		//  203  539:invokevirtual   #123 <Method void Bundle.writeToParcel(Parcel, int)>
				} else
		//* 204  542:goto            550
				{
					parcel1.writeInt(0);
		//  205  545:aload_3         
		//  206  546:iconst_0        
		//  207  547:invokevirtual   #119 <Method void Parcel.writeInt(int)>
				}
				return true;
		//  208  550:iconst_1        
		//  209  551:ireturn         

			case 11: // '\013'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
		//  210  552:aload_2         
		//  211  553:ldc1            #13  <String "com.google.android.gms.maps.internal.IMapFragmentDelegate">
		//  212  555:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				boolean flag = isReady();
		//  213  558:aload_0         
		//  214  559:invokevirtual   #127 <Method boolean isReady()>
		//  215  562:istore          5
				parcel1.writeNoException();
		//  216  564:aload_3         
		//  217  565:invokevirtual   #45  <Method void Parcel.writeNoException()>
				if(flag)
		//* 218  568:iload           5
		//* 219  570:ifeq            578
					i = 1;
		//  220  573:iconst_1        
		//  221  574:istore_1        
				else
		//* 222  575:goto            580
					i = 0;
		//  223  578:iconst_0        
		//  224  579:istore_1        
				parcel1.writeInt(i);
		//  225  580:aload_3         
		//  226  581:iload_1         
		//  227  582:invokevirtual   #119 <Method void Parcel.writeInt(int)>
				return true;
		//  228  585:iconst_1        
		//  229  586:ireturn         

			case 12: // '\f'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
		//  230  587:aload_2         
		//  231  588:ldc1            #13  <String "com.google.android.gms.maps.internal.IMapFragmentDelegate">
		//  232  590:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				getMapAsync(zzt.zza.zzdO(parcel.readStrongBinder()));
		//  233  593:aload_0         
		//  234  594:aload_2         
		//  235  595:invokevirtual   #57  <Method IBinder Parcel.readStrongBinder()>
		//  236  598:invokestatic    #133 <Method zzt zzt$zza.zzdO(IBinder)>
		//  237  601:invokevirtual   #137 <Method void getMapAsync(zzt)>
				parcel1.writeNoException();
		//  238  604:aload_3         
		//  239  605:invokevirtual   #45  <Method void Parcel.writeNoException()>
				return true;
		//  240  608:iconst_1        
		//  241  609:ireturn         

			case 13: // '\r'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
		//  242  610:aload_2         
		//  243  611:ldc1            #13  <String "com.google.android.gms.maps.internal.IMapFragmentDelegate">
		//  244  613:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//* 245  616:aload_2         
		//* 246  617:invokevirtual   #67  <Method int Parcel.readInt()>
		//* 247  620:ifeq            639
					parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//  248  623:getstatic       #82  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//  249  626:aload_2         
		//  250  627:invokeinterface #79  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  251  632:checkcast       #81  <Class Bundle>
		//  252  635:astore_2        
				else
		//* 253  636:goto            641
					parcel = null;
		//  254  639:aconst_null     
		//  255  640:astore_2        
				onEnterAmbient(((Bundle) (parcel)));
		//  256  641:aload_0         
		//  257  642:aload_2         
		//  258  643:invokevirtual   #140 <Method void onEnterAmbient(Bundle)>
				parcel1.writeNoException();
		//  259  646:aload_3         
		//  260  647:invokevirtual   #45  <Method void Parcel.writeNoException()>
				return true;
		//  261  650:iconst_1        
		//  262  651:ireturn         

			case 14: // '\016'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
		//  263  652:aload_2         
		//  264  653:ldc1            #13  <String "com.google.android.gms.maps.internal.IMapFragmentDelegate">
		//  265  655:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				onExitAmbient();
		//  266  658:aload_0         
		//  267  659:invokevirtual   #143 <Method void onExitAmbient()>
				parcel1.writeNoException();
		//  268  662:aload_3         
		//  269  663:invokevirtual   #45  <Method void Parcel.writeNoException()>
				return true;
		//  270  666:iconst_1        
		//  271  667:ireturn         

			case 15: // '\017'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
		//  272  668:aload_2         
		//  273  669:ldc1            #13  <String "com.google.android.gms.maps.internal.IMapFragmentDelegate">
		//  274  671:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				onStart();
		//  275  674:aload_0         
		//  276  675:invokevirtual   #146 <Method void onStart()>
				parcel1.writeNoException();
		//  277  678:aload_3         
		//  278  679:invokevirtual   #45  <Method void Parcel.writeNoException()>
				return true;
		//  279  682:iconst_1        
		//  280  683:ireturn         

			case 16: // '\020'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
		//  281  684:aload_2         
		//  282  685:ldc1            #13  <String "com.google.android.gms.maps.internal.IMapFragmentDelegate">
		//  283  687:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				onStop();
		//  284  690:aload_0         
		//  285  691:invokevirtual   #149 <Method void onStop()>
				parcel1.writeNoException();
		//  286  694:aload_3         
		//  287  695:invokevirtual   #45  <Method void Parcel.writeNoException()>
				return true;
		//  288  698:iconst_1        
		//  289  699:ireturn         
			}
			return super.onTransact(i, parcel, parcel1, j);
		//  290  700:aload_0         
		//  291  701:iload_1         
		//  292  702:aload_2         
		//  293  703:aload_3         
		//  294  704:iload           4
		//  295  706:invokespecial   #151 <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//  296  709:ireturn         
		}
	}

	static class zza.zza
		implements IMapFragmentDelegate
	{

		public IBinder asBinder()
		{
			return zzrk;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zzrk>
		//    2    4:areturn         
		}

		public IGoogleMapDelegate getMap()
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
			IGoogleMapDelegate igooglemapdelegate;
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IMapFragmentDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(1, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:iconst_1        
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   27:pop             
			parcel1.readException();
		//   15   28:aload_2         
		//   16   29:invokevirtual   #46  <Method void Parcel.readException()>
			igooglemapdelegate = IGoogleMapDelegate.zza.zzdu(parcel1.readStrongBinder());
		//   17   32:aload_2         
		//   18   33:invokevirtual   #49  <Method IBinder Parcel.readStrongBinder()>
		//   19   36:invokestatic    #55  <Method IGoogleMapDelegate IGoogleMapDelegate$zza.zzdu(IBinder)>
		//   20   39:astore_3        
			parcel1.recycle();
		//   21   40:aload_2         
		//   22   41:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   23   44:aload_1         
		//   24   45:invokevirtual   #58  <Method void Parcel.recycle()>
			return igooglemapdelegate;
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

		public void getMapAsync(zzt zzt1)
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IMapFragmentDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(zzt1 == null) goto _L2; else goto _L1
		//    7   14:aload_1         
		//    8   15:ifnull          72
_L1:
			zzt1 = ((zzt) (zzt1.asBinder()));
		//    9   18:aload_1         
		//   10   19:invokeinterface #65  <Method IBinder zzt.asBinder()>
		//   11   24:astore_1        
		//*  12   25:goto            28
_L4:
			parcel.writeStrongBinder(((IBinder) (zzt1)));
		//   13   28:aload_2         
		//   14   29:aload_1         
		//   15   30:invokevirtual   #68  <Method void Parcel.writeStrongBinder(IBinder)>
			zzrk.transact(12, parcel, parcel1, 0);
		//   16   33:aload_0         
		//   17   34:getfield        #18  <Field IBinder zzrk>
		//   18   37:bipush          12
		//   19   39:aload_2         
		//   20   40:aload_3         
		//   21   41:iconst_0        
		//   22   42:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   23   47:pop             
			parcel1.readException();
		//   24   48:aload_3         
		//   25   49:invokevirtual   #46  <Method void Parcel.readException()>
			parcel1.recycle();
		//   26   52:aload_3         
		//   27   53:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   56:aload_2         
		//   29   57:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   30   60:return          
			zzt1;
		//   31   61:astore_1        
			parcel1.recycle();
		//   32   62:aload_3         
		//   33   63:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   34   66:aload_2         
		//   35   67:invokevirtual   #58  <Method void Parcel.recycle()>
			throw zzt1;
		//   36   70:aload_1         
		//   37   71:athrow          
_L2:
			zzt1 = null;
		//   38   72:aconst_null     
		//   39   73:astore_1        
			if(true) goto _L4; else goto _L3
		//   40   74:goto            28
_L3:
		}

		public boolean isReady()
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
		//    4    9:aload_3         
		//    5   10:ldc1            #33  <String "com.google.android.gms.maps.internal.IMapFragmentDelegate">
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
		//   18   38:invokevirtual   #74  <Method int Parcel.readInt()>
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

		public void onCreate(Bundle bundle)
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IMapFragmentDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #80  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #86  <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #80  <Method void Parcel.writeInt(int)>
			zzrk.transact(3, parcel, parcel1, 0);
		//   20   37:aload_0         
		//   21   38:getfield        #18  <Field IBinder zzrk>
		//   22   41:iconst_3        
		//   23   42:aload_2         
		//   24   43:aload_3         
		//   25   44:iconst_0        
		//   26   45:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   27   50:pop             
			parcel1.readException();
		//   28   51:aload_3         
		//   29   52:invokevirtual   #46  <Method void Parcel.readException()>
			parcel1.recycle();
		//   30   55:aload_3         
		//   31   56:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   32   59:aload_2         
		//   33   60:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   34   63:return          
			bundle;
		//   35   64:astore_1        
			parcel1.recycle();
		//   36   65:aload_3         
		//   37   66:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   69:aload_2         
		//   39   70:invokevirtual   #58  <Method void Parcel.recycle()>
			throw bundle;
		//   40   73:aload_1         
		//   41   74:athrow          
		}

		public IObjectWrapper onCreateView(IObjectWrapper iobjectwrapper, IObjectWrapper iobjectwrapper1, Bundle bundle)
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
		//    4   10:aload           4
		//    5   12:ldc1            #33  <String "com.google.android.gms.maps.internal.IMapFragmentDelegate">
		//    6   14:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(iobjectwrapper == null) goto _L2; else goto _L1
		//    7   17:aload_1         
		//    8   18:ifnull          138
_L1:
			iobjectwrapper = ((IObjectWrapper) (iobjectwrapper.asBinder()));
		//    9   21:aload_1         
		//   10   22:invokeinterface #91  <Method IBinder IObjectWrapper.asBinder()>
		//   11   27:astore_1        
		//*  12   28:goto            31
_L3:
			parcel.writeStrongBinder(((IBinder) (iobjectwrapper)));
		//   13   31:aload           4
		//   14   33:aload_1         
		//   15   34:invokevirtual   #68  <Method void Parcel.writeStrongBinder(IBinder)>
			if(iobjectwrapper1 == null)
				break MISSING_BLOCK_LABEL_143;
		//   16   37:aload_2         
		//   17   38:ifnull          143
			iobjectwrapper = ((IObjectWrapper) (iobjectwrapper1.asBinder()));
		//   18   41:aload_2         
		//   19   42:invokeinterface #91  <Method IBinder IObjectWrapper.asBinder()>
		//   20   47:astore_1        
		//*  21   48:goto            51
_L4:
			parcel.writeStrongBinder(((IBinder) (iobjectwrapper)));
		//   22   51:aload           4
		//   23   53:aload_1         
		//   24   54:invokevirtual   #68  <Method void Parcel.writeStrongBinder(IBinder)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_77;
		//   25   57:aload_3         
		//   26   58:ifnull          77
			parcel.writeInt(1);
		//   27   61:aload           4
		//   28   63:iconst_1        
		//   29   64:invokevirtual   #80  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   30   67:aload_3         
		//   31   68:aload           4
		//   32   70:iconst_0        
		//   33   71:invokevirtual   #86  <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_83;
		//   34   74:goto            83
			parcel.writeInt(0);
		//   35   77:aload           4
		//   36   79:iconst_0        
		//   37   80:invokevirtual   #80  <Method void Parcel.writeInt(int)>
			zzrk.transact(4, parcel, parcel1, 0);
		//   38   83:aload_0         
		//   39   84:getfield        #18  <Field IBinder zzrk>
		//   40   87:iconst_4        
		//   41   88:aload           4
		//   42   90:aload           5
		//   43   92:iconst_0        
		//   44   93:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   45   98:pop             
			parcel1.readException();
		//   46   99:aload           5
		//   47  101:invokevirtual   #46  <Method void Parcel.readException()>
			iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder());
		//   48  104:aload           5
		//   49  106:invokevirtual   #49  <Method IBinder Parcel.readStrongBinder()>
		//   50  109:invokestatic    #97  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
		//   51  112:astore_1        
			parcel1.recycle();
		//   52  113:aload           5
		//   53  115:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   54  118:aload           4
		//   55  120:invokevirtual   #58  <Method void Parcel.recycle()>
			return iobjectwrapper;
		//   56  123:aload_1         
		//   57  124:areturn         
			iobjectwrapper;
		//   58  125:astore_1        
			parcel1.recycle();
		//   59  126:aload           5
		//   60  128:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   61  131:aload           4
		//   62  133:invokevirtual   #58  <Method void Parcel.recycle()>
			throw iobjectwrapper;
		//   63  136:aload_1         
		//   64  137:athrow          
_L2:
			iobjectwrapper = null;
		//   65  138:aconst_null     
		//   66  139:astore_1        
			  goto _L3
		//*  67  140:goto            31
			iobjectwrapper = null;
		//   68  143:aconst_null     
		//   69  144:astore_1        
			  goto _L4
		//*  70  145:goto            51
		}

		public void onDestroy()
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IMapFragmentDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(8, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:bipush          8
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_2         
		//   16   30:invokevirtual   #46  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   33:aload_2         
		//   18   34:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   37:aload_1         
		//   20   38:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   21   41:return          
			Exception exception;
			exception;
		//   22   42:astore_3        
			parcel1.recycle();
		//   23   43:aload_2         
		//   24   44:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   47:aload_1         
		//   26   48:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   27   51:aload_3         
		//   28   52:athrow          
		}

		public void onDestroyView()
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IMapFragmentDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(7, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:bipush          7
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_2         
		//   16   30:invokevirtual   #46  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   33:aload_2         
		//   18   34:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   37:aload_1         
		//   20   38:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   21   41:return          
			Exception exception;
			exception;
		//   22   42:astore_3        
			parcel1.recycle();
		//   23   43:aload_2         
		//   24   44:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   47:aload_1         
		//   26   48:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   27   51:aload_3         
		//   28   52:athrow          
		}

		public void onEnterAmbient(Bundle bundle)
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IMapFragmentDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #80  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #86  <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #80  <Method void Parcel.writeInt(int)>
			zzrk.transact(13, parcel, parcel1, 0);
		//   20   37:aload_0         
		//   21   38:getfield        #18  <Field IBinder zzrk>
		//   22   41:bipush          13
		//   23   43:aload_2         
		//   24   44:aload_3         
		//   25   45:iconst_0        
		//   26   46:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   27   51:pop             
			parcel1.readException();
		//   28   52:aload_3         
		//   29   53:invokevirtual   #46  <Method void Parcel.readException()>
			parcel1.recycle();
		//   30   56:aload_3         
		//   31   57:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   32   60:aload_2         
		//   33   61:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   34   64:return          
			bundle;
		//   35   65:astore_1        
			parcel1.recycle();
		//   36   66:aload_3         
		//   37   67:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   70:aload_2         
		//   39   71:invokevirtual   #58  <Method void Parcel.recycle()>
			throw bundle;
		//   40   74:aload_1         
		//   41   75:athrow          
		}

		public void onExitAmbient()
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IMapFragmentDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(14, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:bipush          14
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_2         
		//   16   30:invokevirtual   #46  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   33:aload_2         
		//   18   34:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   37:aload_1         
		//   20   38:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   21   41:return          
			Exception exception;
			exception;
		//   22   42:astore_3        
			parcel1.recycle();
		//   23   43:aload_2         
		//   24   44:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   47:aload_1         
		//   26   48:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   27   51:aload_3         
		//   28   52:athrow          
		}

		public void onInflate(IObjectWrapper iobjectwrapper, GoogleMapOptions googlemapoptions, Bundle bundle)
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
		//    4   10:aload           4
		//    5   12:ldc1            #33  <String "com.google.android.gms.maps.internal.IMapFragmentDelegate">
		//    6   14:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(iobjectwrapper == null) goto _L2; else goto _L1
		//    7   17:aload_1         
		//    8   18:ifnull          134
_L1:
			iobjectwrapper = ((IObjectWrapper) (iobjectwrapper.asBinder()));
		//    9   21:aload_1         
		//   10   22:invokeinterface #91  <Method IBinder IObjectWrapper.asBinder()>
		//   11   27:astore_1        
		//*  12   28:goto            31
_L4:
			parcel.writeStrongBinder(((IBinder) (iobjectwrapper)));
		//   13   31:aload           4
		//   14   33:aload_1         
		//   15   34:invokevirtual   #68  <Method void Parcel.writeStrongBinder(IBinder)>
			if(googlemapoptions == null)
				break MISSING_BLOCK_LABEL_57;
		//   16   37:aload_2         
		//   17   38:ifnull          57
			parcel.writeInt(1);
		//   18   41:aload           4
		//   19   43:iconst_1        
		//   20   44:invokevirtual   #80  <Method void Parcel.writeInt(int)>
			googlemapoptions.writeToParcel(parcel, 0);
		//   21   47:aload_2         
		//   22   48:aload           4
		//   23   50:iconst_0        
		//   24   51:invokevirtual   #106 <Method void GoogleMapOptions.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_63;
		//   25   54:goto            63
			parcel.writeInt(0);
		//   26   57:aload           4
		//   27   59:iconst_0        
		//   28   60:invokevirtual   #80  <Method void Parcel.writeInt(int)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_83;
		//   29   63:aload_3         
		//   30   64:ifnull          83
			parcel.writeInt(1);
		//   31   67:aload           4
		//   32   69:iconst_1        
		//   33   70:invokevirtual   #80  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   34   73:aload_3         
		//   35   74:aload           4
		//   36   76:iconst_0        
		//   37   77:invokevirtual   #86  <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_89;
		//   38   80:goto            89
			parcel.writeInt(0);
		//   39   83:aload           4
		//   40   85:iconst_0        
		//   41   86:invokevirtual   #80  <Method void Parcel.writeInt(int)>
			zzrk.transact(2, parcel, parcel1, 0);
		//   42   89:aload_0         
		//   43   90:getfield        #18  <Field IBinder zzrk>
		//   44   93:iconst_2        
		//   45   94:aload           4
		//   46   96:aload           5
		//   47   98:iconst_0        
		//   48   99:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   49  104:pop             
			parcel1.readException();
		//   50  105:aload           5
		//   51  107:invokevirtual   #46  <Method void Parcel.readException()>
			parcel1.recycle();
		//   52  110:aload           5
		//   53  112:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   54  115:aload           4
		//   55  117:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   56  120:return          
			iobjectwrapper;
		//   57  121:astore_1        
			parcel1.recycle();
		//   58  122:aload           5
		//   59  124:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   60  127:aload           4
		//   61  129:invokevirtual   #58  <Method void Parcel.recycle()>
			throw iobjectwrapper;
		//   62  132:aload_1         
		//   63  133:athrow          
_L2:
			iobjectwrapper = null;
		//   64  134:aconst_null     
		//   65  135:astore_1        
			if(true) goto _L4; else goto _L3
		//   66  136:goto            31
_L3:
		}

		public void onLowMemory()
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IMapFragmentDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(9, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:bipush          9
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_2         
		//   16   30:invokevirtual   #46  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   33:aload_2         
		//   18   34:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   37:aload_1         
		//   20   38:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   21   41:return          
			Exception exception;
			exception;
		//   22   42:astore_3        
			parcel1.recycle();
		//   23   43:aload_2         
		//   24   44:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   47:aload_1         
		//   26   48:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   27   51:aload_3         
		//   28   52:athrow          
		}

		public void onPause()
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IMapFragmentDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(6, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:bipush          6
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_2         
		//   16   30:invokevirtual   #46  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   33:aload_2         
		//   18   34:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   37:aload_1         
		//   20   38:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   21   41:return          
			Exception exception;
			exception;
		//   22   42:astore_3        
			parcel1.recycle();
		//   23   43:aload_2         
		//   24   44:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   47:aload_1         
		//   26   48:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   27   51:aload_3         
		//   28   52:athrow          
		}

		public void onResume()
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IMapFragmentDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(5, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:iconst_5        
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   27:pop             
			parcel1.readException();
		//   15   28:aload_2         
		//   16   29:invokevirtual   #46  <Method void Parcel.readException()>
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

		public void onSaveInstanceState(Bundle bundle)
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IMapFragmentDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #80  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #86  <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #80  <Method void Parcel.writeInt(int)>
			zzrk.transact(10, parcel, parcel1, 0);
		//   20   37:aload_0         
		//   21   38:getfield        #18  <Field IBinder zzrk>
		//   22   41:bipush          10
		//   23   43:aload_2         
		//   24   44:aload_3         
		//   25   45:iconst_0        
		//   26   46:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   27   51:pop             
			parcel1.readException();
		//   28   52:aload_3         
		//   29   53:invokevirtual   #46  <Method void Parcel.readException()>
			if(parcel1.readInt() != 0)
		//*  30   56:aload_3         
		//*  31   57:invokevirtual   #74  <Method int Parcel.readInt()>
		//*  32   60:ifeq            68
				bundle.readFromParcel(parcel1);
		//   33   63:aload_1         
		//   34   64:aload_3         
		//   35   65:invokevirtual   #114 <Method void Bundle.readFromParcel(Parcel)>
			parcel1.recycle();
		//   36   68:aload_3         
		//   37   69:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   72:aload_2         
		//   39   73:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   40   76:return          
			bundle;
		//   41   77:astore_1        
			parcel1.recycle();
		//   42   78:aload_3         
		//   43   79:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   44   82:aload_2         
		//   45   83:invokevirtual   #58  <Method void Parcel.recycle()>
			throw bundle;
		//   46   86:aload_1         
		//   47   87:athrow          
		}

		public void onStart()
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IMapFragmentDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(15, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:bipush          15
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_2         
		//   16   30:invokevirtual   #46  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   33:aload_2         
		//   18   34:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   37:aload_1         
		//   20   38:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   21   41:return          
			Exception exception;
			exception;
		//   22   42:astore_3        
			parcel1.recycle();
		//   23   43:aload_2         
		//   24   44:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   47:aload_1         
		//   26   48:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   27   51:aload_3         
		//   28   52:athrow          
		}

		public void onStop()
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IMapFragmentDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(16, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:bipush          16
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_2         
		//   16   30:invokevirtual   #46  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   33:aload_2         
		//   18   34:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   37:aload_1         
		//   20   38:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   21   41:return          
			Exception exception;
			exception;
		//   22   42:astore_3        
			parcel1.recycle();
		//   23   43:aload_2         
		//   24   44:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   47:aload_1         
		//   26   48:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   27   51:aload_3         
		//   28   52:athrow          
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


	public abstract IGoogleMapDelegate getMap()
		throws RemoteException;

	public abstract void getMapAsync(zzt zzt)
		throws RemoteException;

	public abstract boolean isReady()
		throws RemoteException;

	public abstract void onCreate(Bundle bundle)
		throws RemoteException;

	public abstract IObjectWrapper onCreateView(IObjectWrapper iobjectwrapper, IObjectWrapper iobjectwrapper1, Bundle bundle)
		throws RemoteException;

	public abstract void onDestroy()
		throws RemoteException;

	public abstract void onDestroyView()
		throws RemoteException;

	public abstract void onEnterAmbient(Bundle bundle)
		throws RemoteException;

	public abstract void onExitAmbient()
		throws RemoteException;

	public abstract void onInflate(IObjectWrapper iobjectwrapper, GoogleMapOptions googlemapoptions, Bundle bundle)
		throws RemoteException;

	public abstract void onLowMemory()
		throws RemoteException;

	public abstract void onPause()
		throws RemoteException;

	public abstract void onResume()
		throws RemoteException;

	public abstract void onSaveInstanceState(Bundle bundle)
		throws RemoteException;

	public abstract void onStart()
		throws RemoteException;

	public abstract void onStop()
		throws RemoteException;
}
