// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.customtabs;

import android.os.*;

// Referenced classes of package android.support.customtabs:
//			IPostMessageService, ICustomTabsCallback

private static class IPostMessageService$Stub$Proxy
	implements IPostMessageService
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
		return "android.support.customtabs.IPostMessageService";
	//    0    0:ldc1            #26  <String "android.support.customtabs.IPostMessageService">
	//    1    2:areturn         
	}

	public void onMessageChannelReady(ICustomTabsCallback icustomtabscallback, Bundle bundle)
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
		parcel.writeInterfaceToken("android.support.customtabs.IPostMessageService");
	//    4    9:aload_3         
	//    5   10:ldc1            #26  <String "android.support.customtabs.IPostMessageService">
	//    6   12:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
		if(icustomtabscallback == null) goto _L2; else goto _L1
	//    7   15:aload_1         
	//    8   16:ifnull          99
_L1:
		icustomtabscallback = ((ICustomTabsCallback) (icustomtabscallback.asBinder()));
	//    9   19:aload_1         
	//   10   20:invokeinterface #44  <Method IBinder ICustomTabsCallback.asBinder()>
	//   11   25:astore_1        
	//*  12   26:goto            29
_L4:
		parcel.writeStrongBinder(((IBinder) (icustomtabscallback)));
	//   13   29:aload_3         
	//   14   30:aload_1         
	//   15   31:invokevirtual   #47  <Method void Parcel.writeStrongBinder(IBinder)>
		if(bundle == null)
			break MISSING_BLOCK_LABEL_52;
	//   16   34:aload_2         
	//   17   35:ifnull          52
		parcel.writeInt(1);
	//   18   38:aload_3         
	//   19   39:iconst_1        
	//   20   40:invokevirtual   #51  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   21   43:aload_2         
	//   22   44:aload_3         
	//   23   45:iconst_0        
	//   24   46:invokevirtual   #57  <Method void Bundle.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_57;
	//   25   49:goto            57
		parcel.writeInt(0);
	//   26   52:aload_3         
	//   27   53:iconst_0        
	//   28   54:invokevirtual   #51  <Method void Parcel.writeInt(int)>
		mRemote.transact(2, parcel, parcel1, 0);
	//   29   57:aload_0         
	//   30   58:getfield        #19  <Field IBinder mRemote>
	//   31   61:iconst_2        
	//   32   62:aload_3         
	//   33   63:aload           4
	//   34   65:iconst_0        
	//   35   66:invokeinterface #63  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   36   71:pop             
		parcel1.readException();
	//   37   72:aload           4
	//   38   74:invokevirtual   #66  <Method void Parcel.readException()>
		parcel1.recycle();
	//   39   77:aload           4
	//   40   79:invokevirtual   #69  <Method void Parcel.recycle()>
		parcel.recycle();
	//   41   82:aload_3         
	//   42   83:invokevirtual   #69  <Method void Parcel.recycle()>
		return;
	//   43   86:return          
		icustomtabscallback;
	//   44   87:astore_1        
		parcel1.recycle();
	//   45   88:aload           4
	//   46   90:invokevirtual   #69  <Method void Parcel.recycle()>
		parcel.recycle();
	//   47   93:aload_3         
	//   48   94:invokevirtual   #69  <Method void Parcel.recycle()>
		throw icustomtabscallback;
	//   49   97:aload_1         
	//   50   98:athrow          
_L2:
		icustomtabscallback = null;
	//   51   99:aconst_null     
	//   52  100:astore_1        
		if(true) goto _L4; else goto _L3
	//   53  101:goto            29
_L3:
	}

	public void onPostMessage(ICustomTabsCallback icustomtabscallback, String s, Bundle bundle)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
	//    1    3:astore          4
		parcel1 = Parcel.obtain();
	//    2    5:invokestatic    #36  <Method Parcel Parcel.obtain()>
	//    3    8:astore          5
		parcel.writeInterfaceToken("android.support.customtabs.IPostMessageService");
	//    4   10:aload           4
	//    5   12:ldc1            #26  <String "android.support.customtabs.IPostMessageService">
	//    6   14:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
		if(icustomtabscallback == null) goto _L2; else goto _L1
	//    7   17:aload_1         
	//    8   18:ifnull          114
_L1:
		icustomtabscallback = ((ICustomTabsCallback) (icustomtabscallback.asBinder()));
	//    9   21:aload_1         
	//   10   22:invokeinterface #44  <Method IBinder ICustomTabsCallback.asBinder()>
	//   11   27:astore_1        
	//*  12   28:goto            31
_L4:
		parcel.writeStrongBinder(((IBinder) (icustomtabscallback)));
	//   13   31:aload           4
	//   14   33:aload_1         
	//   15   34:invokevirtual   #47  <Method void Parcel.writeStrongBinder(IBinder)>
		parcel.writeString(s);
	//   16   37:aload           4
	//   17   39:aload_2         
	//   18   40:invokevirtual   #75  <Method void Parcel.writeString(String)>
		if(bundle == null)
			break MISSING_BLOCK_LABEL_63;
	//   19   43:aload_3         
	//   20   44:ifnull          63
		parcel.writeInt(1);
	//   21   47:aload           4
	//   22   49:iconst_1        
	//   23   50:invokevirtual   #51  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   24   53:aload_3         
	//   25   54:aload           4
	//   26   56:iconst_0        
	//   27   57:invokevirtual   #57  <Method void Bundle.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_69;
	//   28   60:goto            69
		parcel.writeInt(0);
	//   29   63:aload           4
	//   30   65:iconst_0        
	//   31   66:invokevirtual   #51  <Method void Parcel.writeInt(int)>
		mRemote.transact(3, parcel, parcel1, 0);
	//   32   69:aload_0         
	//   33   70:getfield        #19  <Field IBinder mRemote>
	//   34   73:iconst_3        
	//   35   74:aload           4
	//   36   76:aload           5
	//   37   78:iconst_0        
	//   38   79:invokeinterface #63  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   39   84:pop             
		parcel1.readException();
	//   40   85:aload           5
	//   41   87:invokevirtual   #66  <Method void Parcel.readException()>
		parcel1.recycle();
	//   42   90:aload           5
	//   43   92:invokevirtual   #69  <Method void Parcel.recycle()>
		parcel.recycle();
	//   44   95:aload           4
	//   45   97:invokevirtual   #69  <Method void Parcel.recycle()>
		return;
	//   46  100:return          
		icustomtabscallback;
	//   47  101:astore_1        
		parcel1.recycle();
	//   48  102:aload           5
	//   49  104:invokevirtual   #69  <Method void Parcel.recycle()>
		parcel.recycle();
	//   50  107:aload           4
	//   51  109:invokevirtual   #69  <Method void Parcel.recycle()>
		throw icustomtabscallback;
	//   52  112:aload_1         
	//   53  113:athrow          
_L2:
		icustomtabscallback = null;
	//   54  114:aconst_null     
	//   55  115:astore_1        
		if(true) goto _L4; else goto _L3
	//   56  116:goto            31
_L3:
	}

	private IBinder mRemote;

	IPostMessageService$Stub$Proxy(IBinder ibinder)
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
