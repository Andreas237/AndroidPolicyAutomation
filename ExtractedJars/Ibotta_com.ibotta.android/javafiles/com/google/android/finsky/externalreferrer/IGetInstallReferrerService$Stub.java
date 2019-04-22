// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.finsky.externalreferrer;

import android.os.*;

// Referenced classes of package com.google.android.finsky.externalreferrer:
//			IGetInstallReferrerService

public static abstract class IGetInstallReferrerService$Stub extends Binder
	implements IGetInstallReferrerService
{
	private static class Proxy
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


	public static IGetInstallReferrerService asInterface(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
	//    4    6:aload_0         
	//    5    7:ldc1            #14  <String "com.google.android.finsky.externalreferrer.IGetInstallReferrerService">
	//    6    9:invokeinterface #34  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof IGetInstallReferrerService))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class IGetInstallReferrerService>
	//*  12   23:ifeq            31
			return (IGetInstallReferrerService)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class IGetInstallReferrerService>
	//   15   30:areturn         
		else
			return ((IGetInstallReferrerService) (new Proxy(ibinder)));
	//   16   31:new             #9   <Class IGetInstallReferrerService$Stub$Proxy>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #37  <Method void IGetInstallReferrerService$Stub$Proxy(IBinder)>
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
				parcel1.writeString("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
	//   13   21:aload_3         
	//   14   22:ldc1            #14  <String "com.google.android.finsky.externalreferrer.IGetInstallReferrerService">
	//   15   24:invokevirtual   #52  <Method void Parcel.writeString(String)>
				return true;
	//   16   27:iconst_1        
	//   17   28:ireturn         
			}
		parcel.enforceInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
	//   18   29:aload_2         
	//   19   30:ldc1            #14  <String "com.google.android.finsky.externalreferrer.IGetInstallReferrerService">
	//   20   32:invokevirtual   #55  <Method void Parcel.enforceInterface(String)>
		if(parcel.readInt() != 0)
	//*  21   35:aload_2         
	//*  22   36:invokevirtual   #59  <Method int Parcel.readInt()>
	//*  23   39:ifeq            58
			parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
	//   24   42:getstatic       #65  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   25   45:aload_2         
	//   26   46:invokeinterface #71  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   27   51:checkcast       #61  <Class Bundle>
	//   28   54:astore_2        
		else
	//*  29   55:goto            60
			parcel = null;
	//   30   58:aconst_null     
	//   31   59:astore_2        
		parcel = ((Parcel) (getInstallReferrer(((Bundle) (parcel)))));
	//   32   60:aload_0         
	//   33   61:aload_2         
	//   34   62:invokevirtual   #75  <Method Bundle getInstallReferrer(Bundle)>
	//   35   65:astore_2        
		parcel1.writeNoException();
	//   36   66:aload_3         
	//   37   67:invokevirtual   #78  <Method void Parcel.writeNoException()>
		if(parcel != null)
	//*  38   70:aload_2         
	//*  39   71:ifnull          87
		{
			parcel1.writeInt(1);
	//   40   74:aload_3         
	//   41   75:iconst_1        
	//   42   76:invokevirtual   #82  <Method void Parcel.writeInt(int)>
			((Bundle) (parcel)).writeToParcel(parcel1, 1);
	//   43   79:aload_2         
	//   44   80:aload_3         
	//   45   81:iconst_1        
	//   46   82:invokevirtual   #86  <Method void Bundle.writeToParcel(Parcel, int)>
			return true;
	//   47   85:iconst_1        
	//   48   86:ireturn         
		} else
		{
			parcel1.writeInt(0);
	//   49   87:aload_3         
	//   50   88:iconst_0        
	//   51   89:invokevirtual   #82  <Method void Parcel.writeInt(int)>
			return true;
	//   52   92:iconst_1        
	//   53   93:ireturn         
		}
	}

	private static final String DESCRIPTOR = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";
	static final int TRANSACTION_getInstallReferrer = 1;

	public IGetInstallReferrerService$Stub()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Binder()>
		attachInterface(((android.os.IInterface) (this)), "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:ldc1            #14  <String "com.google.android.finsky.externalreferrer.IGetInstallReferrerService">
	//    5    8:invokevirtual   #25  <Method void attachInterface(android.os.IInterface, String)>
	//    6   11:return          
	}
}
