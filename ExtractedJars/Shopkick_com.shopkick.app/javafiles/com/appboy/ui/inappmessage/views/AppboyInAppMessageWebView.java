// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.webkit.WebView;

// Referenced classes of package com.appboy.ui.inappmessage.views:
//			InAppMessageViewUtils

public class AppboyInAppMessageWebView extends WebView
{

	public AppboyInAppMessageWebView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #8   <Method void WebView(Context, AttributeSet)>
	//    4    6:return          
	}

	public boolean onKeyDown(int i, KeyEvent keyevent)
	{
		if(i == 4)
	//*   0    0:iload_1         
	//*   1    1:iconst_4        
	//*   2    2:icmpne          10
		{
			InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
	//    3    5:invokestatic    #17  <Method void InAppMessageViewUtils.closeInAppMessageOnKeycodeBack()>
			return true;
	//    4    8:iconst_1        
	//    5    9:ireturn         
		} else
		{
			return super.onKeyDown(i, keyevent);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aload_2         
	//    9   13:invokespecial   #19  <Method boolean WebView.onKeyDown(int, KeyEvent)>
	//   10   16:ireturn         
		}
	}
}
