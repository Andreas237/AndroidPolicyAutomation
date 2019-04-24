// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.bluetooth;

import android.os.*;
import java.util.List;

// Referenced classes of package android.bluetooth:
//			IBluetoothInputDevice, BluetoothDevice

static class IBluetoothInputDevice$Stub$Proxy
	implements IBluetoothInputDevice
{

	public IBinder asBinder()
	{
		return mRemote;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field IBinder mRemote>
	//    2    4:areturn         
	}

	public boolean connect(BluetoothDevice bluetoothdevice)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    1    3:astore          4
		parcel1 = Parcel.obtain();
	//    2    5:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    3    8:astore          5
		parcel.writeInterfaceToken("android.bluetooth.IBluetoothInputDevice");
	//    4   10:aload           4
	//    5   12:ldc1            #34  <String "android.bluetooth.IBluetoothInputDevice">
	//    6   14:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
		if(bluetoothdevice == null)
			break MISSING_BLOCK_LABEL_37;
	//    7   17:aload_1         
	//    8   18:ifnull          37
		parcel.writeInt(1);
	//    9   21:aload           4
	//   10   23:iconst_1        
	//   11   24:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		bluetoothdevice.writeToParcel(parcel, 0);
	//   12   27:aload_1         
	//   13   28:aload           4
	//   14   30:iconst_0        
	//   15   31:invokevirtual   #48  <Method void BluetoothDevice.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_43;
	//   16   34:goto            43
		parcel.writeInt(0);
	//   17   37:aload           4
	//   18   39:iconst_0        
	//   19   40:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		int i;
		mRemote.transact(1, parcel, parcel1, 0);
	//   20   43:aload_0         
	//   21   44:getfield        #19  <Field IBinder mRemote>
	//   22   47:iconst_1        
	//   23   48:aload           4
	//   24   50:aload           5
	//   25   52:iconst_0        
	//   26   53:invokeinterface #54  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   27   58:pop             
		parcel1.readException();
	//   28   59:aload           5
	//   29   61:invokevirtual   #57  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   30   64:aload           5
	//   31   66:invokevirtual   #61  <Method int Parcel.readInt()>
	//   32   69:istore_2        
		boolean flag;
		if(i != 0)
	//*  33   70:iload_2         
	//*  34   71:ifeq            79
			flag = true;
	//   35   74:iconst_1        
	//   36   75:istore_3        
		else
	//*  37   76:goto            81
			flag = false;
	//   38   79:iconst_0        
	//   39   80:istore_3        
		parcel1.recycle();
	//   40   81:aload           5
	//   41   83:invokevirtual   #64  <Method void Parcel.recycle()>
		parcel.recycle();
	//   42   86:aload           4
	//   43   88:invokevirtual   #64  <Method void Parcel.recycle()>
		return flag;
	//   44   91:iload_3         
	//   45   92:ireturn         
		bluetoothdevice;
	//   46   93:astore_1        
		parcel1.recycle();
	//   47   94:aload           5
	//   48   96:invokevirtual   #64  <Method void Parcel.recycle()>
		parcel.recycle();
	//   49   99:aload           4
	//   50  101:invokevirtual   #64  <Method void Parcel.recycle()>
		throw bluetoothdevice;
	//   51  104:aload_1         
	//   52  105:athrow          
	}

	public boolean disconnect(BluetoothDevice bluetoothdevice)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    1    3:astore          4
		parcel1 = Parcel.obtain();
	//    2    5:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    3    8:astore          5
		parcel.writeInterfaceToken("android.bluetooth.IBluetoothInputDevice");
	//    4   10:aload           4
	//    5   12:ldc1            #34  <String "android.bluetooth.IBluetoothInputDevice">
	//    6   14:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
		if(bluetoothdevice == null)
			break MISSING_BLOCK_LABEL_37;
	//    7   17:aload_1         
	//    8   18:ifnull          37
		parcel.writeInt(1);
	//    9   21:aload           4
	//   10   23:iconst_1        
	//   11   24:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		bluetoothdevice.writeToParcel(parcel, 0);
	//   12   27:aload_1         
	//   13   28:aload           4
	//   14   30:iconst_0        
	//   15   31:invokevirtual   #48  <Method void BluetoothDevice.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_43;
	//   16   34:goto            43
		parcel.writeInt(0);
	//   17   37:aload           4
	//   18   39:iconst_0        
	//   19   40:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		int i;
		mRemote.transact(2, parcel, parcel1, 0);
	//   20   43:aload_0         
	//   21   44:getfield        #19  <Field IBinder mRemote>
	//   22   47:iconst_2        
	//   23   48:aload           4
	//   24   50:aload           5
	//   25   52:iconst_0        
	//   26   53:invokeinterface #54  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   27   58:pop             
		parcel1.readException();
	//   28   59:aload           5
	//   29   61:invokevirtual   #57  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   30   64:aload           5
	//   31   66:invokevirtual   #61  <Method int Parcel.readInt()>
	//   32   69:istore_2        
		boolean flag;
		if(i != 0)
	//*  33   70:iload_2         
	//*  34   71:ifeq            79
			flag = true;
	//   35   74:iconst_1        
	//   36   75:istore_3        
		else
	//*  37   76:goto            81
			flag = false;
	//   38   79:iconst_0        
	//   39   80:istore_3        
		parcel1.recycle();
	//   40   81:aload           5
	//   41   83:invokevirtual   #64  <Method void Parcel.recycle()>
		parcel.recycle();
	//   42   86:aload           4
	//   43   88:invokevirtual   #64  <Method void Parcel.recycle()>
		return flag;
	//   44   91:iload_3         
	//   45   92:ireturn         
		bluetoothdevice;
	//   46   93:astore_1        
		parcel1.recycle();
	//   47   94:aload           5
	//   48   96:invokevirtual   #64  <Method void Parcel.recycle()>
		parcel.recycle();
	//   49   99:aload           4
	//   50  101:invokevirtual   #64  <Method void Parcel.recycle()>
		throw bluetoothdevice;
	//   51  104:aload_1         
	//   52  105:athrow          
	}

	public List getConnectedDevices()
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
		java.util.ArrayList arraylist;
		parcel.writeInterfaceToken("android.bluetooth.IBluetoothInputDevice");
	//    4    8:aload_1         
	//    5    9:ldc1            #34  <String "android.bluetooth.IBluetoothInputDevice">
	//    6   11:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(3, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:iconst_3        
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:iconst_0        
	//   13   22:invokeinterface #54  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   27:pop             
		parcel1.readException();
	//   15   28:aload_2         
	//   16   29:invokevirtual   #57  <Method void Parcel.readException()>
		arraylist = parcel1.createTypedArrayList(BluetoothDevice.CREATOR);
	//   17   32:aload_2         
	//   18   33:getstatic       #72  <Field android.os.Parcelable$Creator BluetoothDevice.CREATOR>
	//   19   36:invokevirtual   #76  <Method java.util.ArrayList Parcel.createTypedArrayList(android.os.Parcelable$Creator)>
	//   20   39:astore_3        
		parcel1.recycle();
	//   21   40:aload_2         
	//   22   41:invokevirtual   #64  <Method void Parcel.recycle()>
		parcel.recycle();
	//   23   44:aload_1         
	//   24   45:invokevirtual   #64  <Method void Parcel.recycle()>
		return ((List) (arraylist));
	//   25   48:aload_3         
	//   26   49:areturn         
		Exception exception;
		exception;
	//   27   50:astore_3        
		parcel1.recycle();
	//   28   51:aload_2         
	//   29   52:invokevirtual   #64  <Method void Parcel.recycle()>
		parcel.recycle();
	//   30   55:aload_1         
	//   31   56:invokevirtual   #64  <Method void Parcel.recycle()>
		throw exception;
	//   32   59:aload_3         
	//   33   60:athrow          
	}

	public int getConnectionState(BluetoothDevice bluetoothdevice)
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
		parcel.writeInterfaceToken("android.bluetooth.IBluetoothInputDevice");
	//    4    9:aload_3         
	//    5   10:ldc1            #34  <String "android.bluetooth.IBluetoothInputDevice">
	//    6   12:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
		if(bluetoothdevice == null)
			break MISSING_BLOCK_LABEL_33;
	//    7   15:aload_1         
	//    8   16:ifnull          33
		parcel.writeInt(1);
	//    9   19:aload_3         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		bluetoothdevice.writeToParcel(parcel, 0);
	//   12   24:aload_1         
	//   13   25:aload_3         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #48  <Method void BluetoothDevice.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_38;
	//   16   30:goto            38
		parcel.writeInt(0);
	//   17   33:aload_3         
	//   18   34:iconst_0        
	//   19   35:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		int i;
		mRemote.transact(5, parcel, parcel1, 0);
	//   20   38:aload_0         
	//   21   39:getfield        #19  <Field IBinder mRemote>
	//   22   42:iconst_5        
	//   23   43:aload_3         
	//   24   44:aload           4
	//   25   46:iconst_0        
	//   26   47:invokeinterface #54  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   27   52:pop             
		parcel1.readException();
	//   28   53:aload           4
	//   29   55:invokevirtual   #57  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   30   58:aload           4
	//   31   60:invokevirtual   #61  <Method int Parcel.readInt()>
	//   32   63:istore_2        
		parcel1.recycle();
	//   33   64:aload           4
	//   34   66:invokevirtual   #64  <Method void Parcel.recycle()>
		parcel.recycle();
	//   35   69:aload_3         
	//   36   70:invokevirtual   #64  <Method void Parcel.recycle()>
		return i;
	//   37   73:iload_2         
	//   38   74:ireturn         
		bluetoothdevice;
	//   39   75:astore_1        
		parcel1.recycle();
	//   40   76:aload           4
	//   41   78:invokevirtual   #64  <Method void Parcel.recycle()>
		parcel.recycle();
	//   42   81:aload_3         
	//   43   82:invokevirtual   #64  <Method void Parcel.recycle()>
		throw bluetoothdevice;
	//   44   85:aload_1         
	//   45   86:athrow          
	}

	public List getDevicesMatchingConnectionStates(int ai[])
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
		parcel.writeInterfaceToken("android.bluetooth.IBluetoothInputDevice");
	//    4    8:aload_2         
	//    5    9:ldc1            #34  <String "android.bluetooth.IBluetoothInputDevice">
	//    6   11:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeIntArray(ai);
	//    7   14:aload_2         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #86  <Method void Parcel.writeIntArray(int[])>
		mRemote.transact(4, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #19  <Field IBinder mRemote>
	//   12   23:iconst_4        
	//   13   24:aload_2         
	//   14   25:aload_3         
	//   15   26:iconst_0        
	//   16   27:invokeinterface #54  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   32:pop             
		parcel1.readException();
	//   18   33:aload_3         
	//   19   34:invokevirtual   #57  <Method void Parcel.readException()>
		ai = ((int []) (parcel1.createTypedArrayList(BluetoothDevice.CREATOR)));
	//   20   37:aload_3         
	//   21   38:getstatic       #72  <Field android.os.Parcelable$Creator BluetoothDevice.CREATOR>
	//   22   41:invokevirtual   #76  <Method java.util.ArrayList Parcel.createTypedArrayList(android.os.Parcelable$Creator)>
	//   23   44:astore_1        
		parcel1.recycle();
	//   24   45:aload_3         
	//   25   46:invokevirtual   #64  <Method void Parcel.recycle()>
		parcel.recycle();
	//   26   49:aload_2         
	//   27   50:invokevirtual   #64  <Method void Parcel.recycle()>
		return ((List) (ai));
	//   28   53:aload_1         
	//   29   54:areturn         
		ai;
	//   30   55:astore_1        
		parcel1.recycle();
	//   31   56:aload_3         
	//   32   57:invokevirtual   #64  <Method void Parcel.recycle()>
		parcel.recycle();
	//   33   60:aload_2         
	//   34   61:invokevirtual   #64  <Method void Parcel.recycle()>
		throw ai;
	//   35   64:aload_1         
	//   36   65:athrow          
	}

	public String getInterfaceDescriptor()
	{
		return "android.bluetooth.IBluetoothInputDevice";
	//    0    0:ldc1            #34  <String "android.bluetooth.IBluetoothInputDevice">
	//    1    2:areturn         
	}

	public int getPriority(BluetoothDevice bluetoothdevice)
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
		parcel.writeInterfaceToken("android.bluetooth.IBluetoothInputDevice");
	//    4    9:aload_3         
	//    5   10:ldc1            #34  <String "android.bluetooth.IBluetoothInputDevice">
	//    6   12:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
		if(bluetoothdevice == null)
			break MISSING_BLOCK_LABEL_33;
	//    7   15:aload_1         
	//    8   16:ifnull          33
		parcel.writeInt(1);
	//    9   19:aload_3         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		bluetoothdevice.writeToParcel(parcel, 0);
	//   12   24:aload_1         
	//   13   25:aload_3         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #48  <Method void BluetoothDevice.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_38;
	//   16   30:goto            38
		parcel.writeInt(0);
	//   17   33:aload_3         
	//   18   34:iconst_0        
	//   19   35:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		int i;
		mRemote.transact(7, parcel, parcel1, 0);
	//   20   38:aload_0         
	//   21   39:getfield        #19  <Field IBinder mRemote>
	//   22   42:bipush          7
	//   23   44:aload_3         
	//   24   45:aload           4
	//   25   47:iconst_0        
	//   26   48:invokeinterface #54  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   27   53:pop             
		parcel1.readException();
	//   28   54:aload           4
	//   29   56:invokevirtual   #57  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   30   59:aload           4
	//   31   61:invokevirtual   #61  <Method int Parcel.readInt()>
	//   32   64:istore_2        
		parcel1.recycle();
	//   33   65:aload           4
	//   34   67:invokevirtual   #64  <Method void Parcel.recycle()>
		parcel.recycle();
	//   35   70:aload_3         
	//   36   71:invokevirtual   #64  <Method void Parcel.recycle()>
		return i;
	//   37   74:iload_2         
	//   38   75:ireturn         
		bluetoothdevice;
	//   39   76:astore_1        
		parcel1.recycle();
	//   40   77:aload           4
	//   41   79:invokevirtual   #64  <Method void Parcel.recycle()>
		parcel.recycle();
	//   42   82:aload_3         
	//   43   83:invokevirtual   #64  <Method void Parcel.recycle()>
		throw bluetoothdevice;
	//   44   86:aload_1         
	//   45   87:athrow          
	}

	public boolean getProtocolMode(BluetoothDevice bluetoothdevice)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    1    3:astore          4
		parcel1 = Parcel.obtain();
	//    2    5:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    3    8:astore          5
		parcel.writeInterfaceToken("android.bluetooth.IBluetoothInputDevice");
	//    4   10:aload           4
	//    5   12:ldc1            #34  <String "android.bluetooth.IBluetoothInputDevice">
	//    6   14:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
		if(bluetoothdevice == null)
			break MISSING_BLOCK_LABEL_37;
	//    7   17:aload_1         
	//    8   18:ifnull          37
		parcel.writeInt(1);
	//    9   21:aload           4
	//   10   23:iconst_1        
	//   11   24:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		bluetoothdevice.writeToParcel(parcel, 0);
	//   12   27:aload_1         
	//   13   28:aload           4
	//   14   30:iconst_0        
	//   15   31:invokevirtual   #48  <Method void BluetoothDevice.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_43;
	//   16   34:goto            43
		parcel.writeInt(0);
	//   17   37:aload           4
	//   18   39:iconst_0        
	//   19   40:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		int i;
		mRemote.transact(8, parcel, parcel1, 0);
	//   20   43:aload_0         
	//   21   44:getfield        #19  <Field IBinder mRemote>
	//   22   47:bipush          8
	//   23   49:aload           4
	//   24   51:aload           5
	//   25   53:iconst_0        
	//   26   54:invokeinterface #54  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   27   59:pop             
		parcel1.readException();
	//   28   60:aload           5
	//   29   62:invokevirtual   #57  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   30   65:aload           5
	//   31   67:invokevirtual   #61  <Method int Parcel.readInt()>
	//   32   70:istore_2        
		boolean flag;
		if(i != 0)
	//*  33   71:iload_2         
	//*  34   72:ifeq            80
			flag = true;
	//   35   75:iconst_1        
	//   36   76:istore_3        
		else
	//*  37   77:goto            82
			flag = false;
	//   38   80:iconst_0        
	//   39   81:istore_3        
		parcel1.recycle();
	//   40   82:aload           5
	//   41   84:invokevirtual   #64  <Method void Parcel.recycle()>
		parcel.recycle();
	//   42   87:aload           4
	//   43   89:invokevirtual   #64  <Method void Parcel.recycle()>
		return flag;
	//   44   92:iload_3         
	//   45   93:ireturn         
		bluetoothdevice;
	//   46   94:astore_1        
		parcel1.recycle();
	//   47   95:aload           5
	//   48   97:invokevirtual   #64  <Method void Parcel.recycle()>
		parcel.recycle();
	//   49  100:aload           4
	//   50  102:invokevirtual   #64  <Method void Parcel.recycle()>
		throw bluetoothdevice;
	//   51  105:aload_1         
	//   52  106:athrow          
	}

	public boolean getReport(BluetoothDevice bluetoothdevice, byte byte0, byte byte1, int i)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    1    3:astore          6
		parcel1 = Parcel.obtain();
	//    2    5:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    3    8:astore          7
		parcel.writeInterfaceToken("android.bluetooth.IBluetoothInputDevice");
	//    4   10:aload           6
	//    5   12:ldc1            #34  <String "android.bluetooth.IBluetoothInputDevice">
	//    6   14:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
		if(bluetoothdevice == null)
			break MISSING_BLOCK_LABEL_37;
	//    7   17:aload_1         
	//    8   18:ifnull          37
		parcel.writeInt(1);
	//    9   21:aload           6
	//   10   23:iconst_1        
	//   11   24:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		bluetoothdevice.writeToParcel(parcel, 0);
	//   12   27:aload_1         
	//   13   28:aload           6
	//   14   30:iconst_0        
	//   15   31:invokevirtual   #48  <Method void BluetoothDevice.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_43;
	//   16   34:goto            43
		parcel.writeInt(0);
	//   17   37:aload           6
	//   18   39:iconst_0        
	//   19   40:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		parcel.writeByte(byte0);
	//   20   43:aload           6
	//   21   45:iload_2         
	//   22   46:invokevirtual   #97  <Method void Parcel.writeByte(byte)>
		parcel.writeByte(byte1);
	//   23   49:aload           6
	//   24   51:iload_3         
	//   25   52:invokevirtual   #97  <Method void Parcel.writeByte(byte)>
		parcel.writeInt(i);
	//   26   55:aload           6
	//   27   57:iload           4
	//   28   59:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		mRemote.transact(11, parcel, parcel1, 0);
	//   29   62:aload_0         
	//   30   63:getfield        #19  <Field IBinder mRemote>
	//   31   66:bipush          11
	//   32   68:aload           6
	//   33   70:aload           7
	//   34   72:iconst_0        
	//   35   73:invokeinterface #54  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   36   78:pop             
		parcel1.readException();
	//   37   79:aload           7
	//   38   81:invokevirtual   #57  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   39   84:aload           7
	//   40   86:invokevirtual   #61  <Method int Parcel.readInt()>
	//   41   89:istore          4
		boolean flag;
		if(i != 0)
	//*  42   91:iload           4
	//*  43   93:ifeq            102
			flag = true;
	//   44   96:iconst_1        
	//   45   97:istore          5
		else
	//*  46   99:goto            105
			flag = false;
	//   47  102:iconst_0        
	//   48  103:istore          5
		parcel1.recycle();
	//   49  105:aload           7
	//   50  107:invokevirtual   #64  <Method void Parcel.recycle()>
		parcel.recycle();
	//   51  110:aload           6
	//   52  112:invokevirtual   #64  <Method void Parcel.recycle()>
		return flag;
	//   53  115:iload           5
	//   54  117:ireturn         
		bluetoothdevice;
	//   55  118:astore_1        
		parcel1.recycle();
	//   56  119:aload           7
	//   57  121:invokevirtual   #64  <Method void Parcel.recycle()>
		parcel.recycle();
	//   58  124:aload           6
	//   59  126:invokevirtual   #64  <Method void Parcel.recycle()>
		throw bluetoothdevice;
	//   60  129:aload_1         
	//   61  130:athrow          
	}

	public boolean sendData(BluetoothDevice bluetoothdevice, String s)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    1    3:astore          5
		parcel1 = Parcel.obtain();
	//    2    5:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    3    8:astore          6
		parcel.writeInterfaceToken("android.bluetooth.IBluetoothInputDevice");
	//    4   10:aload           5
	//    5   12:ldc1            #34  <String "android.bluetooth.IBluetoothInputDevice">
	//    6   14:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
		if(bluetoothdevice == null)
			break MISSING_BLOCK_LABEL_37;
	//    7   17:aload_1         
	//    8   18:ifnull          37
		parcel.writeInt(1);
	//    9   21:aload           5
	//   10   23:iconst_1        
	//   11   24:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		bluetoothdevice.writeToParcel(parcel, 0);
	//   12   27:aload_1         
	//   13   28:aload           5
	//   14   30:iconst_0        
	//   15   31:invokevirtual   #48  <Method void BluetoothDevice.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_43;
	//   16   34:goto            43
		parcel.writeInt(0);
	//   17   37:aload           5
	//   18   39:iconst_0        
	//   19   40:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		int i;
		parcel.writeString(s);
	//   20   43:aload           5
	//   21   45:aload_2         
	//   22   46:invokevirtual   #102 <Method void Parcel.writeString(String)>
		mRemote.transact(13, parcel, parcel1, 0);
	//   23   49:aload_0         
	//   24   50:getfield        #19  <Field IBinder mRemote>
	//   25   53:bipush          13
	//   26   55:aload           5
	//   27   57:aload           6
	//   28   59:iconst_0        
	//   29   60:invokeinterface #54  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   30   65:pop             
		parcel1.readException();
	//   31   66:aload           6
	//   32   68:invokevirtual   #57  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   33   71:aload           6
	//   34   73:invokevirtual   #61  <Method int Parcel.readInt()>
	//   35   76:istore_3        
		boolean flag;
		if(i != 0)
	//*  36   77:iload_3         
	//*  37   78:ifeq            87
			flag = true;
	//   38   81:iconst_1        
	//   39   82:istore          4
		else
	//*  40   84:goto            90
			flag = false;
	//   41   87:iconst_0        
	//   42   88:istore          4
		parcel1.recycle();
	//   43   90:aload           6
	//   44   92:invokevirtual   #64  <Method void Parcel.recycle()>
		parcel.recycle();
	//   45   95:aload           5
	//   46   97:invokevirtual   #64  <Method void Parcel.recycle()>
		return flag;
	//   47  100:iload           4
	//   48  102:ireturn         
		bluetoothdevice;
	//   49  103:astore_1        
		parcel1.recycle();
	//   50  104:aload           6
	//   51  106:invokevirtual   #64  <Method void Parcel.recycle()>
		parcel.recycle();
	//   52  109:aload           5
	//   53  111:invokevirtual   #64  <Method void Parcel.recycle()>
		throw bluetoothdevice;
	//   54  114:aload_1         
	//   55  115:athrow          
	}

	public boolean setPriority(BluetoothDevice bluetoothdevice, int i)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    1    3:astore          4
		parcel1 = Parcel.obtain();
	//    2    5:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    3    8:astore          5
		parcel.writeInterfaceToken("android.bluetooth.IBluetoothInputDevice");
	//    4   10:aload           4
	//    5   12:ldc1            #34  <String "android.bluetooth.IBluetoothInputDevice">
	//    6   14:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
		if(bluetoothdevice == null)
			break MISSING_BLOCK_LABEL_37;
	//    7   17:aload_1         
	//    8   18:ifnull          37
		parcel.writeInt(1);
	//    9   21:aload           4
	//   10   23:iconst_1        
	//   11   24:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		bluetoothdevice.writeToParcel(parcel, 0);
	//   12   27:aload_1         
	//   13   28:aload           4
	//   14   30:iconst_0        
	//   15   31:invokevirtual   #48  <Method void BluetoothDevice.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_43;
	//   16   34:goto            43
		parcel.writeInt(0);
	//   17   37:aload           4
	//   18   39:iconst_0        
	//   19   40:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		parcel.writeInt(i);
	//   20   43:aload           4
	//   21   45:iload_2         
	//   22   46:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		mRemote.transact(6, parcel, parcel1, 0);
	//   23   49:aload_0         
	//   24   50:getfield        #19  <Field IBinder mRemote>
	//   25   53:bipush          6
	//   26   55:aload           4
	//   27   57:aload           5
	//   28   59:iconst_0        
	//   29   60:invokeinterface #54  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   30   65:pop             
		parcel1.readException();
	//   31   66:aload           5
	//   32   68:invokevirtual   #57  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   33   71:aload           5
	//   34   73:invokevirtual   #61  <Method int Parcel.readInt()>
	//   35   76:istore_2        
		boolean flag;
		if(i != 0)
	//*  36   77:iload_2         
	//*  37   78:ifeq            86
			flag = true;
	//   38   81:iconst_1        
	//   39   82:istore_3        
		else
	//*  40   83:goto            88
			flag = false;
	//   41   86:iconst_0        
	//   42   87:istore_3        
		parcel1.recycle();
	//   43   88:aload           5
	//   44   90:invokevirtual   #64  <Method void Parcel.recycle()>
		parcel.recycle();
	//   45   93:aload           4
	//   46   95:invokevirtual   #64  <Method void Parcel.recycle()>
		return flag;
	//   47   98:iload_3         
	//   48   99:ireturn         
		bluetoothdevice;
	//   49  100:astore_1        
		parcel1.recycle();
	//   50  101:aload           5
	//   51  103:invokevirtual   #64  <Method void Parcel.recycle()>
		parcel.recycle();
	//   52  106:aload           4
	//   53  108:invokevirtual   #64  <Method void Parcel.recycle()>
		throw bluetoothdevice;
	//   54  111:aload_1         
	//   55  112:athrow          
	}

	public boolean setProtocolMode(BluetoothDevice bluetoothdevice, int i)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    1    3:astore          4
		parcel1 = Parcel.obtain();
	//    2    5:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    3    8:astore          5
		parcel.writeInterfaceToken("android.bluetooth.IBluetoothInputDevice");
	//    4   10:aload           4
	//    5   12:ldc1            #34  <String "android.bluetooth.IBluetoothInputDevice">
	//    6   14:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
		if(bluetoothdevice == null)
			break MISSING_BLOCK_LABEL_37;
	//    7   17:aload_1         
	//    8   18:ifnull          37
		parcel.writeInt(1);
	//    9   21:aload           4
	//   10   23:iconst_1        
	//   11   24:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		bluetoothdevice.writeToParcel(parcel, 0);
	//   12   27:aload_1         
	//   13   28:aload           4
	//   14   30:iconst_0        
	//   15   31:invokevirtual   #48  <Method void BluetoothDevice.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_43;
	//   16   34:goto            43
		parcel.writeInt(0);
	//   17   37:aload           4
	//   18   39:iconst_0        
	//   19   40:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		parcel.writeInt(i);
	//   20   43:aload           4
	//   21   45:iload_2         
	//   22   46:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		mRemote.transact(10, parcel, parcel1, 0);
	//   23   49:aload_0         
	//   24   50:getfield        #19  <Field IBinder mRemote>
	//   25   53:bipush          10
	//   26   55:aload           4
	//   27   57:aload           5
	//   28   59:iconst_0        
	//   29   60:invokeinterface #54  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   30   65:pop             
		parcel1.readException();
	//   31   66:aload           5
	//   32   68:invokevirtual   #57  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   33   71:aload           5
	//   34   73:invokevirtual   #61  <Method int Parcel.readInt()>
	//   35   76:istore_2        
		boolean flag;
		if(i != 0)
	//*  36   77:iload_2         
	//*  37   78:ifeq            86
			flag = true;
	//   38   81:iconst_1        
	//   39   82:istore_3        
		else
	//*  40   83:goto            88
			flag = false;
	//   41   86:iconst_0        
	//   42   87:istore_3        
		parcel1.recycle();
	//   43   88:aload           5
	//   44   90:invokevirtual   #64  <Method void Parcel.recycle()>
		parcel.recycle();
	//   45   93:aload           4
	//   46   95:invokevirtual   #64  <Method void Parcel.recycle()>
		return flag;
	//   47   98:iload_3         
	//   48   99:ireturn         
		bluetoothdevice;
	//   49  100:astore_1        
		parcel1.recycle();
	//   50  101:aload           5
	//   51  103:invokevirtual   #64  <Method void Parcel.recycle()>
		parcel.recycle();
	//   52  106:aload           4
	//   53  108:invokevirtual   #64  <Method void Parcel.recycle()>
		throw bluetoothdevice;
	//   54  111:aload_1         
	//   55  112:athrow          
	}

	public boolean setReport(BluetoothDevice bluetoothdevice, byte byte0, String s)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    1    3:astore          6
		parcel1 = Parcel.obtain();
	//    2    5:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    3    8:astore          7
		parcel.writeInterfaceToken("android.bluetooth.IBluetoothInputDevice");
	//    4   10:aload           6
	//    5   12:ldc1            #34  <String "android.bluetooth.IBluetoothInputDevice">
	//    6   14:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
		if(bluetoothdevice == null)
			break MISSING_BLOCK_LABEL_37;
	//    7   17:aload_1         
	//    8   18:ifnull          37
		parcel.writeInt(1);
	//    9   21:aload           6
	//   10   23:iconst_1        
	//   11   24:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		bluetoothdevice.writeToParcel(parcel, 0);
	//   12   27:aload_1         
	//   13   28:aload           6
	//   14   30:iconst_0        
	//   15   31:invokevirtual   #48  <Method void BluetoothDevice.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_43;
	//   16   34:goto            43
		parcel.writeInt(0);
	//   17   37:aload           6
	//   18   39:iconst_0        
	//   19   40:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		int i;
		parcel.writeByte(byte0);
	//   20   43:aload           6
	//   21   45:iload_2         
	//   22   46:invokevirtual   #97  <Method void Parcel.writeByte(byte)>
		parcel.writeString(s);
	//   23   49:aload           6
	//   24   51:aload_3         
	//   25   52:invokevirtual   #102 <Method void Parcel.writeString(String)>
		mRemote.transact(12, parcel, parcel1, 0);
	//   26   55:aload_0         
	//   27   56:getfield        #19  <Field IBinder mRemote>
	//   28   59:bipush          12
	//   29   61:aload           6
	//   30   63:aload           7
	//   31   65:iconst_0        
	//   32   66:invokeinterface #54  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   33   71:pop             
		parcel1.readException();
	//   34   72:aload           7
	//   35   74:invokevirtual   #57  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   36   77:aload           7
	//   37   79:invokevirtual   #61  <Method int Parcel.readInt()>
	//   38   82:istore          4
		boolean flag;
		if(i != 0)
	//*  39   84:iload           4
	//*  40   86:ifeq            95
			flag = true;
	//   41   89:iconst_1        
	//   42   90:istore          5
		else
	//*  43   92:goto            98
			flag = false;
	//   44   95:iconst_0        
	//   45   96:istore          5
		parcel1.recycle();
	//   46   98:aload           7
	//   47  100:invokevirtual   #64  <Method void Parcel.recycle()>
		parcel.recycle();
	//   48  103:aload           6
	//   49  105:invokevirtual   #64  <Method void Parcel.recycle()>
		return flag;
	//   50  108:iload           5
	//   51  110:ireturn         
		bluetoothdevice;
	//   52  111:astore_1        
		parcel1.recycle();
	//   53  112:aload           7
	//   54  114:invokevirtual   #64  <Method void Parcel.recycle()>
		parcel.recycle();
	//   55  117:aload           6
	//   56  119:invokevirtual   #64  <Method void Parcel.recycle()>
		throw bluetoothdevice;
	//   57  122:aload_1         
	//   58  123:athrow          
	}

	public boolean virtualUnplug(BluetoothDevice bluetoothdevice)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    1    3:astore          4
		parcel1 = Parcel.obtain();
	//    2    5:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    3    8:astore          5
		parcel.writeInterfaceToken("android.bluetooth.IBluetoothInputDevice");
	//    4   10:aload           4
	//    5   12:ldc1            #34  <String "android.bluetooth.IBluetoothInputDevice">
	//    6   14:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
		if(bluetoothdevice == null)
			break MISSING_BLOCK_LABEL_37;
	//    7   17:aload_1         
	//    8   18:ifnull          37
		parcel.writeInt(1);
	//    9   21:aload           4
	//   10   23:iconst_1        
	//   11   24:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		bluetoothdevice.writeToParcel(parcel, 0);
	//   12   27:aload_1         
	//   13   28:aload           4
	//   14   30:iconst_0        
	//   15   31:invokevirtual   #48  <Method void BluetoothDevice.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_43;
	//   16   34:goto            43
		parcel.writeInt(0);
	//   17   37:aload           4
	//   18   39:iconst_0        
	//   19   40:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		int i;
		mRemote.transact(9, parcel, parcel1, 0);
	//   20   43:aload_0         
	//   21   44:getfield        #19  <Field IBinder mRemote>
	//   22   47:bipush          9
	//   23   49:aload           4
	//   24   51:aload           5
	//   25   53:iconst_0        
	//   26   54:invokeinterface #54  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   27   59:pop             
		parcel1.readException();
	//   28   60:aload           5
	//   29   62:invokevirtual   #57  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   30   65:aload           5
	//   31   67:invokevirtual   #61  <Method int Parcel.readInt()>
	//   32   70:istore_2        
		boolean flag;
		if(i != 0)
	//*  33   71:iload_2         
	//*  34   72:ifeq            80
			flag = true;
	//   35   75:iconst_1        
	//   36   76:istore_3        
		else
	//*  37   77:goto            82
			flag = false;
	//   38   80:iconst_0        
	//   39   81:istore_3        
		parcel1.recycle();
	//   40   82:aload           5
	//   41   84:invokevirtual   #64  <Method void Parcel.recycle()>
		parcel.recycle();
	//   42   87:aload           4
	//   43   89:invokevirtual   #64  <Method void Parcel.recycle()>
		return flag;
	//   44   92:iload_3         
	//   45   93:ireturn         
		bluetoothdevice;
	//   46   94:astore_1        
		parcel1.recycle();
	//   47   95:aload           5
	//   48   97:invokevirtual   #64  <Method void Parcel.recycle()>
		parcel.recycle();
	//   49  100:aload           4
	//   50  102:invokevirtual   #64  <Method void Parcel.recycle()>
		throw bluetoothdevice;
	//   51  105:aload_1         
	//   52  106:athrow          
	}

	private IBinder mRemote;

	IBluetoothInputDevice$Stub$Proxy(IBinder ibinder)
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
