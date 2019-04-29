// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			AssetEvent, AssetId, MissionMapType, MissionMapImage, 
//			MissionMapDataType, MissionMapStatus, Error, Event, 
//			EventType

public abstract class MissionMapEvent extends AssetEvent
{
	private static final class CppProxy extends MissionMapEvent
	{

		private native void nativeDestroy(long l);

		private native AssetId native_assetId(long l);

		private native boolean native_equals(long l, Event event);

		private native EventType native_eventType(long l);

		private native boolean native_forcedPublish(long l);

		private native String native_key(long l);

		private native MissionMapDataType native_mapDataType(long l);

		private native String native_mapId(long l);

		private native String native_mapMetadata(long l);

		private native MissionMapStatus native_mapStatus(long l);

		private native MissionMapType native_mapType(long l);

		private native Error native_mapUnavailableError(long l);

		private native String native_mapVersion(long l);

		private native MissionMapImage native_staticMissionMapImage(long l);

		private native Date native_timestamp(long l);

		public AssetId assetId()
		{
			return native_assetId(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #65  <Method AssetId native_assetId(long)>
		//    4    8:areturn         
		}

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #70  <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #35  <Field long nativeRef>
		//    8   16:invokespecial   #72  <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		public boolean equals(Event event)
		{
			return native_equals(nativeRef, event);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #76  <Method boolean native_equals(long, Event)>
		//    5    9:ireturn         
		}

		public EventType eventType()
		{
			return native_eventType(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #80  <Method EventType native_eventType(long)>
		//    4    8:areturn         
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #83  <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #87  <Method void Object.finalize()>
		//    4    8:return          
		}

		public boolean forcedPublish()
		{
			return native_forcedPublish(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #91  <Method boolean native_forcedPublish(long)>
		//    4    8:ireturn         
		}

		public String key()
		{
			return native_key(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #95  <Method String native_key(long)>
		//    4    8:areturn         
		}

		public MissionMapDataType mapDataType()
		{
			return native_mapDataType(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #99  <Method MissionMapDataType native_mapDataType(long)>
		//    4    8:areturn         
		}

		public String mapId()
		{
			return native_mapId(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #102 <Method String native_mapId(long)>
		//    4    8:areturn         
		}

		public String mapMetadata()
		{
			return native_mapMetadata(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #105 <Method String native_mapMetadata(long)>
		//    4    8:areturn         
		}

		public MissionMapStatus mapStatus()
		{
			return native_mapStatus(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #109 <Method MissionMapStatus native_mapStatus(long)>
		//    4    8:areturn         
		}

		public MissionMapType mapType()
		{
			return native_mapType(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #113 <Method MissionMapType native_mapType(long)>
		//    4    8:areturn         
		}

		public Error mapUnavailableError()
		{
			return native_mapUnavailableError(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #117 <Method Error native_mapUnavailableError(long)>
		//    4    8:areturn         
		}

		public String mapVersion()
		{
			return native_mapVersion(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #120 <Method String native_mapVersion(long)>
		//    4    8:areturn         
		}

		public MissionMapImage staticMissionMapImage()
		{
			return native_staticMissionMapImage(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #124 <Method MissionMapImage native_staticMissionMapImage(long)>
		//    4    8:areturn         
		}

		public Date timestamp()
		{
			return native_timestamp(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #128 <Method Date native_timestamp(long)>
		//    4    8:areturn         
		}

		static final boolean $assertionsDisabled = false;
		private final AtomicBoolean destroyed = new AtomicBoolean(false);
		private final long nativeRef;

		static 
		{
		//    0    0:return          
		}

		private CppProxy(long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void MissionMapEvent()>
		//    2    4:aload_0         
		//    3    5:new             #21  <Class AtomicBoolean>
		//    4    8:dup             
		//    5    9:iconst_0        
		//    6   10:invokespecial   #24  <Method void AtomicBoolean(boolean)>
		//    7   13:putfield        #26  <Field AtomicBoolean destroyed>
			if(l == 0L)
		//*   8   16:lload_1         
		//*   9   17:lconst_0        
		//*  10   18:lcmp            
		//*  11   19:ifne            32
			{
				throw new RuntimeException("nativeRef is zero");
		//   12   22:new             #28  <Class RuntimeException>
		//   13   25:dup             
		//   14   26:ldc1            #30  <String "nativeRef is zero">
		//   15   28:invokespecial   #33  <Method void RuntimeException(String)>
		//   16   31:athrow          
			} else
			{
				nativeRef = l;
		//   17   32:aload_0         
		//   18   33:lload_1         
		//   19   34:putfield        #35  <Field long nativeRef>
				return;
		//   20   37:return          
			}
		}
	}


	public MissionMapEvent()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void AssetEvent()>
	//    2    4:return          
	}

	public static native MissionMapEvent create(AssetId assetid, String s, MissionMapType missionmaptype, MissionMapImage missionmapimage);

	public abstract MissionMapDataType mapDataType();

	public abstract String mapId();

	public abstract String mapMetadata();

	public abstract MissionMapStatus mapStatus();

	public abstract MissionMapType mapType();

	public abstract Error mapUnavailableError();

	public abstract String mapVersion();

	public abstract MissionMapImage staticMissionMapImage();

	public static final String MAX_RSSI_KEY = "minRSSI";
	public static final String MIN_RSSI_KEY = "minRSSI";
	public static final String WIFI_BAD_REGIONS_KEY = "wifiBadRegions";
	public static final String WIFI_COLOR_MAP_KEY = "wifiColorMap";
	public static final String WIFI_ICONS_KEY = "wifiIcons";
	public static final String WIFI_LEGEND_METADATA_KEY = "wifiLegendMetadata";
}