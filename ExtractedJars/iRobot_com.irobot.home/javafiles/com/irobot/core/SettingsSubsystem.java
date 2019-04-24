// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			SettingsUIServiceData, SettingType, Event, SettingsUIServiceDataCallback, 
//			SettingsUIServiceCommand

public abstract class SettingsSubsystem
{
	private static final class CppProxy extends SettingsSubsystem
	{

		private native void nativeDestroy(long l);

		private native SettingsUIServiceData native_getServiceData(long l);

		private native Event native_getValue(long l, SettingType settingtype);

		private native void native_queryAvailableSettings(long l);

		private native void native_queryValue(long l, SettingType settingtype);

		private native boolean native_registerSubscriber(long l, SettingsUIServiceDataCallback settingsuiservicedatacallback);

		private native boolean native_registerUISubscriber(long l, SettingsUIServiceDataCallback settingsuiservicedatacallback);

		private native void native_restoreDefaultValues(long l);

		private native void native_sendCommand(long l, SettingsUIServiceCommand settingsuiservicecommand, SettingsUIServiceData settingsuiservicedata);

		private native void native_setBoolValue(long l, SettingType settingtype, boolean flag);

		private native void native_setIntValue(long l, SettingType settingtype, int i);

		private native void native_setStringValue(long l, SettingType settingtype, String s);

		private native boolean native_unregisterSubscriber(long l, SettingsUIServiceDataCallback settingsuiservicedatacallback);

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #61  <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #35  <Field long nativeRef>
		//    8   16:invokespecial   #63  <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #66  <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #70  <Method void Object.finalize()>
		//    4    8:return          
		}

		public SettingsUIServiceData getServiceData()
		{
			return native_getServiceData(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #74  <Method SettingsUIServiceData native_getServiceData(long)>
		//    4    8:areturn         
		}

		public Event getValue(SettingType settingtype)
		{
			return native_getValue(nativeRef, settingtype);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #78  <Method Event native_getValue(long, SettingType)>
		//    5    9:areturn         
		}

		public void queryAvailableSettings()
		{
			native_queryAvailableSettings(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #81  <Method void native_queryAvailableSettings(long)>
		//    4    8:return          
		}

		public void queryValue(SettingType settingtype)
		{
			native_queryValue(nativeRef, settingtype);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #85  <Method void native_queryValue(long, SettingType)>
		//    5    9:return          
		}

		public boolean registerSubscriber(SettingsUIServiceDataCallback settingsuiservicedatacallback)
		{
			return native_registerSubscriber(nativeRef, settingsuiservicedatacallback);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #89  <Method boolean native_registerSubscriber(long, SettingsUIServiceDataCallback)>
		//    5    9:ireturn         
		}

		public boolean registerUISubscriber(SettingsUIServiceDataCallback settingsuiservicedatacallback)
		{
			return native_registerUISubscriber(nativeRef, settingsuiservicedatacallback);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #92  <Method boolean native_registerUISubscriber(long, SettingsUIServiceDataCallback)>
		//    5    9:ireturn         
		}

		public void restoreDefaultValues()
		{
			native_restoreDefaultValues(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #95  <Method void native_restoreDefaultValues(long)>
		//    4    8:return          
		}

		public void sendCommand(SettingsUIServiceCommand settingsuiservicecommand, SettingsUIServiceData settingsuiservicedata)
		{
			native_sendCommand(nativeRef, settingsuiservicecommand, settingsuiservicedata);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #99  <Method void native_sendCommand(long, SettingsUIServiceCommand, SettingsUIServiceData)>
		//    6   10:return          
		}

		public void setBoolValue(SettingType settingtype, boolean flag)
		{
			native_setBoolValue(nativeRef, settingtype, flag);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:iload_2         
		//    5    7:invokespecial   #103 <Method void native_setBoolValue(long, SettingType, boolean)>
		//    6   10:return          
		}

		public void setIntValue(SettingType settingtype, int i)
		{
			native_setIntValue(nativeRef, settingtype, i);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:iload_2         
		//    5    7:invokespecial   #107 <Method void native_setIntValue(long, SettingType, int)>
		//    6   10:return          
		}

		public void setStringValue(SettingType settingtype, String s)
		{
			native_setStringValue(nativeRef, settingtype, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #111 <Method void native_setStringValue(long, SettingType, String)>
		//    6   10:return          
		}

		public boolean unregisterSubscriber(SettingsUIServiceDataCallback settingsuiservicedatacallback)
		{
			return native_unregisterSubscriber(nativeRef, settingsuiservicedatacallback);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #114 <Method boolean native_unregisterSubscriber(long, SettingsUIServiceDataCallback)>
		//    5    9:ireturn         
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
		//    1    1:invokespecial   #19  <Method void SettingsSubsystem()>
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


	public SettingsSubsystem()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public abstract SettingsUIServiceData getServiceData();

	public abstract Event getValue(SettingType settingtype);

	public abstract void queryAvailableSettings();

	public abstract void queryValue(SettingType settingtype);

	public abstract boolean registerSubscriber(SettingsUIServiceDataCallback settingsuiservicedatacallback);

	public abstract boolean registerUISubscriber(SettingsUIServiceDataCallback settingsuiservicedatacallback);

	public abstract void restoreDefaultValues();

	public abstract void sendCommand(SettingsUIServiceCommand settingsuiservicecommand, SettingsUIServiceData settingsuiservicedata);

	public abstract void setBoolValue(SettingType settingtype, boolean flag);

	public abstract void setIntValue(SettingType settingtype, int i);

	public abstract void setStringValue(SettingType settingtype, String s);

	public abstract boolean unregisterSubscriber(SettingsUIServiceDataCallback settingsuiservicedatacallback);
}
