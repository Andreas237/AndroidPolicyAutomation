// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.truenet.android;

import android.webkit.*;
import java.util.concurrent.*;

// Referenced classes of package com.truenet.android:
//			b

public final class b$c extends WebViewClient
{

	private final void a()
	{
		ScheduledFuture scheduledfuture = c;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ScheduledFuture c>
	//    2    4:astore_1        
		if(scheduledfuture != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          17
			scheduledfuture.cancel(false);
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:invokeinterface #40  <Method boolean ScheduledFuture.cancel(boolean)>
	//    8   16:pop             
		c = (ScheduledFuture)null;
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:checkcast       #36  <Class ScheduledFuture>
	//   12   22:putfield        #34  <Field ScheduledFuture c>
	//   13   25:return          
	}

	private final void a(WebView webview, String s)
	{
		a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void a()>
		if(s != null)
	//*   2    4:aload_2         
	//*   3    5:ifnull          28
		{
			if(webview != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          16
				webview.stopLoading();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #48  <Method void WebView.stopLoading()>
			com.truenet.android.b.a(a).offer(((Object) (s)));
	//    8   16:aload_0         
	//    9   17:getfield        #19  <Field b a>
	//   10   20:invokestatic    #51  <Method SynchronousQueue b.a(b)>
	//   11   23:aload_2         
	//   12   24:invokevirtual   #57  <Method boolean SynchronousQueue.offer(Object)>
	//   13   27:pop             
		}
	//   14   28:return          
	}

	public void onPageFinished(WebView webview, String s)
	{
		a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void a()>
		static final class a
			implements Runnable
		{

			public final void run()
			{
				com.truenet.android.b.a(a.a).offer("");
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field b$c a>
			//    2    4:getfield        #28  <Field b b$c.a>
			//    3    7:invokestatic    #31  <Method SynchronousQueue b.a(b)>
			//    4   10:ldc1            #33  <String "">
			//    5   12:invokevirtual   #39  <Method boolean SynchronousQueue.offer(Object)>
			//    6   15:pop             
			//    7   16:return          
			}

			final b.c a;

			a(b.c c1)
			{
				a = c1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field b$c a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
		}

		c = b.schedule((Runnable)new a(this), 1L, TimeUnit.SECONDS);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field ScheduledExecutorService b>
	//    5    9:new             #9   <Class b$c$a>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokespecial   #62  <Method void b$c$a(b$c)>
	//    9   17:checkcast       #64  <Class Runnable>
	//   10   20:lconst_1        
	//   11   21:getstatic       #70  <Field TimeUnit TimeUnit.SECONDS>
	//   12   24:invokeinterface #76  <Method ScheduledFuture ScheduledExecutorService.schedule(Runnable, long, TimeUnit)>
	//   13   29:putfield        #34  <Field ScheduledFuture c>
		super.onPageFinished(webview, s);
	//   14   32:aload_0         
	//   15   33:aload_1         
	//   16   34:aload_2         
	//   17   35:invokespecial   #78  <Method void WebViewClient.onPageFinished(WebView, String)>
	//   18   38:return          
	}

	public void onReceivedError(WebView webview, WebResourceRequest webresourcerequest, WebResourceError webresourceerror)
	{
		a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void a()>
		if(webview != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          12
			webview.stopLoading();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #48  <Method void WebView.stopLoading()>
		com.truenet.android.b.a(a).offer("");
	//    6   12:aload_0         
	//    7   13:getfield        #19  <Field b a>
	//    8   16:invokestatic    #51  <Method SynchronousQueue b.a(b)>
	//    9   19:ldc1            #83  <String "">
	//   10   21:invokevirtual   #57  <Method boolean SynchronousQueue.offer(Object)>
	//   11   24:pop             
		super.onReceivedError(webview, webresourcerequest, webresourceerror);
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:aload_2         
	//   15   28:aload_3         
	//   16   29:invokespecial   #85  <Method void WebViewClient.onReceivedError(WebView, WebResourceRequest, WebResourceError)>
	//   17   32:return          
	}

	public boolean shouldOverrideUrlLoading(WebView webview, WebResourceRequest webresourcerequest)
	{
		if(webresourcerequest != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          22
			webresourcerequest = ((WebResourceRequest) (webresourcerequest.getUrl()));
	//    2    4:aload_2         
	//    3    5:invokeinterface #96  <Method android.net.Uri WebResourceRequest.getUrl()>
	//    4   10:astore_2        
		else
	//*   5   11:aload_0         
	//*   6   12:aload_1         
	//*   7   13:aload_2         
	//*   8   14:invokestatic    #102 <Method String String.valueOf(Object)>
	//*   9   17:invokespecial   #104 <Method void a(WebView, String)>
	//*  10   20:iconst_1        
	//*  11   21:ireturn         
			webresourcerequest = null;
	//   12   22:aconst_null     
	//   13   23:astore_2        
		a(webview, String.valueOf(((Object) (webresourcerequest))));
		return true;
	//*  14   24:goto            11
	}

	public boolean shouldOverrideUrlLoading(WebView webview, String s)
	{
		a(webview, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #104 <Method void a(WebView, String)>
		return true;
	//    4    6:iconst_1        
	//    5    7:ireturn         
	}

	final b a;
	private ScheduledExecutorService b;
	private ScheduledFuture c;

	public b$c(b b1)
	{
		a = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field b a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void WebViewClient()>
		b = Executors.newScheduledThreadPool(1);
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:invokestatic    #28  <Method ScheduledExecutorService Executors.newScheduledThreadPool(int)>
	//    8   14:putfield        #30  <Field ScheduledExecutorService b>
	//    9   17:return          
	}
}
