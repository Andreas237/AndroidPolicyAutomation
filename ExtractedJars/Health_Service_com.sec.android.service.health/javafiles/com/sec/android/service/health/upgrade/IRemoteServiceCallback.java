// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.upgrade;

import android.os.*;

public interface IRemoteServiceCallback
	extends IInterface
{
	public static abstract class Stub extends Binder
		implements IRemoteServiceCallback
	{

		public static IRemoteServiceCallback asInterface(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.sec.android.service.health.upgrade.IRemoteServiceCallback");
		//    4    6:aload_0         
		//    5    7:ldc1            #14  <String "com.sec.android.service.health.upgrade.IRemoteServiceCallback">
		//    6    9:invokeinterface #40  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface != null && (iinterface instanceof IRemoteServiceCallback))
		//*   8   15:aload_1         
		//*   9   16:ifnull          31
		//*  10   19:aload_1         
		//*  11   20:instanceof      #6   <Class IRemoteServiceCallback>
		//*  12   23:ifeq            31
				return (IRemoteServiceCallback)iinterface;
		//   13   26:aload_1         
		//   14   27:checkcast       #6   <Class IRemoteServiceCallback>
		//   15   30:areturn         
			else
				return ((IRemoteServiceCallback) (new Proxy(ibinder)));
		//   16   31:new             #9   <Class IRemoteServiceCallback$Stub$Proxy>
		//   17   34:dup             
		//   18   35:aload_0         
		//   19   36:invokespecial   #43  <Method void IRemoteServiceCallback$Stub$Proxy(IBinder)>
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
		//*   1    1:lookupswitch    5: default 52
		//		               1: 70
		//		               2: 94
		//		               3: 114
		//		               4: 138
		//		               1598968902: 62
			default:
				return super.onTransact(i, parcel, parcel1, j);
		//    2   52:aload_0         
		//    3   53:iload_1         
		//    4   54:aload_2         
		//    5   55:aload_3         
		//    6   56:iload           4
		//    7   58:invokespecial   #51  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//    8   61:ireturn         

			case 1598968902: 
				parcel1.writeString("com.sec.android.service.health.upgrade.IRemoteServiceCallback");
		//    9   62:aload_3         
		//   10   63:ldc1            #14  <String "com.sec.android.service.health.upgrade.IRemoteServiceCallback">
		//   11   65:invokevirtual   #57  <Method void Parcel.writeString(String)>
				return true;
		//   12   68:iconst_1        
		//   13   69:ireturn         

			case 1: // '\001'
				parcel.enforceInterface("com.sec.android.service.health.upgrade.IRemoteServiceCallback");
		//   14   70:aload_2         
		//   15   71:ldc1            #14  <String "com.sec.android.service.health.upgrade.IRemoteServiceCallback">
		//   16   73:invokevirtual   #60  <Method void Parcel.enforceInterface(String)>
				packageInstalled(parcel.readString(), parcel.readInt());
		//   17   76:aload_0         
		//   18   77:aload_2         
		//   19   78:invokevirtual   #64  <Method String Parcel.readString()>
		//   20   81:aload_2         
		//   21   82:invokevirtual   #68  <Method int Parcel.readInt()>
		//   22   85:invokevirtual   #72  <Method void packageInstalled(String, int)>
				parcel1.writeNoException();
		//   23   88:aload_3         
		//   24   89:invokevirtual   #75  <Method void Parcel.writeNoException()>
				return true;
		//   25   92:iconst_1        
		//   26   93:ireturn         

			case 2: // '\002'
				parcel.enforceInterface("com.sec.android.service.health.upgrade.IRemoteServiceCallback");
		//   27   94:aload_2         
		//   28   95:ldc1            #14  <String "com.sec.android.service.health.upgrade.IRemoteServiceCallback">
		//   29   97:invokevirtual   #60  <Method void Parcel.enforceInterface(String)>
				packageInstallFailed(parcel.readString());
		//   30  100:aload_0         
		//   31  101:aload_2         
		//   32  102:invokevirtual   #64  <Method String Parcel.readString()>
		//   33  105:invokevirtual   #78  <Method void packageInstallFailed(String)>
				parcel1.writeNoException();
		//   34  108:aload_3         
		//   35  109:invokevirtual   #75  <Method void Parcel.writeNoException()>
				return true;
		//   36  112:iconst_1        
		//   37  113:ireturn         

			case 3: // '\003'
				parcel.enforceInterface("com.sec.android.service.health.upgrade.IRemoteServiceCallback");
		//   38  114:aload_2         
		//   39  115:ldc1            #14  <String "com.sec.android.service.health.upgrade.IRemoteServiceCallback">
		//   40  117:invokevirtual   #60  <Method void Parcel.enforceInterface(String)>
				packageDeleted(parcel.readString(), parcel.readInt());
		//   41  120:aload_0         
		//   42  121:aload_2         
		//   43  122:invokevirtual   #64  <Method String Parcel.readString()>
		//   44  125:aload_2         
		//   45  126:invokevirtual   #68  <Method int Parcel.readInt()>
		//   46  129:invokevirtual   #81  <Method void packageDeleted(String, int)>
				parcel1.writeNoException();
		//   47  132:aload_3         
		//   48  133:invokevirtual   #75  <Method void Parcel.writeNoException()>
				return true;
		//   49  136:iconst_1        
		//   50  137:ireturn         

			case 4: // '\004'
				parcel.enforceInterface("com.sec.android.service.health.upgrade.IRemoteServiceCallback");
		//   51  138:aload_2         
		//   52  139:ldc1            #14  <String "com.sec.android.service.health.upgrade.IRemoteServiceCallback">
		//   53  141:invokevirtual   #60  <Method void Parcel.enforceInterface(String)>
				packageDeleteFailed(parcel.readString());
		//   54  144:aload_0         
		//   55  145:aload_2         
		//   56  146:invokevirtual   #64  <Method String Parcel.readString()>
		//   57  149:invokevirtual   #84  <Method void packageDeleteFailed(String)>
				parcel1.writeNoException();
		//   58  152:aload_3         
		//   59  153:invokevirtual   #75  <Method void Parcel.writeNoException()>
				return true;
		//   60  156:iconst_1        
		//   61  157:ireturn         
			}
		}

		private static final String DESCRIPTOR = "com.sec.android.service.health.upgrade.IRemoteServiceCallback";
		static final int TRANSACTION_packageDeleteFailed = 4;
		static final int TRANSACTION_packageDeleted = 3;
		static final int TRANSACTION_packageInstallFailed = 2;
		static final int TRANSACTION_packageInstalled = 1;

		public Stub()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #27  <Method void Binder()>
			attachInterface(((IInterface) (this)), "com.sec.android.service.health.upgrade.IRemoteServiceCallback");
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:ldc1            #14  <String "com.sec.android.service.health.upgrade.IRemoteServiceCallback">
		//    5    8:invokevirtual   #31  <Method void attachInterface(IInterface, String)>
		//    6   11:return          
		}
	}

	private static class Stub.Proxy
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

		Stub.Proxy(IBinder ibinder)
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


	public abstract void packageDeleteFailed(String s)
		throws RemoteException;

	public abstract void packageDeleted(String s, int i)
		throws RemoteException;

	public abstract void packageInstallFailed(String s)
		throws RemoteException;

	public abstract void packageInstalled(String s, int i)
		throws RemoteException;
}
