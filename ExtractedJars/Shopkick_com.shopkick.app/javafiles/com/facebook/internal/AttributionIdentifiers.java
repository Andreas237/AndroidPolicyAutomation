// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.*;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.*;
import android.util.Log;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.facebook.internal:
//			Utility

public class AttributionIdentifiers
{
	private static final class GoogleAdInfo
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

		GoogleAdInfo(IBinder ibinder)
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

	private static final class GoogleAdServiceConnection
		implements ServiceConnection
	{

		public IBinder getBinder()
			throws InterruptedException
		{
			if(!consumed.compareAndSet(true, true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #25  <Field AtomicBoolean consumed>
		//*   2    4:iconst_1        
		//*   3    5:iconst_1        
		//*   4    6:invokevirtual   #41  <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
		//*   5    9:ifne            25
				return (IBinder)queue.take();
		//    6   12:aload_0         
		//    7   13:getfield        #30  <Field BlockingQueue queue>
		//    8   16:invokeinterface #47  <Method Object BlockingQueue.take()>
		//    9   21:checkcast       #49  <Class IBinder>
		//   10   24:areturn         
			else
				throw new IllegalStateException("Binder already consumed");
		//   11   25:new             #51  <Class IllegalStateException>
		//   12   28:dup             
		//   13   29:ldc1            #53  <String "Binder already consumed">
		//   14   31:invokespecial   #56  <Method void IllegalStateException(String)>
		//   15   34:athrow          
		}

		public void onServiceConnected(ComponentName componentname, IBinder ibinder)
		{
			if(ibinder == null)
				break MISSING_BLOCK_LABEL_14;
		//    0    0:aload_2         
		//    1    1:ifnull          14
			queue.put(((Object) (ibinder)));
		//    2    4:aload_0         
		//    3    5:getfield        #30  <Field BlockingQueue queue>
		//    4    8:aload_2         
		//    5    9:invokeinterface #63  <Method void BlockingQueue.put(Object)>
			return;
		//    6   14:return          
			componentname;
		//    7   15:astore_1        
		//    8   16:return          
		}

		public void onServiceDisconnected(ComponentName componentname)
		{
		//    0    0:return          
		}

		private AtomicBoolean consumed;
		private final BlockingQueue queue;

		private GoogleAdServiceConnection()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			consumed = new AtomicBoolean(false);
		//    2    4:aload_0         
		//    3    5:new             #20  <Class AtomicBoolean>
		//    4    8:dup             
		//    5    9:iconst_0        
		//    6   10:invokespecial   #23  <Method void AtomicBoolean(boolean)>
		//    7   13:putfield        #25  <Field AtomicBoolean consumed>
			queue = ((BlockingQueue) (new LinkedBlockingDeque()));
		//    8   16:aload_0         
		//    9   17:new             #27  <Class LinkedBlockingDeque>
		//   10   20:dup             
		//   11   21:invokespecial   #28  <Method void LinkedBlockingDeque()>
		//   12   24:putfield        #30  <Field BlockingQueue queue>
		//   13   27:return          
		}

	}


	public AttributionIdentifiers()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void Object()>
	//    2    4:return          
	}

