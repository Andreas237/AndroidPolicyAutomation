// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places.internal;


// Referenced classes of package com.facebook.places.internal:
//			LocationPackageRequestParams

public static class LocationPackageRequestParams$Builder
{

	public LocationPackageRequestParams build()
	{
		return new LocationPackageRequestParams(this, ((LocationPackageRequestParams._cls1) (null)));
	//    0    0:new             #6   <Class LocationPackageRequestParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #102 <Method void LocationPackageRequestParams(LocationPackageRequestParams$Builder, LocationPackageRequestParams$1)>
	//    5    9:areturn         
	}

	public LocationPackageRequestParams$Builder setBluetoothFlushResultsTimeoutMs(long l)
	{
		bluetoothFlushResultsTimeoutMs = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #76  <Field long bluetoothFlushResultsTimeoutMs>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public LocationPackageRequestParams$Builder setBluetoothMaxScanResults(int i)
	{
		bluetoothMaxScanResults = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #72  <Field int bluetoothMaxScanResults>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public LocationPackageRequestParams$Builder setBluetoothScanDurationMs(long l)
	{
		bluetoothScanDurationMs = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #70  <Field long bluetoothScanDurationMs>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public LocationPackageRequestParams$Builder setBluetoothScanEnabled(boolean flag)
	{
		isBluetoothScanEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #66  <Field boolean isBluetoothScanEnabled>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public LocationPackageRequestParams$Builder setLastLocationMaxAgeMs(long l)
	{
		lastLocationMaxAgeMs = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #50  <Field long lastLocationMaxAgeMs>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public LocationPackageRequestParams$Builder setLocationMaxAccuracyMeters(float f)
	{
		locationMaxAccuracyMeters = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #42  <Field float locationMaxAccuracyMeters>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public LocationPackageRequestParams$Builder setLocationProviders(String as[])
	{
		locationProviders = as;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #39  <Field String[] locationProviders>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public LocationPackageRequestParams$Builder setLocationRequestTimeoutMs(long l)
	{
		locationRequestTimeoutMs = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #46  <Field long locationRequestTimeoutMs>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public LocationPackageRequestParams$Builder setLocationScanEnabled(boolean flag)
	{
		isLocationScanEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #33  <Field boolean isLocationScanEnabled>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public LocationPackageRequestParams$Builder setWifiActiveScanAllowed(boolean flag)
	{
		isWifiActiveScanAllowed = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #62  <Field boolean isWifiActiveScanAllowed>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public LocationPackageRequestParams$Builder setWifiActiveScanForced(boolean flag)
	{
		isWifiActiveScanForced = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #64  <Field boolean isWifiActiveScanForced>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public LocationPackageRequestParams$Builder setWifiMaxScanResults(int i)
	{
		wifiMaxScanResults = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #56  <Field int wifiMaxScanResults>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public LocationPackageRequestParams$Builder setWifiScanEnabled(boolean flag)
	{
		isWifiScanEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #52  <Field boolean isWifiScanEnabled>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public LocationPackageRequestParams$Builder setWifiScanMaxAgeMs(long l)
	{
		wifiScanMaxAgeMs = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #54  <Field long wifiScanMaxAgeMs>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public LocationPackageRequestParams$Builder setWifiScanTimeoutMs(long l)
	{
		wifiScanTimeoutMs = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #60  <Field long wifiScanTimeoutMs>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private long bluetoothFlushResultsTimeoutMs;
	private int bluetoothMaxScanResults;
	private long bluetoothScanDurationMs;
	private boolean isBluetoothScanEnabled;
	private boolean isLocationScanEnabled;
	private boolean isWifiActiveScanAllowed;
	private boolean isWifiActiveScanForced;
	private boolean isWifiScanEnabled;
	private long lastLocationMaxAgeMs;
	private float locationMaxAccuracyMeters;
	private String locationProviders[];
	private long locationRequestTimeoutMs;
	private int wifiMaxScanResults;
	private long wifiScanMaxAgeMs;
	private long wifiScanTimeoutMs;


/*
	static boolean access$000(LocationPackageRequestParams$Builder locationpackagerequestparams$builder)
	{
		return locationpackagerequestparams$builder.isLocationScanEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field boolean isLocationScanEnabled>
	//    2    4:ireturn         
	}

*/


/*
	static String[] access$100(LocationPackageRequestParams$Builder locationpackagerequestparams$builder)
	{
		return locationpackagerequestparams$builder.locationProviders;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String[] locationProviders>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$1000(LocationPackageRequestParams$Builder locationpackagerequestparams$builder)
	{
		return locationpackagerequestparams$builder.isWifiActiveScanForced;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field boolean isWifiActiveScanForced>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$1100(LocationPackageRequestParams$Builder locationpackagerequestparams$builder)
	{
		return locationpackagerequestparams$builder.isBluetoothScanEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field boolean isBluetoothScanEnabled>
	//    2    4:ireturn         
	}

*/


/*
	static long access$1200(LocationPackageRequestParams$Builder locationpackagerequestparams$builder)
	{
		return locationpackagerequestparams$builder.bluetoothScanDurationMs;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field long bluetoothScanDurationMs>
	//    2    4:lreturn         
	}

*/


/*
	static int access$1300(LocationPackageRequestParams$Builder locationpackagerequestparams$builder)
	{
		return locationpackagerequestparams$builder.bluetoothMaxScanResults;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field int bluetoothMaxScanResults>
	//    2    4:ireturn         
	}

*/


/*
	static long access$1400(LocationPackageRequestParams$Builder locationpackagerequestparams$builder)
	{
		return locationpackagerequestparams$builder.bluetoothFlushResultsTimeoutMs;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field long bluetoothFlushResultsTimeoutMs>
	//    2    4:lreturn         
	}

*/


/*
	static float access$200(LocationPackageRequestParams$Builder locationpackagerequestparams$builder)
	{
		return locationpackagerequestparams$builder.locationMaxAccuracyMeters;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field float locationMaxAccuracyMeters>
	//    2    4:freturn         
	}

*/


/*
	static long access$300(LocationPackageRequestParams$Builder locationpackagerequestparams$builder)
	{
		return locationpackagerequestparams$builder.locationRequestTimeoutMs;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field long locationRequestTimeoutMs>
	//    2    4:lreturn         
	}

*/


/*
	static long access$400(LocationPackageRequestParams$Builder locationpackagerequestparams$builder)
	{
		return locationpackagerequestparams$builder.lastLocationMaxAgeMs;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field long lastLocationMaxAgeMs>
	//    2    4:lreturn         
	}

*/


/*
	static boolean access$500(LocationPackageRequestParams$Builder locationpackagerequestparams$builder)
	{
		return locationpackagerequestparams$builder.isWifiScanEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field boolean isWifiScanEnabled>
	//    2    4:ireturn         
	}

*/


/*
	static long access$600(LocationPackageRequestParams$Builder locationpackagerequestparams$builder)
	{
		return locationpackagerequestparams$builder.wifiScanMaxAgeMs;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field long wifiScanMaxAgeMs>
	//    2    4:lreturn         
	}

*/


/*
	static int access$700(LocationPackageRequestParams$Builder locationpackagerequestparams$builder)
	{
		return locationpackagerequestparams$builder.wifiMaxScanResults;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int wifiMaxScanResults>
	//    2    4:ireturn         
	}

*/


/*
	static long access$800(LocationPackageRequestParams$Builder locationpackagerequestparams$builder)
	{
		return locationpackagerequestparams$builder.wifiScanTimeoutMs;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field long wifiScanTimeoutMs>
	//    2    4:lreturn         
	}

*/


/*
	static boolean access$900(LocationPackageRequestParams$Builder locationpackagerequestparams$builder)
	{
		return locationpackagerequestparams$builder.isWifiActiveScanAllowed;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field boolean isWifiActiveScanAllowed>
	//    2    4:ireturn         
	}

*/

	public LocationPackageRequestParams$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		isLocationScanEnabled = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #33  <Field boolean isLocationScanEnabled>
		locationProviders = LocationPackageRequestParams.access$1500();
	//    5    9:aload_0         
	//    6   10:invokestatic    #37  <Method String[] LocationPackageRequestParams.access$1500()>
	//    7   13:putfield        #39  <Field String[] locationProviders>
		locationMaxAccuracyMeters = 100F;
	//    8   16:aload_0         
	//    9   17:ldc1            #40  <Float 100F>
	//   10   19:putfield        #42  <Field float locationMaxAccuracyMeters>
		locationRequestTimeoutMs = 30000L;
	//   11   22:aload_0         
	//   12   23:ldc2w           #43  <Long 30000L>
	//   13   26:putfield        #46  <Field long locationRequestTimeoutMs>
		lastLocationMaxAgeMs = 60000L;
	//   14   29:aload_0         
	//   15   30:ldc2w           #47  <Long 60000L>
	//   16   33:putfield        #50  <Field long lastLocationMaxAgeMs>
		isWifiScanEnabled = true;
	//   17   36:aload_0         
	//   18   37:iconst_1        
	//   19   38:putfield        #52  <Field boolean isWifiScanEnabled>
		wifiScanMaxAgeMs = 30000L;
	//   20   41:aload_0         
	//   21   42:ldc2w           #43  <Long 30000L>
	//   22   45:putfield        #54  <Field long wifiScanMaxAgeMs>
		wifiMaxScanResults = 25;
	//   23   48:aload_0         
	//   24   49:bipush          25
	//   25   51:putfield        #56  <Field int wifiMaxScanResults>
		wifiScanTimeoutMs = 6000L;
	//   26   54:aload_0         
	//   27   55:ldc2w           #57  <Long 6000L>
	//   28   58:putfield        #60  <Field long wifiScanTimeoutMs>
		isWifiActiveScanAllowed = true;
	//   29   61:aload_0         
	//   30   62:iconst_1        
	//   31   63:putfield        #62  <Field boolean isWifiActiveScanAllowed>
		isWifiActiveScanForced = false;
	//   32   66:aload_0         
	//   33   67:iconst_0        
	//   34   68:putfield        #64  <Field boolean isWifiActiveScanForced>
		isBluetoothScanEnabled = true;
	//   35   71:aload_0         
	//   36   72:iconst_1        
	//   37   73:putfield        #66  <Field boolean isBluetoothScanEnabled>
		bluetoothScanDurationMs = 500L;
	//   38   76:aload_0         
	//   39   77:ldc2w           #67  <Long 500L>
	//   40   80:putfield        #70  <Field long bluetoothScanDurationMs>
		bluetoothMaxScanResults = 25;
	//   41   83:aload_0         
	//   42   84:bipush          25
	//   43   86:putfield        #72  <Field int bluetoothMaxScanResults>
		bluetoothFlushResultsTimeoutMs = 300L;
	//   44   89:aload_0         
	//   45   90:ldc2w           #73  <Long 300L>
	//   46   93:putfield        #76  <Field long bluetoothFlushResultsTimeoutMs>
	//   47   96:return          
	}
}
