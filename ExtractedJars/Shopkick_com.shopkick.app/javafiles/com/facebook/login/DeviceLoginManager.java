// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.net.Uri;
import java.util.Collection;

// Referenced classes of package com.facebook.login:
//			LoginManager

public class DeviceLoginManager extends LoginManager
{

	public DeviceLoginManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void LoginManager()>
	//    2    4:return          
	}

	public static DeviceLoginManager getInstance()
	{
		if(instance != null)
			break MISSING_BLOCK_LABEL_37;
	//    0    0:getstatic       #20  <Field DeviceLoginManager instance>
	//    1    3:ifnonnull       37
		com/facebook/login/DeviceLoginManager;
	//    2    6:ldc1            #2   <Class DeviceLoginManager>
		JVM INSTR monitorenter ;
	//    3    8:monitorenter    
		if(instance == null)
	//*   4    9:getstatic       #20  <Field DeviceLoginManager instance>
	//*   5   12:ifnonnull       25
			instance = new DeviceLoginManager();
	//    6   15:new             #2   <Class DeviceLoginManager>
	//    7   18:dup             
	//    8   19:invokespecial   #21  <Method void DeviceLoginManager()>
	//    9   22:putstatic       #20  <Field DeviceLoginManager instance>
		com/facebook/login/DeviceLoginManager;
	//   10   25:ldc1            #2   <Class DeviceLoginManager>
		JVM INSTR monitorexit ;
	//   11   27:monitorexit     
		break MISSING_BLOCK_LABEL_37;
	//   12   28:goto            37
		Exception exception;
		exception;
	//   13   31:astore_0        
		com/facebook/login/DeviceLoginManager;
	//   14   32:ldc1            #2   <Class DeviceLoginManager>
		JVM INSTR monitorexit ;
	//   15   34:monitorexit     
		throw exception;
	//   16   35:aload_0         
	//   17   36:athrow          
		return instance;
	//   18   37:getstatic       #20  <Field DeviceLoginManager instance>
	//   19   40:areturn         
	}

	protected LoginClient.Request createLoginRequest(Collection collection)
	{
		collection = ((Collection) (super.createLoginRequest(collection)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method LoginClient$Request LoginManager.createLoginRequest(Collection)>
	//    3    5:astore_1        
		Object obj = ((Object) (getDeviceRedirectUri()));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #29  <Method Uri getDeviceRedirectUri()>
	//    6   10:astore_2        
		if(obj != null)
	//*   7   11:aload_2         
	//*   8   12:ifnull          23
			((LoginClient.Request) (collection)).setDeviceRedirectUriString(((Uri) (obj)).toString());
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokevirtual   #35  <Method String Uri.toString()>
	//   12   20:invokevirtual   #41  <Method void LoginClient$Request.setDeviceRedirectUriString(String)>
		obj = ((Object) (getDeviceAuthTargetUserId()));
	//   13   23:aload_0         
	//   14   24:invokevirtual   #44  <Method String getDeviceAuthTargetUserId()>
	//   15   27:astore_2        
		if(obj != null)
	//*  16   28:aload_2         
	//*  17   29:ifnull          37
			((LoginClient.Request) (collection)).setDeviceAuthTargetUserId(((String) (obj)));
	//   18   32:aload_1         
	//   19   33:aload_2         
	//   20   34:invokevirtual   #47  <Method void LoginClient$Request.setDeviceAuthTargetUserId(String)>
		return ((LoginClient.Request) (collection));
	//   21   37:aload_1         
	//   22   38:areturn         
	}

	public String getDeviceAuthTargetUserId()
	{
		return deviceAuthTargetUserId;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field String deviceAuthTargetUserId>
	//    2    4:areturn         
	}

	public Uri getDeviceRedirectUri()
	{
		return deviceRedirectUri;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field Uri deviceRedirectUri>
	//    2    4:areturn         
	}

	public void setDeviceAuthTargetUserId(String s)
	{
		deviceAuthTargetUserId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field String deviceAuthTargetUserId>
	//    3    5:return          
	}

	public void setDeviceRedirectUri(Uri uri)
	{
		deviceRedirectUri = uri;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field Uri deviceRedirectUri>
	//    3    5:return          
	}

	private static volatile DeviceLoginManager instance;
	private String deviceAuthTargetUserId;
	private Uri deviceRedirectUri;
}
