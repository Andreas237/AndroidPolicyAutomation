// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.webkit.*;

// Referenced classes of package o:
//			fr, hw, ft, fp, 
//			hr

public final class fs extends WebViewClient
{

	public fs(Activity activity)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void WebViewClient()>
		f = ((Runnable) (new fr(this)));
	//    2    4:aload_0         
	//    3    5:new             #22  <Class fr>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #25  <Method void fr(fs)>
	//    7   13:putfield        #27  <Field Runnable f>
		d = activity;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #29  <Field Activity d>
		e = new Handler(d.getMainLooper());
	//   11   21:aload_0         
	//   12   22:new             #31  <Class Handler>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:getfield        #29  <Field Activity d>
	//   16   30:invokevirtual   #37  <Method android.os.Looper Activity.getMainLooper()>
	//   17   33:invokespecial   #40  <Method void Handler(android.os.Looper)>
	//   18   36:putfield        #42  <Field Handler e>
	//   19   39:return          
	}

	static Activity a(fs fs1)
	{
		return fs1.d;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Activity d>
	//    2    4:areturn         
	}

	static boolean a(fs fs1, boolean flag)
	{
		fs1.c = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #47  <Field boolean c>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private void b()
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field hw a>
	//*   2    4:ifnull          14
			a.b();
	//    3    7:aload_0         
	//    4    8:getfield        #49  <Field hw a>
	//    5   11:invokevirtual   #53  <Method void hw.b()>
		a = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #49  <Field hw a>
	//    9   19:return          
	}

	static void e(fs fs1)
	{
		fs1.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void b()>
	//    2    4:return          
	}

	public final void onPageFinished(WebView webview, String s)
	{
		if(e != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field Handler e>
	//*   2    4:ifnull          22
		{
			b();
	//    3    7:aload_0         
	//    4    8:invokespecial   #54  <Method void b()>
			e.removeCallbacks(f);
	//    5   11:aload_0         
	//    6   12:getfield        #42  <Field Handler e>
	//    7   15:aload_0         
	//    8   16:getfield        #27  <Field Runnable f>
	//    9   19:invokevirtual   #60  <Method void Handler.removeCallbacks(Runnable)>
		}
	//   10   22:return          
	}

	public final void onPageStarted(WebView webview, String s, Bitmap bitmap)
	{
		if(e != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field Handler e>
	//*   2    4:ifnull          61
		{
			if(a == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #49  <Field hw a>
	//*   5   11:ifnonnull       39
			{
				a = new hw(d, "\u6B63\u5728\u52A0\u8F7D");
	//    6   14:aload_0         
	//    7   15:new             #51  <Class hw>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:getfield        #29  <Field Activity d>
	//   11   23:ldc1            #64  <String "\u6B63\u5728\u52A0\u8F7D">
	//   12   25:invokespecial   #67  <Method void hw(Activity, String)>
	//   13   28:putfield        #49  <Field hw a>
				a.b = true;
	//   14   31:aload_0         
	//   15   32:getfield        #49  <Field hw a>
	//   16   35:iconst_1        
	//   17   36:putfield        #69  <Field boolean hw.b>
			}
			a.c();
	//   18   39:aload_0         
	//   19   40:getfield        #49  <Field hw a>
	//   20   43:invokevirtual   #71  <Method void hw.c()>
			e.postDelayed(f, 30000L);
	//   21   46:aload_0         
	//   22   47:getfield        #42  <Field Handler e>
	//   23   50:aload_0         
	//   24   51:getfield        #27  <Field Runnable f>
	//   25   54:ldc2w           #72  <Long 30000L>
	//   26   57:invokevirtual   #77  <Method boolean Handler.postDelayed(Runnable, long)>
	//   27   60:pop             
		}
		super.onPageStarted(webview, s, bitmap);
	//   28   61:aload_0         
	//   29   62:aload_1         
	//   30   63:aload_2         
	//   31   64:aload_3         
	//   32   65:invokespecial   #79  <Method void WebViewClient.onPageStarted(WebView, String, Bitmap)>
	//   33   68:return          
	}

	public final void onReceivedError(WebView webview, int i, String s, String s1)
	{
		b = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #82  <Field boolean b>
		super.onReceivedError(webview, i, s, s1);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:aload_3         
	//    7    9:aload           4
	//    8   11:invokespecial   #84  <Method void WebViewClient.onReceivedError(WebView, int, String, String)>
	//    9   14:return          
	}

	public final void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
	{
		ft.b("net", "SSLError", "\u8BC1\u4E66\u9519\u8BEF");
	//    0    0:ldc1            #88  <String "net">
	//    1    2:ldc1            #90  <String "SSLError">
	//    2    4:ldc1            #92  <String "\u8BC1\u4E66\u9519\u8BEF">
	//    3    6:invokestatic    #97  <Method void ft.b(String, String, String)>
		if(c)
	//*   4    9:aload_0         
	//*   5   10:getfield        #47  <Field boolean c>
	//*   6   13:ifeq            26
		{
			sslerrorhandler.proceed();
	//    7   16:aload_2         
	//    8   17:invokevirtual   #102 <Method void SslErrorHandler.proceed()>
			c = false;
	//    9   20:aload_0         
	//   10   21:iconst_0        
	//   11   22:putfield        #47  <Field boolean c>
			return;
	//   12   25:return          
		} else
		{
			d.runOnUiThread(((Runnable) (new fp(this, sslerrorhandler))));
	//   13   26:aload_0         
	//   14   27:getfield        #29  <Field Activity d>
	//   15   30:new             #104 <Class fp>
	//   16   33:dup             
	//   17   34:aload_0         
	//   18   35:aload_2         
	//   19   36:invokespecial   #107 <Method void fp(fs, SslErrorHandler)>
	//   20   39:invokevirtual   #110 <Method void Activity.runOnUiThread(Runnable)>
			return;
	//   21   42:return          
		}
	}

	public final boolean shouldOverrideUrlLoading(WebView webview, String s)
	{
		return hr.b(webview, s, d);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_0         
	//    3    3:getfield        #29  <Field Activity d>
	//    4    6:invokestatic    #117 <Method boolean hr.b(WebView, String, Activity)>
	//    5    9:ireturn         
	}

	private hw a;
	public boolean b;
	private boolean c;
	public Activity d;
	public Handler e;
	private Runnable f;
}
