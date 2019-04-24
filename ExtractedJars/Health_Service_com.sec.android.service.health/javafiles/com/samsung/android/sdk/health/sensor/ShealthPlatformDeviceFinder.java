// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.samsung.android.sdk.health.sensor;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.samsung.android.sdk.health.sensor._private._PrivilegeSensorDevice;
import com.samsung.android.sdk.health.sensor.exception.PrivilegeSensorNotSupportedException;
import com.samsung.android.sdk.health.sensor.exception.PrivilegeSensorServiceNotBoundException;
import java.lang.reflect.Method;
import java.util.*;

// Referenced classes of package com.samsung.android.sdk.health.sensor:
//			ShealthPlatformBinderFactory, PrivilegeSensorDevice, _PlatformSensorService

public class ShealthPlatformDeviceFinder
{
	public static interface ServiceConnectionListener
	{

		public abstract void onServiceConnected(int i);

		public abstract void onServiceDisconnected(int i);

		public static final int ERROR_FAILURE = 1;
		public static final int ERROR_NONE = 0;
	}


	public ShealthPlatformDeviceFinder(Context context, ServiceConnectionListener serviceconnectionlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		mDiscoveredDeviceList = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #35  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #36  <Method void ArrayList()>
	//    6   12:putfield        #38  <Field ArrayList mDiscoveredDeviceList>
		Log.d(TAG, "ShealthPlatformDeviceFinder()");
	//    7   15:getstatic       #28  <Field String TAG>
	//    8   18:ldc1            #40  <String "ShealthPlatformDeviceFinder()">
	//    9   20:invokestatic    #46  <Method int Log.d(String, String)>
	//   10   23:pop             
		if(context == null || serviceconnectionlistener == null)
	//*  11   24:aload_1         
	//*  12   25:ifnull          32
	//*  13   28:aload_2         
	//*  14   29:ifnonnull       42
		{
			throw new IllegalArgumentException("Context and Listener can't be null");
	//   15   32:new             #48  <Class IllegalArgumentException>
	//   16   35:dup             
	//   17   36:ldc1            #50  <String "Context and Listener can't be null">
	//   18   38:invokespecial   #53  <Method void IllegalArgumentException(String)>
	//   19   41:athrow          
		} else
		{
			Log.d(TAG, (new StringBuilder()).append("ShealthDeviceFinder constructor : ").append(((Object)this).hashCode()).toString());
	//   20   42:getstatic       #28  <Field String TAG>
	//   21   45:new             #55  <Class StringBuilder>
	//   22   48:dup             
	//   23   49:invokespecial   #56  <Method void StringBuilder()>
	//   24   52:ldc1            #58  <String "ShealthDeviceFinder constructor : ">
	//   25   54:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   26   57:aload_0         
	//   27   58:invokevirtual   #66  <Method int Object.hashCode()>
	//   28   61:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//   29   64:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   30   67:invokestatic    #46  <Method int Log.d(String, String)>
	//   31   70:pop             
			mContext = context;
	//   32   71:aload_0         
	//   33   72:aload_1         
	//   34   73:putfield        #74  <Field Context mContext>
			mObjectId = getNextInt();
	//   35   76:aload_0         
	//   36   77:aload_0         
	//   37   78:invokespecial   #77  <Method int getNextInt()>
	//   38   81:putfield        #79  <Field int mObjectId>
			ShealthPlatformBinderFactory.getDefaultBinder(context, 105, mObjectId, serviceconnectionlistener);
	//   39   84:aload_1         
	//   40   85:bipush          105
	//   41   87:aload_0         
	//   42   88:getfield        #79  <Field int mObjectId>
	//   43   91:i2l             
	//   44   92:aload_2         
	//   45   93:invokestatic    #85  <Method _PlatformSensorService ShealthPlatformBinderFactory.getDefaultBinder(Context, int, long, ShealthPlatformDeviceFinder$ServiceConnectionListener)>
	//   46   96:pop             
			return;
	//   47   97:return          
		}
	}

