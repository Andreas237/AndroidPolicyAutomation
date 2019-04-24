// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.*;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzbt

public static abstract class zzbt$zza extends Binder
	implements zzbt
{
	static class zza
		implements zzbt
	{

		public IBinder asBinder()
		{
			return zzrk;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zzrk>
		//    2    4:areturn         
		}

		public void zzE(int i, int j)
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
			parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
		//    4    9:aload_3         
		//    5   10:ldc1            #33  <String "com.google.android.gms.wearable.internal.IChannelStreamCallbacks">
		//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeInt(i);
		//    7   15:aload_3         
		//    8   16:iload_1         
		//    9   17:invokevirtual   #41  <Method void Parcel.writeInt(int)>
			parcel.writeInt(j);
		//   10   20:aload_3         
		//   11   21:iload_2         
		//   12   22:invokevirtual   #41  <Method void Parcel.writeInt(int)>
			zzrk.transact(2, parcel, parcel1, 0);
		//   13   25:aload_0         
		//   14   26:getfield        #18  <Field IBinder zzrk>
		//   15   29:iconst_2        
		//   16   30:aload_3         
		//   17   31:aload           4
		//   18   33:iconst_0        
		//   19   34:invokeinterface #47  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   20   39:pop             
			parcel1.readException();
		//   21   40:aload           4
		//   22   42:invokevirtual   #50  <Method void Parcel.readException()>
			parcel1.recycle();
		//   23   45:aload           4
		//   24   47:invokevirtual   #53  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   50:aload_3         
		//   26   51:invokevirtual   #53  <Method void Parcel.recycle()>
			return;
		//   27   54:return          
			Exception exception;
			exception;
		//   28   55:astore          5
			parcel1.recycle();
		//   29   57:aload           4
		//   30   59:invokevirtual   #53  <Method void Parcel.recycle()>
			parcel.recycle();
		//   31   62:aload_3         
		//   32   63:invokevirtual   #53  <Method void Parcel.recycle()>
			throw exception;
		//   33   66:aload           5
		//   34   68:athrow          
		}

		private IBinder zzrk;

		zza(IBinder ibinder)
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


	public static zzbt zzfA(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
	//    4    6:aload_0         
	//    5    7:ldc1            #15  <String "com.google.android.gms.wearable.internal.IChannelStreamCallbacks">
	//    6    9:invokeinterface #28  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof zzbt))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class zzbt>
	//*  12   23:ifeq            31
			return (zzbt)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class zzbt>
	//   15   30:areturn         
		else
			return ((zzbt) (new zza(ibinder)));
	//   16   31:new             #9   <Class zzbt$zza$zza>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #31  <Method void zzbt$zza$zza(IBinder)>
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
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    2: default 28
	//	               2: 39
	//	               1598968902: 31
	//*   2   28:goto            63
		case 1598968902: 
			parcel1.writeString("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
	//    3   31:aload_3         
	//    4   32:ldc1            #15  <String "com.google.android.gms.wearable.internal.IChannelStreamCallbacks">
	//    5   34:invokevirtual   #43  <Method void Parcel.writeString(String)>
			return true;
	//    6   37:iconst_1        
	//    7   38:ireturn         

		case 2: // '\002'
			parcel.enforceInterface("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
	//    8   39:aload_2         
	//    9   40:ldc1            #15  <String "com.google.android.gms.wearable.internal.IChannelStreamCallbacks">
	//   10   42:invokevirtual   #46  <Method void Parcel.enforceInterface(String)>
			zzE(parcel.readInt(), parcel.readInt());
	//   11   45:aload_0         
	//   12   46:aload_2         
	//   13   47:invokevirtual   #50  <Method int Parcel.readInt()>
	//   14   50:aload_2         
	//   15   51:invokevirtual   #50  <Method int Parcel.readInt()>
	//   16   54:invokevirtual   #54  <Method void zzE(int, int)>
			parcel1.writeNoException();
	//   17   57:aload_3         
	//   18   58:invokevirtual   #57  <Method void Parcel.writeNoException()>
			return true;
	//   19   61:iconst_1        
	//   20   62:ireturn         
		}
		return super.onTransact(i, parcel, parcel1, j);
	//   21   63:aload_0         
	//   22   64:iload_1         
	//   23   65:aload_2         
	//   24   66:aload_3         
	//   25   67:iload           4
	//   26   69:invokespecial   #59  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//   27   72:ireturn         
	}

	public zzbt$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Binder()>
		attachInterface(((android.os.IInterface) (this)), "com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:ldc1            #15  <String "com.google.android.gms.wearable.internal.IChannelStreamCallbacks">
	//    5    8:invokevirtual   #19  <Method void attachInterface(android.os.IInterface, String)>
	//    6   11:return          
	}
}
