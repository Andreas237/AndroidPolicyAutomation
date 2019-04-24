// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.content.pm;

import android.os.*;
import android.util.Log;

// Referenced classes of package android.content.pm:
//			IPackageInstallObserver

static class IPackageInstallObserver$Stub$MyProxy
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

	IPackageInstallObserver$Stub$MyProxy(IBinder ibinder)
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
