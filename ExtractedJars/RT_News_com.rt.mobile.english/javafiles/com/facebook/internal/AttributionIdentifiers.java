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
			if(consumed.compareAndSet(true, true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #25  <Field AtomicBoolean consumed>
		//*   2    4:iconst_1        
		//*   3    5:iconst_1        
		//*   4    6:invokevirtual   #41  <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
		//*   5    9:ifeq            22
				throw new IllegalStateException("Binder already consumed");
		//    6   12:new             #43  <Class IllegalStateException>
		//    7   15:dup             
		//    8   16:ldc1            #45  <String "Binder already consumed">
		//    9   18:invokespecial   #48  <Method void IllegalStateException(String)>
		//   10   21:athrow          
			else
				return (IBinder)queue.take();
		//   11   22:aload_0         
		//   12   23:getfield        #30  <Field BlockingQueue queue>
		//   13   26:invokeinterface #54  <Method Object BlockingQueue.take()>
		//   14   31:checkcast       #56  <Class IBinder>
		//   15   34:areturn         
		}

		public void onServiceConnected(ComponentName componentname, IBinder ibinder)
		{
			try
			{
				queue.put(((Object) (ibinder)));
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field BlockingQueue queue>
		//    2    4:aload_2         
		//    3    5:invokeinterface #63  <Method void BlockingQueue.put(Object)>
				return;
		//    4   10:return          
			}
			// Misplaced declaration of an exception variable
			catch(ComponentName componentname)
		//*   5   11:astore_1        
			{
				return;
		//    6   12:return          
			}
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
		java.lang.reflect.Method method;
		AttributionIdentifiers attributionidentifiers;
		try
		{
			if(Looper.myLooper() == Looper.getMainLooper())
	//*   0    0:invokestatic    #87  <Method Looper Looper.myLooper()>
	//*   1    3:invokestatic    #90  <Method Looper Looper.getMainLooper()>
	//*   2    6:if_acmpne       19
				throw new FacebookException("getAndroidId cannot be called on the main thread.");
	//    3    9:new             #92  <Class FacebookException>
	//    4   12:dup             
	//    5   13:ldc1            #94  <String "getAndroidId cannot be called on the main thread.">
	//    6   15:invokespecial   #97  <Method void FacebookException(String)>
	//    7   18:athrow          
			obj = ((Object) (Utility.getMethodQuietly("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", new Class[] {
				android/content/Context
			})));
	//    8   19:ldc1            #99  <String "com.google.android.gms.common.GooglePlayServicesUtil">
	//    9   21:ldc1            #101 <String "isGooglePlayServicesAvailable">
	//   10   23:iconst_1        
	//   11   24:anewarray       Class[]
	//   12   27:dup             
	//   13   28:iconst_0        
	//   14   29:ldc1            #103 <Class Context>
	//   15   31:aastore         
	//   16   32:invokestatic    #109 <Method java.lang.reflect.Method Utility.getMethodQuietly(String, String, Class[])>
	//   17   35:astore_1        
		}
	//*  18   36:aload_1         
	//*  19   37:ifnonnull       42
	//*  20   40:aconst_null     
	//*  21   41:areturn         
	//*  22   42:aconst_null     
	//*  23   43:aload_1         
	//*  24   44:iconst_1        
	//*  25   45:anewarray       Object[]
	//*  26   48:dup             
	//*  27   49:iconst_0        
	//*  28   50:aload_0         
	//*  29   51:aastore         
	//*  30   52:invokestatic    #113 <Method Object Utility.invokeMethodQuietly(Object, java.lang.reflect.Method, Object[])>
	//*  31   55:astore_1        
	//*  32   56:aload_1         
	//*  33   57:instanceof      #115 <Class Integer>
	//*  34   60:ifeq            203
	//*  35   63:aload_1         
	//*  36   64:checkcast       #115 <Class Integer>
	//*  37   67:invokevirtual   #119 <Method int Integer.intValue()>
	//*  38   70:ifeq            75
	//*  39   73:aconst_null     
	//*  40   74:areturn         
	//*  41   75:ldc1            #121 <String "com.google.android.gms.ads.identifier.AdvertisingIdClient">
	//*  42   77:ldc1            #123 <String "getAdvertisingIdInfo">
	//*  43   79:iconst_1        
	//*  44   80:anewarray       Class[]
	//*  45   83:dup             
	//*  46   84:iconst_0        
	//*  47   85:ldc1            #103 <Class Context>
	//*  48   87:aastore         
	//*  49   88:invokestatic    #109 <Method java.lang.reflect.Method Utility.getMethodQuietly(String, String, Class[])>
	//*  50   91:astore_1        
	//*  51   92:aload_1         
	//*  52   93:ifnonnull       98
	//*  53   96:aconst_null     
	//*  54   97:areturn         
	//*  55   98:aconst_null     
	//*  56   99:aload_1         
	//*  57  100:iconst_1        
	//*  58  101:anewarray       Object[]
	//*  59  104:dup             
	//*  60  105:iconst_0        
	//*  61  106:aload_0         
	//*  62  107:aastore         
	//*  63  108:invokestatic    #113 <Method Object Utility.invokeMethodQuietly(Object, java.lang.reflect.Method, Object[])>
	//*  64  111:astore_0        
	//*  65  112:aload_0         
	//*  66  113:ifnonnull       118
	//*  67  116:aconst_null     
	//*  68  117:areturn         
	//*  69  118:aload_0         
	//*  70  119:invokevirtual   #127 <Method Class Object.getClass()>
	//*  71  122:ldc1            #129 <String "getId">
	//*  72  124:iconst_0        
	//*  73  125:anewarray       Class[]
	//*  74  128:invokestatic    #132 <Method java.lang.reflect.Method Utility.getMethodQuietly(Class, String, Class[])>
	//*  75  131:astore_1        
	//*  76  132:aload_0         
	//*  77  133:invokevirtual   #127 <Method Class Object.getClass()>
	//*  78  136:ldc1            #134 <String "isLimitAdTrackingEnabled">
	//*  79  138:iconst_0        
	//*  80  139:anewarray       Class[]
	//*  81  142:invokestatic    #132 <Method java.lang.reflect.Method Utility.getMethodQuietly(Class, String, Class[])>
	//*  82  145:astore_2        
	//*  83  146:aload_1         
	//*  84  147:ifnull          201
	//*  85  150:aload_2         
	//*  86  151:ifnonnull       156
	//*  87  154:aconst_null     
	//*  88  155:areturn         
	//*  89  156:new             #2   <Class AttributionIdentifiers>
	//*  90  159:dup             
	//*  91  160:invokespecial   #79  <Method void AttributionIdentifiers()>
	//*  92  163:astore_3        
	//*  93  164:aload_3         
	//*  94  165:aload_0         
	//*  95  166:aload_1         
	//*  96  167:iconst_0        
	//*  97  168:anewarray       Object[]
	//*  98  171:invokestatic    #113 <Method Object Utility.invokeMethodQuietly(Object, java.lang.reflect.Method, Object[])>
	//*  99  174:checkcast       #136 <Class String>
	//* 100  177:putfield        #138 <Field String androidAdvertiserId>
	//* 101  180:aload_3         
	//* 102  181:aload_0         
	//* 103  182:aload_2         
	//* 104  183:iconst_0        
	//* 105  184:anewarray       Object[]
	//* 106  187:invokestatic    #113 <Method Object Utility.invokeMethodQuietly(Object, java.lang.reflect.Method, Object[])>
	//* 107  190:checkcast       #140 <Class Boolean>
	//* 108  193:invokevirtual   #144 <Method boolean Boolean.booleanValue()>
	//* 109  196:putfield        #146 <Field boolean limitTracking>
	//* 110  199:aload_3         
	//* 111  200:areturn         
	//* 112  201:aconst_null     
	//* 113  202:areturn         
	//* 114  203:aconst_null     
	//* 115  204:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 116  205:astore_0        
		{
			Utility.logd("android_id", ((Exception) (context)));
	//  117  206:ldc1            #148 <String "android_id">
	//  118  208:aload_0         
	//  119  209:invokestatic    #152 <Method void Utility.logd(String, Exception)>
			return null;
	//  120  212:aconst_null     
	//  121  213:areturn         
		}
		if(obj == null)
			return null;
		obj = Utility.invokeMethodQuietly(((Object) (null)), ((java.lang.reflect.Method) (obj)), new Object[] {
			context
		});
		if(!(obj instanceof Integer))
			break MISSING_BLOCK_LABEL_203;
		if(((Integer)obj).intValue() != 0)
			return null;
		obj = ((Object) (Utility.getMethodQuietly("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new Class[] {
			android/content/Context
		})));
		if(obj == null)
			return null;
		context = ((Context) (Utility.invokeMethodQuietly(((Object) (null)), ((java.lang.reflect.Method) (obj)), new Object[] {
			context
		})));
		if(context == null)
			return null;
		obj = ((Object) (Utility.getMethodQuietly(((Object) (context)).getClass(), "getId", new Class[0])));
		method = Utility.getMethodQuietly(((Object) (context)).getClass(), "isLimitAdTrackingEnabled", new Class[0]);
		if(obj == null)
			break MISSING_BLOCK_LABEL_201;
		if(method == null)
			return null;
		attributionidentifiers = new AttributionIdentifiers();
		attributionidentifiers.androidAdvertiserId = (String)Utility.invokeMethodQuietly(((Object) (context)), ((java.lang.reflect.Method) (obj)), new Object[0]);
		attributionidentifiers.limitTracking = ((Boolean)Utility.invokeMethodQuietly(((Object) (context)), method, new Object[0])).booleanValue();
		return attributionidentifiers;
		return null;
		return null;
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
	//   33   61:putfield        #138 <Field String androidAdvertiserId>
		attributionidentifiers.limitTracking = googleadinfo.isTrackingLimited();
	//   34   64:aload_3         
	//   35   65:aload_2         
	//   36   66:invokevirtual   #183 <Method boolean AttributionIdentifiers$GoogleAdInfo.isTrackingLimited()>
	//   37   69:putfield        #146 <Field boolean limitTracking>
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
		AttributionIdentifiers attributionidentifiers;
		if(recentlyFetchedIdentifiers != null && System.currentTimeMillis() - recentlyFetchedIdentifiers.fetchTime < 0x36ee80L)
	//*   0    0:getstatic       #70  <Field AttributionIdentifiers recentlyFetchedIdentifiers>
	//*   1    3:ifnull          27
	//*   2    6:invokestatic    #66  <Method long System.currentTimeMillis()>
	//*   3    9:getstatic       #70  <Field AttributionIdentifiers recentlyFetchedIdentifiers>
	//*   4   12:getfield        #68  <Field long fetchTime>
	//*   5   15:lsub            
	//*   6   16:ldc2w           #31  <Long 0x36ee80L>
	//*   7   19:lcmp            
	//*   8   20:ifge            27
			return recentlyFetchedIdentifiers;
	//    9   23:getstatic       #70  <Field AttributionIdentifiers recentlyFetchedIdentifiers>
	//   10   26:areturn         
		attributionidentifiers = getAndroidId(context);
	//   11   27:aload_0         
	//   12   28:invokestatic    #190 <Method AttributionIdentifiers getAndroidId(Context)>
	//   13   31:astore          6
		obj1 = null;
	//   14   33:aconst_null     
	//   15   34:astore          5
		if(context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0) == null) goto _L2; else goto _L1
	//   16   36:aload_0         
	//   17   37:invokevirtual   #194 <Method PackageManager Context.getPackageManager()>
	//   18   40:ldc1            #22  <String "com.facebook.katana.provider.AttributionIdProvider">
	//   19   42:iconst_0        
	//   20   43:invokevirtual   #200 <Method android.content.pm.ProviderInfo PackageManager.resolveContentProvider(String, int)>
	//   21   46:ifnull          59
