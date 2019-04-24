// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			PMIApplicationService, PMIAccountsComponent, PMIAssetService, PMIProvisioningService, 
//			PMIAssetInfo

private static final class PMIApplicationService$CppProxy extends PMIApplicationService
{

	private native void nativeDestroy(long l);

	private native PMIAccountsComponent native_getAccountsComponent(long l);

	private native String native_getAppId(long l);

	private native String native_getAppLanguage(long l);

	private native String native_getAppVersion(long l);

	private native PMIAssetService native_getAsset(long l, String s);

	private native ArrayList native_getAssets(long l);

	private native PMIProvisioningService native_getProvisioningService(long l);

	private native void native_loadProtocolConfig(long l, String s);

	private native void native_registerAsset(long l, PMIAssetInfo pmiassetinfo);

	private native void native_removeAsset(long l, String s);

	private native void native_setAppLanguage(long l, String s);

	private native void native_setAppVersion(long l, String s);

	public void destroy()
	{
		if(!destroyed.getAndSet(true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
	//*   2    4:iconst_1        
	//*   3    5:invokevirtual   #60  <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*   4    8:ifne            19
			nativeDestroy(nativeRef);
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field long nativeRef>
	//    8   16:invokespecial   #62  <Method void nativeDestroy(long)>
	//    9   19:return          
	}

	protected void finalize()
	{
		destroy();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method void destroy()>
		((Object)this).finalize();
	//    2    4:aload_0         
	//    3    5:invokespecial   #69  <Method void Object.finalize()>
	//    4    8:return          
	}

	public PMIAccountsComponent getAccountsComponent()
	{
		return native_getAccountsComponent(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #73  <Method PMIAccountsComponent native_getAccountsComponent(long)>
	//    4    8:areturn         
	}

	public String getAppId()
	{
		return native_getAppId(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #77  <Method String native_getAppId(long)>
	//    4    8:areturn         
	}

	public String getAppLanguage()
	{
		return native_getAppLanguage(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #80  <Method String native_getAppLanguage(long)>
	//    4    8:areturn         
	}

	public String getAppVersion()
	{
		return native_getAppVersion(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #83  <Method String native_getAppVersion(long)>
	//    4    8:areturn         
	}

	public PMIAssetService getAsset(String s)
	{
		return native_getAsset(nativeRef, s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #87  <Method PMIAssetService native_getAsset(long, String)>
	//    5    9:areturn         
	}

	public ArrayList getAssets()
	{
		return native_getAssets(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #91  <Method ArrayList native_getAssets(long)>
	//    4    8:areturn         
	}

	public PMIProvisioningService getProvisioningService()
	{
		return native_getProvisioningService(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #97  <Method PMIProvisioningService native_getProvisioningService(long)>
	//    4    8:areturn         
	}

	public void loadProtocolConfig(String s)
	{
		native_loadProtocolConfig(nativeRef, s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #100 <Method void native_loadProtocolConfig(long, String)>
	//    5    9:return          
	}

	public void registerAsset(PMIAssetInfo pmiassetinfo)
	{
		native_registerAsset(nativeRef, pmiassetinfo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #104 <Method void native_registerAsset(long, PMIAssetInfo)>
	//    5    9:return          
	}

	public void removeAsset(String s)
	{
		native_removeAsset(nativeRef, s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #107 <Method void native_removeAsset(long, String)>
	//    5    9:return          
	}

	public void setAppLanguage(String s)
	{
		native_setAppLanguage(nativeRef, s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #110 <Method void native_setAppLanguage(long, String)>
	//    5    9:return          
	}

	public void setAppVersion(String s)
	{
		native_setAppVersion(nativeRef, s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #113 <Method void native_setAppVersion(long, String)>
	//    5    9:return          
	}

	static final boolean $assertionsDisabled = false;
	private final AtomicBoolean destroyed = new AtomicBoolean(false);
	private final long nativeRef;

	static 
	{
	//    0    0:return          
	}

	private PMIApplicationService$CppProxy(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void PMIApplicationService()>
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
