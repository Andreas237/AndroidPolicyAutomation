// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.content.pm;

import android.os.*;
import android.util.Log;

// Referenced classes of package android.content.pm:
//			IPackageInstallObserver

public static abstract class IPackageInstallObserver$Stub extends Binder
	implements IPackageInstallObserver
{
	static class MyProxy
		implements IPackageInstallObserver
	{

		public IBinder asBinder()
		{
			Log.d("Stub", "enter adBinder");
		//    0    0:ldc1            #18  <String "Stub">
		//    1    2:ldc1            #33  <String "enter adBinder">
		//    2    4:invokestatic    #26  <Method int Log.d(String, String)>
		//    3    7:pop             
			return mRemote;
		//    4    8:aload_0         
		//    5    9:getfield        #28  <Field IBinder mRemote>
		//    6   12:areturn         
		}

		public String getInterfaceDescriptor()
		{
			Log.d("Stub", "enter getInterfaceDescriptor");
		//    0    0:ldc1            #18  <String "Stub">
		//    1    2:ldc1            #37  <String "enter getInterfaceDescriptor">
		//    2    4:invokestatic    #26  <Method int Log.d(String, String)>
		//    3    7:pop             
			return "android.content.pm.IPackageInstallObserver";
		//    4    8:ldc1            #39  <String "android.content.pm.IPackageInstallObserver">
		//    5   10:areturn         
		}

		public void packageInstalled(String s, int i)
			throws RemoteException
		{
			Parcel parcel;
			Log.d("Stub", "enter packageInstalled");
		//    0    0:ldc1            #18  <String "Stub">
		//    1    2:ldc1            #45  <String "enter packageInstalled">
		//    2    4:invokestatic    #26  <Method int Log.d(String, String)>
		//    3    7:pop             
			parcel = Parcel.obtain();
		//    4    8:invokestatic    #51  <Method Parcel Parcel.obtain()>
		//    5   11:astore_3        
			Log.d("Stub", "start");
		//    6   12:ldc1            #18  <String "Stub">
		//    7   14:ldc1            #53  <String "start">
		//    8   16:invokestatic    #26  <Method int Log.d(String, String)>
		//    9   19:pop             
			parcel.writeInterfaceToken("android.content.pm.IPackageInstallObserver");
		//   10   20:aload_3         
		//   11   21:ldc1            #39  <String "android.content.pm.IPackageInstallObserver">
		//   12   23:invokevirtual   #57  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeString(s);
		//   13   26:aload_3         
		//   14   27:aload_1         
		//   15   28:invokevirtual   #60  <Method void Parcel.writeString(String)>
			parcel.writeInt(i);
		//   16   31:aload_3         
		//   17   32:iload_2         
		//   18   33:invokevirtual   #64  <Method void Parcel.writeInt(int)>
			mRemote.transact(1, parcel, ((Parcel) (null)), 1);
		//   19   36:aload_0         
		//   20   37:getfield        #28  <Field IBinder mRemote>
		//   21   40:iconst_1        
		//   22   41:aload_3         
		//   23   42:aconst_null     
		//   24   43:iconst_1        
		//   25   44:invokeinterface #70  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   26   49:pop             
			Log.d("Stub", "end");
		//   27   50:ldc1            #18  <String "Stub">
		//   28   52:ldc1            #72  <String "end">
		//   29   54:invokestatic    #26  <Method int Log.d(String, String)>
		//   30   57:pop             
			parcel.recycle();
		//   31   58:aload_3         
		//   32   59:invokevirtual   #75  <Method void Parcel.recycle()>
			break MISSING_BLOCK_LABEL_72;
		//   33   62:goto            72
			s;
		//   34   65:astore_1        
			parcel.recycle();
		//   35   66:aload_3         
		//   36   67:invokevirtual   #75  <Method void Parcel.recycle()>
			throw s;
		//   37   70:aload_1         
		//   38   71:athrow          
			Log.d("Stub", "exit packageInstalled");
		//   39   72:ldc1            #18  <String "Stub">
		//   40   74:ldc1            #77  <String "exit packageInstalled">
		//   41   76:invokestatic    #26  <Method int Log.d(String, String)>
		//   42   79:pop             
			return;
		//   43   80:return          
		}

		private IBinder mRemote;

		MyProxy(IBinder ibinder)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			Log.d("Stub", "enter ProxyC");
		//    2    4:ldc1            #18  <String "Stub">
		//    3    6:ldc1            #20  <String "enter ProxyC">
		//    4    8:invokestatic    #26  <Method int Log.d(String, String)>
		//    5   11:pop             
			mRemote = ibinder;
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:putfield        #28  <Field IBinder mRemote>
		//    9   17:return          
		}
	}


	public static IPackageInstallObserver asInterface(IBinder ibinder)
	{
		Log.d("Stub", "start");
	//    0    0:ldc1            #16  <String "Stub">
	//    1    2:ldc1            #40  <String "start">
	//    2    4:invokestatic    #31  <Method int Log.d(String, String)>
	//    3    7:pop             
		if(ibinder == null)
	//*   4    8:aload_0         
	//*   5    9:ifnonnull       14
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("android.content.pm.IPackageInstallObserver");
	//    8   14:aload_0         
	//    9   15:ldc1            #14  <String "android.content.pm.IPackageInstallObserver">
	//   10   17:invokeinterface #46  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   11   22:astore_1        
		if(iinterface != null && (iinterface instanceof IPackageInstallObserver))
	//*  12   23:aload_1         
	//*  13   24:ifnull          39
	//*  14   27:aload_1         
	//*  15   28:instanceof      #6   <Class IPackageInstallObserver>
	//*  16   31:ifeq            39
		{
			return (IPackageInstallObserver)iinterface;
	//   17   34:aload_1         
	//   18   35:checkcast       #6   <Class IPackageInstallObserver>
	//   19   38:areturn         
		} else
		{
			Log.d("Stub", "end");
	//   20   39:ldc1            #16  <String "Stub">
	//   21   41:ldc1            #48  <String "end">
	//   22   43:invokestatic    #31  <Method int Log.d(String, String)>
	//   23   46:pop             
			return ((IPackageInstallObserver) (new MyProxy(ibinder)));
	//   24   47:new             #9   <Class IPackageInstallObserver$Stub$MyProxy>
	//   25   50:dup             
	//   26   51:aload_0         
	//   27   52:invokespecial   #51  <Method void IPackageInstallObserver$Stub$MyProxy(IBinder)>
	//   28   55:areturn         
		}
	}

	public IBinder asBinder()
	{
		Log.d("Stub", "enter adBinder");
	//    0    0:ldc1            #16  <String "Stub">
	//    1    2:ldc1            #55  <String "enter adBinder">
	//    2    4:invokestatic    #31  <Method int Log.d(String, String)>
	//    3    7:pop             
		return ((IBinder) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		Log.d("Stub", "enter onTransact");
	//    0    0:ldc1            #16  <String "Stub">
	//    1    2:ldc1            #61  <String "enter onTransact">
	//    2    4:invokestatic    #31  <Method int Log.d(String, String)>
	//    3    7:pop             
		switch(i)
	//*   4    8:iload_1         
		{
	//*   5    9:lookupswitch    2: default 36
	//	               1: 63
	//	               1598968902: 39
	//*   6   36:goto            99
		case 1598968902: 
			Log.d("Stub", "enter INTERFACE_TRANSACTION");
	//    7   39:ldc1            #16  <String "Stub">
	//    8   41:ldc1            #63  <String "enter INTERFACE_TRANSACTION">
	//    9   43:invokestatic    #31  <Method int Log.d(String, String)>
	//   10   46:pop             
			parcel1.writeString("android.content.pm.IPackageInstallObserver");
	//   11   47:aload_3         
	//   12   48:ldc1            #14  <String "android.content.pm.IPackageInstallObserver">
	//   13   50:invokevirtual   #69  <Method void Parcel.writeString(String)>
			Log.d("Stub", "end INTERFACE_TRANSACTION");
	//   14   53:ldc1            #16  <String "Stub">
	//   15   55:ldc1            #71  <String "end INTERFACE_TRANSACTION">
	//   16   57:invokestatic    #31  <Method int Log.d(String, String)>
	//   17   60:pop             
			return true;
	//   18   61:iconst_1        
	//   19   62:ireturn         

		case 1: // '\001'
			Log.d("Stub", "enter TRANSACTION_packageInstalled");
	//   20   63:ldc1            #16  <String "Stub">
	//   21   65:ldc1            #73  <String "enter TRANSACTION_packageInstalled">
	//   22   67:invokestatic    #31  <Method int Log.d(String, String)>
	//   23   70:pop             
			parcel.enforceInterface("android.content.pm.IPackageInstallObserver");
	//   24   71:aload_2         
	//   25   72:ldc1            #14  <String "android.content.pm.IPackageInstallObserver">
	//   26   74:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			packageInstalled(parcel.readString(), parcel.readInt());
	//   27   77:aload_0         
	//   28   78:aload_2         
	//   29   79:invokevirtual   #80  <Method String Parcel.readString()>
	//   30   82:aload_2         
	//   31   83:invokevirtual   #84  <Method int Parcel.readInt()>
	//   32   86:invokevirtual   #88  <Method void packageInstalled(String, int)>
			Log.d("Stub", "end TRANSACTION_packageInstalled");
	//   33   89:ldc1            #16  <String "Stub">
	//   34   91:ldc1            #90  <String "end TRANSACTION_packageInstalled">
	//   35   93:invokestatic    #31  <Method int Log.d(String, String)>
	//   36   96:pop             
			return true;
	//   37   97:iconst_1        
	//   38   98:ireturn         
		}
		Log.d("Stub", "exit onTransact");
	//   39   99:ldc1            #16  <String "Stub">
	//   40  101:ldc1            #92  <String "exit onTransact">
	//   41  103:invokestatic    #31  <Method int Log.d(String, String)>
	//   42  106:pop             
		return super.onTransact(i, parcel, parcel1, j);
	//   43  107:aload_0         
	//   44  108:iload_1         
	//   45  109:aload_2         
	//   46  110:aload_3         
	//   47  111:iload           4
	//   48  113:invokespecial   #94  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//   49  116:ireturn         
	}

	private static final String DESCRIPTOR_STRING = "android.content.pm.IPackageInstallObserver";
	private static final String TAG = "Stub";
	static final int TRANSACTION_packageInstalled = 1;

	public IPackageInstallObserver$Stub()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Binder()>
		Log.d("Stub", "enter");
	//    2    4:ldc1            #16  <String "Stub">
	//    3    6:ldc1            #25  <String "enter">
	//    4    8:invokestatic    #31  <Method int Log.d(String, String)>
	//    5   11:pop             
		attachInterface(((android.os.IInterface) (this)), "android.content.pm.IPackageInstallObserver");
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:ldc1            #14  <String "android.content.pm.IPackageInstallObserver">
	//    9   16:invokevirtual   #35  <Method void attachInterface(android.os.IInterface, String)>
	//   10   19:return          
	}
}
