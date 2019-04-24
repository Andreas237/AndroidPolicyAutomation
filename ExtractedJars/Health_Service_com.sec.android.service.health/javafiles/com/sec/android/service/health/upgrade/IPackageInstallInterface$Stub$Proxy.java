// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.upgrade;

import android.os.*;

// Referenced classes of package com.sec.android.service.health.upgrade:
//			IPackageInstallInterface, IRemoteServiceCallback

private static class IPackageInstallInterface$Stub$Proxy
	implements IPackageInstallInterface
{

	public IBinder asBinder()
	{
		return mRemote;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field IBinder mRemote>
	//    2    4:areturn         
	}

	public void deletePackage(String s)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.sec.android.service.health.upgrade.IPackageInstallInterface");
	//    4    8:aload_2         
	//    5    9:ldc1            #34  <String "com.sec.android.service.health.upgrade.IPackageInstallInterface">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   14:aload_2         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #40  <Method void Parcel.writeString(String)>
		mRemote.transact(2, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #19  <Field IBinder mRemote>
	//   12   23:iconst_2        
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
		s;
	//   25   46:astore_1        
		parcel1.recycle();
	//   26   47:aload_3         
	//   27   48:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   51:aload_2         
	//   29   52:invokevirtual   #52  <Method void Parcel.recycle()>
		throw s;
	//   30   55:aload_1         
	//   31   56:athrow          
	}

	public void disablePackage(String s)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.sec.android.service.health.upgrade.IPackageInstallInterface");
	//    4    8:aload_2         
	//    5    9:ldc1            #34  <String "com.sec.android.service.health.upgrade.IPackageInstallInterface">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   14:aload_2         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #40  <Method void Parcel.writeString(String)>
		mRemote.transact(3, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #19  <Field IBinder mRemote>
	//   12   23:iconst_3        
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
		s;
	//   25   46:astore_1        
		parcel1.recycle();
	//   26   47:aload_3         
	//   27   48:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   51:aload_2         
	//   29   52:invokevirtual   #52  <Method void Parcel.recycle()>
		throw s;
	//   30   55:aload_1         
	//   31   56:athrow          
	}

	public String getInterfaceDescriptor()
	{
		return "com.sec.android.service.health.upgrade.IPackageInstallInterface";
	//    0    0:ldc1            #34  <String "com.sec.android.service.health.upgrade.IPackageInstallInterface">
	//    1    2:areturn         
	}

	public void installPackage(String s, String s1)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("com.sec.android.service.health.upgrade.IPackageInstallInterface");
	//    4    9:aload_3         
	//    5   10:ldc1            #34  <String "com.sec.android.service.health.upgrade.IPackageInstallInterface">
	//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   15:aload_3         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #40  <Method void Parcel.writeString(String)>
		parcel.writeString(s1);
	//   10   20:aload_3         
	//   11   21:aload_2         
	//   12   22:invokevirtual   #40  <Method void Parcel.writeString(String)>
		mRemote.transact(1, parcel, parcel1, 0);
	//   13   25:aload_0         
	//   14   26:getfield        #19  <Field IBinder mRemote>
	//   15   29:iconst_1        
	//   16   30:aload_3         
	//   17   31:aload           4
	//   18   33:iconst_0        
	//   19   34:invokeinterface #46  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   20   39:pop             
		parcel1.readException();
	//   21   40:aload           4
	//   22   42:invokevirtual   #49  <Method void Parcel.readException()>
		parcel1.recycle();
	//   23   45:aload           4
	//   24   47:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   25   50:aload_3         
	//   26   51:invokevirtual   #52  <Method void Parcel.recycle()>
		return;
	//   27   54:return          
		s;
	//   28   55:astore_1        
		parcel1.recycle();
	//   29   56:aload           4
	//   30   58:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   31   61:aload_3         
	//   32   62:invokevirtual   #52  <Method void Parcel.recycle()>
		throw s;
	//   33   65:aload_1         
	//   34   66:athrow          
	}

	public void registerCallback(IRemoteServiceCallback iremoteservicecallback)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.sec.android.service.health.upgrade.IPackageInstallInterface");
	//    4    8:aload_2         
	//    5    9:ldc1            #34  <String "com.sec.android.service.health.upgrade.IPackageInstallInterface">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		if(iremoteservicecallback == null)
			break MISSING_BLOCK_LABEL_57;
	//    7   14:aload_1         
	//    8   15:ifnull          57
		iremoteservicecallback = ((IRemoteServiceCallback) (iremoteservicecallback.asBinder()));
	//    9   18:aload_1         
	//   10   19:invokeinterface #64  <Method IBinder IRemoteServiceCallback.asBinder()>
	//   11   24:astore_1        
_L1:
		parcel.writeStrongBinder(((IBinder) (iremoteservicecallback)));
	//   12   25:aload_2         
	//   13   26:aload_1         
	//   14   27:invokevirtual   #67  <Method void Parcel.writeStrongBinder(IBinder)>
		mRemote.transact(4, parcel, parcel1, 0);
	//   15   30:aload_0         
	//   16   31:getfield        #19  <Field IBinder mRemote>
	//   17   34:iconst_4        
	//   18   35:aload_2         
	//   19   36:aload_3         
	//   20   37:iconst_0        
	//   21   38:invokeinterface #46  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   22   43:pop             
		parcel1.readException();
	//   23   44:aload_3         
	//   24   45:invokevirtual   #49  <Method void Parcel.readException()>
		parcel1.recycle();
	//   25   48:aload_3         
	//   26   49:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   27   52:aload_2         
	//   28   53:invokevirtual   #52  <Method void Parcel.recycle()>
		return;
	//   29   56:return          
		iremoteservicecallback = null;
	//   30   57:aconst_null     
	//   31   58:astore_1        
		  goto _L1
	//*  32   59:goto            25
		iremoteservicecallback;
	//   33   62:astore_1        
		parcel1.recycle();
	//   34   63:aload_3         
	//   35   64:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   36   67:aload_2         
	//   37   68:invokevirtual   #52  <Method void Parcel.recycle()>
		throw iremoteservicecallback;
	//   38   71:aload_1         
	//   39   72:athrow          
	}

	public void unregisterCallback()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    3    7:astore_2        
		parcel.writeInterfaceToken("com.sec.android.service.health.upgrade.IPackageInstallInterface");
	//    4    8:aload_1         
	//    5    9:ldc1            #34  <String "com.sec.android.service.health.upgrade.IPackageInstallInterface">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(5, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:iconst_5        
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:iconst_0        
	//   13   22:invokeinterface #46  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   27:pop             
		parcel1.readException();
	//   15   28:aload_2         
	//   16   29:invokevirtual   #49  <Method void Parcel.readException()>
		parcel1.recycle();
	//   17   32:aload_2         
	//   18   33:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   19   36:aload_1         
	//   20   37:invokevirtual   #52  <Method void Parcel.recycle()>
		return;
	//   21   40:return          
		Exception exception;
		exception;
	//   22   41:astore_3        
		parcel1.recycle();
	//   23   42:aload_2         
	//   24   43:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   25   46:aload_1         
	//   26   47:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   27   50:aload_3         
	//   28   51:athrow          
	}

	private IBinder mRemote;

	IPackageInstallInterface$Stub$Proxy(IBinder ibinder)
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
