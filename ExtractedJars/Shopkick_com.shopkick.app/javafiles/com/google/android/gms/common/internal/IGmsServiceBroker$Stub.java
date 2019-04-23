// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.*;

// Referenced classes of package com.google.android.gms.common.internal:
//			IGmsServiceBroker, IGmsCallbacks, zzl, GetServiceRequest, 
//			zzr

public static abstract class IGmsServiceBroker$Stub extends Binder
	implements IGmsServiceBroker
{
	private static final class zza
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

		zza(IBinder ibinder)
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


	public IBinder asBinder()
	{
		return ((IBinder) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		if(i > 0xffffff)
	//*   0    0:iload_1         
	//*   1    1:ldc1            #30  <Int 0xffffff>
	//*   2    3:icmple          16
			return super.onTransact(i, parcel, parcel1, j);
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:aload_2         
	//    6    9:aload_3         
	//    7   10:iload           4
	//    8   12:invokespecial   #32  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//    9   15:ireturn         
		parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	//   10   16:aload_2         
	//   11   17:ldc1            #16  <String "com.google.android.gms.common.internal.IGmsServiceBroker">
	//   12   19:invokevirtual   #38  <Method void Parcel.enforceInterface(String)>
		Object obj = ((Object) (parcel.readStrongBinder()));
	//   13   22:aload_2         
	//   14   23:invokevirtual   #41  <Method IBinder Parcel.readStrongBinder()>
	//   15   26:astore          5
		GetServiceRequest getservicerequest = null;
	//   16   28:aconst_null     
	//   17   29:astore          6
		if(obj == null)
	//*  18   31:aload           5
	//*  19   33:ifnonnull       42
		{
			obj = null;
	//   20   36:aconst_null     
	//   21   37:astore          5
		} else
	//*  22   39:goto            82
		{
			android.os.IInterface iinterface = ((IBinder) (obj)).queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
	//   23   42:aload           5
	//   24   44:ldc1            #43  <String "com.google.android.gms.common.internal.IGmsCallbacks">
	//   25   46:invokeinterface #49  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   26   51:astore          7
			if(iinterface instanceof IGmsCallbacks)
	//*  27   53:aload           7
	//*  28   55:instanceof      #51  <Class IGmsCallbacks>
	//*  29   58:ifeq            71
				obj = ((Object) ((IGmsCallbacks)iinterface));
	//   30   61:aload           7
	//   31   63:checkcast       #51  <Class IGmsCallbacks>
	//   32   66:astore          5
			else
	//*  33   68:goto            82
				obj = ((Object) (new zzl(((IBinder) (obj)))));
	//   34   71:new             #53  <Class zzl>
	//   35   74:dup             
	//   36   75:aload           5
	//   37   77:invokespecial   #56  <Method void zzl(IBinder)>
	//   38   80:astore          5
		}
		if(i == 46)
	//*  39   82:iload_1         
	//*  40   83:bipush          46
	//*  41   85:icmpne          123
		{
			if(parcel.readInt() != 0)
	//*  42   88:aload_2         
	//*  43   89:invokevirtual   #60  <Method int Parcel.readInt()>
	//*  44   92:ifeq            109
				getservicerequest = (GetServiceRequest)GetServiceRequest.CREATOR.createFromParcel(parcel);
	//   45   95:getstatic       #66  <Field android.os.Parcelable$Creator GetServiceRequest.CREATOR>
	//   46   98:aload_2         
	//   47   99:invokeinterface #72  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   48  104:checkcast       #62  <Class GetServiceRequest>
	//   49  107:astore          6
			getService(((IGmsCallbacks) (obj)), getservicerequest);
	//   50  109:aload_0         
	//   51  110:aload           5
	//   52  112:aload           6
	//   53  114:invokevirtual   #76  <Method void getService(IGmsCallbacks, GetServiceRequest)>
			parcel1.writeNoException();
	//   54  117:aload_3         
	//   55  118:invokevirtual   #79  <Method void Parcel.writeNoException()>
			return true;
	//   56  121:iconst_1        
	//   57  122:ireturn         
		}
		if(i == 47)
	//*  58  123:iload_1         
	//*  59  124:bipush          47
	//*  60  126:icmpne          154
		{
			if(parcel.readInt() != 0)
	//*  61  129:aload_2         
	//*  62  130:invokevirtual   #60  <Method int Parcel.readInt()>
	//*  63  133:ifeq            146
				zzr.CREATOR.createFromParcel(parcel);
	//   64  136:getstatic       #82  <Field android.os.Parcelable$Creator zzr.CREATOR>
	//   65  139:aload_2         
	//   66  140:invokeinterface #72  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   67  145:pop             
			throw new UnsupportedOperationException();
	//   68  146:new             #84  <Class UnsupportedOperationException>
	//   69  149:dup             
	//   70  150:invokespecial   #85  <Method void UnsupportedOperationException()>
	//   71  153:athrow          
		}
		parcel.readInt();
	//   72  154:aload_2         
	//   73  155:invokevirtual   #60  <Method int Parcel.readInt()>
	//   74  158:pop             
		if(i != 4)
	//*  75  159:iload_1         
	//*  76  160:iconst_4        
	//*  77  161:icmpeq          169
			parcel.readString();
	//   78  164:aload_2         
	//   79  165:invokevirtual   #89  <Method String Parcel.readString()>
	//   80  168:pop             
		if(i == 23 || i == 25 || i == 27)
			break MISSING_BLOCK_LABEL_499;
	//   81  169:iload_1         
	//   82  170:bipush          23
	//   83  172:icmpeq          499
	//   84  175:iload_1         
	//   85  176:bipush          25
	//   86  178:icmpeq          499
	//   87  181:iload_1         
	//   88  182:bipush          27
	//   89  184:icmpeq          499
		if(i == 30) goto _L2; else goto _L1
	//   90  187:iload_1         
	//   91  188:bipush          30
	//   92  190:icmpeq          469
_L1:
		if(i == 34) goto _L4; else goto _L3
	//   93  193:iload_1         
	//   94  194:bipush          34
	//   95  196:icmpeq          461
_L3:
		if(i == 41 || i == 43)
			break MISSING_BLOCK_LABEL_499;
	//   96  199:iload_1         
	//   97  200:bipush          41
	//   98  202:icmpeq          499
	//   99  205:iload_1         
	//  100  206:bipush          43
	//  101  208:icmpeq          499
		i;
	//  102  211:iload_1         
		JVM INSTR tableswitch 1 2: default 236
	//	               1 426
	//	               2 499;
	//  103  212:tableswitch     1 2: default 236
	//	               1 426
	//	               2 499
		   goto _L5 _L6 _L7
_L7:
		break MISSING_BLOCK_LABEL_499;
_L5:
		i;
	//  104  236:iload_1         
		JVM INSTR tableswitch 5 20: default 316
	//	               5 499
	//	               6 499
	//	               7 499
	//	               8 499
	//	               9 381
	//	               10 368
	//	               11 499
	//	               12 499
	//	               13 499
	//	               14 499
	//	               15 499
	//	               16 499
	//	               17 499
	//	               18 499
	//	               19 343
	//	               20 469;
	//  105  237:tableswitch     5 20: default 316
	//	               5 499
	//	               6 499
	//	               7 499
	//	               8 499
	//	               9 381
	//	               10 368
	//	               11 499
	//	               12 499
	//	               13 499
	//	               14 499
	//	               15 499
	//	               16 499
	//	               17 499
	//	               18 499
	//	               19 343
	//	               20 469
		   goto _L8 _L9 _L9 _L9 _L9 _L10 _L11 _L9 _L9 _L9 _L9 _L9 _L9 _L9 _L9 _L12 _L2
_L9:
		break MISSING_BLOCK_LABEL_499;
_L8:
		switch(i)
	//* 106  316:iload_1         
		{
	//* 107  317:tableswitch     37 38: default 340
	//	               37 499
	//	               38 499
		default:
			break; /* Loop/switch isn't completed */
	//  108  340:goto            516

		case 37: // '%'
		case 38: // '&'
			break;
		}
		break MISSING_BLOCK_LABEL_499;
_L12:
		parcel.readStrongBinder();
	//  109  343:aload_2         
	//  110  344:invokevirtual   #41  <Method IBinder Parcel.readStrongBinder()>
	//  111  347:pop             
		if(parcel.readInt() != 0)
	//* 112  348:aload_2         
	//* 113  349:invokevirtual   #60  <Method int Parcel.readInt()>
	//* 114  352:ifeq            516
			Bundle.CREATOR.createFromParcel(parcel);
	//  115  355:getstatic       #92  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//  116  358:aload_2         
	//  117  359:invokeinterface #72  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  118  364:pop             
		break; /* Loop/switch isn't completed */
	//  119  365:goto            516
_L11:
		parcel.readString();
	//  120  368:aload_2         
	//  121  369:invokevirtual   #89  <Method String Parcel.readString()>
	//  122  372:pop             
		parcel.createStringArray();
	//  123  373:aload_2         
	//  124  374:invokevirtual   #96  <Method String[] Parcel.createStringArray()>
	//  125  377:pop             
		break; /* Loop/switch isn't completed */
	//  126  378:goto            516
_L10:
		parcel.readString();
	//  127  381:aload_2         
	//  128  382:invokevirtual   #89  <Method String Parcel.readString()>
	//  129  385:pop             
		parcel.createStringArray();
	//  130  386:aload_2         
	//  131  387:invokevirtual   #96  <Method String[] Parcel.createStringArray()>
	//  132  390:pop             
		parcel.readString();
	//  133  391:aload_2         
	//  134  392:invokevirtual   #89  <Method String Parcel.readString()>
	//  135  395:pop             
		parcel.readStrongBinder();
	//  136  396:aload_2         
	//  137  397:invokevirtual   #41  <Method IBinder Parcel.readStrongBinder()>
	//  138  400:pop             
		parcel.readString();
	//  139  401:aload_2         
	//  140  402:invokevirtual   #89  <Method String Parcel.readString()>
	//  141  405:pop             
		if(parcel.readInt() != 0)
	//* 142  406:aload_2         
	//* 143  407:invokevirtual   #60  <Method int Parcel.readInt()>
	//* 144  410:ifeq            516
			Bundle.CREATOR.createFromParcel(parcel);
	//  145  413:getstatic       #92  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//  146  416:aload_2         
	//  147  417:invokeinterface #72  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  148  422:pop             
		break; /* Loop/switch isn't completed */
	//  149  423:goto            516
_L6:
		parcel.readString();
	//  150  426:aload_2         
	//  151  427:invokevirtual   #89  <Method String Parcel.readString()>
	//  152  430:pop             
		parcel.createStringArray();
	//  153  431:aload_2         
	//  154  432:invokevirtual   #96  <Method String[] Parcel.createStringArray()>
	//  155  435:pop             
		parcel.readString();
	//  156  436:aload_2         
	//  157  437:invokevirtual   #89  <Method String Parcel.readString()>
	//  158  440:pop             
		if(parcel.readInt() != 0)
	//* 159  441:aload_2         
	//* 160  442:invokevirtual   #60  <Method int Parcel.readInt()>
	//* 161  445:ifeq            516
			Bundle.CREATOR.createFromParcel(parcel);
	//  162  448:getstatic       #92  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//  163  451:aload_2         
	//  164  452:invokeinterface #72  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  165  457:pop             
		break; /* Loop/switch isn't completed */
	//  166  458:goto            516
_L4:
		parcel.readString();
	//  167  461:aload_2         
	//  168  462:invokevirtual   #89  <Method String Parcel.readString()>
	//  169  465:pop             
		break; /* Loop/switch isn't completed */
	//  170  466:goto            516
_L2:
		parcel.createStringArray();
	//  171  469:aload_2         
	//  172  470:invokevirtual   #96  <Method String[] Parcel.createStringArray()>
	//  173  473:pop             
		parcel.readString();
	//  174  474:aload_2         
	//  175  475:invokevirtual   #89  <Method String Parcel.readString()>
	//  176  478:pop             
		if(parcel.readInt() != 0)
	//* 177  479:aload_2         
	//* 178  480:invokevirtual   #60  <Method int Parcel.readInt()>
	//* 179  483:ifeq            516
			Bundle.CREATOR.createFromParcel(parcel);
	//  180  486:getstatic       #92  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//  181  489:aload_2         
	//  182  490:invokeinterface #72  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  183  495:pop             
		break; /* Loop/switch isn't completed */
	//  184  496:goto            516
		if(parcel.readInt() != 0)
	//* 185  499:aload_2         
	//* 186  500:invokevirtual   #60  <Method int Parcel.readInt()>
	//* 187  503:ifeq            516
			Bundle.CREATOR.createFromParcel(parcel);
	//  188  506:getstatic       #92  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//  189  509:aload_2         
	//  190  510:invokeinterface #72  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  191  515:pop             
		throw new UnsupportedOperationException();
	//  192  516:new             #84  <Class UnsupportedOperationException>
	//  193  519:dup             
	//  194  520:invokespecial   #85  <Method void UnsupportedOperationException()>
	//  195  523:athrow          
	}

	public IGmsServiceBroker$Stub()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Binder()>
		attachInterface(((android.os.IInterface) (this)), "com.google.android.gms.common.internal.IGmsServiceBroker");
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:ldc1            #16  <String "com.google.android.gms.common.internal.IGmsServiceBroker">
	//    5    8:invokevirtual   #20  <Method void attachInterface(android.os.IInterface, String)>
	//    6   11:return          
	}
}
