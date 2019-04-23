// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import android.os.*;

// Referenced classes of package com.firebase.jobdispatcher:
//			IJobCallback

public static abstract class IJobCallback$Stub extends Binder
	implements IJobCallback
{
	private static class Proxy
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


	public static IJobCallback asInterface(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.firebase.jobdispatcher.IJobCallback");
	//    4    6:aload_0         
	//    5    7:ldc1            #14  <String "com.firebase.jobdispatcher.IJobCallback">
	//    6    9:invokeinterface #34  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof IJobCallback))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class IJobCallback>
	//*  12   23:ifeq            31
			return (IJobCallback)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class IJobCallback>
	//   15   30:areturn         
		else
			return ((IJobCallback) (new Proxy(ibinder)));
	//   16   31:new             #9   <Class IJobCallback$Stub$Proxy>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #37  <Method void IJobCallback$Stub$Proxy(IBinder)>
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
		if(i != 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpeq          29
			if(i != 0x5f4e5446)
	//*   3    5:iload_1         
	//*   4    6:ldc1            #44  <Int 0x5f4e5446>
	//*   5    8:icmpeq          21
			{
				return super.onTransact(i, parcel, parcel1, j);
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:aload_2         
	//    9   14:aload_3         
	//   10   15:iload           4
	//   11   17:invokespecial   #46  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//   12   20:ireturn         
			} else
			{
				parcel1.writeString("com.firebase.jobdispatcher.IJobCallback");
	//   13   21:aload_3         
	//   14   22:ldc1            #14  <String "com.firebase.jobdispatcher.IJobCallback">
	//   15   24:invokevirtual   #52  <Method void Parcel.writeString(String)>
				return true;
	//   16   27:iconst_1        
	//   17   28:ireturn         
			}
		parcel.enforceInterface("com.firebase.jobdispatcher.IJobCallback");
	//   18   29:aload_2         
	//   19   30:ldc1            #14  <String "com.firebase.jobdispatcher.IJobCallback">
	//   20   32:invokevirtual   #55  <Method void Parcel.enforceInterface(String)>
		if(parcel.readInt() != 0)
	//*  21   35:aload_2         
	//*  22   36:invokevirtual   #59  <Method int Parcel.readInt()>
	//*  23   39:ifeq            58
			parcel1 = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
	//   24   42:getstatic       #65  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   25   45:aload_2         
	//   26   46:invokeinterface #71  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   27   51:checkcast       #61  <Class Bundle>
	//   28   54:astore_3        
		else
	//*  29   55:goto            60
			parcel1 = null;
	//   30   58:aconst_null     
	//   31   59:astore_3        
		jobFinished(((Bundle) (parcel1)), parcel.readInt());
	//   32   60:aload_0         
	//   33   61:aload_3         
	//   34   62:aload_2         
	//   35   63:invokevirtual   #59  <Method int Parcel.readInt()>
	//   36   66:invokevirtual   #75  <Method void jobFinished(Bundle, int)>
		return true;
	//   37   69:iconst_1        
	//   38   70:ireturn         
	}

	private static final String DESCRIPTOR = "com.firebase.jobdispatcher.IJobCallback";
	static final int TRANSACTION_jobFinished = 1;

	public IJobCallback$Stub()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Binder()>
		attachInterface(((android.os.IInterface) (this)), "com.firebase.jobdispatcher.IJobCallback");
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:ldc1            #14  <String "com.firebase.jobdispatcher.IJobCallback">
	//    5    8:invokevirtual   #25  <Method void attachInterface(android.os.IInterface, String)>
	//    6   11:return          
	}
}