_L1:
		Object obj = ((Object) (Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider")));
	//   22   49:ldc1            #202 <String "content://com.facebook.katana.provider.AttributionIdProvider">
	//   23   51:invokestatic    #208 <Method Uri Uri.parse(String)>
	//   24   54:astore          4
		  goto _L3
	//*  25   56:goto            371
_L2:
		if(context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0) == null) goto _L5; else goto _L4
	//   26   59:aload_0         
	//   27   60:invokevirtual   #194 <Method PackageManager Context.getPackageManager()>
	//   28   63:ldc1            #25  <String "com.facebook.wakizashi.provider.AttributionIdProvider">
	//   29   65:iconst_0        
	//   30   66:invokevirtual   #200 <Method android.content.pm.ProviderInfo PackageManager.resolveContentProvider(String, int)>
	//   31   69:ifnull          374
_L4:
		obj = ((Object) (Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider")));
	//   32   72:ldc1            #210 <String "content://com.facebook.wakizashi.provider.AttributionIdProvider">
	//   33   74:invokestatic    #208 <Method Uri Uri.parse(String)>
	//   34   77:astore          4
	//*  35   79:goto            371
_L3:
		String s1 = getInstallerPackageName(context);
	//   36   82:aload_0         
	//   37   83:invokestatic    #214 <Method String getInstallerPackageName(Context)>
	//   38   86:astore          7
		if(s1 == null)
			break MISSING_BLOCK_LABEL_100;
	//   39   88:aload           7
	//   40   90:ifnull          100
		attributionidentifiers.androidInstallerPackage = s1;
	//   41   93:aload           6
	//   42   95:aload           7
	//   43   97:putfield        #216 <Field String androidInstallerPackage>
		if(obj != null)
			break MISSING_BLOCK_LABEL_111;
	//   44  100:aload           4
	//   45  102:ifnonnull       111
		return cacheAndReturnIdentifiers(attributionidentifiers);
	//   46  105:aload           6
	//   47  107:invokestatic    #218 <Method AttributionIdentifiers cacheAndReturnIdentifiers(AttributionIdentifiers)>
	//   48  110:areturn         
		context = ((Context) (context.getContentResolver().query(((Uri) (obj)), new String[] {
			"aid", "androidid", "limit_tracking"
		}, ((String) (null)), ((String []) (null)), ((String) (null)))));
	//   49  111:aload_0         
	//   50  112:invokevirtual   #222 <Method ContentResolver Context.getContentResolver()>
	//   51  115:aload           4
	//   52  117:iconst_3        
	//   53  118:anewarray       String[]
	//   54  121:dup             
	//   55  122:iconst_0        
	//   56  123:ldc1            #19  <String "aid">
	//   57  125:aastore         
	//   58  126:dup             
	//   59  127:iconst_1        
	//   60  128:ldc1            #16  <String "androidid">
	//   61  130:aastore         
	//   62  131:dup             
	//   63  132:iconst_2        
	//   64  133:ldc1            #35  <String "limit_tracking">
	//   65  135:aastore         
	//   66  136:aconst_null     
	//   67  137:aconst_null     
	//   68  138:aconst_null     
	//   69  139:invokevirtual   #228 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   70  142:astore_0        
		if(context == null)
			break MISSING_BLOCK_LABEL_267;
	//   71  143:aload_0         
	//   72  144:ifnull          267
		if(!((Cursor) (context)).moveToFirst())
	//*  73  147:aload_0         
	//*  74  148:invokeinterface #233 <Method boolean Cursor.moveToFirst()>
	//*  75  153:ifne            159
			break MISSING_BLOCK_LABEL_267;
	//   76  156:goto            267
		int j;
		int k;
		try
		{
			int i = ((Cursor) (context)).getColumnIndex("aid");
	//   77  159:aload_0         
	//   78  160:ldc1            #19  <String "aid">
	//   79  162:invokeinterface #237 <Method int Cursor.getColumnIndex(String)>
	//   80  167:istore_1        
			j = ((Cursor) (context)).getColumnIndex("androidid");
	//   81  168:aload_0         
	//   82  169:ldc1            #16  <String "androidid">
	//   83  171:invokeinterface #237 <Method int Cursor.getColumnIndex(String)>
	//   84  176:istore_2        
			k = ((Cursor) (context)).getColumnIndex("limit_tracking");
	//   85  177:aload_0         
	//   86  178:ldc1            #35  <String "limit_tracking">
	//   87  180:invokeinterface #237 <Method int Cursor.getColumnIndex(String)>
	//   88  185:istore_3        
			attributionidentifiers.attributionId = ((Cursor) (context)).getString(i);
	//   89  186:aload           6
	//   90  188:aload_0         
	//   91  189:iload_1         
	//   92  190:invokeinterface #241 <Method String Cursor.getString(int)>
	//   93  195:putfield        #243 <Field String attributionId>
		}
	//*  94  198:iload_2         
	//*  95  199:ifle            241
	//*  96  202:iload_3         
	//*  97  203:ifle            241
	//*  98  206:aload           6
	//*  99  208:invokevirtual   #246 <Method String getAndroidAdvertiserId()>
	//* 100  211:ifnonnull       241
	//* 101  214:aload           6
	//* 102  216:aload_0         
	//* 103  217:iload_2         
	//* 104  218:invokeinterface #241 <Method String Cursor.getString(int)>
	//* 105  223:putfield        #138 <Field String androidAdvertiserId>
	//* 106  226:aload           6
	//* 107  228:aload_0         
	//* 108  229:iload_3         
	//* 109  230:invokeinterface #241 <Method String Cursor.getString(int)>
	//* 110  235:invokestatic    #250 <Method boolean Boolean.parseBoolean(String)>
	//* 111  238:putfield        #146 <Field boolean limitTracking>
	//* 112  241:aload_0         
	//* 113  242:ifnull          251
	//* 114  245:aload_0         
	//* 115  246:invokeinterface #253 <Method void Cursor.close()>
	//* 116  251:aload           6
	//* 117  253:invokestatic    #218 <Method AttributionIdentifiers cacheAndReturnIdentifiers(AttributionIdentifiers)>
	//* 118  256:areturn         
	//* 119  257:astore          4
	//* 120  259:goto            358
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 121  262:astore          4
		{
			break MISSING_BLOCK_LABEL_299;
	//  122  264:goto            299
		}
		if(j <= 0 || k <= 0)
			break MISSING_BLOCK_LABEL_241;
		if(attributionidentifiers.getAndroidAdvertiserId() == null)
		{
			attributionidentifiers.androidAdvertiserId = ((Cursor) (context)).getString(j);
			attributionidentifiers.limitTracking = Boolean.parseBoolean(((Cursor) (context)).getString(k));
		}
		if(context != null)
			((Cursor) (context)).close();
		return cacheAndReturnIdentifiers(attributionidentifiers);
		obj;
		break MISSING_BLOCK_LABEL_358;
		obj = ((Object) (cacheAndReturnIdentifiers(attributionidentifiers)));
	//  123  267:aload           6
	//  124  269:invokestatic    #218 <Method AttributionIdentifiers cacheAndReturnIdentifiers(AttributionIdentifiers)>
	//  125  272:astore          4
		if(context != null)
	//* 126  274:aload_0         
	//* 127  275:ifnull          284
			((Cursor) (context)).close();
	//  128  278:aload_0         
	//  129  279:invokeinterface #253 <Method void Cursor.close()>
		return ((AttributionIdentifiers) (obj));
	//  130  284:aload           4
	//  131  286:areturn         
		obj;
	//  132  287:astore          4
		context = ((Context) (obj1));
	//  133  289:aload           5
	//  134  291:astore_0        
		break MISSING_BLOCK_LABEL_358;
	//  135  292:goto            358
		obj;
	//  136  295:astore          4
		context = null;
	//  137  297:aconst_null     
	//  138  298:astore_0        
		String s = TAG;
	//  139  299:getstatic       #54  <Field String TAG>
	//  140  302:astore          5
		StringBuilder stringbuilder = new StringBuilder();
	//  141  304:new             #255 <Class StringBuilder>
	//  142  307:dup             
	//  143  308:invokespecial   #256 <Method void StringBuilder()>
	//  144  311:astore          6
		stringbuilder.append("Caught unexpected exception in getAttributionId(): ");
	//  145  313:aload           6
	//  146  315:ldc2            #258 <String "Caught unexpected exception in getAttributionId(): ">
	//  147  318:invokevirtual   #262 <Method StringBuilder StringBuilder.append(String)>
	//  148  321:pop             
		stringbuilder.append(((Exception) (obj)).toString());
	//  149  322:aload           6
	//  150  324:aload           4
	//  151  326:invokevirtual   #265 <Method String Exception.toString()>
	//  152  329:invokevirtual   #262 <Method StringBuilder StringBuilder.append(String)>
	//  153  332:pop             
		Log.d(s, stringbuilder.toString());
	//  154  333:aload           5
	//  155  335:aload           6
	//  156  337:invokevirtual   #266 <Method String StringBuilder.toString()>
	//  157  340:invokestatic    #272 <Method int Log.d(String, String)>
	//  158  343:pop             
		if(context != null)
	//* 159  344:aload_0         
	//* 160  345:ifnull          354
			((Cursor) (context)).close();
	//  161  348:aload_0         
	//  162  349:invokeinterface #253 <Method void Cursor.close()>
		return null;
	//  163  354:aconst_null     
	//  164  355:areturn         
		obj;
	//  165  356:astore          4
		if(context != null)
	//* 166  358:aload_0         
	//* 167  359:ifnull          368
			((Cursor) (context)).close();
	//  168  362:aload_0         
	//  169  363:invokeinterface #253 <Method void Cursor.close()>
		throw obj;
	//  170  368:aload           4
	//  171  370:athrow          
	//* 172  371:goto            82
_L5:
		obj = null;
	//  173  374:aconst_null     
	//  174  375:astore          4
		if(true) goto _L3; else goto _L6
	//  175  377:goto            82
_L6:
	}

	private static String getInstallerPackageName(Context context)
	{
		PackageManager packagemanager = context.getPackageManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #194 <Method PackageManager Context.getPackageManager()>
	//    2    4:astore_1        
		if(packagemanager != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
			return packagemanager.getInstallerPackageName(context.getPackageName());
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #276 <Method String Context.getPackageName()>
	//    8   14:invokevirtual   #279 <Method String PackageManager.getInstallerPackageName(String)>
	//    9   17:areturn         
		else
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
	}

	public String getAndroidAdvertiserId()
	{
		return androidAdvertiserId;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field String androidAdvertiserId>
	//    2    4:areturn         
	}

	public String getAndroidInstallerPackage()
	{
		return androidInstallerPackage;
	//    0    0:aload_0         
	//    1    1:getfield        #216 <Field String androidInstallerPackage>
	//    2    4:areturn         
	}

	public String getAttributionId()
	{
		return attributionId;
	//    0    0:aload_0         
	//    1    1:getfield        #243 <Field String attributionId>
	//    2    4:areturn         
	}

	public boolean isTrackingLimited()
	{
		return limitTracking;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field boolean limitTracking>
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
