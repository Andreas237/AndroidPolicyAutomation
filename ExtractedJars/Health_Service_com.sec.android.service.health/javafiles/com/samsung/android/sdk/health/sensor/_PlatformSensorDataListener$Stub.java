// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.samsung.android.sdk.health.sensor;

import android.os.*;

// Referenced classes of package com.samsung.android.sdk.health.sensor:
//			_PlatformSensorDataListener

public static abstract class _PlatformSensorDataListener$Stub extends Binder
	implements _PlatformSensorDataListener
{
	private static class Proxy
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


	public static _PlatformSensorDataListener asInterface(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.samsung.android.sdk.health.sensor._PlatformSensorDataListener");
	//    4    6:aload_0         
	//    5    7:ldc1            #14  <String "com.samsung.android.sdk.health.sensor._PlatformSensorDataListener">
	//    6    9:invokeinterface #40  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof _PlatformSensorDataListener))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class _PlatformSensorDataListener>
	//*  12   23:ifeq            31
			return (_PlatformSensorDataListener)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class _PlatformSensorDataListener>
	//   15   30:areturn         
		else
			return ((_PlatformSensorDataListener) (new Proxy(ibinder)));
	//   16   31:new             #9   <Class _PlatformSensorDataListener$Stub$Proxy>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #43  <Method void _PlatformSensorDataListener$Stub$Proxy(IBinder)>
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
	//	               1: 70
	//	               2: 94
	//	               3: 142
	//	               4: 172
	//	               1598968902: 62
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
			parcel1.writeString("com.samsung.android.sdk.health.sensor._PlatformSensorDataListener");
	//    9   62:aload_3         
	//   10   63:ldc1            #14  <String "com.samsung.android.sdk.health.sensor._PlatformSensorDataListener">
	//   11   65:invokevirtual   #57  <Method void Parcel.writeString(String)>
			return true;
	//   12   68:iconst_1        
	//   13   69:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("com.samsung.android.sdk.health.sensor._PlatformSensorDataListener");
	//   14   70:aload_2         
	//   15   71:ldc1            #14  <String "com.samsung.android.sdk.health.sensor._PlatformSensorDataListener">
	//   16   73:invokevirtual   #60  <Method void Parcel.enforceInterface(String)>
			onDataStarted(parcel.readInt(), parcel.readInt());
	//   17   76:aload_0         
	//   18   77:aload_2         
	//   19   78:invokevirtual   #64  <Method int Parcel.readInt()>
	//   20   81:aload_2         
	//   21   82:invokevirtual   #64  <Method int Parcel.readInt()>
	//   22   85:invokevirtual   #68  <Method void onDataStarted(int, int)>
			parcel1.writeNoException();
	//   23   88:aload_3         
	//   24   89:invokevirtual   #71  <Method void Parcel.writeNoException()>
			return true;
	//   25   92:iconst_1        
	//   26   93:ireturn         

		case 2: // '\002'
			parcel.enforceInterface("com.samsung.android.sdk.health.sensor._PlatformSensorDataListener");
	//   27   94:aload_2         
	//   28   95:ldc1            #14  <String "com.samsung.android.sdk.health.sensor._PlatformSensorDataListener">
	//   29   97:invokevirtual   #60  <Method void Parcel.enforceInterface(String)>
			i = parcel.readInt();
	//   30  100:aload_2         
	//   31  101:invokevirtual   #64  <Method int Parcel.readInt()>
	//   32  104:istore_1        
			if(parcel.readInt() != 0)
	//*  33  105:aload_2         
	//*  34  106:invokevirtual   #64  <Method int Parcel.readInt()>
	//*  35  109:ifeq            137
				parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
	//   36  112:getstatic       #77  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   37  115:aload_2         
	//   38  116:invokeinterface #83  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   39  121:checkcast       #73  <Class Bundle>
	//   40  124:astore_2        
			else
	//*  41  125:aload_0         
	//*  42  126:iload_1         
	//*  43  127:aload_2         
	//*  44  128:invokevirtual   #87  <Method void onDataReceived(int, Bundle)>
	//*  45  131:aload_3         
	//*  46  132:invokevirtual   #71  <Method void Parcel.writeNoException()>
	//*  47  135:iconst_1        
	//*  48  136:ireturn         
				parcel = null;
	//   49  137:aconst_null     
	//   50  138:astore_2        
			onDataReceived(i, ((Bundle) (parcel)));
			parcel1.writeNoException();
			return true;

	//*  51  139:goto            125
		case 3: // '\003'
			parcel.enforceInterface("com.samsung.android.sdk.health.sensor._PlatformSensorDataListener");
	//   52  142:aload_2         
	//   53  143:ldc1            #14  <String "com.samsung.android.sdk.health.sensor._PlatformSensorDataListener">
	//   54  145:invokevirtual   #60  <Method void Parcel.enforceInterface(String)>
			onBulkDataReceived(parcel.readInt(), (Bundle[])parcel.createTypedArray(Bundle.CREATOR));
	//   55  148:aload_0         
	//   56  149:aload_2         
	//   57  150:invokevirtual   #64  <Method int Parcel.readInt()>
	//   58  153:aload_2         
	//   59  154:getstatic       #77  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   60  157:invokevirtual   #91  <Method Object[] Parcel.createTypedArray(android.os.Parcelable$Creator)>
	//   61  160:checkcast       #93  <Class Bundle[]>
	//   62  163:invokevirtual   #97  <Method void onBulkDataReceived(int, Bundle[])>
			parcel1.writeNoException();
	//   63  166:aload_3         
	//   64  167:invokevirtual   #71  <Method void Parcel.writeNoException()>
			return true;
	//   65  170:iconst_1        
	//   66  171:ireturn         

		case 4: // '\004'
			parcel.enforceInterface("com.samsung.android.sdk.health.sensor._PlatformSensorDataListener");
	//   67  172:aload_2         
	//   68  173:ldc1            #14  <String "com.samsung.android.sdk.health.sensor._PlatformSensorDataListener">
	//   69  175:invokevirtual   #60  <Method void Parcel.enforceInterface(String)>
			onDataStopped(parcel.readInt(), parcel.readInt());
	//   70  178:aload_0         
	//   71  179:aload_2         
	//   72  180:invokevirtual   #64  <Method int Parcel.readInt()>
	//   73  183:aload_2         
	//   74  184:invokevirtual   #64  <Method int Parcel.readInt()>
	//   75  187:invokevirtual   #100 <Method void onDataStopped(int, int)>
			parcel1.writeNoException();
	//   76  190:aload_3         
	//   77  191:invokevirtual   #71  <Method void Parcel.writeNoException()>
			return true;
	//   78  194:iconst_1        
	//   79  195:ireturn         
		}
	}

	private static final String DESCRIPTOR = "com.samsung.android.sdk.health.sensor._PlatformSensorDataListener";
	static final int TRANSACTION_onBulkDataReceived = 3;
	static final int TRANSACTION_onDataReceived = 2;
	static final int TRANSACTION_onDataStarted = 1;
	static final int TRANSACTION_onDataStopped = 4;

	public _PlatformSensorDataListener$Stub()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Binder()>
		attachInterface(((android.os.IInterface) (this)), "com.samsung.android.sdk.health.sensor._PlatformSensorDataListener");
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:ldc1            #14  <String "com.samsung.android.sdk.health.sensor._PlatformSensorDataListener">
	//    5    8:invokevirtual   #31  <Method void attachInterface(android.os.IInterface, String)>
	//    6   11:return          
	}
}
