// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.appboy.ui.inappmessage.IInAppMessageView;
import com.appboy.ui.inappmessage.InAppMessageWebViewClient;

// Referenced classes of package com.appboy.ui.inappmessage.views:
//			InAppMessageViewUtils

public abstract class AppboyInAppMessageHtmlBaseView extends RelativeLayout
	implements IInAppMessageView
{

	public AppboyInAppMessageHtmlBaseView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #20  <Method void RelativeLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public View getMessageClickableView()
	{
		return ((View) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public abstract WebView getMessageWebView();

	public boolean onKeyDown(int i, KeyEvent keyevent)
	{
		if(i == 4)
	//*   0    0:iload_1         
	//*   1    1:iconst_4        
	//*   2    2:icmpne          10
		{
			InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
	//    3    5:invokestatic    #33  <Method void InAppMessageViewUtils.closeInAppMessageOnKeycodeBack()>
			return true;
	//    4    8:iconst_1        
	//    5    9:ireturn         
		} else
		{
			return super.onKeyDown(i, keyevent);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aload_2         
	//    9   13:invokespecial   #35  <Method boolean RelativeLayout.onKeyDown(int, KeyEvent)>
	//   10   16:ireturn         
		}
	}

	public void setInAppMessageWebViewClient(InAppMessageWebViewClient inappmessagewebviewclient)
	{
		getMessageWebView().setWebViewClient(((android.webkit.WebViewClient) (inappmessagewebviewclient)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method WebView getMessageWebView()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #45  <Method void WebView.setWebViewClient(android.webkit.WebViewClient)>
	//    4    8:return          
	}

	public void setWebViewContent(String s, String s1)
	{
		WebView webview = getMessageWebView();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method WebView getMessageWebView()>
	//    2    4:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #49  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #51  <Method void StringBuilder()>
	//    6   12:astore          4
		stringbuilder.append("file://");
	//    7   14:aload           4
	//    8   16:ldc1            #10  <String "file://">
	//    9   18:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
		stringbuilder.append(s1);
	//   11   22:aload           4
	//   12   24:aload_2         
	//   13   25:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   14   28:pop             
		stringbuilder.append("/");
	//   15   29:aload           4
	//   16   31:ldc1            #57  <String "/">
	//   17   33:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
		webview.loadDataWithBaseURL(stringbuilder.toString(), s, "text/html", "utf-8", ((String) (null)));
	//   19   37:aload_3         
	//   20   38:aload           4
	//   21   40:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   22   43:aload_1         
	//   23   44:ldc1            #16  <String "text/html">
	//   24   46:ldc1            #13  <String "utf-8">
	//   25   48:aconst_null     
	//   26   49:invokevirtual   #65  <Method void WebView.loadDataWithBaseURL(String, String, String, String, String)>
	//   27   52:return          
	}

	private static final String FILE_URI_SCHEME_PREFIX = "file://";
	private static final String HTML_ENCODING = "utf-8";
	private static final String HTML_MIME_TYPE = "text/html";
}
