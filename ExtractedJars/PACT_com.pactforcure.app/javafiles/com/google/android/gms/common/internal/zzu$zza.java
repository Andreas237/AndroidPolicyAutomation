// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.*;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzu

public static abstract class zzu$zza extends Binder
	implements zzu
{
	private static class zza
		implements zzu
	{

		public IBinder asBinder()
		{
			return zzrp;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zzrp>
		//    2    4:areturn         
		}

		public void zza(int i, IBinder ibinder, Bundle bundle)
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
			parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsCallbacks");
		//    4   10:aload           4
		//    5   12:ldc1            #32  <String "com.google.android.gms.common.internal.IGmsCallbacks">
		//    6   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeInt(i);
		//    7   17:aload           4
		//    8   19:iload_1         
		//    9   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			parcel.writeStrongBinder(ibinder);
		//   10   23:aload           4
		//   11   25:aload_2         
		//   12   26:invokevirtual   #43  <Method void Parcel.writeStrongBinder(IBinder)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_78;
		//   13   29:aload_3         
		//   14   30:ifnull          78
			parcel.writeInt(1);
		//   15   33:aload           4
		//   16   35:iconst_1        
		//   17   36:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   18   39:aload_3         
		//   19   40:aload           4
		//   20   42:iconst_0        
		//   21   43:invokevirtual   #49  <Method void Bundle.writeToParcel(Parcel, int)>
_L1:
			zzrp.transact(1, parcel, parcel1, 0);
		//   22   46:aload_0         
		//   23   47:getfield        #18  <Field IBinder zzrp>
		//   24   50:iconst_1        
		//   25   51:aload           4
		//   26   53:aload           5
		//   27   55:iconst_0        
		//   28   56:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   29   61:pop             
			parcel1.readException();
		//   30   62:aload           5
		//   31   64:invokevirtual   #58  <Method void Parcel.readException()>
			parcel1.recycle();
		//   32   67:aload           5
		//   33   69:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   34   72:aload           4
		//   35   74:invokevirtual   #61  <Method void Parcel.recycle()>
			return;
		//   36   77:return          
			parcel.writeInt(0);
		//   37   78:aload           4
		//   38   80:iconst_0        
		//   39   81:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L1
		//*  40   84:goto            46
			ibinder;
		//   41   87:astore_2        
			parcel1.recycle();
		//   42   88:aload           5
		//   43   90:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   44   93:aload           4
		//   45   95:invokevirtual   #61  <Method void Parcel.recycle()>
			throw ibinder;
		//   46   98:aload_2         
		//   47   99:athrow          
		}

		public void zzb(int i, Bundle bundle)
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
			parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsCallbacks");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.google.android.gms.common.internal.IGmsCallbacks">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeInt(i);
		//    7   15:aload_3         
		//    8   16:iload_1         
		//    9   17:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_65;
		//   10   20:aload_2         
		//   11   21:ifnull          65
			parcel.writeInt(1);
		//   12   24:aload_3         
		//   13   25:iconst_1        
		//   14   26:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   15   29:aload_2         
		//   16   30:aload_3         
		//   17   31:iconst_0        
		//   18   32:invokevirtual   #49  <Method void Bundle.writeToParcel(Parcel, int)>
_L1:
			zzrp.transact(2, parcel, parcel1, 0);
		//   19   35:aload_0         
		//   20   36:getfield        #18  <Field IBinder zzrp>
		//   21   39:iconst_2        
		//   22   40:aload_3         
		//   23   41:aload           4
		//   24   43:iconst_0        
		//   25   44:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   26   49:pop             
			parcel1.readException();
		//   27   50:aload           4
		//   28   52:invokevirtual   #58  <Method void Parcel.readException()>
			parcel1.recycle();
		//   29   55:aload           4
		//   30   57:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   31   60:aload_3         
		//   32   61:invokevirtual   #61  <Method void Parcel.recycle()>
			return;
		//   33   64:return          
			parcel.writeInt(0);
		//   34   65:aload_3         
		//   35   66:iconst_0        
		//   36   67:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L1
		//*  37   70:goto            35
			bundle;
		//   38   73:astore_2        
			parcel1.recycle();
		//   39   74:aload           4
		//   40   76:invokevirtual   #61  <Method void Parcel.recycle()>
			parcel.recycle();
		//   41   79:aload_3         
		//   42   80:invokevirtual   #61  <Method void Parcel.recycle()>
			throw bundle;
		//   43   83:aload_2         
		//   44   84:athrow          
		}

		private IBinder zzrp;

		zza(IBinder ibinder)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			zzrp = ibinder;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field IBinder zzrp>
		//    5    9:return          
		}
	}


	public static zzu zzbt(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
	//    4    6:aload_0         
	//    5    7:ldc1            #15  <String "com.google.android.gms.common.internal.IGmsCallbacks">
	//    6    9:invokeinterface #28  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof zzu))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class zzu>
	//*  12   23:ifeq            31
			return (zzu)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class zzu>
	//   15   30:areturn         
		else
			return ((zzu) (new zza(ibinder)));
	//   16   31:new             #9   <Class zzu$zza$zza>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #31  <Method void zzu$zza$zza(IBinder)>
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
		IBinder ibinder = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		Object obj = null;
	//    2    3:aconst_null     
	//    3    4:astore          5
		switch(i)
	//*   4    6:iload_1         
		{
	//*   5    7:lookupswitch    3: default 40
	//	               1: 58
	//	               2: 111
	//	               1598968902: 50
		default:
			return super.onTransact(i, parcel, parcel1, j);
	//    6   40:aload_0         
	//    7   41:iload_1         
	//    8   42:aload_2         
	//    9   43:aload_3         
	//   10   44:iload           4
	//   11   46:invokespecial   #39  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//   12   49:ireturn         

		case 1598968902: 
			parcel1.writeString("com.google.android.gms.common.internal.IGmsCallbacks");
	//   13   50:aload_3         
	//   14   51:ldc1            #15  <String "com.google.android.gms.common.internal.IGmsCallbacks">
	//   15   53:invokevirtual   #45  <Method void Parcel.writeString(String)>
			return true;
	//   16   56:iconst_1        
	//   17   57:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("com.google.android.gms.common.internal.IGmsCallbacks");
	//   18   58:aload_2         
	//   19   59:ldc1            #15  <String "com.google.android.gms.common.internal.IGmsCallbacks">
	//   20   61:invokevirtual   #48  <Method void Parcel.enforceInterface(String)>
			i = parcel.readInt();
	//   21   64:aload_2         
	//   22   65:invokevirtual   #52  <Method int Parcel.readInt()>
	//   23   68:istore_1        
			ibinder = parcel.readStrongBinder();
	//   24   69:aload_2         
	//   25   70:invokevirtual   #55  <Method IBinder Parcel.readStrongBinder()>
	//   26   73:astore          6
			if(parcel.readInt() != 0)
	//*  27   75:aload_2         
	//*  28   76:invokevirtual   #52  <Method int Parcel.readInt()>
	//*  29   79:ifeq            96
				obj = ((Object) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
	//   30   82:getstatic       #61  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   31   85:aload_2         
	//   32   86:invokeinterface #67  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   33   91:checkcast       #57  <Class Bundle>
	//   34   94:astore          5
			zza(i, ibinder, ((Bundle) (obj)));
	//   35   96:aload_0         
	//   36   97:iload_1         
	//   37   98:aload           6
	//   38  100:aload           5
	//   39  102:invokevirtual   #70  <Method void zza(int, IBinder, Bundle)>
			parcel1.writeNoException();
	//   40  105:aload_3         
	//   41  106:invokevirtual   #73  <Method void Parcel.writeNoException()>
			return true;
	//   42  109:iconst_1        
	//   43  110:ireturn         

		case 2: // '\002'
			parcel.enforceInterface("com.google.android.gms.common.internal.IGmsCallbacks");
	//   44  111:aload_2         
	//   45  112:ldc1            #15  <String "com.google.android.gms.common.internal.IGmsCallbacks">
	//   46  114:invokevirtual   #48  <Method void Parcel.enforceInterface(String)>
			i = parcel.readInt();
	//   47  117:aload_2         
	//   48  118:invokevirtual   #52  <Method int Parcel.readInt()>
	//   49  121:istore_1        
			obj = ((Object) (ibinder));
	//   50  122:aload           6
	//   51  124:astore          5
			break;
		}
		if(parcel.readInt() != 0)
	//*  52  126:aload_2         
	//*  53  127:invokevirtual   #52  <Method int Parcel.readInt()>
	//*  54  130:ifeq            147
			obj = ((Object) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
	//   55  133:getstatic       #61  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   56  136:aload_2         
	//   57  137:invokeinterface #67  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   58  142:checkcast       #57  <Class Bundle>
	//   59  145:astore          5
		zzb(i, ((Bundle) (obj)));
	//   60  147:aload_0         
	//   61  148:iload_1         
	//   62  149:aload           5
	//   63  151:invokevirtual   #77  <Method void zzb(int, Bundle)>
		parcel1.writeNoException();
	//   64  154:aload_3         
	//   65  155:invokevirtual   #73  <Method void Parcel.writeNoException()>
		return true;
	//   66  158:iconst_1        
	//   67  159:ireturn         
	}

	public zzu$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Binder()>
		attachInterface(((android.os.IInterface) (this)), "com.google.android.gms.common.internal.IGmsCallbacks");
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:ldc1            #15  <String "com.google.android.gms.common.internal.IGmsCallbacks">
	//    5    8:invokevirtual   #19  <Method void attachInterface(android.os.IInterface, String)>
	//    6   11:return          
	}
}
