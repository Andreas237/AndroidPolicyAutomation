// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.mraid;

import android.app.Activity;
import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.Toast;

// Referenced classes of package com.appscend.mraid:
//			MadvertiseActivity

class MadvertiseActivity$5 extends WebViewClient
{

	public void onPageFinished(WebView webview, String s)
	{
		super.onPageFinished(webview, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #27  <Method void WebViewClient.onPageFinished(WebView, String)>
		if(webview.canGoForward())
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #33  <Method boolean WebView.canGoForward()>
	//*   6   10:ifeq            22
		{
			val$forward.setEnabled(true);
	//    7   13:aload_0         
	//    8   14:getfield        #19  <Field ImageButton val$forward>
	//    9   17:iconst_1        
	//   10   18:invokevirtual   #39  <Method void ImageButton.setEnabled(boolean)>
			return;
	//   11   21:return          
		} else
		{
			val$forward.setEnabled(false);
	//   12   22:aload_0         
	//   13   23:getfield        #19  <Field ImageButton val$forward>
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #39  <Method void ImageButton.setEnabled(boolean)>
			return;
	//   16   30:return          
		}
	}

	public void onPageStarted(WebView webview, String s, Bitmap bitmap)
	{
		super.onPageStarted(webview, s, bitmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #43  <Method void WebViewClient.onPageStarted(WebView, String, Bitmap)>
		val$forward.setImageResource(com.appscend.vastplayer.R.drawable.forward);
	//    5    7:aload_0         
	//    6    8:getfield        #19  <Field ImageButton val$forward>
	//    7   11:getstatic       #49  <Field int com.appscend.vastplayer.R$drawable.forward>
	//    8   14:invokevirtual   #53  <Method void ImageButton.setImageResource(int)>
	//    9   17:return          
	}

	public void onReceivedError(WebView webview, int i, String s, String s1)
	{
		webview = ((WebView) ((Activity)webview.getContext()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #59  <Method android.content.Context WebView.getContext()>
	//    2    4:checkcast       #61  <Class Activity>
	//    3    7:astore_1        
		s1 = ((String) (new StringBuilder()));
	//    4    8:new             #63  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #64  <Method void StringBuilder()>
	//    7   15:astore          4
		((StringBuilder) (s1)).append("Error:");
	//    8   17:aload           4
	//    9   19:ldc1            #66  <String "Error:">
	//   10   21:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:pop             
		((StringBuilder) (s1)).append(s);
	//   12   25:aload           4
	//   13   27:aload_3         
	//   14   28:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
		Toast.makeText(((android.content.Context) (webview)), ((CharSequence) (((StringBuilder) (s1)).toString())), 0).show();
	//   16   32:aload_1         
	//   17   33:aload           4
	//   18   35:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   19   38:iconst_0        
	//   20   39:invokestatic    #80  <Method Toast Toast.makeText(android.content.Context, CharSequence, int)>
	//   21   42:invokevirtual   #83  <Method void Toast.show()>
	//   22   45:return          
	}

	public boolean shouldOverrideUrlLoading(WebView webview, String s)
	{
		webview.loadUrl(s);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #89  <Method void WebView.loadUrl(String)>
		return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
	}

	final MadvertiseActivity this$0;
	final ImageButton val$forward;

	MadvertiseActivity$5()
	{
		this$0 = final_madvertiseactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field MadvertiseActivity this$0>
		val$forward = ImageButton.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field ImageButton val$forward>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void WebViewClient()>
	//    8   14:return          
	}
}
