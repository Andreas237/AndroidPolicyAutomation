// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			SettingType, SettingValueType, WetnessLevelSettingValue

public abstract class SettingsUIServiceData
{
	private static final class CppProxy extends SettingsUIServiceData
	{

		private native void nativeDestroy(long l);

		private native ArrayList native_getAvailableLanguages(long l);

		private native HashSet native_getAvailableSettings(long l);

		private native boolean native_getBooleanSetting(long l, SettingType settingtype);

		private native ArrayList native_getCarpetBoostModes(long l);

		private native boolean native_getCustomPresetsIsVisibile(long l);

		private native int native_getIntegerSetting(long l, SettingType settingtype);

		private native ArrayList native_getMultiPassModes(long l);

		private native HashMap native_getPadWetnessMap(long l);

		private native Date native_getRegistrationDate(long l);

		private native SettingValueType native_getSettingValueType(long l, SettingType settingtype);

		private native HashSet native_getSettingsChangeList(long l);

		private native ArrayList native_getSettingsViewStateChangelist(long l);

		private native String native_getStringSetting(long l, SettingType settingtype);

		private native WetnessLevelSettingValue native_getWetnessLevelSettingValue(long l);

		private native HashMap native_getWetnessLevels(long l);

		private native void native_setBooleanSetting(long l, SettingType settingtype, boolean flag);

		private native void native_setIntegerSetting(long l, SettingType settingtype, int i);

		private native void native_setStringSetting(long l, SettingType settingtype, String s);

		private native void native_setWetnessLevelSettingValue(long l, WetnessLevelSettingValue wetnesslevelsettingvalue);

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #74  <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #35  <Field long nativeRef>
		//    8   16:invokespecial   #76  <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #79  <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #83  <Method void Object.finalize()>
		//    4    8:return          
		}

		public ArrayList getAvailableLanguages()
		{
			return native_getAvailableLanguages(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #87  <Method ArrayList native_getAvailableLanguages(long)>
		//    4    8:areturn         
		}

		public HashSet getAvailableSettings()
		{
			return native_getAvailableSettings(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #93  <Method HashSet native_getAvailableSettings(long)>
		//    4    8:areturn         
		}

		public boolean getBooleanSetting(SettingType settingtype)
		{
			return native_getBooleanSetting(nativeRef, settingtype);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #98  <Method boolean native_getBooleanSetting(long, SettingType)>
		//    5    9:ireturn         
		}

		public ArrayList getCarpetBoostModes()
		{
			return native_getCarpetBoostModes(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #101 <Method ArrayList native_getCarpetBoostModes(long)>
		//    4    8:areturn         
		}

		public boolean getCustomPresetsIsVisibile()
		{
			return native_getCustomPresetsIsVisibile(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #106 <Method boolean native_getCustomPresetsIsVisibile(long)>
		//    4    8:ireturn         
		}

		public int getIntegerSetting(SettingType settingtype)
		{
			return native_getIntegerSetting(nativeRef, settingtype);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #110 <Method int native_getIntegerSetting(long, SettingType)>
		//    5    9:ireturn         
		}

		public ArrayList getMultiPassModes()
		{
			return native_getMultiPassModes(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #113 <Method ArrayList native_getMultiPassModes(long)>
		//    4    8:areturn         
		}

		public HashMap getPadWetnessMap()
		{
			return native_getPadWetnessMap(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #118 <Method HashMap native_getPadWetnessMap(long)>
		//    4    8:areturn         
		}

		public Date getRegistrationDate()
		{
			return native_getRegistrationDate(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #123 <Method Date native_getRegistrationDate(long)>
		//    4    8:areturn         
		}

		public SettingValueType getSettingValueType(SettingType settingtype)
		{
			return native_getSettingValueType(nativeRef, settingtype);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #127 <Method SettingValueType native_getSettingValueType(long, SettingType)>
		//    5    9:areturn         
		}

		public HashSet getSettingsChangeList()
		{
			return native_getSettingsChangeList(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #130 <Method HashSet native_getSettingsChangeList(long)>
		//    4    8:areturn         
		}

		public ArrayList getSettingsViewStateChangelist()
		{
			return native_getSettingsViewStateChangelist(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #133 <Method ArrayList native_getSettingsViewStateChangelist(long)>
		//    4    8:areturn         
		}

		public String getStringSetting(SettingType settingtype)
		{
			return native_getStringSetting(nativeRef, settingtype);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #138 <Method String native_getStringSetting(long, SettingType)>
		//    5    9:areturn         
		}

		public WetnessLevelSettingValue getWetnessLevelSettingValue()
		{
			return native_getWetnessLevelSettingValue(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #142 <Method WetnessLevelSettingValue native_getWetnessLevelSettingValue(long)>
		//    4    8:areturn         
		}

		public HashMap getWetnessLevels()
		{
			return native_getWetnessLevels(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #145 <Method HashMap native_getWetnessLevels(long)>
		//    4    8:areturn         
		}

		public void setBooleanSetting(SettingType settingtype, boolean flag)
		{
			native_setBooleanSetting(nativeRef, settingtype, flag);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:iload_2         
		//    5    7:invokespecial   #150 <Method void native_setBooleanSetting(long, SettingType, boolean)>
		//    6   10:return          
		}

		public void setIntegerSetting(SettingType settingtype, int i)
		{
			native_setIntegerSetting(nativeRef, settingtype, i);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:iload_2         
		//    5    7:invokespecial   #154 <Method void native_setIntegerSetting(long, SettingType, int)>
		//    6   10:return          
		}

		public void setStringSetting(SettingType settingtype, String s)
		{
			native_setStringSetting(nativeRef, settingtype, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #158 <Method void native_setStringSetting(long, SettingType, String)>
		//    6   10:return          
		}

		public void setWetnessLevelSettingValue(WetnessLevelSettingValue wetnesslevelsettingvalue)
		{
			native_setWetnessLevelSettingValue(nativeRef, wetnesslevelsettingvalue);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #162 <Method void native_setWetnessLevelSettingValue(long, WetnessLevelSettingValue)>
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
		//    1    1:invokespecial   #19  <Method void SettingsUIServiceData()>
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


	public SettingsUIServiceData()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static native SettingsUIServiceData create();

	public abstract ArrayList getAvailableLanguages();

	public abstract HashSet getAvailableSettings();

	public abstract boolean getBooleanSetting(SettingType settingtype);

	public abstract ArrayList getCarpetBoostModes();

	public abstract boolean getCustomPresetsIsVisibile();

	public abstract int getIntegerSetting(SettingType settingtype);

	public abstract ArrayList getMultiPassModes();

	public abstract HashMap getPadWetnessMap();

	public abstract Date getRegistrationDate();

	public abstract SettingValueType getSettingValueType(SettingType settingtype);

	public abstract HashSet getSettingsChangeList();

	public abstract ArrayList getSettingsViewStateChangelist();

	public abstract String getStringSetting(SettingType settingtype);

	public abstract WetnessLevelSettingValue getWetnessLevelSettingValue();

	public abstract HashMap getWetnessLevels();

	public abstract void setBooleanSetting(SettingType settingtype, boolean flag);

	public abstract void setIntegerSetting(SettingType settingtype, int i);

	public abstract void setStringSetting(SettingType settingtype, String s);

	public abstract void setWetnessLevelSettingValue(WetnessLevelSettingValue wetnesslevelsettingvalue);
}
