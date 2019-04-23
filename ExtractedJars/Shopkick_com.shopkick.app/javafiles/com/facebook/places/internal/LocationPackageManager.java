// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places.internal;

import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.internal.Utility;
import java.util.Locale;
import java.util.concurrent.*;

// Referenced classes of package com.facebook.places.internal:
//			LocationScanner, LocationPackageRequestParams, LocationPackage, ScannerException, 
//			ScannerFactory, BleScanner, WifiScanner

public class LocationPackageManager
{
	public static interface Listener
	{

		public abstract void onLocationPackage(LocationPackage locationpackage);
	}


	public LocationPackageManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}

	private static void logException(String s, Throwable throwable)
	{
		if(FacebookSdk.isDebugEnabled())
	//*   0    0:invokestatic    #49  <Method boolean FacebookSdk.isDebugEnabled()>
	//*   1    3:ifeq            14
			Log.e("LocationPackageManager", s, throwable);
	//    2    6:ldc1            #19  <String "LocationPackageManager">
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokestatic    #55  <Method int Log.e(String, String, Throwable)>
	//    6   13:pop             
	//    7   14:return          
	}

	private static FutureTask newBluetoothScanFuture(LocationPackageRequestParams locationpackagerequestparams)
	{
		return new FutureTask(new Callable(locationpackagerequestparams) {

			public LocationPackage call()
				throws Exception
			{
				LocationPackage locationpackage = new LocationPackage();
			//    0    0:new             #28  <Class LocationPackage>
			//    1    3:dup             
			//    2    4:invokespecial   #29  <Method void LocationPackage()>
			//    3    7:astore_2        
				BleScanner blescanner;
				blescanner = ScannerFactory.newBleScanner(FacebookSdk.getApplicationContext(), requestParams);
			//    4    8:invokestatic    #35  <Method android.content.Context FacebookSdk.getApplicationContext()>
			//    5   11:aload_0         
			//    6   12:getfield        #18  <Field LocationPackageRequestParams val$requestParams>
			//    7   15:invokestatic    #41  <Method BleScanner ScannerFactory.newBleScanner(android.content.Context, LocationPackageRequestParams)>
			//    8   18:astore_3        
				blescanner.initAndCheckEligibility();
			//    9   19:aload_3         
			//   10   20:invokeinterface #46  <Method void BleScanner.initAndCheckEligibility()>
				blescanner.startScanning();
			//   11   25:aload_3         
			//   12   26:invokeinterface #49  <Method void BleScanner.startScanning()>
				int i;
				Exception exception1;
				try
				{
					Thread.sleep(requestParams.getBluetoothScanDurationMs());
			//   13   31:aload_0         
			//   14   32:getfield        #18  <Field LocationPackageRequestParams val$requestParams>
			//   15   35:invokevirtual   #55  <Method long LocationPackageRequestParams.getBluetoothScanDurationMs()>
			//   16   38:invokestatic    #61  <Method void Thread.sleep(long)>
				}
			//*  17   41:aload_3         
			//*  18   42:invokeinterface #64  <Method void BleScanner.stopScanning()>
			//*  19   47:aload_3         
			//*  20   48:invokeinterface #68  <Method int BleScanner.getErrorCode()>
			//*  21   53:istore_1        
			//*  22   54:iload_1         
			//*  23   55:ifne            75
			//*  24   58:aload_2         
			//*  25   59:aload_3         
			//*  26   60:invokeinterface #72  <Method java.util.List BleScanner.getScanResults()>
			//*  27   65:putfield        #76  <Field java.util.List LocationPackage.ambientBluetoothLe>
			//*  28   68:aload_2         
			//*  29   69:iconst_1        
			//*  30   70:putfield        #80  <Field boolean LocationPackage.isBluetoothScanningEnabled>
			//*  31   73:aload_2         
			//*  32   74:areturn         
			//*  33   75:invokestatic    #84  <Method boolean FacebookSdk.isDebugEnabled()>
			//*  34   78:ifeq            105
			//*  35   81:ldc1            #86  <String "LocationPackageManager">
			//*  36   83:invokestatic    #92  <Method Locale Locale.getDefault()>
			//*  37   86:ldc1            #94  <String "Bluetooth LE scan failed with error: %d">
			//*  38   88:iconst_1        
			//*  39   89:anewarray       Object[]
			//*  40   92:dup             
			//*  41   93:iconst_0        
			//*  42   94:iload_1         
			//*  43   95:invokestatic    #100 <Method Integer Integer.valueOf(int)>
			//*  44   98:aastore         
			//*  45   99:invokestatic    #106 <Method String String.format(Locale, String, Object[])>
			//*  46  102:invokestatic    #112 <Method void Utility.logd(String, String)>
			//*  47  105:aload_2         
			//*  48  106:iconst_0        
			//*  49  107:putfield        #80  <Field boolean LocationPackage.isBluetoothScanningEnabled>
			//*  50  110:aload_2         
			//*  51  111:areturn         
			//*  52  112:astore          4
			//*  53  114:aload_3         
			//*  54  115:invokeinterface #64  <Method void BleScanner.stopScanning()>
			//*  55  120:aload           4
			//*  56  122:athrow          
			//*  57  123:astore_3        
			//*  58  124:ldc1            #114 <String "Exception scanning for bluetooth beacons">
			//*  59  126:aload_3         
			//*  60  127:invokestatic    #118 <Method void LocationPackageManager.access$300(String, Throwable)>
			//*  61  130:aload_2         
			//*  62  131:iconst_0        
			//*  63  132:putfield        #80  <Field boolean LocationPackage.isBluetoothScanningEnabled>
			//*  64  135:aload_2         
			//*  65  136:areturn         
				catch(Exception exception2) { }
			//   66  137:astore          4
				blescanner.stopScanning();
				i = blescanner.getErrorCode();
				if(i != 0)
					break MISSING_BLOCK_LABEL_75;
				locationpackage.ambientBluetoothLe = blescanner.getScanResults();
				locationpackage.isBluetoothScanningEnabled = true;
				return locationpackage;
				if(FacebookSdk.isDebugEnabled())
					Utility.logd("LocationPackageManager", String.format(Locale.getDefault(), "Bluetooth LE scan failed with error: %d", new Object[] {
						Integer.valueOf(i)
					}));
				locationpackage.isBluetoothScanningEnabled = false;
				return locationpackage;
				exception1;
				try
				{
					blescanner.stopScanning();
					throw exception1;
				}
				catch(Exception exception)
				{
					LocationPackageManager.logException("Exception scanning for bluetooth beacons", ((Throwable) (exception)));
				}
				locationpackage.isBluetoothScanningEnabled = false;
				return locationpackage;
			//*  67  139:goto            41
			}

			public volatile Object call()
				throws Exception
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #122 <Method LocationPackage call()>
			//    2    4:areturn         
			}

			final LocationPackageRequestParams val$requestParams;

			
			{
				requestParams = locationpackagerequestparams;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field LocationPackageRequestParams val$requestParams>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:new             #57  <Class FutureTask>
	//    1    3:dup             
	//    2    4:new             #10  <Class LocationPackageManager$3>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #60  <Method void LocationPackageManager$3(LocationPackageRequestParams)>
	//    6   12:invokespecial   #63  <Method void FutureTask(Callable)>
	//    7   15:areturn         
	}

	private static FutureTask newLocationScanFuture(LocationScanner locationscanner, LocationPackageRequestParams locationpackagerequestparams)
	{
		return new FutureTask(new Callable(locationscanner) {

			public LocationPackage call()
				throws Exception
			{
				Exception exception;
				LocationPackage locationpackage = new LocationPackage();
			//    0    0:new             #30  <Class LocationPackage>
			//    1    3:dup             
			//    2    4:invokespecial   #31  <Method void LocationPackage()>
			//    3    7:astore_1        
				try
				{
					locationpackage.location = locationScanner.getLocation();
			//    4    8:aload_1         
			//    5    9:aload_0         
			//    6   10:getfield        #18  <Field LocationScanner val$locationScanner>
			//    7   13:invokeinterface #37  <Method android.location.Location LocationScanner.getLocation()>
			//    8   18:putfield        #41  <Field android.location.Location LocationPackage.location>
				}
			//*   9   21:aload_1         
			//*  10   22:areturn         
			//*  11   23:aload_1         
			//*  12   24:getstatic       #47  <Field ScannerException$Type ScannerException$Type.UNKNOWN_ERROR>
			//*  13   27:putfield        #50  <Field ScannerException$Type LocationPackage.locationError>
			//*  14   30:aload_1         
			//*  15   31:areturn         
				catch(ScannerException scannerexception)
			//*  16   32:astore_2        
				{
					locationpackage.locationError = scannerexception.type;
			//   17   33:aload_1         
			//   18   34:aload_2         
			//   19   35:getfield        #53  <Field ScannerException$Type ScannerException.type>
			//   20   38:putfield        #50  <Field ScannerException$Type LocationPackage.locationError>
					LocationPackageManager.logException("Exception while getting location", ((Throwable) (scannerexception)));
			//   21   41:ldc1            #55  <String "Exception while getting location">
			//   22   43:aload_2         
			//   23   44:invokestatic    #59  <Method void LocationPackageManager.access$300(String, Throwable)>
					return locationpackage;
			//   24   47:aload_1         
			//   25   48:areturn         
				}
				// Misplaced declaration of an exception variable
				catch(Exception exception)
				{
					locationpackage.locationError = ScannerException.Type.UNKNOWN_ERROR;
					return locationpackage;
				}
				return locationpackage;
			//*  26   49:astore_2        
			//*  27   50:goto            23
			}

			public volatile Object call()
				throws Exception
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #63  <Method LocationPackage call()>
			//    2    4:areturn         
			}

			final LocationScanner val$locationScanner;

			
			{
				locationScanner = locationscanner;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field LocationScanner val$locationScanner>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:new             #57  <Class FutureTask>
	//    1    3:dup             
	//    2    4:new             #8   <Class LocationPackageManager$2>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #68  <Method void LocationPackageManager$2(LocationScanner)>
	//    6   12:invokespecial   #63  <Method void FutureTask(Callable)>
	//    7   15:areturn         
	}

	private static FutureTask newWifiScanFuture(LocationPackageRequestParams locationpackagerequestparams)
	{
		return new FutureTask(new Callable(locationpackagerequestparams) {

			public LocationPackage call()
				throws Exception
			{
				LocationPackage locationpackage = new LocationPackage();
			//    0    0:new             #28  <Class LocationPackage>
			//    1    3:dup             
			//    2    4:invokespecial   #29  <Method void LocationPackage()>
			//    3    7:astore_1        
				WifiScanner wifiscanner = ScannerFactory.newWifiScanner(FacebookSdk.getApplicationContext(), requestParams);
			//    4    8:invokestatic    #35  <Method android.content.Context FacebookSdk.getApplicationContext()>
			//    5   11:aload_0         
			//    6   12:getfield        #18  <Field LocationPackageRequestParams val$requestParams>
			//    7   15:invokestatic    #41  <Method WifiScanner ScannerFactory.newWifiScanner(android.content.Context, LocationPackageRequestParams)>
			//    8   18:astore_2        
				wifiscanner.initAndCheckEligibility();
			//    9   19:aload_2         
			//   10   20:invokeinterface #46  <Method void WifiScanner.initAndCheckEligibility()>
				locationpackage.connectedWifi = wifiscanner.getConnectedWifi();
			//   11   25:aload_1         
			//   12   26:aload_2         
			//   13   27:invokeinterface #50  <Method WifiScanResult WifiScanner.getConnectedWifi()>
			//   14   32:putfield        #54  <Field WifiScanResult LocationPackage.connectedWifi>
				locationpackage.isWifiScanningEnabled = wifiscanner.isWifiScanningEnabled();
			//   15   35:aload_1         
			//   16   36:aload_2         
			//   17   37:invokeinterface #58  <Method boolean WifiScanner.isWifiScanningEnabled()>
			//   18   42:putfield        #61  <Field boolean LocationPackage.isWifiScanningEnabled>
				if(!locationpackage.isWifiScanningEnabled)
					break MISSING_BLOCK_LABEL_76;
			//   19   45:aload_1         
			//   20   46:getfield        #61  <Field boolean LocationPackage.isWifiScanningEnabled>
			//   21   49:ifeq            76
				locationpackage.ambientWifi = wifiscanner.getWifiScans();
			//   22   52:aload_1         
			//   23   53:aload_2         
			//   24   54:invokeinterface #65  <Method java.util.List WifiScanner.getWifiScans()>
			//   25   59:putfield        #69  <Field java.util.List LocationPackage.ambientWifi>
				return locationpackage;
			//   26   62:aload_1         
			//   27   63:areturn         
				Exception exception;
				exception;
			//   28   64:astore_2        
				LocationPackageManager.logException("Exception scanning for wifi access points", ((Throwable) (exception)));
			//   29   65:ldc1            #71  <String "Exception scanning for wifi access points">
			//   30   67:aload_2         
			//   31   68:invokestatic    #75  <Method void LocationPackageManager.access$300(String, Throwable)>
				locationpackage.isWifiScanningEnabled = false;
			//   32   71:aload_1         
			//   33   72:iconst_0        
			//   34   73:putfield        #61  <Field boolean LocationPackage.isWifiScanningEnabled>
				return locationpackage;
			//   35   76:aload_1         
			//   36   77:areturn         
			}

			public volatile Object call()
				throws Exception
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #79  <Method LocationPackage call()>
			//    2    4:areturn         
			}

			final LocationPackageRequestParams val$requestParams;

			
			{
				requestParams = locationpackagerequestparams;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field LocationPackageRequestParams val$requestParams>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:new             #57  <Class FutureTask>
	//    1    3:dup             
	//    2    4:new             #12  <Class LocationPackageManager$4>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #70  <Method void LocationPackageManager$4(LocationPackageRequestParams)>
	//    6   12:invokespecial   #63  <Method void FutureTask(Callable)>
	//    7   15:areturn         
	}

	public static void requestLocationPackage(LocationPackageRequestParams locationpackagerequestparams, Listener listener)
	{
		FacebookSdk.getExecutor().execute(new Runnable(locationpackagerequestparams, listener) {

			public void run()
			{
				LocationPackage locationpackage = new LocationPackage();
			//    0    0:new             #31  <Class LocationPackage>
			//    1    3:dup             
			//    2    4:invokespecial   #32  <Method void LocationPackage()>
			//    3    7:astore          5
				boolean flag = requestParams.isLocationScanEnabled();
			//    4    9:aload_0         
			//    5   10:getfield        #18  <Field LocationPackageRequestParams val$requestParams>
			//    6   13:invokevirtual   #38  <Method boolean LocationPackageRequestParams.isLocationScanEnabled()>
			//    7   16:istore_1        
				Object obj2 = null;
			//    8   17:aconst_null     
			//    9   18:astore          4
				if(!flag) goto _L2; else goto _L1
			//   10   20:iload_1         
			//   11   21:ifeq            298
_L1:
				Object obj;
				obj = ((Object) (ScannerFactory.newLocationScanner(FacebookSdk.getApplicationContext(), requestParams)));
			//   12   24:invokestatic    #44  <Method android.content.Context FacebookSdk.getApplicationContext()>
			//   13   27:aload_0         
			//   14   28:getfield        #18  <Field LocationPackageRequestParams val$requestParams>
			//   15   31:invokestatic    #50  <Method LocationScanner ScannerFactory.newLocationScanner(android.content.Context, LocationPackageRequestParams)>
			//   16   34:astore_2        
				((LocationScanner) (obj)).initAndCheckEligibility();
			//   17   35:aload_2         
			//   18   36:invokeinterface #55  <Method void LocationScanner.initAndCheckEligibility()>
				obj = ((Object) (LocationPackageManager.newLocationScanFuture(((LocationScanner) (obj)), requestParams)));
			//   19   41:aload_2         
			//   20   42:aload_0         
			//   21   43:getfield        #18  <Field LocationPackageRequestParams val$requestParams>
			//   22   46:invokestatic    #59  <Method FutureTask LocationPackageManager.access$000(LocationScanner, LocationPackageRequestParams)>
			//   23   49:astore_2        
				FacebookSdk.getExecutor().execute(((Runnable) (obj)));
			//   24   50:invokestatic    #63  <Method Executor FacebookSdk.getExecutor()>
			//   25   53:aload_2         
			//   26   54:invokeinterface #69  <Method void Executor.execute(Runnable)>
			//*  27   59:goto            62
_L3:
				Object obj1;
				if(!requestParams.isWifiScanEnabled())
					break MISSING_BLOCK_LABEL_303;
			//   28   62:aload_0         
			//   29   63:getfield        #18  <Field LocationPackageRequestParams val$requestParams>
			//   30   66:invokevirtual   #72  <Method boolean LocationPackageRequestParams.isWifiScanEnabled()>
			//   31   69:ifeq            303
				obj1 = ((Object) (LocationPackageManager.newWifiScanFuture(requestParams)));
			//   32   72:aload_0         
			//   33   73:getfield        #18  <Field LocationPackageRequestParams val$requestParams>
			//   34   76:invokestatic    #76  <Method FutureTask LocationPackageManager.access$100(LocationPackageRequestParams)>
			//   35   79:astore_3        
				FacebookSdk.getExecutor().execute(((Runnable) (obj1)));
			//   36   80:invokestatic    #63  <Method Executor FacebookSdk.getExecutor()>
			//   37   83:aload_3         
			//   38   84:invokeinterface #69  <Method void Executor.execute(Runnable)>
			//*  39   89:goto            92
_L4:
				if(requestParams.isBluetoothScanEnabled())
			//*  40   92:aload_0         
			//*  41   93:getfield        #18  <Field LocationPackageRequestParams val$requestParams>
			//*  42   96:invokevirtual   #79  <Method boolean LocationPackageRequestParams.isBluetoothScanEnabled()>
			//*  43   99:ifeq            121
				{
					obj2 = ((Object) (LocationPackageManager.newBluetoothScanFuture(requestParams)));
			//   44  102:aload_0         
			//   45  103:getfield        #18  <Field LocationPackageRequestParams val$requestParams>
			//   46  106:invokestatic    #82  <Method FutureTask LocationPackageManager.access$200(LocationPackageRequestParams)>
			//   47  109:astore          4
					FacebookSdk.getExecutor().execute(((Runnable) (obj2)));
			//   48  111:invokestatic    #63  <Method Executor FacebookSdk.getExecutor()>
			//   49  114:aload           4
			//   50  116:invokeinterface #69  <Method void Executor.execute(Runnable)>
				}
				if(obj2 == null)
					break MISSING_BLOCK_LABEL_168;
			//   51  121:aload           4
			//   52  123:ifnull          168
				obj2 = ((Object) ((LocationPackage)((FutureTask) (obj2)).get()));
			//   53  126:aload           4
			//   54  128:invokevirtual   #88  <Method Object FutureTask.get()>
			//   55  131:checkcast       #31  <Class LocationPackage>
			//   56  134:astore          4
				locationpackage.ambientBluetoothLe = ((LocationPackage) (obj2)).ambientBluetoothLe;
			//   57  136:aload           5
			//   58  138:aload           4
			//   59  140:getfield        #92  <Field java.util.List LocationPackage.ambientBluetoothLe>
			//   60  143:putfield        #92  <Field java.util.List LocationPackage.ambientBluetoothLe>
				locationpackage.isBluetoothScanningEnabled = ((LocationPackage) (obj2)).isBluetoothScanningEnabled;
			//   61  146:aload           5
			//   62  148:aload           4
			//   63  150:getfield        #96  <Field boolean LocationPackage.isBluetoothScanningEnabled>
			//   64  153:putfield        #96  <Field boolean LocationPackage.isBluetoothScanningEnabled>
				break MISSING_BLOCK_LABEL_168;
			//   65  156:goto            168
				Exception exception;
				exception;
			//   66  159:astore          4
				LocationPackageManager.logException("Exception scanning for bluetooth beacons", ((Throwable) (exception)));
			//   67  161:ldc1            #98  <String "Exception scanning for bluetooth beacons">
			//   68  163:aload           4
			//   69  165:invokestatic    #102 <Method void LocationPackageManager.access$300(String, Throwable)>
				if(obj1 == null)
					break MISSING_BLOCK_LABEL_217;
			//   70  168:aload_3         
			//   71  169:ifnull          217
				obj1 = ((Object) ((LocationPackage)((FutureTask) (obj1)).get()));
			//   72  172:aload_3         
			//   73  173:invokevirtual   #88  <Method Object FutureTask.get()>
			//   74  176:checkcast       #31  <Class LocationPackage>
			//   75  179:astore_3        
				locationpackage.isWifiScanningEnabled = ((LocationPackage) (obj1)).isWifiScanningEnabled;
			//   76  180:aload           5
			//   77  182:aload_3         
			//   78  183:getfield        #105 <Field boolean LocationPackage.isWifiScanningEnabled>
			//   79  186:putfield        #105 <Field boolean LocationPackage.isWifiScanningEnabled>
				locationpackage.connectedWifi = ((LocationPackage) (obj1)).connectedWifi;
			//   80  189:aload           5
			//   81  191:aload_3         
			//   82  192:getfield        #109 <Field WifiScanResult LocationPackage.connectedWifi>
			//   83  195:putfield        #109 <Field WifiScanResult LocationPackage.connectedWifi>
				locationpackage.ambientWifi = ((LocationPackage) (obj1)).ambientWifi;
			//   84  198:aload           5
			//   85  200:aload_3         
			//   86  201:getfield        #112 <Field java.util.List LocationPackage.ambientWifi>
			//   87  204:putfield        #112 <Field java.util.List LocationPackage.ambientWifi>
				break MISSING_BLOCK_LABEL_217;
			//   88  207:goto            217
				obj1;
			//   89  210:astore_3        
				LocationPackageManager.logException("Exception scanning for wifi access points", ((Throwable) (obj1)));
			//   90  211:ldc1            #114 <String "Exception scanning for wifi access points">
			//   91  213:aload_3         
			//   92  214:invokestatic    #102 <Method void LocationPackageManager.access$300(String, Throwable)>
				if(obj == null)
					break MISSING_BLOCK_LABEL_286;
			//   93  217:aload_2         
			//   94  218:ifnull          286
				obj = ((Object) ((LocationPackage)((FutureTask) (obj)).get()));
			//   95  221:aload_2         
			//   96  222:invokevirtual   #88  <Method Object FutureTask.get()>
			//   97  225:checkcast       #31  <Class LocationPackage>
			//   98  228:astore_2        
				locationpackage.locationError = ((LocationPackage) (obj)).locationError;
			//   99  229:aload           5
			//  100  231:aload_2         
			//  101  232:getfield        #118 <Field ScannerException$Type LocationPackage.locationError>
			//  102  235:putfield        #118 <Field ScannerException$Type LocationPackage.locationError>
				locationpackage.location = ((LocationPackage) (obj)).location;
			//  103  238:aload           5
			//  104  240:aload_2         
			//  105  241:getfield        #122 <Field android.location.Location LocationPackage.location>
			//  106  244:putfield        #122 <Field android.location.Location LocationPackage.location>
				break MISSING_BLOCK_LABEL_286;
			//  107  247:goto            286
				obj;
			//  108  250:astore_2        
				try
				{
					LocationPackageManager.logException("Exception getting location", ((Throwable) (obj)));
			//  109  251:ldc1            #124 <String "Exception getting location">
			//  110  253:aload_2         
			//  111  254:invokestatic    #102 <Method void LocationPackageManager.access$300(String, Throwable)>
				}
			//* 112  257:goto            286
			//* 113  260:astore_2        
			//* 114  261:ldc1            #126 <String "Exception requesting a location package">
			//* 115  263:aload_2         
			//* 116  264:invokestatic    #102 <Method void LocationPackageManager.access$300(String, Throwable)>
			//* 117  267:goto            286
				// Misplaced declaration of an exception variable
				catch(Object obj)
			//* 118  270:astore_2        
				{
					LocationPackageManager.logException("Exception scanning for locations", ((Throwable) (obj)));
			//  119  271:ldc1            #128 <String "Exception scanning for locations">
			//  120  273:aload_2         
			//  121  274:invokestatic    #102 <Method void LocationPackageManager.access$300(String, Throwable)>
					locationpackage.locationError = ((ScannerException) (obj)).type;
			//  122  277:aload           5
			//  123  279:aload_2         
			//  124  280:getfield        #131 <Field ScannerException$Type ScannerException.type>
			//  125  283:putfield        #118 <Field ScannerException$Type LocationPackage.locationError>
				}
				// Misplaced declaration of an exception variable
				catch(Object obj)
				{
					LocationPackageManager.logException("Exception requesting a location package", ((Throwable) (obj)));
				}
				listener.onLocationPackage(locationpackage);
			//  126  286:aload_0         
			//  127  287:getfield        #20  <Field LocationPackageManager$Listener val$listener>
			//  128  290:aload           5
			//  129  292:invokeinterface #137 <Method void LocationPackageManager$Listener.onLocationPackage(LocationPackage)>
				return;
			//  130  297:return          
_L2:
				obj = null;
			//  131  298:aconst_null     
			//  132  299:astore_2        
				  goto _L3
			//* 133  300:goto            62
				obj1 = null;
			//  134  303:aconst_null     
			//  135  304:astore_3        
				  goto _L4
			//* 136  305:goto            92
			}

			final Listener val$listener;
			final LocationPackageRequestParams val$requestParams;

			
			{
				requestParams = locationpackagerequestparams;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field LocationPackageRequestParams val$requestParams>
				listener = listener1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field LocationPackageManager$Listener val$listener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:invokestatic    #76  <Method Executor FacebookSdk.getExecutor()>
	//    1    3:new             #6   <Class LocationPackageManager$1>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #78  <Method void LocationPackageManager$1(LocationPackageRequestParams, LocationPackageManager$Listener)>
	//    6   12:invokeinterface #84  <Method void Executor.execute(Runnable)>
	//    7   17:return          
	}

	private static final String TAG = "LocationPackageManager";


/*
	static FutureTask access$000(LocationScanner locationscanner, LocationPackageRequestParams locationpackagerequestparams)
	{
		return newLocationScanFuture(locationscanner, locationpackagerequestparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #29  <Method FutureTask newLocationScanFuture(LocationScanner, LocationPackageRequestParams)>
	//    3    5:areturn         
	}

*/


/*
	static FutureTask access$100(LocationPackageRequestParams locationpackagerequestparams)
	{
		return newWifiScanFuture(locationpackagerequestparams);
	//    0    0:aload_0         
	//    1    1:invokestatic    #34  <Method FutureTask newWifiScanFuture(LocationPackageRequestParams)>
	//    2    4:areturn         
	}

*/


/*
	static FutureTask access$200(LocationPackageRequestParams locationpackagerequestparams)
	{
		return newBluetoothScanFuture(locationpackagerequestparams);
	//    0    0:aload_0         
	//    1    1:invokestatic    #38  <Method FutureTask newBluetoothScanFuture(LocationPackageRequestParams)>
	//    2    4:areturn         
	}

*/


/*
	static void access$300(String s, Throwable throwable)
	{
		logException(s, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #43  <Method void logException(String, Throwable)>
		return;
	//    3    5:return          
	}

*/
}
