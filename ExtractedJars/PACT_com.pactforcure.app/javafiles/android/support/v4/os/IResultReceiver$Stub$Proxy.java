// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.os;

import android.os.*;

// Referenced classes of package android.support.v4.os:
//			IResultReceiver

private static class IResultReceiver$Stub$Proxy
	implements IResultReceiver
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
		return "android.support.v4.os.IResultReceiver";
	//    0    0:ldc1            #26  <String "android.support.v4.os.IResultReceiver">
	//    1    2:areturn         
	}

	public void send(int i, Bundle bundle)
		throws RemoteException
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel.writeInterfaceToken("android.support.v4.os.IResultReceiver");
	//    2    4:aload_3         
	//    3    5:ldc1            #26  <String "android.support.v4.os.IResultReceiver">
	//    4    7:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    5   10:aload_3         
	//    6   11:iload_1         
	//    7   12:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		if(bundle == null)
			break MISSING_BLOCK_LABEL_49;
	//    8   15:aload_2         
	//    9   16:ifnull          49
		parcel.writeInt(1);
	//   10   19:aload_3         
	//   11   20:iconst_1        
	//   12   21:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   13   24:aload_2         
	//   14   25:aload_3         
	//   15   26:iconst_0        
	//   16   27:invokevirtual   #50  <Method void Bundle.writeToParcel(Parcel, int)>
_L1:
		mRemote.transact(1, parcel, ((Parcel) (null)), 1);
	//   17   30:aload_0         
	//   18   31:getfield        #19  <Field IBinder mRemote>
	//   19   34:iconst_1        
	//   20   35:aload_3         
	//   21   36:aconst_null     
	//   22   37:iconst_1        
	//   23   38:invokeinterface #56  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   24   43:pop             
		parcel.recycle();
	//   25   44:aload_3         
	//   26   45:invokevirtual   #59  <Method void Parcel.recycle()>
		return;
	//   27   48:return          
		parcel.writeInt(0);
	//   28   49:aload_3         
	//   29   50:iconst_0        
	//   30   51:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		  goto _L1
	//*  31   54:goto            30
		bundle;
	//   32   57:astore_2        
		parcel.recycle();
	//   33   58:aload_3         
	//   34   59:invokevirtual   #59  <Method void Parcel.recycle()>
		throw bundle;
	//   35   62:aload_2         
	//   36   63:athrow          
	}

	private IBinder mRemote;

	IResultReceiver$Stub$Proxy(IBinder ibinder)
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
