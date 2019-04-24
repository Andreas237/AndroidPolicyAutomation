// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			ScheduleMultipleMappingData, TeamingSettingsData

public abstract class ScheduleUIServiceData
{
	private static final class CppProxy extends ScheduleUIServiceData
	{

		private native void nativeDestroy(long l);

		private native boolean native_doesScheduleSupportMissionParameters(long l);

		private native boolean native_doesScheduleSupportMissionPresets(long l);

		private native boolean native_getCheckIfSchedulesContainsMapId(long l);

		private native ArrayList native_getDataStates(long l);

		private native ArrayList native_getMappingScheduleList(long l);

		private native int native_getScheduleItemIndex(long l);

		private native ScheduleMultipleMappingData native_getScheduleMultipleMappingData(long l);

		private native HashMap native_getSimpleScheduleMap(long l);

		private native String native_getTeamingErrorMessage(long l);

		private native String native_getTimeoutTag(long l);

		private native ArrayList native_getViewStates(long l);

		private native boolean native_isScheduleMapsCapable(long l);

		private native boolean native_isScheduleWithMapsEnabled(long l);

		private native void native_setMapId(long l, String s);

		private native void native_setMappingScheduleItemSwitchEnabled(long l, boolean flag);

		private native void native_setScheduleItemIndex(long l, int i);

		private native void native_setScheduleMultipleMappingData(long l, ScheduleMultipleMappingData schedulemultiplemappingdata);

		private native void native_setSimpleScheduleMap(long l, HashMap hashmap);

		private native void native_setTeamingSettings(long l, TeamingSettingsData teamingsettingsdata);

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #72  <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #35  <Field long nativeRef>
		//    8   16:invokespecial   #74  <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		public boolean doesScheduleSupportMissionParameters()
		{
			return native_doesScheduleSupportMissionParameters(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #78  <Method boolean native_doesScheduleSupportMissionParameters(long)>
		//    4    8:ireturn         
		}

		public boolean doesScheduleSupportMissionPresets()
		{
			return native_doesScheduleSupportMissionPresets(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #81  <Method boolean native_doesScheduleSupportMissionPresets(long)>
		//    4    8:ireturn         
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #84  <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #88  <Method void Object.finalize()>
		//    4    8:return          
		}

		public boolean getCheckIfSchedulesContainsMapId()
		{
			return native_getCheckIfSchedulesContainsMapId(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #91  <Method boolean native_getCheckIfSchedulesContainsMapId(long)>
		//    4    8:ireturn         
		}

		public ArrayList getDataStates()
		{
			return native_getDataStates(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #95  <Method ArrayList native_getDataStates(long)>
		//    4    8:areturn         
		}

		public ArrayList getMappingScheduleList()
		{
			return native_getMappingScheduleList(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #100 <Method ArrayList native_getMappingScheduleList(long)>
		//    4    8:areturn         
		}

		public int getScheduleItemIndex()
		{
			return native_getScheduleItemIndex(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #105 <Method int native_getScheduleItemIndex(long)>
		//    4    8:ireturn         
		}

		public ScheduleMultipleMappingData getScheduleMultipleMappingData()
		{
			return native_getScheduleMultipleMappingData(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #109 <Method ScheduleMultipleMappingData native_getScheduleMultipleMappingData(long)>
		//    4    8:areturn         
		}

		public HashMap getSimpleScheduleMap()
		{
			return native_getSimpleScheduleMap(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #113 <Method HashMap native_getSimpleScheduleMap(long)>
		//    4    8:areturn         
		}

		public String getTeamingErrorMessage()
		{
			return native_getTeamingErrorMessage(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #118 <Method String native_getTeamingErrorMessage(long)>
		//    4    8:areturn         
		}

		public String getTimeoutTag()
		{
			return native_getTimeoutTag(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #121 <Method String native_getTimeoutTag(long)>
		//    4    8:areturn         
		}

		public ArrayList getViewStates()
		{
			return native_getViewStates(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #124 <Method ArrayList native_getViewStates(long)>
		//    4    8:areturn         
		}

		public boolean isScheduleMapsCapable()
		{
			return native_isScheduleMapsCapable(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #128 <Method boolean native_isScheduleMapsCapable(long)>
		//    4    8:ireturn         
		}

		public boolean isScheduleWithMapsEnabled()
		{
			return native_isScheduleWithMapsEnabled(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #131 <Method boolean native_isScheduleWithMapsEnabled(long)>
		//    4    8:ireturn         
		}

		public void setMapId(String s)
		{
			native_setMapId(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #134 <Method void native_setMapId(long, String)>
		//    5    9:return          
		}

		public void setMappingScheduleItemSwitchEnabled(boolean flag)
		{
			native_setMappingScheduleItemSwitchEnabled(nativeRef, flag);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:iload_1         
		//    4    6:invokespecial   #137 <Method void native_setMappingScheduleItemSwitchEnabled(long, boolean)>
		//    5    9:return          
		}

		public void setScheduleItemIndex(int i)
		{
			native_setScheduleItemIndex(nativeRef, i);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:iload_1         
		//    4    6:invokespecial   #141 <Method void native_setScheduleItemIndex(long, int)>
		//    5    9:return          
		}

		public void setScheduleMultipleMappingData(ScheduleMultipleMappingData schedulemultiplemappingdata)
		{
			native_setScheduleMultipleMappingData(nativeRef, schedulemultiplemappingdata);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #145 <Method void native_setScheduleMultipleMappingData(long, ScheduleMultipleMappingData)>
		//    5    9:return          
		}

		public void setSimpleScheduleMap(HashMap hashmap)
		{
			native_setSimpleScheduleMap(nativeRef, hashmap);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #149 <Method void native_setSimpleScheduleMap(long, HashMap)>
		//    5    9:return          
		}

		public void setTeamingSettings(TeamingSettingsData teamingsettingsdata)
		{
			native_setTeamingSettings(nativeRef, teamingsettingsdata);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #154 <Method void native_setTeamingSettings(long, TeamingSettingsData)>
		//    5    9:return          
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
		//    1    1:invokespecial   #19  <Method void ScheduleUIServiceData()>
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


	public ScheduleUIServiceData()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static native ScheduleUIServiceData create();

	public abstract boolean doesScheduleSupportMissionParameters();

	public abstract boolean doesScheduleSupportMissionPresets();

	public abstract boolean getCheckIfSchedulesContainsMapId();

	public abstract ArrayList getDataStates();

	public abstract ArrayList getMappingScheduleList();

	public abstract int getScheduleItemIndex();

	public abstract ScheduleMultipleMappingData getScheduleMultipleMappingData();

	public abstract HashMap getSimpleScheduleMap();

	public abstract String getTeamingErrorMessage();

	public abstract String getTimeoutTag();

	public abstract ArrayList getViewStates();

	public abstract boolean isScheduleMapsCapable();

	public abstract boolean isScheduleWithMapsEnabled();

	public abstract void setMapId(String s);

	public abstract void setMappingScheduleItemSwitchEnabled(boolean flag);

	public abstract void setScheduleItemIndex(int i);

	public abstract void setScheduleMultipleMappingData(ScheduleMultipleMappingData schedulemultiplemappingdata);

	public abstract void setSimpleScheduleMap(HashMap hashmap);

	public abstract void setTeamingSettings(TeamingSettingsData teamingsettingsdata);
}
