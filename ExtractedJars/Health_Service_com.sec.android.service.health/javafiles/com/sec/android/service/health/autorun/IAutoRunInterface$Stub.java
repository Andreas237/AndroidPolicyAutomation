// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.autorun;

import android.os.*;

// Referenced classes of package com.sec.android.service.health.autorun:
//			IAutoRunInterface

public static abstract class IAutoRunInterface$Stub extends Binder
	implements IAutoRunInterface
{
	private static class Proxy
		implements IAutoRunInterface
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
			return "com.sec.android.service.health.autorun.IAutoRunInterface";
		//    0    0:ldc1            #26  <String "com.sec.android.service.health.autorun.IAutoRunInterface">
		//    1    2:areturn         
		}

		public int isAutoRunModeEnabled(String s)
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
			int i;
			parcel.writeInterfaceToken("com.sec.android.service.health.autorun.IAutoRunInterface");
		//    4    9:aload_3         
		//    5   10:ldc1            #26  <String "com.sec.android.service.health.autorun.IAutoRunInterface">
		//    6   12:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeString(s);
		//    7   15:aload_3         
		//    8   16:aload_1         
		//    9   17:invokevirtual   #43  <Method void Parcel.writeString(String)>
			mRemote.transact(2, parcel, parcel1, 0);
		//   10   20:aload_0         
		//   11   21:getfield        #19  <Field IBinder mRemote>
		//   12   24:iconst_2        
		//   13   25:aload_3         
		//   14   26:aload           4
		//   15   28:iconst_0        
		//   16   29:invokeinterface #49  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   17   34:pop             
			parcel1.readException();
		//   18   35:aload           4
		//   19   37:invokevirtual   #52  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   20   40:aload           4
		//   21   42:invokevirtual   #56  <Method int Parcel.readInt()>
		//   22   45:istore_2        
			parcel1.recycle();
		//   23   46:aload           4
		//   24   48:invokevirtual   #59  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   51:aload_3         
		//   26   52:invokevirtual   #59  <Method void Parcel.recycle()>
			return i;
		//   27   55:iload_2         
		//   28   56:ireturn         
			s;
		//   29   57:astore_1        
			parcel1.recycle();
		//   30   58:aload           4
		//   31   60:invokevirtual   #59  <Method void Parcel.recycle()>
			parcel.recycle();
		//   32   63:aload_3         
		//   33   64:invokevirtual   #59  <Method void Parcel.recycle()>
			throw s;
		//   34   67:aload_1         
		//   35   68:athrow          
		}

		public int setAutoRunMode(String s, int i)
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
			parcel.writeInterfaceToken("com.sec.android.service.health.autorun.IAutoRunInterface");
		//    4    9:aload_3         
		//    5   10:ldc1            #26  <String "com.sec.android.service.health.autorun.IAutoRunInterface">
		//    6   12:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeString(s);
		//    7   15:aload_3         
		//    8   16:aload_1         
		//    9   17:invokevirtual   #43  <Method void Parcel.writeString(String)>
			parcel.writeInt(i);
		//   10   20:aload_3         
		//   11   21:iload_2         
		//   12   22:invokevirtual   #66  <Method void Parcel.writeInt(int)>
			mRemote.transact(1, parcel, parcel1, 0);
		//   13   25:aload_0         
		//   14   26:getfield        #19  <Field IBinder mRemote>
		//   15   29:iconst_1        
		//   16   30:aload_3         
		//   17   31:aload           4
		//   18   33:iconst_0        
		//   19   34:invokeinterface #49  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   20   39:pop             
			parcel1.readException();
		//   21   40:aload           4
		//   22   42:invokevirtual   #52  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   23   45:aload           4
		//   24   47:invokevirtual   #56  <Method int Parcel.readInt()>
		//   25   50:istore_2        
			parcel1.recycle();
		//   26   51:aload           4
		//   27   53:invokevirtual   #59  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   56:aload_3         
		//   29   57:invokevirtual   #59  <Method void Parcel.recycle()>
			return i;
		//   30   60:iload_2         
		//   31   61:ireturn         
			s;
		//   32   62:astore_1        
			parcel1.recycle();
		//   33   63:aload           4
		//   34   65:invokevirtual   #59  <Method void Parcel.recycle()>
			parcel.recycle();
		//   35   68:aload_3         
		//   36   69:invokevirtual   #59  <Method void Parcel.recycle()>
			throw s;
		//   37   72:aload_1         
		//   38   73:athrow          
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


	public static IAutoRunInterface asInterface(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.sec.android.service.health.autorun.IAutoRunInterface");
	//    4    6:aload_0         
	//    5    7:ldc1            #14  <String "com.sec.android.service.health.autorun.IAutoRunInterface">
	//    6    9:invokeinterface #36  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof IAutoRunInterface))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class IAutoRunInterface>
	//*  12   23:ifeq            31
			return (IAutoRunInterface)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class IAutoRunInterface>
	//   15   30:areturn         
		else
			return ((IAutoRunInterface) (new Proxy(ibinder)));
	//   16   31:new             #9   <Class IAutoRunInterface$Stub$Proxy>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #39  <Method void IAutoRunInterface$Stub$Proxy(IBinder)>
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
	//*   1    1:lookupswitch    3: default 36
	//	               1: 54
	//	               2: 84
	//	               1598968902: 46
		default:
			return super.onTransact(i, parcel, parcel1, j);
	//    2   36:aload_0         
	//    3   37:iload_1         
	//    4   38:aload_2         
	//    5   39:aload_3         
	//    6   40:iload           4
	//    7   42:invokespecial   #47  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//    8   45:ireturn         

		case 1598968902: 
			parcel1.writeString("com.sec.android.service.health.autorun.IAutoRunInterface");
	//    9   46:aload_3         
	//   10   47:ldc1            #14  <String "com.sec.android.service.health.autorun.IAutoRunInterface">
	//   11   49:invokevirtual   #53  <Method void Parcel.writeString(String)>
			return true;
	//   12   52:iconst_1        
	//   13   53:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("com.sec.android.service.health.autorun.IAutoRunInterface");
	//   14   54:aload_2         
	//   15   55:ldc1            #14  <String "com.sec.android.service.health.autorun.IAutoRunInterface">
	//   16   57:invokevirtual   #56  <Method void Parcel.enforceInterface(String)>
			i = setAutoRunMode(parcel.readString(), parcel.readInt());
	//   17   60:aload_0         
	//   18   61:aload_2         
	//   19   62:invokevirtual   #60  <Method String Parcel.readString()>
	//   20   65:aload_2         
	//   21   66:invokevirtual   #64  <Method int Parcel.readInt()>
	//   22   69:invokevirtual   #68  <Method int setAutoRunMode(String, int)>
	//   23   72:istore_1        
			parcel1.writeNoException();
	//   24   73:aload_3         
	//   25   74:invokevirtual   #71  <Method void Parcel.writeNoException()>
			parcel1.writeInt(i);
	//   26   77:aload_3         
	//   27   78:iload_1         
	//   28   79:invokevirtual   #75  <Method void Parcel.writeInt(int)>
			return true;
	//   29   82:iconst_1        
	//   30   83:ireturn         

		case 2: // '\002'
			parcel.enforceInterface("com.sec.android.service.health.autorun.IAutoRunInterface");
	//   31   84:aload_2         
	//   32   85:ldc1            #14  <String "com.sec.android.service.health.autorun.IAutoRunInterface">
	//   33   87:invokevirtual   #56  <Method void Parcel.enforceInterface(String)>
			i = isAutoRunModeEnabled(parcel.readString());
	//   34   90:aload_0         
	//   35   91:aload_2         
	//   36   92:invokevirtual   #60  <Method String Parcel.readString()>
	//   37   95:invokevirtual   #79  <Method int isAutoRunModeEnabled(String)>
	//   38   98:istore_1        
			parcel1.writeNoException();
	//   39   99:aload_3         
	//   40  100:invokevirtual   #71  <Method void Parcel.writeNoException()>
			parcel1.writeInt(i);
	//   41  103:aload_3         
	//   42  104:iload_1         
	//   43  105:invokevirtual   #75  <Method void Parcel.writeInt(int)>
			return true;
	//   44  108:iconst_1        
	//   45  109:ireturn         
		}
	}

	private static final String DESCRIPTOR = "com.sec.android.service.health.autorun.IAutoRunInterface";
	static final int TRANSACTION_isAutoRunModeEnabled = 2;
	static final int TRANSACTION_setAutoRunMode = 1;

	public IAutoRunInterface$Stub()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Binder()>
		attachInterface(((android.os.IInterface) (this)), "com.sec.android.service.health.autorun.IAutoRunInterface");
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:ldc1            #14  <String "com.sec.android.service.health.autorun.IAutoRunInterface">
	//    5    8:invokevirtual   #27  <Method void attachInterface(android.os.IInterface, String)>
	//    6   11:return          
	}
}
