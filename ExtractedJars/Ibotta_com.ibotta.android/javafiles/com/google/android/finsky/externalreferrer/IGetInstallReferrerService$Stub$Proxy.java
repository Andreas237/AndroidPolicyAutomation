// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.finsky.externalreferrer;

import android.os.*;

// Referenced classes of package com.google.android.finsky.externalreferrer:
//			IGetInstallReferrerService

private static class IGetInstallReferrerService$Stub$Proxy
	implements IGetInstallReferrerService
{

	public IBinder asBinder()
	{
		return mRemote;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field IBinder mRemote>
	//    2    4:areturn         
	}

	public Bundle getInstallReferrer(Bundle bundle)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
	//    4    8:aload_2         
	//    5    9:ldc1            #34  <String "com.google.android.finsky.externalreferrer.IGetInstallReferrerService">
	//    6   11:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
		if(bundle == null)
			break MISSING_BLOCK_LABEL_32;
	//    7   14:aload_1         
	//    8   15:ifnull          32
		parcel.writeInt(1);
	//    9   18:aload_2         
	//   10   19:iconst_1        
	//   11   20:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #48  <Method void Bundle.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_37;
	//   16   29:goto            37
		parcel.writeInt(0);
	//   17   32:aload_2         
	//   18   33:iconst_0        
	//   19   34:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		mRemote.transact(1, parcel, parcel1, 0);
	//   20   37:aload_0         
	//   21   38:getfield        #19  <Field IBinder mRemote>
	//   22   41:iconst_1        
	//   23   42:aload_2         
	//   24   43:aload_3         
	//   25   44:iconst_0        
	//   26   45:invokeinterface #54  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   27   50:pop             
		parcel1.readException();
	//   28   51:aload_3         
	//   29   52:invokevirtual   #57  <Method void Parcel.readException()>
		if(parcel1.readInt() != 0)
	//*  30   55:aload_3         
	//*  31   56:invokevirtual   #61  <Method int Parcel.readInt()>
	//*  32   59:ifeq            78
		{
			bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
	//   33   62:getstatic       #65  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   34   65:aload_3         
	//   35   66:invokeinterface #71  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   36   71:checkcast       #44  <Class Bundle>
	//   37   74:astore_1        
			break MISSING_BLOCK_LABEL_80;
	//   38   75:goto            80
		}
		bundle = null;
	//   39   78:aconst_null     
	//   40   79:astore_1        
		parcel1.recycle();
	//   41   80:aload_3         
	//   42   81:invokevirtual   #74  <Method void Parcel.recycle()>
		parcel.recycle();
	//   43   84:aload_2         
	//   44   85:invokevirtual   #74  <Method void Parcel.recycle()>
		return bundle;
	//   45   88:aload_1         
	//   46   89:areturn         
		bundle;
	//   47   90:astore_1        
		parcel1.recycle();
	//   48   91:aload_3         
	//   49   92:invokevirtual   #74  <Method void Parcel.recycle()>
		parcel.recycle();
	//   50   95:aload_2         
	//   51   96:invokevirtual   #74  <Method void Parcel.recycle()>
		throw bundle;
	//   52   99:aload_1         
	//   53  100:athrow          
	}

	public String getInterfaceDescriptor()
	{
		return "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";
	//    0    0:ldc1            #34  <String "com.google.android.finsky.externalreferrer.IGetInstallReferrerService">
	//    1    2:areturn         
	}

	private IBinder mRemote;

	IGetInstallReferrerService$Stub$Proxy(IBinder ibinder)
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
