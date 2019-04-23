// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.webkit.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bqt, bqj, bqp

final class bqr
	implements Runnable
{

	bqr(bqp bqp, bqj bqj, WebView webview, boolean flag)
	{
		d = bqp;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field bqp d>
		a = bqj;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field bqj a>
		b = webview;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field WebView b>
		c = flag;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #26  <Field boolean c>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #29  <Method void Object()>
		e = ((ValueCallback) (new bqt(this)));
	//   14   25:aload_0         
	//   15   26:new             #31  <Class bqt>
	//   16   29:dup             
	//   17   30:aload_0         
	//   18   31:invokespecial   #34  <Method void bqt(bqr)>
	//   19   34:putfield        #36  <Field ValueCallback e>
	//   20   37:return          
	}

	public final void run()
	{
		Throwable throwable;
		if(b.getSettings().getJavaScriptEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field WebView b>
	//*   2    4:invokevirtual   #46  <Method WebSettings WebView.getSettings()>
	//*   3    7:invokevirtual   #52  <Method boolean WebSettings.getJavaScriptEnabled()>
	//*   4   10:ifeq            38
			try
			{
				b.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", e);
	//    5   13:aload_0         
	//    6   14:getfield        #24  <Field WebView b>
	//    7   17:ldc1            #54  <String "(function() { return  {text:document.body.innerText}})();">
	//    8   19:aload_0         
	//    9   20:getfield        #36  <Field ValueCallback e>
	//   10   23:invokevirtual   #58  <Method void WebView.evaluateJavascript(String, ValueCallback)>
				return;
	//   11   26:return          
			}
	//*  12   27:aload_0         
	//*  13   28:getfield        #36  <Field ValueCallback e>
	//*  14   31:ldc1            #60  <String "">
	//*  15   33:invokeinterface #66  <Method void ValueCallback.onReceiveValue(Object)>
	//*  16   38:return          
			// Misplaced declaration of an exception variable
			catch(Throwable throwable)
			{
				e.onReceiveValue("");
			}
	//*  17   39:astore_1        
	//*  18   40:goto            27
	}

	final bqj a;
	final WebView b;
	final boolean c;
	final bqp d;
	private ValueCallback e;
}
