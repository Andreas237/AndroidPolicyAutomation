// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places.internal;

import com.facebook.FacebookSdk;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.facebook.places.internal:
//			LocationPackageManager, ScannerException, LocationPackage, LocationPackageRequestParams, 
//			ScannerFactory, LocationScanner

static final class LocationPackageManager$1
	implements Runnable
{

	public void run()
	{
		LocationPackage locationpackage = new LocationPackage();
	//    0    0:new             #31  <Class LocationPackage>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void LocationPackage()>
	//    3    7:astore          5
		boolean flag = val$requestParams.isLocationScanEnabled();
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
		obj = ((Object) (ScannerFactory.newLocationScanner(FacebookSdk.getApplicationContext(), val$requestParams)));
	//   12   24:invokestatic    #44  <Method android.content.Context FacebookSdk.getApplicationContext()>
	//   13   27:aload_0         
	//   14   28:getfield        #18  <Field LocationPackageRequestParams val$requestParams>
	//   15   31:invokestatic    #50  <Method LocationScanner ScannerFactory.newLocationScanner(android.content.Context, LocationPackageRequestParams)>
	//   16   34:astore_2        
		((LocationScanner) (obj)).initAndCheckEligibility();
	//   17   35:aload_2         
	//   18   36:invokeinterface #55  <Method void LocationScanner.initAndCheckEligibility()>
		obj = ((Object) (LocationPackageManager.access$000(((LocationScanner) (obj)), val$requestParams)));
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
		if(!val$requestParams.isWifiScanEnabled())
			break MISSING_BLOCK_LABEL_303;
	//   28   62:aload_0         
	//   29   63:getfield        #18  <Field LocationPackageRequestParams val$requestParams>
	//   30   66:invokevirtual   #72  <Method boolean LocationPackageRequestParams.isWifiScanEnabled()>
	//   31   69:ifeq            303
		obj1 = ((Object) (LocationPackageManager.access$100(val$requestParams)));
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
		if(val$requestParams.isBluetoothScanEnabled())
	//*  40   92:aload_0         
	//*  41   93:getfield        #18  <Field LocationPackageRequestParams val$requestParams>
	//*  42   96:invokevirtual   #79  <Method boolean LocationPackageRequestParams.isBluetoothScanEnabled()>
	//*  43   99:ifeq            121
		{
			obj2 = ((Object) (LocationPackageManager.access$200(val$requestParams)));
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
		LocationPackageManager.access$300("Exception scanning for bluetooth beacons", ((Throwable) (exception)));
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
		LocationPackageManager.access$300("Exception scanning for wifi access points", ((Throwable) (obj1)));
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
			LocationPackageManager.access$300("Exception getting location", ((Throwable) (obj)));
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
			LocationPackageManager.access$300("Exception scanning for locations", ((Throwable) (obj)));
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
			LocationPackageManager.access$300("Exception requesting a location package", ((Throwable) (obj)));
		}
		val$listener.onLocationPackage(locationpackage);
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

	final stener val$listener;
	final LocationPackageRequestParams val$requestParams;

	LocationPackageManager$1(LocationPackageRequestParams locationpackagerequestparams, stener stener)
	{
		val$requestParams = locationpackagerequestparams;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field LocationPackageRequestParams val$requestParams>
		val$listener = stener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field LocationPackageManager$Listener val$listener>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