	private void addDeviceFound(PrivilegeSensorDevice privilegesensordevice)
	{
		synchronized(mDiscoveredDeviceList)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field ArrayList mDiscoveredDeviceList>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			Log.i(TAG, "addDeviceFound()");
	//    5    7:getstatic       #28  <Field String TAG>
	//    6   10:ldc1            #89  <String "addDeviceFound()">
	//    7   12:invokestatic    #92  <Method int Log.i(String, String)>
	//    8   15:pop             
			mDiscoveredDeviceList.add(((Object) (privilegesensordevice)));
	//    9   16:aload_0         
	//   10   17:getfield        #38  <Field ArrayList mDiscoveredDeviceList>
	//   11   20:aload_1         
	//   12   21:invokevirtual   #96  <Method boolean ArrayList.add(Object)>
	//   13   24:pop             
		}
	//   14   25:aload_2         
	//   15   26:monitorexit     
		return;
	//   16   27:return          
		privilegesensordevice;
	//   17   28:astore_1        
		arraylist;
	//   18   29:aload_2         
		JVM INSTR monitorexit ;
	//   19   30:monitorexit     
		throw privilegesensordevice;
	//   20   31:aload_1         
	//   21   32:athrow          
	}

	private void cleanupDevices()
	{
		ArrayList arraylist = mDiscoveredDeviceList;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ArrayList mDiscoveredDeviceList>
	//    2    4:astore_1        
		arraylist;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Iterator iterator;
		Log.i(TAG, "cleanupDevices()");
	//    5    7:getstatic       #28  <Field String TAG>
	//    6   10:ldc1            #101 <String "cleanupDevices()">
	//    7   12:invokestatic    #92  <Method int Log.i(String, String)>
	//    8   15:pop             
		iterator = mDiscoveredDeviceList.iterator();
	//    9   16:aload_0         
	//   10   17:getfield        #38  <Field ArrayList mDiscoveredDeviceList>
	//   11   20:invokevirtual   #105 <Method Iterator ArrayList.iterator()>
	//   12   23:astore_2        
_L5:
		if(!iterator.hasNext()) goto _L2; else goto _L1
	//   13   24:aload_2         
	//   14   25:invokeinterface #111 <Method boolean Iterator.hasNext()>
	//   15   30:ifeq            122
_L1:
		PrivilegeSensorDevice privilegesensordevice = (PrivilegeSensorDevice)iterator.next();
	//   16   33:aload_2         
	//   17   34:invokeinterface #115 <Method Object Iterator.next()>
	//   18   39:checkcast       #117 <Class PrivilegeSensorDevice>
	//   19   42:astore_3        
		privilegesensordevice.close();
	//   20   43:aload_3         
	//   21   44:invokevirtual   #120 <Method void PrivilegeSensorDevice.close()>
_L3:
		Method method = ((Class) (com/samsung/android/sdk/health/sensor/PrivilegeSensorDevice)).getDeclaredMethod("deinitialize", new Class[0]);
	//   22   47:ldc1            #117 <Class PrivilegeSensorDevice>
	//   23   49:ldc1            #122 <String "deinitialize">
	//   24   51:iconst_0        
	//   25   52:anewarray       Class[]
	//   26   55:invokevirtual   #126 <Method Method Class.getDeclaredMethod(String, Class[])>
	//   27   58:astore          4
		if(method == null)
			continue; /* Loop/switch isn't completed */
	//   28   60:aload           4
	//   29   62:ifnull          24
		method.setAccessible(true);
	//   30   65:aload           4
	//   31   67:iconst_1        
	//   32   68:invokevirtual   #132 <Method void Method.setAccessible(boolean)>
		method.invoke(((Object) (privilegesensordevice)), (Object[])null);
	//   33   71:aload           4
	//   34   73:aload_3         
	//   35   74:aconst_null     
	//   36   75:checkcast       #134 <Class Object[]>
	//   37   78:invokevirtual   #138 <Method Object Method.invoke(Object, Object[])>
	//   38   81:pop             
		continue; /* Loop/switch isn't completed */
	//   39   82:goto            24
		Exception exception1;
		exception1;
	//   40   85:astore_3        
		Log.e(TAG, exception1.toString());
	//   41   86:getstatic       #28  <Field String TAG>
	//   42   89:aload_3         
	//   43   90:invokevirtual   #139 <Method String Exception.toString()>
	//   44   93:invokestatic    #142 <Method int Log.e(String, String)>
	//   45   96:pop             
		continue; /* Loop/switch isn't completed */
	//   46   97:goto            24
		Exception exception;
		exception;
	//   47  100:astore_2        
		arraylist;
	//   48  101:aload_1         
		JVM INSTR monitorexit ;
	//   49  102:monitorexit     
		throw exception;
	//   50  103:aload_2         
	//   51  104:athrow          
		Exception exception2;
		exception2;
	//   52  105:astore          4
		Log.e(TAG, exception2.toString());
	//   53  107:getstatic       #28  <Field String TAG>
	//   54  110:aload           4
	//   55  112:invokevirtual   #139 <Method String Exception.toString()>
	//   56  115:invokestatic    #142 <Method int Log.e(String, String)>
	//   57  118:pop             
		  goto _L3
	//*  58  119:goto            47
_L2:
		mDiscoveredDeviceList.clear();
	//   59  122:aload_0         
	//   60  123:getfield        #38  <Field ArrayList mDiscoveredDeviceList>
	//   61  126:invokevirtual   #145 <Method void ArrayList.clear()>
		arraylist;
	//   62  129:aload_1         
		JVM INSTR monitorexit ;
	//   63  130:monitorexit     
		return;
	//   64  131:return          
		if(true) goto _L5; else goto _L4
_L4:
	}

	private int getNextInt()
	{
		return (new Random(System.currentTimeMillis())).nextInt();
	//    0    0:new             #147 <Class Random>
	//    1    3:dup             
	//    2    4:invokestatic    #153 <Method long System.currentTimeMillis()>
	//    3    7:invokespecial   #156 <Method void Random(long)>
	//    4   10:invokevirtual   #159 <Method int Random.nextInt()>
	//    5   13:ireturn         
	}

	private boolean isValidConnectivityType(int i)
	{
		return i == 1 || i == 0;
	//    0    0:iload_1         
	//    1    1:iconst_1        
	//    2    2:icmpeq          9
	//    3    5:iload_1         
	//    4    6:ifne            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	private boolean isValidDataType(int i)
	{
		return i == 1 || i == 2 || i == 3 || i == 4 || i == 7 || i == 0;
	//    0    0:iload_1         
	//    1    1:iconst_1        
	//    2    2:icmpeq          30
	//    3    5:iload_1         
	//    4    6:iconst_2        
	//    5    7:icmpeq          30
	//    6   10:iload_1         
	//    7   11:iconst_3        
	//    8   12:icmpeq          30
	//    9   15:iload_1         
	//   10   16:iconst_4        
	//   11   17:icmpeq          30
	//   12   20:iload_1         
	//   13   21:bipush          7
	//   14   23:icmpeq          30
	//   15   26:iload_1         
	//   16   27:ifne            32
	//   17   30:iconst_1        
	//   18   31:ireturn         
	//   19   32:iconst_0        
	//   20   33:ireturn         
	}

	private boolean isValidDeviceType(int i)
	{
		return i == 10008 || i == 10026 || i == 10004 || i == 10025 || i == 10006 || i == 0;
	//    0    0:iload_1         
	//    1    1:sipush          10008
	//    2    4:icmpeq          39
	//    3    7:iload_1         
	//    4    8:sipush          10026
	//    5   11:icmpeq          39
	//    6   14:iload_1         
	//    7   15:sipush          10004
	//    8   18:icmpeq          39
	//    9   21:iload_1         
	//   10   22:sipush          10025
	//   11   25:icmpeq          39
	//   12   28:iload_1         
	//   13   29:sipush          10006
	//   14   32:icmpeq          39
	//   15   35:iload_1         
	//   16   36:ifne            41
	//   17   39:iconst_1        
	//   18   40:ireturn         
	//   19   41:iconst_0        
	//   20   42:ireturn         
	}

	public void close()
	{
		Log.d(TAG, (new StringBuilder()).append("close() : ShealthDeviceFinder cleanup finished, this instance is now unusable : ").append(((Object)this).hashCode()).toString());
	//    0    0:getstatic       #28  <Field String TAG>
	//    1    3:new             #55  <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #56  <Method void StringBuilder()>
	//    4   10:ldc1            #165 <String "close() : ShealthDeviceFinder cleanup finished, this instance is now unusable : ">
	//    5   12:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//    6   15:aload_0         
	//    7   16:invokevirtual   #66  <Method int Object.hashCode()>
	//    8   19:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//    9   22:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   10   25:invokestatic    #46  <Method int Log.d(String, String)>
	//   11   28:pop             
		cleanupDevices();
	//   12   29:aload_0         
	//   13   30:invokespecial   #167 <Method void cleanupDevices()>
		ShealthPlatformBinderFactory.releaseReference(105, mObjectId);
	//   14   33:bipush          105
	//   15   35:aload_0         
	//   16   36:getfield        #79  <Field int mObjectId>
	//   17   39:invokestatic    #171 <Method boolean ShealthPlatformBinderFactory.releaseReference(int, int)>
	//   18   42:pop             
		mService = null;
	//   19   43:aload_0         
	//   20   44:aconst_null     
	//   21   45:putfield        #173 <Field _PlatformSensorService mService>
	//   22   48:return          
	}

	public int getApiVersion()
		throws RemoteException
	{
		mService = ShealthPlatformBinderFactory.getMyBinder(105, mObjectId);
	//    0    0:aload_0         
	//    1    1:bipush          105
	//    2    3:aload_0         
	//    3    4:getfield        #79  <Field int mObjectId>
	//    4    7:i2l             
	//    5    8:invokestatic    #180 <Method _PlatformSensorService ShealthPlatformBinderFactory.getMyBinder(int, long)>
	//    6   11:putfield        #173 <Field _PlatformSensorService mService>
		if(mService != null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #173 <Field _PlatformSensorService mService>
	//*   9   18:ifnull          65
		{
			Log.d(TAG, (new StringBuilder()).append("getApiVersion() : ").append(mService.getAPIVersion()).toString());
	//   10   21:getstatic       #28  <Field String TAG>
	//   11   24:new             #55  <Class StringBuilder>
	//   12   27:dup             
	//   13   28:invokespecial   #56  <Method void StringBuilder()>
	//   14   31:ldc1            #182 <String "getApiVersion() : ">
	//   15   33:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   16   36:aload_0         
	//   17   37:getfield        #173 <Field _PlatformSensorService mService>
	//   18   40:invokeinterface #187 <Method int _PlatformSensorService.getAPIVersion()>
	//   19   45:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//   20   48:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   21   51:invokestatic    #46  <Method int Log.d(String, String)>
	//   22   54:pop             
			return mService.getAPIVersion();
	//   23   55:aload_0         
	//   24   56:getfield        #173 <Field _PlatformSensorService mService>
	//   25   59:invokeinterface #187 <Method int _PlatformSensorService.getAPIVersion()>
	//   26   64:ireturn         
		} else
		{
			return -1;
	//   27   65:iconst_m1       
	//   28   66:ireturn         
		}
	}

	public List getConnectedDeviceList(int i, int j, int k)
		throws RemoteException, IllegalArgumentException, PrivilegeSensorServiceNotBoundException, PrivilegeSensorNotSupportedException
	{
		Log.d(TAG, (new StringBuilder()).append("getConnectedDeviceList() : connectivityType = ").append(i).append(" deviceType = ").append(j).append(" dataType = ").append(k).toString());
	//    0    0:getstatic       #28  <Field String TAG>
	//    1    3:new             #55  <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #56  <Method void StringBuilder()>
	//    4   10:ldc1            #196 <String "getConnectedDeviceList() : connectivityType = ">
	//    5   12:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//    6   15:iload_1         
	//    7   16:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//    8   19:ldc1            #198 <String " deviceType = ">
	//    9   21:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:iload_2         
	//   11   25:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//   12   28:ldc1            #200 <String " dataType = ">
	//   13   30:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   14   33:iload_3         
	//   15   34:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//   16   37:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   17   40:invokestatic    #46  <Method int Log.d(String, String)>
	//   18   43:pop             
		mService = ShealthPlatformBinderFactory.getMyBinder(105, mObjectId);
	//   19   44:aload_0         
	//   20   45:bipush          105
	//   21   47:aload_0         
	//   22   48:getfield        #79  <Field int mObjectId>
	//   23   51:i2l             
	//   24   52:invokestatic    #180 <Method _PlatformSensorService ShealthPlatformBinderFactory.getMyBinder(int, long)>
	//   25   55:putfield        #173 <Field _PlatformSensorService mService>
		if(isValidConnectivityType(i)) goto _L2; else goto _L1
	//   26   58:aload_0         
	//   27   59:iload_1         
	//   28   60:invokespecial   #202 <Method boolean isValidConnectivityType(int)>
	//   29   63:ifne            72
_L1:
		Object obj = null;
	//   30   66:aconst_null     
	//   31   67:astore          4
_L4:
		return ((List) (obj));
	//   32   69:aload           4
	//   33   71:areturn         
_L2:
		if(!isValidDeviceType(j))
	//*  34   72:aload_0         
	//*  35   73:iload_2         
	//*  36   74:invokespecial   #204 <Method boolean isValidDeviceType(int)>
	//*  37   77:ifne            82
			return null;
	//   38   80:aconst_null     
	//   39   81:areturn         
		if(!isValidDataType(k))
	//*  40   82:aload_0         
	//*  41   83:iload_3         
	//*  42   84:invokespecial   #206 <Method boolean isValidDataType(int)>
	//*  43   87:ifne            92
			return null;
	//   44   90:aconst_null     
	//   45   91:areturn         
		if(!isAvailable(i, j, k))
	//*  46   92:aload_0         
	//*  47   93:iload_1         
	//*  48   94:iload_2         
	//*  49   95:iload_3         
	//*  50   96:invokevirtual   #210 <Method boolean isAvailable(int, int, int)>
	//*  51   99:ifne            104
			return null;
	//   52  102:aconst_null     
	//   53  103:areturn         
		if(mService != null)
	//*  54  104:aload_0         
	//*  55  105:getfield        #173 <Field _PlatformSensorService mService>
	//*  56  108:ifnull          228
		{
			ArrayList arraylist;
			List list;
			try
			{
				list = mService.getConnectedDevices(i, j, k);
	//   57  111:aload_0         
	//   58  112:getfield        #173 <Field _PlatformSensorService mService>
	//   59  115:iload_1         
	//   60  116:iload_2         
	//   61  117:iload_3         
	//   62  118:invokeinterface #213 <Method List _PlatformSensorService.getConnectedDevices(int, int, int)>
	//   63  123:astore          6
				arraylist = new ArrayList();
	//   64  125:new             #35  <Class ArrayList>
	//   65  128:dup             
	//   66  129:invokespecial   #36  <Method void ArrayList()>
	//   67  132:astore          5
			}
	//*  68  134:aload           6
	//*  69  136:ifnonnull       238
	//*  70  139:aconst_null     
	//*  71  140:areturn         
	//*  72  141:aload           5
	//*  73  143:astore          4
	//*  74  145:iload_1         
	//*  75  146:aload           6
	//*  76  148:invokeinterface #218 <Method int List.size()>
	//*  77  153:icmpge          69
	//*  78  156:aload           6
	//*  79  158:iload_1         
	//*  80  159:invokeinterface #222 <Method Object List.get(int)>
	//*  81  164:checkcast       #224 <Class _PrivilegeSensorDevice>
	//*  82  167:astore          4
	//*  83  169:aload           4
	//*  84  171:ifnull          205
	//*  85  174:new             #117 <Class PrivilegeSensorDevice>
	//*  86  177:dup             
	//*  87  178:aload           4
	//*  88  180:aload_0         
	//*  89  181:getfield        #74  <Field Context mContext>
	//*  90  184:invokespecial   #227 <Method void PrivilegeSensorDevice(_PrivilegeSensorDevice, Context)>
	//*  91  187:astore          4
	//*  92  189:aload           5
	//*  93  191:aload           4
	//*  94  193:invokeinterface #228 <Method boolean List.add(Object)>
	//*  95  198:pop             
	//*  96  199:aload_0         
	//*  97  200:aload           4
	//*  98  202:invokespecial   #230 <Method void addDeviceFound(PrivilegeSensorDevice)>
	//*  99  205:iload_1         
	//* 100  206:iconst_1        
	//* 101  207:iadd            
	//* 102  208:istore_1        
	//* 103  209:goto            141
			catch(RemoteException remoteexception)
	//* 104  212:astore          4
			{
				Log.e(TAG, remoteexception.toString());
	//  105  214:getstatic       #28  <Field String TAG>
	//  106  217:aload           4
	//  107  219:invokevirtual   #231 <Method String RemoteException.toString()>
	//  108  222:invokestatic    #142 <Method int Log.e(String, String)>
	//  109  225:pop             
				return null;
	//  110  226:aconst_null     
	//  111  227:areturn         
			}
			if(list == null)
				return null;
		} else
		{
			throw new PrivilegeSensorServiceNotBoundException("getConnectedDeviceList - ShealthSensorService is not bounded.");
	//  112  228:new             #192 <Class PrivilegeSensorServiceNotBoundException>
	//  113  231:dup             
	//  114  232:ldc1            #233 <String "getConnectedDeviceList - ShealthSensorService is not bounded.">
	//  115  234:invokespecial   #234 <Method void PrivilegeSensorServiceNotBoundException(String)>
	//  116  237:athrow          
		}
		break MISSING_BLOCK_LABEL_238;
_L5:
		obj = ((Object) (arraylist));
		if(i >= list.size()) goto _L4; else goto _L3
_L3:
		obj = ((Object) ((_PrivilegeSensorDevice)list.get(i)));
		if(obj == null)
			break MISSING_BLOCK_LABEL_205;
		obj = ((Object) (new PrivilegeSensorDevice(((_PrivilegeSensorDevice) (obj)), mContext)));
		((List) (arraylist)).add(obj);
		addDeviceFound(((PrivilegeSensorDevice) (obj)));
		i++;
		  goto _L5
		i = 0;
	//  117  238:iconst_0        
	//  118  239:istore_1        
		  goto _L5
	//* 119  240:goto            141
	}

	public boolean isAvailable(int i, int j, int k)
		throws RemoteException, IllegalArgumentException, PrivilegeSensorServiceNotBoundException
	{
		Log.d(TAG, (new StringBuilder()).append("isAvailable() : connectivityType = ").append(i).append(" deviceType = ").append(j).append(" dataType = ").append(k).toString());
	//    0    0:getstatic       #28  <Field String TAG>
	//    1    3:new             #55  <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #56  <Method void StringBuilder()>
	//    4   10:ldc1            #238 <String "isAvailable() : connectivityType = ">
	//    5   12:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//    6   15:iload_1         
	//    7   16:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//    8   19:ldc1            #198 <String " deviceType = ">
	//    9   21:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:iload_2         
	//   11   25:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//   12   28:ldc1            #200 <String " dataType = ">
	//   13   30:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   14   33:iload_3         
	//   15   34:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//   16   37:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   17   40:invokestatic    #46  <Method int Log.d(String, String)>
	//   18   43:pop             
		mService = ShealthPlatformBinderFactory.getMyBinder(105, mObjectId);
	//   19   44:aload_0         
	//   20   45:bipush          105
	//   21   47:aload_0         
	//   22   48:getfield        #79  <Field int mObjectId>
	//   23   51:i2l             
	//   24   52:invokestatic    #180 <Method _PlatformSensorService ShealthPlatformBinderFactory.getMyBinder(int, long)>
	//   25   55:putfield        #173 <Field _PlatformSensorService mService>
		break MISSING_BLOCK_LABEL_58;
		if(isValidConnectivityType(i) && isValidDeviceType(j) && isValidDataType(k))
	//*  26   58:aload_0         
	//*  27   59:iload_1         
	//*  28   60:invokespecial   #202 <Method boolean isValidConnectivityType(int)>
	//*  29   63:ifne            68
	//*  30   66:iconst_0        
	//*  31   67:ireturn         
	//*  32   68:aload_0         
	//*  33   69:iload_2         
	//*  34   70:invokespecial   #204 <Method boolean isValidDeviceType(int)>
	//*  35   73:ifeq            66
	//*  36   76:aload_0         
	//*  37   77:iload_3         
	//*  38   78:invokespecial   #206 <Method boolean isValidDataType(int)>
	//*  39   81:ifeq            66
		{
			boolean flag = true;
	//   40   84:iconst_1        
	//   41   85:istore          4
			if(mService != null)
	//*  42   87:aload_0         
	//*  43   88:getfield        #173 <Field _PlatformSensorService mService>
	//*  44   91:ifnull          159
			{
				try
				{
					i = mService.checkAvailability(i, j, k);
	//   45   94:aload_0         
	//   46   95:getfield        #173 <Field _PlatformSensorService mService>
	//   47   98:iload_1         
	//   48   99:iload_2         
	//   49  100:iload_3         
	//   50  101:invokeinterface #242 <Method int _PlatformSensorService.checkAvailability(int, int, int)>
	//   51  106:istore_1        
				}
	//*  52  107:getstatic       #28  <Field String TAG>
	//*  53  110:new             #55  <Class StringBuilder>
	//*  54  113:dup             
	//*  55  114:invokespecial   #56  <Method void StringBuilder()>
	//*  56  117:ldc1            #244 <String "isAvailable() : code = ">
	//*  57  119:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//*  58  122:iload_1         
	//*  59  123:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//*  60  126:invokevirtual   #72  <Method String StringBuilder.toString()>
	//*  61  129:invokestatic    #46  <Method int Log.d(String, String)>
	//*  62  132:pop             
	//*  63  133:iload_1         
	//*  64  134:ifne            66
	//*  65  137:iconst_1        
	//*  66  138:ireturn         
				catch(RemoteException remoteexception)
	//*  67  139:astore          5
				{
					Log.e(TAG, remoteexception.toString());
	//   68  141:getstatic       #28  <Field String TAG>
	//   69  144:aload           5
	//   70  146:invokevirtual   #231 <Method String RemoteException.toString()>
	//   71  149:invokestatic    #142 <Method int Log.e(String, String)>
	//   72  152:pop             
					i = ((int) (flag));
	//   73  153:iload           4
	//   74  155:istore_1        
				}
				Log.d(TAG, (new StringBuilder()).append("isAvailable() : code = ").append(i).toString());
				if(i == 0)
					return true;
			} else
	//*  75  156:goto            107
			{
				throw new PrivilegeSensorServiceNotBoundException("isAvailable - ShealthSensorService is not bounded.");
	//   76  159:new             #192 <Class PrivilegeSensorServiceNotBoundException>
	//   77  162:dup             
	//   78  163:ldc1            #246 <String "isAvailable - ShealthSensorService is not bounded.">
	//   79  165:invokespecial   #234 <Method void PrivilegeSensorServiceNotBoundException(String)>
	//   80  168:athrow          
			}
		}
		return false;
	}

	private static final String TAG = ((Class) (com/samsung/android/sdk/health/sensor/ShealthPlatformDeviceFinder)).getSimpleName();
	private Context mContext;
	private ArrayList mDiscoveredDeviceList;
	private int mObjectId;
	private _PlatformSensorService mService;

	static 
	{
	//    0    0:ldc1            #2   <Class ShealthPlatformDeviceFinder>
	//    1    2:invokevirtual   #26  <Method String Class.getSimpleName()>
	//    2    5:putstatic       #28  <Field String TAG>
	//*   3    8:return          
	}
}
