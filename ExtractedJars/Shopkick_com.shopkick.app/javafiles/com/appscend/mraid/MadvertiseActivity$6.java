// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.mraid;

import android.app.Activity;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

// Referenced classes of package com.appscend.mraid:
//			MadvertiseActivity

class MadvertiseActivity$6 extends WebChromeClient
{

	public void onProgressChanged(WebView webview, int i)
	{
		Activity activity = (Activity)webview.getContext();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #27  <Method android.content.Context WebView.getContext()>
	//    2    4:checkcast       #29  <Class Activity>
	//    3    7:astore_3        
		activity.setTitle("Loading...");
	//    4    8:aload_3         
	//    5    9:ldc1            #31  <String "Loading...">
	//    6   11:invokevirtual   #35  <Method void Activity.setTitle(CharSequence)>
		activity.setProgress(i * 100);
	//    7   14:aload_3         
	//    8   15:iload_2         
	//    9   16:bipush          100
	//   10   18:imul            
	//   11   19:invokevirtual   #39  <Method void Activity.setProgress(int)>
		if(i == 100)
	//*  12   22:iload_2         
	//*  13   23:bipush          100
	//*  14   25:icmpne          36
			activity.setTitle(((CharSequence) (webview.getUrl())));
	//   15   28:aload_3         
	//   16   29:aload_1         
	//   17   30:invokevirtual   #43  <Method String WebView.getUrl()>
	//   18   33:invokevirtual   #35  <Method void Activity.setTitle(CharSequence)>
	//   19   36:return          
	}

	final MadvertiseActivity this$0;

	MadvertiseActivity$6()
	{
		this$0 = MadvertiseActivity.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field MadvertiseActivity this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void WebChromeClient()>
	//    5    9:return          
	}
}
