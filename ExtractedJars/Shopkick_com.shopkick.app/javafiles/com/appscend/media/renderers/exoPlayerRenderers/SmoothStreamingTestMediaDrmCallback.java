// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media.renderers.exoPlayerRenderers;

import android.text.TextUtils;
import com.google.android.exoplayer.drm.MediaDrmCallback;
import com.google.android.exoplayer.util.Util;
import java.io.IOException;
import java.util.*;

public class SmoothStreamingTestMediaDrmCallback
	implements MediaDrmCallback
{

	public SmoothStreamingTestMediaDrmCallback()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void Object()>
	//    2    4:return          
	}

	public byte[] executeKeyRequest(UUID uuid, com.google.android.exoplayer.drm.ExoMediaDrm.KeyRequest keyrequest)
		throws Exception
	{
		String s = keyrequest.getDefaultUrl();
	//    0    0:aload_2         
	//    1    1:invokeinterface #60  <Method String com.google.android.exoplayer.drm.ExoMediaDrm$KeyRequest.getDefaultUrl()>
	//    2    6:astore_3        
		uuid = ((UUID) (s));
	//    3    7:aload_3         
	//    4    8:astore_1        
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   5    9:aload_3         
	//*   6   10:invokestatic    #66  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   7   13:ifeq            19
			uuid = "http://playready.directtaps.net/pr/svc/rightsmanager.asmx";
	//    8   16:ldc1            #16  <String "http://playready.directtaps.net/pr/svc/rightsmanager.asmx">
	//    9   18:astore_1        
		return Util.executePost(((String) (uuid)), keyrequest.getData(), KEY_REQUEST_PROPERTIES);
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:invokeinterface #70  <Method byte[] com.google.android.exoplayer.drm.ExoMediaDrm$KeyRequest.getData()>
	//   13   26:getstatic       #48  <Field Map KEY_REQUEST_PROPERTIES>
	//   14   29:invokestatic    #76  <Method byte[] Util.executePost(String, byte[], Map)>
	//   15   32:areturn         
	}

	public byte[] executeProvisionRequest(UUID uuid, com.google.android.exoplayer.drm.ExoMediaDrm.ProvisionRequest provisionrequest)
		throws IOException
	{
		uuid = ((UUID) (new StringBuilder()));
	//    0    0:new             #83  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #84  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (uuid)).append(provisionrequest.getDefaultUrl());
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokeinterface #87  <Method String com.google.android.exoplayer.drm.ExoMediaDrm$ProvisionRequest.getDefaultUrl()>
	//    7   15:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		((StringBuilder) (uuid)).append("&signedRequest=");
	//    9   19:aload_1         
	//   10   20:ldc1            #93  <String "&signedRequest=">
	//   11   22:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
		((StringBuilder) (uuid)).append(new String(provisionrequest.getData()));
	//   13   26:aload_1         
	//   14   27:new             #95  <Class String>
	//   15   30:dup             
	//   16   31:aload_2         
	//   17   32:invokeinterface #96  <Method byte[] com.google.android.exoplayer.drm.ExoMediaDrm$ProvisionRequest.getData()>
	//   18   37:invokespecial   #99  <Method void String(byte[])>
	//   19   40:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   20   43:pop             
		return Util.executePost(((StringBuilder) (uuid)).toString(), ((byte []) (null)), PROVISIONING_REQUEST_PROPERTIES);
	//   21   44:aload_1         
	//   22   45:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   23   48:aconst_null     
	//   24   49:getstatic       #31  <Field Map PROVISIONING_REQUEST_PROPERTIES>
	//   25   52:invokestatic    #76  <Method byte[] Util.executePost(String, byte[], Map)>
	//   26   55:areturn         
	}

	private static final Map KEY_REQUEST_PROPERTIES;
	private static final String PLAYREADY_TEST_DEFAULT_URI = "http://playready.directtaps.net/pr/svc/rightsmanager.asmx";
	private static final Map PROVISIONING_REQUEST_PROPERTIES = Collections.singletonMap("Content-Type", "application/octet-stream");

	static 
	{
	//    0    0:ldc1            #21  <String "Content-Type">
	//    1    2:ldc1            #23  <String "application/octet-stream">
	//    2    4:invokestatic    #29  <Method Map Collections.singletonMap(Object, Object)>
	//    3    7:putstatic       #31  <Field Map PROVISIONING_REQUEST_PROPERTIES>
		HashMap hashmap = new HashMap();
	//    4   10:new             #33  <Class HashMap>
	//    5   13:dup             
	//    6   14:invokespecial   #36  <Method void HashMap()>
	//    7   17:astore_0        
		hashmap.put("Content-Type", "text/xml");
	//    8   18:aload_0         
	//    9   19:ldc1            #21  <String "Content-Type">
	//   10   21:ldc1            #38  <String "text/xml">
	//   11   23:invokevirtual   #42  <Method Object HashMap.put(Object, Object)>
	//   12   26:pop             
		hashmap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
	//   13   27:aload_0         
	//   14   28:ldc1            #44  <String "SOAPAction">
	//   15   30:ldc1            #46  <String "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense">
	//   16   32:invokevirtual   #42  <Method Object HashMap.put(Object, Object)>
	//   17   35:pop             
		KEY_REQUEST_PROPERTIES = ((Map) (hashmap));
	//   18   36:aload_0         
	//   19   37:putstatic       #48  <Field Map KEY_REQUEST_PROPERTIES>
	//*  20   40:return          
	}
}
