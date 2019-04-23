// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;

// Referenced classes of package com.google.android.gms.internal.ads:
//			agn, afn, bse

public final class agm extends agn
{

	public agm(afn afn, bse bse, boolean flag)
	{
		super(afn, bse, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #12  <Method void agn(afn, bse, boolean)>
	//    5    7:return          
	}

	public final WebResourceResponse shouldInterceptRequest(WebView webview, String s)
	{
		return ((agn)this).a(webview, s, ((java.util.Map) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #19  <Method WebResourceResponse agn.a(WebView, String, java.util.Map)>
	//    5    7:areturn         
	}
}
