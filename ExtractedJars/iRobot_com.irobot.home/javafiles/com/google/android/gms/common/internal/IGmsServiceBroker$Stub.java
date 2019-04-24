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
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
		//    4    9:aload_3         
		//    5   10:ldc1            #31  <String "com.google.android.gms.common.internal.IGmsServiceBroker">
		//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
			if(igmscallbacks == null) goto _L2; else goto _L1
		//    7   15:aload_1         
		//    8   16:ifnull          100
_L1:
			igmscallbacks = ((IGmsCallbacks) (igmscallbacks.asBinder()));
		//    9   19:aload_1         
		//   10   20:invokeinterface #39  <Method IBinder IGmsCallbacks.asBinder()>
		//   11   25:astore_1        
		//*  12   26:goto            29
_L4:
			parcel.writeStrongBinder(((IBinder) (igmscallbacks)));
		//   13   29:aload_3         
		//   14   30:aload_1         
		//   15   31:invokevirtual   #42  <Method void Parcel.writeStrongBinder(IBinder)>
			if(getservicerequest == null)
				break MISSING_BLOCK_LABEL_52;
		//   16   34:aload_2         
		//   17   35:ifnull          52
			parcel.writeInt(1);
		//   18   38:aload_3         
		//   19   39:iconst_1        
		//   20   40:invokevirtual   #46  <Method void Parcel.writeInt(int)>
			getservicerequest.writeToParcel(parcel, 0);
		//   21   43:aload_2         
		//   22   44:aload_3         
		//   23   45:iconst_0        
		//   24   46:invokevirtual   #52  <Method void GetServiceRequest.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_57;
		//   25   49:goto            57
			parcel.writeInt(0);
		//   26   52:aload_3         
		//   27   53:iconst_0        
		//   28   54:invokevirtual   #46  <Method void Parcel.writeInt(int)>
			zza.transact(46, parcel, parcel1, 0);
		//   29   57:aload_0         
		//   30   58:getfield        #18  <Field IBinder zza>
		//   31   61:bipush          46
		//   32   63:aload_3         
		//   33   64:aload           4
		//   34   66:iconst_0        
		//   35   67:invokeinterface #58  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   36   72:pop             
			parcel1.readException();
		//   37   73:aload           4
		//   38   75:invokevirtual   #61  <Method void Parcel.readException()>
			parcel1.recycle();
		//   39   78:aload           4
		//   40   80:invokevirtual   #64  <Method void Parcel.recycle()>
			parcel.recycle();
		//   41   83:aload_3         
		//   42   84:invokevirtual   #64  <Method void Parcel.recycle()>
			return;
		//   43   87:return          
			igmscallbacks;
		//   44   88:astore_1        
			parcel1.recycle();
		//   45   89:aload           4
		//   46   91:invokevirtual   #64  <Method void Parcel.recycle()>
			parcel.recycle();
		//   47   94:aload_3         
		//   48   95:invokevirtual   #64  <Method void Parcel.recycle()>
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
	{
		if(i > 0xffffff)
	//*   0    0:iload_1         
	//*   1    1:ldc1            #28  <Int 0xffffff>
	//*   2    3:icmple          16
			return super.onTransact(i, parcel, parcel1, j);
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:aload_2         
	//    6    9:aload_3         
	//    7   10:iload           4
	//    8   12:invokespecial   #30  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//    9   15:ireturn         
		parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
	//   10   16:aload_2         
	//   11   17:ldc1            #16  <String "com.google.android.gms.common.internal.IGmsServiceBroker">
	//   12   19:invokevirtual   #36  <Method void Parcel.enforceInterface(String)>
		Object obj = ((Object) (parcel.readStrongBinder()));
	//   13   22:aload_2         
	//   14   23:invokevirtual   #39  <Method IBinder Parcel.readStrongBinder()>
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
	//   24   44:ldc1            #41  <String "com.google.android.gms.common.internal.IGmsCallbacks">
	//   25   46:invokeinterface #47  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   26   51:astore          7
			if(iinterface instanceof IGmsCallbacks)
	//*  27   53:aload           7
	//*  28   55:instanceof      #49  <Class IGmsCallbacks>
	//*  29   58:ifeq            71
				obj = ((Object) ((IGmsCallbacks)iinterface));
	//   30   61:aload           7
	//   31   63:checkcast       #49  <Class IGmsCallbacks>
	//   32   66:astore          5
			else
	//*  33   68:goto            82
				obj = ((Object) (new zzl(((IBinder) (obj)))));
	//   34   71:new             #51  <Class zzl>
	//   35   74:dup             
	//   36   75:aload           5
	//   37   77:invokespecial   #54  <Method void zzl(IBinder)>
	//   38   80:astore          5
		}
		if(i == 46)
	//*  39   82:iload_1         
	//*  40   83:bipush          46
	//*  41   85:icmpne          123
		{
			if(parcel.readInt() != 0)
	//*  42   88:aload_2         
	//*  43   89:invokevirtual   #58  <Method int Parcel.readInt()>
	//*  44   92:ifeq            109
				getservicerequest = (GetServiceRequest)GetServiceRequest.CREATOR.createFromParcel(parcel);
	//   45   95:getstatic       #64  <Field android.os.Parcelable$Creator GetServiceRequest.CREATOR>
	//   46   98:aload_2         
	//   47   99:invokeinterface #70  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   48  104:checkcast       #60  <Class GetServiceRequest>
	//   49  107:astore          6
			getService(((IGmsCallbacks) (obj)), getservicerequest);
	//   50  109:aload_0         
	//   51  110:aload           5
	//   52  112:aload           6
	//   53  114:invokevirtual   #74  <Method void getService(IGmsCallbacks, GetServiceRequest)>
			parcel1.writeNoException();
	//   54  117:aload_3         
	//   55  118:invokevirtual   #77  <Method void Parcel.writeNoException()>
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
	//*  62  130:invokevirtual   #58  <Method int Parcel.readInt()>
	//*  63  133:ifeq            146
				zzr.CREATOR.createFromParcel(parcel);
	//   64  136:getstatic       #80  <Field android.os.Parcelable$Creator zzr.CREATOR>
	//   65  139:aload_2         
	//   66  140:invokeinterface #70  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   67  145:pop             
			throw new UnsupportedOperationException();
	//   68  146:new             #82  <Class UnsupportedOperationException>
	//   69  149:dup             
	//   70  150:invokespecial   #83  <Method void UnsupportedOperationException()>
	//   71  153:athrow          
		}
		parcel.readInt();
	//   72  154:aload_2         
	//   73  155:invokevirtual   #58  <Method int Parcel.readInt()>
	//   74  158:pop             
		if(i != 4)
	//*  75  159:iload_1         
	//*  76  160:iconst_4        
	//*  77  161:icmpeq          169
			parcel.readString();
	//   78  164:aload_2         
	//   79  165:invokevirtual   #87  <Method String Parcel.readString()>
	//   80  168:pop             
		if(i == 23 || i == 25 || i == 27) goto _L2; else goto _L1
	//   81  169:iload_1         
	//   82  170:bipush          23
	//   83  172:icmpeq          469
	//   84  175:iload_1         
	//   85  176:bipush          25
	//   86  178:icmpeq          469
	//   87  181:iload_1         
	//   88  182:bipush          27
	//   89  184:icmpeq          469
