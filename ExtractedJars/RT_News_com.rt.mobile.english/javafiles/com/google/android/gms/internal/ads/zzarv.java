// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaru, zzaqw

public final class zzarv extends zzaru
{

	public zzarv(zzaqw zzaqw, boolean flag)
	{
		super(zzaqw, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #12  <Method void zzaru(zzaqw, boolean)>
	//    4    6:return          
	}

	public final WebResourceResponse shouldInterceptRequest(WebView webview, WebResourceRequest webresourcerequest)
	{
		if(webresourcerequest != null && webresourcerequest.getUrl() != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          37
	//*   2    4:aload_2         
	//*   3    5:invokeinterface #22  <Method Uri WebResourceRequest.getUrl()>
	//*   4   10:ifnonnull       16
	//*   5   13:goto            37
			return ((zzaru)this).zza(webview, webresourcerequest.getUrl().toString(), webresourcerequest.getRequestHeaders());
	//    6   16:aload_0         
	//    7   17:aload_1         
	//    8   18:aload_2         
	//    9   19:invokeinterface #22  <Method Uri WebResourceRequest.getUrl()>
	//   10   24:invokevirtual   #28  <Method String Uri.toString()>
	//   11   27:aload_2         
	//   12   28:invokeinterface #32  <Method java.util.Map WebResourceRequest.getRequestHeaders()>
	//   13   33:invokevirtual   #36  <Method WebResourceResponse zzaru.zza(WebView, String, java.util.Map)>
	//   14   36:areturn         
		else
			return null;
	//   15   37:aconst_null     
	//   16   38:areturn         
	}
}
