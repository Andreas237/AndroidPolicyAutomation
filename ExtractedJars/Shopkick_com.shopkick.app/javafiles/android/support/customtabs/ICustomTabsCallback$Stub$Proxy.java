// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.customtabs;

import android.net.Uri;
import android.os.*;

// Referenced classes of package android.support.customtabs:
//			ICustomTabsCallback

private static class ICustomTabsCallback$Stub$Proxy
	implements ICustomTabsCallback
{

	public IBinder asBinder()
	{
		return mRemote;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field IBinder mRemote>
	//    2    4:areturn         
	}

	public void extraCallback(String s, Bundle bundle)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
	//    4    9:aload_3         
	//    5   10:ldc1            #34  <String "android.support.customtabs.ICustomTabsCallback">
	//    6   12:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   15:aload_3         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #41  <Method void Parcel.writeString(String)>
		if(bundle == null)
			break MISSING_BLOCK_LABEL_38;
	//   10   20:aload_2         
	//   11   21:ifnull          38
		parcel.writeInt(1);
	//   12   24:aload_3         
	//   13   25:iconst_1        
	//   14   26:invokevirtual   #45  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   15   29:aload_2         
	//   16   30:aload_3         
	//   17   31:iconst_0        
	//   18   32:invokevirtual   #51  <Method void Bundle.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_43;
	//   19   35:goto            43
		parcel.writeInt(0);
	//   20   38:aload_3         
	//   21   39:iconst_0        
	//   22   40:invokevirtual   #45  <Method void Parcel.writeInt(int)>
		mRemote.transact(3, parcel, parcel1, 0);
	//   23   43:aload_0         
	//   24   44:getfield        #19  <Field IBinder mRemote>
	//   25   47:iconst_3        
	//   26   48:aload_3         
	//   27   49:aload           4
	//   28   51:iconst_0        
	//   29   52:invokeinterface #57  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   30   57:pop             
		parcel1.readException();
	//   31   58:aload           4
	//   32   60:invokevirtual   #60  <Method void Parcel.readException()>
		parcel1.recycle();
	//   33   63:aload           4
	//   34   65:invokevirtual   #63  <Method void Parcel.recycle()>
		parcel.recycle();
	//   35   68:aload_3         
	//   36   69:invokevirtual   #63  <Method void Parcel.recycle()>
		return;
	//   37   72:return          
		s;
	//   38   73:astore_1        
		parcel1.recycle();
	//   39   74:aload           4
	//   40   76:invokevirtual   #63  <Method void Parcel.recycle()>
		parcel.recycle();
	//   41   79:aload_3         
	//   42   80:invokevirtual   #63  <Method void Parcel.recycle()>
		throw s;
	//   43   83:aload_1         
	//   44   84:athrow          
	}

	public String getInterfaceDescriptor()
	{
		return "android.support.customtabs.ICustomTabsCallback";
	//    0    0:ldc1            #34  <String "android.support.customtabs.ICustomTabsCallback">
	//    1    2:areturn         
	}

	public void onMessageChannelReady(Bundle bundle)
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
		parcel.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
	//    4    8:aload_2         
	//    5    9:ldc1            #34  <String "android.support.customtabs.ICustomTabsCallback">
	//    6   11:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
		if(bundle == null)
			break MISSING_BLOCK_LABEL_32;
	//    7   14:aload_1         
	//    8   15:ifnull          32
		parcel.writeInt(1);
	//    9   18:aload_2         
	//   10   19:iconst_1        
	//   11   20:invokevirtual   #45  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #51  <Method void Bundle.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_37;
	//   16   29:goto            37
		parcel.writeInt(0);
	//   17   32:aload_2         
	//   18   33:iconst_0        
	//   19   34:invokevirtual   #45  <Method void Parcel.writeInt(int)>
		mRemote.transact(4, parcel, parcel1, 0);
	//   20   37:aload_0         
	//   21   38:getfield        #19  <Field IBinder mRemote>
	//   22   41:iconst_4        
	//   23   42:aload_2         
	//   24   43:aload_3         
	//   25   44:iconst_0        
	//   26   45:invokeinterface #57  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   27   50:pop             
		parcel1.readException();
	//   28   51:aload_3         
	//   29   52:invokevirtual   #60  <Method void Parcel.readException()>
		parcel1.recycle();
	//   30   55:aload_3         
	//   31   56:invokevirtual   #63  <Method void Parcel.recycle()>
		parcel.recycle();
	//   32   59:aload_2         
	//   33   60:invokevirtual   #63  <Method void Parcel.recycle()>
		return;
	//   34   63:return          
		bundle;
	//   35   64:astore_1        
		parcel1.recycle();
	//   36   65:aload_3         
	//   37   66:invokevirtual   #63  <Method void Parcel.recycle()>
		parcel.recycle();
	//   38   69:aload_2         
	//   39   70:invokevirtual   #63  <Method void Parcel.recycle()>
		throw bundle;
	//   40   73:aload_1         
	//   41   74:athrow          
	}

	public void onNavigationEvent(int i, Bundle bundle)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
	//    4    9:aload_3         
	//    5   10:ldc1            #34  <String "android.support.customtabs.ICustomTabsCallback">
	//    6   12:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   15:aload_3         
	//    8   16:iload_1         
	//    9   17:invokevirtual   #45  <Method void Parcel.writeInt(int)>
		if(bundle == null)
			break MISSING_BLOCK_LABEL_38;
	//   10   20:aload_2         
	//   11   21:ifnull          38
		parcel.writeInt(1);
	//   12   24:aload_3         
	//   13   25:iconst_1        
	//   14   26:invokevirtual   #45  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   15   29:aload_2         
	//   16   30:aload_3         
	//   17   31:iconst_0        
	//   18   32:invokevirtual   #51  <Method void Bundle.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_43;
	//   19   35:goto            43
		parcel.writeInt(0);
	//   20   38:aload_3         
	//   21   39:iconst_0        
	//   22   40:invokevirtual   #45  <Method void Parcel.writeInt(int)>
		mRemote.transact(2, parcel, parcel1, 0);
	//   23   43:aload_0         
	//   24   44:getfield        #19  <Field IBinder mRemote>
	//   25   47:iconst_2        
	//   26   48:aload_3         
	//   27   49:aload           4
	//   28   51:iconst_0        
	//   29   52:invokeinterface #57  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   30   57:pop             
		parcel1.readException();
	//   31   58:aload           4
	//   32   60:invokevirtual   #60  <Method void Parcel.readException()>
		parcel1.recycle();
	//   33   63:aload           4
	//   34   65:invokevirtual   #63  <Method void Parcel.recycle()>
		parcel.recycle();
	//   35   68:aload_3         
	//   36   69:invokevirtual   #63  <Method void Parcel.recycle()>
		return;
	//   37   72:return          
		bundle;
	//   38   73:astore_2        
		parcel1.recycle();
	//   39   74:aload           4
	//   40   76:invokevirtual   #63  <Method void Parcel.recycle()>
		parcel.recycle();
	//   41   79:aload_3         
	//   42   80:invokevirtual   #63  <Method void Parcel.recycle()>
		throw bundle;
	//   43   83:aload_2         
	//   44   84:athrow          
	}

	public void onPostMessage(String s, Bundle bundle)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
	//    4    9:aload_3         
	//    5   10:ldc1            #34  <String "android.support.customtabs.ICustomTabsCallback">
	//    6   12:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   15:aload_3         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #41  <Method void Parcel.writeString(String)>
		if(bundle == null)
			break MISSING_BLOCK_LABEL_38;
	//   10   20:aload_2         
	//   11   21:ifnull          38
		parcel.writeInt(1);
	//   12   24:aload_3         
	//   13   25:iconst_1        
	//   14   26:invokevirtual   #45  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   15   29:aload_2         
	//   16   30:aload_3         
	//   17   31:iconst_0        
	//   18   32:invokevirtual   #51  <Method void Bundle.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_43;
	//   19   35:goto            43
		parcel.writeInt(0);
	//   20   38:aload_3         
	//   21   39:iconst_0        
	//   22   40:invokevirtual   #45  <Method void Parcel.writeInt(int)>
		mRemote.transact(5, parcel, parcel1, 0);
	//   23   43:aload_0         
	//   24   44:getfield        #19  <Field IBinder mRemote>
	//   25   47:iconst_5        
	//   26   48:aload_3         
	//   27   49:aload           4
	//   28   51:iconst_0        
	//   29   52:invokeinterface #57  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   30   57:pop             
		parcel1.readException();
	//   31   58:aload           4
	//   32   60:invokevirtual   #60  <Method void Parcel.readException()>
		parcel1.recycle();
	//   33   63:aload           4
	//   34   65:invokevirtual   #63  <Method void Parcel.recycle()>
		parcel.recycle();
	//   35   68:aload_3         
	//   36   69:invokevirtual   #63  <Method void Parcel.recycle()>
		return;
	//   37   72:return          
		s;
	//   38   73:astore_1        
		parcel1.recycle();
	//   39   74:aload           4
	//   40   76:invokevirtual   #63  <Method void Parcel.recycle()>
		parcel.recycle();
	//   41   79:aload_3         
	//   42   80:invokevirtual   #63  <Method void Parcel.recycle()>
		throw s;
	//   43   83:aload_1         
	//   44   84:athrow          
	}

	public void onRelationshipValidationResult(int i, Uri uri, boolean flag, Bundle bundle)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    1    3:astore          5
		parcel1 = Parcel.obtain();
	//    2    5:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    3    8:astore          6
		parcel.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
	//    4   10:aload           5
	//    5   12:ldc1            #34  <String "android.support.customtabs.ICustomTabsCallback">
	//    6   14:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   17:aload           5
	//    8   19:iload_1         
	//    9   20:invokevirtual   #45  <Method void Parcel.writeInt(int)>
		if(uri == null) goto _L2; else goto _L1
	//   10   23:aload_2         
	//   11   24:ifnull          43
