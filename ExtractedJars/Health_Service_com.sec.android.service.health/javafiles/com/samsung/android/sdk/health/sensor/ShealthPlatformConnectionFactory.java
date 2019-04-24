// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.samsung.android.sdk.health.sensor;

import android.content.Context;
import android.content.ServiceConnection;
import android.util.Log;
import android.util.SparseArray;
import java.util.List;

// Referenced classes of package com.samsung.android.sdk.health.sensor:
//			_PlatformSensorService

public class ShealthPlatformConnectionFactory
{

	private ShealthPlatformConnectionFactory(ServiceConnection serviceconnection)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		mSHealthServiceConnectionList = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #36  <Field SparseArray mSHealthServiceConnectionList>
		Log.i(TAG, "ShealthPlatformConnectionFactory()");
	//    5    9:getstatic       #25  <Field String TAG>
	//    6   12:ldc1            #38  <String "ShealthPlatformConnectionFactory()">
	//    7   14:invokestatic    #44  <Method int Log.i(String, String)>
	//    8   17:pop             
		mSHealthServiceConnectionList = new SparseArray();
	//    9   18:aload_0         
	//   10   19:new             #46  <Class SparseArray>
	//   11   22:dup             
	//   12   23:invokespecial   #47  <Method void SparseArray()>
	//   13   26:putfield        #36  <Field SparseArray mSHealthServiceConnectionList>
	//   14   29:return          
	}

	static ShealthPlatformConnectionFactory getInstance(ServiceConnection serviceconnection, int i)
	{
		if(mSHealthServiceConnectionFactory == null)
	//*   0    0:getstatic       #29  <Field ShealthPlatformConnectionFactory mSHealthServiceConnectionFactory>
	//*   1    3:ifnonnull       17
			mSHealthServiceConnectionFactory = new ShealthPlatformConnectionFactory(serviceconnection);
	//    2    6:new             #2   <Class ShealthPlatformConnectionFactory>
	//    3    9:dup             
	//    4   10:aload_0         
	//    5   11:invokespecial   #51  <Method void ShealthPlatformConnectionFactory(ServiceConnection)>
	//    6   14:putstatic       #29  <Field ShealthPlatformConnectionFactory mSHealthServiceConnectionFactory>
		return mSHealthServiceConnectionFactory;
	//    7   17:getstatic       #29  <Field ShealthPlatformConnectionFactory mSHealthServiceConnectionFactory>
	//    8   20:areturn         
	}

	void closeAllConnection(Context context, ServiceConnection serviceconnection, int i)
	{
		Log.i(TAG, "closeAllConnection()");
	//    0    0:getstatic       #25  <Field String TAG>
	//    1    3:ldc1            #55  <String "closeAllConnection()">
	//    2    5:invokestatic    #44  <Method int Log.i(String, String)>
	//    3    8:pop             
		mConnectionRefCount = 0;
	//    4    9:iconst_0        
	//    5   10:putstatic       #27  <Field int mConnectionRefCount>
		closeConnection(context, serviceconnection, i, 0L);
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:aload_2         
	//    9   16:iload_3         
	//   10   17:lconst_0        
	//   11   18:invokevirtual   #59  <Method void closeConnection(Context, ServiceConnection, int, long)>
	//   12   21:return          
	}

	void closeConnection(Context context, ServiceConnection serviceconnection, int i, long l)
	{
		Log.i(TAG, "closeConnection()");
	//    0    0:getstatic       #25  <Field String TAG>
	//    1    3:ldc1            #63  <String "closeConnection()">
	//    2    5:invokestatic    #44  <Method int Log.i(String, String)>
	//    3    8:pop             
		if(mConnectionRefCount > 0 && mSHealthServiceConnectionList != null && mSHealthServiceConnectionList.indexOfKey(i) > 0 && ((List)mSHealthServiceConnectionList.get(i)).contains(((Object) (Long.valueOf(l)))) && mSHealthServiceConnectionList.indexOfKey(i) > 0 && mSHealthServiceConnectionList.get(i) != null && ((List)mSHealthServiceConnectionList.get(i)).contains(((Object) (Long.valueOf(l)))))
	//*   4    9:getstatic       #27  <Field int mConnectionRefCount>
	//*   5   12:ifle            133
	//*   6   15:aload_0         
	//*   7   16:getfield        #36  <Field SparseArray mSHealthServiceConnectionList>
	//*   8   19:ifnull          133
	//*   9   22:aload_0         
	//*  10   23:getfield        #36  <Field SparseArray mSHealthServiceConnectionList>
	//*  11   26:iload_3         
	//*  12   27:invokevirtual   #67  <Method int SparseArray.indexOfKey(int)>
	//*  13   30:ifle            133
	//*  14   33:aload_0         
	//*  15   34:getfield        #36  <Field SparseArray mSHealthServiceConnectionList>
	//*  16   37:iload_3         
	//*  17   38:invokevirtual   #71  <Method Object SparseArray.get(int)>
	//*  18   41:checkcast       #73  <Class List>
	//*  19   44:lload           4
	//*  20   46:invokestatic    #79  <Method Long Long.valueOf(long)>
	//*  21   49:invokeinterface #83  <Method boolean List.contains(Object)>
	//*  22   54:ifeq            133
	//*  23   57:aload_0         
	//*  24   58:getfield        #36  <Field SparseArray mSHealthServiceConnectionList>
	//*  25   61:iload_3         
	//*  26   62:invokevirtual   #67  <Method int SparseArray.indexOfKey(int)>
	//*  27   65:ifle            133
	//*  28   68:aload_0         
	//*  29   69:getfield        #36  <Field SparseArray mSHealthServiceConnectionList>
	//*  30   72:iload_3         
	//*  31   73:invokevirtual   #71  <Method Object SparseArray.get(int)>
	//*  32   76:ifnull          133
	//*  33   79:aload_0         
	//*  34   80:getfield        #36  <Field SparseArray mSHealthServiceConnectionList>
	//*  35   83:iload_3         
	//*  36   84:invokevirtual   #71  <Method Object SparseArray.get(int)>
	//*  37   87:checkcast       #73  <Class List>
	//*  38   90:lload           4
	//*  39   92:invokestatic    #79  <Method Long Long.valueOf(long)>
	//*  40   95:invokeinterface #83  <Method boolean List.contains(Object)>
	//*  41  100:ifeq            133
		{
			((List)mSHealthServiceConnectionList.get(i)).remove(((Object) (Long.valueOf(l))));
	//   42  103:aload_0         
	//   43  104:getfield        #36  <Field SparseArray mSHealthServiceConnectionList>
	//   44  107:iload_3         
	//   45  108:invokevirtual   #71  <Method Object SparseArray.get(int)>
	//   46  111:checkcast       #73  <Class List>
	//   47  114:lload           4
	//   48  116:invokestatic    #79  <Method Long Long.valueOf(long)>
	//   49  119:invokeinterface #86  <Method boolean List.remove(Object)>
	//   50  124:pop             
			mConnectionRefCount--;
	//   51  125:getstatic       #27  <Field int mConnectionRefCount>
	//   52  128:iconst_1        
	//   53  129:isub            
	//   54  130:putstatic       #27  <Field int mConnectionRefCount>
		}
		if(mConnectionRefCount == 0)
	//*  55  133:getstatic       #27  <Field int mConnectionRefCount>
	//*  56  136:ifne            161
		{
			Log.d(TAG, "closeConnection() : ShealthDeviceFinder cleanup finished, this instance is now unusable");
	//   57  139:getstatic       #25  <Field String TAG>
	//   58  142:ldc1            #88  <String "closeConnection() : ShealthDeviceFinder cleanup finished, this instance is now unusable">
	//   59  144:invokestatic    #91  <Method int Log.d(String, String)>
	//   60  147:pop             
			try
			{
				context.getApplicationContext().unbindService(serviceconnection);
	//   61  148:aload_1         
	//   62  149:invokevirtual   #97  <Method Context Context.getApplicationContext()>
	//   63  152:aload_2         
	//   64  153:invokevirtual   #100 <Method void Context.unbindService(ServiceConnection)>
			}
	//*  65  156:aload_0         
	//*  66  157:aconst_null     
	//*  67  158:putfield        #102 <Field _PlatformSensorService mService>
	//*  68  161:return          
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  69  162:astore_1        
			{
				((Exception) (context)).printStackTrace();
	//   70  163:aload_1         
	//   71  164:invokevirtual   #105 <Method void Exception.printStackTrace()>
			}
			mService = null;
		}
	//*  72  167:goto            156
	}

	private static final String TAG = ((Class) (com/samsung/android/sdk/health/sensor/ShealthPlatformConnectionFactory)).getSimpleName();
	static int mConnectionRefCount = 0;
	private static ShealthPlatformConnectionFactory mSHealthServiceConnectionFactory = null;
	private SparseArray mSHealthServiceConnectionList;
	_PlatformSensorService mService;

	static 
	{
	//    0    0:ldc1            #2   <Class ShealthPlatformConnectionFactory>
	//    1    2:invokevirtual   #23  <Method String Class.getSimpleName()>
	//    2    5:putstatic       #25  <Field String TAG>
	//    3    8:iconst_0        
	//    4    9:putstatic       #27  <Field int mConnectionRefCount>
	//    5   12:aconst_null     
	//    6   13:putstatic       #29  <Field ShealthPlatformConnectionFactory mSHealthServiceConnectionFactory>
	//*   7   16:return          
	}
}
