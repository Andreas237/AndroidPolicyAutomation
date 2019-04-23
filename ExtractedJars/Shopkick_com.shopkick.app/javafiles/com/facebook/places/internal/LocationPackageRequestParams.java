// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places.internal;


public class LocationPackageRequestParams
{
	public static class Builder
	{

		public LocationPackageRequestParams build()
		{
			return new LocationPackageRequestParams(this);
		//    0    0:new             #6   <Class LocationPackageRequestParams>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #102 <Method void LocationPackageRequestParams(LocationPackageRequestParams$Builder, LocationPackageRequestParams$1)>
		//    5    9:areturn         
		}

		public Builder setBluetoothFlushResultsTimeoutMs(long l)
		{
			bluetoothFlushResultsTimeoutMs = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #76  <Field long bluetoothFlushResultsTimeoutMs>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setBluetoothMaxScanResults(int i)
		{
			bluetoothMaxScanResults = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #72  <Field int bluetoothMaxScanResults>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setBluetoothScanDurationMs(long l)
		{
			bluetoothScanDurationMs = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #70  <Field long bluetoothScanDurationMs>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setBluetoothScanEnabled(boolean flag)
		{
			isBluetoothScanEnabled = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #66  <Field boolean isBluetoothScanEnabled>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setLastLocationMaxAgeMs(long l)
		{
			lastLocationMaxAgeMs = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #50  <Field long lastLocationMaxAgeMs>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setLocationMaxAccuracyMeters(float f)
		{
			locationMaxAccuracyMeters = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #42  <Field float locationMaxAccuracyMeters>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setLocationProviders(String as[])
		{
			locationProviders = as;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #39  <Field String[] locationProviders>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setLocationRequestTimeoutMs(long l)
		{
			locationRequestTimeoutMs = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #46  <Field long locationRequestTimeoutMs>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setLocationScanEnabled(boolean flag)
		{
			isLocationScanEnabled = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #33  <Field boolean isLocationScanEnabled>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setWifiActiveScanAllowed(boolean flag)
		{
			isWifiActiveScanAllowed = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #62  <Field boolean isWifiActiveScanAllowed>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setWifiActiveScanForced(boolean flag)
		{
			isWifiActiveScanForced = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #64  <Field boolean isWifiActiveScanForced>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setWifiMaxScanResults(int i)
		{
			wifiMaxScanResults = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #56  <Field int wifiMaxScanResults>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setWifiScanEnabled(boolean flag)
		{
			isWifiScanEnabled = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #52  <Field boolean isWifiScanEnabled>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setWifiScanMaxAgeMs(long l)
		{
			wifiScanMaxAgeMs = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #54  <Field long wifiScanMaxAgeMs>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setWifiScanTimeoutMs(long l)
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
		static boolean access$000(Builder builder)
		{
			return builder.isLocationScanEnabled;
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field boolean isLocationScanEnabled>
		//    2    4:ireturn         
		}

*/


/*
		static String[] access$100(Builder builder)
		{
			return builder.locationProviders;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field String[] locationProviders>
		//    2    4:areturn         
		}

*/


/*
		static boolean access$1000(Builder builder)
		{
			return builder.isWifiActiveScanForced;
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field boolean isWifiActiveScanForced>
		//    2    4:ireturn         
		}

*/


/*
		static boolean access$1100(Builder builder)
		{
			return builder.isBluetoothScanEnabled;
		//    0    0:aload_0         
		//    1    1:getfield        #66  <Field boolean isBluetoothScanEnabled>
		//    2    4:ireturn         
		}

*/


/*
		static long access$1200(Builder builder)
		{
			return builder.bluetoothScanDurationMs;
		//    0    0:aload_0         
		//    1    1:getfield        #70  <Field long bluetoothScanDurationMs>
		//    2    4:lreturn         
		}

*/


/*
		static int access$1300(Builder builder)
		{
			return builder.bluetoothMaxScanResults;
		//    0    0:aload_0         
		//    1    1:getfield        #72  <Field int bluetoothMaxScanResults>
		//    2    4:ireturn         
		}

*/


/*
		static long access$1400(Builder builder)
		{
			return builder.bluetoothFlushResultsTimeoutMs;
		//    0    0:aload_0         
		//    1    1:getfield        #76  <Field long bluetoothFlushResultsTimeoutMs>
		//    2    4:lreturn         
		}

*/


/*
		static float access$200(Builder builder)
		{
			return builder.locationMaxAccuracyMeters;
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field float locationMaxAccuracyMeters>
		//    2    4:freturn         
		}

*/


/*
		static long access$300(Builder builder)
		{
			return builder.locationRequestTimeoutMs;
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field long locationRequestTimeoutMs>
		//    2    4:lreturn         
		}

*/


/*
		static long access$400(Builder builder)
		{
			return builder.lastLocationMaxAgeMs;
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field long lastLocationMaxAgeMs>
		//    2    4:lreturn         
		}

*/


/*
		static boolean access$500(Builder builder)
		{
			return builder.isWifiScanEnabled;
		//    0    0:aload_0         
		//    1    1:getfield        #52  <Field boolean isWifiScanEnabled>
		//    2    4:ireturn         
		}

*/


/*
		static long access$600(Builder builder)
		{
			return builder.wifiScanMaxAgeMs;
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field long wifiScanMaxAgeMs>
		//    2    4:lreturn         
		}

*/


/*
		static int access$700(Builder builder)
		{
			return builder.wifiMaxScanResults;
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field int wifiMaxScanResults>
		//    2    4:ireturn         
		}

*/


/*
		static long access$800(Builder builder)
		{
			return builder.wifiScanTimeoutMs;
		//    0    0:aload_0         
		//    1    1:getfield        #60  <Field long wifiScanTimeoutMs>
		//    2    4:lreturn         
		}

*/


/*
		static boolean access$900(Builder builder)
		{
			return builder.isWifiActiveScanAllowed;
		//    0    0:aload_0         
		//    1    1:getfield        #62  <Field boolean isWifiActiveScanAllowed>
		//    2    4:ireturn         
		}

*/

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #31  <Method void Object()>
			isLocationScanEnabled = true;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #33  <Field boolean isLocationScanEnabled>
			locationProviders = LocationPackageRequestParams.DEFAULT_LOCATION_PROVIDERS;
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


	private LocationPackageRequestParams(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method void Object()>
		isLocationScanEnabled = builder.isLocationScanEnabled;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #77  <Method boolean LocationPackageRequestParams$Builder.access$000(LocationPackageRequestParams$Builder)>
	//    5    9:putfield        #79  <Field boolean isLocationScanEnabled>
		locationProviders = builder.locationProviders;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #83  <Method String[] LocationPackageRequestParams$Builder.access$100(LocationPackageRequestParams$Builder)>
	//    9   17:putfield        #85  <Field String[] locationProviders>
		locationMaxAccuracyMeters = builder.locationMaxAccuracyMeters;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #89  <Method float LocationPackageRequestParams$Builder.access$200(LocationPackageRequestParams$Builder)>
	//   13   25:putfield        #91  <Field float locationMaxAccuracyMeters>
		locationRequestTimeoutMs = builder.locationRequestTimeoutMs;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokestatic    #95  <Method long LocationPackageRequestParams$Builder.access$300(LocationPackageRequestParams$Builder)>
	//   17   33:putfield        #97  <Field long locationRequestTimeoutMs>
		lastLocationMaxAgeMs = builder.lastLocationMaxAgeMs;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokestatic    #100 <Method long LocationPackageRequestParams$Builder.access$400(LocationPackageRequestParams$Builder)>
	//   21   41:putfield        #102 <Field long lastLocationMaxAgeMs>
		isWifiScanEnabled = builder.isWifiScanEnabled;
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokestatic    #105 <Method boolean LocationPackageRequestParams$Builder.access$500(LocationPackageRequestParams$Builder)>
	//   25   49:putfield        #107 <Field boolean isWifiScanEnabled>
		wifiScanMaxAgeMs = builder.wifiScanMaxAgeMs;
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:invokestatic    #110 <Method long LocationPackageRequestParams$Builder.access$600(LocationPackageRequestParams$Builder)>
	//   29   57:putfield        #112 <Field long wifiScanMaxAgeMs>
		wifiMaxScanResults = builder.wifiMaxScanResults;
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:invokestatic    #116 <Method int LocationPackageRequestParams$Builder.access$700(LocationPackageRequestParams$Builder)>
	//   33   65:putfield        #118 <Field int wifiMaxScanResults>
		wifiScanTimeoutMs = builder.wifiScanTimeoutMs;
	//   34   68:aload_0         
	//   35   69:aload_1         
	//   36   70:invokestatic    #121 <Method long LocationPackageRequestParams$Builder.access$800(LocationPackageRequestParams$Builder)>
	//   37   73:putfield        #123 <Field long wifiScanTimeoutMs>
		isWifiActiveScanAllowed = builder.isWifiActiveScanAllowed;
	//   38   76:aload_0         
	//   39   77:aload_1         
	//   40   78:invokestatic    #126 <Method boolean LocationPackageRequestParams$Builder.access$900(LocationPackageRequestParams$Builder)>
	//   41   81:putfield        #128 <Field boolean isWifiActiveScanAllowed>
		isWifiActiveScanForced = builder.isWifiActiveScanForced;
	//   42   84:aload_0         
	//   43   85:aload_1         
	//   44   86:invokestatic    #131 <Method boolean LocationPackageRequestParams$Builder.access$1000(LocationPackageRequestParams$Builder)>
	//   45   89:putfield        #133 <Field boolean isWifiActiveScanForced>
		isBluetoothScanEnabled = builder.isBluetoothScanEnabled;
	//   46   92:aload_0         
	//   47   93:aload_1         
	//   48   94:invokestatic    #136 <Method boolean LocationPackageRequestParams$Builder.access$1100(LocationPackageRequestParams$Builder)>
	//   49   97:putfield        #138 <Field boolean isBluetoothScanEnabled>
		bluetoothScanDurationMs = builder.bluetoothScanDurationMs;
	//   50  100:aload_0         
	//   51  101:aload_1         
	//   52  102:invokestatic    #141 <Method long LocationPackageRequestParams$Builder.access$1200(LocationPackageRequestParams$Builder)>
	//   53  105:putfield        #143 <Field long bluetoothScanDurationMs>
		bluetoothMaxScanResults = builder.bluetoothMaxScanResults;
	//   54  108:aload_0         
	//   55  109:aload_1         
	//   56  110:invokestatic    #146 <Method int LocationPackageRequestParams$Builder.access$1300(LocationPackageRequestParams$Builder)>
	//   57  113:putfield        #148 <Field int bluetoothMaxScanResults>
		bluetoothFlushResultsTimeoutMs = builder.bluetoothFlushResultsTimeoutMs;
	//   58  116:aload_0         
	//   59  117:aload_1         
	//   60  118:invokestatic    #151 <Method long LocationPackageRequestParams$Builder.access$1400(LocationPackageRequestParams$Builder)>
	//   61  121:putfield        #153 <Field long bluetoothFlushResultsTimeoutMs>
	//   62  124:return          
	}


	public long getBluetoothFlushResultsTimeoutMs()
	{
		return bluetoothFlushResultsTimeoutMs;
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field long bluetoothFlushResultsTimeoutMs>
	//    2    4:lreturn         
	}

	public int getBluetoothMaxScanResults()
	{
		return bluetoothMaxScanResults;
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field int bluetoothMaxScanResults>
	//    2    4:ireturn         
	}

	public long getBluetoothScanDurationMs()
	{
		return bluetoothScanDurationMs;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field long bluetoothScanDurationMs>
	//    2    4:lreturn         
	}

	public long getLastLocationMaxAgeMs()
	{
		return lastLocationMaxAgeMs;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field long lastLocationMaxAgeMs>
	//    2    4:lreturn         
	}

	public float getLocationMaxAccuracyMeters()
	{
		return locationMaxAccuracyMeters;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field float locationMaxAccuracyMeters>
	//    2    4:freturn         
	}

	public String[] getLocationProviders()
	{
		return locationProviders;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field String[] locationProviders>
	//    2    4:areturn         
	}

	public long getLocationRequestTimeoutMs()
	{
		return locationRequestTimeoutMs;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field long locationRequestTimeoutMs>
	//    2    4:lreturn         
	}

	public int getWifiMaxScanResults()
	{
		return wifiMaxScanResults;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field int wifiMaxScanResults>
	//    2    4:ireturn         
	}

	public long getWifiScanMaxAgeMs()
	{
		return wifiScanMaxAgeMs;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field long wifiScanMaxAgeMs>
	//    2    4:lreturn         
	}

	public long getWifiScanTimeoutMs()
	{
		return wifiScanTimeoutMs;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field long wifiScanTimeoutMs>
	//    2    4:lreturn         
	}

	public boolean isBluetoothScanEnabled()
	{
		return isBluetoothScanEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field boolean isBluetoothScanEnabled>
	//    2    4:ireturn         
	}

	public boolean isLocationScanEnabled()
	{
		return isLocationScanEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field boolean isLocationScanEnabled>
	//    2    4:ireturn         
	}

	public boolean isWifiActiveScanAllowed()
	{
		return isWifiActiveScanAllowed;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field boolean isWifiActiveScanAllowed>
	//    2    4:ireturn         
	}

	public boolean isWifiActiveScanForced()
	{
		return isWifiActiveScanForced;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field boolean isWifiActiveScanForced>
	//    2    4:ireturn         
	}

	public boolean isWifiScanEnabled()
	{
		return isWifiScanEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field boolean isWifiScanEnabled>
	//    2    4:ireturn         
	}

	private static final boolean DEFAULT_BLUETOOTH_ENABLED = true;
	private static final long DEFAULT_BLUETOOTH_FLUSH_RESULTS_TIMEOUT_MS = 300L;
	private static final int DEFAULT_BLUETOOTH_MAX_SCAN_RESULTS = 25;
	private static final long DEFAULT_BLUETOOTH_SCAN_DURATION_MS = 500L;
	private static final long DEFAULT_LAST_LOCATION_MAX_AGE_MS = 60000L;
	private static final boolean DEFAULT_LOCATION_ENABLED = true;
	private static final float DEFAULT_LOCATION_MAX_ACCURACY_METERS = 100F;
	private static final String DEFAULT_LOCATION_PROVIDERS[] = {
		"network", "gps"
	};
	private static final long DEFAULT_LOCATION_REQUEST_TIMEOUT_MS = 30000L;
	private static final boolean DEFAULT_WIFI_ACTIVE_SCAN_ALLOWED = true;
	private static final boolean DEFAULT_WIFI_ACTIVE_SCAN_FORCED = false;
	private static final boolean DEFAULT_WIFI_ENABLED = true;
	private static final int DEFAULT_WIFI_MAX_SCAN_RESULTS = 25;
	private static final long DEFAULT_WIFI_SCAN_MAX_AGE_MS = 30000L;
	private static final long DEFAULT_WIFI_SCAN_TIMEOUT_MS = 6000L;
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
	private final String locationProviders[];
	private long locationRequestTimeoutMs;
	private int wifiMaxScanResults;
	private long wifiScanMaxAgeMs;
	private long wifiScanTimeoutMs;

	static 
	{
	//    0    0:iconst_2        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #64  <String "network">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #66  <String "gps">
	//    9   13:aastore         
	//   10   14:putstatic       #68  <Field String[] DEFAULT_LOCATION_PROVIDERS>
	//*  11   17:return          
	}


/*
	static String[] access$1500()
	{
		return DEFAULT_LOCATION_PROVIDERS;
	//    0    0:getstatic       #68  <Field String[] DEFAULT_LOCATION_PROVIDERS>
	//    1    3:areturn         
	}

*/
}
