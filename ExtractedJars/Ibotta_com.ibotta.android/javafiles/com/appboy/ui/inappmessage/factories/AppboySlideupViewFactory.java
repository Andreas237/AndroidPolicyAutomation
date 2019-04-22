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
		String s = ((AppboyInAppMessageSlideupView) (activity)).getAppropriateImageUrl(iinappmessage);
	//   16   31:aload_1         
	//   17   32:aload_2         
	//   18   33:invokevirtual   #50  <Method String AppboyInAppMessageSlideupView.getAppropriateImageUrl(IInAppMessage)>
	//   19   36:astore          5
		if(!StringUtils.isNullOrEmpty(s))
	//*  20   38:aload           5
	//*  21   40:invokestatic    #56  <Method boolean StringUtils.isNullOrEmpty(String)>
	//*  22   43:ifne            68
			Appboy.getInstance(context).getAppboyImageLoader().renderUrlIntoView(context, s, ((AppboyInAppMessageSlideupView) (activity)).getMessageImageView(), AppboyViewBounds.IN_APP_MESSAGE_SLIDEUP);
	//   23   46:aload_3         
	//   24   47:invokestatic    #62  <Method Appboy Appboy.getInstance(android.content.Context)>
	//   25   50:invokevirtual   #66  <Method IAppboyImageLoader Appboy.getAppboyImageLoader()>
	//   26   53:aload_3         
	//   27   54:aload           5
	//   28   56:aload_1         
	//   29   57:invokevirtual   #70  <Method android.widget.ImageView AppboyInAppMessageSlideupView.getMessageImageView()>
	//   30   60:getstatic       #76  <Field AppboyViewBounds AppboyViewBounds.IN_APP_MESSAGE_SLIDEUP>
	//   31   63:invokeinterface #82  <Method void IAppboyImageLoader.renderUrlIntoView(android.content.Context, String, android.widget.ImageView, AppboyViewBounds)>
		((AppboyInAppMessageSlideupView) (activity)).setMessageBackgroundColor(inappmessageslideup.getBackgroundColor());
	//   32   68:aload_1         
	//   33   69:aload           4
	//   34   71:invokevirtual   #86  <Method int InAppMessageSlideup.getBackgroundColor()>
	//   35   74:invokevirtual   #90  <Method void AppboyInAppMessageSlideupView.setMessageBackgroundColor(int)>
		((AppboyInAppMessageSlideupView) (activity)).setMessage(inappmessageslideup.getMessage());
	//   36   77:aload_1         
	//   37   78:aload           4
	//   38   80:invokevirtual   #94  <Method String InAppMessageSlideup.getMessage()>
	//   39   83:invokevirtual   #98  <Method void AppboyInAppMessageSlideupView.setMessage(String)>
		((AppboyInAppMessageSlideupView) (activity)).setMessageTextColor(inappmessageslideup.getMessageTextColor());
	//   40   86:aload_1         
	//   41   87:aload           4
	//   42   89:invokevirtual   #101 <Method int InAppMessageSlideup.getMessageTextColor()>
	//   43   92:invokevirtual   #104 <Method void AppboyInAppMessageSlideupView.setMessageTextColor(int)>
		((AppboyInAppMessageSlideupView) (activity)).setMessageTextAlign(inappmessageslideup.getMessageTextAlign());
	//   44   95:aload_1         
	//   45   96:aload           4
	//   46   98:invokevirtual   #108 <Method com.appboy.enums.inappmessage.TextAlign InAppMessageSlideup.getMessageTextAlign()>
	//   47  101:invokevirtual   #112 <Method void AppboyInAppMessageSlideupView.setMessageTextAlign(com.appboy.enums.inappmessage.TextAlign)>
		((AppboyInAppMessageSlideupView) (activity)).setMessageIcon(inappmessageslideup.getIcon(), inappmessageslideup.getIconColor(), inappmessageslideup.getIconBackgroundColor());
	//   48  104:aload_1         
	//   49  105:aload           4
	//   50  107:invokevirtual   #115 <Method String InAppMessageSlideup.getIcon()>
	//   51  110:aload           4
	//   52  112:invokevirtual   #118 <Method int InAppMessageSlideup.getIconColor()>
	//   53  115:aload           4
	//   54  117:invokevirtual   #121 <Method int InAppMessageSlideup.getIconBackgroundColor()>
	//   55  120:invokevirtual   #125 <Method void AppboyInAppMessageSlideupView.setMessageIcon(String, int, int)>
		((AppboyInAppMessageSlideupView) (activity)).setMessageChevron(inappmessageslideup.getChevronColor(), inappmessageslideup.getClickAction());
	//   56  123:aload_1         
	//   57  124:aload           4
	//   58  126:invokevirtual   #128 <Method int InAppMessageSlideup.getChevronColor()>
	//   59  129:aload           4
	//   60  131:invokevirtual   #132 <Method com.appboy.enums.inappmessage.ClickAction InAppMessageSlideup.getClickAction()>
	//   61  134:invokevirtual   #136 <Method void AppboyInAppMessageSlideupView.setMessageChevron(int, com.appboy.enums.inappmessage.ClickAction)>
		((AppboyInAppMessageSlideupView) (activity)).resetMessageMargins(iinappmessage.getImageDownloadSuccessful());
	//   62  137:aload_1         
	//   63  138:aload_2         
	//   64  139:invokeinterface #142 <Method boolean IInAppMessage.getImageDownloadSuccessful()>
	//   65  144:invokevirtual   #146 <Method void AppboyInAppMessageSlideupView.resetMessageMargins(boolean)>
		return ((AppboyInAppMessageSlideupView) (activity));
	//   66  147:aload_1         
	//   67  148:areturn         
	}
}
