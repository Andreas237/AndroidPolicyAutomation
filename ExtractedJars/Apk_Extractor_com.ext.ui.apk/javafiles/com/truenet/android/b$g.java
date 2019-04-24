// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.truenet.android;

import android.support.v7.*;
import android.webkit.*;

// Referenced classes of package com.truenet.android:
//			b

static final class b$g extends af
	implements v
{

	public Object a()
	{
		return ((Object) (b()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method WebView b()>
	//    2    4:areturn         
	}

	public final WebView b()
	{
		WebView webview = new WebView(com.truenet.android.b.c(b.this));
	//    0    0:new             #30  <Class WebView>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field b this$0>
	//    4    8:invokestatic    #34  <Method android.content.Context b.c(b)>
	//    5   11:invokespecial   #37  <Method void WebView(android.content.Context)>
	//    6   14:astore_1        
		if(android.os.d.VERSION.SDK_INT >= 11)
	//*   7   15:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   18:bipush          11
	//*   9   20:icmplt          29
			webview.setLayerType(1, ((android.graphics.Paint) (null)));
	//   10   23:aload_1         
	//   11   24:iconst_1        
	//   12   25:aconst_null     
	//   13   26:invokevirtual   #47  <Method void WebView.setLayerType(int, android.graphics.Paint)>
		WebSettings websettings = webview.getSettings();
	//   14   29:aload_1         
	//   15   30:invokevirtual   #51  <Method WebSettings WebView.getSettings()>
	//   16   33:astore_2        
		ae.a(((Object) (websettings)), "settings");
	//   17   34:aload_2         
	//   18   35:ldc1            #53  <String "settings">
	//   19   37:invokestatic    #58  <Method void ae.a(Object, String)>
		websettings.setJavaScriptEnabled(true);
	//   20   40:aload_2         
	//   21   41:iconst_1        
	//   22   42:invokevirtual   #64  <Method void WebSettings.setJavaScriptEnabled(boolean)>
		webview.setWebChromeClient(new WebChromeClient());
	//   23   45:aload_1         
	//   24   46:new             #66  <Class WebChromeClient>
	//   25   49:dup             
	//   26   50:invokespecial   #69  <Method void WebChromeClient()>
	//   27   53:invokevirtual   #73  <Method void WebView.setWebChromeClient(WebChromeClient)>
		webview.setWebViewClient((WebViewClient)new b$c(b.this));
	//   28   56:aload_1         
	//   29   57:new             #75  <Class b$c>
	//   30   60:dup             
	//   31   61:aload_0         
	//   32   62:getfield        #17  <Field b this$0>
	//   33   65:invokespecial   #77  <Method void b$c(b)>
	//   34   68:checkcast       #79  <Class WebViewClient>
	//   35   71:invokevirtual   #83  <Method void WebView.setWebViewClient(WebViewClient)>
		return webview;
	//   36   74:aload_1         
	//   37   75:areturn         
	}

	final b this$0;

	b$g(b b1)
	{
		this$0 = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field b this$0>
		super(0);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokespecial   #20  <Method void af(int)>
	//    6   10:return          
	}
}
