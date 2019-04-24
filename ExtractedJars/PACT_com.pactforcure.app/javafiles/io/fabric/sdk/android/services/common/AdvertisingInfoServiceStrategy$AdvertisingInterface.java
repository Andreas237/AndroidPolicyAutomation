// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.common;

import android.os.*;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;

// Referenced classes of package io.fabric.sdk.android.services.common:
//			AdvertisingInfoServiceStrategy

private static final class AdvertisingInfoServiceStrategy$AdvertisingInterface
	implements IInterface
{

	public IBinder asBinder()
	{
		return binder;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field IBinder binder>
	//    2    4:areturn         
	}

	public String getId()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #44  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #44  <Method Parcel Parcel.obtain()>
	//    3    7:astore_2        
		String s;
		parcel.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
	//    4    8:aload_1         
	//    5    9:ldc1            #13  <String "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService">
	//    6   11:invokevirtual   #48  <Method void Parcel.writeInterfaceToken(String)>
		binder.transact(1, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #29  <Field IBinder binder>
	//    9   18:iconst_1        
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:iconst_0        
	//   13   22:invokeinterface #54  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   27:pop             
		parcel1.readException();
	//   15   28:aload_2         
	//   16   29:invokevirtual   #57  <Method void Parcel.readException()>
		s = parcel1.readString();
	//   17   32:aload_2         
	//   18   33:invokevirtual   #60  <Method String Parcel.readString()>
	//   19   36:astore_3        
		parcel1.recycle();
	//   20   37:aload_2         
	//   21   38:invokevirtual   #63  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   41:aload_1         
	//   23   42:invokevirtual   #63  <Method void Parcel.recycle()>
		return s;
	//   24   45:aload_3         
	//   25   46:areturn         
		Object obj;
		obj;
	//   26   47:astore_3        
		Fabric.getLogger().d("Fabric", "Could not get parcel from Google Play Service to capture AdvertisingId");
	//   27   48:invokestatic    #69  <Method Logger Fabric.getLogger()>
	//   28   51:ldc1            #71  <String "Fabric">
	//   29   53:ldc1            #73  <String "Could not get parcel from Google Play Service to capture AdvertisingId">
	//   30   55:invokeinterface #79  <Method void Logger.d(String, String)>
		parcel1.recycle();
	//   31   60:aload_2         
	//   32   61:invokevirtual   #63  <Method void Parcel.recycle()>
		parcel.recycle();
	//   33   64:aload_1         
	//   34   65:invokevirtual   #63  <Method void Parcel.recycle()>
		return null;
	//   35   68:aconst_null     
	//   36   69:areturn         
		obj;
	//   37   70:astore_3        
		parcel1.recycle();
	//   38   71:aload_2         
	//   39   72:invokevirtual   #63  <Method void Parcel.recycle()>
		parcel.recycle();
	//   40   75:aload_1         
	//   41   76:invokevirtual   #63  <Method void Parcel.recycle()>
		throw obj;
	//   42   79:aload_3         
	//   43   80:athrow          
	}

	public boolean isLimitAdTrackingEnabled()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #44  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #44  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		int i;
		parcel.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
	//    4    9:aload_3         
	//    5   10:ldc1            #13  <String "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService">
	//    6   12:invokevirtual   #48  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(1);
	//    7   15:aload_3         
	//    8   16:iconst_1        
	//    9   17:invokevirtual   #86  <Method void Parcel.writeInt(int)>
		binder.transact(2, parcel, parcel1, 0);
	//   10   20:aload_0         
	//   11   21:getfield        #29  <Field IBinder binder>
	//   12   24:iconst_2        
	//   13   25:aload_3         
	//   14   26:aload           4
	//   15   28:iconst_0        
	//   16   29:invokeinterface #54  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   34:pop             
		parcel1.readException();
	//   18   35:aload           4
	//   19   37:invokevirtual   #57  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   20   40:aload           4
	//   21   42:invokevirtual   #90  <Method int Parcel.readInt()>
	//   22   45:istore_1        
		boolean flag;
		if(i != 0)
	//*  23   46:iload_1         
	//*  24   47:ifeq            63
			flag = true;
	//   25   50:iconst_1        
	//   26   51:istore_2        
		else
	//*  27   52:aload           4
	//*  28   54:invokevirtual   #63  <Method void Parcel.recycle()>
	//*  29   57:aload_3         
	//*  30   58:invokevirtual   #63  <Method void Parcel.recycle()>
	//*  31   61:iload_2         
	//*  32   62:ireturn         
			flag = false;
	//   33   63:iconst_0        
	//   34   64:istore_2        
		parcel1.recycle();
		parcel.recycle();
		return flag;
	//*  35   65:goto            52
		Object obj;
		obj;
	//   36   68:astore          5
		Fabric.getLogger().d("Fabric", "Could not get parcel from Google Play Service to capture Advertising limitAdTracking");
	//   37   70:invokestatic    #69  <Method Logger Fabric.getLogger()>
	//   38   73:ldc1            #71  <String "Fabric">
	//   39   75:ldc1            #92  <String "Could not get parcel from Google Play Service to capture Advertising limitAdTracking">
	//   40   77:invokeinterface #79  <Method void Logger.d(String, String)>
		parcel1.recycle();
	//   41   82:aload           4
	//   42   84:invokevirtual   #63  <Method void Parcel.recycle()>
		parcel.recycle();
	//   43   87:aload_3         
	//   44   88:invokevirtual   #63  <Method void Parcel.recycle()>
		return false;
	//   45   91:iconst_0        
	//   46   92:ireturn         
		obj;
	//   47   93:astore          5
		parcel1.recycle();
	//   48   95:aload           4
	//   49   97:invokevirtual   #63  <Method void Parcel.recycle()>
		parcel.recycle();
	//   50  100:aload_3         
	//   51  101:invokevirtual   #63  <Method void Parcel.recycle()>
		throw obj;
	//   52  104:aload           5
	//   53  106:athrow          
	}

	public static final String ADVERTISING_ID_SERVICE_INTERFACE_TOKEN = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
	private static final int AD_TRANSACTION_CODE_ID = 1;
	private static final int AD_TRANSACTION_CODE_LIMIT_AD_TRACKING = 2;
	private static final int FLAGS_NONE = 0;
	private final IBinder binder;

	public AdvertisingInfoServiceStrategy$AdvertisingInterface(IBinder ibinder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		binder = ibinder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #29  <Field IBinder binder>
	//    5    9:return          
	}
}
