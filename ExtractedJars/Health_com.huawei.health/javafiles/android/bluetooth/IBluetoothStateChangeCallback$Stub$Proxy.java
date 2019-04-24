// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.bluetooth;

import android.os.*;

// Referenced classes of package android.bluetooth:
//			IBluetoothStateChangeCallback

static class IBluetoothStateChangeCallback$Stub$Proxy
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

	IBluetoothStateChangeCallback$Stub$Proxy(IBinder ibinder)
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