_L1:
		parcel.writeInt(1);
	//   12   27:aload           5
	//   13   29:iconst_1        
	//   14   30:invokevirtual   #45  <Method void Parcel.writeInt(int)>
		uri.writeToParcel(parcel, 0);
	//   15   33:aload_2         
	//   16   34:aload           5
	//   17   36:iconst_0        
	//   18   37:invokevirtual   #76  <Method void Uri.writeToParcel(Parcel, int)>
		  goto _L3
	//*  19   40:goto            132
_L2:
		parcel.writeInt(0);
	//   20   43:aload           5
	//   21   45:iconst_0        
	//   22   46:invokevirtual   #45  <Method void Parcel.writeInt(int)>
		  goto _L3
	//*  23   49:goto            132
_L5:
		parcel.writeInt(i);
	//   24   52:aload           5
	//   25   54:iload_1         
	//   26   55:invokevirtual   #45  <Method void Parcel.writeInt(int)>
		if(bundle == null)
			break MISSING_BLOCK_LABEL_80;
	//   27   58:aload           4
	//   28   60:ifnull          80
		parcel.writeInt(1);
	//   29   63:aload           5
	//   30   65:iconst_1        
	//   31   66:invokevirtual   #45  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   32   69:aload           4
	//   33   71:aload           5
	//   34   73:iconst_0        
	//   35   74:invokevirtual   #51  <Method void Bundle.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_86;
	//   36   77:goto            86
		parcel.writeInt(0);
	//   37   80:aload           5
	//   38   82:iconst_0        
	//   39   83:invokevirtual   #45  <Method void Parcel.writeInt(int)>
		mRemote.transact(6, parcel, parcel1, 0);
	//   40   86:aload_0         
	//   41   87:getfield        #19  <Field IBinder mRemote>
	//   42   90:bipush          6
	//   43   92:aload           5
	//   44   94:aload           6
	//   45   96:iconst_0        
	//   46   97:invokeinterface #57  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   47  102:pop             
		parcel1.readException();
	//   48  103:aload           6
	//   49  105:invokevirtual   #60  <Method void Parcel.readException()>
		parcel1.recycle();
	//   50  108:aload           6
	//   51  110:invokevirtual   #63  <Method void Parcel.recycle()>
		parcel.recycle();
	//   52  113:aload           5
	//   53  115:invokevirtual   #63  <Method void Parcel.recycle()>
		return;
	//   54  118:return          
		uri;
	//   55  119:astore_2        
		parcel1.recycle();
	//   56  120:aload           6
	//   57  122:invokevirtual   #63  <Method void Parcel.recycle()>
		parcel.recycle();
	//   58  125:aload           5
	//   59  127:invokevirtual   #63  <Method void Parcel.recycle()>
		throw uri;
	//   60  130:aload_2         
	//   61  131:athrow          
_L3:
		if(flag)
	//*  62  132:iload_3         
	//*  63  133:ifeq            141
			i = 1;
	//   64  136:iconst_1        
	//   65  137:istore_1        
		else
	//*  66  138:goto            52
			i = 0;
	//   67  141:iconst_0        
	//   68  142:istore_1        
		if(true) goto _L5; else goto _L4
	//   69  143:goto            52
_L4:
	}

	private IBinder mRemote;

	ICustomTabsCallback$Stub$Proxy(IBinder ibinder)
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
