// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.upgrade;

import android.os.*;

// Referenced classes of package com.sec.android.service.health.upgrade:
//			IRemoteServiceCallback

private static class IRemoteServiceCallback$Stub$Proxy
	implements IRemoteServiceCallback
{

	public IBinder asBinder()
	{
		return mRemote;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field IBinder mRemote>
	//    2    4:areturn         
	}

	public String getInterfaceDescriptor()
	{
		return "com.sec.android.service.health.upgrade.IRemoteServiceCallback";
	//    0    0:ldc1            #26  <String "com.sec.android.service.health.upgrade.IRemoteServiceCallback">
	//    1    2:areturn         
	}

	public void packageDeleteFailed(String s)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #36  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.sec.android.service.health.upgrade.IRemoteServiceCallback");
	//    4    8:aload_2         
	//    5    9:ldc1            #26  <String "com.sec.android.service.health.upgrade.IRemoteServiceCallback">
	//    6   11:invokevirtual   #39  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   14:aload_2         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #42  <Method void Parcel.writeString(String)>
		mRemote.transact(4, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #19  <Field IBinder mRemote>
	//   12   23:iconst_4        
	//   13   24:aload_2         
	//   14   25:aload_3         
	//   15   26:iconst_0        
	//   16   27:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   32:pop             
		parcel1.readException();
	//   18   33:aload_3         
	//   19   34:invokevirtual   #51  <Method void Parcel.readException()>
		parcel1.recycle();
	//   20   37:aload_3         
	//   21   38:invokevirtual   #54  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   41:aload_2         
	//   23   42:invokevirtual   #54  <Method void Parcel.recycle()>
		return;
	//   24   45:return          
		s;
	//   25   46:astore_1        
		parcel1.recycle();
	//   26   47:aload_3         
	//   27   48:invokevirtual   #54  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   51:aload_2         
	//   29   52:invokevirtual   #54  <Method void Parcel.recycle()>
		throw s;
	//   30   55:aload_1         
	//   31   56:athrow          
	}

	public void packageDeleted(String s, int i)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #36  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("com.sec.android.service.health.upgrade.IRemoteServiceCallback");
	//    4    9:aload_3         
	//    5   10:ldc1            #26  <String "com.sec.android.service.health.upgrade.IRemoteServiceCallback">
	//    6   12:invokevirtual   #39  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   15:aload_3         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #42  <Method void Parcel.writeString(String)>
		parcel.writeInt(i);
	//   10   20:aload_3         
	//   11   21:iload_2         
	//   12   22:invokevirtual   #61  <Method void Parcel.writeInt(int)>
		mRemote.transact(3, parcel, parcel1, 0);
	//   13   25:aload_0         
	//   14   26:getfield        #19  <Field IBinder mRemote>
	//   15   29:iconst_3        
	//   16   30:aload_3         
	//   17   31:aload           4
	//   18   33:iconst_0        
	//   19   34:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   20   39:pop             
		parcel1.readException();
	//   21   40:aload           4
	//   22   42:invokevirtual   #51  <Method void Parcel.readException()>
		parcel1.recycle();
	//   23   45:aload           4
	//   24   47:invokevirtual   #54  <Method void Parcel.recycle()>
		parcel.recycle();
	//   25   50:aload_3         
	//   26   51:invokevirtual   #54  <Method void Parcel.recycle()>
		return;
	//   27   54:return          
		s;
	//   28   55:astore_1        
		parcel1.recycle();
	//   29   56:aload           4
	//   30   58:invokevirtual   #54  <Method void Parcel.recycle()>
		parcel.recycle();
	//   31   61:aload_3         
	//   32   62:invokevirtual   #54  <Method void Parcel.recycle()>
		throw s;
	//   33   65:aload_1         
	//   34   66:athrow          
	}

	public void packageInstallFailed(String s)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #36  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.sec.android.service.health.upgrade.IRemoteServiceCallback");
	//    4    8:aload_2         
	//    5    9:ldc1            #26  <String "com.sec.android.service.health.upgrade.IRemoteServiceCallback">
	//    6   11:invokevirtual   #39  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   14:aload_2         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #42  <Method void Parcel.writeString(String)>
		mRemote.transact(2, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #19  <Field IBinder mRemote>
	//   12   23:iconst_2        
	//   13   24:aload_2         
	//   14   25:aload_3         
	//   15   26:iconst_0        
	//   16   27:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   32:pop             
		parcel1.readException();
	//   18   33:aload_3         
	//   19   34:invokevirtual   #51  <Method void Parcel.readException()>
		parcel1.recycle();
	//   20   37:aload_3         
	//   21   38:invokevirtual   #54  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   41:aload_2         
	//   23   42:invokevirtual   #54  <Method void Parcel.recycle()>
		return;
	//   24   45:return          
		s;
	//   25   46:astore_1        
		parcel1.recycle();
	//   26   47:aload_3         
	//   27   48:invokevirtual   #54  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   51:aload_2         
	//   29   52:invokevirtual   #54  <Method void Parcel.recycle()>
		throw s;
	//   30   55:aload_1         
	//   31   56:athrow          
	}

	public void packageInstalled(String s, int i)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #36  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("com.sec.android.service.health.upgrade.IRemoteServiceCallback");
	//    4    9:aload_3         
	//    5   10:ldc1            #26  <String "com.sec.android.service.health.upgrade.IRemoteServiceCallback">
	//    6   12:invokevirtual   #39  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   15:aload_3         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #42  <Method void Parcel.writeString(String)>
		parcel.writeInt(i);
	//   10   20:aload_3         
	//   11   21:iload_2         
	//   12   22:invokevirtual   #61  <Method void Parcel.writeInt(int)>
		mRemote.transact(1, parcel, parcel1, 0);
	//   13   25:aload_0         
	//   14   26:getfield        #19  <Field IBinder mRemote>
	//   15   29:iconst_1        
	//   16   30:aload_3         
	//   17   31:aload           4
	//   18   33:iconst_0        
	//   19   34:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   20   39:pop             
		parcel1.readException();
	//   21   40:aload           4
	//   22   42:invokevirtual   #51  <Method void Parcel.readException()>
		parcel1.recycle();
	//   23   45:aload           4
	//   24   47:invokevirtual   #54  <Method void Parcel.recycle()>
		parcel.recycle();
	//   25   50:aload_3         
	//   26   51:invokevirtual   #54  <Method void Parcel.recycle()>
		return;
	//   27   54:return          
		s;
	//   28   55:astore_1        
		parcel1.recycle();
	//   29   56:aload           4
	//   30   58:invokevirtual   #54  <Method void Parcel.recycle()>
		parcel.recycle();
	//   31   61:aload_3         
	//   32   62:invokevirtual   #54  <Method void Parcel.recycle()>
		throw s;
	//   33   65:aload_1         
	//   34   66:athrow          
	}

	private IBinder mRemote;

	IRemoteServiceCallback$Stub$Proxy(IBinder ibinder)
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
