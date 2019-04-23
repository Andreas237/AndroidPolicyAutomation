// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui;

import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;

// Referenced classes of package com.appboy.ui:
//			AppboyWebViewActivity

class AppboyWebViewActivity$2
	implements DownloadListener
{

	public void onDownloadStart(String s, String s1, String s2, String s3, long l)
	{
		s1 = ((String) (new Intent("android.intent.action.VIEW")));
	//    0    0:new             #25  <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #27  <String "android.intent.action.VIEW">
	//    3    6:invokespecial   #30  <Method void Intent(String)>
	//    4    9:astore_2        
		((Intent) (s1)).setData(Uri.parse(s));
	//    5   10:aload_2         
	//    6   11:aload_1         
	//    7   12:invokestatic    #36  <Method Uri Uri.parse(String)>
	//    8   15:invokevirtual   #40  <Method Intent Intent.setData(Uri)>
	//    9   18:pop             
		startActivity(((Intent) (s1)));
	//   10   19:aload_0         
	//   11   20:getfield        #17  <Field AppboyWebViewActivity this$0>
	//   12   23:aload_2         
	//   13   24:invokevirtual   #44  <Method void AppboyWebViewActivity.startActivity(Intent)>
	//   14   27:return          
	}

	final AppboyWebViewActivity this$0;

	AppboyWebViewActivity$2()
	{
		this$0 = AppboyWebViewActivity.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field AppboyWebViewActivity this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
