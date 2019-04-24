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
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #75  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #77  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #81  <Method void Runtime(String)>
	//    4    9:athrow          
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
