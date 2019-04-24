// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;
import com.google.android.gms.fitness.request.*;

public interface zzaoy
	extends IInterface
{
	public static abstract class zza extends Binder
		implements zzaoy
	{

		public static zzaoy zzcC(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
		//    4    6:aload_0         
		//    5    7:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitSensorsApi">
		//    6    9:invokeinterface #19  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface != null && (iinterface instanceof zzaoy))
		//*   8   15:aload_1         
		//*   9   16:ifnull          31
		//*  10   19:aload_1         
		//*  11   20:instanceof      #6   <Class zzaoy>
		//*  12   23:ifeq            31
				return (zzaoy)iinterface;
		//   13   26:aload_1         
		//   14   27:checkcast       #6   <Class zzaoy>
		//   15   30:areturn         
			else
				return ((zzaoy) (new zza(ibinder)));
		//   16   31:new             #9   <Class zzaoy$zza$zza>
		//   17   34:dup             
		//   18   35:aload_0         
		//   19   36:invokespecial   #23  <Method void zzaoy$zza$zza(IBinder)>
		//   20   39:areturn         
		}

		public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
			throws RemoteException
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:lookupswitch    4: default 44
		//		               1: 55
		//		               2: 97
		//		               3: 139
		//		               1598968902: 47
		//*   2   44:goto            181
			case 1598968902: 
				parcel1.writeString("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
		//    3   47:aload_3         
		//    4   48:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitSensorsApi">
		//    5   50:invokevirtual   #34  <Method void Parcel.writeString(String)>
				return true;
		//    6   53:iconst_1        
		//    7   54:ireturn         

			case 1: // '\001'
				parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
		//    8   55:aload_2         
		//    9   56:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitSensorsApi">
		//   10   58:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//*  11   61:aload_2         
		//*  12   62:invokevirtual   #41  <Method int Parcel.readInt()>
		//*  13   65:ifeq            84
					parcel = ((Parcel) ((DataSourcesRequest)DataSourcesRequest.CREATOR.createFromParcel(parcel)));
		//   14   68:getstatic       #47  <Field android.os.Parcelable$Creator DataSourcesRequest.CREATOR>
		//   15   71:aload_2         
		//   16   72:invokeinterface #53  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   17   77:checkcast       #43  <Class DataSourcesRequest>
		//   18   80:astore_2        
				else
		//*  19   81:goto            86
					parcel = null;
		//   20   84:aconst_null     
		//   21   85:astore_2        
				zza(((DataSourcesRequest) (parcel)));
		//   22   86:aload_0         
		//   23   87:aload_2         
		//   24   88:invokevirtual   #56  <Method void zza(DataSourcesRequest)>
				parcel1.writeNoException();
		//   25   91:aload_3         
		//   26   92:invokevirtual   #60  <Method void Parcel.writeNoException()>
				return true;
		//   27   95:iconst_1        
		//   28   96:ireturn         

			case 2: // '\002'
				parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
		//   29   97:aload_2         
		//   30   98:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitSensorsApi">
		//   31  100:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//*  32  103:aload_2         
		//*  33  104:invokevirtual   #41  <Method int Parcel.readInt()>
		//*  34  107:ifeq            126
					parcel = ((Parcel) ((zzav)zzav.CREATOR.createFromParcel(parcel)));
		//   35  110:getstatic       #63  <Field android.os.Parcelable$Creator zzav.CREATOR>
		//   36  113:aload_2         
		//   37  114:invokeinterface #53  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   38  119:checkcast       #62  <Class zzav>
		//   39  122:astore_2        
				else
		//*  40  123:goto            128
					parcel = null;
		//   41  126:aconst_null     
		//   42  127:astore_2        
				zza(((zzav) (parcel)));
		//   43  128:aload_0         
		//   44  129:aload_2         
		//   45  130:invokevirtual   #66  <Method void zza(zzav)>
				parcel1.writeNoException();
		//   46  133:aload_3         
		//   47  134:invokevirtual   #60  <Method void Parcel.writeNoException()>
				return true;
		//   48  137:iconst_1        
		//   49  138:ireturn         

			case 3: // '\003'
				parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
		//   50  139:aload_2         
		//   51  140:ldc1            #13  <String "com.google.android.gms.fitness.internal.IGoogleFitSensorsApi">
		//   52  142:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//*  53  145:aload_2         
		//*  54  146:invokevirtual   #41  <Method int Parcel.readInt()>
		//*  55  149:ifeq            168
					parcel = ((Parcel) ((zzax)zzax.CREATOR.createFromParcel(parcel)));
		//   56  152:getstatic       #69  <Field android.os.Parcelable$Creator zzax.CREATOR>
		//   57  155:aload_2         
		//   58  156:invokeinterface #53  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   59  161:checkcast       #68  <Class zzax>
		//   60  164:astore_2        
				else
		//*  61  165:goto            170
					parcel = null;
		//   62  168:aconst_null     
		//   63  169:astore_2        
				zza(((zzax) (parcel)));
		//   64  170:aload_0         
		//   65  171:aload_2         
		//   66  172:invokevirtual   #72  <Method void zza(zzax)>
				parcel1.writeNoException();
		//   67  175:aload_3         
		//   68  176:invokevirtual   #60  <Method void Parcel.writeNoException()>
				return true;
		//   69  179:iconst_1        
		//   70  180:ireturn         
			}
			return super.onTransact(i, parcel, parcel1, j);
		//   71  181:aload_0         
		//   72  182:iload_1         
		//   73  183:aload_2         
		//   74  184:aload_3         
		//   75  185:iload           4
		//   76  187:invokespecial   #74  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//   77  190:ireturn         
		}
	}

	static class zza.zza
		implements zzaoy
	{

		public IBinder asBinder()
		{
			return zzrk;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zzrk>
		//    2    4:areturn         
		}

		public void zza(DataSourcesRequest datasourcesrequest)
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
			parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.fitness.internal.IGoogleFitSensorsApi">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(datasourcesrequest == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			datasourcesrequest.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #46  <Method void DataSourcesRequest.writeToParcel(Parcel, int)>
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
			datasourcesrequest;
		//   35   64:astore_1        
			parcel1.recycle();
		//   36   65:aload_3         
		//   37   66:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   69:aload_2         
		//   39   70:invokevirtual   #58  <Method void Parcel.recycle()>
			throw datasourcesrequest;
		//   40   73:aload_1         
		//   41   74:athrow          
		}

		public void zza(zzav zzav1)
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
			parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.fitness.internal.IGoogleFitSensorsApi">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(zzav1 == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzav1.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #63  <Method void zzav.writeToParcel(Parcel, int)>
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
			zzav1;
		//   35   64:astore_1        
			parcel1.recycle();
		//   36   65:aload_3         
		//   37   66:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   69:aload_2         
		//   39   70:invokevirtual   #58  <Method void Parcel.recycle()>
			throw zzav1;
		//   40   73:aload_1         
		//   41   74:athrow          
		}

		public void zza(zzax zzax1)
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
			parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.fitness.internal.IGoogleFitSensorsApi">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(zzax1 == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzax1.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #67  <Method void zzax.writeToParcel(Parcel, int)>
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
			zzax1;
		//   35   64:astore_1        
			parcel1.recycle();
		//   36   65:aload_3         
		//   37   66:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   69:aload_2         
		//   39   70:invokevirtual   #58  <Method void Parcel.recycle()>
			throw zzax1;
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


	public abstract void zza(DataSourcesRequest datasourcesrequest)
		throws RemoteException;

	public abstract void zza(zzav zzav)
		throws RemoteException;

	public abstract void zza(zzax zzax)
		throws RemoteException;
}
