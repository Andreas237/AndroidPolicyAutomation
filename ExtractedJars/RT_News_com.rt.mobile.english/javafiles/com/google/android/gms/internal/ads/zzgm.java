// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.webkit.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzgn, zzgk, zzge

final class zzgm
	implements Runnable
{

	zzgm(zzgk zzgk, zzge zzge, WebView webview, boolean flag)
	{
		zzaik = zzgk;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field zzgk zzaik>
		zzaim = zzge;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field zzge zzaim>
		zzain = webview;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field WebView zzain>
		zzaio = flag;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #27  <Field boolean zzaio>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #30  <Method void Object()>
		zzail = ((ValueCallback) (new zzgn(this)));
	//   14   25:aload_0         
	//   15   26:new             #32  <Class zzgn>
	//   16   29:dup             
	//   17   30:aload_0         
	//   18   31:invokespecial   #35  <Method void zzgn(zzgm)>
	//   19   34:putfield        #37  <Field ValueCallback zzail>
	//   20   37:return          
	}

	public final void run()
	{
		Throwable throwable;
		if(zzain.getSettings().getJavaScriptEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field WebView zzain>
	//*   2    4:invokevirtual   #47  <Method WebSettings WebView.getSettings()>
	//*   3    7:invokevirtual   #53  <Method boolean WebSettings.getJavaScriptEnabled()>
	//*   4   10:ifeq            38
			try
			{
				zzain.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", zzail);
	//    5   13:aload_0         
	//    6   14:getfield        #25  <Field WebView zzain>
	//    7   17:ldc1            #55  <String "(function() { return  {text:document.body.innerText}})();">
	//    8   19:aload_0         
	//    9   20:getfield        #37  <Field ValueCallback zzail>
	//   10   23:invokevirtual   #59  <Method void WebView.evaluateJavascript(String, ValueCallback)>
				return;
	//   11   26:return          
			}
	//*  12   27:aload_0         
	//*  13   28:getfield        #37  <Field ValueCallback zzail>
	//*  14   31:ldc1            #61  <String "">
	//*  15   33:invokeinterface #67  <Method void ValueCallback.onReceiveValue(Object)>
	//*  16   38:return          
			// Misplaced declaration of an exception variable
			catch(Throwable throwable)
			{
				zzail.onReceiveValue("");
			}
	//*  17   39:astore_1        
	//*  18   40:goto            27
	}

	final zzgk zzaik;
	private ValueCallback zzail;
	final zzge zzaim;
	final WebView zzain;
	final boolean zzaio;
}