	private static AttributionIdentifiers cacheAndReturnIdentifiers(AttributionIdentifiers attributionidentifiers)
	{
		attributionidentifiers.fetchTime = System.currentTimeMillis();
	//    0    0:aload_0         
	//    1    1:invokestatic    #66  <Method long System.currentTimeMillis()>
	//    2    4:putfield        #68  <Field long fetchTime>
		recentlyFetchedIdentifiers = attributionidentifiers;
	//    3    7:aload_0         
	//    4    8:putstatic       #70  <Field AttributionIdentifiers recentlyFetchedIdentifiers>
		return attributionidentifiers;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	private static AttributionIdentifiers getAndroidId(Context context)
	{
		AttributionIdentifiers attributionidentifiers = getAndroidIdViaReflection(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #75  <Method AttributionIdentifiers getAndroidIdViaReflection(Context)>
	//    2    4:astore_2        
		Object obj = ((Object) (attributionidentifiers));
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(attributionidentifiers == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       30
		{
			context = ((Context) (getAndroidIdViaService(context)));
	//    7   11:aload_0         
	//    8   12:invokestatic    #78  <Method AttributionIdentifiers getAndroidIdViaService(Context)>
	//    9   15:astore_0        
			obj = ((Object) (context));
	//   10   16:aload_0         
	//   11   17:astore_1        
			if(context == null)
	//*  12   18:aload_0         
	//*  13   19:ifnonnull       30
				obj = ((Object) (new AttributionIdentifiers()));
	//   14   22:new             #2   <Class AttributionIdentifiers>
	//   15   25:dup             
	//   16   26:invokespecial   #79  <Method void AttributionIdentifiers()>
	//   17   29:astore_1        
		}
		return ((AttributionIdentifiers) (obj));
	//   18   30:aload_1         
	//   19   31:areturn         
	}

	private static AttributionIdentifiers getAndroidIdViaReflection(Context context)
	{
		Object obj;
		if(Looper.myLooper() == Looper.getMainLooper())
			break MISSING_BLOCK_LABEL_191;
	//    0    0:invokestatic    #87  <Method Looper Looper.myLooper()>
	//    1    3:invokestatic    #90  <Method Looper Looper.getMainLooper()>
	//    2    6:if_acmpeq       191
		obj = ((Object) (Utility.getMethodQuietly("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", new Class[] {
			android/content/Context
		})));
	//    3    9:ldc1            #92  <String "com.google.android.gms.common.GooglePlayServicesUtil">
	//    4   11:ldc1            #94  <String "isGooglePlayServicesAvailable">
	//    5   13:iconst_1        
	//    6   14:anewarray       Class[]
	//    7   17:dup             
	//    8   18:iconst_0        
	//    9   19:ldc1            #96  <Class Context>
	//   10   21:aastore         
	//   11   22:invokestatic    #102 <Method java.lang.reflect.Method Utility.getMethodQuietly(String, String, Class[])>
	//   12   25:astore_1        
		if(obj == null)
	//*  13   26:aload_1         
	//*  14   27:ifnonnull       32
			return null;
	//   15   30:aconst_null     
	//   16   31:areturn         
		obj = Utility.invokeMethodQuietly(((Object) (null)), ((java.lang.reflect.Method) (obj)), new Object[] {
			context
		});
	//   17   32:aconst_null     
	//   18   33:aload_1         
	//   19   34:iconst_1        
	//   20   35:anewarray       Object[]
	//   21   38:dup             
	//   22   39:iconst_0        
	//   23   40:aload_0         
	//   24   41:aastore         
	//   25   42:invokestatic    #106 <Method Object Utility.invokeMethodQuietly(Object, java.lang.reflect.Method, Object[])>
	//   26   45:astore_1        
		if(!(obj instanceof Integer))
			break MISSING_BLOCK_LABEL_212;
	//   27   46:aload_1         
	//   28   47:instanceof      #108 <Class Integer>
	//   29   50:ifeq            212
		if(((Integer)obj).intValue() != 0)
	//*  30   53:aload_1         
	//*  31   54:checkcast       #108 <Class Integer>
	//*  32   57:invokevirtual   #112 <Method int Integer.intValue()>
	//*  33   60:ifeq            65
			return null;
	//   34   63:aconst_null     
	//   35   64:areturn         
		obj = ((Object) (Utility.getMethodQuietly("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new Class[] {
			android/content/Context
		})));
	//   36   65:ldc1            #114 <String "com.google.android.gms.ads.identifier.AdvertisingIdClient">
	//   37   67:ldc1            #116 <String "getAdvertisingIdInfo">
	//   38   69:iconst_1        
	//   39   70:anewarray       Class[]
	//   40   73:dup             
	//   41   74:iconst_0        
	//   42   75:ldc1            #96  <Class Context>
	//   43   77:aastore         
	//   44   78:invokestatic    #102 <Method java.lang.reflect.Method Utility.getMethodQuietly(String, String, Class[])>
	//   45   81:astore_1        
		if(obj == null)
	//*  46   82:aload_1         
	//*  47   83:ifnonnull       88
			return null;
	//   48   86:aconst_null     
	//   49   87:areturn         
		context = ((Context) (Utility.invokeMethodQuietly(((Object) (null)), ((java.lang.reflect.Method) (obj)), new Object[] {
			context
		})));
	//   50   88:aconst_null     
	//   51   89:aload_1         
	//   52   90:iconst_1        
	//   53   91:anewarray       Object[]
	//   54   94:dup             
	//   55   95:iconst_0        
	//   56   96:aload_0         
	//   57   97:aastore         
	//   58   98:invokestatic    #106 <Method Object Utility.invokeMethodQuietly(Object, java.lang.reflect.Method, Object[])>
	//   59  101:astore_0        
		if(context == null)
	//*  60  102:aload_0         
	//*  61  103:ifnonnull       108
			return null;
	//   62  106:aconst_null     
	//   63  107:areturn         
		java.lang.reflect.Method method;
		obj = ((Object) (Utility.getMethodQuietly(((Object) (context)).getClass(), "getId", new Class[0])));
	//   64  108:aload_0         
	//   65  109:invokevirtual   #120 <Method Class Object.getClass()>
	//   66  112:ldc1            #122 <String "getId">
	//   67  114:iconst_0        
	//   68  115:anewarray       Class[]
	//   69  118:invokestatic    #125 <Method java.lang.reflect.Method Utility.getMethodQuietly(Class, String, Class[])>
	//   70  121:astore_1        
		method = Utility.getMethodQuietly(((Object) (context)).getClass(), "isLimitAdTrackingEnabled", new Class[0]);
	//   71  122:aload_0         
	//   72  123:invokevirtual   #120 <Method Class Object.getClass()>
	//   73  126:ldc1            #127 <String "isLimitAdTrackingEnabled">
	//   74  128:iconst_0        
	//   75  129:anewarray       Class[]
	//   76  132:invokestatic    #125 <Method java.lang.reflect.Method Utility.getMethodQuietly(Class, String, Class[])>
	//   77  135:astore_2        
		if(obj == null)
			break MISSING_BLOCK_LABEL_210;
	//   78  136:aload_1         
	//   79  137:ifnull          210
		if(method == null)
	//*  80  140:aload_2         
	//*  81  141:ifnonnull       146
			return null;
	//   82  144:aconst_null     
	//   83  145:areturn         
		AttributionIdentifiers attributionidentifiers;
		attributionidentifiers = new AttributionIdentifiers();
	//   84  146:new             #2   <Class AttributionIdentifiers>
	//   85  149:dup             
	//   86  150:invokespecial   #79  <Method void AttributionIdentifiers()>
	//   87  153:astore_3        
		attributionidentifiers.androidAdvertiserId = (String)Utility.invokeMethodQuietly(((Object) (context)), ((java.lang.reflect.Method) (obj)), new Object[0]);
	//   88  154:aload_3         
	//   89  155:aload_0         
	//   90  156:aload_1         
	//   91  157:iconst_0        
	//   92  158:anewarray       Object[]
	//   93  161:invokestatic    #106 <Method Object Utility.invokeMethodQuietly(Object, java.lang.reflect.Method, Object[])>
	//   94  164:checkcast       #129 <Class String>
	//   95  167:putfield        #131 <Field String androidAdvertiserId>
		attributionidentifiers.limitTracking = ((Boolean)Utility.invokeMethodQuietly(((Object) (context)), method, new Object[0])).booleanValue();
	//   96  170:aload_3         
	//   97  171:aload_0         
	//   98  172:aload_2         
	//   99  173:iconst_0        
	//  100  174:anewarray       Object[]
	//  101  177:invokestatic    #106 <Method Object Utility.invokeMethodQuietly(Object, java.lang.reflect.Method, Object[])>
	//  102  180:checkcast       #133 <Class Boolean>
	//  103  183:invokevirtual   #137 <Method boolean Boolean.booleanValue()>
	//  104  186:putfield        #139 <Field boolean limitTracking>
		return attributionidentifiers;
	//  105  189:aload_3         
	//  106  190:areturn         
		try
		{
			throw new FacebookException("getAndroidId cannot be called on the main thread.");
	//  107  191:new             #141 <Class FacebookException>
	//  108  194:dup             
	//  109  195:ldc1            #143 <String "getAndroidId cannot be called on the main thread.">
	//  110  197:invokespecial   #146 <Method void FacebookException(String)>
	//  111  200:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 112  201:astore_0        
		{
			Utility.logd("android_id", ((Exception) (context)));
	//  113  202:ldc1            #148 <String "android_id">
	//  114  204:aload_0         
	//  115  205:invokestatic    #152 <Method void Utility.logd(String, Exception)>
		}
		return null;
	//  116  208:aconst_null     
	//  117  209:areturn         
		return null;
	//  118  210:aconst_null     
	//  119  211:areturn         
		return null;
	//  120  212:aconst_null     
	//  121  213:areturn         
	}

	private static AttributionIdentifiers getAndroidIdViaService(Context context)
	{
		GoogleAdServiceConnection googleadserviceconnection;
		googleadserviceconnection = new GoogleAdServiceConnection();
	//    0    0:new             #11  <Class AttributionIdentifiers$GoogleAdServiceConnection>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #155 <Method void AttributionIdentifiers$GoogleAdServiceConnection(AttributionIdentifiers$1)>
	//    4    8:astore_1        
		Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
	//    5    9:new             #157 <Class Intent>
	//    6   12:dup             
	//    7   13:ldc1            #159 <String "com.google.android.gms.ads.identifier.service.START">
	//    8   15:invokespecial   #160 <Method void Intent(String)>
	//    9   18:astore_2        
		intent.setPackage("com.google.android.gms");
	//   10   19:aload_2         
	//   11   20:ldc1            #162 <String "com.google.android.gms">
	//   12   22:invokevirtual   #166 <Method Intent Intent.setPackage(String)>
	//   13   25:pop             
		if(!context.bindService(intent, ((ServiceConnection) (googleadserviceconnection)), 1))
			break MISSING_BLOCK_LABEL_104;
	//   14   26:aload_0         
	//   15   27:aload_2         
	//   16   28:aload_1         
	//   17   29:iconst_1        
	//   18   30:invokevirtual   #170 <Method boolean Context.bindService(Intent, ServiceConnection, int)>
	//   19   33:ifeq            104
		AttributionIdentifiers attributionidentifiers;
		GoogleAdInfo googleadinfo = new GoogleAdInfo(googleadserviceconnection.getBinder());
	//   20   36:new             #8   <Class AttributionIdentifiers$GoogleAdInfo>
	//   21   39:dup             
	//   22   40:aload_1         
	//   23   41:invokevirtual   #174 <Method IBinder AttributionIdentifiers$GoogleAdServiceConnection.getBinder()>
	//   24   44:invokespecial   #177 <Method void AttributionIdentifiers$GoogleAdInfo(IBinder)>
	//   25   47:astore_2        
		attributionidentifiers = new AttributionIdentifiers();
	//   26   48:new             #2   <Class AttributionIdentifiers>
	//   27   51:dup             
	//   28   52:invokespecial   #79  <Method void AttributionIdentifiers()>
	//   29   55:astore_3        
		attributionidentifiers.androidAdvertiserId = googleadinfo.getAdvertiserId();
	//   30   56:aload_3         
	//   31   57:aload_2         
	//   32   58:invokevirtual   #180 <Method String AttributionIdentifiers$GoogleAdInfo.getAdvertiserId()>
	//   33   61:putfield        #131 <Field String androidAdvertiserId>
		attributionidentifiers.limitTracking = googleadinfo.isTrackingLimited();
	//   34   64:aload_3         
	//   35   65:aload_2         
	//   36   66:invokevirtual   #183 <Method boolean AttributionIdentifiers$GoogleAdInfo.isTrackingLimited()>
	//   37   69:putfield        #139 <Field boolean limitTracking>
		context.unbindService(((ServiceConnection) (googleadserviceconnection)));
	//   38   72:aload_0         
	//   39   73:aload_1         
	//   40   74:invokevirtual   #187 <Method void Context.unbindService(ServiceConnection)>
		return attributionidentifiers;
	//   41   77:aload_3         
	//   42   78:areturn         
		Object obj;
		obj;
	//   43   79:astore_2        
		break MISSING_BLOCK_LABEL_97;
	//   44   80:goto            97
		obj;
	//   45   83:astore_2        
		Utility.logd("android_id", ((Exception) (obj)));
	//   46   84:ldc1            #148 <String "android_id">
	//   47   86:aload_2         
	//   48   87:invokestatic    #152 <Method void Utility.logd(String, Exception)>
		context.unbindService(((ServiceConnection) (googleadserviceconnection)));
	//   49   90:aload_0         
	//   50   91:aload_1         
	//   51   92:invokevirtual   #187 <Method void Context.unbindService(ServiceConnection)>
		return null;
	//   52   95:aconst_null     
	//   53   96:areturn         
		context.unbindService(((ServiceConnection) (googleadserviceconnection)));
	//   54   97:aload_0         
	//   55   98:aload_1         
	//   56   99:invokevirtual   #187 <Method void Context.unbindService(ServiceConnection)>
		throw obj;
	//   57  102:aload_2         
	//   58  103:athrow          
		return null;
	//   59  104:aconst_null     
	//   60  105:areturn         
	}

	public static AttributionIdentifiers getAttributionIdentifiers(Context context)
	{
		Object obj1;
		AttributionIdentifiers attributionidentifiers1;
		if(Looper.myLooper() == Looper.getMainLooper())
	//*   0    0:invokestatic    #87  <Method Looper Looper.myLooper()>
	//*   1    3:invokestatic    #90  <Method Looper Looper.getMainLooper()>
	//*   2    6:if_acmpne       18
			Log.e(TAG, "getAttributionIdentifiers should not be called from the main thread");
	//    3    9:getstatic       #54  <Field String TAG>
	//    4   12:ldc1            #190 <String "getAttributionIdentifiers should not be called from the main thread">
	//    5   14:invokestatic    #196 <Method int Log.e(String, String)>
	//    6   17:pop             
		if(recentlyFetchedIdentifiers != null)
	//*   7   18:getstatic       #70  <Field AttributionIdentifiers recentlyFetchedIdentifiers>
	//*   8   21:ifnull          52
		{
			long l = System.currentTimeMillis();
	//    9   24:invokestatic    #66  <Method long System.currentTimeMillis()>
	//   10   27:lstore          4
			AttributionIdentifiers attributionidentifiers = recentlyFetchedIdentifiers;
	//   11   29:getstatic       #70  <Field AttributionIdentifiers recentlyFetchedIdentifiers>
	//   12   32:astore          6
			if(l - attributionidentifiers.fetchTime < 0x36ee80L)
	//*  13   34:lload           4
	//*  14   36:aload           6
	//*  15   38:getfield        #68  <Field long fetchTime>
	//*  16   41:lsub            
	//*  17   42:ldc2w           #31  <Long 0x36ee80L>
	//*  18   45:lcmp            
	//*  19   46:ifge            52
				return attributionidentifiers;
	//   20   49:aload           6
	//   21   51:areturn         
		}
		attributionidentifiers1 = getAndroidId(context);
	//   22   52:aload_0         
	//   23   53:invokestatic    #198 <Method AttributionIdentifiers getAndroidId(Context)>
	//   24   56:astore          8
		obj1 = null;
	//   25   58:aconst_null     
	//   26   59:astore          7
		if(context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0) == null) goto _L2; else goto _L1
	//   27   61:aload_0         
	//   28   62:invokevirtual   #202 <Method PackageManager Context.getPackageManager()>
	//   29   65:ldc1            #22  <String "com.facebook.katana.provider.AttributionIdProvider">
	//   30   67:iconst_0        
	//   31   68:invokevirtual   #208 <Method android.content.pm.ProviderInfo PackageManager.resolveContentProvider(String, int)>
	//   32   71:ifnull          84
_L1:
		Object obj = ((Object) (Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider")));
	//   33   74:ldc1            #210 <String "content://com.facebook.katana.provider.AttributionIdProvider">
	//   34   76:invokestatic    #216 <Method Uri Uri.parse(String)>
	//   35   79:astore          6
		  goto _L3
	//*  36   81:goto            107
_L2:
		if(context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0) == null) goto _L5; else goto _L4
	//   37   84:aload_0         
	//   38   85:invokevirtual   #202 <Method PackageManager Context.getPackageManager()>
	//   39   88:ldc1            #25  <String "com.facebook.wakizashi.provider.AttributionIdProvider">
	//   40   90:iconst_0        
	//   41   91:invokevirtual   #208 <Method android.content.pm.ProviderInfo PackageManager.resolveContentProvider(String, int)>
	//   42   94:ifnull          395
_L4:
		obj = ((Object) (Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider")));
	//   43   97:ldc1            #218 <String "content://com.facebook.wakizashi.provider.AttributionIdProvider">
	//   44   99:invokestatic    #216 <Method Uri Uri.parse(String)>
	//   45  102:astore          6
	//*  46  104:goto            107
_L3:
		String s1 = getInstallerPackageName(context);
	//   47  107:aload_0         
	//   48  108:invokestatic    #222 <Method String getInstallerPackageName(Context)>
	//   49  111:astore          9
		if(s1 == null)
			break MISSING_BLOCK_LABEL_125;
	//   50  113:aload           9
	//   51  115:ifnull          125
		attributionidentifiers1.androidInstallerPackage = s1;
	//   52  118:aload           8
	//   53  120:aload           9
	//   54  122:putfield        #224 <Field String androidInstallerPackage>
		if(obj != null)
			break MISSING_BLOCK_LABEL_136;
	//   55  125:aload           6
	//   56  127:ifnonnull       136
		return cacheAndReturnIdentifiers(attributionidentifiers1);
	//   57  130:aload           8
	//   58  132:invokestatic    #226 <Method AttributionIdentifiers cacheAndReturnIdentifiers(AttributionIdentifiers)>
	//   59  135:areturn         
		context = ((Context) (context.getContentResolver().query(((Uri) (obj)), new String[] {
			"aid", "androidid", "limit_tracking"
		}, ((String) (null)), ((String []) (null)), ((String) (null)))));
	//   60  136:aload_0         
	//   61  137:invokevirtual   #230 <Method ContentResolver Context.getContentResolver()>
	//   62  140:aload           6
	//   63  142:iconst_3        
	//   64  143:anewarray       String[]
	//   65  146:dup             
	//   66  147:iconst_0        
	//   67  148:ldc1            #19  <String "aid">
	//   68  150:aastore         
	//   69  151:dup             
	//   70  152:iconst_1        
	//   71  153:ldc1            #16  <String "androidid">
	//   72  155:aastore         
	//   73  156:dup             
	//   74  157:iconst_2        
	//   75  158:ldc1            #35  <String "limit_tracking">
	//   76  160:aastore         
	//   77  161:aconst_null     
	//   78  162:aconst_null     
	//   79  163:aconst_null     
	//   80  164:invokevirtual   #236 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   81  167:astore_0        
		if(context == null)
			break MISSING_BLOCK_LABEL_282;
	//   82  168:aload_0         
	//   83  169:ifnull          282
		if(!((Cursor) (context)).moveToFirst())
	//*  84  172:aload_0         
	//*  85  173:invokeinterface #241 <Method boolean Cursor.moveToFirst()>
	//*  86  178:ifne            184
			break MISSING_BLOCK_LABEL_282;
	//   87  181:goto            282
		int j;
		int k;
		try
		{
			int i = ((Cursor) (context)).getColumnIndex("aid");
	//   88  184:aload_0         
	//   89  185:ldc1            #19  <String "aid">
	//   90  187:invokeinterface #245 <Method int Cursor.getColumnIndex(String)>
	//   91  192:istore_1        
			j = ((Cursor) (context)).getColumnIndex("androidid");
	//   92  193:aload_0         
	//   93  194:ldc1            #16  <String "androidid">
	//   94  196:invokeinterface #245 <Method int Cursor.getColumnIndex(String)>
	//   95  201:istore_2        
			k = ((Cursor) (context)).getColumnIndex("limit_tracking");
	//   96  202:aload_0         
	//   97  203:ldc1            #35  <String "limit_tracking">
	//   98  205:invokeinterface #245 <Method int Cursor.getColumnIndex(String)>
	//   99  210:istore_3        
			attributionidentifiers1.attributionId = ((Cursor) (context)).getString(i);
	//  100  211:aload           8
	//  101  213:aload_0         
	//  102  214:iload_1         
	//  103  215:invokeinterface #249 <Method String Cursor.getString(int)>
	//  104  220:putfield        #251 <Field String attributionId>
		}
	//* 105  223:iload_2         
	//* 106  224:ifle            266
	//* 107  227:iload_3         
	//* 108  228:ifle            266
	//* 109  231:aload           8
	//* 110  233:invokevirtual   #254 <Method String getAndroidAdvertiserId()>
	//* 111  236:ifnonnull       266
	//* 112  239:aload           8
	//* 113  241:aload_0         
	//* 114  242:iload_2         
	//* 115  243:invokeinterface #249 <Method String Cursor.getString(int)>
	//* 116  248:putfield        #131 <Field String androidAdvertiserId>
	//* 117  251:aload           8
	//* 118  253:aload_0         
	//* 119  254:iload_3         
	//* 120  255:invokeinterface #249 <Method String Cursor.getString(int)>
	//* 121  260:invokestatic    #258 <Method boolean Boolean.parseBoolean(String)>
	//* 122  263:putfield        #139 <Field boolean limitTracking>
	//* 123  266:aload_0         
	//* 124  267:ifnull          276
	//* 125  270:aload_0         
	//* 126  271:invokeinterface #261 <Method void Cursor.close()>
	//* 127  276:aload           8
	//* 128  278:invokestatic    #226 <Method AttributionIdentifiers cacheAndReturnIdentifiers(AttributionIdentifiers)>
	//* 129  281:areturn         
	//* 130  282:aload           8
	//* 131  284:invokestatic    #226 <Method AttributionIdentifiers cacheAndReturnIdentifiers(AttributionIdentifiers)>
	//* 132  287:astore          6
	//* 133  289:aload_0         
	//* 134  290:ifnull          299
	//* 135  293:aload_0         
	//* 136  294:invokeinterface #261 <Method void Cursor.close()>
	//* 137  299:aload           6
	//* 138  301:areturn         
	//* 139  302:astore          6
	//* 140  304:goto            382
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 141  307:astore          6
		{
			break MISSING_BLOCK_LABEL_324;
	//  142  309:goto            324
		}
		if(j <= 0 || k <= 0)
			break MISSING_BLOCK_LABEL_266;
		if(attributionidentifiers1.getAndroidAdvertiserId() == null)
		{
			attributionidentifiers1.androidAdvertiserId = ((Cursor) (context)).getString(j);
			attributionidentifiers1.limitTracking = Boolean.parseBoolean(((Cursor) (context)).getString(k));
		}
		if(context != null)
			((Cursor) (context)).close();
		return cacheAndReturnIdentifiers(attributionidentifiers1);
		obj = ((Object) (cacheAndReturnIdentifiers(attributionidentifiers1)));
		if(context != null)
			((Cursor) (context)).close();
		return ((AttributionIdentifiers) (obj));
		obj;
		break MISSING_BLOCK_LABEL_382;
		obj;
	//  143  312:astore          6
		context = ((Context) (obj1));
	//  144  314:aload           7
	//  145  316:astore_0        
		break MISSING_BLOCK_LABEL_382;
	//  146  317:goto            382
		obj;
	//  147  320:astore          6
		context = null;
	//  148  322:aconst_null     
	//  149  323:astore_0        
		String s = TAG;
	//  150  324:getstatic       #54  <Field String TAG>
	//  151  327:astore          7
		StringBuilder stringbuilder = new StringBuilder();
	//  152  329:new             #263 <Class StringBuilder>
	//  153  332:dup             
	//  154  333:invokespecial   #264 <Method void StringBuilder()>
	//  155  336:astore          8
		stringbuilder.append("Caught unexpected exception in getAttributionId(): ");
	//  156  338:aload           8
	//  157  340:ldc2            #266 <String "Caught unexpected exception in getAttributionId(): ">
	//  158  343:invokevirtual   #270 <Method StringBuilder StringBuilder.append(String)>
	//  159  346:pop             
		stringbuilder.append(((Exception) (obj)).toString());
	//  160  347:aload           8
	//  161  349:aload           6
	//  162  351:invokevirtual   #273 <Method String Exception.toString()>
	//  163  354:invokevirtual   #270 <Method StringBuilder StringBuilder.append(String)>
	//  164  357:pop             
		Utility.logd(s, stringbuilder.toString());
	//  165  358:aload           7
	//  166  360:aload           8
	//  167  362:invokevirtual   #274 <Method String StringBuilder.toString()>
	//  168  365:invokestatic    #277 <Method void Utility.logd(String, String)>
		if(context != null)
	//* 169  368:aload_0         
	//* 170  369:ifnull          378
			((Cursor) (context)).close();
	//  171  372:aload_0         
	//  172  373:invokeinterface #261 <Method void Cursor.close()>
		return null;
	//  173  378:aconst_null     
	//  174  379:areturn         
		obj;
	//  175  380:astore          6
		if(context != null)
	//* 176  382:aload_0         
	//* 177  383:ifnull          392
			((Cursor) (context)).close();
	//  178  386:aload_0         
	//  179  387:invokeinterface #261 <Method void Cursor.close()>
		throw obj;
	//  180  392:aload           6
	//  181  394:athrow          
_L5:
		obj = null;
	//  182  395:aconst_null     
	//  183  396:astore          6
		if(true) goto _L3; else goto _L6
	//  184  398:goto            107
_L6:
	}

	public static AttributionIdentifiers getCachedIdentifiers()
	{
		return recentlyFetchedIdentifiers;
	//    0    0:getstatic       #70  <Field AttributionIdentifiers recentlyFetchedIdentifiers>
	//    1    3:areturn         
	}

	private static String getInstallerPackageName(Context context)
	{
		PackageManager packagemanager = context.getPackageManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #202 <Method PackageManager Context.getPackageManager()>
	//    2    4:astore_1        
		if(packagemanager != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
			return packagemanager.getInstallerPackageName(context.getPackageName());
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #283 <Method String Context.getPackageName()>
	//    8   14:invokevirtual   #286 <Method String PackageManager.getInstallerPackageName(String)>
	//    9   17:areturn         
		else
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
	}

	public String getAndroidAdvertiserId()
	{
		if(FacebookSdk.isInitialized() && FacebookSdk.getAdvertiserIDCollectionEnabled())
	//*   0    0:invokestatic    #292 <Method boolean FacebookSdk.isInitialized()>
	//*   1    3:ifeq            17
	//*   2    6:invokestatic    #295 <Method boolean FacebookSdk.getAdvertiserIDCollectionEnabled()>
	//*   3    9:ifeq            17
			return androidAdvertiserId;
	//    4   12:aload_0         
	//    5   13:getfield        #131 <Field String androidAdvertiserId>
	//    6   16:areturn         
		else
			return null;
	//    7   17:aconst_null     
	//    8   18:areturn         
	}

	public String getAndroidInstallerPackage()
	{
		return androidInstallerPackage;
	//    0    0:aload_0         
	//    1    1:getfield        #224 <Field String androidInstallerPackage>
	//    2    4:areturn         
	}

	public String getAttributionId()
	{
		return attributionId;
	//    0    0:aload_0         
	//    1    1:getfield        #251 <Field String attributionId>
	//    2    4:areturn         
	}

	public boolean isTrackingLimited()
	{
		return limitTracking;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field boolean limitTracking>
	//    2    4:ireturn         
	}

	private static final String ANDROID_ID_COLUMN_NAME = "androidid";
	private static final String ATTRIBUTION_ID_COLUMN_NAME = "aid";
	private static final String ATTRIBUTION_ID_CONTENT_PROVIDER = "com.facebook.katana.provider.AttributionIdProvider";
	private static final String ATTRIBUTION_ID_CONTENT_PROVIDER_WAKIZASHI = "com.facebook.wakizashi.provider.AttributionIdProvider";
	private static final int CONNECTION_RESULT_SUCCESS = 0;
	private static final long IDENTIFIER_REFRESH_INTERVAL_MILLIS = 0x36ee80L;
	private static final String LIMIT_TRACKING_COLUMN_NAME = "limit_tracking";
	private static final String TAG = ((Class) (com/facebook/internal/AttributionIdentifiers)).getCanonicalName();
	private static AttributionIdentifiers recentlyFetchedIdentifiers;
	private String androidAdvertiserId;
	private String androidInstallerPackage;
	private String attributionId;
	private long fetchTime;
	private boolean limitTracking;

	static 
	{
	//    0    0:ldc1            #2   <Class AttributionIdentifiers>
	//    1    2:invokevirtual   #52  <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #54  <Field String TAG>
	//*   3    8:return          
	}
}
