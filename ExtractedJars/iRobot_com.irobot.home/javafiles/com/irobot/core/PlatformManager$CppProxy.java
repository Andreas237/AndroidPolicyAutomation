// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			PlatformManager, ABTestHandler, AccountHandler, AccountViewHandler, 
//			ApplicationInfoHandler, AuthenticatedHttpsRequestor, BluetoothHandler, ConfiguredAssetsHandler, 
//			DeviceInfoHandler, DirectoryHandler, DiscoveryManager, HttpsRequestor, 
//			LocaleHandler, LogHandler, PersistenceHandler, PushNotificationHandler, 
//			WebServicesHandler

private static final class PlatformManager$CppProxy extends PlatformManager
{

	private native void nativeDestroy(long l);

	private native ABTestHandler native_getABTestHandler(long l);

	private native AccountHandler native_getAccountHandler(long l);

	private native AccountViewHandler native_getAccountViewHandler(long l);

	private native ApplicationInfoHandler native_getAppInfoHandler(long l);

	private native AuthenticatedHttpsRequestor native_getAuthenticatedHttpsRequestor(long l);

	private native BluetoothHandler native_getBluetoothHandler(long l);

	private native ConfiguredAssetsHandler native_getConfiguredAssetsHandler(long l);

	private native DeviceInfoHandler native_getDeviceInfoHandler(long l);

	private native DirectoryHandler native_getDirectoryHandler(long l);

	private native DiscoveryManager native_getDiscoveryManager(long l);

	private native HttpsRequestor native_getHttpsRequestor(long l);

	private native LocaleHandler native_getLocaleHandler(long l);

	private native LogHandler native_getLogHandler(long l);

	private native PersistenceHandler native_getPersistenceHandler(long l);

	private native PushNotificationHandler native_getPushNotificationHandler(long l);

	private native WebServicesHandler native_getWebServicesHandler(long l);

	private native void native_setABTestHandler(long l, ABTestHandler abtesthandler);

	private native void native_setAccountHandler(long l, AccountHandler accounthandler);

	private native void native_setAccountViewHandler(long l, AccountViewHandler accountviewhandler);

	private native void native_setApplicationInfoHandler(long l, ApplicationInfoHandler applicationinfohandler);

	private native void native_setAuthenticatedHttpsRequestor(long l, AuthenticatedHttpsRequestor authenticatedhttpsrequestor);

	private native void native_setBluetoothHandler(long l, BluetoothHandler bluetoothhandler);

	private native void native_setConfiguredAssetsHandler(long l, ConfiguredAssetsHandler configuredassetshandler);

	private native void native_setDeviceInfoHandler(long l, DeviceInfoHandler deviceinfohandler);

	private native void native_setDirectoryHandler(long l, DirectoryHandler directoryhandler);

	private native void native_setDiscoveryManager(long l, DiscoveryManager discoverymanager);

	private native void native_setHttpsRequestor(long l, HttpsRequestor httpsrequestor);

	private native void native_setLocaleHandler(long l, LocaleHandler localehandler);

	private native void native_setLogHandler(long l, LogHandler loghandler);

	private native void native_setPersistenceHandler(long l, PersistenceHandler persistencehandler);

	private native void native_setPushNotificationHandler(long l, PushNotificationHandler pushnotificationhandler);

	private native void native_setWebServicesHandler(long l, WebServicesHandler webserviceshandler);

