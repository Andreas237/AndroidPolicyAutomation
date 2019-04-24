// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.samsung.android.sdk.health.sensor;

import android.os.*;

// Referenced classes of package com.samsung.android.sdk.health.sensor:
//			_PlatformSensorDataListener

private static class _PlatformSensorDataListener$Stub$Proxy
	implements _PlatformSensorDataListener
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
		return "com.samsung.android.sdk.health.sensor._PlatformSensorDataListener";
	//    0    0:ldc1            #26  <String "com.samsung.android.sdk.health.sensor._PlatformSensorDataListener">
	//    1    2:areturn         
	}

	public void onBulkDataReceived(int i, Bundle abundle[])
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
		parcel.writeInterfaceToken("com.samsung.android.sdk.health.sensor._PlatformSensorDataListener");
	//    4    9:aload_3         
	//    5   10:ldc1            #26  <String "com.samsung.android.sdk.health.sensor._PlatformSensorDataListener">
	//    6   12:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   15:aload_3         
	//    8   16:iload_1         
	//    9   17:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		parcel.writeTypedArray(((android.os.Parcelable []) (abundle)), 0);
	//   10   20:aload_3         
	//   11   21:aload_2         
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #48  <Method void Parcel.writeTypedArray(android.os.Parcelable[], int)>
		mRemote.transact(3, parcel, parcel1, 0);
	//   14   26:aload_0         
	//   15   27:getfield        #19  <Field IBinder mRemote>
	//   16   30:iconst_3        
	//   17   31:aload_3         
	//   18   32:aload           4
	//   19   34:iconst_0        
	//   20   35:invokeinterface #54  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   21   40:pop             
		parcel1.readException();
	//   22   41:aload           4
	//   23   43:invokevirtual   #57  <Method void Parcel.readException()>
		parcel1.recycle();
	//   24   46:aload           4
	//   25   48:invokevirtual   #60  <Method void Parcel.recycle()>
		parcel.recycle();
	//   26   51:aload_3         
	//   27   52:invokevirtual   #60  <Method void Parcel.recycle()>
		return;
	//   28   55:return          
		abundle;
	//   29   56:astore_2        
		parcel1.recycle();
	//   30   57:aload           4
	//   31   59:invokevirtual   #60  <Method void Parcel.recycle()>
		parcel.recycle();
	//   32   62:aload_3         
	//   33   63:invokevirtual   #60  <Method void Parcel.recycle()>
		throw abundle;
	//   34   66:aload_2         
	//   35   67:athrow          
	}

	public void onDataReceived(int i, Bundle bundle)
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
		parcel.writeInterfaceToken("com.samsung.android.sdk.health.sensor._PlatformSensorDataListener");
	//    4    9:aload_3         
	//    5   10:ldc1            #26  <String "com.samsung.android.sdk.health.sensor._PlatformSensorDataListener">
	//    6   12:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   15:aload_3         
	//    8   16:iload_1         
	//    9   17:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		if(bundle == null)
			break MISSING_BLOCK_LABEL_65;
	//   10   20:aload_2         
	//   11   21:ifnull          65
		parcel.writeInt(1);
	//   12   24:aload_3         
	//   13   25:iconst_1        
	//   14   26:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   15   29:aload_2         
	//   16   30:aload_3         
	//   17   31:iconst_0        
	//   18   32:invokevirtual   #69  <Method void Bundle.writeToParcel(Parcel, int)>
