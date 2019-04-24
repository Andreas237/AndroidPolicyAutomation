// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			Assembler, AccountService, AssetId, AddRobotUIService, 
//			AnalyticsSubsystem, ApplicationUIService, AssetService, AssetSetupUIService, 
//			AssetStatusSubsystem, CommandTierAgent, EventBusHandler, HistoryUIService, 
//			MaintenanceUIService, MapsUIService, MissionSubsystem, AssetNetworkUIService, 
//			NotificationCenterUIService, PMIApplicationService, PersistenceHandler, PushNotificationService, 
//			RegistrationService, ResourceHandler, ScheduleUIService, SettingsSubsystem, 
//			PMIAssetInfo, TimeService, UpdateUIService, AssetInfo, 
//			ProvisioningType

private static final class Assembler$CppProxy extends Assembler
{

	private native void nativeDestroy(long l);

	private native AccountService native_getAccountService(long l);

	private native AddRobotUIService native_getAddRobotUIService(long l, AssetId assetid);

	private native AnalyticsSubsystem native_getAnalyticsSubsystem(long l);

	private native ApplicationUIService native_getApplicationUIService(long l);

	private native AssetService native_getAssetService(long l);

	private native AssetSetupUIService native_getAssetSetupUIService(long l);

	private native AssetStatusSubsystem native_getAssetStatusSubsystem(long l, AssetId assetid);

	private native CommandTierAgent native_getCommandTierAgent(long l, AssetId assetid);

	private native EventBusHandler native_getDomainEventBus(long l);

	private native HistoryUIService native_getHistoryUIService(long l, AssetId assetid);

	private native MaintenanceUIService native_getMaintenanceUIService(long l, String s);

	private native MapsUIService native_getMapsUIService(long l, AssetId assetid);

	private native MissionSubsystem native_getMissionSubsystem(long l, AssetId assetid);

	private native AssetNetworkUIService native_getNetworkUIService(long l, AssetId assetid);

	private native NotificationCenterUIService native_getNotificationCenterUIService(long l, AssetId assetid);

	private native PMIApplicationService native_getPMIApplicationService(long l);

	private native PersistenceHandler native_getPersistenceHandler(long l);

	private native PushNotificationService native_getPushNotificationService(long l);

	private native RegistrationService native_getRegistrationService(long l);

	private native ResourceHandler native_getResourceHandler(long l);

	private native ScheduleUIService native_getScheduleUIService(long l, AssetId assetid);

	private native SettingsSubsystem native_getSettingsSubsystem(long l, AssetId assetid);

	private native SettingsSubsystem native_getSettingsUIService(long l, PMIAssetInfo pmiassetinfo);

	private native TimeService native_getTimeService(long l);

	private native UpdateUIService native_getUpdateUIService(long l, AssetId assetid);

	private native void native_initializeAsset(long l, AssetInfo assetinfo);

	private native void native_initializeAssetForAdding(long l, AssetInfo assetinfo);

	private native void native_initializeAssetForProvisioning(long l, AssetInfo assetinfo, ProvisioningType provisioningtype);

	private native void native_initializeGlobalServices(long l, String s, String s1);

	private native boolean native_isInitialized(long l, AssetId assetid);

	private native boolean native_isKeepOutZonesEnabled(long l);

	private native boolean native_isMapDemoModeEnabled(long l);

	private native boolean native_isPMapsEnabled(long l);

	private native void native_removeAsset(long l, AssetId assetid);

	private native void native_setDomainEventBus(long l, EventBusHandler eventbushandler);

	private native void native_setKeepOutZonesEnabled(long l, boolean flag);

	private native void native_setMapDemoModeEnabled(long l, boolean flag);

	private native void native_setPMapsEnabled(long l, boolean flag);

	private native void native_setResourceHandler(long l, ResourceHandler resourcehandler);

