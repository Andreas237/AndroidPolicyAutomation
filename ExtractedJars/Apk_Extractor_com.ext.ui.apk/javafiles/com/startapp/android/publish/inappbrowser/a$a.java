// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.inappbrowser;

import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import com.startapp.android.publish.adsCommon.c;
import com.startapp.common.a.g;

// Referenced classes of package com.startapp.android.publish.inappbrowser:
//			a, b, AnimatingProgressBar

private static class a$a extends WebViewClient
{

	public void onPageFinished(WebView webview, String s)
	{
		if(!a.j)
	//*   0    0:getstatic       #41  <Field boolean a.j>
	//*   1    3:ifne            105
		{
			g.a("IABrowserMode", 3, (new StringBuilder()).append("IABWebViewClient::onPageFinished - [").append(s).append("]").toString());
	//    2    6:ldc1            #43  <String "IABrowserMode">
	//    3    8:iconst_3        
	//    4    9:new             #45  <Class StringBuilder>
	//    5   12:dup             
	//    6   13:invokespecial   #46  <Method void StringBuilder()>
	//    7   16:ldc1            #48  <String "IABWebViewClient::onPageFinished - [">
	//    8   18:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:aload_2         
	//   10   22:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:ldc1            #54  <String "]">
	//   12   27:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   14   33:invokestatic    #63  <Method void g.a(String, int, String)>
			c.a(webview);
	//   15   36:aload_0         
	//   16   37:getfield        #33  <Field b c>
	//   17   40:aload_1         
	//   18   41:invokevirtual   #68  <Method void b.a(WebView)>
			int i = e - 1;
	//   19   44:aload_0         
	//   20   45:getfield        #25  <Field int e>
	//   21   48:iconst_1        
	//   22   49:isub            
	//   23   50:istore_3        
			e = i;
	//   24   51:aload_0         
	//   25   52:iload_3         
	//   26   53:putfield        #25  <Field int e>
			if(i == 0)
	//*  27   56:iload_3         
	//*  28   57:ifne            99
			{
				f = false;
	//   29   60:aload_0         
	//   30   61:iconst_0        
	//   31   62:putfield        #27  <Field boolean f>
				d.a();
	//   32   65:aload_0         
	//   33   66:getfield        #31  <Field AnimatingProgressBar d>
	//   34   69:invokevirtual   #72  <Method void AnimatingProgressBar.a()>
				if(d.isShown())
	//*  35   72:aload_0         
	//*  36   73:getfield        #31  <Field AnimatingProgressBar d>
	//*  37   76:invokevirtual   #76  <Method boolean AnimatingProgressBar.isShown()>
	//*  38   79:ifeq            91
					d.setVisibility(8);
	//   39   82:aload_0         
	//   40   83:getfield        #31  <Field AnimatingProgressBar d>
	//   41   86:bipush          8
	//   42   88:invokevirtual   #80  <Method void AnimatingProgressBar.setVisibility(int)>
				c.a(webview);
	//   43   91:aload_0         
	//   44   92:getfield        #33  <Field b c>
	//   45   95:aload_1         
	//   46   96:invokevirtual   #68  <Method void b.a(WebView)>
			}
			super.onPageFinished(webview, s);
	//   47   99:aload_0         
	//   48  100:aload_1         
	//   49  101:aload_2         
	//   50  102:invokespecial   #82  <Method void WebViewClient.onPageFinished(WebView, String)>
		}
	//   51  105:return          
	}

