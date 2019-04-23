// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import android.os.*;

// Referenced classes of package com.firebase.jobdispatcher:
//			IRemoteJobService, IJobCallback

private static class IRemoteJobService$Stub$Proxy
	implements IRemoteJobService
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
		return "com.firebase.jobdispatcher.IRemoteJobService";
	//    0    0:ldc1            #26  <String "com.firebase.jobdispatcher.IRemoteJobService">
	//    1    2:areturn         
	}

	public void start(Bundle bundle, IJobCallback ijobcallback)
		throws RemoteException
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel.writeInterfaceToken("com.firebase.jobdispatcher.IRemoteJobService");
	//    2    4:aload_3         
	//    3    5:ldc1            #26  <String "com.firebase.jobdispatcher.IRemoteJobService">
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
		if(ijobcallback == null) goto _L2; else goto _L1
	//   18   33:aload_2         
	//   19   34:ifnull          78
_L1:
		bundle = ((Bundle) (ijobcallback.asBinder()));
	//   20   37:aload_2         
	//   21   38:invokeinterface #54  <Method IBinder IJobCallback.asBinder()>
	//   22   43:astore_1        
	//*  23   44:goto            47
_L4:
		parcel.writeStrongBinder(((IBinder) (bundle)));
	//   24   47:aload_3         
	//   25   48:aload_1         
	//   26   49:invokevirtual   #57  <Method void Parcel.writeStrongBinder(IBinder)>
		mRemote.transact(1, parcel, ((Parcel) (null)), 1);
	//   27   52:aload_0         
	//   28   53:getfield        #19  <Field IBinder mRemote>
	//   29   56:iconst_1        
	//   30   57:aload_3         
	//   31   58:aconst_null     
	//   32   59:iconst_1        
	//   33   60:invokeinterface #63  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   34   65:pop             
		parcel.recycle();
	//   35   66:aload_3         
	//   36   67:invokevirtual   #66  <Method void Parcel.recycle()>
		return;
	//   37   70:return          
		bundle;
	//   38   71:astore_1        
		parcel.recycle();
	//   39   72:aload_3         
	//   40   73:invokevirtual   #66  <Method void Parcel.recycle()>
		throw bundle;
	//   41   76:aload_1         
	//   42   77:athrow          
_L2:
		bundle = null;
	//   43   78:aconst_null     
	//   44   79:astore_1        
		if(true) goto _L4; else goto _L3
	//   45   80:goto            47
_L3:
	}

	public void stop(Bundle bundle, boolean flag)
		throws RemoteException
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
	//    1    3:astore          4
		parcel.writeInterfaceToken("com.firebase.jobdispatcher.IRemoteJobService");
	//    2    5:aload           4
	//    3    7:ldc1            #26  <String "com.firebase.jobdispatcher.IRemoteJobService">
	//    4    9:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
		int i = 0;
	//    5   12:iconst_0        
	//    6   13:istore_3        
		if(bundle == null) goto _L2; else goto _L1
	//    7   14:aload_1         
	//    8   15:ifnull          34
_L1:
		parcel.writeInt(1);
	//    9   18:aload           4
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   12   24:aload_1         
	//   13   25:aload           4
	//   14   27:iconst_0        
	//   15   28:invokevirtual   #50  <Method void Bundle.writeToParcel(Parcel, int)>
		  goto _L3
	//*  16   31:goto            78
_L2:
		parcel.writeInt(0);
	//   17   34:aload           4
	//   18   36:iconst_0        
	//   19   37:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		  goto _L3
	//*  20   40:goto            78
_L5:
		parcel.writeInt(i);
	//   21   43:aload           4
	//   22   45:iload_3         
	//   23   46:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		mRemote.transact(2, parcel, ((Parcel) (null)), 1);
	//   24   49:aload_0         
	//   25   50:getfield        #19  <Field IBinder mRemote>
	//   26   53:iconst_2        
	//   27   54:aload           4
	//   28   56:aconst_null     
	//   29   57:iconst_1        
	//   30   58:invokeinterface #63  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   31   63:pop             
		parcel.recycle();
	//   32   64:aload           4
	//   33   66:invokevirtual   #66  <Method void Parcel.recycle()>
		return;
	//   34   69:return          
		bundle;
	//   35   70:astore_1        
		parcel.recycle();
	//   36   71:aload           4
	//   37   73:invokevirtual   #66  <Method void Parcel.recycle()>
		throw bundle;
	//   38   76:aload_1         
	//   39   77:athrow          
_L3:
		if(flag)
	//*  40   78:iload_2         
	//*  41   79:ifeq            43
			i = 1;
	//   42   82:iconst_1        
	//   43   83:istore_3        
		if(true) goto _L5; else goto _L4
	//   44   84:goto            43
_L4:
	}

	private IBinder mRemote;

	IRemoteJobService$Stub$Proxy(IBinder ibinder)
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
