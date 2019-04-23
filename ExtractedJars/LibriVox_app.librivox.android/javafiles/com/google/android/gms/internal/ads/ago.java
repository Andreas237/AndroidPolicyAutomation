// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			agn, afn, bse

public final class ago extends agn
{

	public ago(afn afn, bse bse, boolean flag)
	{
		super(afn, bse, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #12  <Method void agn(afn, bse, boolean)>
	//    5    7:return          
	}

	public final WebResourceResponse shouldInterceptRequest(WebView webview, WebResourceRequest webresourcerequest)
	{
		if(webresourcerequest != null && webresourcerequest.getUrl() != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          37
	//*   2    4:aload_2         
	//*   3    5:invokeinterface #21  <Method Uri WebResourceRequest.getUrl()>
	//*   4   10:ifnonnull       16
	//*   5   13:goto            37
			return ((agn)this).a(webview, webresourcerequest.getUrl().toString(), webresourcerequest.getRequestHeaders());
	//    6   16:aload_0         
	//    7   17:aload_1         
	//    8   18:aload_2         
	//    9   19:invokeinterface #21  <Method Uri WebResourceRequest.getUrl()>
	//   10   24:invokevirtual   #27  <Method String Uri.toString()>
	//   11   27:aload_2         
	//   12   28:invokeinterface #31  <Method java.util.Map WebResourceRequest.getRequestHeaders()>
	//   13   33:invokevirtual   #35  <Method WebResourceResponse agn.a(WebView, String, java.util.Map)>
	//   14   36:areturn         
		else
			return null;
	//   15   37:aconst_null     
	//   16   38:areturn         
	}
}
