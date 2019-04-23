// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import android.os.*;

// Referenced classes of package com.firebase.jobdispatcher:
//			IJobCallback

private static class IJobCallback$Stub$Proxy
	implements IJobCallback
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
		return "com.firebase.jobdispatcher.IJobCallback";
	//    0    0:ldc1            #26  <String "com.firebase.jobdispatcher.IJobCallback">
	//    1    2:areturn         
	}

	public void jobFinished(Bundle bundle, int i)
		throws RemoteException
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel.writeInterfaceToken("com.firebase.jobdispatcher.IJobCallback");
	//    2    4:aload_3         
	//    3    5:ldc1            #26  <String "com.firebase.jobdispatcher.IJobCallback">
	//    4    7:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
		if(bundle == null)
			break MISSING_BLOCK_LABEL_28;
	//    5   10:aload_1         
	//    6   11:ifnull          28
		parcel.writeInt(1);
	//    7   14:aload_3         
	//    8   15:iconst_1        
	//    9   16:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   10   19:aload_1         
	//   11   20:aload_3         
	//   12   21:iconst_0        
	//   13   22:invokevirtual   #50  <Method void Bundle.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_33;
	//   14   25:goto            33
		parcel.writeInt(0);
	//   15   28:aload_3         
	//   16   29:iconst_0        
	//   17   30:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		parcel.writeInt(i);
	//   18   33:aload_3         
	//   19   34:iload_2         
	//   20   35:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		mRemote.transact(1, parcel, ((Parcel) (null)), 1);
	//   21   38:aload_0         
	//   22   39:getfield        #19  <Field IBinder mRemote>
	//   23   42:iconst_1        
	//   24   43:aload_3         
	//   25   44:aconst_null     
	//   26   45:iconst_1        
	//   27   46:invokeinterface #56  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   28   51:pop             
		parcel.recycle();
	//   29   52:aload_3         
	//   30   53:invokevirtual   #59  <Method void Parcel.recycle()>
		return;
	//   31   56:return          
		bundle;
	//   32   57:astore_1        
		parcel.recycle();
	//   33   58:aload_3         
	//   34   59:invokevirtual   #59  <Method void Parcel.recycle()>
		throw bundle;
	//   35   62:aload_1         
	//   36   63:athrow          
	}

	private IBinder mRemote;

	IJobCallback$Stub$Proxy(IBinder ibinder)
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
