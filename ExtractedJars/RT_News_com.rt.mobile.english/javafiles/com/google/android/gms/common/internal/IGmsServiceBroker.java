// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.*;

// Referenced classes of package com.google.android.gms.common.internal:
//			IGmsCallbacks, GetServiceRequest, ValidateAccountRequest

public interface IGmsServiceBroker
	extends IInterface
{
	public static abstract class Stub extends Binder
		implements IGmsServiceBroker
	{

		public static IGmsServiceBroker asInterface(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
		//    4    6:aload_0         
		//    5    7:ldc1            #16  <String "com.google.android.gms.common.internal.IGmsServiceBroker">
		//    6    9:invokeinterface #29  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface != null && (iinterface instanceof IGmsServiceBroker))
		//*   8   15:aload_1         
		//*   9   16:ifnull          31
		//*  10   19:aload_1         
		//*  11   20:instanceof      #6   <Class IGmsServiceBroker>
		//*  12   23:ifeq            31
				return (IGmsServiceBroker)iinterface;
		//   13   26:aload_1         
		//   14   27:checkcast       #6   <Class IGmsServiceBroker>
		//   15   30:areturn         
			else
				return ((IGmsServiceBroker) (new zza(ibinder)));
		//   16   31:new             #9   <Class IGmsServiceBroker$Stub$zza>
		//   17   34:dup             
		//   18   35:aload_0         
		//   19   36:invokespecial   #32  <Method void IGmsServiceBroker$Stub$zza(IBinder)>
		//   20   39:areturn         
		}

		public IBinder asBinder()
		{
			return ((IBinder) (this));
		//    0    0:aload_0         
		//    1    1:areturn         
		}

		protected void getLegacyService(int i, IGmsCallbacks igmscallbacks, int j, String s, String s1, String as[], Bundle bundle, 
				IBinder ibinder, String s2, String s3)
			throws RemoteException
		{
			throw new UnsupportedOperationException();
		//    0    0:new             #40  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:invokespecial   #41  <Method void UnsupportedOperationException()>
		//    3    7:athrow          
		}

		public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
			throws RemoteException
		{
			String s;
			IGmsCallbacks igmscallbacks;
			if(i > 0xffffff)
		//*   0    0:iload_1         
		//*   1    1:ldc1            #45  <Int 0xffffff>
		//*   2    3:icmple          16
				return super.onTransact(i, parcel, parcel1, j);
		//    3    6:aload_0         
		//    4    7:iload_1         
		//    5    8:aload_2         
		//    6    9:aload_3         
		//    7   10:iload           4
		//    8   12:invokespecial   #47  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//    9   15:ireturn         
			parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
		//   10   16:aload_2         
		//   11   17:ldc1            #16  <String "com.google.android.gms.common.internal.IGmsServiceBroker">
		//   12   19:invokevirtual   #53  <Method void Parcel.enforceInterface(String)>
			igmscallbacks = IGmsCallbacks.Stub.asInterface(parcel.readStrongBinder());
		//   13   22:aload_2         
		//   14   23:invokevirtual   #56  <Method IBinder Parcel.readStrongBinder()>
		//   15   26:invokestatic    #61  <Method IGmsCallbacks IGmsCallbacks$Stub.asInterface(IBinder)>
		//   16   29:astore          14
			Object obj1 = null;
		//   17   31:aconst_null     
		//   18   32:astore          6
			GetServiceRequest getservicerequest = null;
		//   19   34:aconst_null     
		//   20   35:astore          5
			if(i == 46)
		//*  21   37:iload_1         
		//*  22   38:bipush          46
		//*  23   40:icmpne          75
			{
				if(parcel.readInt() != 0)
		//*  24   43:aload_2         
		//*  25   44:invokevirtual   #65  <Method int Parcel.readInt()>
		//*  26   47:ifeq            64
					getservicerequest = (GetServiceRequest)GetServiceRequest.CREATOR.createFromParcel(parcel);
		//   27   50:getstatic       #71  <Field android.os.Parcelable$Creator GetServiceRequest.CREATOR>
		//   28   53:aload_2         
		//   29   54:invokeinterface #77  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   30   59:checkcast       #67  <Class GetServiceRequest>
		//   31   62:astore          5
				getService(igmscallbacks, getservicerequest);
		//   32   64:aload_0         
		//   33   65:aload           14
		//   34   67:aload           5
		//   35   69:invokevirtual   #81  <Method void getService(IGmsCallbacks, GetServiceRequest)>
				break MISSING_BLOCK_LABEL_677;
		//   36   72:goto            677
			}
			if(i == 47)
		//*  37   75:iload_1         
		//*  38   76:bipush          47
		//*  39   78:icmpne          117
			{
				ValidateAccountRequest validateaccountrequest = ((ValidateAccountRequest) (obj1));
		//   40   81:aload           6
		//   41   83:astore          5
				if(parcel.readInt() != 0)
		//*  42   85:aload_2         
		//*  43   86:invokevirtual   #65  <Method int Parcel.readInt()>
		//*  44   89:ifeq            106
					validateaccountrequest = (ValidateAccountRequest)ValidateAccountRequest.CREATOR.createFromParcel(parcel);
		//   45   92:getstatic       #84  <Field android.os.Parcelable$Creator ValidateAccountRequest.CREATOR>
		//   46   95:aload_2         
		//   47   96:invokeinterface #77  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   48  101:checkcast       #83  <Class ValidateAccountRequest>
		//   49  104:astore          5
				validateAccount(igmscallbacks, validateaccountrequest);
		//   50  106:aload_0         
		//   51  107:aload           14
		//   52  109:aload           5
		//   53  111:invokevirtual   #88  <Method void validateAccount(IGmsCallbacks, ValidateAccountRequest)>
				break MISSING_BLOCK_LABEL_677;
		//   54  114:goto            677
			}
			j = parcel.readInt();
		//   55  117:aload_2         
		//   56  118:invokevirtual   #65  <Method int Parcel.readInt()>
		//   57  121:istore          4
			if(i != 4)
		//*  58  123:iload_1         
		//*  59  124:iconst_4        
		//*  60  125:icmpeq          137
				s = parcel.readString();
		//   61  128:aload_2         
		//   62  129:invokevirtual   #92  <Method String Parcel.readString()>
		//   63  132:astore          13
			else
		//*  64  134:goto            140
				s = null;
		//   65  137:aconst_null     
		//   66  138:astore          13
			if(i == 23 || i == 25 || i == 27) goto _L2; else goto _L1
		//   67  140:iload_1         
		//   68  141:bipush          23
		//   69  143:icmpeq          582
		//   70  146:iload_1         
		//   71  147:bipush          25
		//   72  149:icmpeq          582
		//   73  152:iload_1         
		//   74  153:bipush          27
		//   75  155:icmpeq          582
_L1:
			if(i == 30) goto _L4; else goto _L3
		//   76  158:iload_1         
		//   77  159:bipush          30
		//   78  161:icmpeq          532
_L3:
			if(i == 34) goto _L6; else goto _L5
		//   79  164:iload_1         
		//   80  165:bipush          34
		//   81  167:icmpeq          523
_L5:
			if(i == 41 || i == 43) goto _L2; else goto _L7
		//   82  170:iload_1         
		//   83  171:bipush          41
		//   84  173:icmpeq          582
		//   85  176:iload_1         
		//   86  177:bipush          43
		//   87  179:icmpeq          582
_L7:
			i;
		//   88  182:iload_1         
			JVM INSTR tableswitch 1 2: default 204
		//		               1 459
		//		               2 582;
		//   89  183:tableswitch     1 2: default 204
		//		               1 459
		//		               2 582
			   goto _L8 _L9 _L2
_L8:
			i;
		//   90  204:iload_1         
			JVM INSTR tableswitch 5 20: default 284
		//		               5 582
		//		               6 582
		//		               7 582
		//		               8 582
		//		               9 385
		//		               10 368
		//		               11 582
		//		               12 582
		//		               13 582
		//		               14 582
		//		               15 582
		//		               16 582
		//		               17 582
		//		               18 582
		//		               19 311
		//		               20 532;
		//   91  205:tableswitch     5 20: default 284
		//		               5 582
		//		               6 582
		//		               7 582
		//		               8 582
		//		               9 385
		//		               10 368
		//		               11 582
		//		               12 582
		//		               13 582
		//		               14 582
		//		               15 582
		//		               16 582
		//		               17 582
		//		               18 582
		//		               19 311
		//		               20 532
			   goto _L10 _L2 _L2 _L2 _L2 _L11 _L12 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L13 _L4
_L10:
			i;
		//   92  284:iload_1         
			JVM INSTR tableswitch 37 38: default 308
		//		               37 582
		//		               38 582;
		//   93  285:tableswitch     37 38: default 308
		//		               37 582
		//		               38 582
			   goto _L14 _L2 _L2
		//*  94  308:goto            617
_L13:
			Object obj;
			Object obj2;
			Object obj3;
			Object obj4;
			obj4 = ((Object) (parcel.readStrongBinder()));
		//   95  311:aload_2         
		//   96  312:invokevirtual   #56  <Method IBinder Parcel.readStrongBinder()>
		//   97  315:astore          8
			if(parcel.readInt() != 0)
		//*  98  317:aload_2         
		//*  99  318:invokevirtual   #65  <Method int Parcel.readInt()>
		//* 100  321:ifeq            351
			{
				obj3 = ((Object) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//  101  324:getstatic       #95  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//  102  327:aload_2         
		//  103  328:invokeinterface #77  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  104  333:checkcast       #94  <Class Bundle>
		//  105  336:astore          7
				obj = null;
		//  106  338:aconst_null     
		//  107  339:astore          5
				obj2 = obj;
		//  108  341:aload           5
		//  109  343:astore          6
				parcel = ((Parcel) (obj2));
		//  110  345:aload           6
		//  111  347:astore_2        
			} else
		//* 112  348:goto            634
			{
				obj = null;
		//  113  351:aconst_null     
		//  114  352:astore          5
				obj2 = obj;
		//  115  354:aload           5
		//  116  356:astore          6
				obj3 = obj2;
		//  117  358:aload           6
		//  118  360:astore          7
				parcel = ((Parcel) (obj3));
		//  119  362:aload           7
		//  120  364:astore_2        
			}
			  goto _L15
		//* 121  365:goto            634
_L12:
			obj = ((Object) (parcel.readString()));
		//  122  368:aload_2         
		//  123  369:invokevirtual   #92  <Method String Parcel.readString()>
		//  124  372:astore          5
			obj2 = ((Object) (parcel.createStringArray()));
		//  125  374:aload_2         
		//  126  375:invokevirtual   #99  <Method String[] Parcel.createStringArray()>
		//  127  378:astore          6
			parcel = null;
		//  128  380:aconst_null     
		//  129  381:astore_2        
			  goto _L16
		//* 130  382:goto            625
_L11:
			String as[];
			obj = ((Object) (parcel.readString()));
		//  131  385:aload_2         
		//  132  386:invokevirtual   #92  <Method String Parcel.readString()>
		//  133  389:astore          5
			as = parcel.createStringArray();
		//  134  391:aload_2         
		//  135  392:invokevirtual   #99  <Method String[] Parcel.createStringArray()>
		//  136  395:astore          9
			obj2 = ((Object) (parcel.readString()));
		//  137  397:aload_2         
		//  138  398:invokevirtual   #92  <Method String Parcel.readString()>
		//  139  401:astore          6
			IBinder ibinder = parcel.readStrongBinder();
		//  140  403:aload_2         
		//  141  404:invokevirtual   #56  <Method IBinder Parcel.readStrongBinder()>
		//  142  407:astore          10
			obj3 = ((Object) (parcel.readString()));
		//  143  409:aload_2         
		//  144  410:invokevirtual   #92  <Method String Parcel.readString()>
		//  145  413:astore          7
			if(parcel.readInt() != 0)
		//* 146  415:aload_2         
		//* 147  416:invokevirtual   #65  <Method int Parcel.readInt()>
		//* 148  419:ifeq            446
			{
				parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//  149  422:getstatic       #95  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//  150  425:aload_2         
		//  151  426:invokeinterface #77  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  152  431:checkcast       #94  <Class Bundle>
		//  153  434:astore_2        
				obj4 = obj;
		//  154  435:aload           5
		//  155  437:astore          8
				obj = ((Object) (ibinder));
		//  156  439:aload           10
		//  157  441:astore          5
			} else
		//* 158  443:goto            508
			{
				parcel = null;
		//  159  446:aconst_null     
		//  160  447:astore_2        
				obj4 = obj;
		//  161  448:aload           5
		//  162  450:astore          8
				obj = ((Object) (ibinder));
		//  163  452:aload           10
		//  164  454:astore          5
			}
			  goto _L17
		//* 165  456:goto            508
_L9:
			obj2 = ((Object) (parcel.readString()));
		//  166  459:aload_2         
		//  167  460:invokevirtual   #92  <Method String Parcel.readString()>
		//  168  463:astore          6
			as = parcel.createStringArray();
		//  169  465:aload_2         
		//  170  466:invokevirtual   #99  <Method String[] Parcel.createStringArray()>
		//  171  469:astore          9
			obj4 = ((Object) (parcel.readString()));
		//  172  471:aload_2         
		//  173  472:invokevirtual   #92  <Method String Parcel.readString()>
		//  174  475:astore          8
			if(parcel.readInt() != 0)
		//* 175  477:aload_2         
		//* 176  478:invokevirtual   #65  <Method int Parcel.readInt()>
		//* 177  481:ifeq            500
				parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//  178  484:getstatic       #95  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//  179  487:aload_2         
		//  180  488:invokeinterface #77  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  181  493:checkcast       #94  <Class Bundle>
		//  182  496:astore_2        
			else
		//* 183  497:goto            502
				parcel = null;
		//  184  500:aconst_null     
		//  185  501:astore_2        
			obj = null;
		//  186  502:aconst_null     
		//  187  503:astore          5
			obj3 = null;
		//  188  505:aconst_null     
		//  189  506:astore          7
_L17:
			Object obj5;
			Object obj6;
			Object obj7;
			obj5 = obj;
		//  190  508:aload           5
		//  191  510:astore          10
			obj6 = obj2;
		//  192  512:aload           6
		//  193  514:astore          11
			obj7 = obj3;
		//  194  516:aload           7
		//  195  518:astore          12
			break MISSING_BLOCK_LABEL_655;
		//  196  520:goto            655
_L6:
			obj = ((Object) (parcel.readString()));
		//  197  523:aload_2         
		//  198  524:invokevirtual   #92  <Method String Parcel.readString()>
		//  199  527:astore          5
			  goto _L18
		//* 200  529:goto            620
_L4:
			as = parcel.createStringArray();
		//  201  532:aload_2         
		//  202  533:invokevirtual   #99  <Method String[] Parcel.createStringArray()>
		//  203  536:astore          9
			obj4 = ((Object) (parcel.readString()));
		//  204  538:aload_2         
		//  205  539:invokevirtual   #92  <Method String Parcel.readString()>
		//  206  542:astore          8
			if(parcel.readInt() != 0)
		//* 207  544:aload_2         
		//* 208  545:invokevirtual   #65  <Method int Parcel.readInt()>
		//* 209  548:ifeq            567
				parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//  210  551:getstatic       #95  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//  211  554:aload_2         
		//  212  555:invokeinterface #77  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  213  560:checkcast       #94  <Class Bundle>
		//  214  563:astore_2        
			else
		//* 215  564:goto            569
				parcel = null;
		//  216  567:aconst_null     
		//  217  568:astore_2        
			obj5 = null;
		//  218  569:aconst_null     
		//  219  570:astore          10
			obj6 = null;
		//  220  572:aconst_null     
		//  221  573:astore          11
			obj7 = obj6;
		//  222  575:aload           11
		//  223  577:astore          12
			break MISSING_BLOCK_LABEL_655;
		//  224  579:goto            655
_L2:
			if(parcel.readInt() == 0) goto _L14; else goto _L19
		//  225  582:aload_2         
		//  226  583:invokevirtual   #65  <Method int Parcel.readInt()>
		//  227  586:ifeq            617
_L19:
			obj3 = ((Object) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//  228  589:getstatic       #95  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//  229  592:aload_2         
		//  230  593:invokeinterface #77  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  231  598:checkcast       #94  <Class Bundle>
		//  232  601:astore          7
			obj = null;
		//  233  603:aconst_null     
		//  234  604:astore          5
			obj2 = obj;
		//  235  606:aload           5
		//  236  608:astore          6
			obj4 = obj2;
		//  237  610:aload           6
		//  238  612:astore          8
			  goto _L20
		//* 239  614:goto            631
_L14:
			obj = null;
		//  240  617:aconst_null     
		//  241  618:astore          5
_L18:
			obj2 = null;
		//  242  620:aconst_null     
		//  243  621:astore          6
			parcel = null;
		//  244  623:aconst_null     
		//  245  624:astore_2        
_L16:
			obj4 = ((Object) (parcel));
		//  246  625:aload_2         
		//  247  626:astore          8
			obj3 = ((Object) (parcel));
		//  248  628:aload_2         
		//  249  629:astore          7
_L20:
			parcel = ((Parcel) (obj4));
		//  250  631:aload           8
		//  251  633:astore_2        
_L15:
			obj7 = ((Object) (parcel));
		//  252  634:aload_2         
		//  253  635:astore          12
			obj6 = ((Object) (parcel));
		//  254  637:aload_2         
		//  255  638:astore          11
			obj5 = obj4;
		//  256  640:aload           8
		//  257  642:astore          10
			parcel = ((Parcel) (obj3));
		//  258  644:aload           7
		//  259  646:astore_2        
			as = ((String []) (obj2));
		//  260  647:aload           6
		//  261  649:astore          9
			obj4 = obj;
		//  262  651:aload           5
		//  263  653:astore          8
			getLegacyService(i, igmscallbacks, j, s, ((String) (obj4)), as, ((Bundle) (parcel)), ((IBinder) (obj5)), ((String) (obj6)), ((String) (obj7)));
		//  264  655:aload_0         
		//  265  656:iload_1         
		//  266  657:aload           14
		//  267  659:iload           4
		//  268  661:aload           13
		//  269  663:aload           8
		//  270  665:aload           9
		//  271  667:aload_2         
		//  272  668:aload           10
		//  273  670:aload           11
		//  274  672:aload           12
		//  275  674:invokevirtual   #101 <Method void getLegacyService(int, IGmsCallbacks, int, String, String, String[], Bundle, IBinder, String, String)>
			parcel1.writeNoException();
		//  276  677:aload_3         
		//  277  678:invokevirtual   #104 <Method void Parcel.writeNoException()>
			return true;
		//  278  681:iconst_1        
		//  279  682:ireturn         
		}

		protected void validateAccount(IGmsCallbacks igmscallbacks, ValidateAccountRequest validateaccountrequest)
			throws RemoteException
		{
			throw new UnsupportedOperationException();
		//    0    0:new             #40  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:invokespecial   #41  <Method void UnsupportedOperationException()>
		//    3    7:athrow          
		}

		public Stub()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Binder()>
			attachInterface(((IInterface) (this)), "com.google.android.gms.common.internal.IGmsServiceBroker");
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:ldc1            #16  <String "com.google.android.gms.common.internal.IGmsServiceBroker">
		//    5    8:invokevirtual   #20  <Method void attachInterface(IInterface, String)>
		//    6   11:return          
		}
	}

	private static final class Stub.zza
		implements IGmsServiceBroker
	{

		public final IBinder asBinder()
		{
			return zza;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zza>
		//    2    4:areturn         
		}

		public final void getService(IGmsCallbacks igmscallbacks, GetServiceRequest getservicerequest)
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
			parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
		//    4    9:aload_3         
		//    5   10:ldc1            #33  <String "com.google.android.gms.common.internal.IGmsServiceBroker">
		//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(igmscallbacks == null) goto _L2; else goto _L1
		//    7   15:aload_1         
		//    8   16:ifnull          100
_L1:
			igmscallbacks = ((IGmsCallbacks) (igmscallbacks.asBinder()));
		//    9   19:aload_1         
		//   10   20:invokeinterface #41  <Method IBinder IGmsCallbacks.asBinder()>
		//   11   25:astore_1        
		//*  12   26:goto            29
_L4:
			parcel.writeStrongBinder(((IBinder) (igmscallbacks)));
		//   13   29:aload_3         
		//   14   30:aload_1         
		//   15   31:invokevirtual   #44  <Method void Parcel.writeStrongBinder(IBinder)>
			if(getservicerequest == null)
				break MISSING_BLOCK_LABEL_52;
		//   16   34:aload_2         
		//   17   35:ifnull          52
			parcel.writeInt(1);
		//   18   38:aload_3         
		//   19   39:iconst_1        
		//   20   40:invokevirtual   #48  <Method void Parcel.writeInt(int)>
			getservicerequest.writeToParcel(parcel, 0);
		//   21   43:aload_2         
		//   22   44:aload_3         
		//   23   45:iconst_0        
		//   24   46:invokevirtual   #54  <Method void GetServiceRequest.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_57;
		//   25   49:goto            57
			parcel.writeInt(0);
		//   26   52:aload_3         
		//   27   53:iconst_0        
		//   28   54:invokevirtual   #48  <Method void Parcel.writeInt(int)>
			zza.transact(46, parcel, parcel1, 0);
		//   29   57:aload_0         
		//   30   58:getfield        #18  <Field IBinder zza>
		//   31   61:bipush          46
		//   32   63:aload_3         
		//   33   64:aload           4
		//   34   66:iconst_0        
		//   35   67:invokeinterface #60  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   36   72:pop             
			parcel1.readException();
		//   37   73:aload           4
		//   38   75:invokevirtual   #63  <Method void Parcel.readException()>
			parcel1.recycle();
		//   39   78:aload           4
		//   40   80:invokevirtual   #66  <Method void Parcel.recycle()>
			parcel.recycle();
		//   41   83:aload_3         
		//   42   84:invokevirtual   #66  <Method void Parcel.recycle()>
			return;
		//   43   87:return          
			igmscallbacks;
		//   44   88:astore_1        
			parcel1.recycle();
		//   45   89:aload           4
		//   46   91:invokevirtual   #66  <Method void Parcel.recycle()>
			parcel.recycle();
		//   47   94:aload_3         
		//   48   95:invokevirtual   #66  <Method void Parcel.recycle()>
			throw igmscallbacks;
		//   49   98:aload_1         
		//   50   99:athrow          
_L2:
			igmscallbacks = null;
		//   51  100:aconst_null     
		//   52  101:astore_1        
			if(true) goto _L4; else goto _L3
		//   53  102:goto            29
_L3:
		}

		private final IBinder zza;

		Stub.zza(IBinder ibinder)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			zza = ibinder;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field IBinder zza>
		//    5    9:return          
		}
	}


	public abstract void getService(IGmsCallbacks igmscallbacks, GetServiceRequest getservicerequest)
		throws RemoteException;
}
