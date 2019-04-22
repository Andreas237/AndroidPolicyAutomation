// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.factories;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import com.appboy.models.IInAppMessage;
import com.appboy.models.InAppMessageHtmlFull;
import com.appboy.ui.inappmessage.IInAppMessageViewFactory;
import com.appboy.ui.inappmessage.InAppMessageWebViewClient;
import com.appboy.ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import com.appboy.ui.inappmessage.views.AppboyInAppMessageHtmlFullView;

public class AppboyHtmlFullViewFactory
	implements IInAppMessageViewFactory
{

	public AppboyHtmlFullViewFactory(IInAppMessageWebViewClientListener iinappmessagewebviewclientlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		mInAppMessageWebViewClientListener = iinappmessagewebviewclientlistener;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field IInAppMessageWebViewClientListener mInAppMessageWebViewClientListener>
	//    5    9:return          
	}

	public volatile View createInAppMessageView(Activity activity, IInAppMessage iinappmessage)
	{
		return ((View) (createInAppMessageView(activity, iinappmessage)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #21  <Method AppboyInAppMessageHtmlFullView createInAppMessageView(Activity, IInAppMessage)>
	//    4    6:areturn         
	}

	public AppboyInAppMessageHtmlFullView createInAppMessageView(Activity activity, IInAppMessage iinappmessage)
	{
		InAppMessageHtmlFull inappmessagehtmlfull = (InAppMessageHtmlFull)iinappmessage;
	//    0    0:aload_2         
	//    1    1:checkcast       #23  <Class InAppMessageHtmlFull>
	//    2    4:astore_3        
		AppboyInAppMessageHtmlFullView appboyinappmessagehtmlfullview = (AppboyInAppMessageHtmlFullView)activity.getLayoutInflater().inflate(com.appboy.ui.R.layout.com_appboy_inappmessage_html_full, ((android.view.ViewGroup) (null)));
	//    3    5:aload_1         
	//    4    6:invokevirtual   #29  <Method LayoutInflater Activity.getLayoutInflater()>
	//    5    9:getstatic       #35  <Field int com.appboy.ui.R$layout.com_appboy_inappmessage_html_full>
	//    6   12:aconst_null     
	//    7   13:invokevirtual   #41  <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//    8   16:checkcast       #43  <Class AppboyInAppMessageHtmlFullView>
	//    9   19:astore          4
		appboyinappmessagehtmlfullview.setWebViewContent(iinappmessage.getMessage(), inappmessagehtmlfull.getLocalAssetsDirectoryUrl());
	//   10   21:aload           4
	//   11   23:aload_2         
	//   12   24:invokeinterface #49  <Method String IInAppMessage.getMessage()>
	//   13   29:aload_3         
	//   14   30:invokevirtual   #52  <Method String InAppMessageHtmlFull.getLocalAssetsDirectoryUrl()>
	//   15   33:invokevirtual   #56  <Method void AppboyInAppMessageHtmlFullView.setWebViewContent(String, String)>
		appboyinappmessagehtmlfullview.setInAppMessageWebViewClient(new InAppMessageWebViewClient(activity.getApplicationContext(), iinappmessage, mInAppMessageWebViewClientListener));
	//   16   36:aload           4
	//   17   38:new             #58  <Class InAppMessageWebViewClient>
	//   18   41:dup             
	//   19   42:aload_1         
	//   20   43:invokevirtual   #62  <Method android.content.Context Activity.getApplicationContext()>
	//   21   46:aload_2         
	//   22   47:aload_0         
	//   23   48:getfield        #15  <Field IInAppMessageWebViewClientListener mInAppMessageWebViewClientListener>
	//   24   51:invokespecial   #65  <Method void InAppMessageWebViewClient(android.content.Context, IInAppMessage, IInAppMessageWebViewClientListener)>
	//   25   54:invokevirtual   #69  <Method void AppboyInAppMessageHtmlFullView.setInAppMessageWebViewClient(InAppMessageWebViewClient)>
		return appboyinappmessagehtmlfullview;
	//   26   57:aload           4
	//   27   59:areturn         
	}

	private IInAppMessageWebViewClientListener mInAppMessageWebViewClientListener;
}
