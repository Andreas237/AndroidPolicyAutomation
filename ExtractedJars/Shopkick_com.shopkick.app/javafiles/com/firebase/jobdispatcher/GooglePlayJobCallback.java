// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import android.os.*;

// Referenced classes of package com.firebase.jobdispatcher:
//			JobCallback

final class GooglePlayJobCallback
	implements JobCallback
{

	public GooglePlayJobCallback(IBinder ibinder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		remote = ibinder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field IBinder remote>
	//    5    9:return          
	}

	public void jobFinished(int i)
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #33  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #33  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.google.android.gms.gcm.INetworkTaskCallback");
	//    4    8:aload_2         
	//    5    9:ldc1            #10  <String "com.google.android.gms.gcm.INetworkTaskCallback">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   14:aload_2         
	//    8   15:iload_1         
	//    9   16:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		remote.transact(2, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #22  <Field IBinder remote>
	//   12   23:iconst_2        
	//   13   24:aload_2         
	//   14   25:aload_3         
	//   15   26:iconst_0        
	//   16   27:invokeinterface #46  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   32:pop             
		parcel1.readException();
	//   18   33:aload_3         
	//   19   34:invokevirtual   #49  <Method void Parcel.readException()>
		parcel.recycle();
	//   20   37:aload_2         
	//   21   38:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel1.recycle();
	//   22   41:aload_3         
	//   23   42:invokevirtual   #52  <Method void Parcel.recycle()>
		return;
	//   24   45:return          
		Object obj;
		obj;
	//   25   46:astore          4
		break MISSING_BLOCK_LABEL_63;
	//   26   48:goto            63
		obj;
	//   27   51:astore          4
		throw new RuntimeException(((Throwable) (obj)));
	//   28   53:new             #54  <Class RuntimeException>
	//   29   56:dup             
	//   30   57:aload           4
	//   31   59:invokespecial   #57  <Method void RuntimeException(Throwable)>
	//   32   62:athrow          
		parcel.recycle();
	//   33   63:aload_2         
	//   34   64:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel1.recycle();
	//   35   67:aload_3         
	//   36   68:invokevirtual   #52  <Method void Parcel.recycle()>
		throw obj;
	//   37   71:aload           4
	//   38   73:athrow          
	}

	private static final String DESCRIPTOR = "com.google.android.gms.gcm.INetworkTaskCallback";
	private static final int TRANSACTION_TASK_FINISHED = 2;
	private final IBinder remote;
}
