// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places.internal;

import android.content.Context;
import android.location.*;
import android.os.Bundle;
import android.os.HandlerThread;
import com.facebook.internal.Validate;
import java.util.*;

// Referenced classes of package com.facebook.places.internal:
//			LocationScanner, ScannerException, LocationPackageRequestParams

public class LocationScannerImpl
	implements LocationScanner, LocationListener
{

	public LocationScannerImpl(Context context1, LocationPackageRequestParams locationpackagerequestparams)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void Object()>
	//    6   12:putfield        #35  <Field Object scanLock>
		context = context1;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #37  <Field Context context>
		params = locationpackagerequestparams;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #39  <Field LocationPackageRequestParams params>
		locationManager = (LocationManager)context1.getSystemService("location");
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:ldc1            #41  <String "location">
	//   16   29:invokevirtual   #47  <Method Object Context.getSystemService(String)>
	//   17   32:checkcast       #49  <Class LocationManager>
	//   18   35:putfield        #51  <Field LocationManager locationManager>
	//   19   38:return          
	}

	private Location getFreshLocation()
		throws ScannerException
	{
		Object obj;
		freshLocation = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #60  <Field Location freshLocation>
		obj = ((Object) (new HandlerThread("LocationScanner")));
	//    3    5:new             #62  <Class HandlerThread>
	//    4    8:dup             
	//    5    9:ldc1            #64  <String "LocationScanner">
	//    6   11:invokespecial   #67  <Method void HandlerThread(String)>
	//    7   14:astore_1        
		((HandlerThread) (obj)).start();
	//    8   15:aload_1         
	//    9   16:invokevirtual   #70  <Method void HandlerThread.start()>
		String s;
		for(Iterator iterator = enabledProviders.iterator(); iterator.hasNext(); locationManager.requestLocationUpdates(s, 100L, 0.0F, ((LocationListener) (this)), ((HandlerThread) (obj)).getLooper()))
	//*  10   19:aload_0         
	//*  11   20:getfield        #72  <Field List enabledProviders>
	//*  12   23:invokeinterface #78  <Method Iterator List.iterator()>
	//*  13   28:astore_2        
	//*  14   29:aload_2         
	//*  15   30:invokeinterface #84  <Method boolean Iterator.hasNext()>
	//*  16   35:ifeq            68
			s = (String)iterator.next();
	//   17   38:aload_2         
	//   18   39:invokeinterface #88  <Method Object Iterator.next()>
	//   19   44:checkcast       #90  <Class String>
	//   20   47:astore_3        

	//   21   48:aload_0         
	//   22   49:getfield        #51  <Field LocationManager locationManager>
	//   23   52:aload_3         
	//   24   53:ldc2w           #14  <Long 100L>
	//   25   56:fconst_0        
	//   26   57:aload_0         
	//   27   58:aload_1         
	//   28   59:invokevirtual   #94  <Method android.os.Looper HandlerThread.getLooper()>
	//   29   62:invokevirtual   #98  <Method void LocationManager.requestLocationUpdates(String, long, float, LocationListener, android.os.Looper)>
	//*  30   65:goto            29
		synchronized(scanLock)
	//*  31   68:aload_0         
	//*  32   69:getfield        #35  <Field Object scanLock>
	//*  33   72:astore_2        
	//*  34   73:aload_2         
	//*  35   74:monitorenter    
		{
			scanLock.wait(params.getLocationRequestTimeoutMs());
	//   36   75:aload_0         
	//   37   76:getfield        #35  <Field Object scanLock>
	//   38   79:aload_0         
	//   39   80:getfield        #39  <Field LocationPackageRequestParams params>
	//   40   83:invokevirtual   #104 <Method long LocationPackageRequestParams.getLocationRequestTimeoutMs()>
	//   41   86:invokevirtual   #108 <Method void Object.wait(long)>
		}
	//   42   89:aload_2         
	//   43   90:monitorexit     
		break MISSING_BLOCK_LABEL_99;
	//   44   91:goto            99
		exception2;
	//   45   94:astore_3        
		obj1;
	//   46   95:aload_2         
		JVM INSTR monitorexit ;
	//   47   96:monitorexit     
		Exception exception;
		try
		{
			throw exception2;
	//   48   97:aload_3         
	//   49   98:athrow          
		}
	//*  50   99:aload_0         
	//*  51  100:getfield        #51  <Field LocationManager locationManager>
	//*  52  103:aload_0         
	//*  53  104:invokevirtual   #112 <Method void LocationManager.removeUpdates(LocationListener)>
	//*  54  107:aload_1         
	//*  55  108:invokevirtual   #115 <Method boolean HandlerThread.quit()>
	//*  56  111:pop             
	//*  57  112:aload_0         
	//*  58  113:getfield        #60  <Field Location freshLocation>
	//*  59  116:astore_1        
	//*  60  117:aload_1         
	//*  61  118:ifnull          123
	//*  62  121:aload_1         
	//*  63  122:areturn         
	//*  64  123:new             #56  <Class ScannerException>
	//*  65  126:dup             
	//*  66  127:getstatic       #121 <Field ScannerException$Type ScannerException$Type.TIMEOUT>
	//*  67  130:invokespecial   #124 <Method void ScannerException(ScannerException$Type)>
	//*  68  133:athrow          
	//*  69  134:astore_2        
	//*  70  135:aload_0         
	//*  71  136:getfield        #51  <Field LocationManager locationManager>
	//*  72  139:aload_0         
	//*  73  140:invokevirtual   #112 <Method void LocationManager.removeUpdates(LocationListener)>
	//*  74  143:aload_1         
	//*  75  144:invokevirtual   #115 <Method boolean HandlerThread.quit()>
	//*  76  147:pop             
	//*  77  148:aload_2         
	//*  78  149:athrow          
		catch(Exception exception1) { }
	//   79  150:astore_2        
		locationManager.removeUpdates(((LocationListener) (this)));
		((HandlerThread) (obj)).quit();
		obj = ((Object) (freshLocation));
		if(obj != null)
			return ((Location) (obj));
		else
			throw new ScannerException(ScannerException.Type.TIMEOUT);
		exception;
		locationManager.removeUpdates(((LocationListener) (this)));
		((HandlerThread) (obj)).quit();
		throw exception;
	//*  80  151:goto            99
	}

	private Location getLastLocation(String s)
	{
		s = ((String) (locationManager.getLastKnownLocation(s)));
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field LocationManager locationManager>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #130 <Method Location LocationManager.getLastKnownLocation(String)>
	//    4    8:astore_1        
		if(s != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          36
		{
			long l = ((Location) (s)).getTime();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #135 <Method long Location.getTime()>
	//    9   17:lstore_2        
			if(System.currentTimeMillis() - l < params.getLastLocationMaxAgeMs())
	//*  10   18:invokestatic    #140 <Method long System.currentTimeMillis()>
	//*  11   21:lload_2         
	//*  12   22:lsub            
	//*  13   23:aload_0         
	//*  14   24:getfield        #39  <Field LocationPackageRequestParams params>
	//*  15   27:invokevirtual   #143 <Method long LocationPackageRequestParams.getLastLocationMaxAgeMs()>
	//*  16   30:lcmp            
	//*  17   31:ifge            36
				return ((Location) (s));
	//   18   34:aload_1         
	//   19   35:areturn         
		}
		return null;
	//   20   36:aconst_null     
	//   21   37:areturn         
	}

	public Location getLocation()
		throws ScannerException
	{
		for(Iterator iterator = enabledProviders.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field List enabledProviders>
	//*   2    4:invokeinterface #78  <Method Iterator List.iterator()>
	//*   3    9:astore_1        
	//*   4   10:aload_1         
	//*   5   11:invokeinterface #84  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            39
		{
			Location location = getLastLocation((String)iterator.next());
	//    7   19:aload_0         
	//    8   20:aload_1         
	//    9   21:invokeinterface #88  <Method Object Iterator.next()>
	//   10   26:checkcast       #90  <Class String>
	//   11   29:invokespecial   #146 <Method Location getLastLocation(String)>
	//   12   32:astore_2        
			if(location != null)
	//*  13   33:aload_2         
	//*  14   34:ifnull          10
				return location;
	//   15   37:aload_2         
	//   16   38:areturn         
		}

		return getFreshLocation();
	//   17   39:aload_0         
	//   18   40:invokespecial   #148 <Method Location getFreshLocation()>
	//   19   43:areturn         
	}

	public void initAndCheckEligibility()
		throws ScannerException
	{
		if(Validate.hasLocationPermission(context))
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field Context context>
	//*   2    4:invokestatic    #155 <Method boolean Validate.hasLocationPermission(Context)>
	//*   3    7:ifeq            107
		{
			enabledProviders = ((List) (new ArrayList(params.getLocationProviders().length)));
	//    4   10:aload_0         
	//    5   11:new             #157 <Class ArrayList>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:getfield        #39  <Field LocationPackageRequestParams params>
	//    9   19:invokevirtual   #161 <Method String[] LocationPackageRequestParams.getLocationProviders()>
	//   10   22:arraylength     
	//   11   23:invokespecial   #164 <Method void ArrayList(int)>
	//   12   26:putfield        #72  <Field List enabledProviders>
			String as[] = params.getLocationProviders();
	//   13   29:aload_0         
	//   14   30:getfield        #39  <Field LocationPackageRequestParams params>
	//   15   33:invokevirtual   #161 <Method String[] LocationPackageRequestParams.getLocationProviders()>
	//   16   36:astore_3        
			int j = as.length;
	//   17   37:aload_3         
	//   18   38:arraylength     
	//   19   39:istore_2        
			for(int i = 0; i < j; i++)
	//*  20   40:iconst_0        
	//*  21   41:istore_1        
	//*  22   42:iload_1         
	//*  23   43:iload_2         
	//*  24   44:icmpge          83
			{
				String s = as[i];
	//   25   47:aload_3         
	//   26   48:iload_1         
	//   27   49:aaload          
	//   28   50:astore          4
				if(locationManager.isProviderEnabled(s))
	//*  29   52:aload_0         
	//*  30   53:getfield        #51  <Field LocationManager locationManager>
	//*  31   56:aload           4
	//*  32   58:invokevirtual   #168 <Method boolean LocationManager.isProviderEnabled(String)>
	//*  33   61:ifeq            76
					enabledProviders.add(((Object) (s)));
	//   34   64:aload_0         
	//   35   65:getfield        #72  <Field List enabledProviders>
	//   36   68:aload           4
	//   37   70:invokeinterface #172 <Method boolean List.add(Object)>
	//   38   75:pop             
			}

	//   39   76:iload_1         
	//   40   77:iconst_1        
	//   41   78:iadd            
	//   42   79:istore_1        
	//*  43   80:goto            42
			if(!enabledProviders.isEmpty())
	//*  44   83:aload_0         
	//*  45   84:getfield        #72  <Field List enabledProviders>
	//*  46   87:invokeinterface #175 <Method boolean List.isEmpty()>
	//*  47   92:ifne            96
				return;
	//   48   95:return          
			else
				throw new ScannerException(ScannerException.Type.DISABLED);
	//   49   96:new             #56  <Class ScannerException>
	//   50   99:dup             
	//   51  100:getstatic       #178 <Field ScannerException$Type ScannerException$Type.DISABLED>
	//   52  103:invokespecial   #124 <Method void ScannerException(ScannerException$Type)>
	//   53  106:athrow          
		} else
		{
			throw new ScannerException(ScannerException.Type.PERMISSION_DENIED);
	//   54  107:new             #56  <Class ScannerException>
	//   55  110:dup             
	//   56  111:getstatic       #181 <Field ScannerException$Type ScannerException$Type.PERMISSION_DENIED>
	//   57  114:invokespecial   #124 <Method void ScannerException(ScannerException$Type)>
	//   58  117:athrow          
		}
	}

	public void onLocationChanged(Location location)
	{
		if(freshLocation == null && location.getAccuracy() < params.getLocationMaxAccuracyMeters())
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field Location freshLocation>
	//*   2    4:ifnonnull       49
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #187 <Method float Location.getAccuracy()>
	//*   5   11:aload_0         
	//*   6   12:getfield        #39  <Field LocationPackageRequestParams params>
	//*   7   15:invokevirtual   #190 <Method float LocationPackageRequestParams.getLocationMaxAccuracyMeters()>
	//*   8   18:fcmpg           
	//*   9   19:ifge            49
		{
			synchronized(scanLock)
	//*  10   22:aload_0         
	//*  11   23:getfield        #35  <Field Object scanLock>
	//*  12   26:astore_2        
	//*  13   27:aload_2         
	//*  14   28:monitorenter    
			{
				freshLocation = location;
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:putfield        #60  <Field Location freshLocation>
				scanLock.notify();
	//   18   34:aload_0         
	//   19   35:getfield        #35  <Field Object scanLock>
	//   20   38:invokevirtual   #193 <Method void Object.notify()>
			}
	//   21   41:aload_2         
	//   22   42:monitorexit     
			return;
	//   23   43:return          
		} else
	//*  24   44:astore_1        
	//*  25   45:aload_2         
	//*  26   46:monitorexit     
	//*  27   47:aload_1         
	//*  28   48:athrow          
		{
			return;
	//   29   49:return          
		}
		location;
		obj;
		JVM INSTR monitorexit ;
		throw location;
	}

	public void onProviderDisabled(String s)
	{
	//    0    0:return          
	}

	public void onProviderEnabled(String s)
	{
	//    0    0:return          
	}

	public void onStatusChanged(String s, int i, Bundle bundle)
	{
	//    0    0:return          
	}

	private static final float MIN_DISTANCE_BETWEEN_UPDATES = 0F;
	private static final long MIN_TIME_BETWEEN_UPDATES = 100L;
	private Context context;
	private List enabledProviders;
	private Location freshLocation;
	private LocationManager locationManager;
	private LocationPackageRequestParams params;
	private final Object scanLock = new Object();
}
