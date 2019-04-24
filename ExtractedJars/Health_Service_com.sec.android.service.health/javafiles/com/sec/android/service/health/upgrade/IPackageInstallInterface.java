// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.upgrade;

import android.os.*;

// Referenced classes of package com.sec.android.service.health.upgrade:
//			IRemoteServiceCallback

public interface IPackageInstallInterface
	extends IInterface
{
	public static abstract class Stub extends Binder
		implements IPackageInstallInterface
	{

		public static IPackageInstallInterface asInterface(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.sec.android.service.health.upgrade.IPackageInstallInterface");
		//    4    6:aload_0         
		//    5    7:ldc1            #14  <String "com.sec.android.service.health.upgrade.IPackageInstallInterface">
		//    6    9:invokeinterface #42  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface != null && (iinterface instanceof IPackageInstallInterface))
		//*   8   15:aload_1         
		//*   9   16:ifnull          31
		//*  10   19:aload_1         
		//*  11   20:instanceof      #6   <Class IPackageInstallInterface>
		//*  12   23:ifeq            31
				return (IPackageInstallInterface)iinterface;
		//   13   26:aload_1         
		//   14   27:checkcast       #6   <Class IPackageInstallInterface>
		//   15   30:areturn         
			else
				return ((IPackageInstallInterface) (new Proxy(ibinder)));
		//   16   31:new             #9   <Class IPackageInstallInterface$Stub$Proxy>
		//   17   34:dup             
		//   18   35:aload_0         
		//   19   36:invokespecial   #45  <Method void IPackageInstallInterface$Stub$Proxy(IBinder)>
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
		//*   1    1:lookupswitch    6: default 60
		//		               1: 78
		//		               2: 102
		//		               3: 122
		//		               4: 142
		//		               5: 165
		//		               1598968902: 70
			default:
				return super.onTransact(i, parcel, parcel1, j);
		//    2   60:aload_0         
		//    3   61:iload_1         
		//    4   62:aload_2         
		//    5   63:aload_3         
		//    6   64:iload           4
		//    7   66:invokespecial   #53  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//    8   69:ireturn         

			case 1598968902: 
				parcel1.writeString("com.sec.android.service.health.upgrade.IPackageInstallInterface");
		//    9   70:aload_3         
		//   10   71:ldc1            #14  <String "com.sec.android.service.health.upgrade.IPackageInstallInterface">
		//   11   73:invokevirtual   #59  <Method void Parcel.writeString(String)>
				return true;
		//   12   76:iconst_1        
		//   13   77:ireturn         

			case 1: // '\001'
				parcel.enforceInterface("com.sec.android.service.health.upgrade.IPackageInstallInterface");
		//   14   78:aload_2         
		//   15   79:ldc1            #14  <String "com.sec.android.service.health.upgrade.IPackageInstallInterface">
		//   16   81:invokevirtual   #62  <Method void Parcel.enforceInterface(String)>
				installPackage(parcel.readString(), parcel.readString());
		//   17   84:aload_0         
		//   18   85:aload_2         
		//   19   86:invokevirtual   #66  <Method String Parcel.readString()>
		//   20   89:aload_2         
		//   21   90:invokevirtual   #66  <Method String Parcel.readString()>
		//   22   93:invokevirtual   #70  <Method void installPackage(String, String)>
				parcel1.writeNoException();
		//   23   96:aload_3         
		//   24   97:invokevirtual   #73  <Method void Parcel.writeNoException()>
				return true;
		//   25  100:iconst_1        
		//   26  101:ireturn         

			case 2: // '\002'
				parcel.enforceInterface("com.sec.android.service.health.upgrade.IPackageInstallInterface");
		//   27  102:aload_2         
		//   28  103:ldc1            #14  <String "com.sec.android.service.health.upgrade.IPackageInstallInterface">
		//   29  105:invokevirtual   #62  <Method void Parcel.enforceInterface(String)>
				deletePackage(parcel.readString());
		//   30  108:aload_0         
		//   31  109:aload_2         
		//   32  110:invokevirtual   #66  <Method String Parcel.readString()>
		//   33  113:invokevirtual   #76  <Method void deletePackage(String)>
				parcel1.writeNoException();
		//   34  116:aload_3         
		//   35  117:invokevirtual   #73  <Method void Parcel.writeNoException()>
				return true;
		//   36  120:iconst_1        
		//   37  121:ireturn         

			case 3: // '\003'
				parcel.enforceInterface("com.sec.android.service.health.upgrade.IPackageInstallInterface");
		//   38  122:aload_2         
		//   39  123:ldc1            #14  <String "com.sec.android.service.health.upgrade.IPackageInstallInterface">
		//   40  125:invokevirtual   #62  <Method void Parcel.enforceInterface(String)>
				disablePackage(parcel.readString());
		//   41  128:aload_0         
		//   42  129:aload_2         
		//   43  130:invokevirtual   #66  <Method String Parcel.readString()>
		//   44  133:invokevirtual   #79  <Method void disablePackage(String)>
				parcel1.writeNoException();
		//   45  136:aload_3         
		//   46  137:invokevirtual   #73  <Method void Parcel.writeNoException()>
				return true;
		//   47  140:iconst_1        
		//   48  141:ireturn         

			case 4: // '\004'
				parcel.enforceInterface("com.sec.android.service.health.upgrade.IPackageInstallInterface");
		//   49  142:aload_2         
		//   50  143:ldc1            #14  <String "com.sec.android.service.health.upgrade.IPackageInstallInterface">
		//   51  145:invokevirtual   #62  <Method void Parcel.enforceInterface(String)>
				registerCallback(IRemoteServiceCallback.Stub.asInterface(parcel.readStrongBinder()));
		//   52  148:aload_0         
		//   53  149:aload_2         
		//   54  150:invokevirtual   #82  <Method IBinder Parcel.readStrongBinder()>
		//   55  153:invokestatic    #87  <Method IRemoteServiceCallback IRemoteServiceCallback$Stub.asInterface(IBinder)>
		//   56  156:invokevirtual   #91  <Method void registerCallback(IRemoteServiceCallback)>
				parcel1.writeNoException();
		//   57  159:aload_3         
		//   58  160:invokevirtual   #73  <Method void Parcel.writeNoException()>
				return true;
		//   59  163:iconst_1        
		//   60  164:ireturn         

			case 5: // '\005'
				parcel.enforceInterface("com.sec.android.service.health.upgrade.IPackageInstallInterface");
		//   61  165:aload_2         
		//   62  166:ldc1            #14  <String "com.sec.android.service.health.upgrade.IPackageInstallInterface">
		//   63  168:invokevirtual   #62  <Method void Parcel.enforceInterface(String)>
				unregisterCallback();
		//   64  171:aload_0         
		//   65  172:invokevirtual   #94  <Method void unregisterCallback()>
				parcel1.writeNoException();
		//   66  175:aload_3         
		//   67  176:invokevirtual   #73  <Method void Parcel.writeNoException()>
				return true;
		//   68  179:iconst_1        
		//   69  180:ireturn         
			}
		}

		private static final String DESCRIPTOR = "com.sec.android.service.health.upgrade.IPackageInstallInterface";
		static final int TRANSACTION_deletePackage = 2;
		static final int TRANSACTION_disablePackage = 3;
		static final int TRANSACTION_installPackage = 1;
		static final int TRANSACTION_registerCallback = 4;
		static final int TRANSACTION_unregisterCallback = 5;

		public Stub()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #29  <Method void Binder()>
			attachInterface(((IInterface) (this)), "com.sec.android.service.health.upgrade.IPackageInstallInterface");
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:ldc1            #14  <String "com.sec.android.service.health.upgrade.IPackageInstallInterface">
		//    5    8:invokevirtual   #33  <Method void attachInterface(IInterface, String)>
		//    6   11:return          
		}
	}

	private static class Stub.Proxy
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


	public abstract void deletePackage(String s)
		throws RemoteException;

	public abstract void disablePackage(String s)
		throws RemoteException;

	public abstract void installPackage(String s, String s1)
		throws RemoteException;

	public abstract void registerCallback(IRemoteServiceCallback iremoteservicecallback)
		throws RemoteException;

	public abstract void unregisterCallback()
		throws RemoteException;
}
