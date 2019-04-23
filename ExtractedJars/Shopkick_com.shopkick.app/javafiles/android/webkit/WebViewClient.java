// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.webkit;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;

// Referenced classes of package android.webkit:
//			HttpAuthHandler, SslErrorHandler, WebView

public class WebViewClient
{

	public WebViewClient()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
	//    2    4:return          
	}

	public void doUpdateVisitedHistory(WebView webview, String s, boolean flag)
	{
	//    0    0:return          
	}

	public void onFormResubmission(WebView webview, Message message, Message message1)
	{
		message.sendToTarget();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #49  <Method void Message.sendToTarget()>
	//    2    4:return          
	}

	public void onLoadResource(WebView webview, String s)
	{
	//    0    0:return          
	}

	public void onPageFinished(WebView webview, String s)
	{
	//    0    0:return          
	}

	public void onPageStarted(WebView webview, String s, Bitmap bitmap)
	{
	//    0    0:return          
	}

	public void onReceivedError(WebView webview, int i, String s, String s1)
	{
	//    0    0:return          
	}

	public void onReceivedHttpAuthRequest(WebView webview, HttpAuthHandler httpauthhandler, String s, String s1)
	{
		httpauthhandler.cancel();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #63  <Method void HttpAuthHandler.cancel()>
	//    2    4:return          
	}

	public void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
	{
		sslerrorhandler.cancel();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #68  <Method void SslErrorHandler.cancel()>
	//    2    4:return          
	}

	public void onScaleChanged(WebView webview, float f, float f1)
	{
	//    0    0:return          
	}

	public void onTooManyRedirects(WebView webview, Message message, Message message1)
	{
		message.sendToTarget();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #49  <Method void Message.sendToTarget()>
	//    2    4:return          
	}

	public void onUnhandledKeyEvent(WebView webview, KeyEvent keyevent)
	{
	//    0    0:return          
	}

	public boolean shouldOverrideKeyEvent(WebView webview, KeyEvent keyevent)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean shouldOverrideUrlLoading(WebView webview, String s)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public static final int ERROR_AUTHENTICATION = -4;
	public static final int ERROR_BAD_URL = -12;
	public static final int ERROR_CONNECT = -6;
	public static final int ERROR_FAILED_SSL_HANDSHAKE = -11;
	public static final int ERROR_FILE = -13;
	public static final int ERROR_FILE_NOT_FOUND = -14;
	public static final int ERROR_HOST_LOOKUP = -2;
	public static final int ERROR_IO = -7;
	public static final int ERROR_PROXY_AUTHENTICATION = -5;
	public static final int ERROR_REDIRECT_LOOP = -9;
	public static final int ERROR_TIMEOUT = -8;
	public static final int ERROR_TOO_MANY_REQUESTS = -15;
	public static final int ERROR_UNKNOWN = -1;
	public static final int ERROR_UNSUPPORTED_AUTH_SCHEME = -3;
	public static final int ERROR_UNSUPPORTED_SCHEME = -10;
}
