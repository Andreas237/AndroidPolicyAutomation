// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.maps.internal:
//			IGoogleMapDelegate, zzt

public interface IMapViewDelegate
	extends IInterface
{
	public static abstract class zza extends Binder
		implements IMapViewDelegate
	{

		public static IMapViewDelegate zzdy(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
		//    4    6:aload_0         
		//    5    7:ldc1            #13  <String "com.google.android.gms.maps.internal.IMapViewDelegate">
		//    6    9:invokeinterface #19  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface != null && (iinterface instanceof IMapViewDelegate))
		//*   8   15:aload_1         
		//*   9   16:ifnull          31
		//*  10   19:aload_1         
		//*  11   20:instanceof      #6   <Class IMapViewDelegate>
		//*  12   23:ifeq            31
				return (IMapViewDelegate)iinterface;
		//   13   26:aload_1         
		//   14   27:checkcast       #6   <Class IMapViewDelegate>
		//   15   30:areturn         
			else
				return ((IMapViewDelegate) (new zza(ibinder)));
		//   16   31:new             #9   <Class IMapViewDelegate$zza$zza>
		//   17   34:dup             
		//   18   35:aload_0         
		//   19   36:invokespecial   #23  <Method void IMapViewDelegate$zza$zza(IBinder)>
		//   20   39:areturn         
		}

		public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
			throws RemoteException
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:lookupswitch    14: default 124
		//		               1: 135
		//		               2: 173
		//		               3: 215
		//		               4: 231
		//		               5: 247
		//		               6: 263
		//		               7: 279
		//		               8: 344
		//		               9: 382
		//		               10: 405
		//		               11: 447
		//		               12: 463
		//		               13: 479
		//		               1598968902: 127
		//*   2  124:goto            495
			case 1598968902: 
				parcel1.writeString("com.google.android.gms.maps.internal.IMapViewDelegate");
		//    3  127:aload_3         
		//    4  128:ldc1            #13  <String "com.google.android.gms.maps.internal.IMapViewDelegate">
		//    5  130:invokevirtual   #34  <Method void Parcel.writeString(String)>
				return true;
		//    6  133:iconst_1        
		//    7  134:ireturn         

			case 1: // '\001'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
		//    8  135:aload_2         
		//    9  136:ldc1            #13  <String "com.google.android.gms.maps.internal.IMapViewDelegate">
		//   10  138:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getMap()));
		//   11  141:aload_0         
		//   12  142:invokevirtual   #41  <Method IGoogleMapDelegate getMap()>
		//   13  145:astore_2        
				parcel1.writeNoException();
		//   14  146:aload_3         
		//   15  147:invokevirtual   #45  <Method void Parcel.writeNoException()>
				if(parcel != null)
		//*  16  150:aload_2         
		//*  17  151:ifnull          164
					parcel = ((Parcel) (((IGoogleMapDelegate) (parcel)).asBinder()));
		//   18  154:aload_2         
		//   19  155:invokeinterface #51  <Method IBinder IGoogleMapDelegate.asBinder()>
		//   20  160:astore_2        
				else
		//*  21  161:goto            166
					parcel = null;
		//   22  164:aconst_null     
		//   23  165:astore_2        
				parcel1.writeStrongBinder(((IBinder) (parcel)));
		//   24  166:aload_3         
		//   25  167:aload_2         
		//   26  168:invokevirtual   #54  <Method void Parcel.writeStrongBinder(IBinder)>
				return true;
		//   27  171:iconst_1        
		//   28  172:ireturn         

			case 2: // '\002'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
		//   29  173:aload_2         
		//   30  174:ldc1            #13  <String "com.google.android.gms.maps.internal.IMapViewDelegate">
		//   31  176:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//*  32  179:aload_2         
		//*  33  180:invokevirtual   #58  <Method int Parcel.readInt()>
		//*  34  183:ifeq            202
					parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//   35  186:getstatic       #64  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//   36  189:aload_2         
		//   37  190:invokeinterface #70  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   38  195:checkcast       #60  <Class Bundle>
		//   39  198:astore_2        
				else
		//*  40  199:goto            204
					parcel = null;
		//   41  202:aconst_null     
		//   42  203:astore_2        
				onCreate(((Bundle) (parcel)));
		//   43  204:aload_0         
		//   44  205:aload_2         
		//   45  206:invokevirtual   #74  <Method void onCreate(Bundle)>
				parcel1.writeNoException();
		//   46  209:aload_3         
		//   47  210:invokevirtual   #45  <Method void Parcel.writeNoException()>
				return true;
		//   48  213:iconst_1        
		//   49  214:ireturn         

			case 3: // '\003'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
		//   50  215:aload_2         
		//   51  216:ldc1            #13  <String "com.google.android.gms.maps.internal.IMapViewDelegate">
		//   52  218:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				onResume();
		//   53  221:aload_0         
		//   54  222:invokevirtual   #77  <Method void onResume()>
				parcel1.writeNoException();
		//   55  225:aload_3         
		//   56  226:invokevirtual   #45  <Method void Parcel.writeNoException()>
				return true;
		//   57  229:iconst_1        
		//   58  230:ireturn         

			case 4: // '\004'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
		//   59  231:aload_2         
		//   60  232:ldc1            #13  <String "com.google.android.gms.maps.internal.IMapViewDelegate">
		//   61  234:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				onPause();
		//   62  237:aload_0         
		//   63  238:invokevirtual   #80  <Method void onPause()>
				parcel1.writeNoException();
		//   64  241:aload_3         
		//   65  242:invokevirtual   #45  <Method void Parcel.writeNoException()>
				return true;
		//   66  245:iconst_1        
		//   67  246:ireturn         

			case 5: // '\005'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
		//   68  247:aload_2         
		//   69  248:ldc1            #13  <String "com.google.android.gms.maps.internal.IMapViewDelegate">
		//   70  250:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				onDestroy();
		//   71  253:aload_0         
		//   72  254:invokevirtual   #83  <Method void onDestroy()>
				parcel1.writeNoException();
		//   73  257:aload_3         
		//   74  258:invokevirtual   #45  <Method void Parcel.writeNoException()>
				return true;
		//   75  261:iconst_1        
		//   76  262:ireturn         

			case 6: // '\006'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
		//   77  263:aload_2         
		//   78  264:ldc1            #13  <String "com.google.android.gms.maps.internal.IMapViewDelegate">
		//   79  266:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				onLowMemory();
		//   80  269:aload_0         
		//   81  270:invokevirtual   #86  <Method void onLowMemory()>
				parcel1.writeNoException();
		//   82  273:aload_3         
		//   83  274:invokevirtual   #45  <Method void Parcel.writeNoException()>
				return true;
		//   84  277:iconst_1        
		//   85  278:ireturn         

			case 7: // '\007'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
		//   86  279:aload_2         
		//   87  280:ldc1            #13  <String "com.google.android.gms.maps.internal.IMapViewDelegate">
		//   88  282:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//*  89  285:aload_2         
		//*  90  286:invokevirtual   #58  <Method int Parcel.readInt()>
		//*  91  289:ifeq            308
					parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//   92  292:getstatic       #64  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//   93  295:aload_2         
		//   94  296:invokeinterface #70  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   95  301:checkcast       #60  <Class Bundle>
		//   96  304:astore_2        
				else
		//*  97  305:goto            310
					parcel = null;
		//   98  308:aconst_null     
		//   99  309:astore_2        
				onSaveInstanceState(((Bundle) (parcel)));
		//  100  310:aload_0         
		//  101  311:aload_2         
		//  102  312:invokevirtual   #89  <Method void onSaveInstanceState(Bundle)>
				parcel1.writeNoException();
		//  103  315:aload_3         
		//  104  316:invokevirtual   #45  <Method void Parcel.writeNoException()>
				if(parcel != null)
		//* 105  319:aload_2         
		//* 106  320:ifnull          337
				{
					parcel1.writeInt(1);
		//  107  323:aload_3         
		//  108  324:iconst_1        
		//  109  325:invokevirtual   #93  <Method void Parcel.writeInt(int)>
					((Bundle) (parcel)).writeToParcel(parcel1, 1);
		//  110  328:aload_2         
		//  111  329:aload_3         
		//  112  330:iconst_1        
		//  113  331:invokevirtual   #97  <Method void Bundle.writeToParcel(Parcel, int)>
				} else
		//* 114  334:goto            342
				{
					parcel1.writeInt(0);
		//  115  337:aload_3         
		//  116  338:iconst_0        
		//  117  339:invokevirtual   #93  <Method void Parcel.writeInt(int)>
				}
				return true;
		//  118  342:iconst_1        
		//  119  343:ireturn         

			case 8: // '\b'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
		//  120  344:aload_2         
		//  121  345:ldc1            #13  <String "com.google.android.gms.maps.internal.IMapViewDelegate">
		//  122  347:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getView()));
		//  123  350:aload_0         
		//  124  351:invokevirtual   #101 <Method IObjectWrapper getView()>
		//  125  354:astore_2        
				parcel1.writeNoException();
		//  126  355:aload_3         
		//  127  356:invokevirtual   #45  <Method void Parcel.writeNoException()>
				if(parcel != null)
		//* 128  359:aload_2         
		//* 129  360:ifnull          373
					parcel = ((Parcel) (((IObjectWrapper) (parcel)).asBinder()));
		//  130  363:aload_2         
		//  131  364:invokeinterface #104 <Method IBinder IObjectWrapper.asBinder()>
		//  132  369:astore_2        
				else
		//* 133  370:goto            375
					parcel = null;
		//  134  373:aconst_null     
		//  135  374:astore_2        
				parcel1.writeStrongBinder(((IBinder) (parcel)));
		//  136  375:aload_3         
		//  137  376:aload_2         
		//  138  377:invokevirtual   #54  <Method void Parcel.writeStrongBinder(IBinder)>
				return true;
		//  139  380:iconst_1        
		//  140  381:ireturn         

			case 9: // '\t'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
		//  141  382:aload_2         
		//  142  383:ldc1            #13  <String "com.google.android.gms.maps.internal.IMapViewDelegate">
		//  143  385:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				getMapAsync(zzt.zza.zzdO(parcel.readStrongBinder()));
		//  144  388:aload_0         
		//  145  389:aload_2         
		//  146  390:invokevirtual   #107 <Method IBinder Parcel.readStrongBinder()>
		//  147  393:invokestatic    #113 <Method zzt zzt$zza.zzdO(IBinder)>
		//  148  396:invokevirtual   #117 <Method void getMapAsync(zzt)>
				parcel1.writeNoException();
		//  149  399:aload_3         
		//  150  400:invokevirtual   #45  <Method void Parcel.writeNoException()>
				return true;
		//  151  403:iconst_1        
		//  152  404:ireturn         

			case 10: // '\n'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
		//  153  405:aload_2         
		//  154  406:ldc1            #13  <String "com.google.android.gms.maps.internal.IMapViewDelegate">
		//  155  408:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//* 156  411:aload_2         
		//* 157  412:invokevirtual   #58  <Method int Parcel.readInt()>
		//* 158  415:ifeq            434
					parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//  159  418:getstatic       #64  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//  160  421:aload_2         
		//  161  422:invokeinterface #70  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  162  427:checkcast       #60  <Class Bundle>
		//  163  430:astore_2        
				else
		//* 164  431:goto            436
					parcel = null;
		//  165  434:aconst_null     
		//  166  435:astore_2        
				onEnterAmbient(((Bundle) (parcel)));
		//  167  436:aload_0         
		//  168  437:aload_2         
		//  169  438:invokevirtual   #120 <Method void onEnterAmbient(Bundle)>
				parcel1.writeNoException();
		//  170  441:aload_3         
		//  171  442:invokevirtual   #45  <Method void Parcel.writeNoException()>
				return true;
		//  172  445:iconst_1        
		//  173  446:ireturn         

			case 11: // '\013'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
		//  174  447:aload_2         
		//  175  448:ldc1            #13  <String "com.google.android.gms.maps.internal.IMapViewDelegate">
		//  176  450:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				onExitAmbient();
		//  177  453:aload_0         
		//  178  454:invokevirtual   #123 <Method void onExitAmbient()>
				parcel1.writeNoException();
		//  179  457:aload_3         
		//  180  458:invokevirtual   #45  <Method void Parcel.writeNoException()>
				return true;
		//  181  461:iconst_1        
		//  182  462:ireturn         

			case 12: // '\f'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
		//  183  463:aload_2         
		//  184  464:ldc1            #13  <String "com.google.android.gms.maps.internal.IMapViewDelegate">
		//  185  466:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				onStart();
		//  186  469:aload_0         
		//  187  470:invokevirtual   #126 <Method void onStart()>
				parcel1.writeNoException();
		//  188  473:aload_3         
		//  189  474:invokevirtual   #45  <Method void Parcel.writeNoException()>
				return true;
		//  190  477:iconst_1        
		//  191  478:ireturn         

			case 13: // '\r'
				parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
		//  192  479:aload_2         
		//  193  480:ldc1            #13  <String "com.google.android.gms.maps.internal.IMapViewDelegate">
		//  194  482:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				onStop();
		//  195  485:aload_0         
		//  196  486:invokevirtual   #129 <Method void onStop()>
				parcel1.writeNoException();
		//  197  489:aload_3         
		//  198  490:invokevirtual   #45  <Method void Parcel.writeNoException()>
				return true;
		//  199  493:iconst_1        
		//  200  494:ireturn         
			}
			return super.onTransact(i, parcel, parcel1, j);
		//  201  495:aload_0         
		//  202  496:iload_1         
		//  203  497:aload_2         
		//  204  498:aload_3         
		//  205  499:iload           4
		//  206  501:invokespecial   #131 <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//  207  504:ireturn         
		}
	}

	static class zza.zza
		implements IMapViewDelegate
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IMapViewDelegate">
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IMapViewDelegate">
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
			zzrk.transact(9, parcel, parcel1, 0);
		//   16   33:aload_0         
		//   17   34:getfield        #18  <Field IBinder zzrk>
		//   18   37:bipush          9
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

		public IObjectWrapper getView()
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IMapViewDelegate">
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
			iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel1.readStrongBinder());
		//   17   33:aload_2         
		//   18   34:invokevirtual   #49  <Method IBinder Parcel.readStrongBinder()>
		//   19   37:invokestatic    #76  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IMapViewDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #82  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #88  <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #82  <Method void Parcel.writeInt(int)>
			zzrk.transact(2, parcel, parcel1, 0);
		//   20   37:aload_0         
		//   21   38:getfield        #18  <Field IBinder zzrk>
		//   22   41:iconst_2        
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IMapViewDelegate">
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IMapViewDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #82  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #88  <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #82  <Method void Parcel.writeInt(int)>
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IMapViewDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(11, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:bipush          11
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IMapViewDelegate">
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IMapViewDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(4, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:iconst_4        
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IMapViewDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(3, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:iconst_3        
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IMapViewDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #82  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #88  <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #82  <Method void Parcel.writeInt(int)>
			zzrk.transact(7, parcel, parcel1, 0);
		//   20   37:aload_0         
		//   21   38:getfield        #18  <Field IBinder zzrk>
		//   22   41:bipush          7
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
		//*  31   57:invokevirtual   #99  <Method int Parcel.readInt()>
		//*  32   60:ifeq            68
				bundle.readFromParcel(parcel1);
		//   33   63:aload_1         
		//   34   64:aload_3         
		//   35   65:invokevirtual   #103 <Method void Bundle.readFromParcel(Parcel)>
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IMapViewDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(12, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:bipush          12
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IMapViewDelegate">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(13, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:bipush          13
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

	public abstract IObjectWrapper getView()
		throws RemoteException;

	public abstract void onCreate(Bundle bundle)
		throws RemoteException;

	public abstract void onDestroy()
		throws RemoteException;

	public abstract void onEnterAmbient(Bundle bundle)
		throws RemoteException;

	public abstract void onExitAmbient()
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
