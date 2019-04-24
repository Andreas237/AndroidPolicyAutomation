// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.bluetooth;

import android.os.*;

// Referenced classes of package android.bluetooth:
//			IBluetoothStateChangeCallback

public static abstract class IBluetoothStateChangeCallback$Stub extends Binder
	implements IBluetoothStateChangeCallback
{
	static class Proxy
		implements IBluetoothStateChangeCallback
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
			return "android.bluetooth.IBluetoothStateChangeCallback";
		//    0    0:ldc1            #26  <String "android.bluetooth.IBluetoothStateChangeCallback">
		//    1    2:areturn         
		}

		public void onBluetoothStateChange(boolean flag)
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
			parcel.writeInterfaceToken("android.bluetooth.IBluetoothStateChangeCallback");
		//    4    9:aload_3         
		//    5   10:ldc1            #26  <String "android.bluetooth.IBluetoothStateChangeCallback">
		//    6   12:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
			int i;
			Exception exception;
			if(flag)
		//*   7   15:iload_1         
		//*   8   16:ifeq            73
				i = 1;
		//    9   19:iconst_1        
		//   10   20:istore_2        
			else
		//*  11   21:goto            24
		//*  12   24:aload_3         
		//*  13   25:iload_2         
		//*  14   26:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		//*  15   29:aload_0         
		//*  16   30:getfield        #19  <Field IBinder mRemote>
		//*  17   33:iconst_1        
		//*  18   34:aload_3         
		//*  19   35:aload           4
		//*  20   37:iconst_0        
		//*  21   38:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//*  22   43:pop             
		//*  23   44:aload           4
		//*  24   46:invokevirtual   #53  <Method void Parcel.readException()>
		//*  25   49:aload           4
		//*  26   51:invokevirtual   #56  <Method void Parcel.recycle()>
		//*  27   54:aload_3         
		//*  28   55:invokevirtual   #56  <Method void Parcel.recycle()>
		//*  29   58:return          
		//*  30   59:astore          5
		//*  31   61:aload           4
		//*  32   63:invokevirtual   #56  <Method void Parcel.recycle()>
		//*  33   66:aload_3         
		//*  34   67:invokevirtual   #56  <Method void Parcel.recycle()>
		//*  35   70:aload           5
		//*  36   72:athrow          
				i = 0;
		//   37   73:iconst_0        
		//   38   74:istore_2        
			parcel.writeInt(i);
			mRemote.transact(1, parcel, parcel1, 0);
			parcel1.readException();
			parcel1.recycle();
			parcel.recycle();
			return;
			exception;
			parcel1.recycle();
			parcel.recycle();
			throw exception;
		//*  39   75:goto            24
		}

		private IBinder mRemote;

		Proxy(IBinder ibinder)
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


	public static IBluetoothStateChangeCallback asInterface(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("android.bluetooth.IBluetoothStateChangeCallback");
	//    4    6:aload_0         
	//    5    7:ldc1            #14  <String "android.bluetooth.IBluetoothStateChangeCallback">
	//    6    9:invokeinterface #34  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof IBluetoothStateChangeCallback))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class IBluetoothStateChangeCallback>
	//*  12   23:ifeq            31
			return (IBluetoothStateChangeCallback)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class IBluetoothStateChangeCallback>
	//   15   30:areturn         
		else
			return ((IBluetoothStateChangeCallback) (new Proxy(ibinder)));
	//   16   31:new             #9   <Class IBluetoothStateChangeCallback$Stub$Proxy>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #37  <Method void IBluetoothStateChangeCallback$Stub$Proxy(IBinder)>
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
	//	               1: 39
	//	               1598968902: 31
	//*   2   28:goto            73
		case 1598968902: 
			parcel1.writeString("android.bluetooth.IBluetoothStateChangeCallback");
	//    3   31:aload_3         
	//    4   32:ldc1            #14  <String "android.bluetooth.IBluetoothStateChangeCallback">
	//    5   34:invokevirtual   #49  <Method void Parcel.writeString(String)>
			return true;
	//    6   37:iconst_1        
	//    7   38:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("android.bluetooth.IBluetoothStateChangeCallback");
	//    8   39:aload_2         
	//    9   40:ldc1            #14  <String "android.bluetooth.IBluetoothStateChangeCallback">
	//   10   42:invokevirtual   #52  <Method void Parcel.enforceInterface(String)>
			boolean flag;
			if(parcel.readInt() != 0)
	//*  11   45:aload_2         
	//*  12   46:invokevirtual   #56  <Method int Parcel.readInt()>
	//*  13   49:ifeq            58
				flag = true;
	//   14   52:iconst_1        
	//   15   53:istore          5
			else
	//*  16   55:goto            61
				flag = false;
	//   17   58:iconst_0        
	//   18   59:istore          5
			onBluetoothStateChange(flag);
	//   19   61:aload_0         
	//   20   62:iload           5
	//   21   64:invokevirtual   #60  <Method void onBluetoothStateChange(boolean)>
			parcel1.writeNoException();
	//   22   67:aload_3         
	//   23   68:invokevirtual   #63  <Method void Parcel.writeNoException()>
			return true;
	//   24   71:iconst_1        
	//   25   72:ireturn         
		}
		return super.onTransact(i, parcel, parcel1, j);
	//   26   73:aload_0         
	//   27   74:iload_1         
	//   28   75:aload_2         
	//   29   76:aload_3         
	//   30   77:iload           4
	//   31   79:invokespecial   #65  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//   32   82:ireturn         
	}

	private static final String DESCRIPTOR = "android.bluetooth.IBluetoothStateChangeCallback";
	static final int TRANSACTION_onBluetoothStateChange = 1;

	public IBluetoothStateChangeCallback$Stub()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Binder()>
		attachInterface(((android.os.IInterface) (this)), "android.bluetooth.IBluetoothStateChangeCallback");
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:ldc1            #14  <String "android.bluetooth.IBluetoothStateChangeCallback">
	//    5    8:invokevirtual   #25  <Method void attachInterface(android.os.IInterface, String)>
	//    6   11:return          
	}
}
