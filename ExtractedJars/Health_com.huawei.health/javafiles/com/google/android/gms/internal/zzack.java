// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;

public interface zzack
	extends IInterface
{
	public static abstract class zza extends Binder
		implements zzack
	{

		public static zzack zzbA(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonCallbacks");
		//    4    6:aload_0         
		//    5    7:ldc1            #15  <String "com.google.android.gms.common.internal.service.ICommonCallbacks">
		//    6    9:invokeinterface #28  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface != null && (iinterface instanceof zzack))
		//*   8   15:aload_1         
		//*   9   16:ifnull          31
		//*  10   19:aload_1         
		//*  11   20:instanceof      #6   <Class zzack>
		//*  12   23:ifeq            31
				return (zzack)iinterface;
		//   13   26:aload_1         
		//   14   27:checkcast       #6   <Class zzack>
		//   15   30:areturn         
			else
				return ((zzack) (new zza(ibinder)));
		//   16   31:new             #9   <Class zzack$zza$zza>
		//   17   34:dup             
		//   18   35:aload_0         
		//   19   36:invokespecial   #31  <Method void zzack$zza$zza(IBinder)>
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
		//		               1: 39
		//		               1598968902: 31
		//*   2   28:goto            59
			case 1598968902: 
				parcel1.writeString("com.google.android.gms.common.internal.service.ICommonCallbacks");
		//    3   31:aload_3         
		//    4   32:ldc1            #15  <String "com.google.android.gms.common.internal.service.ICommonCallbacks">
		//    5   34:invokevirtual   #43  <Method void Parcel.writeString(String)>
				return true;
		//    6   37:iconst_1        
		//    7   38:ireturn         

			case 1: // '\001'
				parcel.enforceInterface("com.google.android.gms.common.internal.service.ICommonCallbacks");
		//    8   39:aload_2         
		//    9   40:ldc1            #15  <String "com.google.android.gms.common.internal.service.ICommonCallbacks">
		//   10   42:invokevirtual   #46  <Method void Parcel.enforceInterface(String)>
				zzdd(parcel.readInt());
		//   11   45:aload_0         
		//   12   46:aload_2         
		//   13   47:invokevirtual   #50  <Method int Parcel.readInt()>
		//   14   50:invokevirtual   #54  <Method void zzdd(int)>
				parcel1.writeNoException();
		//   15   53:aload_3         
		//   16   54:invokevirtual   #57  <Method void Parcel.writeNoException()>
				return true;
		//   17   57:iconst_1        
		//   18   58:ireturn         
			}
			return super.onTransact(i, parcel, parcel1, j);
		//   19   59:aload_0         
		//   20   60:iload_1         
		//   21   61:aload_2         
		//   22   62:aload_3         
		//   23   63:iload           4
		//   24   65:invokespecial   #59  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//   25   68:ireturn         
		}

		public zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Binder()>
			attachInterface(((IInterface) (this)), "com.google.android.gms.common.internal.service.ICommonCallbacks");
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:ldc1            #15  <String "com.google.android.gms.common.internal.service.ICommonCallbacks">
		//    5    8:invokevirtual   #19  <Method void attachInterface(IInterface, String)>
		//    6   11:return          
		}
	}

	static class zza.zza
		implements zzack
	{

		public IBinder asBinder()
		{
			return zzrk;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zzrk>
		//    2    4:areturn         
		}

		public void zzdd(int i)
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
			parcel.writeInterfaceToken("com.google.android.gms.common.internal.service.ICommonCallbacks");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.common.internal.service.ICommonCallbacks">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeInt(i);
		//    7   14:aload_2         
		//    8   15:iload_1         
		//    9   16:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzrk.transact(1, parcel, parcel1, 0);
		//   10   19:aload_0         
		//   11   20:getfield        #18  <Field IBinder zzrk>
		//   12   23:iconst_1        
		//   13   24:aload_2         
		//   14   25:aload_3         
		//   15   26:iconst_0        
		//   16   27:invokeinterface #46  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   17   32:pop             
			parcel1.readException();
		//   18   33:aload_3         
		//   19   34:invokevirtual   #49  <Method void Parcel.readException()>
			parcel1.recycle();
		//   20   37:aload_3         
		//   21   38:invokevirtual   #52  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   41:aload_2         
		//   23   42:invokevirtual   #52  <Method void Parcel.recycle()>
			return;
		//   24   45:return          
			Exception exception;
			exception;
		//   25   46:astore          4
			parcel1.recycle();
		//   26   48:aload_3         
		//   27   49:invokevirtual   #52  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   52:aload_2         
		//   29   53:invokevirtual   #52  <Method void Parcel.recycle()>
			throw exception;
		//   30   56:aload           4
		//   31   58:athrow          
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


	public abstract void zzdd(int i)
		throws RemoteException;
}