_L1:
		if(i == 30) goto _L4; else goto _L3
	//   90  187:iload_1         
	//   91  188:bipush          30
	//   92  190:icmpeq          449
_L3:
		if(i == 34) goto _L6; else goto _L5
	//   93  193:iload_1         
	//   94  194:bipush          34
	//   95  196:icmpeq          441
_L5:
		if(i == 41 || i == 43) goto _L2; else goto _L7
	//   96  199:iload_1         
	//   97  200:bipush          41
	//   98  202:icmpeq          469
	//   99  205:iload_1         
	//  100  206:bipush          43
	//  101  208:icmpeq          469
_L7:
		i;
	//  102  211:iload_1         
		JVM INSTR tableswitch 1 2: default 236
	//	               1 406
	//	               2 469;
	//  103  212:tableswitch     1 2: default 236
	//	               1 406
	//	               2 469
		   goto _L8 _L9 _L2
_L8:
		i;
	//  104  236:iload_1         
		JVM INSTR tableswitch 5 20: default 316
	//	               5 469
	//	               6 469
	//	               7 469
	//	               8 469
	//	               9 371
	//	               10 358
	//	               11 469
	//	               12 469
	//	               13 469
	//	               14 469
	//	               15 469
	//	               16 469
	//	               17 469
	//	               18 469
	//	               19 343
	//	               20 449;
	//  105  237:tableswitch     5 20: default 316
	//	               5 469
	//	               6 469
	//	               7 469
	//	               8 469
	//	               9 371
	//	               10 358
	//	               11 469
	//	               12 469
	//	               13 469
	//	               14 469
	//	               15 469
	//	               16 469
	//	               17 469
	//	               18 469
	//	               19 343
	//	               20 449
		   goto _L10 _L2 _L2 _L2 _L2 _L11 _L12 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L13 _L4
