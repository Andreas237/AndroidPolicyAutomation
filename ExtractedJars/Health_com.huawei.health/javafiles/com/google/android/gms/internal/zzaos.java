// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;
import com.google.android.gms.fitness.request.*;

public interface zzaos
	extends IInterface
{
	public static abstract class zza extends Binder
		implements zzaos
	{

		public static zzaos zzcw(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
		//    4    6:aload_0         
		//    5    7:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitBleApi">
		//    6    9:invokeinterface #19  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface != null && (iinterface instanceof zzaos))
		//*   8   15:aload_1         
		//*   9   16:ifnull          31
		//*  10   19:aload_1         
		//*  11   20:instanceof      #6   <Class zzaos>
		//*  12   23:ifeq            31
				return (zzaos)iinterface;
		//   13   26:aload_1         
		//   14   27:checkcast       #6   <Class zzaos>
		//   15   30:areturn         
			else
				return ((zzaos) (new zza(ibinder)));
		//   16   31:new             #9   <Class zzaos$zza$zza>
		//   17   34:dup             
		//   18   35:aload_0         
		//   19   36:invokespecial   #23  <Method void zzaos$zza$zza(IBinder)>
		//   20   39:areturn         
		}

		public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
			throws RemoteException
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:lookupswitch    6: default 60
		//		               1: 71
		//		               2: 113
		//		               3: 155
		//		               4: 197
		//		               5: 239
		//		               1598968902: 63
		//*   2   60:goto            281
			case 1598968902: 
				parcel1.writeString("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
		//    3   63:aload_3         
		//    4   64:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitBleApi">
		//    5   66:invokevirtual   #34  <Method void Parcel.writeString(String)>
				return true;
		//    6   69:iconst_1        
		//    7   70:ireturn         

			case 1: // '\001'
				parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
		//    8   71:aload_2         
		//    9   72:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitBleApi">
		//   10   74:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//*  11   77:aload_2         
		//*  12   78:invokevirtual   #41  <Method int Parcel.readInt()>
		//*  13   81:ifeq            100
					parcel = ((Parcel) ((StartBleScanRequest)StartBleScanRequest.CREATOR.createFromParcel(parcel)));
		//   14   84:getstatic       #47  <Field android.os.Parcelable$Creator StartBleScanRequest.CREATOR>
		//   15   87:aload_2         
		//   16   88:invokeinterface #53  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   17   93:checkcast       #43  <Class StartBleScanRequest>
		//   18   96:astore_2        
				else
		//*  19   97:goto            102
					parcel = null;
		//   20  100:aconst_null     
		//   21  101:astore_2        
				zza(((StartBleScanRequest) (parcel)));
		//   22  102:aload_0         
		//   23  103:aload_2         
		//   24  104:invokevirtual   #56  <Method void zza(StartBleScanRequest)>
				parcel1.writeNoException();
		//   25  107:aload_3         
		//   26  108:invokevirtual   #60  <Method void Parcel.writeNoException()>
				return true;
		//   27  111:iconst_1        
		//   28  112:ireturn         

			case 2: // '\002'
				parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
		//   29  113:aload_2         
		//   30  114:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitBleApi">
		//   31  116:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//*  32  119:aload_2         
		//*  33  120:invokevirtual   #41  <Method int Parcel.readInt()>
		//*  34  123:ifeq            142
					parcel = ((Parcel) ((zzbk)zzbk.CREATOR.createFromParcel(parcel)));
		//   35  126:getstatic       #63  <Field android.os.Parcelable$Creator zzbk.CREATOR>
		//   36  129:aload_2         
		//   37  130:invokeinterface #53  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   38  135:checkcast       #62  <Class zzbk>
		//   39  138:astore_2        
				else
		//*  40  139:goto            144
					parcel = null;
		//   41  142:aconst_null     
		//   42  143:astore_2        
				zza(((zzbk) (parcel)));
		//   43  144:aload_0         
		//   44  145:aload_2         
		//   45  146:invokevirtual   #66  <Method void zza(zzbk)>
				parcel1.writeNoException();
		//   46  149:aload_3         
		//   47  150:invokevirtual   #60  <Method void Parcel.writeNoException()>
				return true;
		//   48  153:iconst_1        
		//   49  154:ireturn         

			case 3: // '\003'
				parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
		//   50  155:aload_2         
		//   51  156:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitBleApi">
		//   52  158:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//*  53  161:aload_2         
		//*  54  162:invokevirtual   #41  <Method int Parcel.readInt()>
		//*  55  165:ifeq            184
					parcel = ((Parcel) ((zzb)zzb.CREATOR.createFromParcel(parcel)));
		//   56  168:getstatic       #69  <Field android.os.Parcelable$Creator zzb.CREATOR>
		//   57  171:aload_2         
		//   58  172:invokeinterface #53  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   59  177:checkcast       #68  <Class zzb>
		//   60  180:astore_2        
				else
		//*  61  181:goto            186
					parcel = null;
		//   62  184:aconst_null     
		//   63  185:astore_2        
				zza(((zzb) (parcel)));
		//   64  186:aload_0         
		//   65  187:aload_2         
		//   66  188:invokevirtual   #72  <Method void zza(zzb)>
				parcel1.writeNoException();
		//   67  191:aload_3         
		//   68  192:invokevirtual   #60  <Method void Parcel.writeNoException()>
				return true;
		//   69  195:iconst_1        
		//   70  196:ireturn         

			case 4: // '\004'
				parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
		//   71  197:aload_2         
		//   72  198:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitBleApi">
		//   73  200:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//*  74  203:aload_2         
		//*  75  204:invokevirtual   #41  <Method int Parcel.readInt()>
		//*  76  207:ifeq            226
					parcel = ((Parcel) ((zzbo)zzbo.CREATOR.createFromParcel(parcel)));
		//   77  210:getstatic       #75  <Field android.os.Parcelable$Creator zzbo.CREATOR>
		//   78  213:aload_2         
		//   79  214:invokeinterface #53  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   80  219:checkcast       #74  <Class zzbo>
		//   81  222:astore_2        
				else
		//*  82  223:goto            228
					parcel = null;
		//   83  226:aconst_null     
		//   84  227:astore_2        
				zza(((zzbo) (parcel)));
		//   85  228:aload_0         
		//   86  229:aload_2         
		//   87  230:invokevirtual   #78  <Method void zza(zzbo)>
				parcel1.writeNoException();
		//   88  233:aload_3         
		//   89  234:invokevirtual   #60  <Method void Parcel.writeNoException()>
				return true;
		//   90  237:iconst_1        
		//   91  238:ireturn         

			case 5: // '\005'
				parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
		//   92  239:aload_2         
		//   93  240:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitBleApi">
		//   94  242:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//*  95  245:aload_2         
		//*  96  246:invokevirtual   #41  <Method int Parcel.readInt()>
		//*  97  249:ifeq            268
					parcel = ((Parcel) ((zzak)zzak.CREATOR.createFromParcel(parcel)));
		//   98  252:getstatic       #81  <Field android.os.Parcelable$Creator zzak.CREATOR>
		//   99  255:aload_2         
		//  100  256:invokeinterface #53  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  101  261:checkcast       #80  <Class zzak>
		//  102  264:astore_2        
				else
		//* 103  265:goto            270
					parcel = null;
		//  104  268:aconst_null     
		//  105  269:astore_2        
				zza(((zzak) (parcel)));
		//  106  270:aload_0         
		//  107  271:aload_2         
		//  108  272:invokevirtual   #84  <Method void zza(zzak)>
				parcel1.writeNoException();
		//  109  275:aload_3         
		//  110  276:invokevirtual   #60  <Method void Parcel.writeNoException()>
				return true;
		//  111  279:iconst_1        
		//  112  280:ireturn         
			}
			return super.onTransact(i, parcel, parcel1, j);
		//  113  281:aload_0         
		//  114  282:iload_1         
		//  115  283:aload_2         
		//  116  284:aload_3         
		//  117  285:iload           4
		//  118  287:invokespecial   #86  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//  119  290:ireturn         
		}
	}

	static class zza.zza
		implements zzaos
	{

		public IBinder asBinder()
		{
			return zzrk;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zzrk>
		//    2    4:areturn         
		}

		public void zza(StartBleScanRequest startblescanrequest)
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
			parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.fitness.internal.IGoogleFitBleApi">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(startblescanrequest == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			startblescanrequest.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #46  <Method void StartBleScanRequest.writeToParcel(Parcel, int)>
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
			startblescanrequest;
		//   35   64:astore_1        
			parcel1.recycle();
		//   36   65:aload_3         
		//   37   66:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   69:aload_2         
		//   39   70:invokevirtual   #58  <Method void Parcel.recycle()>
			throw startblescanrequest;
		//   40   73:aload_1         
		//   41   74:athrow          
		}

		public void zza(zzak zzak1)
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
			parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.fitness.internal.IGoogleFitBleApi">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(zzak1 == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzak1.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #63  <Method void zzak.writeToParcel(Parcel, int)>
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
			zzak1;
		//   35   64:astore_1        
			parcel1.recycle();
		//   36   65:aload_3         
		//   37   66:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   69:aload_2         
		//   39   70:invokevirtual   #58  <Method void Parcel.recycle()>
			throw zzak1;
		//   40   73:aload_1         
		//   41   74:athrow          
		}

		public void zza(zzb zzb1)
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
			parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.fitness.internal.IGoogleFitBleApi">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(zzb1 == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzb1.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #67  <Method void zzb.writeToParcel(Parcel, int)>
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
			zzb1;
		//   35   64:astore_1        
			parcel1.recycle();
		//   36   65:aload_3         
		//   37   66:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   69:aload_2         
		//   39   70:invokevirtual   #58  <Method void Parcel.recycle()>
			throw zzb1;
		//   40   73:aload_1         
		//   41   74:athrow          
		}

		public void zza(zzbk zzbk1)
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
			parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.fitness.internal.IGoogleFitBleApi">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(zzbk1 == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzbk1.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #71  <Method void zzbk.writeToParcel(Parcel, int)>
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
			zzbk1;
		//   35   64:astore_1        
			parcel1.recycle();
		//   36   65:aload_3         
		//   37   66:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   69:aload_2         
		//   39   70:invokevirtual   #58  <Method void Parcel.recycle()>
			throw zzbk1;
		//   40   73:aload_1         
		//   41   74:athrow          
		}

		public void zza(zzbo zzbo1)
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
			parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.fitness.internal.IGoogleFitBleApi">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(zzbo1 == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzbo1.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #75  <Method void zzbo.writeToParcel(Parcel, int)>
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
			zzbo1;
		//   35   64:astore_1        
			parcel1.recycle();
		//   36   65:aload_3         
		//   37   66:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   69:aload_2         
		//   39   70:invokevirtual   #58  <Method void Parcel.recycle()>
			throw zzbo1;
		//   40   73:aload_1         
		//   41   74:athrow          
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


	public abstract void zza(StartBleScanRequest startblescanrequest)
		throws RemoteException;

	public abstract void zza(zzak zzak)
		throws RemoteException;

	public abstract void zza(zzb zzb)
		throws RemoteException;

	public abstract void zza(zzbk zzbk)
		throws RemoteException;

	public abstract void zza(zzbo zzbo)
		throws RemoteException;
}
