// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.os.*;

// Referenced classes of package com.facebook.internal:
//			AttributionIdentifiers

private static final class AttributionIdentifiers$GoogleAdInfo
	implements IInterface
{

	public IBinder asBinder()
	{
		return binder;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field IBinder binder>
	//    2    4:areturn         
	}

	public String getAdvertiserId()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #36  <Method Parcel Parcel.obtain()>
	//    3    7:astore_2        
		String s;
		parcel.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
	//    4    8:aload_1         
	//    5    9:ldc1            #38  <String "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService">
	//    6   11:invokevirtual   #42  <Method void Parcel.writeInterfaceToken(String)>
		binder.transact(1, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #23  <Field IBinder binder>
	//    9   18:iconst_1        
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:iconst_0        
	//   13   22:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   27:pop             
		parcel1.readException();
	//   15   28:aload_2         
	//   16   29:invokevirtual   #51  <Method void Parcel.readException()>
		s = parcel1.readString();
	//   17   32:aload_2         
	//   18   33:invokevirtual   #54  <Method String Parcel.readString()>
	//   19   36:astore_3        
		parcel1.recycle();
	//   20   37:aload_2         
	//   21   38:invokevirtual   #57  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   41:aload_1         
	//   23   42:invokevirtual   #57  <Method void Parcel.recycle()>
		return s;
	//   24   45:aload_3         
	//   25   46:areturn         
		Exception exception;
		exception;
	//   26   47:astore_3        
		parcel1.recycle();
	//   27   48:aload_2         
	//   28   49:invokevirtual   #57  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   52:aload_1         
	//   30   53:invokevirtual   #57  <Method void Parcel.recycle()>
		throw exception;
	//   31   56:aload_3         
	//   32   57:athrow          
	}

	public boolean isTrackingLimited()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #36  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
	//    4    9:aload_3         
	//    5   10:ldc1            #38  <String "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService">
	//    6   12:invokevirtual   #42  <Method void Parcel.writeInterfaceToken(String)>
		boolean flag = true;
	//    7   15:iconst_1        
	//    8   16:istore_2        
		int i;
		parcel.writeInt(1);
	//    9   17:aload_3         
	//   10   18:iconst_1        
	//   11   19:invokevirtual   #64  <Method void Parcel.writeInt(int)>
		binder.transact(2, parcel, parcel1, 0);
	//   12   22:aload_0         
	//   13   23:getfield        #23  <Field IBinder binder>
	//   14   26:iconst_2        
	//   15   27:aload_3         
	//   16   28:aload           4
	//   17   30:iconst_0        
	//   18   31:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   19   36:pop             
		parcel1.readException();
	//   20   37:aload           4
	//   21   39:invokevirtual   #51  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   22   42:aload           4
	//   23   44:invokevirtual   #68  <Method int Parcel.readInt()>
	//   24   47:istore_1        
		if(i == 0)
	//*  25   48:iload_1         
	//*  26   49:ifeq            55
	//*  27   52:goto            57
			flag = false;
	//   28   55:iconst_0        
	//   29   56:istore_2        
		parcel1.recycle();
	//   30   57:aload           4
	//   31   59:invokevirtual   #57  <Method void Parcel.recycle()>
		parcel.recycle();
	//   32   62:aload_3         
	//   33   63:invokevirtual   #57  <Method void Parcel.recycle()>
		return flag;
	//   34   66:iload_2         
	//   35   67:ireturn         
		Exception exception;
		exception;
	//   36   68:astore          5
		parcel1.recycle();
	//   37   70:aload           4
	//   38   72:invokevirtual   #57  <Method void Parcel.recycle()>
		parcel.recycle();
	//   39   75:aload_3         
	//   40   76:invokevirtual   #57  <Method void Parcel.recycle()>
		throw exception;
	//   41   79:aload           5
	//   42   81:athrow          
	}

	private static final int FIRST_TRANSACTION_CODE = 1;
	private static final int SECOND_TRANSACTION_CODE = 2;
	private IBinder binder;

	AttributionIdentifiers$GoogleAdInfo(IBinder ibinder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		binder = ibinder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field IBinder binder>
	//    5    9:return          
	}
}
