// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.google.ads.interactivemedia.v3.impl:
//			ac

class ac$1 extends WebViewClient
{

	public void onPageFinished(WebView webview, String s)
	{
		webview = ((WebView) (String.valueOf(((Object) (s)))));
	//    0    0:aload_2         
	//    1    1:invokestatic    #26  <Method String String.valueOf(Object)>
	//    2    4:astore_1        
		if(((String) (webview)).length() != 0)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #30  <Method int String.length()>
	//*   5    9:ifeq            22
			webview = ((WebView) ("Finished ".concat(((String) (webview)))));
	//    6   12:ldc1            #32  <String "Finished ">
	//    7   14:aload_1         
	//    8   15:invokevirtual   #36  <Method String String.concat(String)>
	//    9   18:astore_1        
		else
	//*  10   19:goto            32
			webview = ((WebView) (new String("Finished ")));
	//   11   22:new             #22  <Class String>
	//   12   25:dup             
	//   13   26:ldc1            #32  <String "Finished ">
	//   14   28:invokespecial   #39  <Method void String(String)>
	//   15   31:astore_1        
		ac.c(((String) (webview)));
	//   16   32:aload_1         
	//   17   33:invokestatic    #42  <Method void ac.c(String)>
	//   18   36:return          
	}

	public void onPageStarted(WebView webview, String s, Bitmap bitmap)
	{
		webview = ((WebView) (String.valueOf(((Object) (s)))));
	//    0    0:aload_2         
	//    1    1:invokestatic    #26  <Method String String.valueOf(Object)>
	//    2    4:astore_1        
		if(((String) (webview)).length() != 0)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #30  <Method int String.length()>
	//*   5    9:ifeq            22
			webview = ((WebView) ("Started ".concat(((String) (webview)))));
	//    6   12:ldc1            #46  <String "Started ">
	//    7   14:aload_1         
	//    8   15:invokevirtual   #36  <Method String String.concat(String)>
	//    9   18:astore_1        
		else
	//*  10   19:goto            32
			webview = ((WebView) (new String("Started ")));
	//   11   22:new             #22  <Class String>
	//   12   25:dup             
	//   13   26:ldc1            #46  <String "Started ">
	//   14   28:invokespecial   #39  <Method void String(String)>
	//   15   31:astore_1        
		ac.c(((String) (webview)));
	//   16   32:aload_1         
	//   17   33:invokestatic    #42  <Method void ac.c(String)>
	//   18   36:return          
	}

	public void onReceivedError(WebView webview, int i, String s, String s1)
	{
		webview = ((WebView) (new StringBuilder(String.valueOf(((Object) (s))).length() + 20 + String.valueOf(((Object) (s1))).length())));
	//    0    0:new             #50  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_3         
	//    3    5:invokestatic    #26  <Method String String.valueOf(Object)>
	//    4    8:invokevirtual   #30  <Method int String.length()>
	//    5   11:bipush          20
	//    6   13:iadd            
	//    7   14:aload           4
	//    8   16:invokestatic    #26  <Method String String.valueOf(Object)>
	//    9   19:invokevirtual   #30  <Method int String.length()>
	//   10   22:iadd            
	//   11   23:invokespecial   #53  <Method void StringBuilder(int)>
	//   12   26:astore_1        
		((StringBuilder) (webview)).append("Error: ");
	//   13   27:aload_1         
	//   14   28:ldc1            #55  <String "Error: ">
	//   15   30:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
		((StringBuilder) (webview)).append(i);
	//   17   34:aload_1         
	//   18   35:iload_2         
	//   19   36:invokevirtual   #62  <Method StringBuilder StringBuilder.append(int)>
	//   20   39:pop             
		((StringBuilder) (webview)).append(" ");
	//   21   40:aload_1         
	//   22   41:ldc1            #64  <String " ">
	//   23   43:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   24   46:pop             
		((StringBuilder) (webview)).append(s);
	//   25   47:aload_1         
	//   26   48:aload_3         
	//   27   49:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   28   52:pop             
		((StringBuilder) (webview)).append(" ");
	//   29   53:aload_1         
	//   30   54:ldc1            #64  <String " ">
	//   31   56:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   32   59:pop             
		((StringBuilder) (webview)).append(s1);
	//   33   60:aload_1         
	//   34   61:aload           4
	//   35   63:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   36   66:pop             
		ac.c(((StringBuilder) (webview)).toString());
	//   37   67:aload_1         
	//   38   68:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   39   71:invokestatic    #42  <Method void ac.c(String)>
	//   40   74:return          
	}

	public boolean shouldOverrideUrlLoading(WebView webview, String s)
	{
		if(!s.startsWith("gmsg://"))
	//*   0    0:aload_2         
	//*   1    1:ldc1            #72  <String "gmsg://">
	//*   2    3:invokevirtual   #76  <Method boolean String.startsWith(String)>
	//*   3    6:ifne            11
		{
			return false;
	//    4    9:iconst_0        
	//    5   10:ireturn         
		} else
		{
			a.b(s);
	//    6   11:aload_0         
	//    7   12:getfield        #14  <Field ac a>
	//    8   15:aload_2         
	//    9   16:invokevirtual   #79  <Method void ac.b(String)>
			return true;
	//   10   19:iconst_1        
	//   11   20:ireturn         
		}
	}

	final ac a;

	ac$1(ac ac1)
	{
		a = ac1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ac a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void WebViewClient()>
	//    5    9:return          
	}
}
