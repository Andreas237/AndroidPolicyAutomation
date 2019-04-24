// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore;

import com.amap.api.mapcore.util.lh;

public class Inner_3dMap_locationOption
	implements Cloneable
{
	public static final class Inner_3dMap_Enum_LocationMode extends Enum
	{

		public static Inner_3dMap_Enum_LocationMode valueOf(String s)
		{
			return (Inner_3dMap_Enum_LocationMode)Enum.valueOf(com/autonavi/amap/mapcore/Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode, s);
		//    0    0:ldc1            #2   <Class Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode>
		//    4    9:areturn         
		}

		public static Inner_3dMap_Enum_LocationMode[] values()
		{
			return (Inner_3dMap_Enum_LocationMode[])((Inner_3dMap_Enum_LocationMode []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.autonavi.amap.mapcore.Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode_3B_.clone()>
		//    2    6:checkcast       #42  <Class Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode[]>
		//    3    9:areturn         
		}

		private static final Inner_3dMap_Enum_LocationMode $VALUES[];
		public static final Inner_3dMap_Enum_LocationMode Battery_Saving;
		public static final Inner_3dMap_Enum_LocationMode Device_Sensors;
		public static final Inner_3dMap_Enum_LocationMode Hight_Accuracy;

		static 
		{
			Battery_Saving = new Inner_3dMap_Enum_LocationMode("Battery_Saving", 0);
		//    0    0:new             #2   <Class Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "Battery_Saving">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode(String, int)>
		//    5   10:putstatic       #23  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode Battery_Saving>
			Device_Sensors = new Inner_3dMap_Enum_LocationMode("Device_Sensors", 1);
		//    6   13:new             #2   <Class Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "Device_Sensors">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode(String, int)>
		//   11   23:putstatic       #26  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode Device_Sensors>
			Hight_Accuracy = new Inner_3dMap_Enum_LocationMode("Hight_Accuracy", 2);
		//   12   26:new             #2   <Class Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "Hight_Accuracy">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode(String, int)>
		//   17   36:putstatic       #29  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode Hight_Accuracy>
			$VALUES = (new Inner_3dMap_Enum_LocationMode[] {
				Battery_Saving, Device_Sensors, Hight_Accuracy
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       Inner_3dMap_Enum_LocationMode[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode Battery_Saving>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode Device_Sensors>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode Hight_Accuracy>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode[] $VALUES>
		//*  33   64:return          
		}

		private Inner_3dMap_Enum_LocationMode(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class Inner_3dMap_Enum_LocationProtocol extends Enum
	{

		public static Inner_3dMap_Enum_LocationProtocol valueOf(String s)
		{
			return (Inner_3dMap_Enum_LocationProtocol)Enum.valueOf(com/autonavi/amap/mapcore/Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol, s);
		//    0    0:ldc1            #2   <Class Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol>
		//    1    2:aload_0         
		//    2    3:invokestatic    #42  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol>
		//    4    9:areturn         
		}

		public static Inner_3dMap_Enum_LocationProtocol[] values()
		{
			return (Inner_3dMap_Enum_LocationProtocol[])((Inner_3dMap_Enum_LocationProtocol []) ($VALUES)).clone();
		//    0    0:getstatic       #29  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol[] $VALUES>
		//    1    3:invokevirtual   #49  <Method Object _5B_Lcom.autonavi.amap.mapcore.Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol_3B_.clone()>
		//    2    6:checkcast       #45  <Class Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol[]>
		//    3    9:areturn         
		}

		public final int getValue()
		{
			return value;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field int value>
		//    2    4:ireturn         
		}

		private static final Inner_3dMap_Enum_LocationProtocol $VALUES[];
		public static final Inner_3dMap_Enum_LocationProtocol HTTP;
		public static final Inner_3dMap_Enum_LocationProtocol HTTPS;
		private int value;

		static 
		{
			HTTP = new Inner_3dMap_Enum_LocationProtocol("HTTP", 0, 0);
		//    0    0:new             #2   <Class Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "HTTP">
		//    3    6:iconst_0        
		//    4    7:iconst_0        
		//    5    8:invokespecial   #22  <Method void Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol(String, int, int)>
		//    6   11:putstatic       #24  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol HTTP>
			HTTPS = new Inner_3dMap_Enum_LocationProtocol("HTTPS", 1, 1);
		//    7   14:new             #2   <Class Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol>
		//    8   17:dup             
		//    9   18:ldc1            #25  <String "HTTPS">
		//   10   20:iconst_1        
		//   11   21:iconst_1        
		//   12   22:invokespecial   #22  <Method void Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol(String, int, int)>
		//   13   25:putstatic       #27  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol HTTPS>
			$VALUES = (new Inner_3dMap_Enum_LocationProtocol[] {
				HTTP, HTTPS
			});
		//   14   28:iconst_2        
		//   15   29:anewarray       Inner_3dMap_Enum_LocationProtocol[]
		//   16   32:dup             
		//   17   33:iconst_0        
		//   18   34:getstatic       #24  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol HTTP>
		//   19   37:aastore         
		//   20   38:dup             
		//   21   39:iconst_1        
		//   22   40:getstatic       #27  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol HTTPS>
		//   23   43:aastore         
		//   24   44:putstatic       #29  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol[] $VALUES>
		//*  25   47:return          
		}

		private Inner_3dMap_Enum_LocationProtocol(String s, int i, int j)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
			value = j;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #35  <Field int value>
		//    7   11:return          
		}
	}


	public Inner_3dMap_locationOption()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Object()>
		interval = 2000L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #50  <Long 2000L>
	//    4    8:putfield        #53  <Field long interval>
		httpTimeOut = lh.f;
	//    5   11:aload_0         
	//    6   12:getstatic       #59  <Field int lh.f>
	//    7   15:i2l             
	//    8   16:putfield        #61  <Field long httpTimeOut>
		isOnceLocation = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #63  <Field boolean isOnceLocation>
		isMockEnable = false;
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:putfield        #65  <Field boolean isMockEnable>
		isNeedAddress = true;
	//   15   29:aload_0         
	//   16   30:iconst_1        
	//   17   31:putfield        #67  <Field boolean isNeedAddress>
		isWifiActiveScan = true;
	//   18   34:aload_0         
	//   19   35:iconst_1        
	//   20   36:putfield        #69  <Field boolean isWifiActiveScan>
		lastWifiActiveScan = true;
	//   21   39:aload_0         
	//   22   40:iconst_1        
	//   23   41:putfield        #71  <Field boolean lastWifiActiveScan>
		locationMode = Inner_3dMap_Enum_LocationMode.Hight_Accuracy;
	//   24   44:aload_0         
	//   25   45:getstatic       #74  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode.Hight_Accuracy>
	//   26   48:putfield        #76  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode locationMode>
		isKillProcess = false;
	//   27   51:aload_0         
	//   28   52:iconst_0        
	//   29   53:putfield        #78  <Field boolean isKillProcess>
		isGpsFirst = false;
	//   30   56:aload_0         
	//   31   57:iconst_0        
	//   32   58:putfield        #80  <Field boolean isGpsFirst>
		isOffset = true;
	//   33   61:aload_0         
	//   34   62:iconst_1        
	//   35   63:putfield        #82  <Field boolean isOffset>
		isLocationCacheEnable = true;
	//   36   66:aload_0         
	//   37   67:iconst_1        
	//   38   68:putfield        #84  <Field boolean isLocationCacheEnable>
		isOnceLocationLatest = false;
	//   39   71:aload_0         
	//   40   72:iconst_0        
	//   41   73:putfield        #86  <Field boolean isOnceLocationLatest>
		sensorEnable = false;
	//   42   76:aload_0         
	//   43   77:iconst_0        
	//   44   78:putfield        #88  <Field boolean sensorEnable>
		isWifiScan = true;
	//   45   81:aload_0         
	//   46   82:iconst_1        
	//   47   83:putfield        #90  <Field boolean isWifiScan>
	//   48   86:return          
	}

	private Inner_3dMap_locationOption clone(Inner_3dMap_locationOption inner_3dmap_locationoption)
	{
		interval = inner_3dmap_locationoption.interval;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #53  <Field long interval>
	//    3    5:putfield        #53  <Field long interval>
		isOnceLocation = inner_3dmap_locationoption.isOnceLocation;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #63  <Field boolean isOnceLocation>
	//    7   13:putfield        #63  <Field boolean isOnceLocation>
		locationMode = inner_3dmap_locationoption.locationMode;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:getfield        #76  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode locationMode>
	//   11   21:putfield        #76  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode locationMode>
		isMockEnable = inner_3dmap_locationoption.isMockEnable;
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:getfield        #65  <Field boolean isMockEnable>
	//   15   29:putfield        #65  <Field boolean isMockEnable>
		isKillProcess = inner_3dmap_locationoption.isKillProcess;
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:getfield        #78  <Field boolean isKillProcess>
	//   19   37:putfield        #78  <Field boolean isKillProcess>
		isGpsFirst = inner_3dmap_locationoption.isGpsFirst;
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:getfield        #80  <Field boolean isGpsFirst>
	//   23   45:putfield        #80  <Field boolean isGpsFirst>
		isNeedAddress = inner_3dmap_locationoption.isNeedAddress;
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:getfield        #67  <Field boolean isNeedAddress>
	//   27   53:putfield        #67  <Field boolean isNeedAddress>
		isWifiActiveScan = inner_3dmap_locationoption.isWifiActiveScan;
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:getfield        #69  <Field boolean isWifiActiveScan>
	//   31   61:putfield        #69  <Field boolean isWifiActiveScan>
		httpTimeOut = inner_3dmap_locationoption.httpTimeOut;
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:getfield        #61  <Field long httpTimeOut>
	//   35   69:putfield        #61  <Field long httpTimeOut>
		isOffset = inner_3dmap_locationoption.isOffset;
	//   36   72:aload_0         
	//   37   73:aload_1         
	//   38   74:getfield        #82  <Field boolean isOffset>
	//   39   77:putfield        #82  <Field boolean isOffset>
		isLocationCacheEnable = inner_3dmap_locationoption.isLocationCacheEnable;
	//   40   80:aload_0         
	//   41   81:aload_1         
	//   42   82:getfield        #84  <Field boolean isLocationCacheEnable>
	//   43   85:putfield        #84  <Field boolean isLocationCacheEnable>
		isOnceLocationLatest = inner_3dmap_locationoption.isOnceLocationLatest;
	//   44   88:aload_0         
	//   45   89:aload_1         
	//   46   90:getfield        #86  <Field boolean isOnceLocationLatest>
	//   47   93:putfield        #86  <Field boolean isOnceLocationLatest>
		sensorEnable = inner_3dmap_locationoption.isSensorEnable();
	//   48   96:aload_0         
	//   49   97:aload_1         
	//   50   98:invokevirtual   #96  <Method boolean isSensorEnable()>
	//   51  101:putfield        #88  <Field boolean sensorEnable>
		isWifiScan = inner_3dmap_locationoption.isWifiScan();
	//   52  104:aload_0         
	//   53  105:aload_1         
	//   54  106:invokevirtual   #98  <Method boolean isWifiScan()>
	//   55  109:putfield        #90  <Field boolean isWifiScan>
		return this;
	//   56  112:aload_0         
	//   57  113:areturn         
	}

	public static String getAPIKEY()
	{
		return APIKEY;
	//    0    0:getstatic       #45  <Field String APIKEY>
	//    1    3:areturn         
	}

	public static void setLocationProtocol(Inner_3dMap_Enum_LocationProtocol inner_3dmap_enum_locationprotocol)
	{
		locationProtocol = inner_3dmap_enum_locationprotocol;
	//    0    0:aload_0         
	//    1    1:putstatic       #41  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol locationProtocol>
	//    2    4:return          
	}

	public Inner_3dMap_locationOption clone()
	{
		try
		{
			super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #108 <Method Object Object.clone()>
	//    2    4:pop             
		}
	//*   3    5:goto            13
		catch(Throwable throwable)
	//*   4    8:astore_1        
		{
			throwable.printStackTrace();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #111 <Method void Throwable.printStackTrace()>
		}
		return (new Inner_3dMap_locationOption()).clone(this);
	//    7   13:new             #2   <Class Inner_3dMap_locationOption>
	//    8   16:dup             
	//    9   17:invokespecial   #112 <Method void Inner_3dMap_locationOption()>
	//   10   20:aload_0         
	//   11   21:invokespecial   #114 <Method Inner_3dMap_locationOption clone(Inner_3dMap_locationOption)>
	//   12   24:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #118 <Method Inner_3dMap_locationOption clone()>
	//    2    4:areturn         
	}

	public long getHttpTimeOut()
	{
		return httpTimeOut;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field long httpTimeOut>
	//    2    4:lreturn         
	}

	public long getInterval()
	{
		return interval;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field long interval>
	//    2    4:lreturn         
	}

	public Inner_3dMap_Enum_LocationMode getLocationMode()
	{
		return locationMode;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode locationMode>
	//    2    4:areturn         
	}

	public Inner_3dMap_Enum_LocationProtocol getLocationProtocol()
	{
		return locationProtocol;
	//    0    0:getstatic       #41  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol locationProtocol>
	//    1    3:areturn         
	}

	public boolean isGpsFirst()
	{
		return isGpsFirst;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field boolean isGpsFirst>
	//    2    4:ireturn         
	}

	public boolean isKillProcess()
	{
		return isKillProcess;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field boolean isKillProcess>
	//    2    4:ireturn         
	}

	public boolean isLocationCacheEnable()
	{
		return isLocationCacheEnable;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field boolean isLocationCacheEnable>
	//    2    4:ireturn         
	}

	public boolean isMockEnable()
	{
		return isMockEnable;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field boolean isMockEnable>
	//    2    4:ireturn         
	}

	public boolean isNeedAddress()
	{
		return isNeedAddress;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field boolean isNeedAddress>
	//    2    4:ireturn         
	}

	public boolean isOffset()
	{
		return isOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field boolean isOffset>
	//    2    4:ireturn         
	}

	public boolean isOnceLocation()
	{
		if(isOnceLocationLatest)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field boolean isOnceLocationLatest>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		else
			return isOnceLocation;
	//    5    9:aload_0         
	//    6   10:getfield        #63  <Field boolean isOnceLocation>
	//    7   13:ireturn         
	}

	public boolean isOnceLocationLatest()
	{
		return isOnceLocationLatest;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field boolean isOnceLocationLatest>
	//    2    4:ireturn         
	}

	public boolean isSensorEnable()
	{
		return sensorEnable;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field boolean sensorEnable>
	//    2    4:ireturn         
	}

	public boolean isWifiActiveScan()
	{
		return isWifiActiveScan;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field boolean isWifiActiveScan>
	//    2    4:ireturn         
	}

	public boolean isWifiScan()
	{
		return isWifiScan;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field boolean isWifiScan>
	//    2    4:ireturn         
	}

	public Inner_3dMap_locationOption setGpsFirst(boolean flag)
	{
		isGpsFirst = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #80  <Field boolean isGpsFirst>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void setHttpTimeOut(long l)
	{
		httpTimeOut = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #61  <Field long httpTimeOut>
	//    3    5:return          
	}

	public Inner_3dMap_locationOption setInterval(long l)
	{
		long l1 = l;
	//    0    0:lload_1         
	//    1    1:lstore_3        
		if(l <= 800L)
	//*   2    2:lload_1         
	//*   3    3:ldc2w           #133 <Long 800L>
	//*   4    6:lcmp            
	//*   5    7:ifgt            14
			l1 = 800L;
	//    6   10:ldc2w           #133 <Long 800L>
	//    7   13:lstore_3        
		interval = l1;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #53  <Field long interval>
		return this;
	//   11   19:aload_0         
	//   12   20:areturn         
	}

	public Inner_3dMap_locationOption setKillProcess(boolean flag)
	{
		isKillProcess = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #78  <Field boolean isKillProcess>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void setLocationCacheEnable(boolean flag)
	{
		isLocationCacheEnable = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #84  <Field boolean isLocationCacheEnable>
	//    3    5:return          
	}

	public Inner_3dMap_locationOption setLocationMode(Inner_3dMap_Enum_LocationMode inner_3dmap_enum_locationmode)
	{
		locationMode = inner_3dmap_enum_locationmode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #76  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode locationMode>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void setMockEnable(boolean flag)
	{
		isMockEnable = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #65  <Field boolean isMockEnable>
	//    3    5:return          
	}

	public Inner_3dMap_locationOption setNeedAddress(boolean flag)
	{
		isNeedAddress = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #67  <Field boolean isNeedAddress>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Inner_3dMap_locationOption setOffset(boolean flag)
	{
		isOffset = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #82  <Field boolean isOffset>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Inner_3dMap_locationOption setOnceLocation(boolean flag)
	{
		isOnceLocation = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #63  <Field boolean isOnceLocation>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void setOnceLocationLatest(boolean flag)
	{
		isOnceLocationLatest = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #86  <Field boolean isOnceLocationLatest>
	//    3    5:return          
	}

	public void setSensorEnable(boolean flag)
	{
		sensorEnable = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #88  <Field boolean sensorEnable>
	//    3    5:return          
	}

	public void setWifiActiveScan(boolean flag)
	{
		isWifiActiveScan = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #69  <Field boolean isWifiActiveScan>
		lastWifiActiveScan = flag;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #71  <Field boolean lastWifiActiveScan>
	//    6   10:return          
	}

	public void setWifiScan(boolean flag)
	{
		isWifiScan = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #90  <Field boolean isWifiScan>
		if(isWifiScan)
	//*   3    5:aload_0         
	//*   4    6:getfield        #90  <Field boolean isWifiScan>
	//*   5    9:ifeq            21
		{
			isWifiActiveScan = lastWifiActiveScan;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #71  <Field boolean lastWifiActiveScan>
	//    9   17:putfield        #69  <Field boolean isWifiActiveScan>
			return;
	//   10   20:return          
		} else
		{
			isWifiActiveScan = false;
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:putfield        #69  <Field boolean isWifiActiveScan>
			return;
	//   14   26:return          
		}
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #150 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #151 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("interval:").append(String.valueOf(interval)).append("#");
	//    4    8:aload_1         
	//    5    9:ldc1            #153 <String "interval:">
	//    6   11:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:aload_0         
	//    8   15:getfield        #53  <Field long interval>
	//    9   18:invokestatic    #163 <Method String String.valueOf(long)>
	//   10   21:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   11   24:ldc1            #165 <String "#">
	//   12   26:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   13   29:pop             
		stringbuilder.append("isOnceLocation:").append(String.valueOf(isOnceLocation)).append("#");
	//   14   30:aload_1         
	//   15   31:ldc1            #167 <String "isOnceLocation:">
	//   16   33:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   17   36:aload_0         
	//   18   37:getfield        #63  <Field boolean isOnceLocation>
	//   19   40:invokestatic    #170 <Method String String.valueOf(boolean)>
	//   20   43:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   21   46:ldc1            #165 <String "#">
	//   22   48:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   23   51:pop             
		stringbuilder.append("locationMode:").append(String.valueOf(((Object) (locationMode)))).append("#");
	//   24   52:aload_1         
	//   25   53:ldc1            #172 <String "locationMode:">
	//   26   55:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   27   58:aload_0         
	//   28   59:getfield        #76  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode locationMode>
	//   29   62:invokestatic    #175 <Method String String.valueOf(Object)>
	//   30   65:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   31   68:ldc1            #165 <String "#">
	//   32   70:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   33   73:pop             
		stringbuilder.append("isMockEnable:").append(String.valueOf(isMockEnable)).append("#");
	//   34   74:aload_1         
	//   35   75:ldc1            #177 <String "isMockEnable:">
	//   36   77:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   37   80:aload_0         
	//   38   81:getfield        #65  <Field boolean isMockEnable>
	//   39   84:invokestatic    #170 <Method String String.valueOf(boolean)>
	//   40   87:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   41   90:ldc1            #165 <String "#">
	//   42   92:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   43   95:pop             
		stringbuilder.append("isKillProcess:").append(String.valueOf(isKillProcess)).append("#");
	//   44   96:aload_1         
	//   45   97:ldc1            #179 <String "isKillProcess:">
	//   46   99:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   47  102:aload_0         
	//   48  103:getfield        #78  <Field boolean isKillProcess>
	//   49  106:invokestatic    #170 <Method String String.valueOf(boolean)>
	//   50  109:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   51  112:ldc1            #165 <String "#">
	//   52  114:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   53  117:pop             
		stringbuilder.append("isGpsFirst:").append(String.valueOf(isGpsFirst)).append("#");
	//   54  118:aload_1         
	//   55  119:ldc1            #181 <String "isGpsFirst:">
	//   56  121:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   57  124:aload_0         
	//   58  125:getfield        #80  <Field boolean isGpsFirst>
	//   59  128:invokestatic    #170 <Method String String.valueOf(boolean)>
	//   60  131:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   61  134:ldc1            #165 <String "#">
	//   62  136:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   63  139:pop             
		stringbuilder.append("isNeedAddress:").append(String.valueOf(isNeedAddress)).append("#");
	//   64  140:aload_1         
	//   65  141:ldc1            #183 <String "isNeedAddress:">
	//   66  143:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   67  146:aload_0         
	//   68  147:getfield        #67  <Field boolean isNeedAddress>
	//   69  150:invokestatic    #170 <Method String String.valueOf(boolean)>
	//   70  153:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   71  156:ldc1            #165 <String "#">
	//   72  158:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   73  161:pop             
		stringbuilder.append("isWifiActiveScan:").append(String.valueOf(isWifiActiveScan)).append("#");
	//   74  162:aload_1         
	//   75  163:ldc1            #185 <String "isWifiActiveScan:">
	//   76  165:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   77  168:aload_0         
	//   78  169:getfield        #69  <Field boolean isWifiActiveScan>
	//   79  172:invokestatic    #170 <Method String String.valueOf(boolean)>
	//   80  175:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   81  178:ldc1            #165 <String "#">
	//   82  180:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   83  183:pop             
		stringbuilder.append("httpTimeOut:").append(String.valueOf(httpTimeOut)).append("#");
	//   84  184:aload_1         
	//   85  185:ldc1            #187 <String "httpTimeOut:">
	//   86  187:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   87  190:aload_0         
	//   88  191:getfield        #61  <Field long httpTimeOut>
	//   89  194:invokestatic    #163 <Method String String.valueOf(long)>
	//   90  197:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   91  200:ldc1            #165 <String "#">
	//   92  202:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   93  205:pop             
		stringbuilder.append("isOffset:").append(String.valueOf(isOffset)).append("#");
	//   94  206:aload_1         
	//   95  207:ldc1            #189 <String "isOffset:">
	//   96  209:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   97  212:aload_0         
	//   98  213:getfield        #82  <Field boolean isOffset>
	//   99  216:invokestatic    #170 <Method String String.valueOf(boolean)>
	//  100  219:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//  101  222:ldc1            #165 <String "#">
	//  102  224:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//  103  227:pop             
		stringbuilder.append("isLocationCacheEnable:").append(String.valueOf(isLocationCacheEnable)).append("#");
	//  104  228:aload_1         
	//  105  229:ldc1            #191 <String "isLocationCacheEnable:">
	//  106  231:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//  107  234:aload_0         
	//  108  235:getfield        #84  <Field boolean isLocationCacheEnable>
	//  109  238:invokestatic    #170 <Method String String.valueOf(boolean)>
	//  110  241:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//  111  244:ldc1            #165 <String "#">
	//  112  246:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//  113  249:pop             
		stringbuilder.append("isLocationCacheEnable:").append(String.valueOf(isLocationCacheEnable)).append("#");
	//  114  250:aload_1         
	//  115  251:ldc1            #191 <String "isLocationCacheEnable:">
	//  116  253:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//  117  256:aload_0         
	//  118  257:getfield        #84  <Field boolean isLocationCacheEnable>
	//  119  260:invokestatic    #170 <Method String String.valueOf(boolean)>
	//  120  263:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//  121  266:ldc1            #165 <String "#">
	//  122  268:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//  123  271:pop             
		stringbuilder.append("isOnceLocationLatest:").append(String.valueOf(isOnceLocationLatest)).append("#");
	//  124  272:aload_1         
	//  125  273:ldc1            #193 <String "isOnceLocationLatest:">
	//  126  275:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//  127  278:aload_0         
	//  128  279:getfield        #86  <Field boolean isOnceLocationLatest>
	//  129  282:invokestatic    #170 <Method String String.valueOf(boolean)>
	//  130  285:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//  131  288:ldc1            #165 <String "#">
	//  132  290:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//  133  293:pop             
		stringbuilder.append("sensorEnable:").append(String.valueOf(sensorEnable)).append("#");
	//  134  294:aload_1         
	//  135  295:ldc1            #195 <String "sensorEnable:">
	//  136  297:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//  137  300:aload_0         
	//  138  301:getfield        #88  <Field boolean sensorEnable>
	//  139  304:invokestatic    #170 <Method String String.valueOf(boolean)>
	//  140  307:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//  141  310:ldc1            #165 <String "#">
	//  142  312:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//  143  315:pop             
		return stringbuilder.toString();
	//  144  316:aload_1         
	//  145  317:invokevirtual   #197 <Method String StringBuilder.toString()>
	//  146  320:areturn         
	}

	static String APIKEY = "";
	private static Inner_3dMap_Enum_LocationProtocol locationProtocol;
	private long httpTimeOut;
	private long interval;
	private boolean isGpsFirst;
	private boolean isKillProcess;
	private boolean isLocationCacheEnable;
	private boolean isMockEnable;
	private boolean isNeedAddress;
	private boolean isOffset;
	private boolean isOnceLocation;
	private boolean isOnceLocationLatest;
	private boolean isWifiActiveScan;
	private boolean isWifiScan;
	private boolean lastWifiActiveScan;
	private Inner_3dMap_Enum_LocationMode locationMode;
	private boolean sensorEnable;

	static 
	{
		locationProtocol = Inner_3dMap_Enum_LocationProtocol.HTTP;
	//    0    0:getstatic       #39  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol.HTTP>
	//    1    3:putstatic       #41  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol locationProtocol>
	//    2    6:ldc1            #43  <String "">
	//    3    8:putstatic       #45  <Field String APIKEY>
	//*   4   11:return          
	}
}