	public void destroy()
	{
		if(!destroyed.getAndSet(true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
	//*   2    4:iconst_1        
	//*   3    5:invokevirtual   #114 <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*   4    8:ifne            19
			nativeDestroy(nativeRef);
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field long nativeRef>
	//    8   16:invokespecial   #116 <Method void nativeDestroy(long)>
	//    9   19:return          
	}

	protected void finalize()
	{
		destroy();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #119 <Method void destroy()>
		((Object)this).finalize();
	//    2    4:aload_0         
	//    3    5:invokespecial   #123 <Method void Object.finalize()>
	//    4    8:return          
	}

	public AccountService getAccountService()
	{
		return native_getAccountService(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #127 <Method AccountService native_getAccountService(long)>
	//    4    8:areturn         
	}

	public AddRobotUIService getAddRobotUIService(AssetId assetid)
	{
		return native_getAddRobotUIService(nativeRef, assetid);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #131 <Method AddRobotUIService native_getAddRobotUIService(long, AssetId)>
	//    5    9:areturn         
	}

	public AnalyticsSubsystem getAnalyticsSubsystem()
	{
		return native_getAnalyticsSubsystem(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #135 <Method AnalyticsSubsystem native_getAnalyticsSubsystem(long)>
	//    4    8:areturn         
	}

	public ApplicationUIService getApplicationUIService()
	{
		return native_getApplicationUIService(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #139 <Method ApplicationUIService native_getApplicationUIService(long)>
	//    4    8:areturn         
	}

	public AssetService getAssetService()
	{
		return native_getAssetService(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #143 <Method AssetService native_getAssetService(long)>
	//    4    8:areturn         
	}

	public AssetSetupUIService getAssetSetupUIService()
	{
		return native_getAssetSetupUIService(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #147 <Method AssetSetupUIService native_getAssetSetupUIService(long)>
	//    4    8:areturn         
	}

	public AssetStatusSubsystem getAssetStatusSubsystem(AssetId assetid)
	{
		return native_getAssetStatusSubsystem(nativeRef, assetid);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #151 <Method AssetStatusSubsystem native_getAssetStatusSubsystem(long, AssetId)>
	//    5    9:areturn         
	}

	public CommandTierAgent getCommandTierAgent(AssetId assetid)
	{
		return native_getCommandTierAgent(nativeRef, assetid);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #155 <Method CommandTierAgent native_getCommandTierAgent(long, AssetId)>
	//    5    9:areturn         
	}

	public EventBusHandler getDomainEventBus()
	{
		return native_getDomainEventBus(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #159 <Method EventBusHandler native_getDomainEventBus(long)>
	//    4    8:areturn         
	}

	public HistoryUIService getHistoryUIService(AssetId assetid)
	{
		return native_getHistoryUIService(nativeRef, assetid);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #163 <Method HistoryUIService native_getHistoryUIService(long, AssetId)>
	//    5    9:areturn         
	}

	public MaintenanceUIService getMaintenanceUIService(String s)
	{
		return native_getMaintenanceUIService(nativeRef, s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #167 <Method MaintenanceUIService native_getMaintenanceUIService(long, String)>
	//    5    9:areturn         
	}

	public MapsUIService getMapsUIService(AssetId assetid)
	{
		return native_getMapsUIService(nativeRef, assetid);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #171 <Method MapsUIService native_getMapsUIService(long, AssetId)>
	//    5    9:areturn         
	}

	public MissionSubsystem getMissionSubsystem(AssetId assetid)
	{
		return native_getMissionSubsystem(nativeRef, assetid);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #175 <Method MissionSubsystem native_getMissionSubsystem(long, AssetId)>
	//    5    9:areturn         
	}

	public AssetNetworkUIService getNetworkUIService(AssetId assetid)
	{
		return native_getNetworkUIService(nativeRef, assetid);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #179 <Method AssetNetworkUIService native_getNetworkUIService(long, AssetId)>
	//    5    9:areturn         
	}

	public NotificationCenterUIService getNotificationCenterUIService(AssetId assetid)
	{
		return native_getNotificationCenterUIService(nativeRef, assetid);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #183 <Method NotificationCenterUIService native_getNotificationCenterUIService(long, AssetId)>
	//    5    9:areturn         
	}

	public PMIApplicationService getPMIApplicationService()
	{
		return native_getPMIApplicationService(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #187 <Method PMIApplicationService native_getPMIApplicationService(long)>
	//    4    8:areturn         
	}

	public PersistenceHandler getPersistenceHandler()
	{
		return native_getPersistenceHandler(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #191 <Method PersistenceHandler native_getPersistenceHandler(long)>
	//    4    8:areturn         
	}

	public PushNotificationService getPushNotificationService()
	{
		return native_getPushNotificationService(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #195 <Method PushNotificationService native_getPushNotificationService(long)>
	//    4    8:areturn         
	}

	public RegistrationService getRegistrationService()
	{
		return native_getRegistrationService(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #199 <Method RegistrationService native_getRegistrationService(long)>
	//    4    8:areturn         
	}

	public ResourceHandler getResourceHandler()
	{
		return native_getResourceHandler(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #203 <Method ResourceHandler native_getResourceHandler(long)>
	//    4    8:areturn         
	}

	public ScheduleUIService getScheduleUIService(AssetId assetid)
	{
		return native_getScheduleUIService(nativeRef, assetid);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #207 <Method ScheduleUIService native_getScheduleUIService(long, AssetId)>
	//    5    9:areturn         
	}

	public SettingsSubsystem getSettingsSubsystem(AssetId assetid)
	{
		return native_getSettingsSubsystem(nativeRef, assetid);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #211 <Method SettingsSubsystem native_getSettingsSubsystem(long, AssetId)>
	//    5    9:areturn         
	}

	public SettingsSubsystem getSettingsUIService(PMIAssetInfo pmiassetinfo)
	{
		return native_getSettingsUIService(nativeRef, pmiassetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #215 <Method SettingsSubsystem native_getSettingsUIService(long, PMIAssetInfo)>
	//    5    9:areturn         
	}

	public TimeService getTimeService()
	{
		return native_getTimeService(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #219 <Method TimeService native_getTimeService(long)>
	//    4    8:areturn         
	}

	public UpdateUIService getUpdateUIService(AssetId assetid)
	{
		return native_getUpdateUIService(nativeRef, assetid);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #223 <Method UpdateUIService native_getUpdateUIService(long, AssetId)>
	//    5    9:areturn         
	}

	public void initializeAsset(AssetInfo assetinfo)
	{
		native_initializeAsset(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #227 <Method void native_initializeAsset(long, AssetInfo)>
	//    5    9:return          
	}

	public void initializeAssetForAdding(AssetInfo assetinfo)
	{
		native_initializeAssetForAdding(nativeRef, assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #230 <Method void native_initializeAssetForAdding(long, AssetInfo)>
	//    5    9:return          
	}

	public void initializeAssetForProvisioning(AssetInfo assetinfo, ProvisioningType provisioningtype)
	{
		native_initializeAssetForProvisioning(nativeRef, assetinfo, provisioningtype);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #234 <Method void native_initializeAssetForProvisioning(long, AssetInfo, ProvisioningType)>
	//    6   10:return          
	}

	public void initializeGlobalServices(String s, String s1)
	{
		native_initializeGlobalServices(nativeRef, s, s1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #238 <Method void native_initializeGlobalServices(long, String, String)>
	//    6   10:return          
	}

	public boolean isInitialized(AssetId assetid)
	{
		return native_isInitialized(nativeRef, assetid);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #242 <Method boolean native_isInitialized(long, AssetId)>
	//    5    9:ireturn         
	}

	public boolean isKeepOutZonesEnabled()
	{
		return native_isKeepOutZonesEnabled(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #246 <Method boolean native_isKeepOutZonesEnabled(long)>
	//    4    8:ireturn         
	}

	public boolean isMapDemoModeEnabled()
	{
		return native_isMapDemoModeEnabled(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #249 <Method boolean native_isMapDemoModeEnabled(long)>
	//    4    8:ireturn         
	}

	public boolean isPMapsEnabled()
	{
		return native_isPMapsEnabled(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #252 <Method boolean native_isPMapsEnabled(long)>
	//    4    8:ireturn         
	}

	public void removeAsset(AssetId assetid)
	{
		native_removeAsset(nativeRef, assetid);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #256 <Method void native_removeAsset(long, AssetId)>
	//    5    9:return          
	}

	public void setDomainEventBus(EventBusHandler eventbushandler)
	{
		native_setDomainEventBus(nativeRef, eventbushandler);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #260 <Method void native_setDomainEventBus(long, EventBusHandler)>
	//    5    9:return          
	}

	public void setKeepOutZonesEnabled(boolean flag)
	{
		native_setKeepOutZonesEnabled(nativeRef, flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:iload_1         
	//    4    6:invokespecial   #263 <Method void native_setKeepOutZonesEnabled(long, boolean)>
	//    5    9:return          
	}

	public void setMapDemoModeEnabled(boolean flag)
	{
		native_setMapDemoModeEnabled(nativeRef, flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:iload_1         
	//    4    6:invokespecial   #266 <Method void native_setMapDemoModeEnabled(long, boolean)>
	//    5    9:return          
	}

	public void setPMapsEnabled(boolean flag)
	{
		native_setPMapsEnabled(nativeRef, flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:iload_1         
	//    4    6:invokespecial   #269 <Method void native_setPMapsEnabled(long, boolean)>
	//    5    9:return          
	}

	public void setResourceHandler(ResourceHandler resourcehandler)
	{
		native_setResourceHandler(nativeRef, resourcehandler);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #273 <Method void native_setResourceHandler(long, ResourceHandler)>
	//    5    9:return          
	}

	static final boolean $assertionsDisabled = false;
	private final AtomicBoolean destroyed = new AtomicBoolean(false);
	private final long nativeRef;

	static 
	{
	//    0    0:return          
	}

	private Assembler$CppProxy(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Assembler()>
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