_L1:
		mRemote.transact(2, parcel, parcel1, 0);
	//   19   35:aload_0         
	//   20   36:getfield        #19  <Field IBinder mRemote>
	//   21   39:iconst_2        
	//   22   40:aload_3         
	//   23   41:aload           4
	//   24   43:iconst_0        
	//   25   44:invokeinterface #54  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   26   49:pop             
		parcel1.readException();
	//   27   50:aload           4
	//   28   52:invokevirtual   #57  <Method void Parcel.readException()>
		parcel1.recycle();
	//   29   55:aload           4
	//   30   57:invokevirtual   #60  <Method void Parcel.recycle()>
		parcel.recycle();
	//   31   60:aload_3         
	//   32   61:invokevirtual   #60  <Method void Parcel.recycle()>
		return;
	//   33   64:return          
		parcel.writeInt(0);
	//   34   65:aload_3         
	//   35   66:iconst_0        
	//   36   67:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		  goto _L1
	//*  37   70:goto            35
		bundle;
	//   38   73:astore_2        
		parcel1.recycle();
	//   39   74:aload           4
	//   40   76:invokevirtual   #60  <Method void Parcel.recycle()>
		parcel.recycle();
	//   41   79:aload_3         
	//   42   80:invokevirtual   #60  <Method void Parcel.recycle()>
		throw bundle;
	//   43   83:aload_2         
	//   44   84:athrow          
	}

	public void onDataStarted(int i, int j)
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
		parcel.writeInterfaceToken("com.samsung.android.sdk.health.sensor._PlatformSensorDataListener");
	//    4    9:aload_3         
	//    5   10:ldc1            #26  <String "com.samsung.android.sdk.health.sensor._PlatformSensorDataListener">
	//    6   12:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   15:aload_3         
	//    8   16:iload_1         
	//    9   17:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		parcel.writeInt(j);
	//   10   20:aload_3         
	//   11   21:iload_2         
	//   12   22:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		mRemote.transact(1, parcel, parcel1, 0);
	//   13   25:aload_0         
	//   14   26:getfield        #19  <Field IBinder mRemote>
	//   15   29:iconst_1        
	//   16   30:aload_3         
	//   17   31:aload           4
	//   18   33:iconst_0        
	//   19   34:invokeinterface #54  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   20   39:pop             
		parcel1.readException();
	//   21   40:aload           4
	//   22   42:invokevirtual   #57  <Method void Parcel.readException()>
		parcel1.recycle();
	//   23   45:aload           4
	//   24   47:invokevirtual   #60  <Method void Parcel.recycle()>
		parcel.recycle();
	//   25   50:aload_3         
	//   26   51:invokevirtual   #60  <Method void Parcel.recycle()>
		return;
	//   27   54:return          
		Exception exception;
		exception;
	//   28   55:astore          5
		parcel1.recycle();
	//   29   57:aload           4
	//   30   59:invokevirtual   #60  <Method void Parcel.recycle()>
		parcel.recycle();
	//   31   62:aload_3         
	//   32   63:invokevirtual   #60  <Method void Parcel.recycle()>
		throw exception;
	//   33   66:aload           5
	//   34   68:athrow          
	}

	public void onDataStopped(int i, int j)
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
		parcel.writeInterfaceToken("com.samsung.android.sdk.health.sensor._PlatformSensorDataListener");
	//    4    9:aload_3         
	//    5   10:ldc1            #26  <String "com.samsung.android.sdk.health.sensor._PlatformSensorDataListener">
	//    6   12:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   15:aload_3         
	//    8   16:iload_1         
	//    9   17:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		parcel.writeInt(j);
	//   10   20:aload_3         
	//   11   21:iload_2         
	//   12   22:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		mRemote.transact(4, parcel, parcel1, 0);
	//   13   25:aload_0         
	//   14   26:getfield        #19  <Field IBinder mRemote>
	//   15   29:iconst_4        
	//   16   30:aload_3         
	//   17   31:aload           4
	//   18   33:iconst_0        
	//   19   34:invokeinterface #54  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   20   39:pop             
		parcel1.readException();
	//   21   40:aload           4
	//   22   42:invokevirtual   #57  <Method void Parcel.readException()>
		parcel1.recycle();
	//   23   45:aload           4
	//   24   47:invokevirtual   #60  <Method void Parcel.recycle()>
		parcel.recycle();
	//   25   50:aload_3         
	//   26   51:invokevirtual   #60  <Method void Parcel.recycle()>
		return;
	//   27   54:return          
		Exception exception;
		exception;
	//   28   55:astore          5
		parcel1.recycle();
	//   29   57:aload           4
	//   30   59:invokevirtual   #60  <Method void Parcel.recycle()>
		parcel.recycle();
	//   31   62:aload_3         
	//   32   63:invokevirtual   #60  <Method void Parcel.recycle()>
		throw exception;
	//   33   66:aload           5
	//   34   68:athrow          
	}

	private IBinder mRemote;

	_PlatformSensorDataListener$Stub$Proxy(IBinder ibinder)
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