_L10:
		i;
	//  106  316:iload_1         
		JVM INSTR tableswitch 37 38: default 340
	//	               37 469
	//	               38 469;
	//  107  317:tableswitch     37 38: default 340
	//	               37 469
	//	               38 469
		   goto _L14 _L2 _L2
	//* 108  340:goto            479
_L13:
		parcel.readStrongBinder();
	//  109  343:aload_2         
	//  110  344:invokevirtual   #39  <Method IBinder Parcel.readStrongBinder()>
	//  111  347:pop             
		if(parcel.readInt() == 0) goto _L14; else goto _L15
	//  112  348:aload_2         
	//  113  349:invokevirtual   #58  <Method int Parcel.readInt()>
	//  114  352:ifeq            479
	//* 115  355:goto            428
_L12:
		parcel.readString();
	//  116  358:aload_2         
	//  117  359:invokevirtual   #87  <Method String Parcel.readString()>
	//  118  362:pop             
		parcel.createStringArray();
	//  119  363:aload_2         
	//  120  364:invokevirtual   #91  <Method String[] Parcel.createStringArray()>
	//  121  367:pop             
		  goto _L14
	//* 122  368:goto            479
_L11:
		parcel.readString();
	//  123  371:aload_2         
	//  124  372:invokevirtual   #87  <Method String Parcel.readString()>
	//  125  375:pop             
		parcel.createStringArray();
	//  126  376:aload_2         
	//  127  377:invokevirtual   #91  <Method String[] Parcel.createStringArray()>
	//  128  380:pop             
		parcel.readString();
	//  129  381:aload_2         
	//  130  382:invokevirtual   #87  <Method String Parcel.readString()>
	//  131  385:pop             
		parcel.readStrongBinder();
	//  132  386:aload_2         
	//  133  387:invokevirtual   #39  <Method IBinder Parcel.readStrongBinder()>
	//  134  390:pop             
		parcel.readString();
	//  135  391:aload_2         
	//  136  392:invokevirtual   #87  <Method String Parcel.readString()>
	//  137  395:pop             
		if(parcel.readInt() == 0) goto _L14; else goto _L15
	//  138  396:aload_2         
	//  139  397:invokevirtual   #58  <Method int Parcel.readInt()>
	//  140  400:ifeq            479
	//* 141  403:goto            428
_L9:
		parcel.readString();
	//  142  406:aload_2         
	//  143  407:invokevirtual   #87  <Method String Parcel.readString()>
	//  144  410:pop             
		parcel.createStringArray();
	//  145  411:aload_2         
	//  146  412:invokevirtual   #91  <Method String[] Parcel.createStringArray()>
	//  147  415:pop             
		parcel.readString();
	//  148  416:aload_2         
	//  149  417:invokevirtual   #87  <Method String Parcel.readString()>
	//  150  420:pop             
		if(parcel.readInt() == 0) goto _L14; else goto _L15
	//  151  421:aload_2         
	//  152  422:invokevirtual   #58  <Method int Parcel.readInt()>
	//  153  425:ifeq            479
_L15:
		Bundle.CREATOR.createFromParcel(parcel);
	//  154  428:getstatic       #94  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//  155  431:aload_2         
	//  156  432:invokeinterface #70  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  157  437:pop             
		break; /* Loop/switch isn't completed */
	//  158  438:goto            479
_L6:
		parcel.readString();
	//  159  441:aload_2         
	//  160  442:invokevirtual   #87  <Method String Parcel.readString()>
	//  161  445:pop             
		break; /* Loop/switch isn't completed */
	//  162  446:goto            479
_L4:
		parcel.createStringArray();
	//  163  449:aload_2         
	//  164  450:invokevirtual   #91  <Method String[] Parcel.createStringArray()>
	//  165  453:pop             
		parcel.readString();
	//  166  454:aload_2         
	//  167  455:invokevirtual   #87  <Method String Parcel.readString()>
	//  168  458:pop             
		if(parcel.readInt() == 0) goto _L16; else goto _L15
	//  169  459:aload_2         
	//  170  460:invokevirtual   #58  <Method int Parcel.readInt()>
	//  171  463:ifeq            479
_L16:
		break; /* Loop/switch isn't completed */
	//  172  466:goto            428
_L2:
		if(parcel.readInt() == 0) goto _L14; else goto _L15
	//  173  469:aload_2         
	//  174  470:invokevirtual   #58  <Method int Parcel.readInt()>
	//  175  473:ifeq            479
	//* 176  476:goto            428
_L14:
		throw new UnsupportedOperationException();
	//  177  479:new             #82  <Class UnsupportedOperationException>
	//  178  482:dup             
	//  179  483:invokespecial   #83  <Method void UnsupportedOperationException()>
	//  180  486:athrow          
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