	public void destroy()
	{
		if(!destroyed.getAndSet(true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
	//*   2    4:iconst_1        
	//*   3    5:invokevirtual   #105 <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*   4    8:ifne            19
			nativeDestroy(nativeRef);
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field long nativeRef>
	//    8   16:invokespecial   #107 <Method void nativeDestroy(long)>
	//    9   19:return          
	}

	protected void finalize()
	{
		destroy();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #110 <Method void destroy()>
		((Object)this).finalize();
	//    2    4:aload_0         
	//    3    5:invokespecial   #114 <Method void Object.finalize()>
	//    4    8:return          
	}

	public ABTestHandler getABTestHandler()
	{
		return native_getABTestHandler(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #118 <Method ABTestHandler native_getABTestHandler(long)>
	//    4    8:areturn         
	}

	public AccountHandler getAccountHandler()
	{
		return native_getAccountHandler(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #122 <Method AccountHandler native_getAccountHandler(long)>
	//    4    8:areturn         
	}

	public AccountViewHandler getAccountViewHandler()
	{
		return native_getAccountViewHandler(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #126 <Method AccountViewHandler native_getAccountViewHandler(long)>
	//    4    8:areturn         
	}

	public ApplicationInfoHandler getAppInfoHandler()
	{
		return native_getAppInfoHandler(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #130 <Method ApplicationInfoHandler native_getAppInfoHandler(long)>
	//    4    8:areturn         
	}

	public AuthenticatedHttpsRequestor getAuthenticatedHttpsRequestor()
	{
		return native_getAuthenticatedHttpsRequestor(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #134 <Method AuthenticatedHttpsRequestor native_getAuthenticatedHttpsRequestor(long)>
	//    4    8:areturn         
	}

	public BluetoothHandler getBluetoothHandler()
	{
		return native_getBluetoothHandler(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #138 <Method BluetoothHandler native_getBluetoothHandler(long)>
	//    4    8:areturn         
	}

	public ConfiguredAssetsHandler getConfiguredAssetsHandler()
	{
		return native_getConfiguredAssetsHandler(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #142 <Method ConfiguredAssetsHandler native_getConfiguredAssetsHandler(long)>
	//    4    8:areturn         
	}

	public DeviceInfoHandler getDeviceInfoHandler()
	{
		return native_getDeviceInfoHandler(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #146 <Method DeviceInfoHandler native_getDeviceInfoHandler(long)>
	//    4    8:areturn         
	}

	public DirectoryHandler getDirectoryHandler()
	{
		return native_getDirectoryHandler(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #150 <Method DirectoryHandler native_getDirectoryHandler(long)>
	//    4    8:areturn         
	}

	public DiscoveryManager getDiscoveryManager()
	{
		return native_getDiscoveryManager(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #154 <Method DiscoveryManager native_getDiscoveryManager(long)>
	//    4    8:areturn         
	}

	public HttpsRequestor getHttpsRequestor()
	{
		return native_getHttpsRequestor(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #158 <Method HttpsRequestor native_getHttpsRequestor(long)>
	//    4    8:areturn         
	}

	public LocaleHandler getLocaleHandler()
	{
		return native_getLocaleHandler(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #162 <Method LocaleHandler native_getLocaleHandler(long)>
	//    4    8:areturn         
	}

	public LogHandler getLogHandler()
	{
		return native_getLogHandler(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #166 <Method LogHandler native_getLogHandler(long)>
	//    4    8:areturn         
	}

	public PersistenceHandler getPersistenceHandler()
	{
		return native_getPersistenceHandler(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #170 <Method PersistenceHandler native_getPersistenceHandler(long)>
	//    4    8:areturn         
	}

	public PushNotificationHandler getPushNotificationHandler()
	{
		return native_getPushNotificationHandler(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #174 <Method PushNotificationHandler native_getPushNotificationHandler(long)>
	//    4    8:areturn         
	}

	public WebServicesHandler getWebServicesHandler()
	{
		return native_getWebServicesHandler(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #178 <Method WebServicesHandler native_getWebServicesHandler(long)>
	//    4    8:areturn         
	}

	public void setABTestHandler(ABTestHandler abtesthandler)
	{
		native_setABTestHandler(nativeRef, abtesthandler);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #182 <Method void native_setABTestHandler(long, ABTestHandler)>
	//    5    9:return          
	}

	public void setAccountHandler(AccountHandler accounthandler)
	{
		native_setAccountHandler(nativeRef, accounthandler);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #186 <Method void native_setAccountHandler(long, AccountHandler)>
	//    5    9:return          
	}

	public void setAccountViewHandler(AccountViewHandler accountviewhandler)
	{
		native_setAccountViewHandler(nativeRef, accountviewhandler);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #190 <Method void native_setAccountViewHandler(long, AccountViewHandler)>
	//    5    9:return          
	}

	public void setApplicationInfoHandler(ApplicationInfoHandler applicationinfohandler)
	{
		native_setApplicationInfoHandler(nativeRef, applicationinfohandler);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #194 <Method void native_setApplicationInfoHandler(long, ApplicationInfoHandler)>
	//    5    9:return          
	}

	public void setAuthenticatedHttpsRequestor(AuthenticatedHttpsRequestor authenticatedhttpsrequestor)
	{
		native_setAuthenticatedHttpsRequestor(nativeRef, authenticatedhttpsrequestor);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #198 <Method void native_setAuthenticatedHttpsRequestor(long, AuthenticatedHttpsRequestor)>
	//    5    9:return          
	}

	public void setBluetoothHandler(BluetoothHandler bluetoothhandler)
	{
		native_setBluetoothHandler(nativeRef, bluetoothhandler);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #202 <Method void native_setBluetoothHandler(long, BluetoothHandler)>
	//    5    9:return          
	}

	public void setConfiguredAssetsHandler(ConfiguredAssetsHandler configuredassetshandler)
	{
		native_setConfiguredAssetsHandler(nativeRef, configuredassetshandler);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #206 <Method void native_setConfiguredAssetsHandler(long, ConfiguredAssetsHandler)>
	//    5    9:return          
	}

	public void setDeviceInfoHandler(DeviceInfoHandler deviceinfohandler)
	{
		native_setDeviceInfoHandler(nativeRef, deviceinfohandler);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #210 <Method void native_setDeviceInfoHandler(long, DeviceInfoHandler)>
	//    5    9:return          
	}

	public void setDirectoryHandler(DirectoryHandler directoryhandler)
	{
		native_setDirectoryHandler(nativeRef, directoryhandler);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #214 <Method void native_setDirectoryHandler(long, DirectoryHandler)>
	//    5    9:return          
	}

	public void setDiscoveryManager(DiscoveryManager discoverymanager)
	{
		native_setDiscoveryManager(nativeRef, discoverymanager);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #218 <Method void native_setDiscoveryManager(long, DiscoveryManager)>
	//    5    9:return          
	}

	public void setHttpsRequestor(HttpsRequestor httpsrequestor)
	{
		native_setHttpsRequestor(nativeRef, httpsrequestor);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #222 <Method void native_setHttpsRequestor(long, HttpsRequestor)>
	//    5    9:return          
	}

	public void setLocaleHandler(LocaleHandler localehandler)
	{
		native_setLocaleHandler(nativeRef, localehandler);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #226 <Method void native_setLocaleHandler(long, LocaleHandler)>
	//    5    9:return          
	}

	public void setLogHandler(LogHandler loghandler)
	{
		native_setLogHandler(nativeRef, loghandler);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #230 <Method void native_setLogHandler(long, LogHandler)>
	//    5    9:return          
	}

	public void setPersistenceHandler(PersistenceHandler persistencehandler)
	{
		native_setPersistenceHandler(nativeRef, persistencehandler);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #234 <Method void native_setPersistenceHandler(long, PersistenceHandler)>
	//    5    9:return          
	}

	public void setPushNotificationHandler(PushNotificationHandler pushnotificationhandler)
	{
		native_setPushNotificationHandler(nativeRef, pushnotificationhandler);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #238 <Method void native_setPushNotificationHandler(long, PushNotificationHandler)>
	//    5    9:return          
	}

	public void setWebServicesHandler(WebServicesHandler webserviceshandler)
	{
		native_setWebServicesHandler(nativeRef, webserviceshandler);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #242 <Method void native_setWebServicesHandler(long, WebServicesHandler)>
	//    5    9:return          
	}

	static final boolean $assertionsDisabled = false;
	private final AtomicBoolean destroyed = new AtomicBoolean(false);
	private final long nativeRef;

	static 
	{
	//    0    0:return          
	}

	private PlatformManager$CppProxy(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void PlatformManager()>
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