	public void onPageStarted(WebView webview, String s, Bitmap bitmap)
	{
		if(!a.j)
	//*   0    0:getstatic       #41  <Field boolean a.j>
	//*   1    3:ifne            121
		{
			g.a("IABrowserMode", 3, (new StringBuilder()).append("IABWebViewClient::onPageStarted - [").append(s).append("]").append("REDIRECTED  -> ").append(e).append(" Can go back ").append(webview.canGoBack()).toString());
	//    2    6:ldc1            #43  <String "IABrowserMode">
	//    3    8:iconst_3        
	//    4    9:new             #45  <Class StringBuilder>
	//    5   12:dup             
	//    6   13:invokespecial   #46  <Method void StringBuilder()>
	//    7   16:ldc1            #86  <String "IABWebViewClient::onPageStarted - [">
	//    8   18:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:aload_2         
	//   10   22:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:ldc1            #54  <String "]">
	//   12   27:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:ldc1            #88  <String "REDIRECTED  -> ">
	//   14   32:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   15   35:aload_0         
	//   16   36:getfield        #25  <Field int e>
	//   17   39:invokevirtual   #91  <Method StringBuilder StringBuilder.append(int)>
	//   18   42:ldc1            #93  <String " Can go back ">
	//   19   44:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   20   47:aload_1         
	//   21   48:invokevirtual   #98  <Method boolean WebView.canGoBack()>
	//   22   51:invokevirtual   #101 <Method StringBuilder StringBuilder.append(boolean)>
	//   23   54:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   24   57:invokestatic    #63  <Method void g.a(String, int, String)>
			if(f)
	//*  25   60:aload_0         
	//*  26   61:getfield        #27  <Field boolean f>
	//*  27   64:ifeq            122
			{
				e = 1;
	//   28   67:aload_0         
	//   29   68:iconst_1        
	//   30   69:putfield        #25  <Field int e>
				d.a();
	//   31   72:aload_0         
	//   32   73:getfield        #31  <Field AnimatingProgressBar d>
	//   33   76:invokevirtual   #72  <Method void AnimatingProgressBar.a()>
				c.a(webview);
	//   34   79:aload_0         
	//   35   80:getfield        #33  <Field b c>
	//   36   83:aload_1         
	//   37   84:invokevirtual   #68  <Method void b.a(WebView)>
			} else
	//*  38   87:aload_0         
	//*  39   88:getfield        #31  <Field AnimatingProgressBar d>
	//*  40   91:iconst_0        
	//*  41   92:invokevirtual   #80  <Method void AnimatingProgressBar.setVisibility(int)>
	//*  42   95:aload_0         
	//*  43   96:getfield        #33  <Field b c>
	//*  44   99:invokevirtual   #105 <Method TextView b.getUrlTxt()>
	//*  45  102:aload_2         
	//*  46  103:invokevirtual   #111 <Method void TextView.setText(CharSequence)>
	//*  47  106:aload_0         
	//*  48  107:getfield        #33  <Field b c>
	//*  49  110:aload_1         
	//*  50  111:invokevirtual   #68  <Method void b.a(WebView)>
	//*  51  114:aload_0         
	//*  52  115:aload_1         
	//*  53  116:aload_2         
	//*  54  117:aload_3         
	//*  55  118:invokespecial   #113 <Method void WebViewClient.onPageStarted(WebView, String, Bitmap)>
	//*  56  121:return          
			{
				e = Math.max(e, 1);
	//   57  122:aload_0         
	//   58  123:aload_0         
	//   59  124:getfield        #25  <Field int e>
	//   60  127:iconst_1        
	//   61  128:invokestatic    #119 <Method int Math.max(int, int)>
	//   62  131:putfield        #25  <Field int e>
			}
			d.setVisibility(0);
			c.getUrlTxt().setText(((CharSequence) (s)));
			c.a(webview);
			super.onPageStarted(webview, s, bitmap);
		}
	//*  63  134:goto            87
	}

	public void onReceivedError(WebView webview, int i, String s, String s1)
	{
		g.a("IABrowserMode", 3, (new StringBuilder()).append("IABWebViewClient::onReceivedError - [").append(s).append("], [").append(s1).append("]").toString());
	//    0    0:ldc1            #43  <String "IABrowserMode">
	//    1    2:iconst_3        
	//    2    3:new             #45  <Class StringBuilder>
	//    3    6:dup             
	//    4    7:invokespecial   #46  <Method void StringBuilder()>
	//    5   10:ldc1            #123 <String "IABWebViewClient::onReceivedError - [">
	//    6   12:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:aload_3         
	//    8   16:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:ldc1            #125 <String "], [">
	//   10   21:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:aload           4
	//   12   26:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   13   29:ldc1            #54  <String "]">
	//   14   31:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   15   34:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   16   37:invokestatic    #63  <Method void g.a(String, int, String)>
		d.a();
	//   17   40:aload_0         
	//   18   41:getfield        #31  <Field AnimatingProgressBar d>
	//   19   44:invokevirtual   #72  <Method void AnimatingProgressBar.a()>
		super.onReceivedError(webview, i, s, s1);
	//   20   47:aload_0         
	//   21   48:aload_1         
	//   22   49:iload_2         
	//   23   50:aload_3         
	//   24   51:aload           4
	//   25   53:invokespecial   #127 <Method void WebViewClient.onReceivedError(WebView, int, String, String)>
	//   26   56:return          
	}

