// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;
import com.google.android.gms.fitness.request.*;

public interface zzaoz
	extends IInterface
{
	public static abstract class zza extends Binder
		implements zzaoz
	{

		public static zzaoz zzcD(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
		//    4    6:aload_0         
		//    5    7:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitSessionsApi">
		//    6    9:invokeinterface #19  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface != null && (iinterface instanceof zzaoz))
		//*   8   15:aload_1         
		//*   9   16:ifnull          31
		//*  10   19:aload_1         
		//*  11   20:instanceof      #6   <Class zzaoz>
		//*  12   23:ifeq            31
				return (zzaoz)iinterface;
		//   13   26:aload_1         
		//   14   27:checkcast       #6   <Class zzaoz>
		//   15   30:areturn         
			else
				return ((zzaoz) (new zza(ibinder)));
		//   16   31:new             #9   <Class zzaoz$zza$zza>
		//   17   34:dup             
		//   18   35:aload_0         
		//   19   36:invokespecial   #23  <Method void zzaoz$zza$zza(IBinder)>
		//   20   39:areturn         
		}

		public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
			throws RemoteException
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:lookupswitch    7: default 68
		//		               1: 79
		//		               2: 121
		//		               3: 163
		//		               4: 205
		//		               5: 247
		//		               6: 289
		//		               1598968902: 71
		//*   2   68:goto            331
			case 1598968902: 
				parcel1.writeString("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
		//    3   71:aload_3         
		//    4   72:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitSessionsApi">
		//    5   74:invokevirtual   #34  <Method void Parcel.writeString(String)>
				return true;
		//    6   77:iconst_1        
		//    7   78:ireturn         

			case 1: // '\001'
				parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
		//    8   79:aload_2         
		//    9   80:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitSessionsApi">
		//   10   82:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//*  11   85:aload_2         
		//*  12   86:invokevirtual   #41  <Method int Parcel.readInt()>
		//*  13   89:ifeq            108
					parcel = ((Parcel) ((zzbd)zzbd.CREATOR.createFromParcel(parcel)));
		//   14   92:getstatic       #47  <Field android.os.Parcelable$Creator zzbd.CREATOR>
		//   15   95:aload_2         
		//   16   96:invokeinterface #53  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   17  101:checkcast       #43  <Class zzbd>
		//   18  104:astore_2        
				else
		//*  19  105:goto            110
					parcel = null;
		//   20  108:aconst_null     
		//   21  109:astore_2        
				zza(((zzbd) (parcel)));
		//   22  110:aload_0         
		//   23  111:aload_2         
		//   24  112:invokevirtual   #56  <Method void zza(zzbd)>
				parcel1.writeNoException();
		//   25  115:aload_3         
		//   26  116:invokevirtual   #60  <Method void Parcel.writeNoException()>
				return true;
		//   27  119:iconst_1        
		//   28  120:ireturn         

			case 2: // '\002'
				parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
		//   29  121:aload_2         
		//   30  122:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitSessionsApi">
		//   31  124:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//*  32  127:aload_2         
		//*  33  128:invokevirtual   #41  <Method int Parcel.readInt()>
		//*  34  131:ifeq            150
					parcel = ((Parcel) ((zzbf)zzbf.CREATOR.createFromParcel(parcel)));
		//   35  134:getstatic       #63  <Field android.os.Parcelable$Creator zzbf.CREATOR>
		//   36  137:aload_2         
		//   37  138:invokeinterface #53  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   38  143:checkcast       #62  <Class zzbf>
		//   39  146:astore_2        
				else
		//*  40  147:goto            152
					parcel = null;
		//   41  150:aconst_null     
		//   42  151:astore_2        
				zza(((zzbf) (parcel)));
		//   43  152:aload_0         
		//   44  153:aload_2         
		//   45  154:invokevirtual   #66  <Method void zza(zzbf)>
				parcel1.writeNoException();
		//   46  157:aload_3         
		//   47  158:invokevirtual   #60  <Method void Parcel.writeNoException()>
				return true;
		//   48  161:iconst_1        
		//   49  162:ireturn         

			case 3: // '\003'
				parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
		//   50  163:aload_2         
		//   51  164:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitSessionsApi">
		//   52  166:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//*  53  169:aload_2         
		//*  54  170:invokevirtual   #41  <Method int Parcel.readInt()>
		//*  55  173:ifeq            192
					parcel = ((Parcel) ((SessionInsertRequest)SessionInsertRequest.CREATOR.createFromParcel(parcel)));
		//   56  176:getstatic       #69  <Field android.os.Parcelable$Creator SessionInsertRequest.CREATOR>
		//   57  179:aload_2         
		//   58  180:invokeinterface #53  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   59  185:checkcast       #68  <Class SessionInsertRequest>
		//   60  188:astore_2        
				else
		//*  61  189:goto            194
					parcel = null;
		//   62  192:aconst_null     
		//   63  193:astore_2        
				zza(((SessionInsertRequest) (parcel)));
		//   64  194:aload_0         
		//   65  195:aload_2         
		//   66  196:invokevirtual   #72  <Method void zza(SessionInsertRequest)>
				parcel1.writeNoException();
		//   67  199:aload_3         
		//   68  200:invokevirtual   #60  <Method void Parcel.writeNoException()>
				return true;
		//   69  203:iconst_1        
		//   70  204:ireturn         

			case 4: // '\004'
				parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
		//   71  205:aload_2         
		//   72  206:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitSessionsApi">
		//   73  208:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//*  74  211:aload_2         
		//*  75  212:invokevirtual   #41  <Method int Parcel.readInt()>
		//*  76  215:ifeq            234
					parcel = ((Parcel) ((SessionReadRequest)SessionReadRequest.CREATOR.createFromParcel(parcel)));
		//   77  218:getstatic       #75  <Field android.os.Parcelable$Creator SessionReadRequest.CREATOR>
		//   78  221:aload_2         
		//   79  222:invokeinterface #53  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   80  227:checkcast       #74  <Class SessionReadRequest>
		//   81  230:astore_2        
				else
		//*  82  231:goto            236
					parcel = null;
		//   83  234:aconst_null     
		//   84  235:astore_2        
				zza(((SessionReadRequest) (parcel)));
		//   85  236:aload_0         
		//   86  237:aload_2         
		//   87  238:invokevirtual   #78  <Method void zza(SessionReadRequest)>
				parcel1.writeNoException();
		//   88  241:aload_3         
		//   89  242:invokevirtual   #60  <Method void Parcel.writeNoException()>
				return true;
		//   90  245:iconst_1        
		//   91  246:ireturn         

			case 5: // '\005'
				parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
		//   92  247:aload_2         
		//   93  248:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitSessionsApi">
		//   94  250:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//*  95  253:aload_2         
		//*  96  254:invokevirtual   #41  <Method int Parcel.readInt()>
		//*  97  257:ifeq            276
					parcel = ((Parcel) ((zzbb)zzbb.CREATOR.createFromParcel(parcel)));
		//   98  260:getstatic       #81  <Field android.os.Parcelable$Creator zzbb.CREATOR>
		//   99  263:aload_2         
		//  100  264:invokeinterface #53  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  101  269:checkcast       #80  <Class zzbb>
		//  102  272:astore_2        
				else
		//* 103  273:goto            278
					parcel = null;
		//  104  276:aconst_null     
		//  105  277:astore_2        
				zza(((zzbb) (parcel)));
		//  106  278:aload_0         
		//  107  279:aload_2         
		//  108  280:invokevirtual   #84  <Method void zza(zzbb)>
				parcel1.writeNoException();
		//  109  283:aload_3         
		//  110  284:invokevirtual   #60  <Method void Parcel.writeNoException()>
				return true;
		//  111  287:iconst_1        
		//  112  288:ireturn         

			case 6: // '\006'
				parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
		//  113  289:aload_2         
		//  114  290:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitSessionsApi">
		//  115  292:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//* 116  295:aload_2         
		//* 117  296:invokevirtual   #41  <Method int Parcel.readInt()>
		//* 118  299:ifeq            318
					parcel = ((Parcel) ((zzbh)zzbh.CREATOR.createFromParcel(parcel)));
		//  119  302:getstatic       #87  <Field android.os.Parcelable$Creator zzbh.CREATOR>
		//  120  305:aload_2         
		//  121  306:invokeinterface #53  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  122  311:checkcast       #86  <Class zzbh>
		//  123  314:astore_2        
				else
		//* 124  315:goto            320
					parcel = null;
		//  125  318:aconst_null     
		//  126  319:astore_2        
				zza(((zzbh) (parcel)));
		//  127  320:aload_0         
		//  128  321:aload_2         
		//  129  322:invokevirtual   #90  <Method void zza(zzbh)>
				parcel1.writeNoException();
		//  130  325:aload_3         
		//  131  326:invokevirtual   #60  <Method void Parcel.writeNoException()>
				return true;
		//  132  329:iconst_1        
		//  133  330:ireturn         
			}
			return super.onTransact(i, parcel, parcel1, j);
		//  134  331:aload_0         
		//  135  332:iload_1         
		//  136  333:aload_2         
		//  137  334:aload_3         
		//  138  335:iload           4
		//  139  337:invokespecial   #92  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//  140  340:ireturn         
		}
	}

	static class zza.zza
		implements zzaoz
	{

		public IBinder asBinder()
		{
			return zzrk;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zzrk>
		//    2    4:areturn         
		}

		public void zza(SessionInsertRequest sessioninsertrequest)
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
			parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.fitness.internal.IGoogleFitSessionsApi">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(sessioninsertrequest == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			sessioninsertrequest.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #46  <Method void SessionInsertRequest.writeToParcel(Parcel, int)>
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
			sessioninsertrequest;
		//   35   64:astore_1        
			parcel1.recycle();
		//   36   65:aload_3         
		//   37   66:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   69:aload_2         
		//   39   70:invokevirtual   #58  <Method void Parcel.recycle()>
			throw sessioninsertrequest;
		//   40   73:aload_1         
		//   41   74:athrow          
		}

		public void zza(SessionReadRequest sessionreadrequest)
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
			parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.fitness.internal.IGoogleFitSessionsApi">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(sessionreadrequest == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			sessionreadrequest.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #63  <Method void SessionReadRequest.writeToParcel(Parcel, int)>
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
			sessionreadrequest;
		//   35   64:astore_1        
			parcel1.recycle();
		//   36   65:aload_3         
		//   37   66:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   69:aload_2         
		//   39   70:invokevirtual   #58  <Method void Parcel.recycle()>
			throw sessionreadrequest;
		//   40   73:aload_1         
		//   41   74:athrow          
		}

		public void zza(zzbb zzbb1)
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
			parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.fitness.internal.IGoogleFitSessionsApi">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(zzbb1 == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzbb1.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #67  <Method void zzbb.writeToParcel(Parcel, int)>
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
			zzbb1;
		//   35   64:astore_1        
			parcel1.recycle();
		//   36   65:aload_3         
		//   37   66:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   69:aload_2         
		//   39   70:invokevirtual   #58  <Method void Parcel.recycle()>
			throw zzbb1;
		//   40   73:aload_1         
		//   41   74:athrow          
		}

		public void zza(zzbd zzbd1)
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
			parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.fitness.internal.IGoogleFitSessionsApi">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(zzbd1 == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzbd1.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #71  <Method void zzbd.writeToParcel(Parcel, int)>
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
			zzbd1;
		//   35   64:astore_1        
			parcel1.recycle();
		//   36   65:aload_3         
		//   37   66:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   69:aload_2         
		//   39   70:invokevirtual   #58  <Method void Parcel.recycle()>
			throw zzbd1;
		//   40   73:aload_1         
		//   41   74:athrow          
		}

		public void zza(zzbf zzbf1)
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
			parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.fitness.internal.IGoogleFitSessionsApi">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(zzbf1 == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzbf1.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #75  <Method void zzbf.writeToParcel(Parcel, int)>
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
			zzbf1;
		//   35   64:astore_1        
			parcel1.recycle();
		//   36   65:aload_3         
		//   37   66:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   69:aload_2         
		//   39   70:invokevirtual   #58  <Method void Parcel.recycle()>
			throw zzbf1;
		//   40   73:aload_1         
		//   41   74:athrow          
		}

		public void zza(zzbh zzbh1)
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
			parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.fitness.internal.IGoogleFitSessionsApi">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(zzbh1 == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzbh1.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #79  <Method void zzbh.writeToParcel(Parcel, int)>
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
			zzbh1;
		//   35   65:astore_1        
			parcel1.recycle();
		//   36   66:aload_3         
		//   37   67:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   70:aload_2         
		//   39   71:invokevirtual   #58  <Method void Parcel.recycle()>
			throw zzbh1;
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


	public abstract void zza(SessionInsertRequest sessioninsertrequest)
		throws RemoteException;

	public abstract void zza(SessionReadRequest sessionreadrequest)
		throws RemoteException;

	public abstract void zza(zzbb zzbb)
		throws RemoteException;

	public abstract void zza(zzbd zzbd)
		throws RemoteException;

	public abstract void zza(zzbf zzbf)
		throws RemoteException;

	public abstract void zza(zzbh zzbh)
		throws RemoteException;
}
