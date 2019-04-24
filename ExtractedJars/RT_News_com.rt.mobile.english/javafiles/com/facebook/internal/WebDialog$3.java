// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.Context;
import android.webkit.WebView;

// Referenced classes of package com.facebook.internal:
//			WebDialog

class WebDialog$3 extends WebView
{

	public void onWindowFocusChanged(boolean flag)
	{
		try
		{
			super.onWindowFocusChanged(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #25  <Method void WebView.onWindowFocusChanged(boolean)>
			return;
	//    3    5:return          
		}
		catch(NullPointerException nullpointerexception)
	//*   4    6:astore_2        
		{
			return;
	//    5    7:return          
		}
	}

	final WebDialog this$0;

	WebDialog$3(Context context)
	{
		this$0 = WebDialog.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field WebDialog this$0>
		super(context);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #18  <Method void WebView(Context)>
	//    6   10:return          
	}
}
