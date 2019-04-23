// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.factories;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import com.appboy.Appboy;
import com.appboy.IAppboyImageLoader;
import com.appboy.enums.AppboyViewBounds;
import com.appboy.models.IInAppMessage;
import com.appboy.models.InAppMessageSlideup;
import com.appboy.support.StringUtils;
import com.appboy.ui.inappmessage.IInAppMessageViewFactory;
import com.appboy.ui.inappmessage.views.AppboyInAppMessageSlideupView;
import com.appboy.ui.support.FrescoLibraryUtils;

public class AppboySlideupViewFactory
	implements IInAppMessageViewFactory
{

	public AppboySlideupViewFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public volatile View createInAppMessageView(Activity activity, IInAppMessage iinappmessage)
	{
		return ((View) (createInAppMessageView(activity, iinappmessage)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #16  <Method AppboyInAppMessageSlideupView createInAppMessageView(Activity, IInAppMessage)>
	//    4    6:areturn         
	}

	public AppboyInAppMessageSlideupView createInAppMessageView(Activity activity, IInAppMessage iinappmessage)
	{
		android.content.Context context = activity.getApplicationContext();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method android.content.Context Activity.getApplicationContext()>
	//    2    4:astore_3        
		InAppMessageSlideup inappmessageslideup = (InAppMessageSlideup)iinappmessage;
	//    3    5:aload_2         
	//    4    6:checkcast       #24  <Class InAppMessageSlideup>
	//    5    9:astore          4
		activity = ((Activity) ((AppboyInAppMessageSlideupView)activity.getLayoutInflater().inflate(com.appboy.ui.R.layout.com_appboy_inappmessage_slideup, ((android.view.ViewGroup) (null)))));
	//    6   11:aload_1         
	//    7   12:invokevirtual   #28  <Method LayoutInflater Activity.getLayoutInflater()>
	//    8   15:getstatic       #34  <Field int com.appboy.ui.R$layout.com_appboy_inappmessage_slideup>
	//    9   18:aconst_null     
	//   10   19:invokevirtual   #40  <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//   11   22:checkcast       #42  <Class AppboyInAppMessageSlideupView>
	//   12   25:astore_1        
		((AppboyInAppMessageSlideupView) (activity)).inflateStubViews(iinappmessage);
	//   13   26:aload_1         
	//   14   27:aload_2         
	//   15   28:invokevirtual   #46  <Method void AppboyInAppMessageSlideupView.inflateStubViews(IInAppMessage)>
		if(FrescoLibraryUtils.canUseFresco(context))
	//*  16   31:aload_3         
	//*  17   32:invokestatic    #52  <Method boolean FrescoLibraryUtils.canUseFresco(android.content.Context)>
	//*  18   35:ifeq            46
		{
			((AppboyInAppMessageSlideupView) (activity)).setMessageSimpleDrawee(iinappmessage);
	//   19   38:aload_1         
	//   20   39:aload_2         
	//   21   40:invokevirtual   #55  <Method void AppboyInAppMessageSlideupView.setMessageSimpleDrawee(IInAppMessage)>
		} else
	//*  22   43:goto            83
		{
			String s = ((AppboyInAppMessageSlideupView) (activity)).getAppropriateImageUrl(iinappmessage);
	//   23   46:aload_1         
	//   24   47:aload_2         
	//   25   48:invokevirtual   #59  <Method String AppboyInAppMessageSlideupView.getAppropriateImageUrl(IInAppMessage)>
	//   26   51:astore          5
			if(!StringUtils.isNullOrEmpty(s))
	//*  27   53:aload           5
	//*  28   55:invokestatic    #65  <Method boolean StringUtils.isNullOrEmpty(String)>
	//*  29   58:ifne            83
				Appboy.getInstance(context).getAppboyImageLoader().renderUrlIntoView(context, s, ((AppboyInAppMessageSlideupView) (activity)).getMessageImageView(), AppboyViewBounds.IN_APP_MESSAGE_SLIDEUP);
	//   30   61:aload_3         
	//   31   62:invokestatic    #71  <Method Appboy Appboy.getInstance(android.content.Context)>
	//   32   65:invokevirtual   #75  <Method IAppboyImageLoader Appboy.getAppboyImageLoader()>
	//   33   68:aload_3         
	//   34   69:aload           5
	//   35   71:aload_1         
	//   36   72:invokevirtual   #79  <Method android.widget.ImageView AppboyInAppMessageSlideupView.getMessageImageView()>
	//   37   75:getstatic       #85  <Field AppboyViewBounds AppboyViewBounds.IN_APP_MESSAGE_SLIDEUP>
	//   38   78:invokeinterface #91  <Method void IAppboyImageLoader.renderUrlIntoView(android.content.Context, String, android.widget.ImageView, AppboyViewBounds)>
		}
		((AppboyInAppMessageSlideupView) (activity)).setMessageBackgroundColor(inappmessageslideup.getBackgroundColor());
	//   39   83:aload_1         
	//   40   84:aload           4
	//   41   86:invokevirtual   #95  <Method int InAppMessageSlideup.getBackgroundColor()>
	//   42   89:invokevirtual   #99  <Method void AppboyInAppMessageSlideupView.setMessageBackgroundColor(int)>
		((AppboyInAppMessageSlideupView) (activity)).setMessage(inappmessageslideup.getMessage());
	//   43   92:aload_1         
	//   44   93:aload           4
	//   45   95:invokevirtual   #103 <Method String InAppMessageSlideup.getMessage()>
	//   46   98:invokevirtual   #107 <Method void AppboyInAppMessageSlideupView.setMessage(String)>
		((AppboyInAppMessageSlideupView) (activity)).setMessageTextColor(inappmessageslideup.getMessageTextColor());
	//   47  101:aload_1         
	//   48  102:aload           4
	//   49  104:invokevirtual   #110 <Method int InAppMessageSlideup.getMessageTextColor()>
	//   50  107:invokevirtual   #113 <Method void AppboyInAppMessageSlideupView.setMessageTextColor(int)>
		((AppboyInAppMessageSlideupView) (activity)).setMessageTextAlign(inappmessageslideup.getMessageTextAlign());
	//   51  110:aload_1         
	//   52  111:aload           4
	//   53  113:invokevirtual   #117 <Method com.appboy.enums.inappmessage.TextAlign InAppMessageSlideup.getMessageTextAlign()>
	//   54  116:invokevirtual   #121 <Method void AppboyInAppMessageSlideupView.setMessageTextAlign(com.appboy.enums.inappmessage.TextAlign)>
		((AppboyInAppMessageSlideupView) (activity)).setMessageIcon(inappmessageslideup.getIcon(), inappmessageslideup.getIconColor(), inappmessageslideup.getIconBackgroundColor());
	//   55  119:aload_1         
	//   56  120:aload           4
	//   57  122:invokevirtual   #124 <Method String InAppMessageSlideup.getIcon()>
	//   58  125:aload           4
	//   59  127:invokevirtual   #127 <Method int InAppMessageSlideup.getIconColor()>
	//   60  130:aload           4
	//   61  132:invokevirtual   #130 <Method int InAppMessageSlideup.getIconBackgroundColor()>
	//   62  135:invokevirtual   #134 <Method void AppboyInAppMessageSlideupView.setMessageIcon(String, int, int)>
		((AppboyInAppMessageSlideupView) (activity)).setMessageChevron(inappmessageslideup.getChevronColor(), inappmessageslideup.getClickAction());
	//   63  138:aload_1         
	//   64  139:aload           4
	//   65  141:invokevirtual   #137 <Method int InAppMessageSlideup.getChevronColor()>
	//   66  144:aload           4
	//   67  146:invokevirtual   #141 <Method com.appboy.enums.inappmessage.ClickAction InAppMessageSlideup.getClickAction()>
	//   68  149:invokevirtual   #145 <Method void AppboyInAppMessageSlideupView.setMessageChevron(int, com.appboy.enums.inappmessage.ClickAction)>
		((AppboyInAppMessageSlideupView) (activity)).resetMessageMargins(iinappmessage.getImageDownloadSuccessful());
	//   69  152:aload_1         
	//   70  153:aload_2         
	//   71  154:invokeinterface #151 <Method boolean IInAppMessage.getImageDownloadSuccessful()>
	//   72  159:invokevirtual   #155 <Method void AppboyInAppMessageSlideupView.resetMessageMargins(boolean)>
		return ((AppboyInAppMessageSlideupView) (activity));
	//   73  162:aload_1         
	//   74  163:areturn         
	}
}
