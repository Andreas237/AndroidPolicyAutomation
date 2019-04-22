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
import com.appboy.enums.inappmessage.ImageStyle;
import com.appboy.models.IInAppMessage;
import com.appboy.models.InAppMessageModal;
import com.appboy.support.StringUtils;
import com.appboy.ui.inappmessage.IInAppMessageViewFactory;
import com.appboy.ui.inappmessage.views.AppboyInAppMessageModalView;
import com.newrelic.agent.android.instrumentation.ViewInstrumentation;

public class AppboyModalViewFactory
	implements IInAppMessageViewFactory
{

	public AppboyModalViewFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public volatile View createInAppMessageView(Activity activity, IInAppMessage iinappmessage)
	{
		return ((View) (createInAppMessageView(activity, iinappmessage)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #17  <Method AppboyInAppMessageModalView createInAppMessageView(Activity, IInAppMessage)>
	//    4    6:areturn         
	}

	public AppboyInAppMessageModalView createInAppMessageView(Activity activity, IInAppMessage iinappmessage)
	{
		android.content.Context context = activity.getApplicationContext();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #23  <Method android.content.Context Activity.getApplicationContext()>
	//    2    4:astore          6
		InAppMessageModal inappmessagemodal = (InAppMessageModal)iinappmessage;
	//    3    6:aload_2         
	//    4    7:checkcast       #25  <Class InAppMessageModal>
	//    5   10:astore          4
		boolean flag = inappmessagemodal.getImageStyle().equals(((Object) (ImageStyle.GRAPHIC)));
	//    6   12:aload           4
	//    7   14:invokevirtual   #29  <Method ImageStyle InAppMessageModal.getImageStyle()>
	//    8   17:getstatic       #35  <Field ImageStyle ImageStyle.GRAPHIC>
	//    9   20:invokevirtual   #39  <Method boolean ImageStyle.equals(Object)>
	//   10   23:istore_3        
		AppboyInAppMessageModalView appboyinappmessagemodalview = getAppropriateModalView(activity, flag);
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:iload_3         
	//   14   27:invokevirtual   #43  <Method AppboyInAppMessageModalView getAppropriateModalView(Activity, boolean)>
	//   15   30:astore          5
		appboyinappmessagemodalview.inflateStubViews(activity, ((com.appboy.models.IInAppMessageImmersive) (inappmessagemodal)));
	//   16   32:aload           5
	//   17   34:aload_1         
	//   18   35:aload           4
	//   19   37:invokevirtual   #49  <Method void AppboyInAppMessageModalView.inflateStubViews(Activity, com.appboy.models.IInAppMessageImmersive)>
		activity = ((Activity) (appboyinappmessagemodalview.getAppropriateImageUrl(iinappmessage)));
	//   20   40:aload           5
	//   21   42:aload_2         
	//   22   43:invokevirtual   #53  <Method String AppboyInAppMessageModalView.getAppropriateImageUrl(IInAppMessage)>
	//   23   46:astore_1        
		if(!StringUtils.isNullOrEmpty(((String) (activity))))
	//*  24   47:aload_1         
	//*  25   48:invokestatic    #59  <Method boolean StringUtils.isNullOrEmpty(String)>
	//*  26   51:ifne            78
			Appboy.getInstance(context).getAppboyImageLoader().renderUrlIntoView(context, ((String) (activity)), appboyinappmessagemodalview.getMessageImageView(), AppboyViewBounds.IN_APP_MESSAGE_MODAL);
	//   27   54:aload           6
	//   28   56:invokestatic    #65  <Method Appboy Appboy.getInstance(android.content.Context)>
	//   29   59:invokevirtual   #69  <Method IAppboyImageLoader Appboy.getAppboyImageLoader()>
	//   30   62:aload           6
	//   31   64:aload_1         
	//   32   65:aload           5
	//   33   67:invokevirtual   #73  <Method android.widget.ImageView AppboyInAppMessageModalView.getMessageImageView()>
	//   34   70:getstatic       #79  <Field AppboyViewBounds AppboyViewBounds.IN_APP_MESSAGE_MODAL>
	//   35   73:invokeinterface #85  <Method void IAppboyImageLoader.renderUrlIntoView(android.content.Context, String, android.widget.ImageView, AppboyViewBounds)>
		activity = ((Activity) (appboyinappmessagemodalview.getFrameView()));
	//   36   78:aload           5
	//   37   80:invokevirtual   #89  <Method View AppboyInAppMessageModalView.getFrameView()>
	//   38   83:astore_1        
		if(!(activity instanceof View))
	//*  39   84:aload_1         
	//*  40   85:instanceof      #91  <Class View>
	//*  41   88:ifne            99
			((View) (activity)).setOnClickListener(((android.view.View.OnClickListener) (null)));
	//   42   91:aload_1         
	//   43   92:aconst_null     
	//   44   93:invokevirtual   #95  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		else
	//*  45   96:goto            107
			ViewInstrumentation.setOnClickListener((View)activity, ((android.view.View.OnClickListener) (null)));
	//   46   99:aload_1         
	//   47  100:checkcast       #91  <Class View>
	//   48  103:aconst_null     
	//   49  104:invokestatic    #100 <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
		appboyinappmessagemodalview.setMessageBackgroundColor(iinappmessage.getBackgroundColor());
	//   50  107:aload           5
	//   51  109:aload_2         
	//   52  110:invokeinterface #106 <Method int IInAppMessage.getBackgroundColor()>
	//   53  115:invokevirtual   #110 <Method void AppboyInAppMessageModalView.setMessageBackgroundColor(int)>
		appboyinappmessagemodalview.setFrameColor(inappmessagemodal.getFrameColor());
	//   54  118:aload           5
	//   55  120:aload           4
	//   56  122:invokevirtual   #114 <Method Integer InAppMessageModal.getFrameColor()>
	//   57  125:invokevirtual   #118 <Method void AppboyInAppMessageModalView.setFrameColor(Integer)>
		appboyinappmessagemodalview.setMessageButtons(inappmessagemodal.getMessageButtons());
	//   58  128:aload           5
	//   59  130:aload           4
	//   60  132:invokevirtual   #122 <Method java.util.List InAppMessageModal.getMessageButtons()>
	//   61  135:invokevirtual   #126 <Method void AppboyInAppMessageModalView.setMessageButtons(java.util.List)>
		appboyinappmessagemodalview.setMessageCloseButtonColor(inappmessagemodal.getCloseButtonColor());
	//   62  138:aload           5
	//   63  140:aload           4
	//   64  142:invokevirtual   #129 <Method int InAppMessageModal.getCloseButtonColor()>
	//   65  145:invokevirtual   #132 <Method void AppboyInAppMessageModalView.setMessageCloseButtonColor(int)>
		if(!flag)
	//*  66  148:iload_3         
	//*  67  149:ifne            248
		{
			appboyinappmessagemodalview.setMessage(iinappmessage.getMessage());
	//   68  152:aload           5
	//   69  154:aload_2         
	//   70  155:invokeinterface #136 <Method String IInAppMessage.getMessage()>
	//   71  160:invokevirtual   #140 <Method void AppboyInAppMessageModalView.setMessage(String)>
			appboyinappmessagemodalview.setMessageTextColor(iinappmessage.getMessageTextColor());
	//   72  163:aload           5
	//   73  165:aload_2         
	//   74  166:invokeinterface #143 <Method int IInAppMessage.getMessageTextColor()>
	//   75  171:invokevirtual   #146 <Method void AppboyInAppMessageModalView.setMessageTextColor(int)>
			appboyinappmessagemodalview.setMessageHeaderText(inappmessagemodal.getHeader());
	//   76  174:aload           5
	//   77  176:aload           4
	//   78  178:invokevirtual   #149 <Method String InAppMessageModal.getHeader()>
	//   79  181:invokevirtual   #152 <Method void AppboyInAppMessageModalView.setMessageHeaderText(String)>
			appboyinappmessagemodalview.setMessageHeaderTextColor(inappmessagemodal.getHeaderTextColor());
	//   80  184:aload           5
	//   81  186:aload           4
	//   82  188:invokevirtual   #155 <Method int InAppMessageModal.getHeaderTextColor()>
	//   83  191:invokevirtual   #158 <Method void AppboyInAppMessageModalView.setMessageHeaderTextColor(int)>
			appboyinappmessagemodalview.setMessageIcon(iinappmessage.getIcon(), iinappmessage.getIconColor(), iinappmessage.getIconBackgroundColor());
	//   84  194:aload           5
	//   85  196:aload_2         
	//   86  197:invokeinterface #161 <Method String IInAppMessage.getIcon()>
	//   87  202:aload_2         
	//   88  203:invokeinterface #164 <Method int IInAppMessage.getIconColor()>
	//   89  208:aload_2         
	//   90  209:invokeinterface #167 <Method int IInAppMessage.getIconBackgroundColor()>
	//   91  214:invokevirtual   #171 <Method void AppboyInAppMessageModalView.setMessageIcon(String, int, int)>
			appboyinappmessagemodalview.setMessageHeaderTextAlignment(inappmessagemodal.getHeaderTextAlign());
	//   92  217:aload           5
	//   93  219:aload           4
	//   94  221:invokevirtual   #175 <Method com.appboy.enums.inappmessage.TextAlign InAppMessageModal.getHeaderTextAlign()>
	//   95  224:invokevirtual   #179 <Method void AppboyInAppMessageModalView.setMessageHeaderTextAlignment(com.appboy.enums.inappmessage.TextAlign)>
			appboyinappmessagemodalview.setMessageTextAlign(inappmessagemodal.getMessageTextAlign());
	//   96  227:aload           5
	//   97  229:aload           4
	//   98  231:invokevirtual   #182 <Method com.appboy.enums.inappmessage.TextAlign InAppMessageModal.getMessageTextAlign()>
	//   99  234:invokevirtual   #185 <Method void AppboyInAppMessageModalView.setMessageTextAlign(com.appboy.enums.inappmessage.TextAlign)>
			appboyinappmessagemodalview.resetMessageMargins(iinappmessage.getImageDownloadSuccessful());
	//  100  237:aload           5
	//  101  239:aload_2         
	//  102  240:invokeinterface #189 <Method boolean IInAppMessage.getImageDownloadSuccessful()>
	//  103  245:invokevirtual   #193 <Method void AppboyInAppMessageModalView.resetMessageMargins(boolean)>
		}
		return appboyinappmessagemodalview;
	//  104  248:aload           5
	//  105  250:areturn         
	}

	AppboyInAppMessageModalView getAppropriateModalView(Activity activity, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            19
			return (AppboyInAppMessageModalView)activity.getLayoutInflater().inflate(com.appboy.ui.R.layout.com_appboy_inappmessage_modal_graphic, ((android.view.ViewGroup) (null)));
	//    2    4:aload_1         
	//    3    5:invokevirtual   #200 <Method LayoutInflater Activity.getLayoutInflater()>
	//    4    8:getstatic       #206 <Field int com.appboy.ui.R$layout.com_appboy_inappmessage_modal_graphic>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #212 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//    7   15:checkcast       #45  <Class AppboyInAppMessageModalView>
	//    8   18:areturn         
		else
			return (AppboyInAppMessageModalView)activity.getLayoutInflater().inflate(com.appboy.ui.R.layout.com_appboy_inappmessage_modal, ((android.view.ViewGroup) (null)));
	//    9   19:aload_1         
	//   10   20:invokevirtual   #200 <Method LayoutInflater Activity.getLayoutInflater()>
	//   11   23:getstatic       #215 <Field int com.appboy.ui.R$layout.com_appboy_inappmessage_modal>
	//   12   26:aconst_null     
	//   13   27:invokevirtual   #212 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//   14   30:checkcast       #45  <Class AppboyInAppMessageModalView>
	//   15   33:areturn         
	}
}
