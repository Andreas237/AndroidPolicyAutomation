// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.*;

public interface ICameraUpdateFactoryDelegate
	extends IInterface
{
	public static abstract class zza extends Binder
		implements ICameraUpdateFactoryDelegate
	{

		public static ICameraUpdateFactoryDelegate zzdr(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
		//    4    6:aload_0         
		//    5    7:ldc1            #13  <String "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate">
		//    6    9:invokeinterface #19  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface != null && (iinterface instanceof ICameraUpdateFactoryDelegate))
		//*   8   15:aload_1         
		//*   9   16:ifnull          31
		//*  10   19:aload_1         
		//*  11   20:instanceof      #6   <Class ICameraUpdateFactoryDelegate>
		//*  12   23:ifeq            31
				return (ICameraUpdateFactoryDelegate)iinterface;
		//   13   26:aload_1         
		//   14   27:checkcast       #6   <Class ICameraUpdateFactoryDelegate>
		//   15   30:areturn         
			else
				return ((ICameraUpdateFactoryDelegate) (new zza(ibinder)));
		//   16   31:new             #9   <Class ICameraUpdateFactoryDelegate$zza$zza>
		//   17   34:dup             
		//   18   35:aload_0         
		//   19   36:invokespecial   #23  <Method void ICameraUpdateFactoryDelegate$zza$zza(IBinder)>
		//   20   39:areturn         
		}

		public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
			throws RemoteException
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:lookupswitch    12: default 108
		//		               1: 119
		//		               2: 157
		//		               3: 195
		//		               4: 241
		//		               5: 283
		//		               6: 325
		//		               7: 375
		//		               8: 439
		//		               9: 503
		//		               10: 574
		//		               11: 645
		//		               1598968902: 111
		//*   2  108:goto            724
			case 1598968902: 
				parcel1.writeString("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
		//    3  111:aload_3         
		//    4  112:ldc1            #13  <String "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate">
		//    5  114:invokevirtual   #34  <Method void Parcel.writeString(String)>
				return true;
		//    6  117:iconst_1        
		//    7  118:ireturn         

			case 1: // '\001'
				parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
		//    8  119:aload_2         
		//    9  120:ldc1            #13  <String "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate">
		//   10  122:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (zoomIn()));
		//   11  125:aload_0         
		//   12  126:invokevirtual   #41  <Method IObjectWrapper zoomIn()>
		//   13  129:astore_2        
				parcel1.writeNoException();
		//   14  130:aload_3         
		//   15  131:invokevirtual   #45  <Method void Parcel.writeNoException()>
				if(parcel != null)
		//*  16  134:aload_2         
		//*  17  135:ifnull          148
					parcel = ((Parcel) (((IObjectWrapper) (parcel)).asBinder()));
		//   18  138:aload_2         
		//   19  139:invokeinterface #51  <Method IBinder IObjectWrapper.asBinder()>
		//   20  144:astore_2        
				else
		//*  21  145:goto            150
					parcel = null;
		//   22  148:aconst_null     
		//   23  149:astore_2        
				parcel1.writeStrongBinder(((IBinder) (parcel)));
		//   24  150:aload_3         
		//   25  151:aload_2         
		//   26  152:invokevirtual   #54  <Method void Parcel.writeStrongBinder(IBinder)>
				return true;
		//   27  155:iconst_1        
		//   28  156:ireturn         

			case 2: // '\002'
				parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
		//   29  157:aload_2         
		//   30  158:ldc1            #13  <String "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate">
		//   31  160:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (zoomOut()));
		//   32  163:aload_0         
		//   33  164:invokevirtual   #57  <Method IObjectWrapper zoomOut()>
		//   34  167:astore_2        
				parcel1.writeNoException();
		//   35  168:aload_3         
		//   36  169:invokevirtual   #45  <Method void Parcel.writeNoException()>
				if(parcel != null)
		//*  37  172:aload_2         
		//*  38  173:ifnull          186
					parcel = ((Parcel) (((IObjectWrapper) (parcel)).asBinder()));
		//   39  176:aload_2         
		//   40  177:invokeinterface #51  <Method IBinder IObjectWrapper.asBinder()>
		//   41  182:astore_2        
				else
		//*  42  183:goto            188
					parcel = null;
		//   43  186:aconst_null     
		//   44  187:astore_2        
				parcel1.writeStrongBinder(((IBinder) (parcel)));
		//   45  188:aload_3         
		//   46  189:aload_2         
		//   47  190:invokevirtual   #54  <Method void Parcel.writeStrongBinder(IBinder)>
				return true;
		//   48  193:iconst_1        
		//   49  194:ireturn         

			case 3: // '\003'
				parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
		//   50  195:aload_2         
		//   51  196:ldc1            #13  <String "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate">
		//   52  198:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (scrollBy(parcel.readFloat(), parcel.readFloat())));
		//   53  201:aload_0         
		//   54  202:aload_2         
		//   55  203:invokevirtual   #61  <Method float Parcel.readFloat()>
		//   56  206:aload_2         
		//   57  207:invokevirtual   #61  <Method float Parcel.readFloat()>
		//   58  210:invokevirtual   #65  <Method IObjectWrapper scrollBy(float, float)>
		//   59  213:astore_2        
				parcel1.writeNoException();
		//   60  214:aload_3         
		//   61  215:invokevirtual   #45  <Method void Parcel.writeNoException()>
				if(parcel != null)
		//*  62  218:aload_2         
		//*  63  219:ifnull          232
					parcel = ((Parcel) (((IObjectWrapper) (parcel)).asBinder()));
		//   64  222:aload_2         
		//   65  223:invokeinterface #51  <Method IBinder IObjectWrapper.asBinder()>
		//   66  228:astore_2        
				else
		//*  67  229:goto            234
					parcel = null;
		//   68  232:aconst_null     
		//   69  233:astore_2        
				parcel1.writeStrongBinder(((IBinder) (parcel)));
		//   70  234:aload_3         
		//   71  235:aload_2         
		//   72  236:invokevirtual   #54  <Method void Parcel.writeStrongBinder(IBinder)>
				return true;
		//   73  239:iconst_1        
		//   74  240:ireturn         

			case 4: // '\004'
				parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
		//   75  241:aload_2         
		//   76  242:ldc1            #13  <String "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate">
		//   77  244:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (zoomTo(parcel.readFloat())));
		//   78  247:aload_0         
		//   79  248:aload_2         
		//   80  249:invokevirtual   #61  <Method float Parcel.readFloat()>
		//   81  252:invokevirtual   #69  <Method IObjectWrapper zoomTo(float)>
		//   82  255:astore_2        
				parcel1.writeNoException();
		//   83  256:aload_3         
		//   84  257:invokevirtual   #45  <Method void Parcel.writeNoException()>
				if(parcel != null)
		//*  85  260:aload_2         
		//*  86  261:ifnull          274
					parcel = ((Parcel) (((IObjectWrapper) (parcel)).asBinder()));
		//   87  264:aload_2         
		//   88  265:invokeinterface #51  <Method IBinder IObjectWrapper.asBinder()>
		//   89  270:astore_2        
				else
		//*  90  271:goto            276
					parcel = null;
		//   91  274:aconst_null     
		//   92  275:astore_2        
				parcel1.writeStrongBinder(((IBinder) (parcel)));
		//   93  276:aload_3         
		//   94  277:aload_2         
		//   95  278:invokevirtual   #54  <Method void Parcel.writeStrongBinder(IBinder)>
				return true;
		//   96  281:iconst_1        
		//   97  282:ireturn         

			case 5: // '\005'
				parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
		//   98  283:aload_2         
		//   99  284:ldc1            #13  <String "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate">
		//  100  286:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (zoomBy(parcel.readFloat())));
		//  101  289:aload_0         
		//  102  290:aload_2         
		//  103  291:invokevirtual   #61  <Method float Parcel.readFloat()>
		//  104  294:invokevirtual   #72  <Method IObjectWrapper zoomBy(float)>
		//  105  297:astore_2        
				parcel1.writeNoException();
		//  106  298:aload_3         
		//  107  299:invokevirtual   #45  <Method void Parcel.writeNoException()>
				if(parcel != null)
		//* 108  302:aload_2         
		//* 109  303:ifnull          316
					parcel = ((Parcel) (((IObjectWrapper) (parcel)).asBinder()));
		//  110  306:aload_2         
		//  111  307:invokeinterface #51  <Method IBinder IObjectWrapper.asBinder()>
		//  112  312:astore_2        
				else
		//* 113  313:goto            318
					parcel = null;
		//  114  316:aconst_null     
		//  115  317:astore_2        
				parcel1.writeStrongBinder(((IBinder) (parcel)));
		//  116  318:aload_3         
		//  117  319:aload_2         
		//  118  320:invokevirtual   #54  <Method void Parcel.writeStrongBinder(IBinder)>
				return true;
		//  119  323:iconst_1        
		//  120  324:ireturn         

			case 6: // '\006'
				parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
		//  121  325:aload_2         
		//  122  326:ldc1            #13  <String "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate">
		//  123  328:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (zoomByWithFocus(parcel.readFloat(), parcel.readInt(), parcel.readInt())));
		//  124  331:aload_0         
		//  125  332:aload_2         
		//  126  333:invokevirtual   #61  <Method float Parcel.readFloat()>
		//  127  336:aload_2         
		//  128  337:invokevirtual   #76  <Method int Parcel.readInt()>
		//  129  340:aload_2         
		//  130  341:invokevirtual   #76  <Method int Parcel.readInt()>
		//  131  344:invokevirtual   #80  <Method IObjectWrapper zoomByWithFocus(float, int, int)>
		//  132  347:astore_2        
				parcel1.writeNoException();
		//  133  348:aload_3         
		//  134  349:invokevirtual   #45  <Method void Parcel.writeNoException()>
				if(parcel != null)
		//* 135  352:aload_2         
		//* 136  353:ifnull          366
					parcel = ((Parcel) (((IObjectWrapper) (parcel)).asBinder()));
		//  137  356:aload_2         
		//  138  357:invokeinterface #51  <Method IBinder IObjectWrapper.asBinder()>
		//  139  362:astore_2        
				else
		//* 140  363:goto            368
					parcel = null;
		//  141  366:aconst_null     
		//  142  367:astore_2        
				parcel1.writeStrongBinder(((IBinder) (parcel)));
		//  143  368:aload_3         
		//  144  369:aload_2         
		//  145  370:invokevirtual   #54  <Method void Parcel.writeStrongBinder(IBinder)>
				return true;
		//  146  373:iconst_1        
		//  147  374:ireturn         

			case 7: // '\007'
				parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
		//  148  375:aload_2         
		//  149  376:ldc1            #13  <String "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate">
		//  150  378:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//* 151  381:aload_2         
		//* 152  382:invokevirtual   #76  <Method int Parcel.readInt()>
		//* 153  385:ifeq            404
					parcel = ((Parcel) ((CameraPosition)CameraPosition.CREATOR.createFromParcel(parcel)));
		//  154  388:getstatic       #86  <Field android.os.Parcelable$Creator CameraPosition.CREATOR>
		//  155  391:aload_2         
		//  156  392:invokeinterface #92  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  157  397:checkcast       #82  <Class CameraPosition>
		//  158  400:astore_2        
				else
		//* 159  401:goto            406
					parcel = null;
		//  160  404:aconst_null     
		//  161  405:astore_2        
				parcel = ((Parcel) (newCameraPosition(((CameraPosition) (parcel)))));
		//  162  406:aload_0         
		//  163  407:aload_2         
		//  164  408:invokevirtual   #96  <Method IObjectWrapper newCameraPosition(CameraPosition)>
		//  165  411:astore_2        
				parcel1.writeNoException();
		//  166  412:aload_3         
		//  167  413:invokevirtual   #45  <Method void Parcel.writeNoException()>
				if(parcel != null)
		//* 168  416:aload_2         
		//* 169  417:ifnull          430
					parcel = ((Parcel) (((IObjectWrapper) (parcel)).asBinder()));
		//  170  420:aload_2         
		//  171  421:invokeinterface #51  <Method IBinder IObjectWrapper.asBinder()>
		//  172  426:astore_2        
				else
		//* 173  427:goto            432
					parcel = null;
		//  174  430:aconst_null     
		//  175  431:astore_2        
				parcel1.writeStrongBinder(((IBinder) (parcel)));
		//  176  432:aload_3         
		//  177  433:aload_2         
		//  178  434:invokevirtual   #54  <Method void Parcel.writeStrongBinder(IBinder)>
				return true;
		//  179  437:iconst_1        
		//  180  438:ireturn         

			case 8: // '\b'
				parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
		//  181  439:aload_2         
		//  182  440:ldc1            #13  <String "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate">
		//  183  442:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//* 184  445:aload_2         
		//* 185  446:invokevirtual   #76  <Method int Parcel.readInt()>
		//* 186  449:ifeq            468
					parcel = ((Parcel) ((LatLng)LatLng.CREATOR.createFromParcel(parcel)));
		//  187  452:getstatic       #99  <Field android.os.Parcelable$Creator LatLng.CREATOR>
		//  188  455:aload_2         
		//  189  456:invokeinterface #92  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  190  461:checkcast       #98  <Class LatLng>
		//  191  464:astore_2        
				else
		//* 192  465:goto            470
					parcel = null;
		//  193  468:aconst_null     
		//  194  469:astore_2        
				parcel = ((Parcel) (newLatLng(((LatLng) (parcel)))));
		//  195  470:aload_0         
		//  196  471:aload_2         
		//  197  472:invokevirtual   #103 <Method IObjectWrapper newLatLng(LatLng)>
		//  198  475:astore_2        
				parcel1.writeNoException();
		//  199  476:aload_3         
		//  200  477:invokevirtual   #45  <Method void Parcel.writeNoException()>
				if(parcel != null)
		//* 201  480:aload_2         
		//* 202  481:ifnull          494
					parcel = ((Parcel) (((IObjectWrapper) (parcel)).asBinder()));
		//  203  484:aload_2         
		//  204  485:invokeinterface #51  <Method IBinder IObjectWrapper.asBinder()>
		//  205  490:astore_2        
				else
		//* 206  491:goto            496
					parcel = null;
		//  207  494:aconst_null     
		//  208  495:astore_2        
				parcel1.writeStrongBinder(((IBinder) (parcel)));
		//  209  496:aload_3         
		//  210  497:aload_2         
		//  211  498:invokevirtual   #54  <Method void Parcel.writeStrongBinder(IBinder)>
				return true;
		//  212  501:iconst_1        
		//  213  502:ireturn         

			case 9: // '\t'
				parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
		//  214  503:aload_2         
		//  215  504:ldc1            #13  <String "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate">
		//  216  506:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				LatLng latlng;
				if(parcel.readInt() != 0)
		//* 217  509:aload_2         
		//* 218  510:invokevirtual   #76  <Method int Parcel.readInt()>
		//* 219  513:ifeq            533
					latlng = (LatLng)LatLng.CREATOR.createFromParcel(parcel);
		//  220  516:getstatic       #99  <Field android.os.Parcelable$Creator LatLng.CREATOR>
		//  221  519:aload_2         
		//  222  520:invokeinterface #92  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  223  525:checkcast       #98  <Class LatLng>
		//  224  528:astore          5
				else
		//* 225  530:goto            536
					latlng = null;
		//  226  533:aconst_null     
		//  227  534:astore          5
				parcel = ((Parcel) (newLatLngZoom(latlng, parcel.readFloat())));
		//  228  536:aload_0         
		//  229  537:aload           5
		//  230  539:aload_2         
		//  231  540:invokevirtual   #61  <Method float Parcel.readFloat()>
		//  232  543:invokevirtual   #107 <Method IObjectWrapper newLatLngZoom(LatLng, float)>
		//  233  546:astore_2        
				parcel1.writeNoException();
		//  234  547:aload_3         
		//  235  548:invokevirtual   #45  <Method void Parcel.writeNoException()>
				if(parcel != null)
		//* 236  551:aload_2         
		//* 237  552:ifnull          565
					parcel = ((Parcel) (((IObjectWrapper) (parcel)).asBinder()));
		//  238  555:aload_2         
		//  239  556:invokeinterface #51  <Method IBinder IObjectWrapper.asBinder()>
		//  240  561:astore_2        
				else
		//* 241  562:goto            567
					parcel = null;
		//  242  565:aconst_null     
		//  243  566:astore_2        
				parcel1.writeStrongBinder(((IBinder) (parcel)));
		//  244  567:aload_3         
		//  245  568:aload_2         
		//  246  569:invokevirtual   #54  <Method void Parcel.writeStrongBinder(IBinder)>
				return true;
		//  247  572:iconst_1        
		//  248  573:ireturn         

			case 10: // '\n'
				parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
		//  249  574:aload_2         
		//  250  575:ldc1            #13  <String "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate">
		//  251  577:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				LatLngBounds latlngbounds;
				if(parcel.readInt() != 0)
		//* 252  580:aload_2         
		//* 253  581:invokevirtual   #76  <Method int Parcel.readInt()>
		//* 254  584:ifeq            604
					latlngbounds = (LatLngBounds)LatLngBounds.CREATOR.createFromParcel(parcel);
		//  255  587:getstatic       #110 <Field android.os.Parcelable$Creator LatLngBounds.CREATOR>
		//  256  590:aload_2         
		//  257  591:invokeinterface #92  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  258  596:checkcast       #109 <Class LatLngBounds>
		//  259  599:astore          5
				else
		//* 260  601:goto            607
					latlngbounds = null;
		//  261  604:aconst_null     
		//  262  605:astore          5
				parcel = ((Parcel) (newLatLngBounds(latlngbounds, parcel.readInt())));
		//  263  607:aload_0         
		//  264  608:aload           5
		//  265  610:aload_2         
		//  266  611:invokevirtual   #76  <Method int Parcel.readInt()>
		//  267  614:invokevirtual   #114 <Method IObjectWrapper newLatLngBounds(LatLngBounds, int)>
		//  268  617:astore_2        
				parcel1.writeNoException();
		//  269  618:aload_3         
		//  270  619:invokevirtual   #45  <Method void Parcel.writeNoException()>
				if(parcel != null)
		//* 271  622:aload_2         
		//* 272  623:ifnull          636
					parcel = ((Parcel) (((IObjectWrapper) (parcel)).asBinder()));
		//  273  626:aload_2         
		//  274  627:invokeinterface #51  <Method IBinder IObjectWrapper.asBinder()>
		//  275  632:astore_2        
				else
		//* 276  633:goto            638
					parcel = null;
		//  277  636:aconst_null     
		//  278  637:astore_2        
				parcel1.writeStrongBinder(((IBinder) (parcel)));
		//  279  638:aload_3         
		//  280  639:aload_2         
		//  281  640:invokevirtual   #54  <Method void Parcel.writeStrongBinder(IBinder)>
				return true;
		//  282  643:iconst_1        
		//  283  644:ireturn         

			case 11: // '\013'
				parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
		//  284  645:aload_2         
		//  285  646:ldc1            #13  <String "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate">
		//  286  648:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				LatLngBounds latlngbounds1;
				if(parcel.readInt() != 0)
		//* 287  651:aload_2         
		//* 288  652:invokevirtual   #76  <Method int Parcel.readInt()>
		//* 289  655:ifeq            675
					latlngbounds1 = (LatLngBounds)LatLngBounds.CREATOR.createFromParcel(parcel);
		//  290  658:getstatic       #110 <Field android.os.Parcelable$Creator LatLngBounds.CREATOR>
		//  291  661:aload_2         
		//  292  662:invokeinterface #92  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  293  667:checkcast       #109 <Class LatLngBounds>
		//  294  670:astore          5
				else
		//* 295  672:goto            678
					latlngbounds1 = null;
		//  296  675:aconst_null     
		//  297  676:astore          5
				parcel = ((Parcel) (newLatLngBoundsWithSize(latlngbounds1, parcel.readInt(), parcel.readInt(), parcel.readInt())));
		//  298  678:aload_0         
		//  299  679:aload           5
		//  300  681:aload_2         
		//  301  682:invokevirtual   #76  <Method int Parcel.readInt()>
		//  302  685:aload_2         
		//  303  686:invokevirtual   #76  <Method int Parcel.readInt()>
		//  304  689:aload_2         
		//  305  690:invokevirtual   #76  <Method int Parcel.readInt()>
		//  306  693:invokevirtual   #118 <Method IObjectWrapper newLatLngBoundsWithSize(LatLngBounds, int, int, int)>
		//  307  696:astore_2        
				parcel1.writeNoException();
		//  308  697:aload_3         
		//  309  698:invokevirtual   #45  <Method void Parcel.writeNoException()>
				if(parcel != null)
		//* 310  701:aload_2         
		//* 311  702:ifnull          715
					parcel = ((Parcel) (((IObjectWrapper) (parcel)).asBinder()));
		//  312  705:aload_2         
		//  313  706:invokeinterface #51  <Method IBinder IObjectWrapper.asBinder()>
		//  314  711:astore_2        
				else
		//* 315  712:goto            717
					parcel = null;
		//  316  715:aconst_null     
		//  317  716:astore_2        
				parcel1.writeStrongBinder(((IBinder) (parcel)));
		//  318  717:aload_3         
		//  319  718:aload_2         
		//  320  719:invokevirtual   #54  <Method void Parcel.writeStrongBinder(IBinder)>
				return true;
		//  321  722:iconst_1        
		//  322  723:ireturn         
			}
			return super.onTransact(i, parcel, parcel1, j);
		//  323  724:aload_0         
		//  324  725:iload_1         
		//  325  726:aload_2         
		//  326  727:aload_3         
		//  327  728:iload           4
		//  328  730:invokespecial   #120 <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//  329  733:ireturn         
		}
	}

	static class zza.zza
		implements ICameraUpdateFactoryDelegate
	{

		public IBinder asBinder()
		{
			return zzrk;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zzrk>
		//    2    4:areturn         
		}

		public IObjectWrapper newCameraPosition(CameraPosition cameraposition)
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(cameraposition == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #41  <Method void Parcel.writeInt(int)>
			cameraposition.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #47  <Method void CameraPosition.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #41  <Method void Parcel.writeInt(int)>
			zzrk.transact(7, parcel, parcel1, 0);
		//   20   37:aload_0         
		//   21   38:getfield        #18  <Field IBinder zzrk>
		//   22   41:bipush          7
		//   23   43:aload_2         
		//   24   44:aload_3         
		//   25   45:iconst_0        
		//   26   46:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   27   51:pop             
			parcel1.readException();
		//   28   52:aload_3         
		//   29   53:invokevirtual   #56  <Method void Parcel.readException()>
			cameraposition = ((CameraPosition) (com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder())));
		//   30   56:aload_3         
		//   31   57:invokevirtual   #59  <Method IBinder Parcel.readStrongBinder()>
		//   32   60:invokestatic    #65  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
		//   33   63:astore_1        
			parcel1.recycle();
		//   34   64:aload_3         
		//   35   65:invokevirtual   #68  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   68:aload_2         
		//   37   69:invokevirtual   #68  <Method void Parcel.recycle()>
			return ((IObjectWrapper) (cameraposition));
		//   38   72:aload_1         
		//   39   73:areturn         
			cameraposition;
		//   40   74:astore_1        
			parcel1.recycle();
		//   41   75:aload_3         
		//   42   76:invokevirtual   #68  <Method void Parcel.recycle()>
			parcel.recycle();
		//   43   79:aload_2         
		//   44   80:invokevirtual   #68  <Method void Parcel.recycle()>
			throw cameraposition;
		//   45   83:aload_1         
		//   46   84:athrow          
		}

		public IObjectWrapper newLatLng(LatLng latlng)
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(latlng == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #41  <Method void Parcel.writeInt(int)>
			latlng.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #74  <Method void LatLng.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #41  <Method void Parcel.writeInt(int)>
			zzrk.transact(8, parcel, parcel1, 0);
		//   20   37:aload_0         
		//   21   38:getfield        #18  <Field IBinder zzrk>
		//   22   41:bipush          8
		//   23   43:aload_2         
		//   24   44:aload_3         
		//   25   45:iconst_0        
		//   26   46:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   27   51:pop             
			parcel1.readException();
		//   28   52:aload_3         
		//   29   53:invokevirtual   #56  <Method void Parcel.readException()>
			latlng = ((LatLng) (com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder())));
		//   30   56:aload_3         
		//   31   57:invokevirtual   #59  <Method IBinder Parcel.readStrongBinder()>
		//   32   60:invokestatic    #65  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
		//   33   63:astore_1        
			parcel1.recycle();
		//   34   64:aload_3         
		//   35   65:invokevirtual   #68  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   68:aload_2         
		//   37   69:invokevirtual   #68  <Method void Parcel.recycle()>
			return ((IObjectWrapper) (latlng));
		//   38   72:aload_1         
		//   39   73:areturn         
			latlng;
		//   40   74:astore_1        
			parcel1.recycle();
		//   41   75:aload_3         
		//   42   76:invokevirtual   #68  <Method void Parcel.recycle()>
			parcel.recycle();
		//   43   79:aload_2         
		//   44   80:invokevirtual   #68  <Method void Parcel.recycle()>
			throw latlng;
		//   45   83:aload_1         
		//   46   84:athrow          
		}

		public IObjectWrapper newLatLngBounds(LatLngBounds latlngbounds, int i)
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
		//    4    9:aload_3         
		//    5   10:ldc1            #33  <String "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate">
		//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(latlngbounds == null)
				break MISSING_BLOCK_LABEL_33;
		//    7   15:aload_1         
		//    8   16:ifnull          33
			parcel.writeInt(1);
		//    9   19:aload_3         
		//   10   20:iconst_1        
		//   11   21:invokevirtual   #41  <Method void Parcel.writeInt(int)>
			latlngbounds.writeToParcel(parcel, 0);
		//   12   24:aload_1         
		//   13   25:aload_3         
		//   14   26:iconst_0        
		//   15   27:invokevirtual   #79  <Method void LatLngBounds.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_38;
		//   16   30:goto            38
			parcel.writeInt(0);
		//   17   33:aload_3         
		//   18   34:iconst_0        
		//   19   35:invokevirtual   #41  <Method void Parcel.writeInt(int)>
			parcel.writeInt(i);
		//   20   38:aload_3         
		//   21   39:iload_2         
		//   22   40:invokevirtual   #41  <Method void Parcel.writeInt(int)>
			zzrk.transact(10, parcel, parcel1, 0);
		//   23   43:aload_0         
		//   24   44:getfield        #18  <Field IBinder zzrk>
		//   25   47:bipush          10
		//   26   49:aload_3         
		//   27   50:aload           4
		//   28   52:iconst_0        
		//   29   53:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   30   58:pop             
			parcel1.readException();
		//   31   59:aload           4
		//   32   61:invokevirtual   #56  <Method void Parcel.readException()>
			latlngbounds = ((LatLngBounds) (com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder())));
		//   33   64:aload           4
		//   34   66:invokevirtual   #59  <Method IBinder Parcel.readStrongBinder()>
		//   35   69:invokestatic    #65  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
		//   36   72:astore_1        
			parcel1.recycle();
		//   37   73:aload           4
		//   38   75:invokevirtual   #68  <Method void Parcel.recycle()>
			parcel.recycle();
		//   39   78:aload_3         
		//   40   79:invokevirtual   #68  <Method void Parcel.recycle()>
			return ((IObjectWrapper) (latlngbounds));
		//   41   82:aload_1         
		//   42   83:areturn         
			latlngbounds;
		//   43   84:astore_1        
			parcel1.recycle();
		//   44   85:aload           4
		//   45   87:invokevirtual   #68  <Method void Parcel.recycle()>
			parcel.recycle();
		//   46   90:aload_3         
		//   47   91:invokevirtual   #68  <Method void Parcel.recycle()>
			throw latlngbounds;
		//   48   94:aload_1         
		//   49   95:athrow          
		}

		public IObjectWrapper newLatLngBoundsWithSize(LatLngBounds latlngbounds, int i, int j, int k)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore          5
			parcel1 = Parcel.obtain();
		//    2    5:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    8:astore          6
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
		//    4   10:aload           5
		//    5   12:ldc1            #33  <String "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate">
		//    6   14:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(latlngbounds == null)
				break MISSING_BLOCK_LABEL_37;
		//    7   17:aload_1         
		//    8   18:ifnull          37
			parcel.writeInt(1);
		//    9   21:aload           5
		//   10   23:iconst_1        
		//   11   24:invokevirtual   #41  <Method void Parcel.writeInt(int)>
			latlngbounds.writeToParcel(parcel, 0);
		//   12   27:aload_1         
		//   13   28:aload           5
		//   14   30:iconst_0        
		//   15   31:invokevirtual   #79  <Method void LatLngBounds.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_43;
		//   16   34:goto            43
			parcel.writeInt(0);
		//   17   37:aload           5
		//   18   39:iconst_0        
		//   19   40:invokevirtual   #41  <Method void Parcel.writeInt(int)>
			parcel.writeInt(i);
		//   20   43:aload           5
		//   21   45:iload_2         
		//   22   46:invokevirtual   #41  <Method void Parcel.writeInt(int)>
			parcel.writeInt(j);
		//   23   49:aload           5
		//   24   51:iload_3         
		//   25   52:invokevirtual   #41  <Method void Parcel.writeInt(int)>
			parcel.writeInt(k);
		//   26   55:aload           5
		//   27   57:iload           4
		//   28   59:invokevirtual   #41  <Method void Parcel.writeInt(int)>
			zzrk.transact(11, parcel, parcel1, 0);
		//   29   62:aload_0         
		//   30   63:getfield        #18  <Field IBinder zzrk>
		//   31   66:bipush          11
		//   32   68:aload           5
		//   33   70:aload           6
		//   34   72:iconst_0        
		//   35   73:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   36   78:pop             
			parcel1.readException();
		//   37   79:aload           6
		//   38   81:invokevirtual   #56  <Method void Parcel.readException()>
			latlngbounds = ((LatLngBounds) (com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder())));
		//   39   84:aload           6
		//   40   86:invokevirtual   #59  <Method IBinder Parcel.readStrongBinder()>
		//   41   89:invokestatic    #65  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
		//   42   92:astore_1        
			parcel1.recycle();
		//   43   93:aload           6
		//   44   95:invokevirtual   #68  <Method void Parcel.recycle()>
			parcel.recycle();
		//   45   98:aload           5
		//   46  100:invokevirtual   #68  <Method void Parcel.recycle()>
			return ((IObjectWrapper) (latlngbounds));
		//   47  103:aload_1         
		//   48  104:areturn         
			latlngbounds;
		//   49  105:astore_1        
			parcel1.recycle();
		//   50  106:aload           6
		//   51  108:invokevirtual   #68  <Method void Parcel.recycle()>
			parcel.recycle();
		//   52  111:aload           5
		//   53  113:invokevirtual   #68  <Method void Parcel.recycle()>
			throw latlngbounds;
		//   54  116:aload_1         
		//   55  117:athrow          
		}

		public IObjectWrapper newLatLngZoom(LatLng latlng, float f)
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
		//    4    9:aload_3         
		//    5   10:ldc1            #33  <String "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate">
		//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(latlng == null)
				break MISSING_BLOCK_LABEL_33;
		//    7   15:aload_1         
		//    8   16:ifnull          33
			parcel.writeInt(1);
		//    9   19:aload_3         
		//   10   20:iconst_1        
		//   11   21:invokevirtual   #41  <Method void Parcel.writeInt(int)>
			latlng.writeToParcel(parcel, 0);
		//   12   24:aload_1         
		//   13   25:aload_3         
		//   14   26:iconst_0        
		//   15   27:invokevirtual   #74  <Method void LatLng.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_38;
		//   16   30:goto            38
			parcel.writeInt(0);
		//   17   33:aload_3         
		//   18   34:iconst_0        
		//   19   35:invokevirtual   #41  <Method void Parcel.writeInt(int)>
			parcel.writeFloat(f);
		//   20   38:aload_3         
		//   21   39:fload_2         
		//   22   40:invokevirtual   #87  <Method void Parcel.writeFloat(float)>
			zzrk.transact(9, parcel, parcel1, 0);
		//   23   43:aload_0         
		//   24   44:getfield        #18  <Field IBinder zzrk>
		//   25   47:bipush          9
		//   26   49:aload_3         
		//   27   50:aload           4
		//   28   52:iconst_0        
		//   29   53:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   30   58:pop             
			parcel1.readException();
		//   31   59:aload           4
		//   32   61:invokevirtual   #56  <Method void Parcel.readException()>
			latlng = ((LatLng) (com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder())));
		//   33   64:aload           4
		//   34   66:invokevirtual   #59  <Method IBinder Parcel.readStrongBinder()>
		//   35   69:invokestatic    #65  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
		//   36   72:astore_1        
			parcel1.recycle();
		//   37   73:aload           4
		//   38   75:invokevirtual   #68  <Method void Parcel.recycle()>
			parcel.recycle();
		//   39   78:aload_3         
		//   40   79:invokevirtual   #68  <Method void Parcel.recycle()>
			return ((IObjectWrapper) (latlng));
		//   41   82:aload_1         
		//   42   83:areturn         
			latlng;
		//   43   84:astore_1        
			parcel1.recycle();
		//   44   85:aload           4
		//   45   87:invokevirtual   #68  <Method void Parcel.recycle()>
			parcel.recycle();
		//   46   90:aload_3         
		//   47   91:invokevirtual   #68  <Method void Parcel.recycle()>
			throw latlng;
		//   48   94:aload_1         
		//   49   95:athrow          
		}

		public IObjectWrapper scrollBy(float f, float f1)
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
			IObjectWrapper iobjectwrapper;
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
		//    4    9:aload_3         
		//    5   10:ldc1            #33  <String "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate">
		//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeFloat(f);
		//    7   15:aload_3         
		//    8   16:fload_1         
		//    9   17:invokevirtual   #87  <Method void Parcel.writeFloat(float)>
			parcel.writeFloat(f1);
		//   10   20:aload_3         
		//   11   21:fload_2         
		//   12   22:invokevirtual   #87  <Method void Parcel.writeFloat(float)>
			zzrk.transact(3, parcel, parcel1, 0);
		//   13   25:aload_0         
		//   14   26:getfield        #18  <Field IBinder zzrk>
		//   15   29:iconst_3        
		//   16   30:aload_3         
		//   17   31:aload           4
		//   18   33:iconst_0        
		//   19   34:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   20   39:pop             
			parcel1.readException();
		//   21   40:aload           4
		//   22   42:invokevirtual   #56  <Method void Parcel.readException()>
			iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder());
		//   23   45:aload           4
		//   24   47:invokevirtual   #59  <Method IBinder Parcel.readStrongBinder()>
		//   25   50:invokestatic    #65  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
		//   26   53:astore          5
			parcel1.recycle();
		//   27   55:aload           4
		//   28   57:invokevirtual   #68  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   60:aload_3         
		//   30   61:invokevirtual   #68  <Method void Parcel.recycle()>
			return iobjectwrapper;
		//   31   64:aload           5
		//   32   66:areturn         
			Exception exception;
			exception;
		//   33   67:astore          5
			parcel1.recycle();
		//   34   69:aload           4
		//   35   71:invokevirtual   #68  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   74:aload_3         
		//   37   75:invokevirtual   #68  <Method void Parcel.recycle()>
			throw exception;
		//   38   78:aload           5
		//   39   80:athrow          
		}

		public IObjectWrapper zoomBy(float f)
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
			IObjectWrapper iobjectwrapper;
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeFloat(f);
		//    7   14:aload_2         
		//    8   15:fload_1         
		//    9   16:invokevirtual   #87  <Method void Parcel.writeFloat(float)>
			zzrk.transact(5, parcel, parcel1, 0);
		//   10   19:aload_0         
		//   11   20:getfield        #18  <Field IBinder zzrk>
		//   12   23:iconst_5        
		//   13   24:aload_2         
		//   14   25:aload_3         
		//   15   26:iconst_0        
		//   16   27:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   17   32:pop             
			parcel1.readException();
		//   18   33:aload_3         
		//   19   34:invokevirtual   #56  <Method void Parcel.readException()>
			iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder());
		//   20   37:aload_3         
		//   21   38:invokevirtual   #59  <Method IBinder Parcel.readStrongBinder()>
		//   22   41:invokestatic    #65  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
		//   23   44:astore          4
			parcel1.recycle();
		//   24   46:aload_3         
		//   25   47:invokevirtual   #68  <Method void Parcel.recycle()>
			parcel.recycle();
		//   26   50:aload_2         
		//   27   51:invokevirtual   #68  <Method void Parcel.recycle()>
			return iobjectwrapper;
		//   28   54:aload           4
		//   29   56:areturn         
			Exception exception;
			exception;
		//   30   57:astore          4
			parcel1.recycle();
		//   31   59:aload_3         
		//   32   60:invokevirtual   #68  <Method void Parcel.recycle()>
			parcel.recycle();
		//   33   63:aload_2         
		//   34   64:invokevirtual   #68  <Method void Parcel.recycle()>
			throw exception;
		//   35   67:aload           4
		//   36   69:athrow          
		}

		public IObjectWrapper zoomByWithFocus(float f, int i, int j)
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
			IObjectWrapper iobjectwrapper;
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
		//    4   10:aload           4
		//    5   12:ldc1            #33  <String "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate">
		//    6   14:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeFloat(f);
		//    7   17:aload           4
		//    8   19:fload_1         
		//    9   20:invokevirtual   #87  <Method void Parcel.writeFloat(float)>
			parcel.writeInt(i);
		//   10   23:aload           4
		//   11   25:iload_2         
		//   12   26:invokevirtual   #41  <Method void Parcel.writeInt(int)>
			parcel.writeInt(j);
		//   13   29:aload           4
		//   14   31:iload_3         
		//   15   32:invokevirtual   #41  <Method void Parcel.writeInt(int)>
			zzrk.transact(6, parcel, parcel1, 0);
		//   16   35:aload_0         
		//   17   36:getfield        #18  <Field IBinder zzrk>
		//   18   39:bipush          6
		//   19   41:aload           4
		//   20   43:aload           5
		//   21   45:iconst_0        
		//   22   46:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   23   51:pop             
			parcel1.readException();
		//   24   52:aload           5
		//   25   54:invokevirtual   #56  <Method void Parcel.readException()>
			iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder());
		//   26   57:aload           5
		//   27   59:invokevirtual   #59  <Method IBinder Parcel.readStrongBinder()>
		//   28   62:invokestatic    #65  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
		//   29   65:astore          6
			parcel1.recycle();
		//   30   67:aload           5
		//   31   69:invokevirtual   #68  <Method void Parcel.recycle()>
			parcel.recycle();
		//   32   72:aload           4
		//   33   74:invokevirtual   #68  <Method void Parcel.recycle()>
			return iobjectwrapper;
		//   34   77:aload           6
		//   35   79:areturn         
			Exception exception;
			exception;
		//   36   80:astore          6
			parcel1.recycle();
		//   37   82:aload           5
		//   38   84:invokevirtual   #68  <Method void Parcel.recycle()>
			parcel.recycle();
		//   39   87:aload           4
		//   40   89:invokevirtual   #68  <Method void Parcel.recycle()>
			throw exception;
		//   41   92:aload           6
		//   42   94:athrow          
		}

		public IObjectWrapper zoomIn()
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(1, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:iconst_1        
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   27:pop             
			parcel1.readException();
		//   15   28:aload_2         
		//   16   29:invokevirtual   #56  <Method void Parcel.readException()>
			iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder());
		//   17   32:aload_2         
		//   18   33:invokevirtual   #59  <Method IBinder Parcel.readStrongBinder()>
		//   19   36:invokestatic    #65  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
		//   20   39:astore_3        
			parcel1.recycle();
		//   21   40:aload_2         
		//   22   41:invokevirtual   #68  <Method void Parcel.recycle()>
			parcel.recycle();
		//   23   44:aload_1         
		//   24   45:invokevirtual   #68  <Method void Parcel.recycle()>
			return iobjectwrapper;
		//   25   48:aload_3         
		//   26   49:areturn         
			Exception exception;
			exception;
		//   27   50:astore_3        
			parcel1.recycle();
		//   28   51:aload_2         
		//   29   52:invokevirtual   #68  <Method void Parcel.recycle()>
			parcel.recycle();
		//   30   55:aload_1         
		//   31   56:invokevirtual   #68  <Method void Parcel.recycle()>
			throw exception;
		//   32   59:aload_3         
		//   33   60:athrow          
		}

		public IObjectWrapper zoomOut()
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(2, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:iconst_2        
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   27:pop             
			parcel1.readException();
		//   15   28:aload_2         
		//   16   29:invokevirtual   #56  <Method void Parcel.readException()>
			iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder());
		//   17   32:aload_2         
		//   18   33:invokevirtual   #59  <Method IBinder Parcel.readStrongBinder()>
		//   19   36:invokestatic    #65  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
		//   20   39:astore_3        
			parcel1.recycle();
		//   21   40:aload_2         
		//   22   41:invokevirtual   #68  <Method void Parcel.recycle()>
			parcel.recycle();
		//   23   44:aload_1         
		//   24   45:invokevirtual   #68  <Method void Parcel.recycle()>
			return iobjectwrapper;
		//   25   48:aload_3         
		//   26   49:areturn         
			Exception exception;
			exception;
		//   27   50:astore_3        
			parcel1.recycle();
		//   28   51:aload_2         
		//   29   52:invokevirtual   #68  <Method void Parcel.recycle()>
			parcel.recycle();
		//   30   55:aload_1         
		//   31   56:invokevirtual   #68  <Method void Parcel.recycle()>
			throw exception;
		//   32   59:aload_3         
		//   33   60:athrow          
		}

		public IObjectWrapper zoomTo(float f)
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
			IObjectWrapper iobjectwrapper;
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeFloat(f);
		//    7   14:aload_2         
		//    8   15:fload_1         
		//    9   16:invokevirtual   #87  <Method void Parcel.writeFloat(float)>
			zzrk.transact(4, parcel, parcel1, 0);
		//   10   19:aload_0         
		//   11   20:getfield        #18  <Field IBinder zzrk>
		//   12   23:iconst_4        
		//   13   24:aload_2         
		//   14   25:aload_3         
		//   15   26:iconst_0        
		//   16   27:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   17   32:pop             
			parcel1.readException();
		//   18   33:aload_3         
		//   19   34:invokevirtual   #56  <Method void Parcel.readException()>
			iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder());
		//   20   37:aload_3         
		//   21   38:invokevirtual   #59  <Method IBinder Parcel.readStrongBinder()>
		//   22   41:invokestatic    #65  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
		//   23   44:astore          4
			parcel1.recycle();
		//   24   46:aload_3         
		//   25   47:invokevirtual   #68  <Method void Parcel.recycle()>
			parcel.recycle();
		//   26   50:aload_2         
		//   27   51:invokevirtual   #68  <Method void Parcel.recycle()>
			return iobjectwrapper;
		//   28   54:aload           4
		//   29   56:areturn         
			Exception exception;
			exception;
		//   30   57:astore          4
			parcel1.recycle();
		//   31   59:aload_3         
		//   32   60:invokevirtual   #68  <Method void Parcel.recycle()>
			parcel.recycle();
		//   33   63:aload_2         
		//   34   64:invokevirtual   #68  <Method void Parcel.recycle()>
			throw exception;
		//   35   67:aload           4
		//   36   69:athrow          
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


	public abstract IObjectWrapper newCameraPosition(CameraPosition cameraposition)
		throws RemoteException;

	public abstract IObjectWrapper newLatLng(LatLng latlng)
		throws RemoteException;

	public abstract IObjectWrapper newLatLngBounds(LatLngBounds latlngbounds, int i)
		throws RemoteException;

	public abstract IObjectWrapper newLatLngBoundsWithSize(LatLngBounds latlngbounds, int i, int j, int k)
		throws RemoteException;

	public abstract IObjectWrapper newLatLngZoom(LatLng latlng, float f)
		throws RemoteException;

	public abstract IObjectWrapper scrollBy(float f, float f1)
		throws RemoteException;

	public abstract IObjectWrapper zoomBy(float f)
		throws RemoteException;

	public abstract IObjectWrapper zoomByWithFocus(float f, int i, int j)
		throws RemoteException;

	public abstract IObjectWrapper zoomIn()
		throws RemoteException;

	public abstract IObjectWrapper zoomOut()
		throws RemoteException;

	public abstract IObjectWrapper zoomTo(float f)
		throws RemoteException;
}
