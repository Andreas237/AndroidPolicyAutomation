// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.utilities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.FragmentActivity;
import android.view.*;
import android.webkit.*;
import android.widget.Button;
import android.widget.TextView;

public class WebBrowser extends FragmentActivity
{

	public WebBrowser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void FragmentActivity()>
	//    2    4:return          
	}

	public boolean onContextItemSelected(MenuItem menuitem)
	{
		if(menuitem.getItemId() == com.appscend.vastplayer.R.id.browser)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #46  <Method int MenuItem.getItemId()>
	//*   2    6:getstatic       #52  <Field int com.appscend.vastplayer.R$id.browser>
	//*   3    9:icmpne          46
		{
			menuitem = ((MenuItem) (new Intent("android.intent.action.VIEW", Uri.parse(webView.getUrl()))));
	//    4   12:new             #54  <Class Intent>
	//    5   15:dup             
	//    6   16:ldc1            #56  <String "android.intent.action.VIEW">
	//    7   18:aload_0         
	//    8   19:getfield        #38  <Field WebView webView>
	//    9   22:invokevirtual   #62  <Method String WebView.getUrl()>
	//   10   25:invokestatic    #68  <Method Uri Uri.parse(String)>
	//   11   28:invokespecial   #71  <Method void Intent(String, Uri)>
	//   12   31:astore_1        
			((Intent) (menuitem)).addFlags(0x80000);
	//   13   32:aload_1         
	//   14   33:ldc1            #72  <Int 0x80000>
	//   15   35:invokevirtual   #76  <Method Intent Intent.addFlags(int)>
	//   16   38:pop             
			startActivity(((Intent) (menuitem)));
	//   17   39:aload_0         
	//   18   40:aload_1         
	//   19   41:invokevirtual   #80  <Method void startActivity(Intent)>
			return true;
	//   20   44:iconst_1        
	//   21   45:ireturn         
		} else
		{
			return super.onContextItemSelected(menuitem);
	//   22   46:aload_0         
	//   23   47:aload_1         
	//   24   48:invokespecial   #82  <Method boolean FragmentActivity.onContextItemSelected(MenuItem)>
	//   25   51:ireturn         
		}
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #89  <Method void FragmentActivity.onCreate(Bundle)>
		setContentView(com.appscend.vastplayer.R.layout.webbrowser);
	//    3    5:aload_0         
	//    4    6:getstatic       #94  <Field int com.appscend.vastplayer.R$layout.webbrowser>
	//    5    9:invokevirtual   #98  <Method void setContentView(int)>
		url = getIntent().getStringExtra("url");
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #102 <Method Intent getIntent()>
	//    9   17:ldc1            #103 <String "url">
	//   10   19:invokevirtual   #107 <Method String Intent.getStringExtra(String)>
	//   11   22:putfield        #109 <Field String url>
		webView = (WebView)findViewById(com.appscend.vastplayer.R.id.webView);
	//   12   25:aload_0         
	//   13   26:aload_0         
	//   14   27:getstatic       #111 <Field int com.appscend.vastplayer.R$id.webView>
	//   15   30:invokevirtual   #115 <Method View findViewById(int)>
	//   16   33:checkcast       #58  <Class WebView>
	//   17   36:putfield        #38  <Field WebView webView>
		if(url.contains("vimeo"))
	//*  18   39:aload_0         
	//*  19   40:getfield        #109 <Field String url>
	//*  20   43:ldc1            #117 <String "vimeo">
	//*  21   45:invokevirtual   #123 <Method boolean String.contains(CharSequence)>
	//*  22   48:ifeq            94
		{
			getWindow().getDecorView().setSystemUiVisibility(4);
	//   23   51:aload_0         
	//   24   52:invokevirtual   #127 <Method Window getWindow()>
	//   25   55:invokevirtual   #133 <Method View Window.getDecorView()>
	//   26   58:iconst_4        
	//   27   59:invokevirtual   #138 <Method void View.setSystemUiVisibility(int)>
			findViewById(com.appscend.vastplayer.R.id.toolbarContainer).setVisibility(8);
	//   28   62:aload_0         
	//   29   63:getstatic       #141 <Field int com.appscend.vastplayer.R$id.toolbarContainer>
	//   30   66:invokevirtual   #115 <Method View findViewById(int)>
	//   31   69:bipush          8
	//   32   71:invokevirtual   #144 <Method void View.setVisibility(int)>
			bundle = ((Bundle) (new android.widget.LinearLayout.LayoutParams(-1, -1, 0.9F)));
	//   33   74:new             #146 <Class android.widget.LinearLayout$LayoutParams>
	//   34   77:dup             
	//   35   78:iconst_m1       
	//   36   79:iconst_m1       
	//   37   80:ldc1            #147 <Float 0.9F>
	//   38   82:invokespecial   #150 <Method void android.widget.LinearLayout$LayoutParams(int, int, float)>
	//   39   85:astore_1        
			webView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (bundle)));
	//   40   86:aload_0         
	//   41   87:getfield        #38  <Field WebView webView>
	//   42   90:aload_1         
	//   43   91:invokevirtual   #154 <Method void WebView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		}
		title = (TextView)findViewById(com.appscend.vastplayer.R.id.title);
	//   44   94:aload_0         
	//   45   95:aload_0         
	//   46   96:getstatic       #156 <Field int com.appscend.vastplayer.R$id.title>
	//   47   99:invokevirtual   #115 <Method View findViewById(int)>
	//   48  102:checkcast       #158 <Class TextView>
	//   49  105:putfield        #34  <Field TextView title>
		webView.clearCache(true);
	//   50  108:aload_0         
	//   51  109:getfield        #38  <Field WebView webView>
	//   52  112:iconst_1        
	//   53  113:invokevirtual   #162 <Method void WebView.clearCache(boolean)>
		webView.getSettings().setJavaScriptEnabled(true);
	//   54  116:aload_0         
	//   55  117:getfield        #38  <Field WebView webView>
	//   56  120:invokevirtual   #166 <Method WebSettings WebView.getSettings()>
	//   57  123:iconst_1        
	//   58  124:invokevirtual   #171 <Method void WebSettings.setJavaScriptEnabled(boolean)>
		webView.getSettings().setLoadWithOverviewMode(true);
	//   59  127:aload_0         
	//   60  128:getfield        #38  <Field WebView webView>
	//   61  131:invokevirtual   #166 <Method WebSettings WebView.getSettings()>
	//   62  134:iconst_1        
	//   63  135:invokevirtual   #174 <Method void WebSettings.setLoadWithOverviewMode(boolean)>
		webView.getSettings().setUseWideViewPort(true);
	//   64  138:aload_0         
	//   65  139:getfield        #38  <Field WebView webView>
	//   66  142:invokevirtual   #166 <Method WebSettings WebView.getSettings()>
	//   67  145:iconst_1        
	//   68  146:invokevirtual   #177 <Method void WebSettings.setUseWideViewPort(boolean)>
		webView.getSettings().setDomStorageEnabled(true);
	//   69  149:aload_0         
	//   70  150:getfield        #38  <Field WebView webView>
	//   71  153:invokevirtual   #166 <Method WebSettings WebView.getSettings()>
	//   72  156:iconst_1        
	//   73  157:invokevirtual   #180 <Method void WebSettings.setDomStorageEnabled(boolean)>
		webView.loadUrl(url);
	//   74  160:aload_0         
	//   75  161:getfield        #38  <Field WebView webView>
	//   76  164:aload_0         
	//   77  165:getfield        #109 <Field String url>
	//   78  168:invokevirtual   #184 <Method void WebView.loadUrl(String)>
		webView.setWebViewClient(((WebViewClient) (new WebViewClient() {

			public void onPageFinished(WebView webview, String s)
			{
				super.onPageFinished(webview, s);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #23  <Method void WebViewClient.onPageFinished(WebView, String)>
				if(s.contains("vimeo"))
			//*   4    6:aload_2         
			//*   5    7:ldc1            #25  <String "vimeo">
			//*   6    9:invokevirtual   #31  <Method boolean String.contains(CharSequence)>
			//*   7   12:ifeq            91
				{
					long l = SystemClock.uptimeMillis();
			//    8   15:invokestatic    #37  <Method long SystemClock.uptimeMillis()>
			//    9   18:lstore          7
					int i = webview.getWidth() / 2;
			//   10   20:aload_1         
			//   11   21:invokevirtual   #43  <Method int WebView.getWidth()>
			//   12   24:iconst_2        
			//   13   25:idiv            
			//   14   26:istore          5
					int j = webview.getHeight() / 2;
			//   15   28:aload_1         
			//   16   29:invokevirtual   #46  <Method int WebView.getHeight()>
			//   17   32:iconst_2        
			//   18   33:idiv            
			//   19   34:istore          6
					float f = i;
			//   20   36:iload           5
			//   21   38:i2f             
			//   22   39:fstore_3        
					float f1 = j;
			//   23   40:iload           6
			//   24   42:i2f             
			//   25   43:fstore          4
					s = ((String) (MotionEvent.obtain(l, l, 0, f, f1, 0)));
			//   26   45:lload           7
			//   27   47:lload           7
			//   28   49:iconst_0        
			//   29   50:fload_3         
			//   30   51:fload           4
			//   31   53:iconst_0        
			//   32   54:invokestatic    #52  <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
			//   33   57:astore_2        
					webview.dispatchTouchEvent(((MotionEvent) (s)));
			//   34   58:aload_1         
			//   35   59:aload_2         
			//   36   60:invokevirtual   #56  <Method boolean WebView.dispatchTouchEvent(MotionEvent)>
			//   37   63:pop             
					((MotionEvent) (s)).recycle();
			//   38   64:aload_2         
			//   39   65:invokevirtual   #59  <Method void MotionEvent.recycle()>
					s = ((String) (MotionEvent.obtain(l, l, 1, f, f1, 0)));
			//   40   68:lload           7
			//   41   70:lload           7
			//   42   72:iconst_1        
			//   43   73:fload_3         
			//   44   74:fload           4
			//   45   76:iconst_0        
			//   46   77:invokestatic    #52  <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
			//   47   80:astore_2        
					webview.dispatchTouchEvent(((MotionEvent) (s)));
			//   48   81:aload_1         
			//   49   82:aload_2         
			//   50   83:invokevirtual   #56  <Method boolean WebView.dispatchTouchEvent(MotionEvent)>
			//   51   86:pop             
					((MotionEvent) (s)).recycle();
			//   52   87:aload_2         
			//   53   88:invokevirtual   #59  <Method void MotionEvent.recycle()>
				}
			//   54   91:return          
			}

			public boolean shouldOverrideUrlLoading(WebView webview, String s)
			{
				webview.loadUrl(s);
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:invokevirtual   #65  <Method void WebView.loadUrl(String)>
				return true;
			//    3    5:iconst_1        
			//    4    6:ireturn         
			}

			final WebBrowser this$0;

			
			{
				this$0 = WebBrowser.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field WebBrowser this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void WebViewClient()>
			//    5    9:return          
			}
		}
)));
	//   79  171:aload_0         
	//   80  172:getfield        #38  <Field WebView webView>
	//   81  175:new             #6   <Class WebBrowser$1>
	//   82  178:dup             
	//   83  179:aload_0         
	//   84  180:invokespecial   #187 <Method void WebBrowser$1(WebBrowser)>
	//   85  183:invokevirtual   #191 <Method void WebView.setWebViewClient(WebViewClient)>
		webView.setWebChromeClient(((WebChromeClient) (new WebChromeClient() {

			public void onReceivedTitle(WebView webview, String s)
			{
				super.onReceivedTitle(webview, s);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #23  <Method void WebChromeClient.onReceivedTitle(WebView, String)>
				title.setText(((CharSequence) (s)));
			//    4    6:aload_0         
			//    5    7:getfield        #15  <Field WebBrowser this$0>
			//    6   10:invokestatic    #27  <Method TextView WebBrowser.access$000(WebBrowser)>
			//    7   13:aload_2         
			//    8   14:invokevirtual   #33  <Method void TextView.setText(CharSequence)>
			//    9   17:return          
			}

			final WebBrowser this$0;

			
			{
				this$0 = WebBrowser.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field WebBrowser this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void WebChromeClient()>
			//    5    9:return          
			}
		}
)));
	//   86  186:aload_0         
	//   87  187:getfield        #38  <Field WebView webView>
	//   88  190:new             #8   <Class WebBrowser$2>
	//   89  193:dup             
	//   90  194:aload_0         
	//   91  195:invokespecial   #192 <Method void WebBrowser$2(WebBrowser)>
	//   92  198:invokevirtual   #196 <Method void WebView.setWebChromeClient(WebChromeClient)>
		back = (Button)findViewById(com.appscend.vastplayer.R.id.back);
	//   93  201:aload_0         
	//   94  202:aload_0         
	//   95  203:getstatic       #198 <Field int com.appscend.vastplayer.R$id.back>
	//   96  206:invokevirtual   #115 <Method View findViewById(int)>
	//   97  209:checkcast       #200 <Class Button>
	//   98  212:putfield        #202 <Field Button back>
		back.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				webView.goBack();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field WebBrowser this$0>
			//    2    4:invokestatic    #27  <Method WebView WebBrowser.access$100(WebBrowser)>
			//    3    7:invokevirtual   #32  <Method void WebView.goBack()>
			//    4   10:return          
			}

			final WebBrowser this$0;

			
			{
				this$0 = WebBrowser.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field WebBrowser this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   99  215:aload_0         
	//  100  216:getfield        #202 <Field Button back>
	//  101  219:new             #10  <Class WebBrowser$3>
	//  102  222:dup             
	//  103  223:aload_0         
	//  104  224:invokespecial   #203 <Method void WebBrowser$3(WebBrowser)>
	//  105  227:invokevirtual   #207 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		forward = (Button)findViewById(com.appscend.vastplayer.R.id.forward);
	//  106  230:aload_0         
	//  107  231:aload_0         
	//  108  232:getstatic       #209 <Field int com.appscend.vastplayer.R$id.forward>
	//  109  235:invokevirtual   #115 <Method View findViewById(int)>
	//  110  238:checkcast       #200 <Class Button>
	//  111  241:putfield        #211 <Field Button forward>
		forward.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				webView.goForward();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field WebBrowser this$0>
			//    2    4:invokestatic    #27  <Method WebView WebBrowser.access$100(WebBrowser)>
			//    3    7:invokevirtual   #32  <Method void WebView.goForward()>
			//    4   10:return          
			}

			final WebBrowser this$0;

			
			{
				this$0 = WebBrowser.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field WebBrowser this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  112  244:aload_0         
	//  113  245:getfield        #211 <Field Button forward>
	//  114  248:new             #12  <Class WebBrowser$4>
	//  115  251:dup             
	//  116  252:aload_0         
	//  117  253:invokespecial   #212 <Method void WebBrowser$4(WebBrowser)>
	//  118  256:invokevirtual   #207 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		refresh = (Button)findViewById(com.appscend.vastplayer.R.id.refresh);
	//  119  259:aload_0         
	//  120  260:aload_0         
	//  121  261:getstatic       #214 <Field int com.appscend.vastplayer.R$id.refresh>
	//  122  264:invokevirtual   #115 <Method View findViewById(int)>
	//  123  267:checkcast       #200 <Class Button>
	//  124  270:putfield        #216 <Field Button refresh>
		refresh.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				webView.reload();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field WebBrowser this$0>
			//    2    4:invokestatic    #27  <Method WebView WebBrowser.access$100(WebBrowser)>
			//    3    7:invokevirtual   #32  <Method void WebView.reload()>
			//    4   10:return          
			}

			final WebBrowser this$0;

			
			{
				this$0 = WebBrowser.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field WebBrowser this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  125  273:aload_0         
	//  126  274:getfield        #216 <Field Button refresh>
	//  127  277:new             #14  <Class WebBrowser$5>
	//  128  280:dup             
	//  129  281:aload_0         
	//  130  282:invokespecial   #217 <Method void WebBrowser$5(WebBrowser)>
	//  131  285:invokevirtual   #207 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		share = (Button)findViewById(com.appscend.vastplayer.R.id.share);
	//  132  288:aload_0         
	//  133  289:aload_0         
	//  134  290:getstatic       #219 <Field int com.appscend.vastplayer.R$id.share>
	//  135  293:invokevirtual   #115 <Method View findViewById(int)>
	//  136  296:checkcast       #200 <Class Button>
	//  137  299:putfield        #221 <Field Button share>
		registerForContextMenu(((View) (share)));
	//  138  302:aload_0         
	//  139  303:aload_0         
	//  140  304:getfield        #221 <Field Button share>
	//  141  307:invokevirtual   #225 <Method void registerForContextMenu(View)>
	//  142  310:return          
	}

	public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
	{
		super.onCreateContextMenu(contextmenu, view, contextmenuinfo);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #230 <Method void FragmentActivity.onCreateContextMenu(ContextMenu, View, android.view.ContextMenu$ContextMenuInfo)>
		getMenuInflater().inflate(com.appscend.vastplayer.R.menu.share, ((android.view.Menu) (contextmenu)));
	//    5    7:aload_0         
	//    6    8:invokevirtual   #234 <Method MenuInflater getMenuInflater()>
	//    7   11:getstatic       #237 <Field int com.appscend.vastplayer.R$menu.share>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #243 <Method void MenuInflater.inflate(int, android.view.Menu)>
	//   10   18:return          
	}

	private Button back;
	private Button forward;
	private Button refresh;
	private Button share;
	private TextView title;
	private String url;
	private WebView webView;


/*
	static TextView access$000(WebBrowser webbrowser)
	{
		return webbrowser.title;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field TextView title>
	//    2    4:areturn         
	}

*/


/*
	static WebView access$100(WebBrowser webbrowser)
	{
		return webbrowser.webView;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field WebView webView>
	//    2    4:areturn         
	}

*/
}
