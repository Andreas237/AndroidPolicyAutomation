// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.bluetooth;

import android.os.*;
import java.util.List;

// Referenced classes of package android.bluetooth:
//			IBluetoothInputDevice, BluetoothDevice

public static abstract class IBluetoothInputDevice$Stub extends Binder
	implements IBluetoothInputDevice
{
	static class Proxy
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


	public static IBluetoothInputDevice asInterface(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("android.bluetooth.IBluetoothInputDevice");
	//    4    6:aload_0         
	//    5    7:ldc1            #14  <String "android.bluetooth.IBluetoothInputDevice">
	//    6    9:invokeinterface #58  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof IBluetoothInputDevice))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class IBluetoothInputDevice>
	//*  12   23:ifeq            31
			return (IBluetoothInputDevice)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class IBluetoothInputDevice>
	//   15   30:areturn         
		else
			return ((IBluetoothInputDevice) (new Proxy(ibinder)));
	//   16   31:new             #9   <Class IBluetoothInputDevice$Stub$Proxy>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #61  <Method void IBluetoothInputDevice$Stub$Proxy(IBinder)>
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
	//*   1    1:lookupswitch    14: default 124
	//	               1: 135
	//	               2: 196
	//	               3: 257
	//	               4: 279
	//	               5: 305
	//	               6: 353
	//	               7: 421
	//	               8: 469
	//	               9: 530
	//	               10: 591
	//	               11: 659
	//	               12: 735
	//	               13: 807
	//	               1598968902: 127
	//*   2  124:goto            875
		case 1598968902: 
			parcel1.writeString("android.bluetooth.IBluetoothInputDevice");
	//    3  127:aload_3         
	//    4  128:ldc1            #14  <String "android.bluetooth.IBluetoothInputDevice">
	//    5  130:invokevirtual   #73  <Method void Parcel.writeString(String)>
			return true;
	//    6  133:iconst_1        
	//    7  134:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("android.bluetooth.IBluetoothInputDevice");
	//    8  135:aload_2         
	//    9  136:ldc1            #14  <String "android.bluetooth.IBluetoothInputDevice">
	//   10  138:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			if(parcel.readInt() != 0)
	//*  11  141:aload_2         
	//*  12  142:invokevirtual   #80  <Method int Parcel.readInt()>
	//*  13  145:ifeq            164
				parcel = ((Parcel) ((BluetoothDevice)BluetoothDevice.CREATOR.createFromParcel(parcel)));
	//   14  148:getstatic       #86  <Field android.os.Parcelable$Creator BluetoothDevice.CREATOR>
	//   15  151:aload_2         
	//   16  152:invokeinterface #92  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   17  157:checkcast       #82  <Class BluetoothDevice>
	//   18  160:astore_2        
			else
	//*  19  161:goto            166
				parcel = null;
	//   20  164:aconst_null     
	//   21  165:astore_2        
			boolean flag = connect(((BluetoothDevice) (parcel)));
	//   22  166:aload_0         
	//   23  167:aload_2         
	//   24  168:invokevirtual   #96  <Method boolean connect(BluetoothDevice)>
	//   25  171:istore          5
			parcel1.writeNoException();
	//   26  173:aload_3         
	//   27  174:invokevirtual   #99  <Method void Parcel.writeNoException()>
			if(flag)
	//*  28  177:iload           5
	//*  29  179:ifeq            187
				i = 1;
	//   30  182:iconst_1        
	//   31  183:istore_1        
			else
	//*  32  184:goto            189
				i = 0;
	//   33  187:iconst_0        
	//   34  188:istore_1        
			parcel1.writeInt(i);
	//   35  189:aload_3         
	//   36  190:iload_1         
	//   37  191:invokevirtual   #103 <Method void Parcel.writeInt(int)>
			return true;
	//   38  194:iconst_1        
	//   39  195:ireturn         

		case 2: // '\002'
			parcel.enforceInterface("android.bluetooth.IBluetoothInputDevice");
	//   40  196:aload_2         
	//   41  197:ldc1            #14  <String "android.bluetooth.IBluetoothInputDevice">
	//   42  199:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			if(parcel.readInt() != 0)
	//*  43  202:aload_2         
	//*  44  203:invokevirtual   #80  <Method int Parcel.readInt()>
	//*  45  206:ifeq            225
				parcel = ((Parcel) ((BluetoothDevice)BluetoothDevice.CREATOR.createFromParcel(parcel)));
	//   46  209:getstatic       #86  <Field android.os.Parcelable$Creator BluetoothDevice.CREATOR>
	//   47  212:aload_2         
	//   48  213:invokeinterface #92  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   49  218:checkcast       #82  <Class BluetoothDevice>
	//   50  221:astore_2        
			else
	//*  51  222:goto            227
				parcel = null;
	//   52  225:aconst_null     
	//   53  226:astore_2        
			boolean flag1 = disconnect(((BluetoothDevice) (parcel)));
	//   54  227:aload_0         
	//   55  228:aload_2         
	//   56  229:invokevirtual   #106 <Method boolean disconnect(BluetoothDevice)>
	//   57  232:istore          5
			parcel1.writeNoException();
	//   58  234:aload_3         
	//   59  235:invokevirtual   #99  <Method void Parcel.writeNoException()>
			if(flag1)
	//*  60  238:iload           5
	//*  61  240:ifeq            248
				i = 1;
	//   62  243:iconst_1        
	//   63  244:istore_1        
			else
	//*  64  245:goto            250
				i = 0;
	//   65  248:iconst_0        
	//   66  249:istore_1        
			parcel1.writeInt(i);
	//   67  250:aload_3         
	//   68  251:iload_1         
	//   69  252:invokevirtual   #103 <Method void Parcel.writeInt(int)>
			return true;
	//   70  255:iconst_1        
	//   71  256:ireturn         

		case 3: // '\003'
			parcel.enforceInterface("android.bluetooth.IBluetoothInputDevice");
	//   72  257:aload_2         
	//   73  258:ldc1            #14  <String "android.bluetooth.IBluetoothInputDevice">
	//   74  260:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (getConnectedDevices()));
	//   75  263:aload_0         
	//   76  264:invokevirtual   #110 <Method List getConnectedDevices()>
	//   77  267:astore_2        
			parcel1.writeNoException();
	//   78  268:aload_3         
	//   79  269:invokevirtual   #99  <Method void Parcel.writeNoException()>
			parcel1.writeTypedList(((List) (parcel)));
	//   80  272:aload_3         
	//   81  273:aload_2         
	//   82  274:invokevirtual   #114 <Method void Parcel.writeTypedList(List)>
			return true;
	//   83  277:iconst_1        
	//   84  278:ireturn         

		case 4: // '\004'
			parcel.enforceInterface("android.bluetooth.IBluetoothInputDevice");
	//   85  279:aload_2         
	//   86  280:ldc1            #14  <String "android.bluetooth.IBluetoothInputDevice">
	//   87  282:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (getDevicesMatchingConnectionStates(parcel.createIntArray())));
	//   88  285:aload_0         
	//   89  286:aload_2         
	//   90  287:invokevirtual   #118 <Method int[] Parcel.createIntArray()>
	//   91  290:invokevirtual   #122 <Method List getDevicesMatchingConnectionStates(int[])>
	//   92  293:astore_2        
			parcel1.writeNoException();
	//   93  294:aload_3         
	//   94  295:invokevirtual   #99  <Method void Parcel.writeNoException()>
			parcel1.writeTypedList(((List) (parcel)));
	//   95  298:aload_3         
	//   96  299:aload_2         
	//   97  300:invokevirtual   #114 <Method void Parcel.writeTypedList(List)>
			return true;
	//   98  303:iconst_1        
	//   99  304:ireturn         

		case 5: // '\005'
			parcel.enforceInterface("android.bluetooth.IBluetoothInputDevice");
	//  100  305:aload_2         
	//  101  306:ldc1            #14  <String "android.bluetooth.IBluetoothInputDevice">
	//  102  308:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			if(parcel.readInt() != 0)
	//* 103  311:aload_2         
	//* 104  312:invokevirtual   #80  <Method int Parcel.readInt()>
	//* 105  315:ifeq            334
				parcel = ((Parcel) ((BluetoothDevice)BluetoothDevice.CREATOR.createFromParcel(parcel)));
	//  106  318:getstatic       #86  <Field android.os.Parcelable$Creator BluetoothDevice.CREATOR>
	//  107  321:aload_2         
	//  108  322:invokeinterface #92  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  109  327:checkcast       #82  <Class BluetoothDevice>
	//  110  330:astore_2        
			else
	//* 111  331:goto            336
				parcel = null;
	//  112  334:aconst_null     
	//  113  335:astore_2        
			i = getConnectionState(((BluetoothDevice) (parcel)));
	//  114  336:aload_0         
	//  115  337:aload_2         
	//  116  338:invokevirtual   #126 <Method int getConnectionState(BluetoothDevice)>
	//  117  341:istore_1        
			parcel1.writeNoException();
	//  118  342:aload_3         
	//  119  343:invokevirtual   #99  <Method void Parcel.writeNoException()>
			parcel1.writeInt(i);
	//  120  346:aload_3         
	//  121  347:iload_1         
	//  122  348:invokevirtual   #103 <Method void Parcel.writeInt(int)>
			return true;
	//  123  351:iconst_1        
	//  124  352:ireturn         

		case 6: // '\006'
			parcel.enforceInterface("android.bluetooth.IBluetoothInputDevice");
	//  125  353:aload_2         
	//  126  354:ldc1            #14  <String "android.bluetooth.IBluetoothInputDevice">
	//  127  356:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			BluetoothDevice bluetoothdevice;
			if(parcel.readInt() != 0)
	//* 128  359:aload_2         
	//* 129  360:invokevirtual   #80  <Method int Parcel.readInt()>
	//* 130  363:ifeq            383
				bluetoothdevice = (BluetoothDevice)BluetoothDevice.CREATOR.createFromParcel(parcel);
	//  131  366:getstatic       #86  <Field android.os.Parcelable$Creator BluetoothDevice.CREATOR>
	//  132  369:aload_2         
	//  133  370:invokeinterface #92  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  134  375:checkcast       #82  <Class BluetoothDevice>
	//  135  378:astore          6
			else
	//* 136  380:goto            386
				bluetoothdevice = null;
	//  137  383:aconst_null     
	//  138  384:astore          6
			boolean flag2 = setPriority(bluetoothdevice, parcel.readInt());
	//  139  386:aload_0         
	//  140  387:aload           6
	//  141  389:aload_2         
	//  142  390:invokevirtual   #80  <Method int Parcel.readInt()>
	//  143  393:invokevirtual   #130 <Method boolean setPriority(BluetoothDevice, int)>
	//  144  396:istore          5
			parcel1.writeNoException();
	//  145  398:aload_3         
	//  146  399:invokevirtual   #99  <Method void Parcel.writeNoException()>
			if(flag2)
	//* 147  402:iload           5
	//* 148  404:ifeq            412
				i = 1;
	//  149  407:iconst_1        
	//  150  408:istore_1        
			else
	//* 151  409:goto            414
				i = 0;
	//  152  412:iconst_0        
	//  153  413:istore_1        
			parcel1.writeInt(i);
	//  154  414:aload_3         
	//  155  415:iload_1         
	//  156  416:invokevirtual   #103 <Method void Parcel.writeInt(int)>
			return true;
	//  157  419:iconst_1        
	//  158  420:ireturn         

		case 7: // '\007'
			parcel.enforceInterface("android.bluetooth.IBluetoothInputDevice");
	//  159  421:aload_2         
	//  160  422:ldc1            #14  <String "android.bluetooth.IBluetoothInputDevice">
	//  161  424:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			if(parcel.readInt() != 0)
	//* 162  427:aload_2         
	//* 163  428:invokevirtual   #80  <Method int Parcel.readInt()>
	//* 164  431:ifeq            450
				parcel = ((Parcel) ((BluetoothDevice)BluetoothDevice.CREATOR.createFromParcel(parcel)));
	//  165  434:getstatic       #86  <Field android.os.Parcelable$Creator BluetoothDevice.CREATOR>
	//  166  437:aload_2         
	//  167  438:invokeinterface #92  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  168  443:checkcast       #82  <Class BluetoothDevice>
	//  169  446:astore_2        
			else
	//* 170  447:goto            452
				parcel = null;
	//  171  450:aconst_null     
	//  172  451:astore_2        
			i = getPriority(((BluetoothDevice) (parcel)));
	//  173  452:aload_0         
	//  174  453:aload_2         
	//  175  454:invokevirtual   #133 <Method int getPriority(BluetoothDevice)>
	//  176  457:istore_1        
			parcel1.writeNoException();
	//  177  458:aload_3         
	//  178  459:invokevirtual   #99  <Method void Parcel.writeNoException()>
			parcel1.writeInt(i);
	//  179  462:aload_3         
	//  180  463:iload_1         
	//  181  464:invokevirtual   #103 <Method void Parcel.writeInt(int)>
			return true;
	//  182  467:iconst_1        
	//  183  468:ireturn         

		case 8: // '\b'
			parcel.enforceInterface("android.bluetooth.IBluetoothInputDevice");
	//  184  469:aload_2         
	//  185  470:ldc1            #14  <String "android.bluetooth.IBluetoothInputDevice">
	//  186  472:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			if(parcel.readInt() != 0)
	//* 187  475:aload_2         
	//* 188  476:invokevirtual   #80  <Method int Parcel.readInt()>
	//* 189  479:ifeq            498
				parcel = ((Parcel) ((BluetoothDevice)BluetoothDevice.CREATOR.createFromParcel(parcel)));
	//  190  482:getstatic       #86  <Field android.os.Parcelable$Creator BluetoothDevice.CREATOR>
	//  191  485:aload_2         
	//  192  486:invokeinterface #92  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  193  491:checkcast       #82  <Class BluetoothDevice>
	//  194  494:astore_2        
			else
	//* 195  495:goto            500
				parcel = null;
	//  196  498:aconst_null     
	//  197  499:astore_2        
			boolean flag3 = getProtocolMode(((BluetoothDevice) (parcel)));
	//  198  500:aload_0         
	//  199  501:aload_2         
	//  200  502:invokevirtual   #136 <Method boolean getProtocolMode(BluetoothDevice)>
	//  201  505:istore          5
			parcel1.writeNoException();
	//  202  507:aload_3         
	//  203  508:invokevirtual   #99  <Method void Parcel.writeNoException()>
			if(flag3)
	//* 204  511:iload           5
	//* 205  513:ifeq            521
				i = 1;
	//  206  516:iconst_1        
	//  207  517:istore_1        
			else
	//* 208  518:goto            523
				i = 0;
	//  209  521:iconst_0        
	//  210  522:istore_1        
			parcel1.writeInt(i);
	//  211  523:aload_3         
	//  212  524:iload_1         
	//  213  525:invokevirtual   #103 <Method void Parcel.writeInt(int)>
			return true;
	//  214  528:iconst_1        
	//  215  529:ireturn         

		case 9: // '\t'
			parcel.enforceInterface("android.bluetooth.IBluetoothInputDevice");
	//  216  530:aload_2         
	//  217  531:ldc1            #14  <String "android.bluetooth.IBluetoothInputDevice">
	//  218  533:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			if(parcel.readInt() != 0)
	//* 219  536:aload_2         
	//* 220  537:invokevirtual   #80  <Method int Parcel.readInt()>
	//* 221  540:ifeq            559
				parcel = ((Parcel) ((BluetoothDevice)BluetoothDevice.CREATOR.createFromParcel(parcel)));
	//  222  543:getstatic       #86  <Field android.os.Parcelable$Creator BluetoothDevice.CREATOR>
	//  223  546:aload_2         
	//  224  547:invokeinterface #92  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  225  552:checkcast       #82  <Class BluetoothDevice>
	//  226  555:astore_2        
			else
	//* 227  556:goto            561
				parcel = null;
	//  228  559:aconst_null     
	//  229  560:astore_2        
			boolean flag4 = virtualUnplug(((BluetoothDevice) (parcel)));
	//  230  561:aload_0         
	//  231  562:aload_2         
	//  232  563:invokevirtual   #139 <Method boolean virtualUnplug(BluetoothDevice)>
	//  233  566:istore          5
			parcel1.writeNoException();
	//  234  568:aload_3         
	//  235  569:invokevirtual   #99  <Method void Parcel.writeNoException()>
			if(flag4)
	//* 236  572:iload           5
	//* 237  574:ifeq            582
				i = 1;
	//  238  577:iconst_1        
	//  239  578:istore_1        
			else
	//* 240  579:goto            584
				i = 0;
	//  241  582:iconst_0        
	//  242  583:istore_1        
			parcel1.writeInt(i);
	//  243  584:aload_3         
	//  244  585:iload_1         
	//  245  586:invokevirtual   #103 <Method void Parcel.writeInt(int)>
			return true;
	//  246  589:iconst_1        
	//  247  590:ireturn         

		case 10: // '\n'
			parcel.enforceInterface("android.bluetooth.IBluetoothInputDevice");
	//  248  591:aload_2         
	//  249  592:ldc1            #14  <String "android.bluetooth.IBluetoothInputDevice">
	//  250  594:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			BluetoothDevice bluetoothdevice1;
			if(parcel.readInt() != 0)
	//* 251  597:aload_2         
	//* 252  598:invokevirtual   #80  <Method int Parcel.readInt()>
	//* 253  601:ifeq            621
				bluetoothdevice1 = (BluetoothDevice)BluetoothDevice.CREATOR.createFromParcel(parcel);
	//  254  604:getstatic       #86  <Field android.os.Parcelable$Creator BluetoothDevice.CREATOR>
	//  255  607:aload_2         
	//  256  608:invokeinterface #92  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  257  613:checkcast       #82  <Class BluetoothDevice>
	//  258  616:astore          6
			else
	//* 259  618:goto            624
				bluetoothdevice1 = null;
	//  260  621:aconst_null     
	//  261  622:astore          6
			boolean flag5 = setProtocolMode(bluetoothdevice1, parcel.readInt());
	//  262  624:aload_0         
	//  263  625:aload           6
	//  264  627:aload_2         
	//  265  628:invokevirtual   #80  <Method int Parcel.readInt()>
	//  266  631:invokevirtual   #142 <Method boolean setProtocolMode(BluetoothDevice, int)>
	//  267  634:istore          5
			parcel1.writeNoException();
	//  268  636:aload_3         
	//  269  637:invokevirtual   #99  <Method void Parcel.writeNoException()>
			if(flag5)
	//* 270  640:iload           5
	//* 271  642:ifeq            650
				i = 1;
	//  272  645:iconst_1        
	//  273  646:istore_1        
			else
	//* 274  647:goto            652
				i = 0;
	//  275  650:iconst_0        
	//  276  651:istore_1        
			parcel1.writeInt(i);
	//  277  652:aload_3         
	//  278  653:iload_1         
	//  279  654:invokevirtual   #103 <Method void Parcel.writeInt(int)>
			return true;
	//  280  657:iconst_1        
	//  281  658:ireturn         

		case 11: // '\013'
			parcel.enforceInterface("android.bluetooth.IBluetoothInputDevice");
	//  282  659:aload_2         
	//  283  660:ldc1            #14  <String "android.bluetooth.IBluetoothInputDevice">
	//  284  662:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			BluetoothDevice bluetoothdevice2;
			if(parcel.readInt() != 0)
	//* 285  665:aload_2         
	//* 286  666:invokevirtual   #80  <Method int Parcel.readInt()>
	//* 287  669:ifeq            689
				bluetoothdevice2 = (BluetoothDevice)BluetoothDevice.CREATOR.createFromParcel(parcel);
	//  288  672:getstatic       #86  <Field android.os.Parcelable$Creator BluetoothDevice.CREATOR>
	//  289  675:aload_2         
	//  290  676:invokeinterface #92  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  291  681:checkcast       #82  <Class BluetoothDevice>
	//  292  684:astore          6
			else
	//* 293  686:goto            692
				bluetoothdevice2 = null;
	//  294  689:aconst_null     
	//  295  690:astore          6
			boolean flag6 = getReport(bluetoothdevice2, parcel.readByte(), parcel.readByte(), parcel.readInt());
	//  296  692:aload_0         
	//  297  693:aload           6
	//  298  695:aload_2         
	//  299  696:invokevirtual   #146 <Method byte Parcel.readByte()>
	//  300  699:aload_2         
	//  301  700:invokevirtual   #146 <Method byte Parcel.readByte()>
	//  302  703:aload_2         
	//  303  704:invokevirtual   #80  <Method int Parcel.readInt()>
	//  304  707:invokevirtual   #150 <Method boolean getReport(BluetoothDevice, byte, byte, int)>
	//  305  710:istore          5
			parcel1.writeNoException();
	//  306  712:aload_3         
	//  307  713:invokevirtual   #99  <Method void Parcel.writeNoException()>
			if(flag6)
	//* 308  716:iload           5
	//* 309  718:ifeq            726
				i = 1;
	//  310  721:iconst_1        
	//  311  722:istore_1        
			else
	//* 312  723:goto            728
				i = 0;
	//  313  726:iconst_0        
	//  314  727:istore_1        
			parcel1.writeInt(i);
	//  315  728:aload_3         
	//  316  729:iload_1         
	//  317  730:invokevirtual   #103 <Method void Parcel.writeInt(int)>
			return true;
	//  318  733:iconst_1        
	//  319  734:ireturn         

		case 12: // '\f'
			parcel.enforceInterface("android.bluetooth.IBluetoothInputDevice");
	//  320  735:aload_2         
	//  321  736:ldc1            #14  <String "android.bluetooth.IBluetoothInputDevice">
	//  322  738:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			BluetoothDevice bluetoothdevice3;
			if(parcel.readInt() != 0)
	//* 323  741:aload_2         
	//* 324  742:invokevirtual   #80  <Method int Parcel.readInt()>
	//* 325  745:ifeq            765
				bluetoothdevice3 = (BluetoothDevice)BluetoothDevice.CREATOR.createFromParcel(parcel);
	//  326  748:getstatic       #86  <Field android.os.Parcelable$Creator BluetoothDevice.CREATOR>
	//  327  751:aload_2         
	//  328  752:invokeinterface #92  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  329  757:checkcast       #82  <Class BluetoothDevice>
	//  330  760:astore          6
			else
	//* 331  762:goto            768
				bluetoothdevice3 = null;
	//  332  765:aconst_null     
	//  333  766:astore          6
			boolean flag7 = setReport(bluetoothdevice3, parcel.readByte(), parcel.readString());
	//  334  768:aload_0         
	//  335  769:aload           6
	//  336  771:aload_2         
	//  337  772:invokevirtual   #146 <Method byte Parcel.readByte()>
	//  338  775:aload_2         
	//  339  776:invokevirtual   #154 <Method String Parcel.readString()>
	//  340  779:invokevirtual   #158 <Method boolean setReport(BluetoothDevice, byte, String)>
	//  341  782:istore          5
			parcel1.writeNoException();
	//  342  784:aload_3         
	//  343  785:invokevirtual   #99  <Method void Parcel.writeNoException()>
			if(flag7)
	//* 344  788:iload           5
	//* 345  790:ifeq            798
				i = 1;
	//  346  793:iconst_1        
	//  347  794:istore_1        
			else
	//* 348  795:goto            800
				i = 0;
	//  349  798:iconst_0        
	//  350  799:istore_1        
			parcel1.writeInt(i);
	//  351  800:aload_3         
	//  352  801:iload_1         
	//  353  802:invokevirtual   #103 <Method void Parcel.writeInt(int)>
			return true;
	//  354  805:iconst_1        
	//  355  806:ireturn         

		case 13: // '\r'
			parcel.enforceInterface("android.bluetooth.IBluetoothInputDevice");
	//  356  807:aload_2         
	//  357  808:ldc1            #14  <String "android.bluetooth.IBluetoothInputDevice">
	//  358  810:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			BluetoothDevice bluetoothdevice4;
			if(parcel.readInt() != 0)
	//* 359  813:aload_2         
	//* 360  814:invokevirtual   #80  <Method int Parcel.readInt()>
	//* 361  817:ifeq            837
				bluetoothdevice4 = (BluetoothDevice)BluetoothDevice.CREATOR.createFromParcel(parcel);
	//  362  820:getstatic       #86  <Field android.os.Parcelable$Creator BluetoothDevice.CREATOR>
	//  363  823:aload_2         
	//  364  824:invokeinterface #92  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  365  829:checkcast       #82  <Class BluetoothDevice>
	//  366  832:astore          6
			else
	//* 367  834:goto            840
				bluetoothdevice4 = null;
	//  368  837:aconst_null     
	//  369  838:astore          6
			boolean flag8 = sendData(bluetoothdevice4, parcel.readString());
	//  370  840:aload_0         
	//  371  841:aload           6
	//  372  843:aload_2         
	//  373  844:invokevirtual   #154 <Method String Parcel.readString()>
	//  374  847:invokevirtual   #162 <Method boolean sendData(BluetoothDevice, String)>
	//  375  850:istore          5
			parcel1.writeNoException();
	//  376  852:aload_3         
	//  377  853:invokevirtual   #99  <Method void Parcel.writeNoException()>
			if(flag8)
	//* 378  856:iload           5
	//* 379  858:ifeq            866
				i = 1;
	//  380  861:iconst_1        
	//  381  862:istore_1        
			else
	//* 382  863:goto            868
				i = 0;
	//  383  866:iconst_0        
	//  384  867:istore_1        
			parcel1.writeInt(i);
	//  385  868:aload_3         
	//  386  869:iload_1         
	//  387  870:invokevirtual   #103 <Method void Parcel.writeInt(int)>
			return true;
	//  388  873:iconst_1        
	//  389  874:ireturn         
		}
		return super.onTransact(i, parcel, parcel1, j);
	//  390  875:aload_0         
	//  391  876:iload_1         
	//  392  877:aload_2         
	//  393  878:aload_3         
	//  394  879:iload           4
	//  395  881:invokespecial   #164 <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//  396  884:ireturn         
	}

	private static final String DESCRIPTOR = "android.bluetooth.IBluetoothInputDevice";
	static final int TRANSACTION_connect = 1;
	static final int TRANSACTION_disconnect = 2;
	static final int TRANSACTION_getConnectedDevices = 3;
	static final int TRANSACTION_getConnectionState = 5;
	static final int TRANSACTION_getDevicesMatchingConnectionStates = 4;
	static final int TRANSACTION_getPriority = 7;
	static final int TRANSACTION_getProtocolMode = 8;
	static final int TRANSACTION_getReport = 11;
	static final int TRANSACTION_sendData = 13;
	static final int TRANSACTION_setPriority = 6;
	static final int TRANSACTION_setProtocolMode = 10;
	static final int TRANSACTION_setReport = 12;
	static final int TRANSACTION_virtualUnplug = 9;

	public IBluetoothInputDevice$Stub()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Binder()>
		attachInterface(((android.os.IInterface) (this)), "android.bluetooth.IBluetoothInputDevice");
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:ldc1            #14  <String "android.bluetooth.IBluetoothInputDevice">
	//    5    8:invokevirtual   #49  <Method void attachInterface(android.os.IInterface, String)>
	//    6   11:return          
	}
}
