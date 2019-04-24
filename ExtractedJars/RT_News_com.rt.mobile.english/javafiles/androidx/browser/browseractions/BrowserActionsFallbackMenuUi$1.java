// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.browser.browseractions;

import android.content.DialogInterface;
import android.view.View;

// Referenced classes of package androidx.browser.browseractions:
//			BrowserActionsFallbackMenuUi

class BrowserActionsFallbackMenuUi$1
	implements android.content.DialogInterface$OnShowListener
{

	public void onShow(DialogInterface dialoginterface)
	{
		BrowserActionsFallbackMenuUi.access$000(BrowserActionsFallbackMenuUi.this).onMenuShown(val$view);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field BrowserActionsFallbackMenuUi this$0>
	//    2    4:invokestatic    #30  <Method BrowserActionsFallbackMenuUi$BrowserActionsFallMenuUiListener BrowserActionsFallbackMenuUi.access$000(BrowserActionsFallbackMenuUi)>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field View val$view>
	//    5   11:invokeinterface #36  <Method void BrowserActionsFallbackMenuUi$BrowserActionsFallMenuUiListener.onMenuShown(View)>
	//    6   16:return          
	}

	final BrowserActionsFallbackMenuUi this$0;
	final View val$view;

	BrowserActionsFallbackMenuUi$1()
	{
		this$0 = final_browseractionsfallbackmenuui;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field BrowserActionsFallbackMenuUi this$0>
		val$view = View.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field View val$view>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
