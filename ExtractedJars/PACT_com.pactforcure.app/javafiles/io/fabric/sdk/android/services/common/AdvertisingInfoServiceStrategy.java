// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.common;

import android.content.*;
import android.content.pm.PackageManager;
import android.os.*;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

// Referenced classes of package io.fabric.sdk.android.services.common:
//			AdvertisingInfoStrategy, AdvertisingInfo

class AdvertisingInfoServiceStrategy
	implements AdvertisingInfoStrategy
{
	private static final class AdvertisingConnection
		implements ServiceConnection
	{

		public IBinder getBinder()
		{
			if(retrieved)
		//*   0    0:aload_0         
		//*   1    1:getfield        #23  <Field boolean retrieved>
		//*   2    4:ifeq            19
				Fabric.getLogger().e("Fabric", "getBinder already called");
		//    3    7:invokestatic    #43  <Method Logger Fabric.getLogger()>
		//    4   10:ldc1            #45  <String "Fabric">
		//    5   12:ldc1            #47  <String "getBinder already called">
		//    6   14:invokeinterface #53  <Method void Logger.e(String, String)>
			retrieved = true;
		//    7   19:aload_0         
		//    8   20:iconst_1        
		//    9   21:putfield        #23  <Field boolean retrieved>
			IBinder ibinder;
			try
			{
				ibinder = (IBinder)queue.poll(200L, TimeUnit.MILLISECONDS);
		//   10   24:aload_0         
		//   11   25:getfield        #30  <Field LinkedBlockingQueue queue>
		//   12   28:ldc2w           #54  <Long 200L>
		//   13   31:getstatic       #61  <Field TimeUnit TimeUnit.MILLISECONDS>
		//   14   34:invokevirtual   #65  <Method Object LinkedBlockingQueue.poll(long, TimeUnit)>
		//   15   37:checkcast       #67  <Class IBinder>
		//   16   40:astore_1        
			}
		//*  17   41:aload_1         
		//*  18   42:areturn         
			catch(InterruptedException interruptedexception)
		//*  19   43:astore_1        
			{
				return null;
		//   20   44:aconst_null     
		//   21   45:areturn         
			}
			return ibinder;
		}

		public void onServiceConnected(ComponentName componentname, IBinder ibinder)
		{
			try
			{
				queue.put(((Object) (ibinder)));
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field LinkedBlockingQueue queue>
		//    2    4:aload_2         
		//    3    5:invokevirtual   #73  <Method void LinkedBlockingQueue.put(Object)>
				return;
		//    4    8:return          
			}
			// Misplaced declaration of an exception variable
			catch(ComponentName componentname)
		//*   5    9:astore_1        
			{
				return;
		//    6   10:return          
			}
		}

		public void onServiceDisconnected(ComponentName componentname)
		{
			queue.clear();
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field LinkedBlockingQueue queue>
		//    2    4:invokevirtual   #78  <Method void LinkedBlockingQueue.clear()>
		//    3    7:return          
		}

		private static final int QUEUE_TIMEOUT_IN_MS = 200;
		private final LinkedBlockingQueue queue;
		private boolean retrieved;

		private AdvertisingConnection()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			retrieved = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #23  <Field boolean retrieved>
			queue = new LinkedBlockingQueue(1);
		//    5    9:aload_0         
		//    6   10:new             #25  <Class LinkedBlockingQueue>
		//    7   13:dup             
		//    8   14:iconst_1        
		//    9   15:invokespecial   #28  <Method void LinkedBlockingQueue(int)>
		//   10   18:putfield        #30  <Field LinkedBlockingQueue queue>
		//   11   21:return          
		}

	}

	private static final class AdvertisingInterface
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

		public AdvertisingInterface(IBinder ibinder)
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


	public AdvertisingInfoServiceStrategy(Context context1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		context = context1.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #37  <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #39  <Field Context context>
	//    6   12:return          
	}

	public AdvertisingInfo getAdvertisingInfo()
	{
		Object obj;
		if(Looper.myLooper() == Looper.getMainLooper())
	//*   0    0:invokestatic    #54  <Method Looper Looper.myLooper()>
	//*   1    3:invokestatic    #57  <Method Looper Looper.getMainLooper()>
	//*   2    6:if_acmpne       23
		{
			Fabric.getLogger().d("Fabric", "AdvertisingInfoServiceStrategy cannot be called on the main thread");
	//    3    9:invokestatic    #63  <Method Logger Fabric.getLogger()>
	//    4   12:ldc1            #65  <String "Fabric">
	//    5   14:ldc1            #67  <String "AdvertisingInfoServiceStrategy cannot be called on the main thread">
	//    6   16:invokeinterface #73  <Method void Logger.d(String, String)>
			return null;
	//    7   21:aconst_null     
	//    8   22:areturn         
		}
		boolean flag;
		Object obj1;
		try
		{
			context.getPackageManager().getPackageInfo("com.android.vending", 0);
	//    9   23:aload_0         
	//   10   24:getfield        #39  <Field Context context>
	//   11   27:invokevirtual   #77  <Method PackageManager Context.getPackageManager()>
	//   12   30:ldc1            #24  <String "com.android.vending">
	//   13   32:iconst_0        
	//   14   33:invokevirtual   #83  <Method android.content.pm.PackageInfo PackageManager.getPackageInfo(String, int)>
	//   15   36:pop             
		}
	//*  16   37:new             #10  <Class AdvertisingInfoServiceStrategy$AdvertisingConnection>
	//*  17   40:dup             
	//*  18   41:aconst_null     
	//*  19   42:invokespecial   #86  <Method void AdvertisingInfoServiceStrategy$AdvertisingConnection(AdvertisingInfoServiceStrategy$1)>
	//*  20   45:astore_2        
	//*  21   46:new             #88  <Class Intent>
	//*  22   49:dup             
	//*  23   50:ldc1            #18  <String "com.google.android.gms.ads.identifier.service.START">
	//*  24   52:invokespecial   #91  <Method void Intent(String)>
	//*  25   55:astore_3        
	//*  26   56:aload_3         
	//*  27   57:ldc1            #21  <String "com.google.android.gms">
	//*  28   59:invokevirtual   #95  <Method Intent Intent.setPackage(String)>
	//*  29   62:pop             
	//*  30   63:aload_0         
	//*  31   64:getfield        #39  <Field Context context>
	//*  32   67:aload_3         
	//*  33   68:aload_2         
	//*  34   69:iconst_1        
	//*  35   70:invokevirtual   #99  <Method boolean Context.bindService(Intent, ServiceConnection, int)>
	//*  36   73:istore_1        
	//*  37   74:iload_1         
	//*  38   75:ifeq            198
	//*  39   78:new             #13  <Class AdvertisingInfoServiceStrategy$AdvertisingInterface>
	//*  40   81:dup             
	//*  41   82:aload_2         
	//*  42   83:invokevirtual   #103 <Method IBinder AdvertisingInfoServiceStrategy$AdvertisingConnection.getBinder()>
	//*  43   86:invokespecial   #106 <Method void AdvertisingInfoServiceStrategy$AdvertisingInterface(IBinder)>
	//*  44   89:astore_3        
	//*  45   90:new             #108 <Class AdvertisingInfo>
	//*  46   93:dup             
	//*  47   94:aload_3         
	//*  48   95:invokevirtual   #112 <Method String AdvertisingInfoServiceStrategy$AdvertisingInterface.getId()>
	//*  49   98:aload_3         
	//*  50   99:invokevirtual   #116 <Method boolean AdvertisingInfoServiceStrategy$AdvertisingInterface.isLimitAdTrackingEnabled()>
	//*  51  102:invokespecial   #119 <Method void AdvertisingInfo(String, boolean)>
	//*  52  105:astore_3        
	//*  53  106:aload_0         
	//*  54  107:getfield        #39  <Field Context context>
	//*  55  110:aload_2         
	//*  56  111:invokevirtual   #123 <Method void Context.unbindService(ServiceConnection)>
	//*  57  114:aload_3         
	//*  58  115:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  59  116:astore_2        
		{
			Fabric.getLogger().d("Fabric", "Unable to find Google Play Services package name");
	//   60  117:invokestatic    #63  <Method Logger Fabric.getLogger()>
	//   61  120:ldc1            #65  <String "Fabric">
	//   62  122:ldc1            #125 <String "Unable to find Google Play Services package name">
	//   63  124:invokeinterface #73  <Method void Logger.d(String, String)>
			return null;
	//   64  129:aconst_null     
	//   65  130:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  66  131:astore_2        
		{
			Fabric.getLogger().d("Fabric", "Unable to determine if Google Play Services is available", ((Throwable) (obj)));
	//   67  132:invokestatic    #63  <Method Logger Fabric.getLogger()>
	//   68  135:ldc1            #65  <String "Fabric">
	//   69  137:ldc1            #127 <String "Unable to determine if Google Play Services is available">
	//   70  139:aload_2         
	//   71  140:invokeinterface #130 <Method void Logger.d(String, String, Throwable)>
			return null;
	//   72  145:aconst_null     
	//   73  146:areturn         
		}
		obj = ((Object) (new AdvertisingConnection()));
		obj1 = ((Object) (new Intent("com.google.android.gms.ads.identifier.service.START")));
		((Intent) (obj1)).setPackage("com.google.android.gms");
		Exception exception;
		try
		{
			flag = context.bindService(((Intent) (obj1)), ((ServiceConnection) (obj)), 1);
		}
	//*  74  147:astore_3        
	//*  75  148:invokestatic    #63  <Method Logger Fabric.getLogger()>
	//*  76  151:ldc1            #65  <String "Fabric">
	//*  77  153:ldc1            #132 <String "Exception in binding to Google Play Service to capture AdvertisingId">
	//*  78  155:aload_3         
	//*  79  156:invokeinterface #135 <Method void Logger.w(String, String, Throwable)>
	//*  80  161:aload_0         
	//*  81  162:getfield        #39  <Field Context context>
	//*  82  165:aload_2         
	//*  83  166:invokevirtual   #123 <Method void Context.unbindService(ServiceConnection)>
	//*  84  169:aconst_null     
	//*  85  170:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  86  171:astore_2        
		{
			Fabric.getLogger().d("Fabric", "Could not bind to Google Play Service to capture AdvertisingId", ((Throwable) (obj)));
	//   87  172:invokestatic    #63  <Method Logger Fabric.getLogger()>
	//   88  175:ldc1            #65  <String "Fabric">
	//   89  177:ldc1            #137 <String "Could not bind to Google Play Service to capture AdvertisingId">
	//   90  179:aload_2         
	//   91  180:invokeinterface #130 <Method void Logger.d(String, String, Throwable)>
			return null;
	//   92  185:aconst_null     
	//   93  186:areturn         
		}
		if(!flag)
			break MISSING_BLOCK_LABEL_198;
		obj1 = ((Object) (new AdvertisingInterface(((AdvertisingConnection) (obj)).getBinder())));
		obj1 = ((Object) (new AdvertisingInfo(((AdvertisingInterface) (obj1)).getId(), ((AdvertisingInterface) (obj1)).isLimitAdTrackingEnabled())));
		context.unbindService(((ServiceConnection) (obj)));
		return ((AdvertisingInfo) (obj1));
		exception;
		Fabric.getLogger().w("Fabric", "Exception in binding to Google Play Service to capture AdvertisingId", ((Throwable) (exception)));
		context.unbindService(((ServiceConnection) (obj)));
		return null;
		Exception exception1;
		exception1;
	//   94  187:astore_3        
		context.unbindService(((ServiceConnection) (obj)));
	//   95  188:aload_0         
	//   96  189:getfield        #39  <Field Context context>
	//   97  192:aload_2         
	//   98  193:invokevirtual   #123 <Method void Context.unbindService(ServiceConnection)>
		throw exception1;
	//   99  196:aload_3         
	//  100  197:athrow          
		Fabric.getLogger().d("Fabric", "Could not bind to Google Play Service to capture AdvertisingId");
	//  101  198:invokestatic    #63  <Method Logger Fabric.getLogger()>
	//  102  201:ldc1            #65  <String "Fabric">
	//  103  203:ldc1            #137 <String "Could not bind to Google Play Service to capture AdvertisingId">
	//  104  205:invokeinterface #73  <Method void Logger.d(String, String)>
		return null;
	//  105  210:aconst_null     
	//  106  211:areturn         
	}

	public static final String GOOGLE_PLAY_SERVICES_INTENT = "com.google.android.gms.ads.identifier.service.START";
	public static final String GOOGLE_PLAY_SERVICES_INTENT_PACKAGE_NAME = "com.google.android.gms";
	private static final String GOOGLE_PLAY_SERVICE_PACKAGE_NAME = "com.android.vending";
	private final Context context;
}
