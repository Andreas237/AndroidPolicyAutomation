// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appboy.enums.Channel;
import com.appboy.support.AppboyFileUtils;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.actions.ActionFactory;
import com.appboy.ui.actions.IAction;
import java.util.List;

// Referenced classes of package com.appboy.ui:
//			AppboyWebViewActivity

class AppboyWebViewActivity$3 extends WebViewClient
{

	public boolean shouldOverrideUrlLoading(WebView webview, String s)
	{
		if(AppboyFileUtils.REMOTE_SCHEMES.contains(((Object) (Uri.parse(s).getScheme()))))
			break MISSING_BLOCK_LABEL_104;
	//    0    0:getstatic       #29  <Field List AppboyFileUtils.REMOTE_SCHEMES>
	//    1    3:aload_2         
	//    2    4:invokestatic    #35  <Method Uri Uri.parse(String)>
	//    3    7:invokevirtual   #39  <Method String Uri.getScheme()>
	//    4   10:invokeinterface #45  <Method boolean List.contains(Object)>
	//    5   15:ifne            104
		((IAction) (ActionFactory.createUriActionFromUrlString(s, getIntent().getExtras(), false, Channel.UNKNOWN))).execute(webview.getContext());
	//    6   18:aload_2         
	//    7   19:aload_0         
	//    8   20:getfield        #15  <Field AppboyWebViewActivity this$0>
	//    9   23:invokevirtual   #49  <Method Intent AppboyWebViewActivity.getIntent()>
	//   10   26:invokevirtual   #55  <Method android.os.Bundle Intent.getExtras()>
	//   11   29:iconst_0        
	//   12   30:getstatic       #61  <Field Channel Channel.UNKNOWN>
	//   13   33:invokestatic    #67  <Method com.appboy.ui.actions.UriAction ActionFactory.createUriActionFromUrlString(String, android.os.Bundle, boolean, Channel)>
	//   14   36:aload_1         
	//   15   37:invokevirtual   #73  <Method android.content.Context WebView.getContext()>
	//   16   40:invokeinterface #79  <Method void IAction.execute(android.content.Context)>
		finish();
	//   17   45:aload_0         
	//   18   46:getfield        #15  <Field AppboyWebViewActivity this$0>
	//   19   49:invokevirtual   #82  <Method void AppboyWebViewActivity.finish()>
		return true;
	//   20   52:iconst_1        
	//   21   53:ireturn         
		Exception exception;
		exception;
	//   22   54:astore_3        
		String s1 = AppboyWebViewActivity.access$000();
	//   23   55:invokestatic    #85  <Method String AppboyWebViewActivity.access$000()>
	//   24   58:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//   25   60:new             #87  <Class StringBuilder>
	//   26   63:dup             
	//   27   64:invokespecial   #88  <Method void StringBuilder()>
	//   28   67:astore          5
		stringbuilder.append("Unexpected exception while processing url ");
	//   29   69:aload           5
	//   30   71:ldc1            #90  <String "Unexpected exception while processing url ">
	//   31   73:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   32   76:pop             
		stringbuilder.append(s);
	//   33   77:aload           5
	//   34   79:aload_2         
	//   35   80:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   36   83:pop             
		stringbuilder.append(". Passing url back to WebView.");
	//   37   84:aload           5
	//   38   86:ldc1            #96  <String ". Passing url back to WebView.">
	//   39   88:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   40   91:pop             
		AppboyLogger.i(s1, stringbuilder.toString(), ((Throwable) (exception)));
	//   41   92:aload           4
	//   42   94:aload           5
	//   43   96:invokevirtual   #99  <Method String StringBuilder.toString()>
	//   44   99:aload_3         
	//   45  100:invokestatic    #105 <Method int AppboyLogger.i(String, String, Throwable)>
	//   46  103:pop             
		return super.shouldOverrideUrlLoading(webview, s);
	//   47  104:aload_0         
	//   48  105:aload_1         
	//   49  106:aload_2         
	//   50  107:invokespecial   #107 <Method boolean WebViewClient.shouldOverrideUrlLoading(WebView, String)>
	//   51  110:ireturn         
	}

	final AppboyWebViewActivity this$0;

	AppboyWebViewActivity$3()
	{
		this$0 = AppboyWebViewActivity.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field AppboyWebViewActivity this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void WebViewClient()>
	//    5    9:return          
	}
}
