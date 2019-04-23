// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media.renderers.exoPlayerRenderers;

import android.text.TextUtils;
import com.google.android.exoplayer.drm.MediaDrmCallback;
import com.google.android.exoplayer.util.Util;
import java.io.IOException;
import java.util.UUID;

public class WidevineTestMediaDrmCallback
	implements MediaDrmCallback
{

	public WidevineTestMediaDrmCallback(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #21  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #22  <Method void StringBuilder()>
	//    5   11:astore_2        
		stringbuilder.append("http://wv-staging-proxy.appspot.com/proxy?provider=YouTube&video_id=");
	//    6   12:aload_2         
	//    7   13:ldc1            #13  <String "http://wv-staging-proxy.appspot.com/proxy?provider=YouTube&video_id=">
	//    8   15:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(s);
	//   10   19:aload_2         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   13   24:pop             
		defaultUri = stringbuilder.toString();
	//   14   25:aload_0         
	//   15   26:aload_2         
	//   16   27:invokevirtual   #30  <Method String StringBuilder.toString()>
	//   17   30:putfield        #32  <Field String defaultUri>
	//   18   33:return          
	}

	public byte[] executeKeyRequest(UUID uuid, com.google.android.exoplayer.drm.ExoMediaDrm.KeyRequest keyrequest)
		throws IOException
	{
		String s = keyrequest.getDefaultUrl();
	//    0    0:aload_2         
	//    1    1:invokeinterface #42  <Method String com.google.android.exoplayer.drm.ExoMediaDrm$KeyRequest.getDefaultUrl()>
	//    2    6:astore_3        
		uuid = ((UUID) (s));
	//    3    7:aload_3         
	//    4    8:astore_1        
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   5    9:aload_3         
	//*   6   10:invokestatic    #48  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   7   13:ifeq            21
			uuid = ((UUID) (defaultUri));
	//    8   16:aload_0         
	//    9   17:getfield        #32  <Field String defaultUri>
	//   10   20:astore_1        
		return Util.executePost(((String) (uuid)), keyrequest.getData(), ((java.util.Map) (null)));
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokeinterface #52  <Method byte[] com.google.android.exoplayer.drm.ExoMediaDrm$KeyRequest.getData()>
	//   14   28:aconst_null     
	//   15   29:invokestatic    #58  <Method byte[] Util.executePost(String, byte[], java.util.Map)>
	//   16   32:areturn         
	}

	public byte[] executeProvisionRequest(UUID uuid, com.google.android.exoplayer.drm.ExoMediaDrm.ProvisionRequest provisionrequest)
		throws IOException
	{
		uuid = ((UUID) (new StringBuilder()));
	//    0    0:new             #21  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (uuid)).append(provisionrequest.getDefaultUrl());
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokeinterface #64  <Method String com.google.android.exoplayer.drm.ExoMediaDrm$ProvisionRequest.getDefaultUrl()>
	//    7   15:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		((StringBuilder) (uuid)).append("&signedRequest=");
	//    9   19:aload_1         
	//   10   20:ldc1            #66  <String "&signedRequest=">
	//   11   22:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
		((StringBuilder) (uuid)).append(new String(provisionrequest.getData()));
	//   13   26:aload_1         
	//   14   27:new             #68  <Class String>
	//   15   30:dup             
	//   16   31:aload_2         
	//   17   32:invokeinterface #69  <Method byte[] com.google.android.exoplayer.drm.ExoMediaDrm$ProvisionRequest.getData()>
	//   18   37:invokespecial   #72  <Method void String(byte[])>
	//   19   40:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   20   43:pop             
		return Util.executePost(((StringBuilder) (uuid)).toString(), ((byte []) (null)), ((java.util.Map) (null)));
	//   21   44:aload_1         
	//   22   45:invokevirtual   #30  <Method String StringBuilder.toString()>
	//   23   48:aconst_null     
	//   24   49:aconst_null     
	//   25   50:invokestatic    #58  <Method byte[] Util.executePost(String, byte[], java.util.Map)>
	//   26   53:areturn         
	}

	private static final String WIDEVINE_GTS_DEFAULT_BASE_URI = "http://wv-staging-proxy.appspot.com/proxy?provider=YouTube&video_id=";
	private final String defaultUri;
}
