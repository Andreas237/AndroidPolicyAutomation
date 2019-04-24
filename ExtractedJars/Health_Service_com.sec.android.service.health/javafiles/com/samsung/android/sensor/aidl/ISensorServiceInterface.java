// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.samsung.android.sensor.aidl;

import android.app.PendingIntent;
import android.os.*;
import com.samsung.android.sensor.data.SensorConnectorInfo;
import com.samsung.android.sensor.data.SensorDeviceInfo;
import java.util.List;

// Referenced classes of package com.samsung.android.sensor.aidl:
//			ISensorServiceCallback, ISensorDeviceScanCallback

public interface ISensorServiceInterface
	extends IInterface
{
	public static abstract class Stub extends Binder
		implements ISensorServiceInterface
	{

		public static ISensorServiceInterface asInterface(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//    4    6:aload_0         
		//    5    7:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//    6    9:invokeinterface #68  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface != null && (iinterface instanceof ISensorServiceInterface))
		//*   8   15:aload_1         
		//*   9   16:ifnull          31
		//*  10   19:aload_1         
		//*  11   20:instanceof      #6   <Class ISensorServiceInterface>
		//*  12   23:ifeq            31
				return (ISensorServiceInterface)iinterface;
		//   13   26:aload_1         
		//   14   27:checkcast       #6   <Class ISensorServiceInterface>
		//   15   30:areturn         
			else
				return ((ISensorServiceInterface) (new Proxy(ibinder)));
		//   16   31:new             #9   <Class ISensorServiceInterface$Stub$Proxy>
		//   17   34:dup             
		//   18   35:aload_0         
		//   19   36:invokespecial   #71  <Method void ISensorServiceInterface$Stub$Proxy(IBinder)>
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
			boolean flag1 = false;
		//    0    0:iconst_0        
		//    1    1:istore          6
			boolean flag = false;
		//    2    3:iconst_0        
		//    3    4:istore          5
			switch(i)
		//*   4    6:iload_1         
			{
		//*   5    7:lookupswitch    19: default 168
		//		               1: 186
		//		               2: 208
		//		               3: 251
		//		               4: 288
		//		               5: 340
		//		               6: 382
		//		               7: 470
		//		               8: 541
		//		               9: 563
		//		               10: 634
		//		               11: 705
		//		               12: 776
		//		               13: 847
		//		               14: 947
		//		               15: 1047
		//		               16: 1099
		//		               17: 1141
		//		               18: 1184
		//		               1598968902: 178
			default:
				return super.onTransact(i, parcel, parcel1, j);
		//    6  168:aload_0         
		//    7  169:iload_1         
		//    8  170:aload_2         
		//    9  171:aload_3         
		//   10  172:iload           4
		//   11  174:invokespecial   #79  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//   12  177:ireturn         

			case 1598968902: 
				parcel1.writeString("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//   13  178:aload_3         
		//   14  179:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//   15  181:invokevirtual   #85  <Method void Parcel.writeString(String)>
				return true;
		//   16  184:iconst_1        
		//   17  185:ireturn         

			case 1: // '\001'
				parcel.enforceInterface("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//   18  186:aload_2         
		//   19  187:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//   20  189:invokevirtual   #88  <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getSupportedAndroidDeviceInfoList()));
		//   21  192:aload_0         
		//   22  193:invokevirtual   #92  <Method List getSupportedAndroidDeviceInfoList()>
		//   23  196:astore_2        
				parcel1.writeNoException();
		//   24  197:aload_3         
		//   25  198:invokevirtual   #95  <Method void Parcel.writeNoException()>
				parcel1.writeTypedList(((List) (parcel)));
		//   26  201:aload_3         
		//   27  202:aload_2         
		//   28  203:invokevirtual   #99  <Method void Parcel.writeTypedList(List)>
				return true;
		//   29  206:iconst_1        
		//   30  207:ireturn         

			case 2: // '\002'
				parcel.enforceInterface("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//   31  208:aload_2         
		//   32  209:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//   33  211:invokevirtual   #88  <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getSupportedAndroidDeviceInfo(parcel.readInt())));
		//   34  214:aload_0         
		//   35  215:aload_2         
		//   36  216:invokevirtual   #103 <Method int Parcel.readInt()>
		//   37  219:invokevirtual   #107 <Method SensorDeviceInfo getSupportedAndroidDeviceInfo(int)>
		//   38  222:astore_2        
				parcel1.writeNoException();
		//   39  223:aload_3         
		//   40  224:invokevirtual   #95  <Method void Parcel.writeNoException()>
				if(parcel != null)
		//*  41  227:aload_2         
		//*  42  228:ifnull          244
				{
					parcel1.writeInt(1);
		//   43  231:aload_3         
		//   44  232:iconst_1        
		//   45  233:invokevirtual   #111 <Method void Parcel.writeInt(int)>
					((SensorDeviceInfo) (parcel)).writeToParcel(parcel1, 1);
		//   46  236:aload_2         
		//   47  237:aload_3         
		//   48  238:iconst_1        
		//   49  239:invokevirtual   #117 <Method void SensorDeviceInfo.writeToParcel(Parcel, int)>
					return true;
		//   50  242:iconst_1        
		//   51  243:ireturn         
				} else
				{
					parcel1.writeInt(0);
		//   52  244:aload_3         
		//   53  245:iconst_0        
		//   54  246:invokevirtual   #111 <Method void Parcel.writeInt(int)>
					return true;
		//   55  249:iconst_1        
		//   56  250:ireturn         
				}

			case 3: // '\003'
				parcel.enforceInterface("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//   57  251:aload_2         
		//   58  252:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//   59  254:invokevirtual   #88  <Method void Parcel.enforceInterface(String)>
				boolean flag2 = isAndroidSensorSupported(parcel.readInt());
		//   60  257:aload_0         
		//   61  258:aload_2         
		//   62  259:invokevirtual   #103 <Method int Parcel.readInt()>
		//   63  262:invokevirtual   #121 <Method boolean isAndroidSensorSupported(int)>
		//   64  265:istore          7
				parcel1.writeNoException();
		//   65  267:aload_3         
		//   66  268:invokevirtual   #95  <Method void Parcel.writeNoException()>
				i = ((int) (flag));
		//   67  271:iload           5
		//   68  273:istore_1        
				if(flag2)
		//*  69  274:iload           7
		//*  70  276:ifeq            281
					i = 1;
		//   71  279:iconst_1        
		//   72  280:istore_1        
				parcel1.writeInt(i);
		//   73  281:aload_3         
		//   74  282:iload_1         
		//   75  283:invokevirtual   #111 <Method void Parcel.writeInt(int)>
				return true;
		//   76  286:iconst_1        
		//   77  287:ireturn         

			case 4: // '\004'
				parcel.enforceInterface("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//   78  288:aload_2         
		//   79  289:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//   80  291:invokevirtual   #88  <Method void Parcel.enforceInterface(String)>
				SensorConnectorInfo sensorconnectorinfo;
				if(parcel.readInt() != 0)
		//*  81  294:aload_2         
		//*  82  295:invokevirtual   #103 <Method int Parcel.readInt()>
		//*  83  298:ifeq            334
					sensorconnectorinfo = (SensorConnectorInfo)SensorConnectorInfo.CREATOR.createFromParcel(parcel);
		//   84  301:getstatic       #127 <Field android.os.Parcelable$Creator SensorConnectorInfo.CREATOR>
		//   85  304:aload_2         
		//   86  305:invokeinterface #133 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   87  310:checkcast       #123 <Class SensorConnectorInfo>
		//   88  313:astore          8
				else
		//*  89  315:aload_0         
		//*  90  316:aload           8
		//*  91  318:aload_2         
		//*  92  319:invokevirtual   #136 <Method IBinder Parcel.readStrongBinder()>
		//*  93  322:invokestatic    #141 <Method ISensorDeviceScanCallback ISensorDeviceScanCallback$Stub.asInterface(IBinder)>
		//*  94  325:invokevirtual   #145 <Method void startAccessoryDeviceScan(SensorConnectorInfo, ISensorDeviceScanCallback)>
		//*  95  328:aload_3         
		//*  96  329:invokevirtual   #95  <Method void Parcel.writeNoException()>
		//*  97  332:iconst_1        
		//*  98  333:ireturn         
					sensorconnectorinfo = null;
		//   99  334:aconst_null     
		//  100  335:astore          8
				startAccessoryDeviceScan(sensorconnectorinfo, ISensorDeviceScanCallback.Stub.asInterface(parcel.readStrongBinder()));
				parcel1.writeNoException();
				return true;

		//* 101  337:goto            315
			case 5: // '\005'
				parcel.enforceInterface("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//  102  340:aload_2         
		//  103  341:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//  104  343:invokevirtual   #88  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//* 105  346:aload_2         
		//* 106  347:invokevirtual   #103 <Method int Parcel.readInt()>
		//* 107  350:ifeq            377
					parcel = ((Parcel) ((SensorConnectorInfo)SensorConnectorInfo.CREATOR.createFromParcel(parcel)));
		//  108  353:getstatic       #127 <Field android.os.Parcelable$Creator SensorConnectorInfo.CREATOR>
		//  109  356:aload_2         
		//  110  357:invokeinterface #133 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  111  362:checkcast       #123 <Class SensorConnectorInfo>
		//  112  365:astore_2        
				else
		//* 113  366:aload_0         
		//* 114  367:aload_2         
		//* 115  368:invokevirtual   #149 <Method void stopAccessoryDeviceScan(SensorConnectorInfo)>
		//* 116  371:aload_3         
		//* 117  372:invokevirtual   #95  <Method void Parcel.writeNoException()>
		//* 118  375:iconst_1        
		//* 119  376:ireturn         
					parcel = null;
		//  120  377:aconst_null     
		//  121  378:astore_2        
				stopAccessoryDeviceScan(((SensorConnectorInfo) (parcel)));
				parcel1.writeNoException();
				return true;

		//* 122  379:goto            366
			case 6: // '\006'
				parcel.enforceInterface("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//  123  382:aload_2         
		//  124  383:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//  125  385:invokevirtual   #88  <Method void Parcel.enforceInterface(String)>
				boolean flag3;
				SensorConnectorInfo sensorconnectorinfo1;
				if(parcel.readInt() != 0)
		//* 126  388:aload_2         
		//* 127  389:invokevirtual   #103 <Method int Parcel.readInt()>
		//* 128  392:ifeq            459
					sensorconnectorinfo1 = (SensorConnectorInfo)SensorConnectorInfo.CREATOR.createFromParcel(parcel);
		//  129  395:getstatic       #127 <Field android.os.Parcelable$Creator SensorConnectorInfo.CREATOR>
		//  130  398:aload_2         
		//  131  399:invokeinterface #133 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  132  404:checkcast       #123 <Class SensorConnectorInfo>
		//  133  407:astore          8
				else
		//* 134  409:aload_2         
		//* 135  410:invokevirtual   #103 <Method int Parcel.readInt()>
		//* 136  413:ifeq            465
		//* 137  416:getstatic       #150 <Field android.os.Parcelable$Creator SensorDeviceInfo.CREATOR>
		//* 138  419:aload_2         
		//* 139  420:invokeinterface #133 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//* 140  425:checkcast       #113 <Class SensorDeviceInfo>
		//* 141  428:astore_2        
		//* 142  429:aload_0         
		//* 143  430:aload           8
		//* 144  432:aload_2         
		//* 145  433:invokevirtual   #154 <Method boolean registerAccessoryDeviceInfo(SensorConnectorInfo, SensorDeviceInfo)>
		//* 146  436:istore          7
		//* 147  438:aload_3         
		//* 148  439:invokevirtual   #95  <Method void Parcel.writeNoException()>
		//* 149  442:iload           6
		//* 150  444:istore_1        
		//* 151  445:iload           7
		//* 152  447:ifeq            452
		//* 153  450:iconst_1        
		//* 154  451:istore_1        
		//* 155  452:aload_3         
		//* 156  453:iload_1         
		//* 157  454:invokevirtual   #111 <Method void Parcel.writeInt(int)>
		//* 158  457:iconst_1        
		//* 159  458:ireturn         
					sensorconnectorinfo1 = null;
		//  160  459:aconst_null     
		//  161  460:astore          8
				if(parcel.readInt() != 0)
					parcel = ((Parcel) ((SensorDeviceInfo)SensorDeviceInfo.CREATOR.createFromParcel(parcel)));
				else
		//* 162  462:goto            409
					parcel = null;
		//  163  465:aconst_null     
		//  164  466:astore_2        
				flag3 = registerAccessoryDeviceInfo(sensorconnectorinfo1, ((SensorDeviceInfo) (parcel)));
				parcel1.writeNoException();
				i = ((int) (flag1));
				if(flag3)
					i = 1;
				parcel1.writeInt(i);
				return true;

		//* 165  467:goto            429
			case 7: // '\007'
				parcel.enforceInterface("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//  166  470:aload_2         
		//  167  471:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//  168  473:invokevirtual   #88  <Method void Parcel.enforceInterface(String)>
				SensorConnectorInfo sensorconnectorinfo2;
				if(parcel.readInt() != 0)
		//* 169  476:aload_2         
		//* 170  477:invokevirtual   #103 <Method int Parcel.readInt()>
		//* 171  480:ifeq            530
					sensorconnectorinfo2 = (SensorConnectorInfo)SensorConnectorInfo.CREATOR.createFromParcel(parcel);
		//  172  483:getstatic       #127 <Field android.os.Parcelable$Creator SensorConnectorInfo.CREATOR>
		//  173  486:aload_2         
		//  174  487:invokeinterface #133 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  175  492:checkcast       #123 <Class SensorConnectorInfo>
		//  176  495:astore          8
				else
		//* 177  497:aload_2         
		//* 178  498:invokevirtual   #103 <Method int Parcel.readInt()>
		//* 179  501:ifeq            536
		//* 180  504:getstatic       #150 <Field android.os.Parcelable$Creator SensorDeviceInfo.CREATOR>
		//* 181  507:aload_2         
		//* 182  508:invokeinterface #133 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//* 183  513:checkcast       #113 <Class SensorDeviceInfo>
		//* 184  516:astore_2        
		//* 185  517:aload_0         
		//* 186  518:aload           8
		//* 187  520:aload_2         
		//* 188  521:invokevirtual   #158 <Method void unregisterAccessoryDeviceInfo(SensorConnectorInfo, SensorDeviceInfo)>
		//* 189  524:aload_3         
		//* 190  525:invokevirtual   #95  <Method void Parcel.writeNoException()>
		//* 191  528:iconst_1        
		//* 192  529:ireturn         
					sensorconnectorinfo2 = null;
		//  193  530:aconst_null     
		//  194  531:astore          8
				if(parcel.readInt() != 0)
					parcel = ((Parcel) ((SensorDeviceInfo)SensorDeviceInfo.CREATOR.createFromParcel(parcel)));
				else
		//* 195  533:goto            497
					parcel = null;
		//  196  536:aconst_null     
		//  197  537:astore_2        
				unregisterAccessoryDeviceInfo(sensorconnectorinfo2, ((SensorDeviceInfo) (parcel)));
				parcel1.writeNoException();
				return true;

		//* 198  538:goto            517
			case 8: // '\b'
				parcel.enforceInterface("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//  199  541:aload_2         
		//  200  542:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//  201  544:invokevirtual   #88  <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getRegisteredAccessoryDeviceInfoList()));
		//  202  547:aload_0         
		//  203  548:invokevirtual   #161 <Method List getRegisteredAccessoryDeviceInfoList()>
		//  204  551:astore_2        
				parcel1.writeNoException();
		//  205  552:aload_3         
		//  206  553:invokevirtual   #95  <Method void Parcel.writeNoException()>
				parcel1.writeTypedList(((List) (parcel)));
		//  207  556:aload_3         
		//  208  557:aload_2         
		//  209  558:invokevirtual   #99  <Method void Parcel.writeTypedList(List)>
				return true;
		//  210  561:iconst_1        
		//  211  562:ireturn         

			case 9: // '\t'
				parcel.enforceInterface("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//  212  563:aload_2         
		//  213  564:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//  214  566:invokevirtual   #88  <Method void Parcel.enforceInterface(String)>
				SensorConnectorInfo sensorconnectorinfo3;
				if(parcel.readInt() != 0)
		//* 215  569:aload_2         
		//* 216  570:invokevirtual   #103 <Method int Parcel.readInt()>
		//* 217  573:ifeq            623
					sensorconnectorinfo3 = (SensorConnectorInfo)SensorConnectorInfo.CREATOR.createFromParcel(parcel);
		//  218  576:getstatic       #127 <Field android.os.Parcelable$Creator SensorConnectorInfo.CREATOR>
		//  219  579:aload_2         
		//  220  580:invokeinterface #133 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  221  585:checkcast       #123 <Class SensorConnectorInfo>
		//  222  588:astore          8
				else
		//* 223  590:aload_2         
		//* 224  591:invokevirtual   #103 <Method int Parcel.readInt()>
		//* 225  594:ifeq            629
		//* 226  597:getstatic       #150 <Field android.os.Parcelable$Creator SensorDeviceInfo.CREATOR>
		//* 227  600:aload_2         
		//* 228  601:invokeinterface #133 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//* 229  606:checkcast       #113 <Class SensorDeviceInfo>
		//* 230  609:astore_2        
		//* 231  610:aload_0         
		//* 232  611:aload           8
		//* 233  613:aload_2         
		//* 234  614:invokevirtual   #164 <Method void requestAccess(SensorConnectorInfo, SensorDeviceInfo)>
		//* 235  617:aload_3         
		//* 236  618:invokevirtual   #95  <Method void Parcel.writeNoException()>
		//* 237  621:iconst_1        
		//* 238  622:ireturn         
					sensorconnectorinfo3 = null;
		//  239  623:aconst_null     
		//  240  624:astore          8
				if(parcel.readInt() != 0)
					parcel = ((Parcel) ((SensorDeviceInfo)SensorDeviceInfo.CREATOR.createFromParcel(parcel)));
				else
		//* 241  626:goto            590
					parcel = null;
		//  242  629:aconst_null     
		//  243  630:astore_2        
				requestAccess(sensorconnectorinfo3, ((SensorDeviceInfo) (parcel)));
				parcel1.writeNoException();
				return true;

		//* 244  631:goto            610
			case 10: // '\n'
				parcel.enforceInterface("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//  245  634:aload_2         
		//  246  635:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//  247  637:invokevirtual   #88  <Method void Parcel.enforceInterface(String)>
				SensorConnectorInfo sensorconnectorinfo4;
				if(parcel.readInt() != 0)
		//* 248  640:aload_2         
		//* 249  641:invokevirtual   #103 <Method int Parcel.readInt()>
		//* 250  644:ifeq            694
					sensorconnectorinfo4 = (SensorConnectorInfo)SensorConnectorInfo.CREATOR.createFromParcel(parcel);
		//  251  647:getstatic       #127 <Field android.os.Parcelable$Creator SensorConnectorInfo.CREATOR>
		//  252  650:aload_2         
		//  253  651:invokeinterface #133 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  254  656:checkcast       #123 <Class SensorConnectorInfo>
		//  255  659:astore          8
				else
		//* 256  661:aload_2         
		//* 257  662:invokevirtual   #103 <Method int Parcel.readInt()>
		//* 258  665:ifeq            700
		//* 259  668:getstatic       #150 <Field android.os.Parcelable$Creator SensorDeviceInfo.CREATOR>
		//* 260  671:aload_2         
		//* 261  672:invokeinterface #133 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//* 262  677:checkcast       #113 <Class SensorDeviceInfo>
		//* 263  680:astore_2        
		//* 264  681:aload_0         
		//* 265  682:aload           8
		//* 266  684:aload_2         
		//* 267  685:invokevirtual   #167 <Method void releaseAccess(SensorConnectorInfo, SensorDeviceInfo)>
		//* 268  688:aload_3         
		//* 269  689:invokevirtual   #95  <Method void Parcel.writeNoException()>
		//* 270  692:iconst_1        
		//* 271  693:ireturn         
					sensorconnectorinfo4 = null;
		//  272  694:aconst_null     
		//  273  695:astore          8
				if(parcel.readInt() != 0)
					parcel = ((Parcel) ((SensorDeviceInfo)SensorDeviceInfo.CREATOR.createFromParcel(parcel)));
				else
		//* 274  697:goto            661
					parcel = null;
		//  275  700:aconst_null     
		//  276  701:astore_2        
				releaseAccess(sensorconnectorinfo4, ((SensorDeviceInfo) (parcel)));
				parcel1.writeNoException();
				return true;

		//* 277  702:goto            681
			case 11: // '\013'
				parcel.enforceInterface("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//  278  705:aload_2         
		//  279  706:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//  280  708:invokevirtual   #88  <Method void Parcel.enforceInterface(String)>
				SensorConnectorInfo sensorconnectorinfo5;
				if(parcel.readInt() != 0)
		//* 281  711:aload_2         
		//* 282  712:invokevirtual   #103 <Method int Parcel.readInt()>
		//* 283  715:ifeq            765
					sensorconnectorinfo5 = (SensorConnectorInfo)SensorConnectorInfo.CREATOR.createFromParcel(parcel);
		//  284  718:getstatic       #127 <Field android.os.Parcelable$Creator SensorConnectorInfo.CREATOR>
		//  285  721:aload_2         
		//  286  722:invokeinterface #133 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  287  727:checkcast       #123 <Class SensorConnectorInfo>
		//  288  730:astore          8
				else
		//* 289  732:aload_2         
		//* 290  733:invokevirtual   #103 <Method int Parcel.readInt()>
		//* 291  736:ifeq            771
		//* 292  739:getstatic       #150 <Field android.os.Parcelable$Creator SensorDeviceInfo.CREATOR>
		//* 293  742:aload_2         
		//* 294  743:invokeinterface #133 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//* 295  748:checkcast       #113 <Class SensorDeviceInfo>
		//* 296  751:astore_2        
		//* 297  752:aload_0         
		//* 298  753:aload           8
		//* 299  755:aload_2         
		//* 300  756:invokevirtual   #170 <Method void addListener(SensorConnectorInfo, SensorDeviceInfo)>
		//* 301  759:aload_3         
		//* 302  760:invokevirtual   #95  <Method void Parcel.writeNoException()>
		//* 303  763:iconst_1        
		//* 304  764:ireturn         
					sensorconnectorinfo5 = null;
		//  305  765:aconst_null     
		//  306  766:astore          8
				if(parcel.readInt() != 0)
					parcel = ((Parcel) ((SensorDeviceInfo)SensorDeviceInfo.CREATOR.createFromParcel(parcel)));
				else
		//* 307  768:goto            732
					parcel = null;
		//  308  771:aconst_null     
		//  309  772:astore_2        
				addListener(sensorconnectorinfo5, ((SensorDeviceInfo) (parcel)));
				parcel1.writeNoException();
				return true;

		//* 310  773:goto            752
			case 12: // '\f'
				parcel.enforceInterface("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//  311  776:aload_2         
		//  312  777:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//  313  779:invokevirtual   #88  <Method void Parcel.enforceInterface(String)>
				SensorConnectorInfo sensorconnectorinfo6;
				if(parcel.readInt() != 0)
		//* 314  782:aload_2         
		//* 315  783:invokevirtual   #103 <Method int Parcel.readInt()>
		//* 316  786:ifeq            836
					sensorconnectorinfo6 = (SensorConnectorInfo)SensorConnectorInfo.CREATOR.createFromParcel(parcel);
		//  317  789:getstatic       #127 <Field android.os.Parcelable$Creator SensorConnectorInfo.CREATOR>
		//  318  792:aload_2         
		//  319  793:invokeinterface #133 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  320  798:checkcast       #123 <Class SensorConnectorInfo>
		//  321  801:astore          8
				else
		//* 322  803:aload_2         
		//* 323  804:invokevirtual   #103 <Method int Parcel.readInt()>
		//* 324  807:ifeq            842
		//* 325  810:getstatic       #150 <Field android.os.Parcelable$Creator SensorDeviceInfo.CREATOR>
		//* 326  813:aload_2         
		//* 327  814:invokeinterface #133 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//* 328  819:checkcast       #113 <Class SensorDeviceInfo>
		//* 329  822:astore_2        
		//* 330  823:aload_0         
		//* 331  824:aload           8
		//* 332  826:aload_2         
		//* 333  827:invokevirtual   #173 <Method void removeListener(SensorConnectorInfo, SensorDeviceInfo)>
		//* 334  830:aload_3         
		//* 335  831:invokevirtual   #95  <Method void Parcel.writeNoException()>
		//* 336  834:iconst_1        
		//* 337  835:ireturn         
					sensorconnectorinfo6 = null;
		//  338  836:aconst_null     
		//  339  837:astore          8
				if(parcel.readInt() != 0)
					parcel = ((Parcel) ((SensorDeviceInfo)SensorDeviceInfo.CREATOR.createFromParcel(parcel)));
				else
		//* 340  839:goto            803
					parcel = null;
		//  341  842:aconst_null     
		//  342  843:astore_2        
				removeListener(sensorconnectorinfo6, ((SensorDeviceInfo) (parcel)));
				parcel1.writeNoException();
				return true;

		//* 343  844:goto            823
			case 13: // '\r'
				parcel.enforceInterface("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//  344  847:aload_2         
		//  345  848:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//  346  850:invokevirtual   #88  <Method void Parcel.enforceInterface(String)>
				SensorConnectorInfo sensorconnectorinfo7;
				SensorDeviceInfo sensordeviceinfo;
				if(parcel.readInt() != 0)
		//* 347  853:aload_2         
		//* 348  854:invokevirtual   #103 <Method int Parcel.readInt()>
		//* 349  857:ifeq            930
					sensorconnectorinfo7 = (SensorConnectorInfo)SensorConnectorInfo.CREATOR.createFromParcel(parcel);
		//  350  860:getstatic       #127 <Field android.os.Parcelable$Creator SensorConnectorInfo.CREATOR>
		//  351  863:aload_2         
		//  352  864:invokeinterface #133 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  353  869:checkcast       #123 <Class SensorConnectorInfo>
		//  354  872:astore          8
				else
		//* 355  874:aload_2         
		//* 356  875:invokevirtual   #103 <Method int Parcel.readInt()>
		//* 357  878:ifeq            936
		//* 358  881:getstatic       #150 <Field android.os.Parcelable$Creator SensorDeviceInfo.CREATOR>
		//* 359  884:aload_2         
		//* 360  885:invokeinterface #133 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//* 361  890:checkcast       #113 <Class SensorDeviceInfo>
		//* 362  893:astore          9
		//* 363  895:aload_2         
		//* 364  896:invokevirtual   #103 <Method int Parcel.readInt()>
		//* 365  899:ifeq            942
		//* 366  902:getstatic       #176 <Field android.os.Parcelable$Creator PendingIntent.CREATOR>
		//* 367  905:aload_2         
		//* 368  906:invokeinterface #133 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//* 369  911:checkcast       #175 <Class PendingIntent>
		//* 370  914:astore_2        
		//* 371  915:aload_0         
		//* 372  916:aload           8
		//* 373  918:aload           9
		//* 374  920:aload_2         
		//* 375  921:invokevirtual   #180 <Method void addPendingIntent(SensorConnectorInfo, SensorDeviceInfo, PendingIntent)>
		//* 376  924:aload_3         
		//* 377  925:invokevirtual   #95  <Method void Parcel.writeNoException()>
		//* 378  928:iconst_1        
		//* 379  929:ireturn         
					sensorconnectorinfo7 = null;
		//  380  930:aconst_null     
		//  381  931:astore          8
				if(parcel.readInt() != 0)
					sensordeviceinfo = (SensorDeviceInfo)SensorDeviceInfo.CREATOR.createFromParcel(parcel);
				else
		//* 382  933:goto            874
					sensordeviceinfo = null;
		//  383  936:aconst_null     
		//  384  937:astore          9
				if(parcel.readInt() != 0)
					parcel = ((Parcel) ((PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel)));
				else
		//* 385  939:goto            895
					parcel = null;
		//  386  942:aconst_null     
		//  387  943:astore_2        
				addPendingIntent(sensorconnectorinfo7, sensordeviceinfo, ((PendingIntent) (parcel)));
				parcel1.writeNoException();
				return true;

		//* 388  944:goto            915
			case 14: // '\016'
				parcel.enforceInterface("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//  389  947:aload_2         
		//  390  948:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//  391  950:invokevirtual   #88  <Method void Parcel.enforceInterface(String)>
				SensorConnectorInfo sensorconnectorinfo8;
				SensorDeviceInfo sensordeviceinfo1;
				if(parcel.readInt() != 0)
		//* 392  953:aload_2         
		//* 393  954:invokevirtual   #103 <Method int Parcel.readInt()>
		//* 394  957:ifeq            1030
					sensorconnectorinfo8 = (SensorConnectorInfo)SensorConnectorInfo.CREATOR.createFromParcel(parcel);
		//  395  960:getstatic       #127 <Field android.os.Parcelable$Creator SensorConnectorInfo.CREATOR>
		//  396  963:aload_2         
		//  397  964:invokeinterface #133 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  398  969:checkcast       #123 <Class SensorConnectorInfo>
		//  399  972:astore          8
				else
		//* 400  974:aload_2         
		//* 401  975:invokevirtual   #103 <Method int Parcel.readInt()>
		//* 402  978:ifeq            1036
		//* 403  981:getstatic       #150 <Field android.os.Parcelable$Creator SensorDeviceInfo.CREATOR>
		//* 404  984:aload_2         
		//* 405  985:invokeinterface #133 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//* 406  990:checkcast       #113 <Class SensorDeviceInfo>
		//* 407  993:astore          9
		//* 408  995:aload_2         
		//* 409  996:invokevirtual   #103 <Method int Parcel.readInt()>
		//* 410  999:ifeq            1042
		//* 411 1002:getstatic       #176 <Field android.os.Parcelable$Creator PendingIntent.CREATOR>
		//* 412 1005:aload_2         
		//* 413 1006:invokeinterface #133 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//* 414 1011:checkcast       #175 <Class PendingIntent>
		//* 415 1014:astore_2        
		//* 416 1015:aload_0         
		//* 417 1016:aload           8
		//* 418 1018:aload           9
		//* 419 1020:aload_2         
		//* 420 1021:invokevirtual   #183 <Method void removePendingIntent(SensorConnectorInfo, SensorDeviceInfo, PendingIntent)>
		//* 421 1024:aload_3         
		//* 422 1025:invokevirtual   #95  <Method void Parcel.writeNoException()>
		//* 423 1028:iconst_1        
		//* 424 1029:ireturn         
					sensorconnectorinfo8 = null;
		//  425 1030:aconst_null     
		//  426 1031:astore          8
				if(parcel.readInt() != 0)
					sensordeviceinfo1 = (SensorDeviceInfo)SensorDeviceInfo.CREATOR.createFromParcel(parcel);
				else
		//* 427 1033:goto            974
					sensordeviceinfo1 = null;
		//  428 1036:aconst_null     
		//  429 1037:astore          9
				if(parcel.readInt() != 0)
					parcel = ((Parcel) ((PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel)));
				else
		//* 430 1039:goto            995
					parcel = null;
		//  431 1042:aconst_null     
		//  432 1043:astore_2        
				removePendingIntent(sensorconnectorinfo8, sensordeviceinfo1, ((PendingIntent) (parcel)));
				parcel1.writeNoException();
				return true;

		//* 433 1044:goto            1015
			case 15: // '\017'
				parcel.enforceInterface("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//  434 1047:aload_2         
		//  435 1048:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//  436 1050:invokevirtual   #88  <Method void Parcel.enforceInterface(String)>
				SensorConnectorInfo sensorconnectorinfo9;
				if(parcel.readInt() != 0)
		//* 437 1053:aload_2         
		//* 438 1054:invokevirtual   #103 <Method int Parcel.readInt()>
		//* 439 1057:ifeq            1093
					sensorconnectorinfo9 = (SensorConnectorInfo)SensorConnectorInfo.CREATOR.createFromParcel(parcel);
		//  440 1060:getstatic       #127 <Field android.os.Parcelable$Creator SensorConnectorInfo.CREATOR>
		//  441 1063:aload_2         
		//  442 1064:invokeinterface #133 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  443 1069:checkcast       #123 <Class SensorConnectorInfo>
		//  444 1072:astore          8
				else
		//* 445 1074:aload_0         
		//* 446 1075:aload           8
		//* 447 1077:aload_2         
		//* 448 1078:invokevirtual   #136 <Method IBinder Parcel.readStrongBinder()>
		//* 449 1081:invokestatic    #188 <Method ISensorServiceCallback ISensorServiceCallback$Stub.asInterface(IBinder)>
		//* 450 1084:invokevirtual   #192 <Method void registerConnector(SensorConnectorInfo, ISensorServiceCallback)>
		//* 451 1087:aload_3         
		//* 452 1088:invokevirtual   #95  <Method void Parcel.writeNoException()>
		//* 453 1091:iconst_1        
		//* 454 1092:ireturn         
					sensorconnectorinfo9 = null;
		//  455 1093:aconst_null     
		//  456 1094:astore          8
				registerConnector(sensorconnectorinfo9, ISensorServiceCallback.Stub.asInterface(parcel.readStrongBinder()));
				parcel1.writeNoException();
				return true;

		//* 457 1096:goto            1074
			case 16: // '\020'
				parcel.enforceInterface("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//  458 1099:aload_2         
		//  459 1100:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//  460 1102:invokevirtual   #88  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//* 461 1105:aload_2         
		//* 462 1106:invokevirtual   #103 <Method int Parcel.readInt()>
		//* 463 1109:ifeq            1136
					parcel = ((Parcel) ((SensorConnectorInfo)SensorConnectorInfo.CREATOR.createFromParcel(parcel)));
		//  464 1112:getstatic       #127 <Field android.os.Parcelable$Creator SensorConnectorInfo.CREATOR>
		//  465 1115:aload_2         
		//  466 1116:invokeinterface #133 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  467 1121:checkcast       #123 <Class SensorConnectorInfo>
		//  468 1124:astore_2        
				else
		//* 469 1125:aload_0         
		//* 470 1126:aload_2         
		//* 471 1127:invokevirtual   #195 <Method void unregisterConnector(SensorConnectorInfo)>
		//* 472 1130:aload_3         
		//* 473 1131:invokevirtual   #95  <Method void Parcel.writeNoException()>
		//* 474 1134:iconst_1        
		//* 475 1135:ireturn         
					parcel = null;
		//  476 1136:aconst_null     
		//  477 1137:astore_2        
				unregisterConnector(((SensorConnectorInfo) (parcel)));
				parcel1.writeNoException();
				return true;

		//* 478 1138:goto            1125
			case 17: // '\021'
				parcel.enforceInterface("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//  479 1141:aload_2         
		//  480 1142:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//  481 1144:invokevirtual   #88  <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getDeviceInfoById(parcel.readString())));
		//  482 1147:aload_0         
		//  483 1148:aload_2         
		//  484 1149:invokevirtual   #199 <Method String Parcel.readString()>
		//  485 1152:invokevirtual   #203 <Method SensorDeviceInfo getDeviceInfoById(String)>
		//  486 1155:astore_2        
				parcel1.writeNoException();
		//  487 1156:aload_3         
		//  488 1157:invokevirtual   #95  <Method void Parcel.writeNoException()>
				if(parcel != null)
		//* 489 1160:aload_2         
		//* 490 1161:ifnull          1177
				{
					parcel1.writeInt(1);
		//  491 1164:aload_3         
		//  492 1165:iconst_1        
		//  493 1166:invokevirtual   #111 <Method void Parcel.writeInt(int)>
					((SensorDeviceInfo) (parcel)).writeToParcel(parcel1, 1);
		//  494 1169:aload_2         
		//  495 1170:aload_3         
		//  496 1171:iconst_1        
		//  497 1172:invokevirtual   #117 <Method void SensorDeviceInfo.writeToParcel(Parcel, int)>
					return true;
		//  498 1175:iconst_1        
		//  499 1176:ireturn         
				} else
				{
					parcel1.writeInt(0);
		//  500 1177:aload_3         
		//  501 1178:iconst_0        
		//  502 1179:invokevirtual   #111 <Method void Parcel.writeInt(int)>
					return true;
		//  503 1182:iconst_1        
		//  504 1183:ireturn         
				}

			case 18: // '\022'
				parcel.enforceInterface("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//  505 1184:aload_2         
		//  506 1185:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//  507 1187:invokevirtual   #88  <Method void Parcel.enforceInterface(String)>
				setBluetoothIdentifier(((List) (parcel.createStringArrayList())));
		//  508 1190:aload_0         
		//  509 1191:aload_2         
		//  510 1192:invokevirtual   #207 <Method java.util.ArrayList Parcel.createStringArrayList()>
		//  511 1195:invokevirtual   #210 <Method void setBluetoothIdentifier(List)>
				parcel1.writeNoException();
		//  512 1198:aload_3         
		//  513 1199:invokevirtual   #95  <Method void Parcel.writeNoException()>
				return true;
		//  514 1202:iconst_1        
		//  515 1203:ireturn         
			}
		}

		private static final String DESCRIPTOR = "com.samsung.android.sensor.aidl.ISensorServiceInterface";
		static final int TRANSACTION_addListener = 11;
		static final int TRANSACTION_addPendingIntent = 13;
		static final int TRANSACTION_getDeviceInfoById = 17;
		static final int TRANSACTION_getRegisteredAccessoryDeviceInfoList = 8;
		static final int TRANSACTION_getSupportedAndroidDeviceInfo = 2;
		static final int TRANSACTION_getSupportedAndroidDeviceInfoList = 1;
		static final int TRANSACTION_isAndroidSensorSupported = 3;
		static final int TRANSACTION_registerAccessoryDeviceInfo = 6;
		static final int TRANSACTION_registerConnector = 15;
		static final int TRANSACTION_releaseAccess = 10;
		static final int TRANSACTION_removeListener = 12;
		static final int TRANSACTION_removePendingIntent = 14;
		static final int TRANSACTION_requestAccess = 9;
		static final int TRANSACTION_setBluetoothIdentifier = 18;
		static final int TRANSACTION_startAccessoryDeviceScan = 4;
		static final int TRANSACTION_stopAccessoryDeviceScan = 5;
		static final int TRANSACTION_unregisterAccessoryDeviceInfo = 7;
		static final int TRANSACTION_unregisterConnector = 16;

		public Stub()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #55  <Method void Binder()>
			attachInterface(((IInterface) (this)), "com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//    5    8:invokevirtual   #59  <Method void attachInterface(IInterface, String)>
		//    6   11:return          
		}
	}

	private static class Stub.Proxy
		implements ISensorServiceInterface
	{

		public void addListener(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(sensorconnectorinfo == null) goto _L2; else goto _L1
		//    7   15:aload_1         
		//    8   16:ifnull          76
_L1:
			parcel.writeInt(1);
		//    9   19:aload_3         
		//   10   20:iconst_1        
		//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			sensorconnectorinfo.writeToParcel(parcel, 0);
		//   12   24:aload_1         
		//   13   25:aload_3         
		//   14   26:iconst_0        
		//   15   27:invokevirtual   #46  <Method void SensorConnectorInfo.writeToParcel(Parcel, int)>
_L3:
			if(sensordeviceinfo == null)
				break MISSING_BLOCK_LABEL_96;
		//   16   30:aload_2         
		//   17   31:ifnull          96
			parcel.writeInt(1);
		//   18   34:aload_3         
		//   19   35:iconst_1        
		//   20   36:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			sensordeviceinfo.writeToParcel(parcel, 0);
		//   21   39:aload_2         
		//   22   40:aload_3         
		//   23   41:iconst_0        
		//   24   42:invokevirtual   #49  <Method void SensorDeviceInfo.writeToParcel(Parcel, int)>
_L4:
			mRemote.transact(11, parcel, parcel1, 0);
		//   25   45:aload_0         
		//   26   46:getfield        #19  <Field IBinder mRemote>
		//   27   49:bipush          11
		//   28   51:aload_3         
		//   29   52:aload           4
		//   30   54:iconst_0        
		//   31   55:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   32   60:pop             
			parcel1.readException();
		//   33   61:aload           4
		//   34   63:invokevirtual   #58  <Method void Parcel.readException()>
			parcel1.recycle();
		//   35   66:aload           4
		//   36   68:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   37   71:aload_3         
		//   38   72:invokevirtual   #61  <Method void Parcel.recycle()>
			return;
		//   39   75:return          
_L2:
			parcel.writeInt(0);
		//   40   76:aload_3         
		//   41   77:iconst_0        
		//   42   78:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L3
		//*  43   81:goto            30
			sensorconnectorinfo;
		//   44   84:astore_1        
			parcel1.recycle();
		//   45   85:aload           4
		//   46   87:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   47   90:aload_3         
		//   48   91:invokevirtual   #61  <Method void Parcel.recycle()>
			throw sensorconnectorinfo;
		//   49   94:aload_1         
		//   50   95:athrow          
			parcel.writeInt(0);
		//   51   96:aload_3         
		//   52   97:iconst_0        
		//   53   98:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L4
		//*  54  101:goto            45
		}

		public void addPendingIntent(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo, PendingIntent pendingintent)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore          4
			parcel1 = Parcel.obtain();
		//    2    5:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    8:astore          5
			parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//    4   10:aload           4
		//    5   12:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//    6   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(sensorconnectorinfo == null) goto _L2; else goto _L1
		//    7   17:aload_1         
		//    8   18:ifnull          101
_L1:
			parcel.writeInt(1);
		//    9   21:aload           4
		//   10   23:iconst_1        
		//   11   24:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			sensorconnectorinfo.writeToParcel(parcel, 0);
		//   12   27:aload_1         
		//   13   28:aload           4
		//   14   30:iconst_0        
		//   15   31:invokevirtual   #46  <Method void SensorConnectorInfo.writeToParcel(Parcel, int)>
_L5:
			if(sensordeviceinfo == null) goto _L4; else goto _L3
		//   16   34:aload_2         
		//   17   35:ifnull          123
_L3:
			parcel.writeInt(1);
		//   18   38:aload           4
		//   19   40:iconst_1        
		//   20   41:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			sensordeviceinfo.writeToParcel(parcel, 0);
		//   21   44:aload_2         
		//   22   45:aload           4
		//   23   47:iconst_0        
		//   24   48:invokevirtual   #49  <Method void SensorDeviceInfo.writeToParcel(Parcel, int)>
_L6:
			if(pendingintent == null)
				break MISSING_BLOCK_LABEL_132;
		//   25   51:aload_3         
		//   26   52:ifnull          132
			parcel.writeInt(1);
		//   27   55:aload           4
		//   28   57:iconst_1        
		//   29   58:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			pendingintent.writeToParcel(parcel, 0);
		//   30   61:aload_3         
		//   31   62:aload           4
		//   32   64:iconst_0        
		//   33   65:invokevirtual   #67  <Method void PendingIntent.writeToParcel(Parcel, int)>
_L7:
			mRemote.transact(13, parcel, parcel1, 0);
		//   34   68:aload_0         
		//   35   69:getfield        #19  <Field IBinder mRemote>
		//   36   72:bipush          13
		//   37   74:aload           4
		//   38   76:aload           5
		//   39   78:iconst_0        
		//   40   79:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   41   84:pop             
			parcel1.readException();
		//   42   85:aload           5
		//   43   87:invokevirtual   #58  <Method void Parcel.readException()>
			parcel1.recycle();
		//   44   90:aload           5
		//   45   92:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   46   95:aload           4
		//   47   97:invokevirtual   #61  <Method void Parcel.recycle()>
			return;
		//   48  100:return          
_L2:
			parcel.writeInt(0);
		//   49  101:aload           4
		//   50  103:iconst_0        
		//   51  104:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L5
		//*  52  107:goto            34
			sensorconnectorinfo;
		//   53  110:astore_1        
			parcel1.recycle();
		//   54  111:aload           5
		//   55  113:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   56  116:aload           4
		//   57  118:invokevirtual   #61  <Method void Parcel.recycle()>
			throw sensorconnectorinfo;
		//   58  121:aload_1         
		//   59  122:athrow          
_L4:
			parcel.writeInt(0);
		//   60  123:aload           4
		//   61  125:iconst_0        
		//   62  126:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L6
		//*  63  129:goto            51
			parcel.writeInt(0);
		//   64  132:aload           4
		//   65  134:iconst_0        
		//   66  135:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L7
		//*  67  138:goto            68
		}

		public IBinder asBinder()
		{
			return mRemote;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field IBinder mRemote>
		//    2    4:areturn         
		}

		public SensorDeviceInfo getDeviceInfoById(String s)
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
			parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeString(s);
		//    7   14:aload_2         
		//    8   15:aload_1         
		//    9   16:invokevirtual   #74  <Method void Parcel.writeString(String)>
			mRemote.transact(17, parcel, parcel1, 0);
		//   10   19:aload_0         
		//   11   20:getfield        #19  <Field IBinder mRemote>
		//   12   23:bipush          17
		//   13   25:aload_2         
		//   14   26:aload_3         
		//   15   27:iconst_0        
		//   16   28:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   17   33:pop             
			parcel1.readException();
		//   18   34:aload_3         
		//   19   35:invokevirtual   #58  <Method void Parcel.readException()>
			if(parcel1.readInt() == 0) goto _L2; else goto _L1
		//   20   38:aload_3         
		//   21   39:invokevirtual   #78  <Method int Parcel.readInt()>
		//   22   42:ifeq            68
_L1:
			s = ((String) ((SensorDeviceInfo)SensorDeviceInfo.CREATOR.createFromParcel(parcel1)));
		//   23   45:getstatic       #82  <Field android.os.Parcelable$Creator SensorDeviceInfo.CREATOR>
		//   24   48:aload_3         
		//   25   49:invokeinterface #88  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   26   54:checkcast       #48  <Class SensorDeviceInfo>
		//   27   57:astore_1        
_L4:
			parcel1.recycle();
		//   28   58:aload_3         
		//   29   59:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   30   62:aload_2         
		//   31   63:invokevirtual   #61  <Method void Parcel.recycle()>
			return ((SensorDeviceInfo) (s));
		//   32   66:aload_1         
		//   33   67:areturn         
_L2:
			s = null;
		//   34   68:aconst_null     
		//   35   69:astore_1        
			if(true) goto _L4; else goto _L3
		//   36   70:goto            58
_L3:
			s;
		//   37   73:astore_1        
			parcel1.recycle();
		//   38   74:aload_3         
		//   39   75:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   40   78:aload_2         
		//   41   79:invokevirtual   #61  <Method void Parcel.recycle()>
			throw s;
		//   42   82:aload_1         
		//   43   83:athrow          
		}

		public String getInterfaceDescriptor()
		{
			return "com.samsung.android.sensor.aidl.ISensorServiceInterface";
		//    0    0:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//    1    2:areturn         
		}

		public List getRegisteredAccessoryDeviceInfoList()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_2        
			java.util.ArrayList arraylist;
			parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(8, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          8
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_2         
		//   16   30:invokevirtual   #58  <Method void Parcel.readException()>
			arraylist = parcel1.createTypedArrayList(SensorDeviceInfo.CREATOR);
		//   17   33:aload_2         
		//   18   34:getstatic       #82  <Field android.os.Parcelable$Creator SensorDeviceInfo.CREATOR>
		//   19   37:invokevirtual   #96  <Method java.util.ArrayList Parcel.createTypedArrayList(android.os.Parcelable$Creator)>
		//   20   40:astore_3        
			parcel1.recycle();
		//   21   41:aload_2         
		//   22   42:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   23   45:aload_1         
		//   24   46:invokevirtual   #61  <Method void Parcel.recycle()>
			return ((List) (arraylist));
		//   25   49:aload_3         
		//   26   50:areturn         
			Exception exception;
			exception;
		//   27   51:astore_3        
			parcel1.recycle();
		//   28   52:aload_2         
		//   29   53:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   30   56:aload_1         
		//   31   57:invokevirtual   #61  <Method void Parcel.recycle()>
			throw exception;
		//   32   60:aload_3         
		//   33   61:athrow          
		}

		public SensorDeviceInfo getSupportedAndroidDeviceInfo(int i)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeInt(i);
		//    7   15:aload_3         
		//    8   16:iload_1         
		//    9   17:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			mRemote.transact(2, parcel, parcel1, 0);
		//   10   20:aload_0         
		//   11   21:getfield        #19  <Field IBinder mRemote>
		//   12   24:iconst_2        
		//   13   25:aload_3         
		//   14   26:aload           4
		//   15   28:iconst_0        
		//   16   29:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   17   34:pop             
			parcel1.readException();
		//   18   35:aload           4
		//   19   37:invokevirtual   #58  <Method void Parcel.readException()>
			if(parcel1.readInt() == 0) goto _L2; else goto _L1
		//   20   40:aload           4
		//   21   42:invokevirtual   #78  <Method int Parcel.readInt()>
		//   22   45:ifeq            73
_L1:
			SensorDeviceInfo sensordeviceinfo = (SensorDeviceInfo)SensorDeviceInfo.CREATOR.createFromParcel(parcel1);
		//   23   48:getstatic       #82  <Field android.os.Parcelable$Creator SensorDeviceInfo.CREATOR>
		//   24   51:aload           4
		//   25   53:invokeinterface #88  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   26   58:checkcast       #48  <Class SensorDeviceInfo>
		//   27   61:astore_2        
_L4:
			parcel1.recycle();
		//   28   62:aload           4
		//   29   64:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   30   67:aload_3         
		//   31   68:invokevirtual   #61  <Method void Parcel.recycle()>
			return sensordeviceinfo;
		//   32   71:aload_2         
		//   33   72:areturn         
_L2:
			sensordeviceinfo = null;
		//   34   73:aconst_null     
		//   35   74:astore_2        
			if(true) goto _L4; else goto _L3
		//   36   75:goto            62
_L3:
			Exception exception;
			exception;
		//   37   78:astore_2        
			parcel1.recycle();
		//   38   79:aload           4
		//   39   81:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   40   84:aload_3         
		//   41   85:invokevirtual   #61  <Method void Parcel.recycle()>
			throw exception;
		//   42   88:aload_2         
		//   43   89:athrow          
		}

		public List getSupportedAndroidDeviceInfoList()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_2        
			java.util.ArrayList arraylist;
			parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(1, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:iconst_1        
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   27:pop             
			parcel1.readException();
		//   15   28:aload_2         
		//   16   29:invokevirtual   #58  <Method void Parcel.readException()>
			arraylist = parcel1.createTypedArrayList(SensorDeviceInfo.CREATOR);
		//   17   32:aload_2         
		//   18   33:getstatic       #82  <Field android.os.Parcelable$Creator SensorDeviceInfo.CREATOR>
		//   19   36:invokevirtual   #96  <Method java.util.ArrayList Parcel.createTypedArrayList(android.os.Parcelable$Creator)>
		//   20   39:astore_3        
			parcel1.recycle();
		//   21   40:aload_2         
		//   22   41:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   23   44:aload_1         
		//   24   45:invokevirtual   #61  <Method void Parcel.recycle()>
			return ((List) (arraylist));
		//   25   48:aload_3         
		//   26   49:areturn         
			Exception exception;
			exception;
		//   27   50:astore_3        
			parcel1.recycle();
		//   28   51:aload_2         
		//   29   52:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   30   55:aload_1         
		//   31   56:invokevirtual   #61  <Method void Parcel.recycle()>
			throw exception;
		//   32   59:aload_3         
		//   33   60:athrow          
		}

		public boolean isAndroidSensorSupported(int i)
			throws RemoteException
		{
			boolean flag;
			Parcel parcel;
			Parcel parcel1;
			flag = false;
		//    0    0:iconst_0        
		//    1    1:istore_2        
			parcel = Parcel.obtain();
		//    2    2:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    5:astore_3        
			parcel1 = Parcel.obtain();
		//    4    6:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    5    9:astore          4
			parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//    6   11:aload_3         
		//    7   12:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//    8   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeInt(i);
		//    9   17:aload_3         
		//   10   18:iload_1         
		//   11   19:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			mRemote.transact(3, parcel, parcel1, 0);
		//   12   22:aload_0         
		//   13   23:getfield        #19  <Field IBinder mRemote>
		//   14   26:iconst_3        
		//   15   27:aload_3         
		//   16   28:aload           4
		//   17   30:iconst_0        
		//   18   31:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   19   36:pop             
			parcel1.readException();
		//   20   37:aload           4
		//   21   39:invokevirtual   #58  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   22   42:aload           4
		//   23   44:invokevirtual   #78  <Method int Parcel.readInt()>
		//   24   47:istore_1        
			if(i != 0)
		//*  25   48:iload_1         
		//*  26   49:ifeq            54
				flag = true;
		//   27   52:iconst_1        
		//   28   53:istore_2        
			parcel1.recycle();
		//   29   54:aload           4
		//   30   56:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   31   59:aload_3         
		//   32   60:invokevirtual   #61  <Method void Parcel.recycle()>
			return flag;
		//   33   63:iload_2         
		//   34   64:ireturn         
			Exception exception;
			exception;
		//   35   65:astore          5
			parcel1.recycle();
		//   36   67:aload           4
		//   37   69:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   72:aload_3         
		//   39   73:invokevirtual   #61  <Method void Parcel.recycle()>
			throw exception;
		//   40   76:aload           5
		//   41   78:athrow          
		}

		public boolean registerAccessoryDeviceInfo(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo)
			throws RemoteException
		{
			boolean flag;
			Parcel parcel;
			Parcel parcel1;
			flag = true;
		//    0    0:iconst_1        
		//    1    1:istore          4
			parcel = Parcel.obtain();
		//    2    3:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    6:astore          5
			parcel1 = Parcel.obtain();
		//    4    8:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    5   11:astore          6
			parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//    6   13:aload           5
		//    7   15:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//    8   17:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(sensorconnectorinfo == null) goto _L2; else goto _L1
		//    9   20:aload_1         
		//   10   21:ifnull          99
_L1:
			parcel.writeInt(1);
		//   11   24:aload           5
		//   12   26:iconst_1        
		//   13   27:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			sensorconnectorinfo.writeToParcel(parcel, 0);
		//   14   30:aload_1         
		//   15   31:aload           5
		//   16   33:iconst_0        
		//   17   34:invokevirtual   #46  <Method void SensorConnectorInfo.writeToParcel(Parcel, int)>
_L3:
			if(sensordeviceinfo == null)
				break MISSING_BLOCK_LABEL_121;
		//   18   37:aload_2         
		//   19   38:ifnull          121
			parcel.writeInt(1);
		//   20   41:aload           5
		//   21   43:iconst_1        
		//   22   44:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			sensordeviceinfo.writeToParcel(parcel, 0);
		//   23   47:aload_2         
		//   24   48:aload           5
		//   25   50:iconst_0        
		//   26   51:invokevirtual   #49  <Method void SensorDeviceInfo.writeToParcel(Parcel, int)>
_L4:
			int i;
			mRemote.transact(6, parcel, parcel1, 0);
		//   27   54:aload_0         
		//   28   55:getfield        #19  <Field IBinder mRemote>
		//   29   58:bipush          6
		//   30   60:aload           5
		//   31   62:aload           6
		//   32   64:iconst_0        
		//   33   65:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   34   70:pop             
			parcel1.readException();
		//   35   71:aload           6
		//   36   73:invokevirtual   #58  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   37   76:aload           6
		//   38   78:invokevirtual   #78  <Method int Parcel.readInt()>
		//   39   81:istore_3        
			if(i == 0)
		//*  40   82:iload_3         
		//*  41   83:ifeq            130
		//*  42   86:aload           6
		//*  43   88:invokevirtual   #61  <Method void Parcel.recycle()>
		//*  44   91:aload           5
		//*  45   93:invokevirtual   #61  <Method void Parcel.recycle()>
		//*  46   96:iload           4
		//*  47   98:ireturn         
		//*  48   99:aload           5
		//*  49  101:iconst_0        
		//*  50  102:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		//*  51  105:goto            37
		//*  52  108:astore_1        
		//*  53  109:aload           6
		//*  54  111:invokevirtual   #61  <Method void Parcel.recycle()>
		//*  55  114:aload           5
		//*  56  116:invokevirtual   #61  <Method void Parcel.recycle()>
		//*  57  119:aload_1         
		//*  58  120:athrow          
		//*  59  121:aload           5
		//*  60  123:iconst_0        
		//*  61  124:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		//*  62  127:goto            54
				flag = false;
		//   63  130:iconst_0        
		//   64  131:istore          4
			parcel1.recycle();
			parcel.recycle();
			return flag;
_L2:
			parcel.writeInt(0);
			  goto _L3
			sensorconnectorinfo;
			parcel1.recycle();
			parcel.recycle();
			throw sensorconnectorinfo;
			parcel.writeInt(0);
			  goto _L4
		//*  65  133:goto            86
		}

		public void registerConnector(SensorConnectorInfo sensorconnectorinfo, ISensorServiceCallback isensorservicecallback)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(sensorconnectorinfo == null) goto _L2; else goto _L1
		//    7   15:aload_1         
		//    8   16:ifnull          77
_L1:
			parcel.writeInt(1);
		//    9   19:aload_3         
		//   10   20:iconst_1        
		//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			sensorconnectorinfo.writeToParcel(parcel, 0);
		//   12   24:aload_1         
		//   13   25:aload_3         
		//   14   26:iconst_0        
		//   15   27:invokevirtual   #46  <Method void SensorConnectorInfo.writeToParcel(Parcel, int)>
_L3:
			if(isensorservicecallback == null)
				break MISSING_BLOCK_LABEL_97;
		//   16   30:aload_2         
		//   17   31:ifnull          97
			sensorconnectorinfo = ((SensorConnectorInfo) (isensorservicecallback.asBinder()));
		//   18   34:aload_2         
		//   19   35:invokeinterface #111 <Method IBinder ISensorServiceCallback.asBinder()>
		//   20   40:astore_1        
_L4:
			parcel.writeStrongBinder(((IBinder) (sensorconnectorinfo)));
		//   21   41:aload_3         
		//   22   42:aload_1         
		//   23   43:invokevirtual   #114 <Method void Parcel.writeStrongBinder(IBinder)>
			mRemote.transact(15, parcel, parcel1, 0);
		//   24   46:aload_0         
		//   25   47:getfield        #19  <Field IBinder mRemote>
		//   26   50:bipush          15
		//   27   52:aload_3         
		//   28   53:aload           4
		//   29   55:iconst_0        
		//   30   56:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   31   61:pop             
			parcel1.readException();
		//   32   62:aload           4
		//   33   64:invokevirtual   #58  <Method void Parcel.readException()>
			parcel1.recycle();
		//   34   67:aload           4
		//   35   69:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   72:aload_3         
		//   37   73:invokevirtual   #61  <Method void Parcel.recycle()>
			return;
		//   38   76:return          
_L2:
			parcel.writeInt(0);
		//   39   77:aload_3         
		//   40   78:iconst_0        
		//   41   79:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L3
		//*  42   82:goto            30
			sensorconnectorinfo;
		//   43   85:astore_1        
			parcel1.recycle();
		//   44   86:aload           4
		//   45   88:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   46   91:aload_3         
		//   47   92:invokevirtual   #61  <Method void Parcel.recycle()>
			throw sensorconnectorinfo;
		//   48   95:aload_1         
		//   49   96:athrow          
			sensorconnectorinfo = null;
		//   50   97:aconst_null     
		//   51   98:astore_1        
			  goto _L4
		//*  52   99:goto            41
		}

		public void releaseAccess(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(sensorconnectorinfo == null) goto _L2; else goto _L1
		//    7   15:aload_1         
		//    8   16:ifnull          76
_L1:
			parcel.writeInt(1);
		//    9   19:aload_3         
		//   10   20:iconst_1        
		//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			sensorconnectorinfo.writeToParcel(parcel, 0);
		//   12   24:aload_1         
		//   13   25:aload_3         
		//   14   26:iconst_0        
		//   15   27:invokevirtual   #46  <Method void SensorConnectorInfo.writeToParcel(Parcel, int)>
_L3:
			if(sensordeviceinfo == null)
				break MISSING_BLOCK_LABEL_96;
		//   16   30:aload_2         
		//   17   31:ifnull          96
			parcel.writeInt(1);
		//   18   34:aload_3         
		//   19   35:iconst_1        
		//   20   36:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			sensordeviceinfo.writeToParcel(parcel, 0);
		//   21   39:aload_2         
		//   22   40:aload_3         
		//   23   41:iconst_0        
		//   24   42:invokevirtual   #49  <Method void SensorDeviceInfo.writeToParcel(Parcel, int)>
_L4:
			mRemote.transact(10, parcel, parcel1, 0);
		//   25   45:aload_0         
		//   26   46:getfield        #19  <Field IBinder mRemote>
		//   27   49:bipush          10
		//   28   51:aload_3         
		//   29   52:aload           4
		//   30   54:iconst_0        
		//   31   55:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   32   60:pop             
			parcel1.readException();
		//   33   61:aload           4
		//   34   63:invokevirtual   #58  <Method void Parcel.readException()>
			parcel1.recycle();
		//   35   66:aload           4
		//   36   68:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   37   71:aload_3         
		//   38   72:invokevirtual   #61  <Method void Parcel.recycle()>
			return;
		//   39   75:return          
_L2:
			parcel.writeInt(0);
		//   40   76:aload_3         
		//   41   77:iconst_0        
		//   42   78:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L3
		//*  43   81:goto            30
			sensorconnectorinfo;
		//   44   84:astore_1        
			parcel1.recycle();
		//   45   85:aload           4
		//   46   87:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   47   90:aload_3         
		//   48   91:invokevirtual   #61  <Method void Parcel.recycle()>
			throw sensorconnectorinfo;
		//   49   94:aload_1         
		//   50   95:athrow          
			parcel.writeInt(0);
		//   51   96:aload_3         
		//   52   97:iconst_0        
		//   53   98:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L4
		//*  54  101:goto            45
		}

		public void removeListener(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(sensorconnectorinfo == null) goto _L2; else goto _L1
		//    7   15:aload_1         
		//    8   16:ifnull          76
_L1:
			parcel.writeInt(1);
		//    9   19:aload_3         
		//   10   20:iconst_1        
		//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			sensorconnectorinfo.writeToParcel(parcel, 0);
		//   12   24:aload_1         
		//   13   25:aload_3         
		//   14   26:iconst_0        
		//   15   27:invokevirtual   #46  <Method void SensorConnectorInfo.writeToParcel(Parcel, int)>
_L3:
			if(sensordeviceinfo == null)
				break MISSING_BLOCK_LABEL_96;
		//   16   30:aload_2         
		//   17   31:ifnull          96
			parcel.writeInt(1);
		//   18   34:aload_3         
		//   19   35:iconst_1        
		//   20   36:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			sensordeviceinfo.writeToParcel(parcel, 0);
		//   21   39:aload_2         
		//   22   40:aload_3         
		//   23   41:iconst_0        
		//   24   42:invokevirtual   #49  <Method void SensorDeviceInfo.writeToParcel(Parcel, int)>
_L4:
			mRemote.transact(12, parcel, parcel1, 0);
		//   25   45:aload_0         
		//   26   46:getfield        #19  <Field IBinder mRemote>
		//   27   49:bipush          12
		//   28   51:aload_3         
		//   29   52:aload           4
		//   30   54:iconst_0        
		//   31   55:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   32   60:pop             
			parcel1.readException();
		//   33   61:aload           4
		//   34   63:invokevirtual   #58  <Method void Parcel.readException()>
			parcel1.recycle();
		//   35   66:aload           4
		//   36   68:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   37   71:aload_3         
		//   38   72:invokevirtual   #61  <Method void Parcel.recycle()>
			return;
		//   39   75:return          
_L2:
			parcel.writeInt(0);
		//   40   76:aload_3         
		//   41   77:iconst_0        
		//   42   78:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L3
		//*  43   81:goto            30
			sensorconnectorinfo;
		//   44   84:astore_1        
			parcel1.recycle();
		//   45   85:aload           4
		//   46   87:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   47   90:aload_3         
		//   48   91:invokevirtual   #61  <Method void Parcel.recycle()>
			throw sensorconnectorinfo;
		//   49   94:aload_1         
		//   50   95:athrow          
			parcel.writeInt(0);
		//   51   96:aload_3         
		//   52   97:iconst_0        
		//   53   98:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L4
		//*  54  101:goto            45
		}

		public void removePendingIntent(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo, PendingIntent pendingintent)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore          4
			parcel1 = Parcel.obtain();
		//    2    5:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    8:astore          5
			parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//    4   10:aload           4
		//    5   12:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//    6   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(sensorconnectorinfo == null) goto _L2; else goto _L1
		//    7   17:aload_1         
		//    8   18:ifnull          101
_L1:
			parcel.writeInt(1);
		//    9   21:aload           4
		//   10   23:iconst_1        
		//   11   24:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			sensorconnectorinfo.writeToParcel(parcel, 0);
		//   12   27:aload_1         
		//   13   28:aload           4
		//   14   30:iconst_0        
		//   15   31:invokevirtual   #46  <Method void SensorConnectorInfo.writeToParcel(Parcel, int)>
_L5:
			if(sensordeviceinfo == null) goto _L4; else goto _L3
		//   16   34:aload_2         
		//   17   35:ifnull          123
_L3:
			parcel.writeInt(1);
		//   18   38:aload           4
		//   19   40:iconst_1        
		//   20   41:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			sensordeviceinfo.writeToParcel(parcel, 0);
		//   21   44:aload_2         
		//   22   45:aload           4
		//   23   47:iconst_0        
		//   24   48:invokevirtual   #49  <Method void SensorDeviceInfo.writeToParcel(Parcel, int)>
_L6:
			if(pendingintent == null)
				break MISSING_BLOCK_LABEL_132;
		//   25   51:aload_3         
		//   26   52:ifnull          132
			parcel.writeInt(1);
		//   27   55:aload           4
		//   28   57:iconst_1        
		//   29   58:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			pendingintent.writeToParcel(parcel, 0);
		//   30   61:aload_3         
		//   31   62:aload           4
		//   32   64:iconst_0        
		//   33   65:invokevirtual   #67  <Method void PendingIntent.writeToParcel(Parcel, int)>
_L7:
			mRemote.transact(14, parcel, parcel1, 0);
		//   34   68:aload_0         
		//   35   69:getfield        #19  <Field IBinder mRemote>
		//   36   72:bipush          14
		//   37   74:aload           4
		//   38   76:aload           5
		//   39   78:iconst_0        
		//   40   79:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   41   84:pop             
			parcel1.readException();
		//   42   85:aload           5
		//   43   87:invokevirtual   #58  <Method void Parcel.readException()>
			parcel1.recycle();
		//   44   90:aload           5
		//   45   92:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   46   95:aload           4
		//   47   97:invokevirtual   #61  <Method void Parcel.recycle()>
			return;
		//   48  100:return          
_L2:
			parcel.writeInt(0);
		//   49  101:aload           4
		//   50  103:iconst_0        
		//   51  104:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L5
		//*  52  107:goto            34
			sensorconnectorinfo;
		//   53  110:astore_1        
			parcel1.recycle();
		//   54  111:aload           5
		//   55  113:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   56  116:aload           4
		//   57  118:invokevirtual   #61  <Method void Parcel.recycle()>
			throw sensorconnectorinfo;
		//   58  121:aload_1         
		//   59  122:athrow          
_L4:
			parcel.writeInt(0);
		//   60  123:aload           4
		//   61  125:iconst_0        
		//   62  126:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L6
		//*  63  129:goto            51
			parcel.writeInt(0);
		//   64  132:aload           4
		//   65  134:iconst_0        
		//   66  135:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L7
		//*  67  138:goto            68
		}

		public void requestAccess(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(sensorconnectorinfo == null) goto _L2; else goto _L1
		//    7   15:aload_1         
		//    8   16:ifnull          76
_L1:
			parcel.writeInt(1);
		//    9   19:aload_3         
		//   10   20:iconst_1        
		//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			sensorconnectorinfo.writeToParcel(parcel, 0);
		//   12   24:aload_1         
		//   13   25:aload_3         
		//   14   26:iconst_0        
		//   15   27:invokevirtual   #46  <Method void SensorConnectorInfo.writeToParcel(Parcel, int)>
_L3:
			if(sensordeviceinfo == null)
				break MISSING_BLOCK_LABEL_96;
		//   16   30:aload_2         
		//   17   31:ifnull          96
			parcel.writeInt(1);
		//   18   34:aload_3         
		//   19   35:iconst_1        
		//   20   36:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			sensordeviceinfo.writeToParcel(parcel, 0);
		//   21   39:aload_2         
		//   22   40:aload_3         
		//   23   41:iconst_0        
		//   24   42:invokevirtual   #49  <Method void SensorDeviceInfo.writeToParcel(Parcel, int)>
_L4:
			mRemote.transact(9, parcel, parcel1, 0);
		//   25   45:aload_0         
		//   26   46:getfield        #19  <Field IBinder mRemote>
		//   27   49:bipush          9
		//   28   51:aload_3         
		//   29   52:aload           4
		//   30   54:iconst_0        
		//   31   55:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   32   60:pop             
			parcel1.readException();
		//   33   61:aload           4
		//   34   63:invokevirtual   #58  <Method void Parcel.readException()>
			parcel1.recycle();
		//   35   66:aload           4
		//   36   68:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   37   71:aload_3         
		//   38   72:invokevirtual   #61  <Method void Parcel.recycle()>
			return;
		//   39   75:return          
_L2:
			parcel.writeInt(0);
		//   40   76:aload_3         
		//   41   77:iconst_0        
		//   42   78:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L3
		//*  43   81:goto            30
			sensorconnectorinfo;
		//   44   84:astore_1        
			parcel1.recycle();
		//   45   85:aload           4
		//   46   87:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   47   90:aload_3         
		//   48   91:invokevirtual   #61  <Method void Parcel.recycle()>
			throw sensorconnectorinfo;
		//   49   94:aload_1         
		//   50   95:athrow          
			parcel.writeInt(0);
		//   51   96:aload_3         
		//   52   97:iconst_0        
		//   53   98:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L4
		//*  54  101:goto            45
		}

		public void setBluetoothIdentifier(List list)
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
			parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeStringList(list);
		//    7   14:aload_2         
		//    8   15:aload_1         
		//    9   16:invokevirtual   #123 <Method void Parcel.writeStringList(List)>
			mRemote.transact(18, parcel, parcel1, 0);
		//   10   19:aload_0         
		//   11   20:getfield        #19  <Field IBinder mRemote>
		//   12   23:bipush          18
		//   13   25:aload_2         
		//   14   26:aload_3         
		//   15   27:iconst_0        
		//   16   28:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   17   33:pop             
			parcel1.readException();
		//   18   34:aload_3         
		//   19   35:invokevirtual   #58  <Method void Parcel.readException()>
			parcel1.recycle();
		//   20   38:aload_3         
		//   21   39:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   42:aload_2         
		//   23   43:invokevirtual   #61  <Method void Parcel.recycle()>
			return;
		//   24   46:return          
			list;
		//   25   47:astore_1        
			parcel1.recycle();
		//   26   48:aload_3         
		//   27   49:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   52:aload_2         
		//   29   53:invokevirtual   #61  <Method void Parcel.recycle()>
			throw list;
		//   30   56:aload_1         
		//   31   57:athrow          
		}

		public void startAccessoryDeviceScan(SensorConnectorInfo sensorconnectorinfo, ISensorDeviceScanCallback isensordevicescancallback)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(sensorconnectorinfo == null) goto _L2; else goto _L1
		//    7   15:aload_1         
		//    8   16:ifnull          76
_L1:
			parcel.writeInt(1);
		//    9   19:aload_3         
		//   10   20:iconst_1        
		//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			sensorconnectorinfo.writeToParcel(parcel, 0);
		//   12   24:aload_1         
		//   13   25:aload_3         
		//   14   26:iconst_0        
		//   15   27:invokevirtual   #46  <Method void SensorConnectorInfo.writeToParcel(Parcel, int)>
_L3:
			if(isensordevicescancallback == null)
				break MISSING_BLOCK_LABEL_96;
		//   16   30:aload_2         
		//   17   31:ifnull          96
			sensorconnectorinfo = ((SensorConnectorInfo) (isensordevicescancallback.asBinder()));
		//   18   34:aload_2         
		//   19   35:invokeinterface #129 <Method IBinder ISensorDeviceScanCallback.asBinder()>
		//   20   40:astore_1        
_L4:
			parcel.writeStrongBinder(((IBinder) (sensorconnectorinfo)));
		//   21   41:aload_3         
		//   22   42:aload_1         
		//   23   43:invokevirtual   #114 <Method void Parcel.writeStrongBinder(IBinder)>
			mRemote.transact(4, parcel, parcel1, 0);
		//   24   46:aload_0         
		//   25   47:getfield        #19  <Field IBinder mRemote>
		//   26   50:iconst_4        
		//   27   51:aload_3         
		//   28   52:aload           4
		//   29   54:iconst_0        
		//   30   55:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   31   60:pop             
			parcel1.readException();
		//   32   61:aload           4
		//   33   63:invokevirtual   #58  <Method void Parcel.readException()>
			parcel1.recycle();
		//   34   66:aload           4
		//   35   68:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   71:aload_3         
		//   37   72:invokevirtual   #61  <Method void Parcel.recycle()>
			return;
		//   38   75:return          
_L2:
			parcel.writeInt(0);
		//   39   76:aload_3         
		//   40   77:iconst_0        
		//   41   78:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L3
		//*  42   81:goto            30
			sensorconnectorinfo;
		//   43   84:astore_1        
			parcel1.recycle();
		//   44   85:aload           4
		//   45   87:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   46   90:aload_3         
		//   47   91:invokevirtual   #61  <Method void Parcel.recycle()>
			throw sensorconnectorinfo;
		//   48   94:aload_1         
		//   49   95:athrow          
			sensorconnectorinfo = null;
		//   50   96:aconst_null     
		//   51   97:astore_1        
			  goto _L4
		//*  52   98:goto            41
		}

		public void stopAccessoryDeviceScan(SensorConnectorInfo sensorconnectorinfo)
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
			parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(sensorconnectorinfo == null)
				break MISSING_BLOCK_LABEL_56;
		//    7   14:aload_1         
		//    8   15:ifnull          56
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			sensorconnectorinfo.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #46  <Method void SensorConnectorInfo.writeToParcel(Parcel, int)>
_L1:
			mRemote.transact(5, parcel, parcel1, 0);
		//   16   29:aload_0         
		//   17   30:getfield        #19  <Field IBinder mRemote>
		//   18   33:iconst_5        
		//   19   34:aload_2         
		//   20   35:aload_3         
		//   21   36:iconst_0        
		//   22   37:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   23   42:pop             
			parcel1.readException();
		//   24   43:aload_3         
		//   25   44:invokevirtual   #58  <Method void Parcel.readException()>
			parcel1.recycle();
		//   26   47:aload_3         
		//   27   48:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   51:aload_2         
		//   29   52:invokevirtual   #61  <Method void Parcel.recycle()>
			return;
		//   30   55:return          
			parcel.writeInt(0);
		//   31   56:aload_2         
		//   32   57:iconst_0        
		//   33   58:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L1
		//*  34   61:goto            29
			sensorconnectorinfo;
		//   35   64:astore_1        
			parcel1.recycle();
		//   36   65:aload_3         
		//   37   66:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   69:aload_2         
		//   39   70:invokevirtual   #61  <Method void Parcel.recycle()>
			throw sensorconnectorinfo;
		//   40   73:aload_1         
		//   41   74:athrow          
		}

		public void unregisterAccessoryDeviceInfo(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(sensorconnectorinfo == null) goto _L2; else goto _L1
		//    7   15:aload_1         
		//    8   16:ifnull          76
_L1:
			parcel.writeInt(1);
		//    9   19:aload_3         
		//   10   20:iconst_1        
		//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			sensorconnectorinfo.writeToParcel(parcel, 0);
		//   12   24:aload_1         
		//   13   25:aload_3         
		//   14   26:iconst_0        
		//   15   27:invokevirtual   #46  <Method void SensorConnectorInfo.writeToParcel(Parcel, int)>
_L3:
			if(sensordeviceinfo == null)
				break MISSING_BLOCK_LABEL_96;
		//   16   30:aload_2         
		//   17   31:ifnull          96
			parcel.writeInt(1);
		//   18   34:aload_3         
		//   19   35:iconst_1        
		//   20   36:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			sensordeviceinfo.writeToParcel(parcel, 0);
		//   21   39:aload_2         
		//   22   40:aload_3         
		//   23   41:iconst_0        
		//   24   42:invokevirtual   #49  <Method void SensorDeviceInfo.writeToParcel(Parcel, int)>
_L4:
			mRemote.transact(7, parcel, parcel1, 0);
		//   25   45:aload_0         
		//   26   46:getfield        #19  <Field IBinder mRemote>
		//   27   49:bipush          7
		//   28   51:aload_3         
		//   29   52:aload           4
		//   30   54:iconst_0        
		//   31   55:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   32   60:pop             
			parcel1.readException();
		//   33   61:aload           4
		//   34   63:invokevirtual   #58  <Method void Parcel.readException()>
			parcel1.recycle();
		//   35   66:aload           4
		//   36   68:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   37   71:aload_3         
		//   38   72:invokevirtual   #61  <Method void Parcel.recycle()>
			return;
		//   39   75:return          
_L2:
			parcel.writeInt(0);
		//   40   76:aload_3         
		//   41   77:iconst_0        
		//   42   78:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L3
		//*  43   81:goto            30
			sensorconnectorinfo;
		//   44   84:astore_1        
			parcel1.recycle();
		//   45   85:aload           4
		//   46   87:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   47   90:aload_3         
		//   48   91:invokevirtual   #61  <Method void Parcel.recycle()>
			throw sensorconnectorinfo;
		//   49   94:aload_1         
		//   50   95:athrow          
			parcel.writeInt(0);
		//   51   96:aload_3         
		//   52   97:iconst_0        
		//   53   98:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L4
		//*  54  101:goto            45
		}

		public void unregisterConnector(SensorConnectorInfo sensorconnectorinfo)
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
			parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(sensorconnectorinfo == null)
				break MISSING_BLOCK_LABEL_57;
		//    7   14:aload_1         
		//    8   15:ifnull          57
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			sensorconnectorinfo.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #46  <Method void SensorConnectorInfo.writeToParcel(Parcel, int)>
_L1:
			mRemote.transact(16, parcel, parcel1, 0);
		//   16   29:aload_0         
		//   17   30:getfield        #19  <Field IBinder mRemote>
		//   18   33:bipush          16
		//   19   35:aload_2         
		//   20   36:aload_3         
		//   21   37:iconst_0        
		//   22   38:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   23   43:pop             
			parcel1.readException();
		//   24   44:aload_3         
		//   25   45:invokevirtual   #58  <Method void Parcel.readException()>
			parcel1.recycle();
		//   26   48:aload_3         
		//   27   49:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   52:aload_2         
		//   29   53:invokevirtual   #61  <Method void Parcel.recycle()>
			return;
		//   30   56:return          
			parcel.writeInt(0);
		//   31   57:aload_2         
		//   32   58:iconst_0        
		//   33   59:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L1
		//*  34   62:goto            29
			sensorconnectorinfo;
		//   35   65:astore_1        
			parcel1.recycle();
		//   36   66:aload_3         
		//   37   67:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   70:aload_2         
		//   39   71:invokevirtual   #61  <Method void Parcel.recycle()>
			throw sensorconnectorinfo;
		//   40   74:aload_1         
		//   41   75:athrow          
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


	public abstract void addListener(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo)
		throws RemoteException;

	public abstract void addPendingIntent(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo, PendingIntent pendingintent)
		throws RemoteException;

	public abstract SensorDeviceInfo getDeviceInfoById(String s)
		throws RemoteException;

	public abstract List getRegisteredAccessoryDeviceInfoList()
		throws RemoteException;

	public abstract SensorDeviceInfo getSupportedAndroidDeviceInfo(int i)
		throws RemoteException;

	public abstract List getSupportedAndroidDeviceInfoList()
		throws RemoteException;

	public abstract boolean isAndroidSensorSupported(int i)
		throws RemoteException;

	public abstract boolean registerAccessoryDeviceInfo(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo)
		throws RemoteException;

	public abstract void registerConnector(SensorConnectorInfo sensorconnectorinfo, ISensorServiceCallback isensorservicecallback)
		throws RemoteException;

	public abstract void releaseAccess(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo)
		throws RemoteException;

	public abstract void removeListener(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo)
		throws RemoteException;

	public abstract void removePendingIntent(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo, PendingIntent pendingintent)
		throws RemoteException;

	public abstract void requestAccess(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo)
		throws RemoteException;

	public abstract void setBluetoothIdentifier(List list)
		throws RemoteException;

	public abstract void startAccessoryDeviceScan(SensorConnectorInfo sensorconnectorinfo, ISensorDeviceScanCallback isensordevicescancallback)
		throws RemoteException;

	public abstract void stopAccessoryDeviceScan(SensorConnectorInfo sensorconnectorinfo)
		throws RemoteException;

	public abstract void unregisterAccessoryDeviceInfo(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo)
		throws RemoteException;

	public abstract void unregisterConnector(SensorConnectorInfo sensorconnectorinfo)
		throws RemoteException;
}
