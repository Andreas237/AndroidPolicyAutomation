// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.utilities;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.appscend.utilities:
//			WebBrowser

class WebBrowser$1 extends WebViewClient
{

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

	WebBrowser$1()
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