	public boolean shouldOverrideUrlLoading(WebView webview, String s)
	{
		boolean flag;
label0:
		{
			flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
			g.a("IABrowserMode", 3, (new StringBuilder()).append("IABWebViewClient::shouldOverrideUrlLoading - [").append(s).append("]").toString());
	//    2    2:ldc1            #43  <String "IABrowserMode">
	//    3    4:iconst_3        
	//    4    5:new             #45  <Class StringBuilder>
	//    5    8:dup             
	//    6    9:invokespecial   #46  <Method void StringBuilder()>
	//    7   12:ldc1            #131 <String "IABWebViewClient::shouldOverrideUrlLoading - [">
	//    8   14:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:ldc1            #54  <String "]">
	//   12   23:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   14   29:invokestatic    #63  <Method void g.a(String, int, String)>
			if(!a.j)
	//*  15   32:getstatic       #41  <Field boolean a.j>
	//*  16   35:ifne            113
			{
				if(!f)
	//*  17   38:aload_0         
	//*  18   39:getfield        #27  <Field boolean f>
	//*  19   42:ifne            62
				{
					f = true;
	//   20   45:aload_0         
	//   21   46:iconst_1        
	//   22   47:putfield        #27  <Field boolean f>
					d.a();
	//   23   50:aload_0         
	//   24   51:getfield        #31  <Field AnimatingProgressBar d>
	//   25   54:invokevirtual   #72  <Method void AnimatingProgressBar.a()>
					e = 0;
	//   26   57:aload_0         
	//   27   58:iconst_0        
	//   28   59:putfield        #25  <Field int e>
				}
				e = e + 1;
	//   29   62:aload_0         
	//   30   63:aload_0         
	//   31   64:getfield        #25  <Field int e>
	//   32   67:iconst_1        
	//   33   68:iadd            
	//   34   69:putfield        #25  <Field int e>
				if(com.startapp.android.publish.adsCommon.c.d(s) && !com.startapp.android.publish.adsCommon.c.b(s))
					break label0;
	//   35   72:aload_2         
	//   36   73:invokestatic    #136 <Method boolean c.d(String)>
	//   37   76:ifeq            86
	//   38   79:aload_2         
	//   39   80:invokestatic    #138 <Method boolean c.b(String)>
	//   40   83:ifeq            115
				e = 1;
	//   41   86:aload_0         
	//   42   87:iconst_1        
	//   43   88:putfield        #25  <Field int e>
				com.startapp.android.publish.adsCommon.c.c(a, s);
	//   44   91:aload_0         
	//   45   92:getfield        #29  <Field Context a>
	//   46   95:aload_2         
	//   47   96:invokestatic    #141 <Method void c.c(Context, String)>
				if(b != null)
	//*  48   99:aload_0         
	//*  49  100:getfield        #35  <Field a b>
	//*  50  103:ifnull          113
					b.x();
	//   51  106:aload_0         
	//   52  107:getfield        #35  <Field a b>
	//   53  110:invokevirtual   #144 <Method void a.x()>
			}
			flag = true;
	//   54  113:iconst_1        
	//   55  114:istore_3        
		}
		return flag;
	//   56  115:iload_3         
	//   57  116:ireturn         
	}

	private Context a;
	private a b;
	private b c;
	private AnimatingProgressBar d;
	private int e;
	private boolean f;

	public a$a(Context context, b b1, AnimatingProgressBar animatingprogressbar, a a1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void WebViewClient()>
		e = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #25  <Field int e>
		f = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #27  <Field boolean f>
		a = context;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #29  <Field Context a>
		d = animatingprogressbar;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #31  <Field AnimatingProgressBar d>
		c = b1;
	//   14   24:aload_0         
	//   15   25:aload_2         
	//   16   26:putfield        #33  <Field b c>
		b = a1;
	//   17   29:aload_0         
	//   18   30:aload           4
	//   19   32:putfield        #35  <Field a b>
	//   20   35:return          
	}
}
