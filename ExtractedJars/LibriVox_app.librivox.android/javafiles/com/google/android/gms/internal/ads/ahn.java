// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.net.http.SslError;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.webkit.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			wx, aho, ahs

public class ahn extends WebViewClient
{

	public ahn()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void WebViewClient()>
	//    2    4:return          
	}

	public void a(aho aho1)
	{
	//    0    0:return          
	}

	final void a(ahs ahs1)
	{
		c = ahs1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #69  <Field ahs c>
	//    3    5:return          
	}

	public void b(aho aho1)
	{
	//    0    0:return          
	}

	public boolean c(aho aho1)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public WebResourceResponse d(aho aho1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final void onLoadResource(WebView webview, String s)
	{
		if(s == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		webview = ((WebView) (String.valueOf(((Object) (s)))));
	//    3    5:aload_2         
	//    4    6:invokestatic    #78  <Method String String.valueOf(Object)>
	//    5    9:astore_1        
		if(((String) (webview)).length() != 0)
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #82  <Method int String.length()>
	//*   8   14:ifeq            27
			webview = ((WebView) ("Loading resource: ".concat(((String) (webview)))));
	//    9   17:ldc1            #84  <String "Loading resource: ">
	//   10   19:aload_1         
	//   11   20:invokevirtual   #88  <Method String String.concat(String)>
	//   12   23:astore_1        
		else
	//*  13   24:goto            37
			webview = ((WebView) (new String("Loading resource: ")));
	//   14   27:new             #15  <Class String>
	//   15   30:dup             
	//   16   31:ldc1            #84  <String "Loading resource: ">
	//   17   33:invokespecial   #91  <Method void String(String)>
	//   18   36:astore_1        
		wx.a(((String) (webview)));
	//   19   37:aload_1         
	//   20   38:invokestatic    #95  <Method void wx.a(String)>
		b(new aho(s));
	//   21   41:aload_0         
	//   22   42:new             #97  <Class aho>
	//   23   45:dup             
	//   24   46:aload_2         
	//   25   47:invokespecial   #98  <Method void aho(String)>
	//   26   50:invokevirtual   #100 <Method void b(aho)>
	//   27   53:return          
	}

	public final void onPageFinished(WebView webview, String s)
	{
		if(s == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		webview = ((WebView) (new aho(s)));
	//    3    5:new             #97  <Class aho>
	//    4    8:dup             
	//    5    9:aload_2         
	//    6   10:invokespecial   #98  <Method void aho(String)>
	//    7   13:astore_1        
		s = ((String) (c));
	//    8   14:aload_0         
	//    9   15:getfield        #69  <Field ahs c>
	//   10   18:astore_2        
		if(s != null)
	//*  11   19:aload_2         
	//*  12   20:ifnull          31
		{
			((ahs) (s)).a(((aho) (webview)));
	//   13   23:aload_2         
	//   14   24:aload_1         
	//   15   25:invokeinterface #105 <Method void ahs.a(aho)>
			return;
	//   16   30:return          
		} else
		{
			a(((aho) (webview)));
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:invokevirtual   #106 <Method void a(aho)>
			return;
	//   20   36:return          
		}
	}

	public final void onReceivedError(WebView webview, int i, String s, String s1)
	{
		if(i < 0)
	//*   0    0:iload_2         
	//*   1    1:ifge            15
			if(-i - 1 < a.length);
	//    2    4:iload_2         
	//    3    5:ineg            
	//    4    6:iconst_1        
	//    5    7:isub            
	//    6    8:getstatic       #47  <Field String[] a>
	//    7   11:arraylength     
	//    8   12:icmplt          15
	//    9   15:return          
	}

	public final void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
	{
		if(sslerror == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		int i = sslerror.getPrimaryError();
	//    3    5:aload_3         
	//    4    6:invokevirtual   #115 <Method int SslError.getPrimaryError()>
	//    5    9:istore          4
		if(i >= 0)
	//*   6   11:iload           4
	//*   7   13:iflt            25
			if(i < b.length);
	//    8   16:iload           4
	//    9   18:getstatic       #61  <Field String[] b>
	//   10   21:arraylength     
	//   11   22:icmplt          25
		sslerror.getUrl();
	//   12   25:aload_3         
	//   13   26:invokevirtual   #119 <Method String SslError.getUrl()>
	//   14   29:pop             
	//   15   30:return          
	}

	public boolean onRenderProcessGone(WebView webview, RenderProcessGoneDetail renderprocessgonedetail)
	{
		if(webview.getParent() instanceof ViewGroup)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #127 <Method android.view.ViewParent WebView.getParent()>
	//*   2    4:instanceof      #129 <Class ViewGroup>
	//*   3    7:ifeq            21
			((ViewGroup)webview.getParent()).removeView(((android.view.View) (webview)));
	//    4   10:aload_1         
	//    5   11:invokevirtual   #127 <Method android.view.ViewParent WebView.getParent()>
	//    6   14:checkcast       #129 <Class ViewGroup>
	//    7   17:aload_1         
	//    8   18:invokevirtual   #133 <Method void ViewGroup.removeView(android.view.View)>
		webview.destroy();
	//    9   21:aload_1         
	//   10   22:invokevirtual   #136 <Method void WebView.destroy()>
		return true;
	//   11   25:iconst_1        
	//   12   26:ireturn         
	}

	public final WebResourceResponse shouldInterceptRequest(WebView webview, WebResourceRequest webresourcerequest)
	{
		if(webresourcerequest != null && webresourcerequest.getUrl() != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          29
	//*   2    4:aload_2         
	//*   3    5:invokeinterface #146 <Method android.net.Uri WebResourceRequest.getUrl()>
	//*   4   10:ifnonnull       16
	//*   5   13:goto            29
			return d(new aho(webresourcerequest));
	//    6   16:aload_0         
	//    7   17:new             #97  <Class aho>
	//    8   20:dup             
	//    9   21:aload_2         
	//   10   22:invokespecial   #149 <Method void aho(WebResourceRequest)>
	//   11   25:invokevirtual   #151 <Method WebResourceResponse d(aho)>
	//   12   28:areturn         
		else
			return null;
	//   13   29:aconst_null     
	//   14   30:areturn         
	}

	public final WebResourceResponse shouldInterceptRequest(WebView webview, String s)
	{
		if(s == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return d(new aho(s));
	//    4    6:aload_0         
	//    5    7:new             #97  <Class aho>
	//    6   10:dup             
	//    7   11:aload_2         
	//    8   12:invokespecial   #98  <Method void aho(String)>
	//    9   15:invokevirtual   #151 <Method WebResourceResponse d(aho)>
	//   10   18:areturn         
	}

	public final boolean shouldOverrideKeyEvent(WebView webview, KeyEvent keyevent)
	{
		int i = keyevent.getKeyCode();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #160 <Method int KeyEvent.getKeyCode()>
	//    2    4:istore_3        
		if(i != 79 && i != 222)
	//*   3    5:iload_3         
	//*   4    6:bipush          79
	//*   5    8:icmpeq          98
	//*   6   11:iload_3         
	//*   7   12:sipush          222
	//*   8   15:icmpeq          98
			switch(i)
	//*   9   18:iload_3         
			{
	//*  10   19:tableswitch     85 91: default 60
	//	               85 98
	//	               86 98
	//	               87 98
	//	               88 98
	//	               89 98
	//	               90 98
	//	               91 98
			default:
				switch(i)
	//*  11   60:iload_3         
				{
	//*  12   61:tableswitch     126 130: default 96
	//	               126 98
	//	               127 98
	//	               128 98
	//	               129 98
	//	               130 98
				default:
					return false;
	//   13   96:iconst_0        
	//   14   97:ireturn         

				case 126: // '~'
				case 127: // '\177'
				case 128: 
				case 129: 
				case 130: 
					break;
				}
				break;

			case 85: // 'U'
			case 86: // 'V'
			case 87: // 'W'
			case 88: // 'X'
			case 89: // 'Y'
			case 90: // 'Z'
			case 91: // '['
				break;
			}
		return true;
	//   15   98:iconst_1        
	//   16   99:ireturn         
	}

	public final boolean shouldOverrideUrlLoading(WebView webview, WebResourceRequest webresourcerequest)
	{
		if(webresourcerequest != null && webresourcerequest.getUrl() != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          29
	//*   2    4:aload_2         
	//*   3    5:invokeinterface #146 <Method android.net.Uri WebResourceRequest.getUrl()>
	//*   4   10:ifnonnull       16
	//*   5   13:goto            29
			return c(new aho(webresourcerequest));
	//    6   16:aload_0         
	//    7   17:new             #97  <Class aho>
	//    8   20:dup             
	//    9   21:aload_2         
	//   10   22:invokespecial   #149 <Method void aho(WebResourceRequest)>
	//   11   25:invokevirtual   #164 <Method boolean c(aho)>
	//   12   28:ireturn         
		else
			return false;
	//   13   29:iconst_0        
	//   14   30:ireturn         
	}

	public final boolean shouldOverrideUrlLoading(WebView webview, String s)
	{
		if(s == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		else
			return c(new aho(s));
	//    4    6:aload_0         
	//    5    7:new             #97  <Class aho>
	//    6   10:dup             
	//    7   11:aload_2         
	//    8   12:invokespecial   #98  <Method void aho(String)>
	//    9   15:invokevirtual   #164 <Method boolean c(aho)>
	//   10   18:ireturn         
	}

	private static final String a[] = {
		"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", 
		"FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"
	};
	private static final String b[] = {
		"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"
	};
	private ahs c;

	static 
	{
	//    0    0:bipush          15
	//    1    2:anewarray       String[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #17  <String "UNKNOWN">
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #19  <String "HOST_LOOKUP">
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #21  <String "UNSUPPORTED_AUTH_SCHEME">
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #23  <String "AUTHENTICATION">
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #25  <String "PROXY_AUTHENTICATION">
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #27  <String "CONNECT">
	//   25   34:aastore         
	//   26   35:dup             
	//   27   36:bipush          6
	//   28   38:ldc1            #29  <String "IO">
	//   29   40:aastore         
	//   30   41:dup             
	//   31   42:bipush          7
	//   32   44:ldc1            #31  <String "TIMEOUT">
	//   33   46:aastore         
	//   34   47:dup             
	//   35   48:bipush          8
	//   36   50:ldc1            #33  <String "REDIRECT_LOOP">
	//   37   52:aastore         
	//   38   53:dup             
	//   39   54:bipush          9
	//   40   56:ldc1            #35  <String "UNSUPPORTED_SCHEME">
	//   41   58:aastore         
	//   42   59:dup             
	//   43   60:bipush          10
	//   44   62:ldc1            #37  <String "FAILED_SSL_HANDSHAKE">
	//   45   64:aastore         
	//   46   65:dup             
	//   47   66:bipush          11
	//   48   68:ldc1            #39  <String "BAD_URL">
	//   49   70:aastore         
	//   50   71:dup             
	//   51   72:bipush          12
	//   52   74:ldc1            #41  <String "FILE">
	//   53   76:aastore         
	//   54   77:dup             
	//   55   78:bipush          13
	//   56   80:ldc1            #43  <String "FILE_NOT_FOUND">
	//   57   82:aastore         
	//   58   83:dup             
	//   59   84:bipush          14
	//   60   86:ldc1            #45  <String "TOO_MANY_REQUESTS">
	//   61   88:aastore         
	//   62   89:putstatic       #47  <Field String[] a>
	//   63   92:bipush          6
	//   64   94:anewarray       String[]
	//   65   97:dup             
	//   66   98:iconst_0        
	//   67   99:ldc1            #49  <String "NOT_YET_VALID">
	//   68  101:aastore         
	//   69  102:dup             
	//   70  103:iconst_1        
	//   71  104:ldc1            #51  <String "EXPIRED">
	//   72  106:aastore         
	//   73  107:dup             
	//   74  108:iconst_2        
	//   75  109:ldc1            #53  <String "ID_MISMATCH">
	//   76  111:aastore         
	//   77  112:dup             
	//   78  113:iconst_3        
	//   79  114:ldc1            #55  <String "UNTRUSTED">
	//   80  116:aastore         
	//   81  117:dup             
	//   82  118:iconst_4        
	//   83  119:ldc1            #57  <String "DATE_INVALID">
	//   84  121:aastore         
	//   85  122:dup             
	//   86  123:iconst_5        
	//   87  124:ldc1            #59  <String "INVALID">
	//   88  126:aastore         
	//   89  127:putstatic       #61  <Field String[] b>
	//*  90  130:return          
	}
}
